
package aws.elasticloadbalancingv2;

import java.util.Map;
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
 * ListenerAuthenticateOidcConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AuthenticationRequestExtraParams",
    "AuthorizationEndpoint",
    "ClientId",
    "ClientSecret",
    "Issuer",
    "OnUnauthenticatedRequest",
    "Scope",
    "SessionCookieName",
    "SessionTimeout",
    "TokenEndpoint",
    "UserInfoEndpoint"
})
public class ListenerAuthenticateOidcConfig implements Property<ListenerAuthenticateOidcConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authenticationrequestextraparams
     * 
     */
    @JsonProperty("AuthenticationRequestExtraParams")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authenticationrequestextraparams")
    private Map<String, CharSequence> authenticationRequestExtraParams;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authorizationendpoint
     * 
     */
    @JsonProperty("AuthorizationEndpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authorizationendpoint")
    private CharSequence authorizationEndpoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientid
     * 
     */
    @JsonProperty("ClientId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientid")
    private CharSequence clientId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientsecret
     * 
     */
    @JsonProperty("ClientSecret")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientsecret")
    private CharSequence clientSecret;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-issuer
     * 
     */
    @JsonProperty("Issuer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-issuer")
    private CharSequence issuer;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-onunauthenticatedrequest
     * 
     */
    @JsonProperty("OnUnauthenticatedRequest")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-onunauthenticatedrequest")
    private CharSequence onUnauthenticatedRequest;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-scope
     * 
     */
    @JsonProperty("Scope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-scope")
    private CharSequence scope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessioncookiename
     * 
     */
    @JsonProperty("SessionCookieName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessioncookiename")
    private CharSequence sessionCookieName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessiontimeout
     * 
     */
    @JsonProperty("SessionTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessiontimeout")
    private Number sessionTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-tokenendpoint
     * 
     */
    @JsonProperty("TokenEndpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-tokenendpoint")
    private CharSequence tokenEndpoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-userinfoendpoint
     * 
     */
    @JsonProperty("UserInfoEndpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-userinfoendpoint")
    private CharSequence userInfoEndpoint;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authenticationrequestextraparams
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getAuthenticationRequestExtraParams() {
        return authenticationRequestExtraParams;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authenticationrequestextraparams
     * 
     */
    @JsonIgnore
    public void setAuthenticationRequestExtraParams(Map<String, CharSequence> authenticationRequestExtraParams) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
    }

    public ListenerAuthenticateOidcConfig withAuthenticationRequestExtraParams(Map<String, CharSequence> authenticationRequestExtraParams) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authorizationendpoint
     * 
     */
    @JsonIgnore
    public CharSequence getAuthorizationEndpoint() {
        return authorizationEndpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-authorizationendpoint
     * 
     */
    @JsonIgnore
    public void setAuthorizationEndpoint(CharSequence authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    public ListenerAuthenticateOidcConfig withAuthorizationEndpoint(CharSequence authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientid
     * 
     */
    @JsonIgnore
    public CharSequence getClientId() {
        return clientId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientid
     * 
     */
    @JsonIgnore
    public void setClientId(CharSequence clientId) {
        this.clientId = clientId;
    }

    public ListenerAuthenticateOidcConfig withClientId(CharSequence clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientsecret
     * 
     */
    @JsonIgnore
    public CharSequence getClientSecret() {
        return clientSecret;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-clientsecret
     * 
     */
    @JsonIgnore
    public void setClientSecret(CharSequence clientSecret) {
        this.clientSecret = clientSecret;
    }

    public ListenerAuthenticateOidcConfig withClientSecret(CharSequence clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-issuer
     * 
     */
    @JsonIgnore
    public CharSequence getIssuer() {
        return issuer;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-issuer
     * 
     */
    @JsonIgnore
    public void setIssuer(CharSequence issuer) {
        this.issuer = issuer;
    }

    public ListenerAuthenticateOidcConfig withIssuer(CharSequence issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-onunauthenticatedrequest
     * 
     */
    @JsonIgnore
    public CharSequence getOnUnauthenticatedRequest() {
        return onUnauthenticatedRequest;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-onunauthenticatedrequest
     * 
     */
    @JsonIgnore
    public void setOnUnauthenticatedRequest(CharSequence onUnauthenticatedRequest) {
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
    }

    public ListenerAuthenticateOidcConfig withOnUnauthenticatedRequest(CharSequence onUnauthenticatedRequest) {
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-scope
     * 
     */
    @JsonIgnore
    public CharSequence getScope() {
        return scope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-scope
     * 
     */
    @JsonIgnore
    public void setScope(CharSequence scope) {
        this.scope = scope;
    }

    public ListenerAuthenticateOidcConfig withScope(CharSequence scope) {
        this.scope = scope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessioncookiename
     * 
     */
    @JsonIgnore
    public CharSequence getSessionCookieName() {
        return sessionCookieName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessioncookiename
     * 
     */
    @JsonIgnore
    public void setSessionCookieName(CharSequence sessionCookieName) {
        this.sessionCookieName = sessionCookieName;
    }

    public ListenerAuthenticateOidcConfig withSessionCookieName(CharSequence sessionCookieName) {
        this.sessionCookieName = sessionCookieName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessiontimeout
     * 
     */
    @JsonIgnore
    public Number getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-sessiontimeout
     * 
     */
    @JsonIgnore
    public void setSessionTimeout(Number sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public ListenerAuthenticateOidcConfig withSessionTimeout(Number sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-tokenendpoint
     * 
     */
    @JsonIgnore
    public CharSequence getTokenEndpoint() {
        return tokenEndpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-tokenendpoint
     * 
     */
    @JsonIgnore
    public void setTokenEndpoint(CharSequence tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    public ListenerAuthenticateOidcConfig withTokenEndpoint(CharSequence tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-userinfoendpoint
     * 
     */
    @JsonIgnore
    public CharSequence getUserInfoEndpoint() {
        return userInfoEndpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listener-authenticateoidcconfig-userinfoendpoint
     * 
     */
    @JsonIgnore
    public void setUserInfoEndpoint(CharSequence userInfoEndpoint) {
        this.userInfoEndpoint = userInfoEndpoint;
    }

    public ListenerAuthenticateOidcConfig withUserInfoEndpoint(CharSequence userInfoEndpoint) {
        this.userInfoEndpoint = userInfoEndpoint;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("authenticationRequestExtraParams", authenticationRequestExtraParams).append("authorizationEndpoint", authorizationEndpoint).append("clientId", clientId).append("clientSecret", clientSecret).append("issuer", issuer).append("onUnauthenticatedRequest", onUnauthenticatedRequest).append("scope", scope).append("sessionCookieName", sessionCookieName).append("sessionTimeout", sessionTimeout).append("tokenEndpoint", tokenEndpoint).append("userInfoEndpoint", userInfoEndpoint).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tokenEndpoint).append(onUnauthenticatedRequest).append(clientId).append(authenticationRequestExtraParams).append(scope).append(clientSecret).append(sessionTimeout).append(sessionCookieName).append(userInfoEndpoint).append(authorizationEndpoint).append(issuer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerAuthenticateOidcConfig) == false) {
            return false;
        }
        ListenerAuthenticateOidcConfig rhs = ((ListenerAuthenticateOidcConfig) other);
        return new EqualsBuilder().append(tokenEndpoint, rhs.tokenEndpoint).append(onUnauthenticatedRequest, rhs.onUnauthenticatedRequest).append(clientId, rhs.clientId).append(authenticationRequestExtraParams, rhs.authenticationRequestExtraParams).append(scope, rhs.scope).append(clientSecret, rhs.clientSecret).append(sessionTimeout, rhs.sessionTimeout).append(sessionCookieName, rhs.sessionCookieName).append(userInfoEndpoint, rhs.userInfoEndpoint).append(authorizationEndpoint, rhs.authorizationEndpoint).append(issuer, rhs.issuer).isEquals();
    }

}
