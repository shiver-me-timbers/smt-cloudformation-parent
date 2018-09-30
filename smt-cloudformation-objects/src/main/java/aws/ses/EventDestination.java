
package aws.ses;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EventDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudWatchDestination",
    "Enabled",
    "MatchingEventTypes",
    "Name",
    "KinesisFirehoseDestination"
})
public class EventDestination {

    /**
     * CloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
     * 
     */
    @JsonProperty("CloudWatchDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html")
    private CloudWatchDestination cloudWatchDestination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled")
    private Boolean enabled;
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
     * KinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
     * 
     */
    @JsonProperty("KinesisFirehoseDestination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html")
    private KinesisFirehoseDestination kinesisFirehoseDestination;

    /**
     * CloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
     * 
     */
    public CloudWatchDestination getCloudWatchDestination() {
        return cloudWatchDestination;
    }

    /**
     * CloudWatchDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html
     * 
     */
    public void setCloudWatchDestination(CloudWatchDestination cloudWatchDestination) {
        this.cloudWatchDestination = cloudWatchDestination;
    }

    public EventDestination withCloudWatchDestination(CloudWatchDestination cloudWatchDestination) {
        this.cloudWatchDestination = cloudWatchDestination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public EventDestination withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes
     * 
     */
    public List<CharSequence> getMatchingEventTypes() {
        return matchingEventTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-matchingeventtypes
     * 
     */
    public void setMatchingEventTypes(List<CharSequence> matchingEventTypes) {
        this.matchingEventTypes = matchingEventTypes;
    }

    public EventDestination withMatchingEventTypes(List<CharSequence> matchingEventTypes) {
        this.matchingEventTypes = matchingEventTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-eventdestination.html#cfn-ses-configurationseteventdestination-eventdestination-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public EventDestination withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * KinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
     * 
     */
    public KinesisFirehoseDestination getKinesisFirehoseDestination() {
        return kinesisFirehoseDestination;
    }

    /**
     * KinesisFirehoseDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-kinesisfirehosedestination.html
     * 
     */
    public void setKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
    }

    public EventDestination withKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
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
        if ((other instanceof EventDestination) == false) {
            return false;
        }
        EventDestination rhs = ((EventDestination) other);
        return new EqualsBuilder().append(name, rhs.name).append(cloudWatchDestination, rhs.cloudWatchDestination).append(kinesisFirehoseDestination, rhs.kinesisFirehoseDestination).append(enabled, rhs.enabled).append(matchingEventTypes, rhs.matchingEventTypes).isEquals();
    }

}
