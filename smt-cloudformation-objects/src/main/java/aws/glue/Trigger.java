
package aws.glue;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Trigger
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Description",
    "Actions",
    "Schedule",
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
    private List<Action> actions = new ArrayList<Action>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule")
    private CharSequence schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name")
    private CharSequence name;
    /**
     * Predicate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
     * 
     */
    @JsonProperty("Predicate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html")
    private Predicate predicate;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Trigger withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description
     * 
     */
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
    public List<Action> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions
     * 
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Trigger withActions(List<Action> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule
     * 
     */
    public CharSequence getSchedule() {
        return schedule;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule
     * 
     */
    public void setSchedule(CharSequence schedule) {
        this.schedule = schedule;
    }

    public Trigger withSchedule(CharSequence schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Trigger withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * Predicate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
     * 
     */
    public Predicate getPredicate() {
        return predicate;
    }

    /**
     * Predicate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
     * 
     */
    public void setPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    public Trigger withPredicate(Predicate predicate) {
        this.predicate = predicate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("description", description).append("actions", actions).append("schedule", schedule).append("name", name).append("predicate", predicate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schedule).append(predicate).append(name).append(description).append(type).append(actions).toHashCode();
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
        return new EqualsBuilder().append(schedule, rhs.schedule).append(predicate, rhs.predicate).append(name, rhs.name).append(description, rhs.description).append(type, rhs.type).append(actions, rhs.actions).isEquals();
    }

}
