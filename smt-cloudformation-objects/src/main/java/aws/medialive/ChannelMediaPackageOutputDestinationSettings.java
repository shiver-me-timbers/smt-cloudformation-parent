
package aws.medialive;

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
 * ChannelMediaPackageOutputDestinationSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputdestinationsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ChannelId"
})
public class ChannelMediaPackageOutputDestinationSettings implements Property<ChannelMediaPackageOutputDestinationSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputdestinationsettings.html#cfn-medialive-channel-mediapackageoutputdestinationsettings-channelid
     * 
     */
    @JsonProperty("ChannelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputdestinationsettings.html#cfn-medialive-channel-mediapackageoutputdestinationsettings-channelid")
    private CharSequence channelId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputdestinationsettings.html#cfn-medialive-channel-mediapackageoutputdestinationsettings-channelid
     * 
     */
    @JsonIgnore
    public CharSequence getChannelId() {
        return channelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputdestinationsettings.html#cfn-medialive-channel-mediapackageoutputdestinationsettings-channelid
     * 
     */
    @JsonIgnore
    public void setChannelId(CharSequence channelId) {
        this.channelId = channelId;
    }

    public ChannelMediaPackageOutputDestinationSettings withChannelId(CharSequence channelId) {
        this.channelId = channelId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("channelId", channelId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(channelId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelMediaPackageOutputDestinationSettings) == false) {
            return false;
        }
        ChannelMediaPackageOutputDestinationSettings rhs = ((ChannelMediaPackageOutputDestinationSettings) other);
        return new EqualsBuilder().append(channelId, rhs.channelId).isEquals();
    }

}
