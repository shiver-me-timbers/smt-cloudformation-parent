
package shiver.me.timbers.aws.cognito;

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


/**
 * UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockedIPRangeList",
    "SkippedIPRangeList"
})
public class UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType implements Property<UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-blockediprangelist
     * 
     */
    @JsonProperty("BlockedIPRangeList")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-blockediprangelist")
    private List<CharSequence> blockedIPRangeList = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-skippediprangelist
     * 
     */
    @JsonProperty("SkippedIPRangeList")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-skippediprangelist")
    private List<CharSequence> skippedIPRangeList = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-blockediprangelist
     * 
     */
    @JsonIgnore
    public List<CharSequence> getBlockedIPRangeList() {
        return blockedIPRangeList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-blockediprangelist
     * 
     */
    @JsonIgnore
    public void setBlockedIPRangeList(List<CharSequence> blockedIPRangeList) {
        this.blockedIPRangeList = blockedIPRangeList;
    }

    public UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType withBlockedIPRangeList(List<CharSequence> blockedIPRangeList) {
        this.blockedIPRangeList = blockedIPRangeList;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-skippediprangelist
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSkippedIPRangeList() {
        return skippedIPRangeList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype-skippediprangelist
     * 
     */
    @JsonIgnore
    public void setSkippedIPRangeList(List<CharSequence> skippedIPRangeList) {
        this.skippedIPRangeList = skippedIPRangeList;
    }

    public UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType withSkippedIPRangeList(List<CharSequence> skippedIPRangeList) {
        this.skippedIPRangeList = skippedIPRangeList;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blockedIPRangeList", blockedIPRangeList).append("skippedIPRangeList", skippedIPRangeList).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(blockedIPRangeList).append(skippedIPRangeList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType rhs = ((UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType) other);
        return new EqualsBuilder().append(blockedIPRangeList, rhs.blockedIPRangeList).append(skippedIPRangeList, rhs.skippedIPRangeList).isEquals();
    }

}
