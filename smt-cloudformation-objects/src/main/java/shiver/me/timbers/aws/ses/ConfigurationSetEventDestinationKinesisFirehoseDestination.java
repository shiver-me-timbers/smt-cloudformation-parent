
package shiver.me.timbers.aws.ses;

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
 * ConfigurationSetEventDestinationKinesisFirehoseDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IAMRoleARN",
    "DeliveryStreamARN"
})
public class ConfigurationSetEventDestinationKinesisFirehoseDestination implements Property<ConfigurationSetEventDestinationKinesisFirehoseDestination>
{

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
    @JsonIgnore
    public CharSequence getIAMRoleARN() {
        return iAMRoleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-iamrolearn
     * 
     */
    @JsonIgnore
    public void setIAMRoleARN(CharSequence iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
    }

    public ConfigurationSetEventDestinationKinesisFirehoseDestination withIAMRoleARN(CharSequence iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryStreamARN() {
        return deliveryStreamARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html#cfn-ses-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn
     * 
     */
    @JsonIgnore
    public void setDeliveryStreamARN(CharSequence deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
    }

    public ConfigurationSetEventDestinationKinesisFirehoseDestination withDeliveryStreamARN(CharSequence deliveryStreamARN) {
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
        if ((other instanceof ConfigurationSetEventDestinationKinesisFirehoseDestination) == false) {
            return false;
        }
        ConfigurationSetEventDestinationKinesisFirehoseDestination rhs = ((ConfigurationSetEventDestinationKinesisFirehoseDestination) other);
        return new EqualsBuilder().append(iAMRoleARN, rhs.iAMRoleARN).append(deliveryStreamARN, rhs.deliveryStreamARN).isEquals();
    }

}
