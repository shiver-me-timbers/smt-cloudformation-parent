
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SplunkRetryOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DurationInSeconds"
})
public class SplunkRetryOptions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds
     * 
     */
    @JsonProperty("DurationInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds")
    private Integer durationInSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds
     * 
     */
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html#cfn-kinesisfirehose-deliverystream-splunkretryoptions-durationinseconds
     * 
     */
    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public SplunkRetryOptions withDurationInSeconds(Integer durationInSeconds) {
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
        if ((other instanceof SplunkRetryOptions) == false) {
            return false;
        }
        SplunkRetryOptions rhs = ((SplunkRetryOptions) other);
        return new EqualsBuilder().append(durationInSeconds, rhs.durationInSeconds).isEquals();
    }

}
