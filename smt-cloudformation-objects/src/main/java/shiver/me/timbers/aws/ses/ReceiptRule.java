
package shiver.me.timbers.aws.ses;

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
 * ReceiptRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
     * ReceiptRuleRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html
     * 
     */
    @JsonProperty("Rule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html")
    private Property<ReceiptRuleRule> rule;
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
    @JsonIgnore
    public CharSequence getAfter() {
        return after;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after
     * 
     */
    @JsonIgnore
    public void setAfter(CharSequence after) {
        this.after = after;
    }

    public ReceiptRule withAfter(CharSequence after) {
        this.after = after;
        return this;
    }

    /**
     * ReceiptRuleRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html
     * 
     */
    @JsonIgnore
    public Property<ReceiptRuleRule> getRule() {
        return rule;
    }

    /**
     * ReceiptRuleRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-rule.html
     * 
     */
    @JsonIgnore
    public void setRule(Property<ReceiptRuleRule> rule) {
        this.rule = rule;
    }

    public ReceiptRule withRule(Property<ReceiptRuleRule> rule) {
        this.rule = rule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname
     * 
     */
    @JsonIgnore
    public CharSequence getRuleSetName() {
        return ruleSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname
     * 
     */
    @JsonIgnore
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
