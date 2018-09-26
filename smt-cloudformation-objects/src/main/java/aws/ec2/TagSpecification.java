
package aws.ec2;

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
 * TagSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResourceType",
    "Tags"
})
public class TagSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype
     * 
     */
    @JsonProperty("ResourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype")
    private CharSequence resourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype
     * 
     */
    public CharSequence getResourceType() {
        return resourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-resourcetype
     * 
     */
    public void setResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
    }

    public TagSpecification withResourceType(CharSequence resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-tagspecification.html#cfn-ec2-launchtemplate-tagspecification-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public TagSpecification withTags(List<Tag> tags) {
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
