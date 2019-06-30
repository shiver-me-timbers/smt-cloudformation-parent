
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
 * ListenerAuthenticateCognitoConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AuthenticationRequestExtraParams",
    "OnUnauthenticatedRequest",
    "Scope",
    "SessionCookieName",
    "SessionTimeout",
    "UserPoolArn",
    "UserPoolClientId",
    "UserPoolDomain"
})
public class ListenerAuthenticateCognitoConfig implements Property<ListenerAuthenticateCognitoConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-authenticationrequestextraparams
     * 
     */
    @JsonProperty("AuthenticationRequestExtraParams")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-authenticationrequestextraparams")
    private Map<String, CharSequence> authenticationRequestExtraParams;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-onunauthenticatedrequest
     * 
     */
    @JsonProperty("OnUnauthenticatedRequest")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-onunauthenticatedrequest")
    private CharSequence onUnauthenticatedRequest;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-scope
     * 
     */
    @JsonProperty("Scope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-scope")
    private CharSequence scope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessioncookiename
     * 
     */
    @JsonProperty("SessionCookieName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessioncookiename")
    private CharSequence sessionCookieName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessiontimeout
     * 
     */
    @JsonProperty("SessionTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessiontimeout")
    private Number sessionTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolarn
     * 
     */
    @JsonProperty("UserPoolArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolarn")
    private CharSequence userPoolArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolclientid
     * 
     */
    @JsonProperty("UserPoolClientId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolclientid")
    private CharSequence userPoolClientId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpooldomain
     * 
     */
    @JsonProperty("UserPoolDomain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpooldomain")
    private CharSequence userPoolDomain;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-authenticationrequestextraparams
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getAuthenticationRequestExtraParams() {
        return authenticationRequestExtraParams;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-authenticationrequestextraparams
     * 
     */
    @JsonIgnore
    public void setAuthenticationRequestExtraParams(Map<String, CharSequence> authenticationRequestExtraParams) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
    }

    public ListenerAuthenticateCognitoConfig withAuthenticationRequestExtraParams(Map<String, CharSequence> authenticationRequestExtraParams) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-onunauthenticatedrequest
     * 
     */
    @JsonIgnore
    public CharSequence getOnUnauthenticatedRequest() {
        return onUnauthenticatedRequest;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-onunauthenticatedrequest
     * 
     */
    @JsonIgnore
    public void setOnUnauthenticatedRequest(CharSequence onUnauthenticatedRequest) {
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
    }

    public ListenerAuthenticateCognitoConfig withOnUnauthenticatedRequest(CharSequence onUnauthenticatedRequest) {
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-scope
     * 
     */
    @JsonIgnore
    public CharSequence getScope() {
        return scope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-scope
     * 
     */
    @JsonIgnore
    public void setScope(CharSequence scope) {
        this.scope = scope;
    }

    public ListenerAuthenticateCognitoConfig withScope(CharSequence scope) {
        this.scope = scope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessioncookiename
     * 
     */
    @JsonIgnore
    public CharSequence getSessionCookieName() {
        return sessionCookieName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessioncookiename
     * 
     */
    @JsonIgnore
    public void setSessionCookieName(CharSequence sessionCookieName) {
        this.sessionCookieName = sessionCookieName;
    }

    public ListenerAuthenticateCognitoConfig withSessionCookieName(CharSequence sessionCookieName) {
        this.sessionCookieName = sessionCookieName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessiontimeout
     * 
     */
    @JsonIgnore
    public Number getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-sessiontimeout
     * 
     */
    @JsonIgnore
    public void setSessionTimeout(Number sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public ListenerAuthenticateCognitoConfig withSessionTimeout(Number sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolarn
     * 
     */
    @JsonIgnore
    public CharSequence getUserPoolArn() {
        return userPoolArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolarn
     * 
     */
    @JsonIgnore
    public void setUserPoolArn(CharSequence userPoolArn) {
        this.userPoolArn = userPoolArn;
    }

    public ListenerAuthenticateCognitoConfig withUserPoolArn(CharSequence userPoolArn) {
        this.userPoolArn = userPoolArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolclientid
     * 
     */
    @JsonIgnore
    public CharSequence getUserPoolClientId() {
        return userPoolClientId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpoolclientid
     * 
     */
    @JsonIgnore
    public void setUserPoolClientId(CharSequence userPoolClientId) {
        this.userPoolClientId = userPoolClientId;
    }

    public ListenerAuthenticateCognitoConfig withUserPoolClientId(CharSequence userPoolClientId) {
        this.userPoolClientId = userPoolClientId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpooldomain
     * 
     */
    @JsonIgnore
    public CharSequence getUserPoolDomain() {
        return userPoolDomain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listener-authenticatecognitoconfig-userpooldomain
     * 
     */
    @JsonIgnore
    public void setUserPoolDomain(CharSequence userPoolDomain) {
        this.userPoolDomain = userPoolDomain;
    }

    public ListenerAuthenticateCognitoConfig withUserPoolDomain(CharSequence userPoolDomain) {
        this.userPoolDomain = userPoolDomain;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("authenticationRequestExtraParams", authenticationRequestExtraParams).append("onUnauthenticatedRequest", onUnauthenticatedRequest).append("scope", scope).append("sessionCookieName", sessionCookieName).append("sessionTimeout", sessionTimeout).append("userPoolArn", userPoolArn).append("userPoolClientId", userPoolClientId).append("userPoolDomain", userPoolDomain).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onUnauthenticatedRequest).append(userPoolArn).append(authenticationRequestExtraParams).append(userPoolClientId).append(scope).append(userPoolDomain).append(sessionTimeout).append(sessionCookieName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerAuthenticateCognitoConfig) == false) {
            return false;
        }
        ListenerAuthenticateCognitoConfig rhs = ((ListenerAuthenticateCognitoConfig) other);
        return new EqualsBuilder().append(onUnauthenticatedRequest, rhs.onUnauthenticatedRequest).append(userPoolArn, rhs.userPoolArn).append(authenticationRequestExtraParams, rhs.authenticationRequestExtraParams).append(userPoolClientId, rhs.userPoolClientId).append(scope, rhs.scope).append(userPoolDomain, rhs.userPoolDomain).append(sessionTimeout, rhs.sessionTimeout).append(sessionCookieName, rhs.sessionCookieName).isEquals();
    }

}
