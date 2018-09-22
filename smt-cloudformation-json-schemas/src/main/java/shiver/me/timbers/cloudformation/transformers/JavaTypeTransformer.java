package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.Map;

import static java.lang.String.format;

public class JavaTypeTransformer extends AbstractTypeTransformer {

    private final JavaTypes javaTypes;

    public JavaTypeTransformer(JavaTypes javaTypes) {
        this.javaTypes = javaTypes;
    }

    @Override
    protected void transform(String resourceName, CloudformationType type, Map<String, Object> schema) {
        schema.put(
            "javaType",
            format("%s.%s", javaTypes.parsePackage(resourceName), javaTypes.extractClassName(resourceName))
        );
    }
}
