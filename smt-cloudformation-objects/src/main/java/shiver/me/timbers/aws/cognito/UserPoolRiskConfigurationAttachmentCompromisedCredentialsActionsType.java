
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
 * UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EventAction"
})
public class UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType implements Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype-eventaction
     * 
     */
    @JsonProperty("EventAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype-eventaction")
    private CharSequence eventAction;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype-eventaction
     * 
     */
    @JsonIgnore
    public CharSequence getEventAction() {
        return eventAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype-eventaction
     * 
     */
    @JsonIgnore
    public void setEventAction(CharSequence eventAction) {
        this.eventAction = eventAction;
    }

    public UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType withEventAction(CharSequence eventAction) {
        this.eventAction = eventAction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eventAction", eventAction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventAction).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType rhs = ((UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType) other);
        return new EqualsBuilder().append(eventAction, rhs.eventAction).isEquals();
    }

}
