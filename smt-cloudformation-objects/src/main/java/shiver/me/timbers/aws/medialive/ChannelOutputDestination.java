
package shiver.me.timbers.aws.medialive;

import java.util.ArrayList;
import java.util.List;
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
 * ChannelOutputDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Id",
    "Settings",
    "MediaPackageSettings"
})
public class ChannelOutputDestination implements Property<ChannelOutputDestination>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-settings
     * 
     */
    @JsonProperty("Settings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-settings")
    private List<Property<ChannelOutputDestinationSettings>> settings = new ArrayList<Property<ChannelOutputDestinationSettings>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-mediapackagesettings
     * 
     */
    @JsonProperty("MediaPackageSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-mediapackagesettings")
    private List<Property<ChannelMediaPackageOutputDestinationSettings>> mediaPackageSettings = new ArrayList<Property<ChannelMediaPackageOutputDestinationSettings>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public ChannelOutputDestination withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-settings
     * 
     */
    @JsonIgnore
    public List<Property<ChannelOutputDestinationSettings>> getSettings() {
        return settings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-settings
     * 
     */
    @JsonIgnore
    public void setSettings(List<Property<ChannelOutputDestinationSettings>> settings) {
        this.settings = settings;
    }

    public ChannelOutputDestination withSettings(List<Property<ChannelOutputDestinationSettings>> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-mediapackagesettings
     * 
     */
    @JsonIgnore
    public List<Property<ChannelMediaPackageOutputDestinationSettings>> getMediaPackageSettings() {
        return mediaPackageSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestination.html#cfn-medialive-channel-outputdestination-mediapackagesettings
     * 
     */
    @JsonIgnore
    public void setMediaPackageSettings(List<Property<ChannelMediaPackageOutputDestinationSettings>> mediaPackageSettings) {
        this.mediaPackageSettings = mediaPackageSettings;
    }

    public ChannelOutputDestination withMediaPackageSettings(List<Property<ChannelMediaPackageOutputDestinationSettings>> mediaPackageSettings) {
        this.mediaPackageSettings = mediaPackageSettings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("settings", settings).append("mediaPackageSettings", mediaPackageSettings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mediaPackageSettings).append(settings).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelOutputDestination) == false) {
            return false;
        }
        ChannelOutputDestination rhs = ((ChannelOutputDestination) other);
        return new EqualsBuilder().append(mediaPackageSettings, rhs.mediaPackageSettings).append(settings, rhs.settings).append(id, rhs.id).isEquals();
    }

}
