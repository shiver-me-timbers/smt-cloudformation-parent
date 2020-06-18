
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
 * UserPoolClient
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AnalyticsConfiguration",
    "GenerateSecret",
    "CallbackURLs",
    "AllowedOAuthScopes",
    "ReadAttributes",
    "AllowedOAuthFlowsUserPoolClient",
    "DefaultRedirectURI",
    "SupportedIdentityProviders",
    "ClientName",
    "UserPoolId",
    "AllowedOAuthFlows",
    "ExplicitAuthFlows",
    "LogoutURLs",
    "RefreshTokenValidity",
    "WriteAttributes",
    "PreventUserExistenceErrors"
})
public class UserPoolClient {

    /**
     * UserPoolClientAnalyticsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html
     * 
     */
    @JsonProperty("AnalyticsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html")
    private Property<UserPoolClientAnalyticsConfiguration> analyticsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret
     * 
     */
    @JsonProperty("GenerateSecret")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret")
    private CharSequence generateSecret;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-callbackurls
     * 
     */
    @JsonProperty("CallbackURLs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-callbackurls")
    private List<CharSequence> callbackURLs = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthscopes
     * 
     */
    @JsonProperty("AllowedOAuthScopes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthscopes")
    private List<CharSequence> allowedOAuthScopes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes
     * 
     */
    @JsonProperty("ReadAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes")
    private List<CharSequence> readAttributes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflowsuserpoolclient
     * 
     */
    @JsonProperty("AllowedOAuthFlowsUserPoolClient")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflowsuserpoolclient")
    private CharSequence allowedOAuthFlowsUserPoolClient;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-defaultredirecturi
     * 
     */
    @JsonProperty("DefaultRedirectURI")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-defaultredirecturi")
    private CharSequence defaultRedirectURI;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-supportedidentityproviders
     * 
     */
    @JsonProperty("SupportedIdentityProviders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-supportedidentityproviders")
    private List<CharSequence> supportedIdentityProviders = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname
     * 
     */
    @JsonProperty("ClientName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname")
    private CharSequence clientName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid")
    private CharSequence userPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflows
     * 
     */
    @JsonProperty("AllowedOAuthFlows")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflows")
    private List<CharSequence> allowedOAuthFlows = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    @JsonProperty("ExplicitAuthFlows")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows")
    private List<CharSequence> explicitAuthFlows = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-logouturls
     * 
     */
    @JsonProperty("LogoutURLs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-logouturls")
    private List<CharSequence> logoutURLs = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity
     * 
     */
    @JsonProperty("RefreshTokenValidity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity")
    private Number refreshTokenValidity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    @JsonProperty("WriteAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes")
    private List<CharSequence> writeAttributes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-preventuserexistenceerrors
     * 
     */
    @JsonProperty("PreventUserExistenceErrors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-preventuserexistenceerrors")
    private CharSequence preventUserExistenceErrors;

