
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * TagSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResourceType",
    "Tags"
})
public class TagSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-resourcetype")
    private CharSequence resourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-tags")
    private List<TagRequest> tags = new ArrayList<TagRequest>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-resourcetype
     * 
     */
    @JsonIgnore
    public CharSequence getResourceType() {
        return resourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-resourcetype
     * 
     */
    @JsonIgnore
    public void setResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
    }

    public TagSpecification withResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-tags
     * 
     */
    @JsonIgnore
    public List<TagRequest> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-tagspecification.html#cfn-ec2-ec2fleet-tagspecification-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<TagRequest> tags) {
        this.tags = tags;
    }

    public TagSpecification withTags(List<TagRequest> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceType", resourceType).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceType).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TagSpecification) == false) {
            return false;
        }
        TagSpecification rhs = ((TagSpecification) other);
        return new EqualsBuilder().append(resourceType, rhs.resourceType).append(tags, rhs.tags).isEquals();
    }

}
