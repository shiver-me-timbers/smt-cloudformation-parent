
package shiver.me.timbers.aws.config;

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
 * DeliveryChannelConfigSnapshotDeliveryProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeliveryFrequency"
})
public class DeliveryChannelConfigSnapshotDeliveryProperties implements Property<DeliveryChannelConfigSnapshotDeliveryProperties>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency
     * 
     */
    @JsonProperty("DeliveryFrequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency")
    private CharSequence deliveryFrequency;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency
     * 
     */
    @JsonIgnore
    public CharSequence getDeliveryFrequency() {
        return deliveryFrequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-deliverychannel-configsnapshotdeliveryproperties.html#cfn-config-deliverychannel-configsnapshotdeliveryproperties-deliveryfrequency
     * 
     */
    @JsonIgnore
    public void setDeliveryFrequency(CharSequence deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency;
    }

    public DeliveryChannelConfigSnapshotDeliveryProperties withDeliveryFrequency(CharSequence deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliveryFrequency", deliveryFrequency).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deliveryFrequency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryChannelConfigSnapshotDeliveryProperties) == false) {
            return false;
        }
        DeliveryChannelConfigSnapshotDeliveryProperties rhs = ((DeliveryChannelConfigSnapshotDeliveryProperties) other);
        return new EqualsBuilder().append(deliveryFrequency, rhs.deliveryFrequency).isEquals();
    }

}
