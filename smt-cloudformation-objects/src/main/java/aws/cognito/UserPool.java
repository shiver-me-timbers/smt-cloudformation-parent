
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
    private UserPoolTags userPoolTags;
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
    private String mfaConfiguration;
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
    private String smsAuthenticationMessage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname
     * 
     */
    @JsonProperty("UserPoolName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname")
    private String userPoolName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage
     * 
     */
    @JsonProperty("SmsVerificationMessage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage")
    private String smsVerificationMessage;
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
    private List<String> aliasAttributes = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject
     * 
     */
    @JsonProperty("EmailVerificationSubject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject")
    private String emailVerificationSubject;
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
    private List<String> usernameAttributes = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes
     * 
     */
    @JsonProperty("AutoVerifiedAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes")
    private List<String> autoVerifiedAttributes = new ArrayList<String>();
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
    private String emailVerificationMessage;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags
     * 
     */
    @JsonProperty("UserPoolTags")
    public UserPoolTags getUserPoolTags() {
        return userPoolTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpooltags
     * 
     */
    @JsonProperty("UserPoolTags")
    public void setUserPoolTags(UserPoolTags userPoolTags) {
        this.userPoolTags = userPoolTags;
    }

    public UserPool withUserPoolTags(UserPoolTags userPoolTags) {
        this.userPoolTags = userPoolTags;
        return this;
    }

    /**
     * Policies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
     * 
     */
    @JsonProperty("Policies")
    public Policies getPolicies() {
        return policies;
    }

    /**
     * Policies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html
     * 
     */
    @JsonProperty("Policies")
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
    @JsonProperty("MfaConfiguration")
    public String getMfaConfiguration() {
        return mfaConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-mfaconfiguration
     * 
     */
    @JsonProperty("MfaConfiguration")
    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    public UserPool withMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema
     * 
     */
    @JsonProperty("Schema")
    public List<SchemaAttribute> getSchema() {
        return schema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-schema
     * 
     */
    @JsonProperty("Schema")
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
    @JsonProperty("AdminCreateUserConfig")
    public AdminCreateUserConfig getAdminCreateUserConfig() {
        return adminCreateUserConfig;
    }

    /**
     * AdminCreateUserConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
     * 
     */
    @JsonProperty("AdminCreateUserConfig")
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
    @JsonProperty("SmsAuthenticationMessage")
    public String getSmsAuthenticationMessage() {
        return smsAuthenticationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsauthenticationmessage
     * 
     */
    @JsonProperty("SmsAuthenticationMessage")
    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }

    public UserPool withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname
     * 
     */
    @JsonProperty("UserPoolName")
    public String getUserPoolName() {
        return userPoolName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-userpoolname
     * 
     */
    @JsonProperty("UserPoolName")
    public void setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
    }

    public UserPool withUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage
     * 
     */
    @JsonProperty("SmsVerificationMessage")
    public String getSmsVerificationMessage() {
        return smsVerificationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-smsverificationmessage
     * 
     */
    @JsonProperty("SmsVerificationMessage")
    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    public UserPool withSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
        return this;
    }

    /**
     * EmailConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
     * 
     */
    @JsonProperty("EmailConfiguration")
    public EmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * EmailConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html
     * 
     */
    @JsonProperty("EmailConfiguration")
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
    @JsonProperty("SmsConfiguration")
    public SmsConfiguration getSmsConfiguration() {
        return smsConfiguration;
    }

    /**
     * SmsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
     * 
     */
    @JsonProperty("SmsConfiguration")
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
    @JsonProperty("AliasAttributes")
    public List<String> getAliasAttributes() {
        return aliasAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-aliasattributes
     * 
     */
    @JsonProperty("AliasAttributes")
    public void setAliasAttributes(List<String> aliasAttributes) {
        this.aliasAttributes = aliasAttributes;
    }

    public UserPool withAliasAttributes(List<String> aliasAttributes) {
        this.aliasAttributes = aliasAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject
     * 
     */
    @JsonProperty("EmailVerificationSubject")
    public String getEmailVerificationSubject() {
        return emailVerificationSubject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationsubject
     * 
     */
    @JsonProperty("EmailVerificationSubject")
    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    public UserPool withEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
        return this;
    }

    /**
     * LambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
     * 
     */
    @JsonProperty("LambdaConfig")
    public LambdaConfig getLambdaConfig() {
        return lambdaConfig;
    }

    /**
     * LambdaConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html
     * 
     */
    @JsonProperty("LambdaConfig")
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
    @JsonProperty("UsernameAttributes")
    public List<String> getUsernameAttributes() {
        return usernameAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-usernameattributes
     * 
     */
    @JsonProperty("UsernameAttributes")
    public void setUsernameAttributes(List<String> usernameAttributes) {
        this.usernameAttributes = usernameAttributes;
    }

    public UserPool withUsernameAttributes(List<String> usernameAttributes) {
        this.usernameAttributes = usernameAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes
     * 
     */
    @JsonProperty("AutoVerifiedAttributes")
    public List<String> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-autoverifiedattributes
     * 
     */
    @JsonProperty("AutoVerifiedAttributes")
    public void setAutoVerifiedAttributes(List<String> autoVerifiedAttributes) {
        this.autoVerifiedAttributes = autoVerifiedAttributes;
    }

    public UserPool withAutoVerifiedAttributes(List<String> autoVerifiedAttributes) {
        this.autoVerifiedAttributes = autoVerifiedAttributes;
        return this;
    }

    /**
     * DeviceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
     * 
     */
    @JsonProperty("DeviceConfiguration")
    public DeviceConfiguration getDeviceConfiguration() {
        return deviceConfiguration;
    }

    /**
     * DeviceConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
     * 
     */
    @JsonProperty("DeviceConfiguration")
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
    @JsonProperty("EmailVerificationMessage")
    public String getEmailVerificationMessage() {
        return emailVerificationMessage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html#cfn-cognito-userpool-emailverificationmessage
     * 
     */
    @JsonProperty("EmailVerificationMessage")
    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    public UserPool withEmailVerificationMessage(String emailVerificationMessage) {
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