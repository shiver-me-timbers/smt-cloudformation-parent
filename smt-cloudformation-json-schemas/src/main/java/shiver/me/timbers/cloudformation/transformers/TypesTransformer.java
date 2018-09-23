package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.CloudformationTypes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.Entry;
import static java.util.stream.Collectors.toList;


public class TypesTransformer {

    private final List<TypeTransformer> transformers;

    public TypesTransformer(List<TypeTransformer> transformers) {
        this.transformers = transformers;
    }

    public Map<String, Object> transform(CloudformationTypes<? extends CloudformationType> cloudformationTypes) {
        return cloudformationTypes.entrySet().stream()
            .map(this::transform)
            .flatMap(Collection::stream)
            .reduce(new LinkedHashMap<>(), this::merge, (last, next) -> next);
    }

    private List<Entry<String, Map<String, Object>>> transform(Entry<String, ? extends CloudformationType> resource) {
        return transformers.stream().map(transformer -> transformer.transform(resource)).collect(toList());
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> merge(Map<String, Object> schemas, Entry<String, Map<String, Object>> schema) {
        final String schemaName = schema.getKey();
        final Map schemaDetails = (Map) schemas.get(schemaName);
        if (schemaDetails == null) {
            schemas.put(schemaName, new LinkedHashMap<>(schema.getValue()));
            return schemas;
        }
        schemaDetails.putAll(schema.getValue());
        return schemas;
    }
}
