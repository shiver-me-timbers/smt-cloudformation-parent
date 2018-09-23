package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.AbstractMap.SimpleEntry;
import static java.util.Map.Entry;

public abstract class AbstractTypeTransformer implements TypeTransformer {

    @Override
    public Entry<String, Map<String, Object>> transform(Entry<String, ? extends CloudformationType> type) {
        final String resourceName = type.getKey();
        final Map<String, Object> schema = new LinkedHashMap<>();
        transform(resourceName, type.getValue(), schema);
        return new SimpleEntry<>(resourceName, schema);
    }

    protected abstract void transform(String resourceName, CloudformationType type, Map<String, Object> schema);
}
