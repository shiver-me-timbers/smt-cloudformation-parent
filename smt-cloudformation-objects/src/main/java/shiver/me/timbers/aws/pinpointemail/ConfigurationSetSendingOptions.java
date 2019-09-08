
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
 * ConfigurationSetSendingOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SendingEnabled"
})
public class ConfigurationSetSendingOptions implements Property<ConfigurationSetSendingOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html#cfn-pinpointemail-configurationset-sendingoptions-sendingenabled
     * 
     */
    @JsonProperty("SendingEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html#cfn-pinpointemail-configurationset-sendingoptions-sendingenabled")
    private CharSequence sendingEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html#cfn-pinpointemail-configurationset-sendingoptions-sendingenabled
     * 
     */
    @JsonIgnore
    public CharSequence getSendingEnabled() {
        return sendingEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html#cfn-pinpointemail-configurationset-sendingoptions-sendingenabled
     * 
     */
    @JsonIgnore
    public void setSendingEnabled(CharSequence sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
    }

    public ConfigurationSetSendingOptions withSendingEnabled(CharSequence sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sendingEnabled", sendingEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sendingEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetSendingOptions) == false) {
            return false;
        }
        ConfigurationSetSendingOptions rhs = ((ConfigurationSetSendingOptions) other);
        return new EqualsBuilder().append(sendingEnabled, rhs.sendingEnabled).isEquals();
    }

}
