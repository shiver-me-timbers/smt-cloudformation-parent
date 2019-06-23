
package aws.greengrass;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ResourceDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Resources",
    "ResourceDefinitionId"
})
public class ResourceDefinitionVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources
     * 
     */
    @JsonProperty("Resources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources")
    private List<Property<ResourceDefinitionVersionResourceInstance>> resources = new ArrayList<Property<ResourceDefinitionVersionResourceInstance>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid
     * 
     */
    @JsonProperty("ResourceDefinitionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid")
    private CharSequence resourceDefinitionId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources
     * 
     */
    @JsonIgnore
    public List<Property<ResourceDefinitionVersionResourceInstance>> getResources() {
        return resources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources
     * 
     */
    @JsonIgnore
    public void setResources(List<Property<ResourceDefinitionVersionResourceInstance>> resources) {
        this.resources = resources;
    }

    public ResourceDefinitionVersion withResources(List<Property<ResourceDefinitionVersionResourceInstance>> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid
     * 
     */
    @JsonIgnore
    public CharSequence getResourceDefinitionId() {
        return resourceDefinitionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid
     * 
     */
    @JsonIgnore
    public void setResourceDefinitionId(CharSequence resourceDefinitionId) {
        this.resourceDefinitionId = resourceDefinitionId;
    }

    public ResourceDefinitionVersion withResourceDefinitionId(CharSequence resourceDefinitionId) {
        this.resourceDefinitionId = resourceDefinitionId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resources", resources).append("resourceDefinitionId", resourceDefinitionId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceDefinitionId).append(resources).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionVersion) == false) {
            return false;
        }
        ResourceDefinitionVersion rhs = ((ResourceDefinitionVersion) other);
        return new EqualsBuilder().append(resourceDefinitionId, rhs.resourceDefinitionId).append(resources, rhs.resources).isEquals();
    }

}
