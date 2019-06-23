package shiver.me.timbers.cloudformation.transformers.type;

import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.ResourceType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;
import static java.util.AbstractMap.SimpleEntry;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonMap;
import static java.util.Map.Entry;

public class ResourceTransformer implements TypeTransformer {

    private static final String RESOURCE = "Resource";
    private final FileNames fileNames;
    private final JavaTypes javaTypes;
    private final MetaDataApplier metaDataApplier;

    public ResourceTransformer(FileNames fileNames, JavaTypes javaTypes, MetaDataApplier metaDataApplier) {
        this.fileNames = fileNames;
        this.javaTypes = javaTypes;
        this.metaDataApplier = metaDataApplier;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Entry<String, Map<String, Object>> transform(Entry<String, ? extends CloudformationType> type) {
        final CloudformationType cloudformationType = type.getValue();
        if (cloudformationType instanceof ResourceType) {
            final String typeName = type.getKey();
            final String packageName = javaTypes.parsePackage(typeName);
            final String resourceClassName = javaTypes.extractClassName(typeName + RESOURCE);
            final String documentation = cloudformationType.getDocumentation();
            final Map<String, Object> schema = new LinkedHashMap<>();
            metaDataApplier.apply(fileNames.parse(typeName + RESOURCE), resourceClassName, documentation, schema);
            schema.put("extends", singletonMap("$ref", "Resource.schema.json"));
            schema.put("javaType", format("%s.%s", packageName, resourceClassName));
            schema.put(
                "javaInterfaces",
                new ArrayList<>(asList(
                    format("aws.HasDependsOn<%s>", resourceClassName),
                    format("aws.HasCondition<%s>", resourceClassName)
                ))
            );
            if (((ResourceType) cloudformationType).getAttributes() != null) {
                ((List<String>) schema.get("javaInterfaces")).add(
                    format("aws.HasAttributes<%sAttributes>", javaTypes.extractClassName(typeName))
                );
            }
            schema.put("properties", new LinkedHashMap<String, Object>() {{
                put("Type", new LinkedHashMap<String, Object>() {{
                    put("type", "string");
                    put("default", typeName);
                }});
                put("Properties", singletonMap("$ref", fileNames.parse(typeName)));
            }});
            return new SimpleEntry<>(typeName + RESOURCE, schema);
        }
        return new SimpleEntry<>(type.getKey(), emptyMap());
    }
}
