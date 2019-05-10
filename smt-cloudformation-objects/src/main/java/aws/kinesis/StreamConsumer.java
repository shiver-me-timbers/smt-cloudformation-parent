
package aws.kinesis;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StreamConsumer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConsumerName",
    "StreamARN"
})
public class StreamConsumer {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername
     * 
     */
    @JsonProperty("ConsumerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername")
    private CharSequence consumerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn
     * 
     */
    @JsonProperty("StreamARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn")
    private CharSequence streamARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername
     * 
     */
    @JsonIgnore
    public CharSequence getConsumerName() {
        return consumerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername
     * 
     */
    @JsonIgnore
    public void setConsumerName(CharSequence consumerName) {
        this.consumerName = consumerName;
    }

    public StreamConsumer withConsumerName(CharSequence consumerName) {
        this.consumerName = consumerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn
     * 
     */
    @JsonIgnore
    public CharSequence getStreamARN() {
        return streamARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn
     * 
     */
    @JsonIgnore
    public void setStreamARN(CharSequence streamARN) {
        this.streamARN = streamARN;
    }

    public StreamConsumer withStreamARN(CharSequence streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("consumerName", consumerName).append("streamARN", streamARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(streamARN).append(consumerName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreamConsumer) == false) {
            return false;
        }
        StreamConsumer rhs = ((StreamConsumer) other);
        return new EqualsBuilder().append(streamARN, rhs.streamARN).append(consumerName, rhs.consumerName).isEquals();
    }

}
