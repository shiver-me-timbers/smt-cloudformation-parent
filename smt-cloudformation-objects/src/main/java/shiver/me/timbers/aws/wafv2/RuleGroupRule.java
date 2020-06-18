
package shiver.me.timbers.aws.wafv2;

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
 * RuleGroupRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Name",
    "Priority",
    "Statement",
    "Action",
    "VisibilityConfig"
})
public class RuleGroupRule implements Property<RuleGroupRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-priority")
    private Number priority;
    /**
     * RuleGroupOrStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html
     * 
     */
    @JsonProperty("Statement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html")
    private Property<RuleGroupStatementOne> statement;
    /**
     * RuleGroupRuleAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html")
    private Property<RuleGroupRuleAction> action;
    /**
     * RuleGroupVisibilityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html
     * 
     */
    @JsonProperty("VisibilityConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html")
    private Property<RuleGroupVisibilityConfig> visibilityConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public RuleGroupRule withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-priority
     * 
     */
    @JsonIgnore
    public Number getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html#cfn-wafv2-rulegroup-rule-priority
     * 
     */
    @JsonIgnore
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    public RuleGroupRule withPriority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * RuleGroupOrStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupStatementOne> getStatement() {
        return statement;
    }

    /**
     * RuleGroupOrStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatementone.html
     * 
     */
    @JsonIgnore
    public void setStatement(Property<RuleGroupStatementOne> statement) {
        this.statement = statement;
    }

    public RuleGroupRule withStatement(Property<RuleGroupStatementOne> statement) {
        this.statement = statement;
        return this;
    }

    /**
     * RuleGroupRuleAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupRuleAction> getAction() {
        return action;
    }

    /**
     * RuleGroupRuleAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html
     * 
     */
    @JsonIgnore
    public void setAction(Property<RuleGroupRuleAction> action) {
        this.action = action;
    }

    public RuleGroupRule withAction(Property<RuleGroupRuleAction> action) {
        this.action = action;
        return this;
    }

    /**
     * RuleGroupVisibilityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupVisibilityConfig> getVisibilityConfig() {
        return visibilityConfig;
    }

    /**
     * RuleGroupVisibilityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html
     * 
     */
    @JsonIgnore
    public void setVisibilityConfig(Property<RuleGroupVisibilityConfig> visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
    }

    public RuleGroupRule withVisibilityConfig(Property<RuleGroupVisibilityConfig> visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("priority", priority).append("statement", statement).append("action", action).append("visibilityConfig", visibilityConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(statement).append(visibilityConfig).append(action).append(priority).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroupRule) == false) {
            return false;
        }
        RuleGroupRule rhs = ((RuleGroupRule) other);
        return new EqualsBuilder().append(name, rhs.name).append(statement, rhs.statement).append(visibilityConfig, rhs.visibilityConfig).append(action, rhs.action).append(priority, rhs.priority).isEquals();
    }

}
