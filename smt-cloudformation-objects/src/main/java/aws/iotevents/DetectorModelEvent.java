
package aws.iotevents;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DetectorModelEvent
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Condition",
    "Actions",
    "EventName"
})
public class DetectorModelEvent implements Property<DetectorModelEvent>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-condition
     * 
     */
    @JsonProperty("Condition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-condition")
    private CharSequence condition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-actions
     * 
     */
    @JsonProperty("Actions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-actions")
    private List<Property<DetectorModelAction>> actions = new ArrayList<Property<DetectorModelAction>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-eventname
     * 
     */
    @JsonProperty("EventName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-eventname")
    private CharSequence eventName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-condition
     * 
     */
    @JsonIgnore
    public CharSequence getCondition() {
        return condition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-condition
     * 
     */
    @JsonIgnore
    public void setCondition(CharSequence condition) {
        this.condition = condition;
    }

    public DetectorModelEvent withCondition(CharSequence condition) {
        this.condition = condition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-actions
     * 
     */
    @JsonIgnore
    public List<Property<DetectorModelAction>> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-actions
     * 
     */
    @JsonIgnore
    public void setActions(List<Property<DetectorModelAction>> actions) {
        this.actions = actions;
    }

    public DetectorModelEvent withActions(List<Property<DetectorModelAction>> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-eventname
     * 
     */
    @JsonIgnore
    public CharSequence getEventName() {
        return eventName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html#cfn-iotevents-detectormodel-event-eventname
     * 
     */
    @JsonIgnore
    public void setEventName(CharSequence eventName) {
        this.eventName = eventName;
    }

    public DetectorModelEvent withEventName(CharSequence eventName) {
        this.eventName = eventName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("condition", condition).append("actions", actions).append("eventName", eventName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventName).append(condition).append(actions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelEvent) == false) {
            return false;
        }
        DetectorModelEvent rhs = ((DetectorModelEvent) other);
        return new EqualsBuilder().append(eventName, rhs.eventName).append(condition, rhs.condition).append(actions, rhs.actions).isEquals();
    }

}
