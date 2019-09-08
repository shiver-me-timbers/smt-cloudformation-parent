
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
 * ConfigurationSetDeliveryOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SendingPoolName"
})
public class ConfigurationSetDeliveryOptions implements Property<ConfigurationSetDeliveryOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html#cfn-pinpointemail-configurationset-deliveryoptions-sendingpoolname
     * 
     */
    @JsonProperty("SendingPoolName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html#cfn-pinpointemail-configurationset-deliveryoptions-sendingpoolname")
    private CharSequence sendingPoolName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html#cfn-pinpointemail-configurationset-deliveryoptions-sendingpoolname
     * 
     */
    @JsonIgnore
    public CharSequence getSendingPoolName() {
        return sendingPoolName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-deliveryoptions.html#cfn-pinpointemail-configurationset-deliveryoptions-sendingpoolname
     * 
     */
    @JsonIgnore
    public void setSendingPoolName(CharSequence sendingPoolName) {
        this.sendingPoolName = sendingPoolName;
    }

    public ConfigurationSetDeliveryOptions withSendingPoolName(CharSequence sendingPoolName) {
        this.sendingPoolName = sendingPoolName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sendingPoolName", sendingPoolName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sendingPoolName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetDeliveryOptions) == false) {
            return false;
        }
        ConfigurationSetDeliveryOptions rhs = ((ConfigurationSetDeliveryOptions) other);
        return new EqualsBuilder().append(sendingPoolName, rhs.sendingPoolName).isEquals();
    }

}
