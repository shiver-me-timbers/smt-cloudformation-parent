
package aws.cognito;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "UserPoolTags",
    "Policies",
    "VerificationMessageTemplate",
    "MfaConfiguration",
    "Schema",
    "AdminCreateUserConfig",
    "SmsAuthenticationMessage",
    "UserPoolName",
    "SmsVerificationMessage",
    "UserPoolAddOns",
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
     * UserPoolPolicies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
     * 
     */
    @JsonProperty("Policies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html")
    private Property<UserPoolPolicies> policies;
    /**
     * UserPoolVerificationMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html
     * 
     */
    @JsonProperty("VerificationMessageTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html")
    private Property<UserPoolVerificationMessageTemplate> verificationMessageTemplate;
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
    private List<Property<UserPoolSchemaAttribute>> schema = new ArrayList<Property<UserPoolSchemaAttribute>>();
    /**
     * UserPoolAdminCreateUserConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
     * 
     */
    @JsonProperty("AdminCreateUserConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html")
    private Property<UserPoolAdminCreateUserConfig> adminCreateUserConfig;
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
     * UserPoolUserPoolAddOns
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html
     * 
     */
    @JsonProperty("UserPoolAddOns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html")
    private Property<UserPoolUserPoolAddOns> userPoolAddOns;
    /**
     * UserPoolEmailConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
     * 
     */
    @JsonProperty("EmailConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html")
    private Property<UserPoolEmailConfiguration> emailConfiguration;
    /**
     * UserPoolSmsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
     * 
     */
    @JsonProperty("SmsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html")
    private Property<UserPoolSmsConfiguration> smsConfiguration;
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
     * UserPoolLambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
     * 
     */
    @JsonProperty("LambdaConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html")
    private Property<UserPoolLambdaConfig> lambdaConfig;
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
     * UserPoolDeviceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
     * 
     */
    @JsonProperty("DeviceConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html")
    private Property<UserPoolDeviceConfiguration> deviceConfiguration;
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
    @JsonIgnore
    public Object getUserPoolTags() {
        return userPoolTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags
     * 
     */
    @JsonIgnore
    public void setUserPoolTags(Object userPoolTags) {
        this.userPoolTags = userPoolTags;
    }

    public UserPool withUserPoolTags(Object userPoolTags) {
        this.userPoolTags = userPoolTags;
        return this;
    }

    /**
     * UserPoolPolicies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolPolicies> getPolicies() {
        return policies;
    }

    /**
     * UserPoolPolicies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
     * 
     */
    @JsonIgnore
    public void setPolicies(Property<UserPoolPolicies> policies) {
        this.policies = policies;
    }

    public UserPool withPolicies(Property<UserPoolPolicies> policies) {
        this.policies = policies;
        return this;
    }

    /**
     * UserPoolVerificationMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolVerificationMessageTemplate> getVerificationMessageTemplate() {
        return verificationMessageTemplate;
    }

    /**
     * UserPoolVerificationMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html
     * 
     */
    @JsonIgnore
    public void setVerificationMessageTemplate(Property<UserPoolVerificationMessageTemplate> verificationMessageTemplate) {
        this.verificationMessageTemplate = verificationMessageTemplate;
    }

    public UserPool withVerificationMessageTemplate(Property<UserPoolVerificationMessageTemplate> verificationMessageTemplate) {
        this.verificationMessageTemplate = verificationMessageTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getMfaConfiguration() {
        return mfaConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<Property<UserPoolSchemaAttribute>> getSchema() {
        return schema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema
     * 
     */
    @JsonIgnore
    public void setSchema(List<Property<UserPoolSchemaAttribute>> schema) {
        this.schema = schema;
    }

    public UserPool withSchema(List<Property<UserPoolSchemaAttribute>> schema) {
        this.schema = schema;
        return this;
    }

    /**
     * UserPoolAdminCreateUserConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolAdminCreateUserConfig> getAdminCreateUserConfig() {
        return adminCreateUserConfig;
    }

    /**
     * UserPoolAdminCreateUserConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
     * 
     */
    @JsonIgnore
    public void setAdminCreateUserConfig(Property<UserPoolAdminCreateUserConfig> adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
    }

    public UserPool withAdminCreateUserConfig(Property<UserPoolAdminCreateUserConfig> adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage
     * 
     */
    @JsonIgnore
    public CharSequence getSmsAuthenticationMessage() {
        return smsAuthenticationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getUserPoolName() {
        return userPoolName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getSmsVerificationMessage() {
        return smsVerificationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage
     * 
     */
    @JsonIgnore
    public void setSmsVerificationMessage(CharSequence smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    public UserPool withSmsVerificationMessage(CharSequence smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
        return this;
    }

    /**
     * UserPoolUserPoolAddOns
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolUserPoolAddOns> getUserPoolAddOns() {
        return userPoolAddOns;
    }

    /**
     * UserPoolUserPoolAddOns
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html
     * 
     */
    @JsonIgnore
    public void setUserPoolAddOns(Property<UserPoolUserPoolAddOns> userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
    }

    public UserPool withUserPoolAddOns(Property<UserPoolUserPoolAddOns> userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
        return this;
    }

    /**
     * UserPoolEmailConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolEmailConfiguration> getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * UserPoolEmailConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
     * 
     */
    @JsonIgnore
    public void setEmailConfiguration(Property<UserPoolEmailConfiguration> emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    public UserPool withEmailConfiguration(Property<UserPoolEmailConfiguration> emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
        return this;
    }

    /**
     * UserPoolSmsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolSmsConfiguration> getSmsConfiguration() {
        return smsConfiguration;
    }

    /**
     * UserPoolSmsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
     * 
     */
    @JsonIgnore
    public void setSmsConfiguration(Property<UserPoolSmsConfiguration> smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
    }

    public UserPool withSmsConfiguration(Property<UserPoolSmsConfiguration> smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAliasAttributes() {
        return aliasAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getEmailVerificationSubject() {
        return emailVerificationSubject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject
     * 
     */
    @JsonIgnore
    public void setEmailVerificationSubject(CharSequence emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    public UserPool withEmailVerificationSubject(CharSequence emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
        return this;
    }

    /**
     * UserPoolLambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolLambdaConfig> getLambdaConfig() {
        return lambdaConfig;
    }

    /**
     * UserPoolLambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
     * 
     */
    @JsonIgnore
    public void setLambdaConfig(Property<UserPoolLambdaConfig> lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    public UserPool withLambdaConfig(Property<UserPoolLambdaConfig> lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getUsernameAttributes() {
        return usernameAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<CharSequence> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes
     * 
     */
    @JsonIgnore
    public void setAutoVerifiedAttributes(List<CharSequence> autoVerifiedAttributes) {
        this.autoVerifiedAttributes = autoVerifiedAttributes;
    }

    public UserPool withAutoVerifiedAttributes(List<CharSequence> autoVerifiedAttributes) {
        this.autoVerifiedAttributes = autoVerifiedAttributes;
        return this;
    }

    /**
     * UserPoolDeviceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolDeviceConfiguration> getDeviceConfiguration() {
        return deviceConfiguration;
    }

    /**
     * UserPoolDeviceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
     * 
     */
    @JsonIgnore
    public void setDeviceConfiguration(Property<UserPoolDeviceConfiguration> deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    public UserPool withDeviceConfiguration(Property<UserPoolDeviceConfiguration> deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage
     * 
     */
    @JsonIgnore
    public CharSequence getEmailVerificationMessage() {
        return emailVerificationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage
     * 
     */
    @JsonIgnore
    public void setEmailVerificationMessage(CharSequence emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    public UserPool withEmailVerificationMessage(CharSequence emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userPoolTags", userPoolTags).append("policies", policies).append("verificationMessageTemplate", verificationMessageTemplate).append("mfaConfiguration", mfaConfiguration).append("schema", schema).append("adminCreateUserConfig", adminCreateUserConfig).append("smsAuthenticationMessage", smsAuthenticationMessage).append("userPoolName", userPoolName).append("smsVerificationMessage", smsVerificationMessage).append("userPoolAddOns", userPoolAddOns).append("emailConfiguration", emailConfiguration).append("smsConfiguration", smsConfiguration).append("aliasAttributes", aliasAttributes).append("emailVerificationSubject", emailVerificationSubject).append("lambdaConfig", lambdaConfig).append("usernameAttributes", usernameAttributes).append("autoVerifiedAttributes", autoVerifiedAttributes).append("deviceConfiguration", deviceConfiguration).append("emailVerificationMessage", emailVerificationMessage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schema).append(userPoolName).append(verificationMessageTemplate).append(usernameAttributes).append(autoVerifiedAttributes).append(policies).append(smsVerificationMessage).append(deviceConfiguration).append(emailVerificationSubject).append(mfaConfiguration).append(lambdaConfig).append(emailVerificationMessage).append(emailConfiguration).append(userPoolTags).append(adminCreateUserConfig).append(smsAuthenticationMessage).append(smsConfiguration).append(aliasAttributes).append(userPoolAddOns).toHashCode();
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
        return new EqualsBuilder().append(schema, rhs.schema).append(userPoolName, rhs.userPoolName).append(verificationMessageTemplate, rhs.verificationMessageTemplate).append(usernameAttributes, rhs.usernameAttributes).append(autoVerifiedAttributes, rhs.autoVerifiedAttributes).append(policies, rhs.policies).append(smsVerificationMessage, rhs.smsVerificationMessage).append(deviceConfiguration, rhs.deviceConfiguration).append(emailVerificationSubject, rhs.emailVerificationSubject).append(mfaConfiguration, rhs.mfaConfiguration).append(lambdaConfig, rhs.lambdaConfig).append(emailVerificationMessage, rhs.emailVerificationMessage).append(emailConfiguration, rhs.emailConfiguration).append(userPoolTags, rhs.userPoolTags).append(adminCreateUserConfig, rhs.adminCreateUserConfig).append(smsAuthenticationMessage, rhs.smsAuthenticationMessage).append(smsConfiguration, rhs.smsConfiguration).append(aliasAttributes, rhs.aliasAttributes).append(userPoolAddOns, rhs.userPoolAddOns).isEquals();
    }

}
