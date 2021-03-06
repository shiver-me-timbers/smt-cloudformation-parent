
package shiver.me.timbers.aws.events;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * Rule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "EventBusName",
    "EventPattern",
    "Name",
    "RoleArn",
    "ScheduleExpression",
    "State",
    "Targets"
})
public class Rule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventbusname
     * 
     */
    @JsonProperty("EventBusName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventbusname")
    private CharSequence eventBusName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern
     * 
     */
    @JsonProperty("EventPattern")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern")
    private Object eventPattern;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression
     * 
     */
    @JsonProperty("ScheduleExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression")
    private CharSequence scheduleExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state
     * 
     */
    @JsonProperty("State")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state")
    private CharSequence state;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets
     * 
     */
    @JsonProperty("Targets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets")
    private Set<Property<RuleTarget>> targets = new LinkedHashSet<Property<RuleTarget>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Rule withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventbusname
     * 
     */
    @JsonIgnore
    public CharSequence getEventBusName() {
        return eventBusName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventbusname
     * 
     */
    @JsonIgnore
    public void setEventBusName(CharSequence eventBusName) {
        this.eventBusName = eventBusName;
    }

    public Rule withEventBusName(CharSequence eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern
     * 
     */
    @JsonIgnore
    public Object getEventPattern() {
        return eventPattern;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern
     * 
     */
    @JsonIgnore
    public void setEventPattern(Object eventPattern) {
        this.eventPattern = eventPattern;
    }

    public Rule withEventPattern(Object eventPattern) {
        this.eventPattern = eventPattern;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Rule withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public Rule withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression
     * 
     */
    @JsonIgnore
    public CharSequence getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression
     * 
     */
    @JsonIgnore
    public void setScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    public Rule withScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state
     * 
     */
    @JsonIgnore
    public CharSequence getState() {
        return state;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state
     * 
     */
    @JsonIgnore
    public void setState(CharSequence state) {
        this.state = state;
    }

    public Rule withState(CharSequence state) {
        this.state = state;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets
     * 
     */
    @JsonIgnore
    public Set<Property<RuleTarget>> getTargets() {
        return targets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets
     * 
     */
    @JsonIgnore
    public void setTargets(Set<Property<RuleTarget>> targets) {
        this.targets = targets;
    }

    public Rule withTargets(Set<Property<RuleTarget>> targets) {
        this.targets = targets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("eventBusName", eventBusName).append("eventPattern", eventPattern).append("name", name).append("roleArn", roleArn).append("scheduleExpression", scheduleExpression).append("state", state).append("targets", targets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scheduleExpression).append(roleArn).append(eventBusName).append(name).append(description).append(state).append(eventPattern).append(targets).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rule) == false) {
            return false;
        }
        Rule rhs = ((Rule) other);
        return new EqualsBuilder().append(scheduleExpression, rhs.scheduleExpression).append(roleArn, rhs.roleArn).append(eventBusName, rhs.eventBusName).append(name, rhs.name).append(description, rhs.description).append(state, rhs.state).append(eventPattern, rhs.eventPattern).append(targets, rhs.targets).isEquals();
    }

}
