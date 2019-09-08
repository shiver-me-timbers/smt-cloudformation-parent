
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
 * DetectorModelOnEnter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Events"
})
public class DetectorModelOnEnter implements Property<DetectorModelOnEnter>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html#cfn-iotevents-detectormodel-onenter-events
     * 
     */
    @JsonProperty("Events")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html#cfn-iotevents-detectormodel-onenter-events")
    private List<Property<DetectorModelEvent>> events = new ArrayList<Property<DetectorModelEvent>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html#cfn-iotevents-detectormodel-onenter-events
     * 
     */
    @JsonIgnore
    public List<Property<DetectorModelEvent>> getEvents() {
        return events;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html#cfn-iotevents-detectormodel-onenter-events
     * 
     */
    @JsonIgnore
    public void setEvents(List<Property<DetectorModelEvent>> events) {
        this.events = events;
    }

    public DetectorModelOnEnter withEvents(List<Property<DetectorModelEvent>> events) {
        this.events = events;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("events", events).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(events).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelOnEnter) == false) {
            return false;
        }
        DetectorModelOnEnter rhs = ((DetectorModelOnEnter) other);
        return new EqualsBuilder().append(events, rhs.events).isEquals();
    }

}
