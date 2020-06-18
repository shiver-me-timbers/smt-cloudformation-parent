
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
 * DetectorModelFirehose
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeliveryStreamName",
    "Payload",
    "Separator"
})
public class DetectorModelFirehose implements Property<DetectorModelFirehose>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-deliverystreamname
     * 
     */
    @JsonProperty("DeliveryStreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-deliverystreamname")
    private CharSequence deliveryStreamName;
    /**
     * DetectorModelPayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html
     * 
     */
    @JsonProperty("Payload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html")
    private Property<DetectorModelPayload> payload;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-separator
     * 
     */
    @JsonProperty("Separator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-separator")
    private CharSequence separator;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-deliverystreamname
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryStreamName() {
        return deliveryStreamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-deliverystreamname
     * 
     */
    @JsonIgnore
    public void setDeliveryStreamName(CharSequence deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    public DetectorModelFirehose withDeliveryStreamName(CharSequence deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
        return this;
    }

    /**
     * DetectorModelPayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelPayload> getPayload() {
        return payload;
    }

    /**
     * DetectorModelPayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html
     * 
     */
    @JsonIgnore
    public void setPayload(Property<DetectorModelPayload> payload) {
        this.payload = payload;
    }

    public DetectorModelFirehose withPayload(Property<DetectorModelPayload> payload) {
        this.payload = payload;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-separator
     * 
     */
    @JsonIgnore
    public CharSequence getSeparator() {
        return separator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html#cfn-iotevents-detectormodel-firehose-separator
     * 
     */
    @JsonIgnore
    public void setSeparator(CharSequence separator) {
        this.separator = separator;
    }

    public DetectorModelFirehose withSeparator(CharSequence separator) {
        this.separator = separator;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliveryStreamName", deliveryStreamName).append("payload", payload).append("separator", separator).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deliveryStreamName).append(payload).append(separator).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelFirehose) == false) {
            return false;
        }
        DetectorModelFirehose rhs = ((DetectorModelFirehose) other);
        return new EqualsBuilder().append(deliveryStreamName, rhs.deliveryStreamName).append(payload, rhs.payload).append(separator, rhs.separator).isEquals();
    }

}
