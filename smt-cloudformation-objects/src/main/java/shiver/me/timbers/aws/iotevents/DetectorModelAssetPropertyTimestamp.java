
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
 * DetectorModelAssetPropertyTimestamp
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TimeInSeconds",
    "OffsetInNanos"
})
public class DetectorModelAssetPropertyTimestamp implements Property<DetectorModelAssetPropertyTimestamp>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-timeinseconds
     * 
     */
    @JsonProperty("TimeInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-timeinseconds")
    private CharSequence timeInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-offsetinnanos
     * 
     */
    @JsonProperty("OffsetInNanos")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-offsetinnanos")
    private CharSequence offsetInNanos;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-timeinseconds
     * 
     */
    @JsonIgnore
    public CharSequence getTimeInSeconds() {
        return timeInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-timeinseconds
     * 
     */
    @JsonIgnore
    public void setTimeInSeconds(CharSequence timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public DetectorModelAssetPropertyTimestamp withTimeInSeconds(CharSequence timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-offsetinnanos
     * 
     */
    @JsonIgnore
    public CharSequence getOffsetInNanos() {
        return offsetInNanos;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html#cfn-iotevents-detectormodel-assetpropertytimestamp-offsetinnanos
     * 
     */
    @JsonIgnore
    public void setOffsetInNanos(CharSequence offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
    }

    public DetectorModelAssetPropertyTimestamp withOffsetInNanos(CharSequence offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timeInSeconds", timeInSeconds).append("offsetInNanos", offsetInNanos).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeInSeconds).append(offsetInNanos).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelAssetPropertyTimestamp) == false) {
            return false;
        }
        DetectorModelAssetPropertyTimestamp rhs = ((DetectorModelAssetPropertyTimestamp) other);
        return new EqualsBuilder().append(timeInSeconds, rhs.timeInSeconds).append(offsetInNanos, rhs.offsetInNanos).isEquals();
    }

}
