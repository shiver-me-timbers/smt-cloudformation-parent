
package shiver.me.timbers.aws.iotevents;

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
 * DetectorModelTransitionEvent
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Condition",
    "Actions",
    "NextState",
    "EventName"
})
public class DetectorModelTransitionEvent implements Property<DetectorModelTransitionEvent>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-condition
     * 
     */
    @JsonProperty("Condition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-condition")
    private CharSequence condition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-actions
     * 
     */
    @JsonProperty("Actions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-actions")
    private List<Property<DetectorModelAction>> actions = new ArrayList<Property<DetectorModelAction>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-nextstate
     * 
     */
    @JsonProperty("NextState")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-nextstate")
    private CharSequence nextState;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-eventname
     * 
     */
    @JsonProperty("EventName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-eventname")
    private CharSequence eventName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-condition
     * 
     */
    @JsonIgnore
    public CharSequence getCondition() {
        return condition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-condition
     * 
     */
    @JsonIgnore
    public void setCondition(CharSequence condition) {
        this.condition = condition;
    }

    public DetectorModelTransitionEvent withCondition(CharSequence condition) {
        this.condition = condition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-actions
     * 
     */
    @JsonIgnore
    public List<Property<DetectorModelAction>> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-actions
     * 
     */
    @JsonIgnore
    public void setActions(List<Property<DetectorModelAction>> actions) {
        this.actions = actions;
    }

    public DetectorModelTransitionEvent withActions(List<Property<DetectorModelAction>> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-nextstate
     * 
     */
    @JsonIgnore
    public CharSequence getNextState() {
        return nextState;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-nextstate
     * 
     */
    @JsonIgnore
    public void setNextState(CharSequence nextState) {
        this.nextState = nextState;
    }

    public DetectorModelTransitionEvent withNextState(CharSequence nextState) {
        this.nextState = nextState;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-eventname
     * 
     */
    @JsonIgnore
    public CharSequence getEventName() {
        return eventName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html#cfn-iotevents-detectormodel-transitionevent-eventname
     * 
     */
    @JsonIgnore
    public void setEventName(CharSequence eventName) {
        this.eventName = eventName;
    }

    public DetectorModelTransitionEvent withEventName(CharSequence eventName) {
        this.eventName = eventName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("condition", condition).append("actions", actions).append("nextState", nextState).append("eventName", eventName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventName).append(condition).append(nextState).append(actions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelTransitionEvent) == false) {
            return false;
        }
        DetectorModelTransitionEvent rhs = ((DetectorModelTransitionEvent) other);
        return new EqualsBuilder().append(eventName, rhs.eventName).append(condition, rhs.condition).append(nextState, rhs.nextState).append(actions, rhs.actions).isEquals();
    }

}
