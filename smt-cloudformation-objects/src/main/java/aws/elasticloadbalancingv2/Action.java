
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
 * Action
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
public class Action implements Property<Action>
{

    /**
     * AuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html
     * 
     */
    @JsonProperty("AuthenticateCognitoConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html")
    private Property<AuthenticateCognitoConfig> authenticateCognitoConfig;
    /**
     * AuthenticateOidcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html
     * 
     */
    @JsonProperty("AuthenticateOidcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html")
    private Property<AuthenticateOidcConfig> authenticateOidcConfig;
    /**
     * FixedResponseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html
     * 
     */
    @JsonProperty("FixedResponseConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html")
    private Property<FixedResponseConfig> fixedResponseConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-action-order
     * 
     */
    @JsonProperty("Order")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-action-order")
    private Integer order;
    /**
     * RedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html
     * 
     */
    @JsonProperty("RedirectConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html")
    private Property<RedirectConfig> redirectConfig;
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
     * AuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html
     * 
     */
    @JsonIgnore
    public Property<AuthenticateCognitoConfig> getAuthenticateCognitoConfig() {
        return authenticateCognitoConfig;
    }

    /**
     * AuthenticateCognitoConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-authenticatecognitoconfig.html
     * 
     */
    @JsonIgnore
    public void setAuthenticateCognitoConfig(Property<AuthenticateCognitoConfig> authenticateCognitoConfig) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
    }

    public Action withAuthenticateCognitoConfig(Property<AuthenticateCognitoConfig> authenticateCognitoConfig) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
        return this;
    }

    /**
     * AuthenticateOidcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html
     * 
     */
    @JsonIgnore
    public Property<AuthenticateOidcConfig> getAuthenticateOidcConfig() {
        return authenticateOidcConfig;
    }

    /**
     * AuthenticateOidcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html
     * 
     */
    @JsonIgnore
    public void setAuthenticateOidcConfig(Property<AuthenticateOidcConfig> authenticateOidcConfig) {
        this.authenticateOidcConfig = authenticateOidcConfig;
    }

    public Action withAuthenticateOidcConfig(Property<AuthenticateOidcConfig> authenticateOidcConfig) {
        this.authenticateOidcConfig = authenticateOidcConfig;
        return this;
    }

    /**
     * FixedResponseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html
     * 
     */
    @JsonIgnore
    public Property<FixedResponseConfig> getFixedResponseConfig() {
        return fixedResponseConfig;
    }

    /**
     * FixedResponseConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html
     * 
     */
    @JsonIgnore
    public void setFixedResponseConfig(Property<FixedResponseConfig> fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
    }

    public Action withFixedResponseConfig(Property<FixedResponseConfig> fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-action-order
     * 
     */
    @JsonIgnore
    public Integer getOrder() {
        return order;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-action-order
     * 
     */
    @JsonIgnore
    public void setOrder(Integer order) {
        this.order = order;
    }

    public Action withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * RedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html
     * 
     */
    @JsonIgnore
    public Property<RedirectConfig> getRedirectConfig() {
        return redirectConfig;
    }

    /**
     * RedirectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-redirectconfig.html
     * 
     */
    @JsonIgnore
    public void setRedirectConfig(Property<RedirectConfig> redirectConfig) {
        this.redirectConfig = redirectConfig;
    }

    public Action withRedirectConfig(Property<RedirectConfig> redirectConfig) {
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

    public Action withTargetGroupArn(CharSequence targetGroupArn) {
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

    public Action withType(CharSequence type) {
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
        if ((other instanceof Action) == false) {
            return false;
        }
        Action rhs = ((Action) other);
        return new EqualsBuilder().append(fixedResponseConfig, rhs.fixedResponseConfig).append(authenticateOidcConfig, rhs.authenticateOidcConfig).append(targetGroupArn, rhs.targetGroupArn).append(authenticateCognitoConfig, rhs.authenticateCognitoConfig).append(redirectConfig, rhs.redirectConfig).append(type, rhs.type).append(order, rhs.order).isEquals();
    }

}
