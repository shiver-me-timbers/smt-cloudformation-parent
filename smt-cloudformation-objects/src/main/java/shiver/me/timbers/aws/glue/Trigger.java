
package shiver.me.timbers.aws.glue;

import java.util.ArrayList;
import java.util.List;
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
 * Trigger
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "StartOnCreation",
    "Description",
    "Actions",
    "WorkflowName",
    "Schedule",
    "Tags",
    "Name",
    "Predicate"
})
public class Trigger {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation
     * 
     */
    @JsonProperty("StartOnCreation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation")
    private CharSequence startOnCreation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions
     * 
     */
    @JsonProperty("Actions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions")
    private List<Property<TriggerAction>> actions = new ArrayList<Property<TriggerAction>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname
     * 
     */
    @JsonProperty("WorkflowName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname")
    private CharSequence workflowName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule")
    private CharSequence schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name")
    private CharSequence name;
    /**
     * TriggerPredicate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
     * 
     */
    @JsonProperty("Predicate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html")
    private Property<TriggerPredicate> predicate;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Trigger withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation
     * 
     */
    @JsonIgnore
    public CharSequence getStartOnCreation() {
        return startOnCreation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation
     * 
     */
    @JsonIgnore
    public void setStartOnCreation(CharSequence startOnCreation) {
        this.startOnCreation = startOnCreation;
    }

    public Trigger withStartOnCreation(CharSequence startOnCreation) {
        this.startOnCreation = startOnCreation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Trigger withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions
     * 
     */
    @JsonIgnore
    public List<Property<TriggerAction>> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions
     * 
     */
    @JsonIgnore
    public void setActions(List<Property<TriggerAction>> actions) {
        this.actions = actions;
    }

    public Trigger withActions(List<Property<TriggerAction>> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname
     * 
     */
    @JsonIgnore
    public CharSequence getWorkflowName() {
        return workflowName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname
     * 
     */
    @JsonIgnore
    public void setWorkflowName(CharSequence workflowName) {
        this.workflowName = workflowName;
    }

    public Trigger withWorkflowName(CharSequence workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule
     * 
     */
    @JsonIgnore
    public CharSequence getSchedule() {
        return schedule;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule
     * 
     */
    @JsonIgnore
    public void setSchedule(CharSequence schedule) {
        this.schedule = schedule;
    }

    public Trigger withSchedule(CharSequence schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Trigger withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Trigger withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * TriggerPredicate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
     * 
     */
    @JsonIgnore
    public Property<TriggerPredicate> getPredicate() {
        return predicate;
    }

    /**
     * TriggerPredicate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
     * 
     */
    @JsonIgnore
    public void setPredicate(Property<TriggerPredicate> predicate) {
        this.predicate = predicate;
    }

    public Trigger withPredicate(Property<TriggerPredicate> predicate) {
        this.predicate = predicate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("startOnCreation", startOnCreation).append("description", description).append("actions", actions).append("workflowName", workflowName).append("schedule", schedule).append("tags", tags).append("name", name).append("predicate", predicate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schedule).append(predicate).append(name).append(description).append(workflowName).append(type).append(actions).append(startOnCreation).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trigger) == false) {
            return false;
        }
        Trigger rhs = ((Trigger) other);
        return new EqualsBuilder().append(schedule, rhs.schedule).append(predicate, rhs.predicate).append(name, rhs.name).append(description, rhs.description).append(workflowName, rhs.workflowName).append(type, rhs.type).append(actions, rhs.actions).append(startOnCreation, rhs.startOnCreation).append(tags, rhs.tags).isEquals();
    }

}
