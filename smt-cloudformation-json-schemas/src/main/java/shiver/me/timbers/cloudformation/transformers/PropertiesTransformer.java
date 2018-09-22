package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.List;
import java.util.Map;

public class PropertiesTransformer extends AbstractPropertiesTransformer {

    private final List<PropertyTransformer> transformers;

    public PropertiesTransformer(List<PropertyTransformer> transformers) {
        this.transformers = transformers;
    }

    @Override
    protected void transform(
        String resourceName,
        CloudformationType type,
        String propertyName,
        CloudformationProperty cloudformationProperty,
        Map<String, Object> property
    ) {
        transformers.stream()
            .filter(transformer -> transformer.supports(cloudformationProperty))
            .forEach(transformer -> transformer.transform(
                resourceName,
                type,
                propertyName,
                cloudformationProperty,
                property
            ));
    }
}
