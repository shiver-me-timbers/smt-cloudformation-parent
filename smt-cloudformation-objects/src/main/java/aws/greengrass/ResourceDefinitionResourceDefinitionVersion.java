
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
 * ResourceDefinitionResourceDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Resources"
})
public class ResourceDefinitionResourceDefinitionVersion implements Property<ResourceDefinitionResourceDefinitionVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html#cfn-greengrass-resourcedefinition-resourcedefinitionversion-resources
     * 
     */
    @JsonProperty("Resources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html#cfn-greengrass-resourcedefinition-resourcedefinitionversion-resources")
    private List<Property<ResourceDefinitionResourceInstance>> resources = new ArrayList<Property<ResourceDefinitionResourceInstance>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html#cfn-greengrass-resourcedefinition-resourcedefinitionversion-resources
     * 
     */
    @JsonIgnore
    public List<Property<ResourceDefinitionResourceInstance>> getResources() {
        return resources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html#cfn-greengrass-resourcedefinition-resourcedefinitionversion-resources
     * 
     */
    @JsonIgnore
    public void setResources(List<Property<ResourceDefinitionResourceInstance>> resources) {
        this.resources = resources;
    }

    public ResourceDefinitionResourceDefinitionVersion withResources(List<Property<ResourceDefinitionResourceInstance>> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resources", resources).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resources).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionResourceDefinitionVersion) == false) {
            return false;
        }
        ResourceDefinitionResourceDefinitionVersion rhs = ((ResourceDefinitionResourceDefinitionVersion) other);
        return new EqualsBuilder().append(resources, rhs.resources).isEquals();
    }

}
