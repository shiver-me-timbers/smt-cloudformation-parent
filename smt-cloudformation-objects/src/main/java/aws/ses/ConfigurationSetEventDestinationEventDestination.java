
package aws.ses;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudWatchDestination",
    "Enabled",
    "MatchingEventTypes",
    "Name",
    "KinesisFirehoseDestination"
})
public class ConfigurationSetEventDestinationEventDestination implements Property<ConfigurationSetEventDestinationEventDestination>
{

    /**
     * ConfigurationSetEventDestinationCloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
     * 
     */
    @JsonProperty("CloudWatchDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html")
    private Property<ConfigurationSetEventDestinationCloudWatchDestination> cloudWatchDestination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled")
    private CharSequence enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes
     * 
     */
    @JsonProperty("MatchingEventTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes")
    private List<CharSequence> matchingEventTypes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name")
    private CharSequence name;
    /**
     * ConfigurationSetEventDestinationKinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
     * 
     */
    @JsonProperty("KinesisFirehoseDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html")
    private Property<ConfigurationSetEventDestinationKinesisFirehoseDestination> kinesisFirehoseDestination;

    /**
     * ConfigurationSetEventDestinationCloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetEventDestinationCloudWatchDestination> getCloudWatchDestination() {
        return cloudWatchDestination;
    }

    /**
     * ConfigurationSetEventDestinationCloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getMatchingEventTypes() {
        return matchingEventTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ConfigurationSetEventDestinationEventDestination withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * ConfigurationSetEventDestinationKinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
     * 
     */
    @JsonIgnore
    public Property<ConfigurationSetEventDestinationKinesisFirehoseDestination> getKinesisFirehoseDestination() {
        return kinesisFirehoseDestination;
    }

    /**
     * ConfigurationSetEventDestinationKinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
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
        return new ToStringBuilder(this).append("cloudWatchDestination", cloudWatchDestination).append("enabled", enabled).append("matchingEventTypes", matchingEventTypes).append("name", name).append("kinesisFirehoseDestination", kinesisFirehoseDestination).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(cloudWatchDestination).append(kinesisFirehoseDestination).append(enabled).append(matchingEventTypes).toHashCode();
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
        return new EqualsBuilder().append(name, rhs.name).append(cloudWatchDestination, rhs.cloudWatchDestination).append(kinesisFirehoseDestination, rhs.kinesisFirehoseDestination).append(enabled, rhs.enabled).append(matchingEventTypes, rhs.matchingEventTypes).isEquals();
    }

}
