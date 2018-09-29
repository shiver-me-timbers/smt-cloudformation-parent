
package aws.cognito;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * UserPool
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UserPoolTags",
    "Policies",
    "MfaConfiguration",
    "Schema",
    "AdminCreateUserConfig",
    "SmsAuthenticationMessage",
    "UserPoolName",
    "SmsVerificationMessage",
    "EmailConfiguration",
    "SmsConfiguration",
    "AliasAttributes",
    "EmailVerificationSubject",
    "LambdaConfig",
    "UsernameAttributes",
    "AutoVerifiedAttributes",
    "DeviceConfiguration",
    "EmailVerificationMessage"
})
public class UserPool {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags
     * 
     */
    @JsonProperty("UserPoolTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags")
    private Object userPoolTags;
    /**
     * Policies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
     * 
     */
    @JsonProperty("Policies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html")
    private Policies policies;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration
     * 
     */
    @JsonProperty("MfaConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration")
    private CharSequence mfaConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema
     * 
     */
    @JsonProperty("Schema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema")
    private List<SchemaAttribute> schema = new ArrayList<SchemaAttribute>();
    /**
     * AdminCreateUserConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
     * 
     */
    @JsonProperty("AdminCreateUserConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html")
    private AdminCreateUserConfig adminCreateUserConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage
     * 
     */
    @JsonProperty("SmsAuthenticationMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage")
    private CharSequence smsAuthenticationMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname
     * 
     */
    @JsonProperty("UserPoolName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname")
    private CharSequence userPoolName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage
     * 
     */
    @JsonProperty("SmsVerificationMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage")
    private CharSequence smsVerificationMessage;
    /**
     * EmailConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
     * 
     */
    @JsonProperty("EmailConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html")
    private EmailConfiguration emailConfiguration;
    /**
     * SmsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
     * 
     */
    @JsonProperty("SmsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html")
    private SmsConfiguration smsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes
     * 
     */
    @JsonProperty("AliasAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes")
    private List<CharSequence> aliasAttributes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject
     * 
     */
    @JsonProperty("EmailVerificationSubject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject")
    private CharSequence emailVerificationSubject;
    /**
     * LambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
     * 
     */
    @JsonProperty("LambdaConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html")
    private LambdaConfig lambdaConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes
     * 
     */
    @JsonProperty("UsernameAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes")
    private List<CharSequence> usernameAttributes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes
     * 
     */
    @JsonProperty("AutoVerifiedAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes")
    private List<CharSequence> autoVerifiedAttributes = new ArrayList<CharSequence>();
    /**
     * DeviceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
     * 
     */
    @JsonProperty("DeviceConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html")
    private DeviceConfiguration deviceConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage
     * 
     */
    @JsonProperty("EmailVerificationMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage")
    private CharSequence emailVerificationMessage;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags
     * 
     */
    public Object getUserPoolTags() {
        return userPoolTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags
     * 
     */
    public void setUserPoolTags(Object userPoolTags) {
        this.userPoolTags = userPoolTags;
    }

    public UserPool withUserPoolTags(Object userPoolTags) {
        this.userPoolTags = userPoolTags;
        return this;
    }

    /**
     * Policies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
     * 
     */
    public Policies getPolicies() {
        return policies;
    }

    /**
     * Policies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
     * 
     */
    public void setPolicies(Policies policies) {
        this.policies = policies;
    }

    public UserPool withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration
     * 
     */
    public CharSequence getMfaConfiguration() {
        return mfaConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration
     * 
     */
    public void setMfaConfiguration(CharSequence mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    public UserPool withMfaConfiguration(CharSequence mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema
     * 
     */
    public List<SchemaAttribute> getSchema() {
        return schema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema
     * 
     */
    public void setSchema(List<SchemaAttribute> schema) {
        this.schema = schema;
    }

    public UserPool withSchema(List<SchemaAttribute> schema) {
        this.schema = schema;
        return this;
    }

    /**
     * AdminCreateUserConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
     * 
     */
    public AdminCreateUserConfig getAdminCreateUserConfig() {
        return adminCreateUserConfig;
    }

    /**
     * AdminCreateUserConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
     * 
     */
    public void setAdminCreateUserConfig(AdminCreateUserConfig adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
    }

    public UserPool withAdminCreateUserConfig(AdminCreateUserConfig adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage
     * 
     */
    public CharSequence getSmsAuthenticationMessage() {
        return smsAuthenticationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage
     * 
     */
    public void setSmsAuthenticationMessage(CharSequence smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }

    public UserPool withSmsAuthenticationMessage(CharSequence smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname
     * 
     */
    public CharSequence getUserPoolName() {
        return userPoolName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname
     * 
     */
    public void setUserPoolName(CharSequence userPoolName) {
        this.userPoolName = userPoolName;
    }

    public UserPool withUserPoolName(CharSequence userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage
     * 
     */
    public CharSequence getSmsVerificationMessage() {
        return smsVerificationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage
     * 
     */
    public void setSmsVerificationMessage(CharSequence smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    public UserPool withSmsVerificationMessage(CharSequence smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
        return this;
    }

    /**
     * EmailConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
     * 
     */
    public EmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * EmailConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
     * 
     */
    public void setEmailConfiguration(EmailConfiguration emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    public UserPool withEmailConfiguration(EmailConfiguration emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
        return this;
    }

    /**
     * SmsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
     * 
     */
    public SmsConfiguration getSmsConfiguration() {
        return smsConfiguration;
    }

    /**
     * SmsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
     * 
     */
    public void setSmsConfiguration(SmsConfiguration smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
    }

    public UserPool withSmsConfiguration(SmsConfiguration smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes
     * 
     */
    public List<CharSequence> getAliasAttributes() {
        return aliasAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes
     * 
     */
    public void setAliasAttributes(List<CharSequence> aliasAttributes) {
        this.aliasAttributes = aliasAttributes;
    }

    public UserPool withAliasAttributes(List<CharSequence> aliasAttributes) {
        this.aliasAttributes = aliasAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject
     * 
     */
    public CharSequence getEmailVerificationSubject() {
        return emailVerificationSubject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject
     * 
     */
    public void setEmailVerificationSubject(CharSequence emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    public UserPool withEmailVerificationSubject(CharSequence emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
        return this;
    }

    /**
     * LambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
     * 
     */
    public LambdaConfig getLambdaConfig() {
        return lambdaConfig;
    }

    /**
     * LambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
     * 
     */
    public void setLambdaConfig(LambdaConfig lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    public UserPool withLambdaConfig(LambdaConfig lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes
     * 
     */
    public List<CharSequence> getUsernameAttributes() {
        return usernameAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes
     * 
     */
    public void setUsernameAttributes(List<CharSequence> usernameAttributes) {
        this.usernameAttributes = usernameAttributes;
    }

    public UserPool withUsernameAttributes(List<CharSequence> usernameAttributes) {
        this.usernameAttributes = usernameAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes
     * 
     */
    public List<CharSequence> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes
     * 
     */
    public void setAutoVerifiedAttributes(List<CharSequence> autoVerifiedAttributes) {
        this.autoVerifiedAttributes = autoVerifiedAttributes;
    }

    public UserPool withAutoVerifiedAttributes(List<CharSequence> autoVerifiedAttributes) {
        this.autoVerifiedAttributes = autoVerifiedAttributes;
        return this;
    }

    /**
     * DeviceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
     * 
     */
    public DeviceConfiguration getDeviceConfiguration() {
        return deviceConfiguration;
    }

    /**
     * DeviceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
     * 
     */
    public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    public UserPool withDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage
     * 
     */
    public CharSequence getEmailVerificationMessage() {
        return emailVerificationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage
     * 
     */
    public void setEmailVerificationMessage(CharSequence emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    public UserPool withEmailVerificationMessage(CharSequence emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userPoolTags", userPoolTags).append("policies", policies).append("mfaConfiguration", mfaConfiguration).append("schema", schema).append("adminCreateUserConfig", adminCreateUserConfig).append("smsAuthenticationMessage", smsAuthenticationMessage).append("userPoolName", userPoolName).append("smsVerificationMessage", smsVerificationMessage).append("emailConfiguration", emailConfiguration).append("smsConfiguration", smsConfiguration).append("aliasAttributes", aliasAttributes).append("emailVerificationSubject", emailVerificationSubject).append("lambdaConfig", lambdaConfig).append("usernameAttributes", usernameAttributes).append("autoVerifiedAttributes", autoVerifiedAttributes).append("deviceConfiguration", deviceConfiguration).append("emailVerificationMessage", emailVerificationMessage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schema).append(userPoolName).append(usernameAttributes).append(autoVerifiedAttributes).append(policies).append(smsVerificationMessage).append(deviceConfiguration).append(emailVerificationSubject).append(mfaConfiguration).append(lambdaConfig).append(emailVerificationMessage).append(emailConfiguration).append(userPoolTags).append(adminCreateUserConfig).append(smsAuthenticationMessage).append(smsConfiguration).append(aliasAttributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPool) == false) {
            return false;
        }
        UserPool rhs = ((UserPool) other);
        return new EqualsBuilder().append(schema, rhs.schema).append(userPoolName, rhs.userPoolName).append(usernameAttributes, rhs.usernameAttributes).append(autoVerifiedAttributes, rhs.autoVerifiedAttributes).append(policies, rhs.policies).append(smsVerificationMessage, rhs.smsVerificationMessage).append(deviceConfiguration, rhs.deviceConfiguration).append(emailVerificationSubject, rhs.emailVerificationSubject).append(mfaConfiguration, rhs.mfaConfiguration).append(lambdaConfig, rhs.lambdaConfig).append(emailVerificationMessage, rhs.emailVerificationMessage).append(emailConfiguration, rhs.emailConfiguration).append(userPoolTags, rhs.userPoolTags).append(adminCreateUserConfig, rhs.adminCreateUserConfig).append(smsAuthenticationMessage, rhs.smsAuthenticationMessage).append(smsConfiguration, rhs.smsConfiguration).append(aliasAttributes, rhs.aliasAttributes).isEquals();
    }

}
