package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.Map;

public interface PropertyTransformer {

    boolean supports(CloudformationProperty property);

    void transform(
        String resourceName,
        CloudformationType type,
        String propertyName,
        CloudformationProperty cloudformationProperty,
        Map<String, Object> property
    );
}
