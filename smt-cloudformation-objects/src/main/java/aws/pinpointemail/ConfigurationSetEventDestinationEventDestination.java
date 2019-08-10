
package aws.pinpointemail;

import java.util.ArrayList;
import java.util.List;
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
 * ConfigurationSetEventDestinationEventDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SnsDestination",
    "CloudWatchDestination",
    "Enabled",
    "MatchingEventTypes",
    "PinpointDestination",
    "KinesisFirehoseDestination"
})
public class ConfigurationSetEventDestinationEventDestination implements Property<ConfigurationSetEventDestinationEventDestination>
{

    /**
     * ConfigurationSetEventDestinationSnsDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html
     * 
     */
    @JsonProperty("SnsDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html")
    private Property<ConfigurationSetEventDestinationSnsDestination> snsDestination;
    /**
     * ConfigurationSetEventDestinationCloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-cloudwatchdestination.html
     * 
     */
    @JsonProperty("CloudWatchDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-cloudwatchdestination.html")
    private Property<ConfigurationSetEventDestinationCloudWatchDestination> cloudWatchDestination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-enabled")
    private CharSequence enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-matchingeventtypes
     * 
     */
    @JsonProperty("MatchingEventTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-matchingeventtypes")
    private List<CharSequence> matchingEventTypes = new ArrayList<CharSequence>();
    /**
     * ConfigurationSetEventDestinationPinpointDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html
     * 
     */
    @JsonProperty("PinpointDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html")
    private Property<ConfigurationSetEventDestinationPinpointDestination> pinpointDestination;
    /**
     * ConfigurationSetEventDestinationKinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html
     * 
     */
    @JsonProperty("KinesisFirehoseDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html")
    private Property<ConfigurationSetEventDestinationKinesisFirehoseDestination> kinesisFirehoseDestination;

    /**
     * ConfigurationSetEventDestinationSnsDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetEventDestinationSnsDestination> getSnsDestination() {
        return snsDestination;
    }

    /**
     * ConfigurationSetEventDestinationSnsDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-snsdestination.html
     * 
     */
    @JsonIgnore
    public void setSnsDestination(Property<ConfigurationSetEventDestinationSnsDestination> snsDestination) {
        this.snsDestination = snsDestination;
    }

    public ConfigurationSetEventDestinationEventDestination withSnsDestination(Property<ConfigurationSetEventDestinationSnsDestination> snsDestination) {
        this.snsDestination = snsDestination;
        return this;
    }

    /**
     * ConfigurationSetEventDestinationCloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-cloudwatchdestination.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetEventDestinationCloudWatchDestination> getCloudWatchDestination() {
        return cloudWatchDestination;
    }

    /**
     * ConfigurationSetEventDestinationCloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-cloudwatchdestination.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchDestination(Property<ConfigurationSetEventDestinationCloudWatchDestination> cloudWatchDestination) {
        this.cloudWatchDestination = cloudWatchDestination;
    }

    public ConfigurationSetEventDestinationEventDestination withCloudWatchDestination(Property<ConfigurationSetEventDestinationCloudWatchDestination> cloudWatchDestination) {
        this.cloudWatchDestination = cloudWatchDestination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(CharSequence enabled) {
        this.enabled = enabled;
    }

    public ConfigurationSetEventDestinationEventDestination withEnabled(CharSequence enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-matchingeventtypes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getMatchingEventTypes() {
        return matchingEventTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-eventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination-matchingeventtypes
     * 
     */
    @JsonIgnore
    public void setMatchingEventTypes(List<CharSequence> matchingEventTypes) {
        this.matchingEventTypes = matchingEventTypes;
    }

    public ConfigurationSetEventDestinationEventDestination withMatchingEventTypes(List<CharSequence> matchingEventTypes) {
        this.matchingEventTypes = matchingEventTypes;
        return this;
    }

    /**
     * ConfigurationSetEventDestinationPinpointDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetEventDestinationPinpointDestination> getPinpointDestination() {
        return pinpointDestination;
    }

    /**
     * ConfigurationSetEventDestinationPinpointDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-pinpointdestination.html
     * 
     */
    @JsonIgnore
    public void setPinpointDestination(Property<ConfigurationSetEventDestinationPinpointDestination> pinpointDestination) {
        this.pinpointDestination = pinpointDestination;
    }

    public ConfigurationSetEventDestinationEventDestination withPinpointDestination(Property<ConfigurationSetEventDestinationPinpointDestination> pinpointDestination) {
        this.pinpointDestination = pinpointDestination;
        return this;
    }

    /**
     * ConfigurationSetEventDestinationKinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetEventDestinationKinesisFirehoseDestination> getKinesisFirehoseDestination() {
        return kinesisFirehoseDestination;
    }

    /**
     * ConfigurationSetEventDestinationKinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationseteventdestination-kinesisfirehosedestination.html
     * 
     */
    @JsonIgnore
    public void setKinesisFirehoseDestination(Property<ConfigurationSetEventDestinationKinesisFirehoseDestination> kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
    }

    public ConfigurationSetEventDestinationEventDestination withKinesisFirehoseDestination(Property<ConfigurationSetEventDestinationKinesisFirehoseDestination> kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("snsDestination", snsDestination).append("cloudWatchDestination", cloudWatchDestination).append("enabled", enabled).append("matchingEventTypes", matchingEventTypes).append("pinpointDestination", pinpointDestination).append("kinesisFirehoseDestination", kinesisFirehoseDestination).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchDestination).append(kinesisFirehoseDestination).append(pinpointDestination).append(snsDestination).append(enabled).append(matchingEventTypes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetEventDestinationEventDestination) == false) {
            return false;
        }
        ConfigurationSetEventDestinationEventDestination rhs = ((ConfigurationSetEventDestinationEventDestination) other);
        return new EqualsBuilder().append(cloudWatchDestination, rhs.cloudWatchDestination).append(kinesisFirehoseDestination, rhs.kinesisFirehoseDestination).append(pinpointDestination, rhs.pinpointDestination).append(snsDestination, rhs.snsDestination).append(enabled, rhs.enabled).append(matchingEventTypes, rhs.matchingEventTypes).isEquals();
    }

}
