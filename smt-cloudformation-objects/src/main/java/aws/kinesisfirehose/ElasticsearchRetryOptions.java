
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ElasticsearchRetryOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DurationInSeconds"
})
public class ElasticsearchRetryOptions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds
     * 
     */
    @JsonProperty("DurationInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds")
    private Integer durationInSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds
     * 
     */
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html#cfn-kinesisfirehose-deliverystream-elasticsearchretryoptions-durationinseconds
     * 
     */
    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public ElasticsearchRetryOptions withDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("durationInSeconds", durationInSeconds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(durationInSeconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticsearchRetryOptions) == false) {
            return false;
        }
        ElasticsearchRetryOptions rhs = ((ElasticsearchRetryOptions) other);
        return new EqualsBuilder().append(durationInSeconds, rhs.durationInSeconds).isEquals();
    }

}
