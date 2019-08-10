
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
 * ChannelVideoSelector
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SelectorSettings",
    "ColorSpace",
    "ColorSpaceUsage"
})
public class ChannelVideoSelector implements Property<ChannelVideoSelector>
{

    /**
     * ChannelVideoSelectorSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorsettings.html
     * 
     */
    @JsonProperty("SelectorSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorsettings.html")
    private Property<ChannelVideoSelectorSettings> selectorSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html#cfn-medialive-channel-videoselector-colorspace
     * 
     */
    @JsonProperty("ColorSpace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html#cfn-medialive-channel-videoselector-colorspace")
    private CharSequence colorSpace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html#cfn-medialive-channel-videoselector-colorspaceusage
     * 
     */
    @JsonProperty("ColorSpaceUsage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html#cfn-medialive-channel-videoselector-colorspaceusage")
    private CharSequence colorSpaceUsage;

    /**
     * ChannelVideoSelectorSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorsettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelVideoSelectorSettings> getSelectorSettings() {
        return selectorSettings;
    }

    /**
     * ChannelVideoSelectorSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorsettings.html
     * 
     */
    @JsonIgnore
    public void setSelectorSettings(Property<ChannelVideoSelectorSettings> selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    public ChannelVideoSelector withSelectorSettings(Property<ChannelVideoSelectorSettings> selectorSettings) {
        this.selectorSettings = selectorSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html#cfn-medialive-channel-videoselector-colorspace
     * 
     */
    @JsonIgnore
    public CharSequence getColorSpace() {
        return colorSpace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html#cfn-medialive-channel-videoselector-colorspace
     * 
     */
    @JsonIgnore
    public void setColorSpace(CharSequence colorSpace) {
        this.colorSpace = colorSpace;
    }

    public ChannelVideoSelector withColorSpace(CharSequence colorSpace) {
        this.colorSpace = colorSpace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html#cfn-medialive-channel-videoselector-colorspaceusage
     * 
     */
    @JsonIgnore
    public CharSequence getColorSpaceUsage() {
        return colorSpaceUsage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html#cfn-medialive-channel-videoselector-colorspaceusage
     * 
     */
    @JsonIgnore
    public void setColorSpaceUsage(CharSequence colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage;
    }

    public ChannelVideoSelector withColorSpaceUsage(CharSequence colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("selectorSettings", selectorSettings).append("colorSpace", colorSpace).append("colorSpaceUsage", colorSpaceUsage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(colorSpace).append(selectorSettings).append(colorSpaceUsage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelVideoSelector) == false) {
            return false;
        }
        ChannelVideoSelector rhs = ((ChannelVideoSelector) other);
        return new EqualsBuilder().append(colorSpace, rhs.colorSpace).append(selectorSettings, rhs.selectorSettings).append(colorSpaceUsage, rhs.colorSpaceUsage).isEquals();
    }

}
