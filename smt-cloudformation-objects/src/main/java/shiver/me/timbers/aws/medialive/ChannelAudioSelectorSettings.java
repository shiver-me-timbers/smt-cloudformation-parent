
package shiver.me.timbers.aws.medialive;

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
 * ChannelAudioSelectorSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audioselectorsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AudioPidSelection",
    "AudioLanguageSelection"
})
public class ChannelAudioSelectorSettings implements Property<ChannelAudioSelectorSettings>
{

    /**
     * ChannelAudioPidSelection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html
     * 
     */
    @JsonProperty("AudioPidSelection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html")
    private Property<ChannelAudioPidSelection> audioPidSelection;
    /**
     * ChannelAudioLanguageSelection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html
     * 
     */
    @JsonProperty("AudioLanguageSelection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html")
    private Property<ChannelAudioLanguageSelection> audioLanguageSelection;

    /**
     * ChannelAudioPidSelection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html
     * 
     */
    @JsonIgnore
    public Property<ChannelAudioPidSelection> getAudioPidSelection() {
        return audioPidSelection;
    }

    /**
     * ChannelAudioPidSelection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html
     * 
     */
    @JsonIgnore
    public void setAudioPidSelection(Property<ChannelAudioPidSelection> audioPidSelection) {
        this.audioPidSelection = audioPidSelection;
    }

    public ChannelAudioSelectorSettings withAudioPidSelection(Property<ChannelAudioPidSelection> audioPidSelection) {
        this.audioPidSelection = audioPidSelection;
        return this;
    }

    /**
     * ChannelAudioLanguageSelection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html
     * 
     */
    @JsonIgnore
    public Property<ChannelAudioLanguageSelection> getAudioLanguageSelection() {
        return audioLanguageSelection;
    }

    /**
     * ChannelAudioLanguageSelection
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html
     * 
     */
    @JsonIgnore
    public void setAudioLanguageSelection(Property<ChannelAudioLanguageSelection> audioLanguageSelection) {
        this.audioLanguageSelection = audioLanguageSelection;
    }

    public ChannelAudioSelectorSettings withAudioLanguageSelection(Property<ChannelAudioLanguageSelection> audioLanguageSelection) {
        this.audioLanguageSelection = audioLanguageSelection;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("audioPidSelection", audioPidSelection).append("audioLanguageSelection", audioLanguageSelection).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(audioLanguageSelection).append(audioPidSelection).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelAudioSelectorSettings) == false) {
            return false;
        }
        ChannelAudioSelectorSettings rhs = ((ChannelAudioSelectorSettings) other);
        return new EqualsBuilder().append(audioLanguageSelection, rhs.audioLanguageSelection).append(audioPidSelection, rhs.audioPidSelection).isEquals();
    }

}
