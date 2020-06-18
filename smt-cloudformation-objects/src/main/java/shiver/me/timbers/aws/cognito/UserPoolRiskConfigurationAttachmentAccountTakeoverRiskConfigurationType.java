
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
 * UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Actions",
    "NotifyConfiguration"
})
public class UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType implements Property<UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType>
{

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html
     * 
     */
    @JsonProperty("Actions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html")
    private Property<UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType> actions;
    /**
     * UserPoolRiskConfigurationAttachmentNotifyConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html
     * 
     */
    @JsonProperty("NotifyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html")
    private Property<UserPoolRiskConfigurationAttachmentNotifyConfigurationType> notifyConfiguration;

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType> getActions() {
        return actions;
    }

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html
     * 
     */
    @JsonIgnore
    public void setActions(Property<UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType> actions) {
        this.actions = actions;
    }

    public UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType withActions(Property<UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * UserPoolRiskConfigurationAttachmentNotifyConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolRiskConfigurationAttachmentNotifyConfigurationType> getNotifyConfiguration() {
        return notifyConfiguration;
    }

    /**
     * UserPoolRiskConfigurationAttachmentNotifyConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html
     * 
     */
    @JsonIgnore
    public void setNotifyConfiguration(Property<UserPoolRiskConfigurationAttachmentNotifyConfigurationType> notifyConfiguration) {
        this.notifyConfiguration = notifyConfiguration;
    }

    public UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType withNotifyConfiguration(Property<UserPoolRiskConfigurationAttachmentNotifyConfigurationType> notifyConfiguration) {
        this.notifyConfiguration = notifyConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actions", actions).append("notifyConfiguration", notifyConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(actions).append(notifyConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType rhs = ((UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType) other);
        return new EqualsBuilder().append(actions, rhs.actions).append(notifyConfiguration, rhs.notifyConfiguration).isEquals();
    }

}
