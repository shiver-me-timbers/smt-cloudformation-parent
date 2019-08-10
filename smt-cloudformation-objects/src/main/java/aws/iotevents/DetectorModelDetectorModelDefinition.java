
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
 * DetectorModelDetectorModelDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "States",
    "InitialStateName"
})
public class DetectorModelDetectorModelDefinition implements Property<DetectorModelDetectorModelDefinition>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-states
     * 
     */
    @JsonProperty("States")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-states")
    private List<Property<DetectorModelState>> states = new ArrayList<Property<DetectorModelState>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-initialstatename
     * 
     */
    @JsonProperty("InitialStateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-initialstatename")
    private CharSequence initialStateName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-states
     * 
     */
    @JsonIgnore
    public List<Property<DetectorModelState>> getStates() {
        return states;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-states
     * 
     */
    @JsonIgnore
    public void setStates(List<Property<DetectorModelState>> states) {
        this.states = states;
    }

    public DetectorModelDetectorModelDefinition withStates(List<Property<DetectorModelState>> states) {
        this.states = states;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-initialstatename
     * 
     */
    @JsonIgnore
    public CharSequence getInitialStateName() {
        return initialStateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html#cfn-iotevents-detectormodel-detectormodeldefinition-initialstatename
     * 
     */
    @JsonIgnore
    public void setInitialStateName(CharSequence initialStateName) {
        this.initialStateName = initialStateName;
    }

    public DetectorModelDetectorModelDefinition withInitialStateName(CharSequence initialStateName) {
        this.initialStateName = initialStateName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("states", states).append("initialStateName", initialStateName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(initialStateName).append(states).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelDetectorModelDefinition) == false) {
            return false;
        }
        DetectorModelDetectorModelDefinition rhs = ((DetectorModelDetectorModelDefinition) other);
        return new EqualsBuilder().append(initialStateName, rhs.initialStateName).append(states, rhs.states).isEquals();
    }

}
