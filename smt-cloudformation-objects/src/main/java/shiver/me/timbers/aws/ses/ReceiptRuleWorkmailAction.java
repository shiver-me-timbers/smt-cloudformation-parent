
package shiver.me.timbers.aws.ses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ReceiptRuleWorkmailAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TopicArn",
    "OrganizationArn"
})
public class ReceiptRuleWorkmailAction implements Property<ReceiptRuleWorkmailAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn")
    private CharSequence topicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn
     * 
     */
    @JsonProperty("OrganizationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn")
    private CharSequence organizationArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn
     * 
     */
    @JsonIgnore
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-topicarn
     * 
     */
    @JsonIgnore
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public ReceiptRuleWorkmailAction withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn
     * 
     */
    @JsonIgnore
    public CharSequence getOrganizationArn() {
        return organizationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html#cfn-ses-receiptrule-workmailaction-organizationarn
     * 
     */
    @JsonIgnore
    public void setOrganizationArn(CharSequence organizationArn) {
        this.organizationArn = organizationArn;
    }

    public ReceiptRuleWorkmailAction withOrganizationArn(CharSequence organizationArn) {
        this.organizationArn = organizationArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("topicArn", topicArn).append("organizationArn", organizationArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topicArn).append(organizationArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptRuleWorkmailAction) == false) {
            return false;
        }
        ReceiptRuleWorkmailAction rhs = ((ReceiptRuleWorkmailAction) other);
        return new EqualsBuilder().append(topicArn, rhs.topicArn).append(organizationArn, rhs.organizationArn).isEquals();
    }

}
