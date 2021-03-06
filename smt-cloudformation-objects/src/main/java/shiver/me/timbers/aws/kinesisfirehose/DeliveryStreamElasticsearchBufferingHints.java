
package shiver.me.timbers.aws.kinesisfirehose;

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
 * DeliveryStreamElasticsearchBufferingHints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IntervalInSeconds",
    "SizeInMBs"
})
public class DeliveryStreamElasticsearchBufferingHints implements Property<DeliveryStreamElasticsearchBufferingHints>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds
     * 
     */
    @JsonProperty("IntervalInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds")
    private Number intervalInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs
     * 
     */
    @JsonProperty("SizeInMBs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs")
    private Number sizeInMBs;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds
     * 
     */
    @JsonIgnore
    public Number getIntervalInSeconds() {
        return intervalInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds
     * 
     */
    @JsonIgnore
    public void setIntervalInSeconds(Number intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    public DeliveryStreamElasticsearchBufferingHints withIntervalInSeconds(Number intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs
     * 
     */
    @JsonIgnore
    public Number getSizeInMBs() {
        return sizeInMBs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs
     * 
     */
    @JsonIgnore
    public void setSizeInMBs(Number sizeInMBs) {
        this.sizeInMBs = sizeInMBs;
    }

    public DeliveryStreamElasticsearchBufferingHints withSizeInMBs(Number sizeInMBs) {
        this.sizeInMBs = sizeInMBs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("intervalInSeconds", intervalInSeconds).append("sizeInMBs", sizeInMBs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(intervalInSeconds).append(sizeInMBs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamElasticsearchBufferingHints) == false) {
            return false;
        }
        DeliveryStreamElasticsearchBufferingHints rhs = ((DeliveryStreamElasticsearchBufferingHints) other);
        return new EqualsBuilder().append(intervalInSeconds, rhs.intervalInSeconds).append(sizeInMBs, rhs.sizeInMBs).isEquals();
    }

}
