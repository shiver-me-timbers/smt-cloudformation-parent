
package aws.servicecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TagOptionAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TagOptionId",
    "ResourceId"
})
public class TagOptionAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid
     * 
     */
    @JsonProperty("TagOptionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid")
    private CharSequence tagOptionId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid")
    private CharSequence resourceId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid
     * 
     */
    public CharSequence getTagOptionId() {
        return tagOptionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-tagoptionid
     * 
     */
    public void setTagOptionId(CharSequence tagOptionId) {
        this.tagOptionId = tagOptionId;
    }

    public TagOptionAssociation withTagOptionId(CharSequence tagOptionId) {
        this.tagOptionId = tagOptionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid
     * 
     */
    public CharSequence getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html#cfn-servicecatalog-tagoptionassociation-resourceid
     * 
     */
    public void setResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
    }

    public TagOptionAssociation withResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tagOptionId", tagOptionId).append("resourceId", resourceId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tagOptionId).append(resourceId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TagOptionAssociation) == false) {
            return false;
        }
        TagOptionAssociation rhs = ((TagOptionAssociation) other);
        return new EqualsBuilder().append(tagOptionId, rhs.tagOptionId).append(resourceId, rhs.resourceId).isEquals();
    }

}
