
package shiver.me.timbers.aws.iotevents;

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
 * DetectorModelSetTimer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Seconds",
    "TimerName",
    "DurationExpression"
})
public class DetectorModelSetTimer implements Property<DetectorModelSetTimer>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-seconds
     * 
     */
    @JsonProperty("Seconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-seconds")
    private Number seconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-timername
     * 
     */
    @JsonProperty("TimerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-timername")
    private CharSequence timerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-durationexpression
     * 
     */
    @JsonProperty("DurationExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-durationexpression")
    private CharSequence durationExpression;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-seconds
     * 
     */
    @JsonIgnore
    public Number getSeconds() {
        return seconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-seconds
     * 
     */
    @JsonIgnore
    public void setSeconds(Number seconds) {
        this.seconds = seconds;
    }

    public DetectorModelSetTimer withSeconds(Number seconds) {
        this.seconds = seconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-timername
     * 
     */
    @JsonIgnore
    public CharSequence getTimerName() {
        return timerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-timername
     * 
     */
    @JsonIgnore
    public void setTimerName(CharSequence timerName) {
        this.timerName = timerName;
    }

    public DetectorModelSetTimer withTimerName(CharSequence timerName) {
        this.timerName = timerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-durationexpression
     * 
     */
    @JsonIgnore
    public CharSequence getDurationExpression() {
        return durationExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html#cfn-iotevents-detectormodel-settimer-durationexpression
     * 
     */
    @JsonIgnore
    public void setDurationExpression(CharSequence durationExpression) {
        this.durationExpression = durationExpression;
    }

    public DetectorModelSetTimer withDurationExpression(CharSequence durationExpression) {
        this.durationExpression = durationExpression;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("seconds", seconds).append("timerName", timerName).append("durationExpression", durationExpression).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(durationExpression).append(timerName).append(seconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelSetTimer) == false) {
            return false;
        }
        DetectorModelSetTimer rhs = ((DetectorModelSetTimer) other);
        return new EqualsBuilder().append(durationExpression, rhs.durationExpression).append(timerName, rhs.timerName).append(seconds, rhs.seconds).isEquals();
    }

}
