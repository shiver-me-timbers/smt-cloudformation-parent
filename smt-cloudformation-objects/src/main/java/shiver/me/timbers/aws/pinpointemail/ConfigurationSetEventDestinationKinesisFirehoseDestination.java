
package shiver.me.timbers.aws.pinpointemail;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeliveryStreamArn",
    "IamRoleArn"
})
public class ConfigurationSetEventDestinationKinesisFirehoseDestination implements Property<ConfigurationSetEventDestinationKinesisFirehoseDestination>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn
     * 
     */
    @JsonProperty("DeliveryStreamArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn")
    private CharSequence deliveryStreamArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-iamrolearn
     * 
     */
    @JsonProperty("IamRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-iamrolearn")
    private CharSequence iamRoleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryStreamArn() {
        return deliveryStreamArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-deliverystreamarn
     * 
     */
    @JsonIgnore
    public void setDeliveryStreamArn(CharSequence deliveryStreamArn) {
        this.deliveryStreamArn = deliveryStreamArn;
    }

    public ConfigurationSetEventDestinationKinesisFirehoseDestination withDeliveryStreamArn(CharSequence deliveryStreamArn) {
        this.deliveryStreamArn = deliveryStreamArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-iamrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html#cfn-pinpointemail-configurationseteventdestination-kinesisfirehosedestination-iamrolearn
     * 
     */
    @JsonIgnore
    public void setIamRoleArn(CharSequence iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    public ConfigurationSetEventDestinationKinesisFirehoseDestination withIamRoleArn(CharSequence iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliveryStreamArn", deliveryStreamArn).append("iamRoleArn", iamRoleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iamRoleArn).append(deliveryStreamArn).toHashCode();
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
        return new EqualsBuilder().append(iamRoleArn, rhs.iamRoleArn).append(deliveryStreamArn, rhs.deliveryStreamArn).isEquals();
    }

}
