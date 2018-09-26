
package aws.elasticloadbalancingv2;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ListenerRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Actions",
    "Conditions",
    "ListenerArn",
    "Priority"
})
public class ListenerRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions
     * 
     */
    @JsonProperty("Actions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions")
    private Set<Action> actions = new LinkedHashSet<Action>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions
     * 
     */
    @JsonProperty("Conditions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions")
    private Set<RuleCondition> conditions = new LinkedHashSet<RuleCondition>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn
     * 
     */
    @JsonProperty("ListenerArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn")
    private CharSequence listenerArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority")
    private Integer priority;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions
     * 
     */
    public Set<Action> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions
     * 
     */
    public void setActions(Set<Action> actions) {
        this.actions = actions;
    }

    public ListenerRule withActions(Set<Action> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions
     * 
     */
    public Set<RuleCondition> getConditions() {
        return conditions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions
     * 
     */
    public void setConditions(Set<RuleCondition> conditions) {
        this.conditions = conditions;
    }

    public ListenerRule withConditions(Set<RuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn
     * 
     */
    public CharSequence getListenerArn() {
        return listenerArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn
     * 
     */
    public void setListenerArn(CharSequence listenerArn) {
        this.listenerArn = listenerArn;
    }

    public ListenerRule withListenerArn(CharSequence listenerArn) {
        this.listenerArn = listenerArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority
     * 
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority
     * 
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ListenerRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actions", actions).append("conditions", conditions).append("listenerArn", listenerArn).append("priority", priority).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(conditions).append(priority).append(actions).append(listenerArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerRule) == false) {
            return false;
        }
        ListenerRule rhs = ((ListenerRule) other);
        return new EqualsBuilder().append(conditions, rhs.conditions).append(priority, rhs.priority).append(actions, rhs.actions).append(listenerArn, rhs.listenerArn).isEquals();
    }

}
