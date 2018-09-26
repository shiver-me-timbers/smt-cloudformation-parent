
package aws.inspector;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ResourceGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private List<Tag> resourceGroupTags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags
     * 
     */
    public List<Tag> getResourceGroupTags() {
        return resourceGroupTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags
     * 
     */
    public void setResourceGroupTags(List<Tag> resourceGroupTags) {
        this.resourceGroupTags = resourceGroupTags;
    }

    public ResourceGroup withResourceGroupTags(List<Tag> resourceGroupTags) {
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
