package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.ClassTypeConverter;

import java.util.Map;

public class ClassTypeTransformer implements PropertyTransformer {

    private final ClassTypeConverter converter;

    public ClassTypeTransformer(ClassTypeConverter converter) {
        this.converter = converter;
    }

    @Override
    public boolean supports(CloudformationProperty property) {
        final String type = property.getType();
        return !(type == null || "List".equals(type) || "Map".equals(type));
    }

    @Override
    public void transform(
        String resourceName,
        CloudformationType type,
        String propertyName,
        CloudformationProperty cloudformationProperty,
        Map<String, Object> property
    ) {
        property.put("$ref", converter.convert(resourceName, cloudformationProperty.getType()));
    }
}
