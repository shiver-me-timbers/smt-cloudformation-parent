
package aws.pinpointemail;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConfigurationSetEventDestinationPinpointDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApplicationArn"
})
public class ConfigurationSetEventDestinationPinpointDestination implements Property<ConfigurationSetEventDestinationPinpointDestination>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html#cfn-pinpointemail-configurationseteventdestination-pinpointdestination-applicationarn
     * 
     */
    @JsonProperty("ApplicationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html#cfn-pinpointemail-configurationseteventdestination-pinpointdestination-applicationarn")
    private CharSequence applicationArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html#cfn-pinpointemail-configurationseteventdestination-pinpointdestination-applicationarn
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationArn() {
        return applicationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html#cfn-pinpointemail-configurationseteventdestination-pinpointdestination-applicationarn
     * 
     */
    @JsonIgnore
    public void setApplicationArn(CharSequence applicationArn) {
        this.applicationArn = applicationArn;
    }

    public ConfigurationSetEventDestinationPinpointDestination withApplicationArn(CharSequence applicationArn) {
        this.applicationArn = applicationArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationArn", applicationArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(applicationArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetEventDestinationPinpointDestination) == false) {
            return false;
        }
        ConfigurationSetEventDestinationPinpointDestination rhs = ((ConfigurationSetEventDestinationPinpointDestination) other);
        return new EqualsBuilder().append(applicationArn, rhs.applicationArn).isEquals();
    }

}
