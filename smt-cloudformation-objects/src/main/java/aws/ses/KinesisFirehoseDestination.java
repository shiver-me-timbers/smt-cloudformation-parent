
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * KinesisFirehoseDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IAMRoleARN",
    "DeliveryStreamARN"
})
public class KinesisFirehoseDestination {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn
     * 
     */
    @JsonProperty("IAMRoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn")
    private CharSequence iAMRoleARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn
     * 
     */
    @JsonProperty("DeliveryStreamARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn")
    private CharSequence deliveryStreamARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn
     * 
     */
    public CharSequence getIAMRoleARN() {
        return iAMRoleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn
     * 
     */
    public void setIAMRoleARN(CharSequence iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
    }

    public KinesisFirehoseDestination withIAMRoleARN(CharSequence iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn
     * 
     */
    public CharSequence getDeliveryStreamARN() {
        return deliveryStreamARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn
     * 
     */
    public void setDeliveryStreamARN(CharSequence deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
    }

    public KinesisFirehoseDestination withDeliveryStreamARN(CharSequence deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iAMRoleARN", iAMRoleARN).append("deliveryStreamARN", deliveryStreamARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iAMRoleARN).append(deliveryStreamARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KinesisFirehoseDestination) == false) {
            return false;
        }
        KinesisFirehoseDestination rhs = ((KinesisFirehoseDestination) other);
        return new EqualsBuilder().append(iAMRoleARN, rhs.iAMRoleARN).append(deliveryStreamARN, rhs.deliveryStreamARN).isEquals();
    }

}
