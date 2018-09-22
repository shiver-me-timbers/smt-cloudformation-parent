package shiver.me.timbers.cloudformation.transformers;

import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;

import java.util.Map;

public class DescriptionTransformer implements PropertyTransformer {

    @Override
    public boolean supports(CloudformationProperty property) {
        final String documentation = property.getDocumentation();
        return documentation != null && !documentation.isEmpty();
    }

    @Override
    public void transform(
        String resourceName,
        CloudformationType type,
        String propertyName,
        CloudformationProperty cloudformationProperty,
        Map<String, Object> property
    ) {
        property.put("description", cloudformationProperty.getDocumentation());
    }
}
