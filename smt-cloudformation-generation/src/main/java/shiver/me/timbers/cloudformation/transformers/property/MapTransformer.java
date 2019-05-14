package shiver.me.timbers.cloudformation.transformers.property;

import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.ClassTypeConverter;
import shiver.me.timbers.cloudformation.types.TypeException;

import java.util.Map;

import static java.lang.String.format;

public class MapTransformer implements PropertyTransformer {

    private final ClassTypeConverter classTypeConverter;

    public MapTransformer(ClassTypeConverter classTypeConverter) {
        this.classTypeConverter = classTypeConverter;
    }

    @Override
    public boolean supports(CloudformationProperty property) {
        return "Map".equals(property.getType());
    }

    @Override
    public void transform(
        String resourceName,
        CloudformationType type,
        String propertyName,
        CloudformationProperty cloudformationProperty,
        Map<String, Object> property
    ) {
        property.put("type", "object");
        property.put("javaType", findType(resourceName, propertyName, cloudformationProperty));
    }

    private String findType(
        String resourceName,
        String propertyName,
        CloudformationProperty cloudformationProperty
    ) {
        final String primitiveItemType = cloudformationProperty.getPrimitiveItemType();
        if (primitiveItemType != null) {
            return toMapType(primitiveItemType);
        }
        final String itemType = cloudformationProperty.getItemType();
        if (itemType != null) {
            return toMapType(classTypeConverter.toJavType(resourceName, itemType));
        }
        throw new TypeException(
            format("Could not find Map type for resource (%s) and property (%s),", resourceName, propertyName)
        );
    }

    private static String toMapType(String type) {
        return format("java.util.Map<String, %s>", type);
    }
}
