
package shiver.me.timbers.aws.elasticloadbalancingv2;

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
 * ListenerAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html
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
public class ListenerAction implements Property<ListenerAction>
{

    /**
     * ListenerAuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html
     * 
     */
    @JsonProperty("AuthenticateCognitoConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html")
    private Property<ListenerAuthenticateCognitoConfig> authenticateCognitoConfig;
    /**
     * ListenerRuleAuthenticateOidcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html
     * 
     */
    @JsonProperty("AuthenticateOidcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html")
    private Property<ListenerAuthenticateOidcConfig> authenticateOidcConfig;
    /**
     * ListenerRuleFixedResponseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html
     * 
     */
    @JsonProperty("FixedResponseConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html")
    private Property<ListenerFixedResponseConfig> fixedResponseConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-action-order
     * 
     */
    @JsonProperty("Order")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-action-order")
    private Number order;
    /**
     * ListenerRedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html
     * 
     */
    @JsonProperty("RedirectConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html")
    private Property<ListenerRedirectConfig> redirectConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn
     * 
     */
    @JsonProperty("TargetGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn")
    private CharSequence targetGroupArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type")
    private CharSequence type;

    /**
     * ListenerAuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerAuthenticateCognitoConfig> getAuthenticateCognitoConfig() {
        return authenticateCognitoConfig;
    }

    /**
     * ListenerAuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html
     * 
     */
    @JsonIgnore
    public void setAuthenticateCognitoConfig(Property<ListenerAuthenticateCognitoConfig> authenticateCognitoConfig) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
    }

    public ListenerAction withAuthenticateCognitoConfig(Property<ListenerAuthenticateCognitoConfig> authenticateCognitoConfig) {
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
    public Property<ListenerAuthenticateOidcConfig> getAuthenticateOidcConfig() {
        return authenticateOidcConfig;
    }

    /**
     * ListenerRuleAuthenticateOidcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html
     * 
     */
    @JsonIgnore
    public void setAuthenticateOidcConfig(Property<ListenerAuthenticateOidcConfig> authenticateOidcConfig) {
        this.authenticateOidcConfig = authenticateOidcConfig;
    }

    public ListenerAction withAuthenticateOidcConfig(Property<ListenerAuthenticateOidcConfig> authenticateOidcConfig) {
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
    public Property<ListenerFixedResponseConfig> getFixedResponseConfig() {
        return fixedResponseConfig;
    }

    /**
     * ListenerRuleFixedResponseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html
     * 
     */
    @JsonIgnore
    public void setFixedResponseConfig(Property<ListenerFixedResponseConfig> fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
    }

    public ListenerAction withFixedResponseConfig(Property<ListenerFixedResponseConfig> fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-action-order
     * 
     */
    @JsonIgnore
    public Number getOrder() {
        return order;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-action-order
     * 
     */
    @JsonIgnore
    public void setOrder(Number order) {
        this.order = order;
    }

    public ListenerAction withOrder(Number order) {
        this.order = order;
        return this;
    }

    /**
     * ListenerRedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html
     * 
     */
    @JsonIgnore
    public Property<ListenerRedirectConfig> getRedirectConfig() {
        return redirectConfig;
    }

    /**
     * ListenerRedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html
     * 
     */
    @JsonIgnore
    public void setRedirectConfig(Property<ListenerRedirectConfig> redirectConfig) {
        this.redirectConfig = redirectConfig;
    }

    public ListenerAction withRedirectConfig(Property<ListenerRedirectConfig> redirectConfig) {
        this.redirectConfig = redirectConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn
     * 
     */
    @JsonIgnore
    public CharSequence getTargetGroupArn() {
        return targetGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn
     * 
     */
    @JsonIgnore
    public void setTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    public ListenerAction withTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ListenerAction withType(CharSequence type) {
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
        if ((other instanceof ListenerAction) == false) {
            return false;
        }
        ListenerAction rhs = ((ListenerAction) other);
        return new EqualsBuilder().append(fixedResponseConfig, rhs.fixedResponseConfig).append(authenticateOidcConfig, rhs.authenticateOidcConfig).append(targetGroupArn, rhs.targetGroupArn).append(authenticateCognitoConfig, rhs.authenticateCognitoConfig).append(redirectConfig, rhs.redirectConfig).append(type, rhs.type).append(order, rhs.order).isEquals();
    }

}
