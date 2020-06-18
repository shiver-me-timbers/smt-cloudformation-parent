
package shiver.me.timbers.aws.cognito;

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
 * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Notify",
    "EventAction"
})
public class UserPoolRiskConfigurationAttachmentAccountTakeoverActionType implements Property<UserPoolRiskConfigurationAttachmentAccountTakeoverActionType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-notify
     * 
     */
    @JsonProperty("Notify")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-notify")
    private CharSequence notify;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-eventaction
     * 
     */
    @JsonProperty("EventAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-eventaction")
    private CharSequence eventAction;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-notify
     * 
     */
    @JsonIgnore
    public CharSequence getNotify() {
        return notify;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-notify
     * 
     */
    @JsonIgnore
    public void setNotify(CharSequence notify) {
        this.notify = notify;
    }

    public UserPoolRiskConfigurationAttachmentAccountTakeoverActionType withNotify(CharSequence notify) {
        this.notify = notify;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-eventaction
     * 
     */
    @JsonIgnore
    public CharSequence getEventAction() {
        return eventAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html#cfn-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype-eventaction
     * 
     */
    @JsonIgnore
    public void setEventAction(CharSequence eventAction) {
        this.eventAction = eventAction;
    }

    public UserPoolRiskConfigurationAttachmentAccountTakeoverActionType withEventAction(CharSequence eventAction) {
        this.eventAction = eventAction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notify", notify).append("eventAction", eventAction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventAction).append(notify).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachmentAccountTakeoverActionType) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachmentAccountTakeoverActionType rhs = ((UserPoolRiskConfigurationAttachmentAccountTakeoverActionType) other);
        return new EqualsBuilder().append(eventAction, rhs.eventAction).append(notify, rhs.notify).isEquals();
    }

}
