package shiver.me.timbers.cloudformation.transformers.property;

import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.ClassTypeConverter;
import shiver.me.timbers.cloudformation.types.PrimitiveTypeConverter;
import shiver.me.timbers.cloudformation.types.TypeException;

import java.util.Map;

import static java.lang.String.format;

public class ListTransformer implements PropertyTransformer {

    private final PrimitiveTypeConverter primitiveTypeConverter;
    private final ClassTypeConverter classTypeConverter;

    public ListTransformer(PrimitiveTypeConverter primitiveTypeConverter, ClassTypeConverter classTypeConverter) {
        this.primitiveTypeConverter = primitiveTypeConverter;
        this.classTypeConverter = classTypeConverter;
    }

    @Override
    public boolean supports(CloudformationProperty property) {
        return "List".equals(property.getType());
    }

    @Override
    public void transform(
        String resourceName,
        CloudformationType type,
        String propertyName,
        CloudformationProperty cloudformationProperty,
        Map<String, Object> property
    ) {
        property.put("type", "array");
        if (!cloudformationProperty.isDuplicatesAllowed()) {
            property.put("uniqueItems", true);
        }
        final String primitiveItemType = cloudformationProperty.getPrimitiveItemType();
        if (primitiveItemType != null) {
            property.put("items", primitiveTypeConverter.convert(primitiveItemType));
            return;
        }
        final String itemType = cloudformationProperty.getItemType();
        if (itemType != null) {
            final Map<String, Object> primitive = primitiveTypeConverter.convert(itemType);
            if (primitive != null) {
                property.put("items", primitive);
                return;
            }
            property.put("items", classTypeConverter.toTypeMap(resourceName, cloudformationProperty.getItemType()));
            return;
        }
        throw new TypeException(
            format("Could not find List type for resource (%s) and property (%s),", resourceName, propertyName)
        );
    }
}
