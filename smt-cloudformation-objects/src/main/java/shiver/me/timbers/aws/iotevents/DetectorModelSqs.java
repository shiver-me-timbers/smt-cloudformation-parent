
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
 * DetectorModelSqs
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "UseBase64",
    "QueueUrl"
})
public class DetectorModelSqs implements Property<DetectorModelSqs>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-usebase64
     * 
     */
    @JsonProperty("UseBase64")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-usebase64")
    private CharSequence useBase64;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-queueurl
     * 
     */
    @JsonProperty("QueueUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-queueurl")
    private CharSequence queueUrl;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-usebase64
     * 
     */
    @JsonIgnore
    public CharSequence getUseBase64() {
        return useBase64;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-usebase64
     * 
     */
    @JsonIgnore
    public void setUseBase64(CharSequence useBase64) {
        this.useBase64 = useBase64;
    }

    public DetectorModelSqs withUseBase64(CharSequence useBase64) {
        this.useBase64 = useBase64;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-queueurl
     * 
     */
    @JsonIgnore
    public CharSequence getQueueUrl() {
        return queueUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html#cfn-iotevents-detectormodel-sqs-queueurl
     * 
     */
    @JsonIgnore
    public void setQueueUrl(CharSequence queueUrl) {
        this.queueUrl = queueUrl;
    }

    public DetectorModelSqs withQueueUrl(CharSequence queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("useBase64", useBase64).append("queueUrl", queueUrl).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(useBase64).append(queueUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelSqs) == false) {
            return false;
        }
        DetectorModelSqs rhs = ((DetectorModelSqs) other);
        return new EqualsBuilder().append(useBase64, rhs.useBase64).append(queueUrl, rhs.queueUrl).isEquals();
    }

}
