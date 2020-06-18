
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
 * DeliveryStreamRedshiftRetryOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DurationInSeconds"
})
public class DeliveryStreamRedshiftRetryOptions implements Property<DeliveryStreamRedshiftRetryOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html#cfn-kinesisfirehose-deliverystream-redshiftretryoptions-durationinseconds
     * 
     */
    @JsonProperty("DurationInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html#cfn-kinesisfirehose-deliverystream-redshiftretryoptions-durationinseconds")
    private Number durationInSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html#cfn-kinesisfirehose-deliverystream-redshiftretryoptions-durationinseconds
     * 
     */
    @JsonIgnore
    public Number getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html#cfn-kinesisfirehose-deliverystream-redshiftretryoptions-durationinseconds
     * 
     */
    @JsonIgnore
    public void setDurationInSeconds(Number durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public DeliveryStreamRedshiftRetryOptions withDurationInSeconds(Number durationInSeconds) {
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
        if ((other instanceof DeliveryStreamRedshiftRetryOptions) == false) {
            return false;
        }
        DeliveryStreamRedshiftRetryOptions rhs = ((DeliveryStreamRedshiftRetryOptions) other);
        return new EqualsBuilder().append(durationInSeconds, rhs.durationInSeconds).isEquals();
    }

}