    /**
     * UserPoolClientAnalyticsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolClientAnalyticsConfiguration> getAnalyticsConfiguration() {
        return analyticsConfiguration;
    }

    /**
     * UserPoolClientAnalyticsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAnalyticsConfiguration(Property<UserPoolClientAnalyticsConfiguration> analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    public UserPoolClient withAnalyticsConfiguration(Property<UserPoolClientAnalyticsConfiguration> analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret
     * 
     */
    @JsonIgnore
    public CharSequence getGenerateSecret() {
        return generateSecret;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-generatesecret
     * 
     */
    @JsonIgnore
    public void setGenerateSecret(CharSequence generateSecret) {
        this.generateSecret = generateSecret;
    }

    public UserPoolClient withGenerateSecret(CharSequence generateSecret) {
        this.generateSecret = generateSecret;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-callbackurls
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCallbackURLs() {
        return callbackURLs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-callbackurls
     * 
     */
    @JsonIgnore
    public void setCallbackURLs(List<CharSequence> callbackURLs) {
        this.callbackURLs = callbackURLs;
    }

    public UserPoolClient withCallbackURLs(List<CharSequence> callbackURLs) {
        this.callbackURLs = callbackURLs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthscopes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowedOAuthScopes() {
        return allowedOAuthScopes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthscopes
     * 
     */
    @JsonIgnore
    public void setAllowedOAuthScopes(List<CharSequence> allowedOAuthScopes) {
        this.allowedOAuthScopes = allowedOAuthScopes;
    }

    public UserPoolClient withAllowedOAuthScopes(List<CharSequence> allowedOAuthScopes) {
        this.allowedOAuthScopes = allowedOAuthScopes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getReadAttributes() {
        return readAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-readattributes
     * 
     */
    @JsonIgnore
    public void setReadAttributes(List<CharSequence> readAttributes) {
        this.readAttributes = readAttributes;
    }

    public UserPoolClient withReadAttributes(List<CharSequence> readAttributes) {
        this.readAttributes = readAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflowsuserpoolclient
     * 
     */
    @JsonIgnore
    public CharSequence getAllowedOAuthFlowsUserPoolClient() {
        return allowedOAuthFlowsUserPoolClient;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflowsuserpoolclient
     * 
     */
    @JsonIgnore
    public void setAllowedOAuthFlowsUserPoolClient(CharSequence allowedOAuthFlowsUserPoolClient) {
        this.allowedOAuthFlowsUserPoolClient = allowedOAuthFlowsUserPoolClient;
    }

    public UserPoolClient withAllowedOAuthFlowsUserPoolClient(CharSequence allowedOAuthFlowsUserPoolClient) {
        this.allowedOAuthFlowsUserPoolClient = allowedOAuthFlowsUserPoolClient;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-defaultredirecturi
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultRedirectURI() {
        return defaultRedirectURI;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-defaultredirecturi
     * 
     */
    @JsonIgnore
    public void setDefaultRedirectURI(CharSequence defaultRedirectURI) {
        this.defaultRedirectURI = defaultRedirectURI;
    }

    public UserPoolClient withDefaultRedirectURI(CharSequence defaultRedirectURI) {
        this.defaultRedirectURI = defaultRedirectURI;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-supportedidentityproviders
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSupportedIdentityProviders() {
        return supportedIdentityProviders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-supportedidentityproviders
     * 
     */
    @JsonIgnore
    public void setSupportedIdentityProviders(List<CharSequence> supportedIdentityProviders) {
        this.supportedIdentityProviders = supportedIdentityProviders;
    }

    public UserPoolClient withSupportedIdentityProviders(List<CharSequence> supportedIdentityProviders) {
        this.supportedIdentityProviders = supportedIdentityProviders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname
     * 
     */
    @JsonIgnore
    public CharSequence getClientName() {
        return clientName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-clientname
     * 
     */
    @JsonIgnore
    public void setClientName(CharSequence clientName) {
        this.clientName = clientName;
    }

    public UserPoolClient withClientName(CharSequence clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    @JsonIgnore
    public CharSequence getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-userpoolid
     * 
     */
    @JsonIgnore
    public void setUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolClient withUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflows
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowedOAuthFlows() {
        return allowedOAuthFlows;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthflows
     * 
     */
    @JsonIgnore
    public void setAllowedOAuthFlows(List<CharSequence> allowedOAuthFlows) {
        this.allowedOAuthFlows = allowedOAuthFlows;
    }

    public UserPoolClient withAllowedOAuthFlows(List<CharSequence> allowedOAuthFlows) {
        this.allowedOAuthFlows = allowedOAuthFlows;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    @JsonIgnore
    public List<CharSequence> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-explicitauthflows
     * 
     */
    @JsonIgnore
    public void setExplicitAuthFlows(List<CharSequence> explicitAuthFlows) {
        this.explicitAuthFlows = explicitAuthFlows;
    }

    public UserPoolClient withExplicitAuthFlows(List<CharSequence> explicitAuthFlows) {
        this.explicitAuthFlows = explicitAuthFlows;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-logouturls
     * 
     */
    @JsonIgnore
    public List<CharSequence> getLogoutURLs() {
        return logoutURLs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-logouturls
     * 
     */
    @JsonIgnore
    public void setLogoutURLs(List<CharSequence> logoutURLs) {
        this.logoutURLs = logoutURLs;
    }

    public UserPoolClient withLogoutURLs(List<CharSequence> logoutURLs) {
        this.logoutURLs = logoutURLs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity
     * 
     */
    @JsonIgnore
    public Number getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-refreshtokenvalidity
     * 
     */
    @JsonIgnore
    public void setRefreshTokenValidity(Number refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public UserPoolClient withRefreshTokenValidity(Number refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-writeattributes
     * 
     */
    @JsonIgnore
    public void setWriteAttributes(List<CharSequence> writeAttributes) {
        this.writeAttributes = writeAttributes;
    }

    public UserPoolClient withWriteAttributes(List<CharSequence> writeAttributes) {
        this.writeAttributes = writeAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-preventuserexistenceerrors
     * 
     */
    @JsonIgnore
    public CharSequence getPreventUserExistenceErrors() {
        return preventUserExistenceErrors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-preventuserexistenceerrors
     * 
     */
    @JsonIgnore
    public void setPreventUserExistenceErrors(CharSequence preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors;
    }

    public UserPoolClient withPreventUserExistenceErrors(CharSequence preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("analyticsConfiguration", analyticsConfiguration).append("generateSecret", generateSecret).append("callbackURLs", callbackURLs).append("allowedOAuthScopes", allowedOAuthScopes).append("readAttributes", readAttributes).append("allowedOAuthFlowsUserPoolClient", allowedOAuthFlowsUserPoolClient).append("defaultRedirectURI", defaultRedirectURI).append("supportedIdentityProviders", supportedIdentityProviders).append("clientName", clientName).append("userPoolId", userPoolId).append("allowedOAuthFlows", allowedOAuthFlows).append("explicitAuthFlows", explicitAuthFlows).append("logoutURLs", logoutURLs).append("refreshTokenValidity", refreshTokenValidity).append("writeAttributes", writeAttributes).append("preventUserExistenceErrors", preventUserExistenceErrors).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientName).append(logoutURLs).append(callbackURLs).append(allowedOAuthScopes).append(preventUserExistenceErrors).append(writeAttributes).append(defaultRedirectURI).append(explicitAuthFlows).append(supportedIdentityProviders).append(allowedOAuthFlowsUserPoolClient).append(refreshTokenValidity).append(analyticsConfiguration).append(readAttributes).append(allowedOAuthFlows).append(generateSecret).append(userPoolId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolClient) == false) {
            return false;
        }
        UserPoolClient rhs = ((UserPoolClient) other);
        return new EqualsBuilder().append(clientName, rhs.clientName).append(logoutURLs, rhs.logoutURLs).append(callbackURLs, rhs.callbackURLs).append(allowedOAuthScopes, rhs.allowedOAuthScopes).append(preventUserExistenceErrors, rhs.preventUserExistenceErrors).append(writeAttributes, rhs.writeAttributes).append(defaultRedirectURI, rhs.defaultRedirectURI).append(explicitAuthFlows, rhs.explicitAuthFlows).append(supportedIdentityProviders, rhs.supportedIdentityProviders).append(allowedOAuthFlowsUserPoolClient, rhs.allowedOAuthFlowsUserPoolClient).append(refreshTokenValidity, rhs.refreshTokenValidity).append(analyticsConfiguration, rhs.analyticsConfiguration).append(readAttributes, rhs.readAttributes).append(allowedOAuthFlows, rhs.allowedOAuthFlows).append(generateSecret, rhs.generateSecret).append(userPoolId, rhs.userPoolId).isEquals();
    }

}
