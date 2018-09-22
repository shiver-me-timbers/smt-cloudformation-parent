package shiver.me.timbers.cloudformation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudFormationResourceSpecification {

    @JsonProperty("PropertyTypes")
    private CloudformationTypes propertyTypes;

    @JsonProperty("ResourceTypes")
    private CloudformationTypes resourceTypes;

    public CloudformationTypes getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(CloudformationTypes propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public CloudformationTypes getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(CloudformationTypes resourceTypes) {
        this.resourceTypes = resourceTypes;
    }
}
