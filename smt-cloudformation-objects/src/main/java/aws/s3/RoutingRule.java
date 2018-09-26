
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RoutingRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RedirectRule",
    "RoutingRuleCondition"
})
public class RoutingRule {

    /**
     * RedirectRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
     * 
     */
    @JsonProperty("RedirectRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html")
    private RedirectRule redirectRule;
    /**
     * RoutingRuleCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
     * 
     */
    @JsonProperty("RoutingRuleCondition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html")
    private RoutingRuleCondition routingRuleCondition;

    /**
     * RedirectRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
     * 
     */
    public RedirectRule getRedirectRule() {
        return redirectRule;
    }

    /**
     * RedirectRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
     * 
     */
    public void setRedirectRule(RedirectRule redirectRule) {
        this.redirectRule = redirectRule;
    }

    public RoutingRule withRedirectRule(RedirectRule redirectRule) {
        this.redirectRule = redirectRule;
        return this;
    }

    /**
     * RoutingRuleCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
     * 
     */
    public RoutingRuleCondition getRoutingRuleCondition() {
        return routingRuleCondition;
    }

    /**
     * RoutingRuleCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
     * 
     */
    public void setRoutingRuleCondition(RoutingRuleCondition routingRuleCondition) {
        this.routingRuleCondition = routingRuleCondition;
    }

    public RoutingRule withRoutingRuleCondition(RoutingRuleCondition routingRuleCondition) {
        this.routingRuleCondition = routingRuleCondition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("redirectRule", redirectRule).append("routingRuleCondition", routingRuleCondition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(redirectRule).append(routingRuleCondition).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoutingRule) == false) {
            return false;
        }
        RoutingRule rhs = ((RoutingRule) other);
        return new EqualsBuilder().append(redirectRule, rhs.redirectRule).append(routingRuleCondition, rhs.routingRuleCondition).isEquals();
    }

}
