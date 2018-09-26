package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.Map;

import static java.util.Map.Entry;

public interface TypeTransformer {

    Entry<String, Map<String, Object>> transform(Entry<String, ? extends CloudformationType> type);
}
