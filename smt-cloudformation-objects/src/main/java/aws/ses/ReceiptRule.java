
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ReceiptRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "After",
    "Rule",
    "RuleSetName"
})
public class ReceiptRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after
     * 
     */
    @JsonProperty("After")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after")
    private CharSequence after;
    /**
     * Rule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html
     * 
     */
    @JsonProperty("Rule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html")
    private Rule rule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname
     * 
     */
    @JsonProperty("RuleSetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname")
    private CharSequence ruleSetName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after
     * 
     */
    public CharSequence getAfter() {
        return after;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after
     * 
     */
    public void setAfter(CharSequence after) {
        this.after = after;
    }

    public ReceiptRule withAfter(CharSequence after) {
        this.after = after;
        return this;
    }

    /**
     * Rule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html
     * 
     */
    public Rule getRule() {
        return rule;
    }

    /**
     * Rule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html
     * 
     */
    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public ReceiptRule withRule(Rule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname
     * 
     */
    public CharSequence getRuleSetName() {
        return ruleSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname
     * 
     */
    public void setRuleSetName(CharSequence ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    public ReceiptRule withRuleSetName(CharSequence ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("after", after).append("rule", rule).append("ruleSetName", ruleSetName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rule).append(after).append(ruleSetName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptRule) == false) {
            return false;
        }
        ReceiptRule rhs = ((ReceiptRule) other);
        return new EqualsBuilder().append(rule, rhs.rule).append(after, rhs.after).append(ruleSetName, rhs.ruleSetName).isEquals();
    }

}
