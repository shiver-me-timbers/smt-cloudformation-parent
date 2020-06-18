
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
 * UserPoolRiskConfigurationAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CompromisedCredentialsRiskConfiguration",
    "UserPoolId",
    "ClientId",
    "AccountTakeoverRiskConfiguration",
    "RiskExceptionConfiguration"
})
public class UserPoolRiskConfigurationAttachment {

    /**
     * UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html
     * 
     */
    @JsonProperty("CompromisedCredentialsRiskConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html")
    private Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType> compromisedCredentialsRiskConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid")
    private CharSequence userPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid
     * 
     */
    @JsonProperty("ClientId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid")
    private CharSequence clientId;
    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html
     * 
     */
    @JsonProperty("AccountTakeoverRiskConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html")
    private Property<UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType> accountTakeoverRiskConfiguration;
    /**
     * UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html
     * 
     */
    @JsonProperty("RiskExceptionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html")
    private Property<UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType> riskExceptionConfiguration;

    /**
     * UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType> getCompromisedCredentialsRiskConfiguration() {
        return compromisedCredentialsRiskConfiguration;
    }

    /**
     * UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html
     * 
     */
    @JsonIgnore
    public void setCompromisedCredentialsRiskConfiguration(Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType> compromisedCredentialsRiskConfiguration) {
        this.compromisedCredentialsRiskConfiguration = compromisedCredentialsRiskConfiguration;
    }

    public UserPoolRiskConfigurationAttachment withCompromisedCredentialsRiskConfiguration(Property<UserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationType> compromisedCredentialsRiskConfiguration) {
        this.compromisedCredentialsRiskConfiguration = compromisedCredentialsRiskConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid
     * 
     */
    @JsonIgnore
    public CharSequence getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-userpoolid
     * 
     */
    @JsonIgnore
    public void setUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolRiskConfigurationAttachment withUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid
     * 
     */
    @JsonIgnore
    public CharSequence getClientId() {
        return clientId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html#cfn-cognito-userpoolriskconfigurationattachment-clientid
     * 
     */
    @JsonIgnore
    public void setClientId(CharSequence clientId) {
        this.clientId = clientId;
    }

    public UserPoolRiskConfigurationAttachment withClientId(CharSequence clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType> getAccountTakeoverRiskConfiguration() {
        return accountTakeoverRiskConfiguration;
    }

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html
     * 
     */
    @JsonIgnore
    public void setAccountTakeoverRiskConfiguration(Property<UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType> accountTakeoverRiskConfiguration) {
        this.accountTakeoverRiskConfiguration = accountTakeoverRiskConfiguration;
    }

    public UserPoolRiskConfigurationAttachment withAccountTakeoverRiskConfiguration(Property<UserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationType> accountTakeoverRiskConfiguration) {
        this.accountTakeoverRiskConfiguration = accountTakeoverRiskConfiguration;
        return this;
    }

    /**
     * UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType> getRiskExceptionConfiguration() {
        return riskExceptionConfiguration;
    }

    /**
     * UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html
     * 
     */
    @JsonIgnore
    public void setRiskExceptionConfiguration(Property<UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType> riskExceptionConfiguration) {
        this.riskExceptionConfiguration = riskExceptionConfiguration;
    }

    public UserPoolRiskConfigurationAttachment withRiskExceptionConfiguration(Property<UserPoolRiskConfigurationAttachmentRiskExceptionConfigurationType> riskExceptionConfiguration) {
        this.riskExceptionConfiguration = riskExceptionConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("compromisedCredentialsRiskConfiguration", compromisedCredentialsRiskConfiguration).append("userPoolId", userPoolId).append("clientId", clientId).append("accountTakeoverRiskConfiguration", accountTakeoverRiskConfiguration).append("riskExceptionConfiguration", riskExceptionConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientId).append(accountTakeoverRiskConfiguration).append(userPoolId).append(riskExceptionConfiguration).append(compromisedCredentialsRiskConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachment) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachment rhs = ((UserPoolRiskConfigurationAttachment) other);
        return new EqualsBuilder().append(clientId, rhs.clientId).append(accountTakeoverRiskConfiguration, rhs.accountTakeoverRiskConfiguration).append(userPoolId, rhs.userPoolId).append(riskExceptionConfiguration, rhs.riskExceptionConfiguration).append(compromisedCredentialsRiskConfiguration, rhs.compromisedCredentialsRiskConfiguration).isEquals();
    }

}
