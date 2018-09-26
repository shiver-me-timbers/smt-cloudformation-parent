package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationAttributes;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.ResourceType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.String.format;
import static java.util.AbstractMap.SimpleEntry;
import static java.util.Collections.emptyMap;
import static java.util.Map.Entry;

public class AttributesTransformer implements TypeTransformer {

    private static final String ATTRIBUTES = "Attributes";
    private final FileNames fileNames;
    private final JavaTypes javaTypes;
    private final MetaDataApplier metaDataApplier;

    public AttributesTransformer(FileNames fileNames, JavaTypes javaTypes, MetaDataApplier metaDataApplier) {
        this.fileNames = fileNames;
        this.javaTypes = javaTypes;
        this.metaDataApplier = metaDataApplier;
    }

    @Override
    public Entry<String, Map<String, Object>> transform(Entry<String, ? extends CloudformationType> type) {
        final CloudformationType cloudformationType = type.getValue();
        if (cloudformationType instanceof ResourceType) {
            final CloudformationAttributes attributes = ((ResourceType) cloudformationType).getAttributes();
            if (attributes != null) {
                final String resourceName = type.getKey();
                final String className = javaTypes.extractClassName(resourceName) + ATTRIBUTES;
                final Map<String, Object> schema = new LinkedHashMap<>();
                metaDataApplier.apply(fileNames.parse(resourceName + ATTRIBUTES), className, null, schema);
                schema.put("type", "string");
                schema.put("enum", attributes.keySet());
                schema.put("javaType", format("%s.%s", javaTypes.parsePackage(resourceName), className));
                return new SimpleEntry<>(resourceName + ATTRIBUTES, schema);
            }
        }
        return new SimpleEntry<>(type.getKey(), emptyMap());
    }
}
