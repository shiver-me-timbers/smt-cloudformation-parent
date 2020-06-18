
package shiver.me.timbers.aws.cloudwatch;

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
 * InsightRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RuleState",
    "RuleBody",
    "RuleName",
    "Tags"
})
public class InsightRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate
     * 
     */
    @JsonProperty("RuleState")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate")
    private CharSequence ruleState;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody
     * 
     */
    @JsonProperty("RuleBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody")
    private CharSequence ruleBody;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename
     * 
     */
    @JsonProperty("RuleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename")
    private CharSequence ruleName;
    /**
     * InsightRuleTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-insightrule-tags.html
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-insightrule-tags.html")
    private Property<InsightRuleTags> tags;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate
     * 
     */
    @JsonIgnore
    public CharSequence getRuleState() {
        return ruleState;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate
     * 
     */
    @JsonIgnore
    public void setRuleState(CharSequence ruleState) {
        this.ruleState = ruleState;
    }

    public InsightRule withRuleState(CharSequence ruleState) {
        this.ruleState = ruleState;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody
     * 
     */
    @JsonIgnore
    public CharSequence getRuleBody() {
        return ruleBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody
     * 
     */
    @JsonIgnore
    public void setRuleBody(CharSequence ruleBody) {
        this.ruleBody = ruleBody;
    }

    public InsightRule withRuleBody(CharSequence ruleBody) {
        this.ruleBody = ruleBody;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename
     * 
     */
    @JsonIgnore
    public CharSequence getRuleName() {
        return ruleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename
     * 
     */
    @JsonIgnore
    public void setRuleName(CharSequence ruleName) {
        this.ruleName = ruleName;
    }

    public InsightRule withRuleName(CharSequence ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * InsightRuleTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-insightrule-tags.html
     * 
     */
    @JsonIgnore
    public Property<InsightRuleTags> getTags() {
        return tags;
    }

    /**
     * InsightRuleTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-insightrule-tags.html
     * 
     */
    @JsonIgnore
    public void setTags(Property<InsightRuleTags> tags) {
        this.tags = tags;
    }

    public InsightRule withTags(Property<InsightRuleTags> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ruleState", ruleState).append("ruleBody", ruleBody).append("ruleName", ruleName).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ruleState).append(ruleName).append(ruleBody).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InsightRule) == false) {
            return false;
        }
        InsightRule rhs = ((InsightRule) other);
        return new EqualsBuilder().append(ruleState, rhs.ruleState).append(ruleName, rhs.ruleName).append(ruleBody, rhs.ruleBody).append(tags, rhs.tags).isEquals();
    }

}
