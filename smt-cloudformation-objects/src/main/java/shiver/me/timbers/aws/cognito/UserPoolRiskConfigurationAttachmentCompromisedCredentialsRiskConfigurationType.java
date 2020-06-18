
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
 * UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Actions",
    "EventFilter"
})
public class UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType implements Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType>
{

    /**
     * UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html
     * 
     */
    @JsonProperty("Actions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html")
    private Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType> actions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-eventfilter
     * 
     */
    @JsonProperty("EventFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-eventfilter")
    private List<CharSequence> eventFilter = new ArrayList<CharSequence>();

    /**
     * UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType> getActions() {
        return actions;
    }

    /**
     * UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html
     * 
     */
    @JsonIgnore
    public void setActions(Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType> actions) {
        this.actions = actions;
    }

    public UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType withActions(Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsType> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-eventfilter
     * 
     */
    @JsonIgnore
    public List<CharSequence> getEventFilter() {
        return eventFilter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html#cfn-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype-eventfilter
     * 
     */
    @JsonIgnore
    public void setEventFilter(List<CharSequence> eventFilter) {
        this.eventFilter = eventFilter;
    }

    public UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType withEventFilter(List<CharSequence> eventFilter) {
        this.eventFilter = eventFilter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actions", actions).append("eventFilter", eventFilter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventFilter).append(actions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType rhs = ((UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType) other);
        return new EqualsBuilder().append(eventFilter, rhs.eventFilter).append(actions, rhs.actions).isEquals();
    }

}
