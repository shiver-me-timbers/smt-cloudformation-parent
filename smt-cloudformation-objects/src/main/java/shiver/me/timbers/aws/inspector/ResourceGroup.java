
package shiver.me.timbers.aws.inspector;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * ResourceGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceGroupTags"
})
public class ResourceGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags
     * 
     */
    @JsonProperty("ResourceGroupTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags")
    private List<Property<Tag>> resourceGroupTags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getResourceGroupTags() {
        return resourceGroupTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags
     * 
     */
    @JsonIgnore
    public void setResourceGroupTags(List<Property<Tag>> resourceGroupTags) {
        this.resourceGroupTags = resourceGroupTags;
    }

    public ResourceGroup withResourceGroupTags(List<Property<Tag>> resourceGroupTags) {
        this.resourceGroupTags = resourceGroupTags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceGroupTags", resourceGroupTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceGroupTags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceGroup) == false) {
            return false;
        }
        ResourceGroup rhs = ((ResourceGroup) other);
        return new EqualsBuilder().append(resourceGroupTags, rhs.resourceGroupTags).isEquals();
    }

}
