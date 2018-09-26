
package aws.waf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ActivatedRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Action",
    "Priority",
    "RuleId"
})
public class ActivatedRule {

    /**
     * WafAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html")
    private WafAction action;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-priority")
    private Integer priority;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-ruleid
     * 
     */
    @JsonProperty("RuleId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-ruleid")
    private CharSequence ruleId;

    /**
     * WafAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html
     * 
     */
    public WafAction getAction() {
        return action;
    }

    /**
     * WafAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-action.html
     * 
     */
    public void setAction(WafAction action) {
        this.action = action;
    }

    public ActivatedRule withAction(WafAction action) {
        this.action = action;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-priority
     * 
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-priority
     * 
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ActivatedRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-ruleid
     * 
     */
    public CharSequence getRuleId() {
        return ruleId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-rules.html#cfn-waf-webacl-rules-ruleid
     * 
     */
    public void setRuleId(CharSequence ruleId) {
        this.ruleId = ruleId;
    }

    public ActivatedRule withRuleId(CharSequence ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("action", action).append("priority", priority).append("ruleId", ruleId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(action).append(priority).append(ruleId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActivatedRule) == false) {
            return false;
        }
        ActivatedRule rhs = ((ActivatedRule) other);
        return new EqualsBuilder().append(action, rhs.action).append(priority, rhs.priority).append(ruleId, rhs.ruleId).isEquals();
    }

}
