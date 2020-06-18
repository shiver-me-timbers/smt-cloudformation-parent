
package shiver.me.timbers.aws.iot;

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
 * TopicRuleAssetPropertyTimestamp
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OffsetInNanos",
    "TimeInSeconds"
})
public class TopicRuleAssetPropertyTimestamp implements Property<TopicRuleAssetPropertyTimestamp>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-offsetinnanos
     * 
     */
    @JsonProperty("OffsetInNanos")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-offsetinnanos")
    private CharSequence offsetInNanos;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-timeinseconds
     * 
     */
    @JsonProperty("TimeInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-timeinseconds")
    private CharSequence timeInSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-offsetinnanos
     * 
     */
    @JsonIgnore
    public CharSequence getOffsetInNanos() {
        return offsetInNanos;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-offsetinnanos
     * 
     */
    @JsonIgnore
    public void setOffsetInNanos(CharSequence offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
    }

    public TopicRuleAssetPropertyTimestamp withOffsetInNanos(CharSequence offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-timeinseconds
     * 
     */
    @JsonIgnore
    public CharSequence getTimeInSeconds() {
        return timeInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-timeinseconds
     * 
     */
    @JsonIgnore
    public void setTimeInSeconds(CharSequence timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public TopicRuleAssetPropertyTimestamp withTimeInSeconds(CharSequence timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("offsetInNanos", offsetInNanos).append("timeInSeconds", timeInSeconds).toString();
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
        if ((other instanceof TopicRuleAssetPropertyTimestamp) == false) {
            return false;
        }
        TopicRuleAssetPropertyTimestamp rhs = ((TopicRuleAssetPropertyTimestamp) other);
        return new EqualsBuilder().append(timeInSeconds, rhs.timeInSeconds).append(offsetInNanos, rhs.offsetInNanos).isEquals();
    }

}
