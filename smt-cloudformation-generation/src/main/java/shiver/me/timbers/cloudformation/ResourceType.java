package shiver.me.timbers.cloudformation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResourceType extends CloudformationType implements Resource {

    @JsonProperty("Attributes")
    private CloudformationAttributes attributes;

    public CloudformationAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CloudformationAttributes attributes) {
        this.attributes = attributes;
    }
}
