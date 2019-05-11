package shiver.me.timbers.cloudformation.transformers.type;

import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.PrimitiveTypeConverter;

import java.util.Map;

public class PrimitiveTypeResourceTransformer extends AbstractTypeTransformer {

    private final PrimitiveTypeConverter converter;

    public PrimitiveTypeResourceTransformer(PrimitiveTypeConverter converter) {
        this.converter = converter;
    }

    @Override
    protected void transform(String resourceName, CloudformationType type, Map<String, Object> schema) {
        final String primitiveType = type.getPrimitiveType();
        if (primitiveType != null) {
            schema.putAll(converter.convert(primitiveType));
        }
    }
}
