package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.ResourceType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.String.format;
import static java.util.AbstractMap.SimpleEntry;
import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonList;
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
            if (((ResourceType) cloudformationType).getAttributes() != null) {
                schema.put(
                    "javaInterfaces",
                    singletonList(format("aws.HasAttributes<%sAttributes>", javaTypes.extractClassName(typeName)))
                );
            }
            schema.put("properties", singletonMap("Properties", singletonMap("$ref", fileNames.parse(typeName))));
            return new SimpleEntry<>(typeName + RESOURCE, schema);
        }
        return new SimpleEntry<>(type.getKey(), emptyMap());
    }
}
