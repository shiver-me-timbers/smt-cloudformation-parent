package shiver.me.timbers.cloudformation.transformers.property;

import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.PrimitiveTypeConverter;

import java.util.Map;

public class PrimitiveTypeTransformer implements PropertyTransformer {

    private final PrimitiveTypeConverter converter;

    public PrimitiveTypeTransformer(PrimitiveTypeConverter converter) {
        this.converter = converter;
    }

    @Override
    public boolean supports(CloudformationProperty property) {
        final String primitiveType = property.getPrimitiveType();
        return primitiveType != null && !primitiveType.isEmpty();
    }

    @Override
    public void transform(
        String resourceName,
        CloudformationType type,
        String propertyName,
        CloudformationProperty cloudformationProperty,
        Map<String, Object> property
    ) {
        if (propertyName.endsWith("PolicyDocument")) {
            property.put("$ref", "PolicyDocument.schema.json");
            property.put("javaType", "aws.Property<aws.iam.PolicyDocument>");
            return;
        }
        property.putAll(converter.convert(cloudformationProperty.getPrimitiveType()));
    }
}
