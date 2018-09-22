package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AbstractPropertiesTransformer extends AbstractTypeTransformer {

    public static final String PROPERTIES = "properties";

    @SuppressWarnings("unchecked")
    @Override
    protected void transform(String resourceName, CloudformationType type, Map<String, Object> schema) {
        final Map<String, Map<String, Object>> properties = (Map) schema
            .getOrDefault(PROPERTIES, new LinkedHashMap<String, Map<String, Object>>());
        type.getProperties().forEach((propertyName, cloudformationProperty) -> {
            final Map<String, Object> property = properties.getOrDefault(propertyName, new LinkedHashMap<>());
            transform(resourceName, type, propertyName, cloudformationProperty, property);
            properties.put(propertyName, property);
        });
        schema.put(PROPERTIES, properties);
    }

    protected abstract void transform(
        String resourceName,
        CloudformationType type,
        String propertyName,
        CloudformationProperty cloudformationProperty,
        Map<String, Object> property
    );
}
