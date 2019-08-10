
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
 * DetectorModelOnInput
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Events",
    "TransitionEvents"
})
public class DetectorModelOnInput implements Property<DetectorModelOnInput>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-events
     * 
     */
    @JsonProperty("Events")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-events")
    private List<Property<DetectorModelEvent>> events = new ArrayList<Property<DetectorModelEvent>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-transitionevents
     * 
     */
    @JsonProperty("TransitionEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-transitionevents")
    private List<Property<DetectorModelTransitionEvent>> transitionEvents = new ArrayList<Property<DetectorModelTransitionEvent>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-events
     * 
     */
    @JsonIgnore
    public List<Property<DetectorModelEvent>> getEvents() {
        return events;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-events
     * 
     */
    @JsonIgnore
    public void setEvents(List<Property<DetectorModelEvent>> events) {
        this.events = events;
    }

    public DetectorModelOnInput withEvents(List<Property<DetectorModelEvent>> events) {
        this.events = events;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-transitionevents
     * 
     */
    @JsonIgnore
    public List<Property<DetectorModelTransitionEvent>> getTransitionEvents() {
        return transitionEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html#cfn-iotevents-detectormodel-oninput-transitionevents
     * 
     */
    @JsonIgnore
    public void setTransitionEvents(List<Property<DetectorModelTransitionEvent>> transitionEvents) {
        this.transitionEvents = transitionEvents;
    }

    public DetectorModelOnInput withTransitionEvents(List<Property<DetectorModelTransitionEvent>> transitionEvents) {
        this.transitionEvents = transitionEvents;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("events", events).append("transitionEvents", transitionEvents).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(events).append(transitionEvents).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelOnInput) == false) {
            return false;
        }
        DetectorModelOnInput rhs = ((DetectorModelOnInput) other);
        return new EqualsBuilder().append(events, rhs.events).append(transitionEvents, rhs.transitionEvents).isEquals();
    }

}
