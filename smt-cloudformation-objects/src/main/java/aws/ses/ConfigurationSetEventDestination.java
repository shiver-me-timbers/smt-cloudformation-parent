
package aws.ses;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ConfigurationSetName",
    "EventDestination"
})
public class ConfigurationSetEventDestination {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname
     * 
     */
    @JsonProperty("ConfigurationSetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname")
    private CharSequence configurationSetName;
    /**
     * EventDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html
     * 
     */
    @JsonProperty("EventDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html")
    private EventDestination eventDestination;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname
     * 
     */
    public CharSequence getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname
     * 
     */
    public void setConfigurationSetName(CharSequence configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    public ConfigurationSetEventDestination withConfigurationSetName(CharSequence configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * EventDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html
     * 
     */
    public EventDestination getEventDestination() {
        return eventDestination;
    }

    /**
     * EventDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html
     * 
     */
    public void setEventDestination(EventDestination eventDestination) {
        this.eventDestination = eventDestination;
    }

    public ConfigurationSetEventDestination withEventDestination(EventDestination eventDestination) {
        this.eventDestination = eventDestination;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("configurationSetName", configurationSetName).append("eventDestination", eventDestination).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(configurationSetName).append(eventDestination).toHashCode();
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
        return new EqualsBuilder().append(configurationSetName, rhs.configurationSetName).append(eventDestination, rhs.eventDestination).isEquals();
    }

}
