package shiver.me.timbers.cloudformation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudFormationResourceSpecification {

    @JsonProperty("PropertyTypes")
    private CloudformationTypes<PropertyType> propertyTypes;

    @JsonProperty("ResourceTypes")
    private CloudformationTypes<ResourceType> resourceTypes;

    public CloudformationTypes<PropertyType> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(CloudformationTypes<PropertyType> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public CloudformationTypes<ResourceType> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(CloudformationTypes<ResourceType> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }
}
