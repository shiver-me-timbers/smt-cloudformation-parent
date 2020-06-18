
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
 * WebACLRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Name",
    "Priority",
    "Statement",
    "Action",
    "OverrideAction",
    "VisibilityConfig"
})
public class WebACLRule implements Property<WebACLRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-priority")
    private Number priority;
    /**
     * WebACLStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementone.html
     * 
     */
    @JsonProperty("Statement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementone.html")
    private Property<WebACLStatementOne> statement;
    /**
     * WebACLRuleAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html")
    private Property<WebACLRuleAction> action;
    /**
     * WebACLOverrideAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html
     * 
     */
    @JsonProperty("OverrideAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html")
    private Property<WebACLOverrideAction> overrideAction;
    /**
     * WebACLVisibilityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html
     * 
     */
    @JsonProperty("VisibilityConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html")
    private Property<WebACLVisibilityConfig> visibilityConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public WebACLRule withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-priority
     * 
     */
    @JsonIgnore
    public Number getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html#cfn-wafv2-webacl-rule-priority
     * 
     */
    @JsonIgnore
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    public WebACLRule withPriority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * WebACLStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementone.html
     * 
     */
    @JsonIgnore
    public Property<WebACLStatementOne> getStatement() {
        return statement;
    }

    /**
     * WebACLStatementOne
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statementone.html
     * 
     */
    @JsonIgnore
    public void setStatement(Property<WebACLStatementOne> statement) {
        this.statement = statement;
    }

    public WebACLRule withStatement(Property<WebACLStatementOne> statement) {
        this.statement = statement;
        return this;
    }

    /**
     * WebACLRuleAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html
     * 
     */
    @JsonIgnore
    public Property<WebACLRuleAction> getAction() {
        return action;
    }

    /**
     * WebACLRuleAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html
     * 
     */
    @JsonIgnore
    public void setAction(Property<WebACLRuleAction> action) {
        this.action = action;
    }

    public WebACLRule withAction(Property<WebACLRuleAction> action) {
        this.action = action;
        return this;
    }

    /**
     * WebACLOverrideAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html
     * 
     */
    @JsonIgnore
    public Property<WebACLOverrideAction> getOverrideAction() {
        return overrideAction;
    }

    /**
     * WebACLOverrideAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html
     * 
     */
    @JsonIgnore
    public void setOverrideAction(Property<WebACLOverrideAction> overrideAction) {
        this.overrideAction = overrideAction;
    }

    public WebACLRule withOverrideAction(Property<WebACLOverrideAction> overrideAction) {
        this.overrideAction = overrideAction;
        return this;
    }

    /**
     * WebACLVisibilityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html
     * 
     */
    @JsonIgnore
    public Property<WebACLVisibilityConfig> getVisibilityConfig() {
        return visibilityConfig;
    }

    /**
     * WebACLVisibilityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html
     * 
     */
    @JsonIgnore
    public void setVisibilityConfig(Property<WebACLVisibilityConfig> visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
    }

    public WebACLRule withVisibilityConfig(Property<WebACLVisibilityConfig> visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("priority", priority).append("statement", statement).append("action", action).append("overrideAction", overrideAction).append("visibilityConfig", visibilityConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(overrideAction).append(visibilityConfig).append(name).append(statement).append(action).append(priority).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLRule) == false) {
            return false;
        }
        WebACLRule rhs = ((WebACLRule) other);
        return new EqualsBuilder().append(overrideAction, rhs.overrideAction).append(visibilityConfig, rhs.visibilityConfig).append(name, rhs.name).append(statement, rhs.statement).append(action, rhs.action).append(priority, rhs.priority).isEquals();
    }

}
