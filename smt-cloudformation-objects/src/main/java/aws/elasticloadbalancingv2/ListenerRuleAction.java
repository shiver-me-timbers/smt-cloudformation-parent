
package aws.elasticloadbalancingv2;

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
 * ListenerRuleAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AuthenticateCognitoConfig",
    "AuthenticateOidcConfig",
    "FixedResponseConfig",
    "Order",
    "RedirectConfig",
    "TargetGroupArn",
    "Type"
})
public class ListenerRuleAction implements Property<ListenerRuleAction>
{

    /**
     * ListenerRuleAuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html
     * 
     */
    @JsonProperty("AuthenticateCognitoConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html")
    private Property<ListenerRuleAuthenticateCognitoConfig> authenticateCognitoConfig;
    /**
     * ListenerRuleAuthenticateOidcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html
     * 
     */
    @JsonProperty("AuthenticateOidcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html")
    private Property<ListenerRuleAuthenticateOidcConfig> authenticateOidcConfig;
    /**
     * ListenerRuleFixedResponseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html
     * 
     */
    @JsonProperty("FixedResponseConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html")
    private Property<ListenerRuleFixedResponseConfig> fixedResponseConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listenerrule-action-order
     * 
     */
    @JsonProperty("Order")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listenerrule-action-order")
    private Number order;
    /**
     * ListenerRuleRedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html
     * 
     */
    @JsonProperty("RedirectConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html")
    private Property<ListenerRuleRedirectConfig> redirectConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-targetgrouparn
     * 
     */
    @JsonProperty("TargetGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-targetgrouparn")
    private CharSequence targetGroupArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-type")
    private CharSequence type;

    /**
     * ListenerRuleAuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleAuthenticateCognitoConfig> getAuthenticateCognitoConfig() {
        return authenticateCognitoConfig;
    }

    /**
     * ListenerRuleAuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html
     * 
     */
    @JsonIgnore
    public void setAuthenticateCognitoConfig(Property<ListenerRuleAuthenticateCognitoConfig> authenticateCognitoConfig) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
    }

    public ListenerRuleAction withAuthenticateCognitoConfig(Property<ListenerRuleAuthenticateCognitoConfig> authenticateCognitoConfig) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
        return this;
    }

    /**
     * ListenerRuleAuthenticateOidcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleAuthenticateOidcConfig> getAuthenticateOidcConfig() {
        return authenticateOidcConfig;
    }

    /**
     * ListenerRuleAuthenticateOidcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html
     * 
     */
    @JsonIgnore
    public void setAuthenticateOidcConfig(Property<ListenerRuleAuthenticateOidcConfig> authenticateOidcConfig) {
        this.authenticateOidcConfig = authenticateOidcConfig;
    }

    public ListenerRuleAction withAuthenticateOidcConfig(Property<ListenerRuleAuthenticateOidcConfig> authenticateOidcConfig) {
        this.authenticateOidcConfig = authenticateOidcConfig;
        return this;
    }

    /**
     * ListenerRuleFixedResponseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleFixedResponseConfig> getFixedResponseConfig() {
        return fixedResponseConfig;
    }

    /**
     * ListenerRuleFixedResponseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html
     * 
     */
    @JsonIgnore
    public void setFixedResponseConfig(Property<ListenerRuleFixedResponseConfig> fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
    }

    public ListenerRuleAction withFixedResponseConfig(Property<ListenerRuleFixedResponseConfig> fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listenerrule-action-order
     * 
     */
    @JsonIgnore
    public Number getOrder() {
        return order;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listenerrule-action-order
     * 
     */
    @JsonIgnore
    public void setOrder(Number order) {
        this.order = order;
    }

    public ListenerRuleAction withOrder(Number order) {
        this.order = order;
        return this;
    }

    /**
     * ListenerRuleRedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRuleRedirectConfig> getRedirectConfig() {
        return redirectConfig;
    }

    /**
     * ListenerRuleRedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html
     * 
     */
    @JsonIgnore
    public void setRedirectConfig(Property<ListenerRuleRedirectConfig> redirectConfig) {
        this.redirectConfig = redirectConfig;
    }

    public ListenerRuleAction withRedirectConfig(Property<ListenerRuleRedirectConfig> redirectConfig) {
        this.redirectConfig = redirectConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-targetgrouparn
     * 
     */
    @JsonIgnore
    public CharSequence getTargetGroupArn() {
        return targetGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-targetgrouparn
     * 
     */
    @JsonIgnore
    public void setTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    public ListenerRuleAction withTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-actions.html#cfn-elasticloadbalancingv2-listener-actions-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ListenerRuleAction withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("authenticateCognitoConfig", authenticateCognitoConfig).append("authenticateOidcConfig", authenticateOidcConfig).append("fixedResponseConfig", fixedResponseConfig).append("order", order).append("redirectConfig", redirectConfig).append("targetGroupArn", targetGroupArn).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fixedResponseConfig).append(authenticateOidcConfig).append(targetGroupArn).append(authenticateCognitoConfig).append(redirectConfig).append(type).append(order).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerRuleAction) == false) {
            return false;
        }
        ListenerRuleAction rhs = ((ListenerRuleAction) other);
        return new EqualsBuilder().append(fixedResponseConfig, rhs.fixedResponseConfig).append(authenticateOidcConfig, rhs.authenticateOidcConfig).append(targetGroupArn, rhs.targetGroupArn).append(authenticateCognitoConfig, rhs.authenticateCognitoConfig).append(redirectConfig, rhs.redirectConfig).append(type, rhs.type).append(order, rhs.order).isEquals();
    }

}
