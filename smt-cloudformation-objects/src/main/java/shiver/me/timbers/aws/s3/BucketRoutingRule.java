
package shiver.me.timbers.aws.s3;

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
 * BucketRoutingRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RedirectRule",
    "RoutingRuleCondition"
})
public class BucketRoutingRule implements Property<BucketRoutingRule>
{

    /**
     * BucketRedirectRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
     * 
     */
    @JsonProperty("RedirectRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html")
    private Property<BucketRedirectRule> redirectRule;
    /**
     * BucketRoutingRuleCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
     * 
     */
    @JsonProperty("RoutingRuleCondition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html")
    private Property<BucketRoutingRuleCondition> routingRuleCondition;

    /**
     * BucketRedirectRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
     * 
     */
    @JsonIgnore
    public Property<BucketRedirectRule> getRedirectRule() {
        return redirectRule;
    }

    /**
     * BucketRedirectRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-redirectrule.html
     * 
     */
    @JsonIgnore
    public void setRedirectRule(Property<BucketRedirectRule> redirectRule) {
        this.redirectRule = redirectRule;
    }

    public BucketRoutingRule withRedirectRule(Property<BucketRedirectRule> redirectRule) {
        this.redirectRule = redirectRule;
        return this;
    }

    /**
     * BucketRoutingRuleCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
     * 
     */
    @JsonIgnore
    public Property<BucketRoutingRuleCondition> getRoutingRuleCondition() {
        return routingRuleCondition;
    }

    /**
     * BucketRoutingRuleCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules-routingrulecondition.html
     * 
     */
    @JsonIgnore
    public void setRoutingRuleCondition(Property<BucketRoutingRuleCondition> routingRuleCondition) {
        this.routingRuleCondition = routingRuleCondition;
    }

    public BucketRoutingRule withRoutingRuleCondition(Property<BucketRoutingRuleCondition> routingRuleCondition) {
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
        if ((other instanceof BucketRoutingRule) == false) {
            return false;
        }
        BucketRoutingRule rhs = ((BucketRoutingRule) other);
        return new EqualsBuilder().append(redirectRule, rhs.redirectRule).append(routingRuleCondition, rhs.routingRuleCondition).isEquals();
    }

}
