
package shiver.me.timbers.aws.codestarnotifications;

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
 * NotificationRuleTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetType",
    "TargetAddress"
})
public class NotificationRuleTarget implements Property<NotificationRuleTarget>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targettype
     * 
     */
    @JsonProperty("TargetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targettype")
    private CharSequence targetType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targetaddress
     * 
     */
    @JsonProperty("TargetAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targetaddress")
    private CharSequence targetAddress;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targettype
     * 
     */
    @JsonIgnore
    public CharSequence getTargetType() {
        return targetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targettype
     * 
     */
    @JsonIgnore
    public void setTargetType(CharSequence targetType) {
        this.targetType = targetType;
    }

    public NotificationRuleTarget withTargetType(CharSequence targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targetaddress
     * 
     */
    @JsonIgnore
    public CharSequence getTargetAddress() {
        return targetAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html#cfn-codestarnotifications-notificationrule-target-targetaddress
     * 
     */
    @JsonIgnore
    public void setTargetAddress(CharSequence targetAddress) {
        this.targetAddress = targetAddress;
    }

    public NotificationRuleTarget withTargetAddress(CharSequence targetAddress) {
        this.targetAddress = targetAddress;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetType", targetType).append("targetAddress", targetAddress).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetAddress).append(targetType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NotificationRuleTarget) == false) {
            return false;
        }
        NotificationRuleTarget rhs = ((NotificationRuleTarget) other);
        return new EqualsBuilder().append(targetAddress, rhs.targetAddress).append(targetType, rhs.targetType).isEquals();
    }

}
