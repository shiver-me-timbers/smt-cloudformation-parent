
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
 * ConfigurationSetEventDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EventDestinationName",
    "ConfigurationSetName",
    "EventDestination"
})
public class ConfigurationSetEventDestination {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname
     * 
     */
    @JsonProperty("EventDestinationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname")
    private CharSequence eventDestinationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname
     * 
     */
    @JsonProperty("ConfigurationSetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname")
    private CharSequence configurationSetName;
    /**
     * ConfigurationSetEventDestinationEventDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html
     * 
     */
    @JsonProperty("EventDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html")
    private Property<ConfigurationSetEventDestinationEventDestination> eventDestination;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname
     * 
     */
    @JsonIgnore
    public CharSequence getEventDestinationName() {
        return eventDestinationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname
     * 
     */
    @JsonIgnore
    public void setEventDestinationName(CharSequence eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
    }

    public ConfigurationSetEventDestination withEventDestinationName(CharSequence eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname
     * 
     */
    @JsonIgnore
    public CharSequence getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname
     * 
     */
    @JsonIgnore
    public void setConfigurationSetName(CharSequence configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    public ConfigurationSetEventDestination withConfigurationSetName(CharSequence configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * ConfigurationSetEventDestinationEventDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetEventDestinationEventDestination> getEventDestination() {
        return eventDestination;
    }

    /**
     * ConfigurationSetEventDestinationEventDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html
     * 
     */
    @JsonIgnore
    public void setEventDestination(Property<ConfigurationSetEventDestinationEventDestination> eventDestination) {
        this.eventDestination = eventDestination;
    }

    public ConfigurationSetEventDestination withEventDestination(Property<ConfigurationSetEventDestinationEventDestination> eventDestination) {
        this.eventDestination = eventDestination;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eventDestinationName", eventDestinationName).append("configurationSetName", configurationSetName).append("eventDestination", eventDestination).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventDestinationName).append(configurationSetName).append(eventDestination).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetEventDestination) == false) {
            return false;
        }
        ConfigurationSetEventDestination rhs = ((ConfigurationSetEventDestination) other);
        return new EqualsBuilder().append(eventDestinationName, rhs.eventDestinationName).append(configurationSetName, rhs.configurationSetName).append(eventDestination, rhs.eventDestination).isEquals();
    }

}
