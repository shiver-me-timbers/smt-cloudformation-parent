
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
 * ChannelVideoSelectorSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VideoSelectorProgramId",
    "VideoSelectorPid"
})
public class ChannelVideoSelectorSettings implements Property<ChannelVideoSelectorSettings>
{

    /**
     * ChannelVideoSelectorProgramId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html
     * 
     */
    @JsonProperty("VideoSelectorProgramId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html")
    private Property<ChannelVideoSelectorProgramId> videoSelectorProgramId;
    /**
     * ChannelVideoSelectorPid
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html
     * 
     */
    @JsonProperty("VideoSelectorPid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html")
    private Property<ChannelVideoSelectorPid> videoSelectorPid;

    /**
     * ChannelVideoSelectorProgramId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html
     * 
     */
    @JsonIgnore
    public Property<ChannelVideoSelectorProgramId> getVideoSelectorProgramId() {
        return videoSelectorProgramId;
    }

    /**
     * ChannelVideoSelectorProgramId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html
     * 
     */
    @JsonIgnore
    public void setVideoSelectorProgramId(Property<ChannelVideoSelectorProgramId> videoSelectorProgramId) {
        this.videoSelectorProgramId = videoSelectorProgramId;
    }

    public ChannelVideoSelectorSettings withVideoSelectorProgramId(Property<ChannelVideoSelectorProgramId> videoSelectorProgramId) {
        this.videoSelectorProgramId = videoSelectorProgramId;
        return this;
    }

    /**
     * ChannelVideoSelectorPid
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html
     * 
     */
    @JsonIgnore
    public Property<ChannelVideoSelectorPid> getVideoSelectorPid() {
        return videoSelectorPid;
    }

    /**
     * ChannelVideoSelectorPid
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html
     * 
     */
    @JsonIgnore
    public void setVideoSelectorPid(Property<ChannelVideoSelectorPid> videoSelectorPid) {
        this.videoSelectorPid = videoSelectorPid;
    }

    public ChannelVideoSelectorSettings withVideoSelectorPid(Property<ChannelVideoSelectorPid> videoSelectorPid) {
        this.videoSelectorPid = videoSelectorPid;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("videoSelectorProgramId", videoSelectorProgramId).append("videoSelectorPid", videoSelectorPid).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(videoSelectorPid).append(videoSelectorProgramId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelVideoSelectorSettings) == false) {
            return false;
        }
        ChannelVideoSelectorSettings rhs = ((ChannelVideoSelectorSettings) other);
        return new EqualsBuilder().append(videoSelectorPid, rhs.videoSelectorPid).append(videoSelectorProgramId, rhs.videoSelectorProgramId).isEquals();
    }

}
