
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
 * DetectorModelClearTimer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TimerName"
})
public class DetectorModelClearTimer implements Property<DetectorModelClearTimer>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html#cfn-iotevents-detectormodel-cleartimer-timername
     * 
     */
    @JsonProperty("TimerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html#cfn-iotevents-detectormodel-cleartimer-timername")
    private CharSequence timerName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html#cfn-iotevents-detectormodel-cleartimer-timername
     * 
     */
    @JsonIgnore
    public CharSequence getTimerName() {
        return timerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html#cfn-iotevents-detectormodel-cleartimer-timername
     * 
     */
    @JsonIgnore
    public void setTimerName(CharSequence timerName) {
        this.timerName = timerName;
    }

    public DetectorModelClearTimer withTimerName(CharSequence timerName) {
        this.timerName = timerName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timerName", timerName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timerName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelClearTimer) == false) {
            return false;
        }
        DetectorModelClearTimer rhs = ((DetectorModelClearTimer) other);
        return new EqualsBuilder().append(timerName, rhs.timerName).isEquals();
    }

}
