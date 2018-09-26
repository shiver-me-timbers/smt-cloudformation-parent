
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ElasticsearchBufferingHints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IntervalInSeconds",
    "SizeInMBs"
})
public class ElasticsearchBufferingHints {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds
     * 
     */
    @JsonProperty("IntervalInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds")
    private Integer intervalInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs
     * 
     */
    @JsonProperty("SizeInMBs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs")
    private Integer sizeInMBs;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds
     * 
     */
    public Integer getIntervalInSeconds() {
        return intervalInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-intervalinseconds
     * 
     */
    public void setIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    public ElasticsearchBufferingHints withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs
     * 
     */
    public Integer getSizeInMBs() {
        return sizeInMBs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html#cfn-kinesisfirehose-deliverystream-elasticsearchbufferinghints-sizeinmbs
     * 
     */
    public void setSizeInMBs(Integer sizeInMBs) {
        this.sizeInMBs = sizeInMBs;
    }

    public ElasticsearchBufferingHints withSizeInMBs(Integer sizeInMBs) {
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
        if ((other instanceof ElasticsearchBufferingHints) == false) {
            return false;
        }
        ElasticsearchBufferingHints rhs = ((ElasticsearchBufferingHints) other);
        return new EqualsBuilder().append(intervalInSeconds, rhs.intervalInSeconds).append(sizeInMBs, rhs.sizeInMBs).isEquals();
    }

}
