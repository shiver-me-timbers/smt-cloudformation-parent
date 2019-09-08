
package shiver.me.timbers.aws.events;

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
 * EventBusPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Condition",
    "Action",
    "StatementId",
    "Principal"
})
public class EventBusPolicy {

    /**
     * EventBusPolicyCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html
     * 
     */
    @JsonProperty("Condition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html")
    private Property<EventBusPolicyCondition> condition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action")
    private CharSequence action;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statementid
     * 
     */
    @JsonProperty("StatementId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statementid")
    private CharSequence statementId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-principal
     * 
     */
    @JsonProperty("Principal")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-principal")
    private CharSequence principal;

    /**
     * EventBusPolicyCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html
     * 
     */
    @JsonIgnore
    public Property<EventBusPolicyCondition> getCondition() {
        return condition;
    }

    /**
     * EventBusPolicyCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html
     * 
     */
    @JsonIgnore
    public void setCondition(Property<EventBusPolicyCondition> condition) {
        this.condition = condition;
    }

    public EventBusPolicy withCondition(Property<EventBusPolicyCondition> condition) {
        this.condition = condition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action
     * 
     */
    @JsonIgnore
    public CharSequence getAction() {
        return action;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-action
     * 
     */
    @JsonIgnore
    public void setAction(CharSequence action) {
        this.action = action;
    }

    public EventBusPolicy withAction(CharSequence action) {
        this.action = action;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statementid
     * 
     */
    @JsonIgnore
    public CharSequence getStatementId() {
        return statementId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-statementid
     * 
     */
    @JsonIgnore
    public void setStatementId(CharSequence statementId) {
        this.statementId = statementId;
    }

    public EventBusPolicy withStatementId(CharSequence statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-principal
     * 
     */
    @JsonIgnore
    public CharSequence getPrincipal() {
        return principal;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-eventbuspolicy.html#cfn-events-eventbuspolicy-principal
     * 
     */
    @JsonIgnore
    public void setPrincipal(CharSequence principal) {
        this.principal = principal;
    }

    public EventBusPolicy withPrincipal(CharSequence principal) {
        this.principal = principal;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("condition", condition).append("action", action).append("statementId", statementId).append("principal", principal).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statementId).append(principal).append(action).append(condition).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventBusPolicy) == false) {
            return false;
        }
        EventBusPolicy rhs = ((EventBusPolicy) other);
        return new EqualsBuilder().append(statementId, rhs.statementId).append(principal, rhs.principal).append(action, rhs.action).append(condition, rhs.condition).isEquals();
    }

}
