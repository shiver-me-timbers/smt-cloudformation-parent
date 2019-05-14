package shiver.me.timbers.cloudformation.transformers.type;

import aws.Property;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.ResourceType;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

public class InterfacesTransformer extends AbstractTypeTransformer {

    private final JavaTypes javaTypes;

    public InterfacesTransformer(JavaTypes javaTypes) {
        this.javaTypes = javaTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void transform(String resourceName, CloudformationType type, Map<String, Object> schema) {
        if (type instanceof ResourceType) {
            return;
        }
        final List<String> interfaces = (List<String>) schema.getOrDefault("javaInterfaces", new ArrayList<>());
        interfaces.add(format("%s<%s>", Property.class.getName(), javaTypes.extractClassName(resourceName)));
        schema.put("javaInterfaces", interfaces);
    }
}
