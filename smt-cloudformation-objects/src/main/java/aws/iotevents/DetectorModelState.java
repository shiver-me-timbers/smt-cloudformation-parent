
package aws.iotevents;

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
 * DetectorModelState
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OnInput",
    "OnExit",
    "StateName",
    "OnEnter"
})
public class DetectorModelState implements Property<DetectorModelState>
{

    /**
     * DetectorModelOnInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html
     * 
     */
    @JsonProperty("OnInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html")
    private Property<DetectorModelOnInput> onInput;
    /**
     * DetectorModelOnExit
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onexit.html
     * 
     */
    @JsonProperty("OnExit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onexit.html")
    private Property<DetectorModelOnExit> onExit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-statename
     * 
     */
    @JsonProperty("StateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-statename")
    private CharSequence stateName;
    /**
     * DetectorModelOnEnter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html
     * 
     */
    @JsonProperty("OnEnter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html")
    private Property<DetectorModelOnEnter> onEnter;

    /**
     * DetectorModelOnInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelOnInput> getOnInput() {
        return onInput;
    }

    /**
     * DetectorModelOnInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html
     * 
     */
    @JsonIgnore
    public void setOnInput(Property<DetectorModelOnInput> onInput) {
        this.onInput = onInput;
    }

    public DetectorModelState withOnInput(Property<DetectorModelOnInput> onInput) {
        this.onInput = onInput;
        return this;
    }

    /**
     * DetectorModelOnExit
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onexit.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelOnExit> getOnExit() {
        return onExit;
    }

    /**
     * DetectorModelOnExit
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onexit.html
     * 
     */
    @JsonIgnore
    public void setOnExit(Property<DetectorModelOnExit> onExit) {
        this.onExit = onExit;
    }

    public DetectorModelState withOnExit(Property<DetectorModelOnExit> onExit) {
        this.onExit = onExit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-statename
     * 
     */
    @JsonIgnore
    public CharSequence getStateName() {
        return stateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html#cfn-iotevents-detectormodel-state-statename
     * 
     */
    @JsonIgnore
    public void setStateName(CharSequence stateName) {
        this.stateName = stateName;
    }

    public DetectorModelState withStateName(CharSequence stateName) {
        this.stateName = stateName;
        return this;
    }

    /**
     * DetectorModelOnEnter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelOnEnter> getOnEnter() {
        return onEnter;
    }

    /**
     * DetectorModelOnEnter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html
     * 
     */
    @JsonIgnore
    public void setOnEnter(Property<DetectorModelOnEnter> onEnter) {
        this.onEnter = onEnter;
    }

    public DetectorModelState withOnEnter(Property<DetectorModelOnEnter> onEnter) {
        this.onEnter = onEnter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("onInput", onInput).append("onExit", onExit).append("stateName", stateName).append("onEnter", onEnter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onEnter).append(onInput).append(onExit).append(stateName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelState) == false) {
            return false;
        }
        DetectorModelState rhs = ((DetectorModelState) other);
        return new EqualsBuilder().append(onEnter, rhs.onEnter).append(onInput, rhs.onInput).append(onExit, rhs.onExit).append(stateName, rhs.stateName).isEquals();
    }

}
