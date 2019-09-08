
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
 * ChannelInputSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeblockFilter",
    "FilterStrength",
    "InputFilter",
    "SourceEndBehavior",
    "VideoSelector",
    "AudioSelectors",
    "CaptionSelectors",
    "DenoiseFilter",
    "NetworkInputSettings"
})
public class ChannelInputSettings implements Property<ChannelInputSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-deblockfilter
     * 
     */
    @JsonProperty("DeblockFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-deblockfilter")
    private CharSequence deblockFilter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-filterstrength
     * 
     */
    @JsonProperty("FilterStrength")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-filterstrength")
    private Number filterStrength;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-inputfilter
     * 
     */
    @JsonProperty("InputFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-inputfilter")
    private CharSequence inputFilter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-sourceendbehavior
     * 
     */
    @JsonProperty("SourceEndBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-sourceendbehavior")
    private CharSequence sourceEndBehavior;
    /**
     * ChannelVideoSelector
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html
     * 
     */
    @JsonProperty("VideoSelector")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html")
    private Property<ChannelVideoSelector> videoSelector;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-audioselectors
     * 
     */
    @JsonProperty("AudioSelectors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-audioselectors")
    private List<Property<ChannelAudioSelector>> audioSelectors = new ArrayList<Property<ChannelAudioSelector>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-captionselectors
     * 
     */
    @JsonProperty("CaptionSelectors")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-captionselectors")
    private List<Property<ChannelCaptionSelector>> captionSelectors = new ArrayList<Property<ChannelCaptionSelector>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-denoisefilter
     * 
     */
    @JsonProperty("DenoiseFilter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-denoisefilter")
    private CharSequence denoiseFilter;
    /**
     * ChannelNetworkInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html
     * 
     */
    @JsonProperty("NetworkInputSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html")
    private Property<ChannelNetworkInputSettings> networkInputSettings;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-deblockfilter
     * 
     */
    @JsonIgnore
    public CharSequence getDeblockFilter() {
        return deblockFilter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-deblockfilter
     * 
     */
    @JsonIgnore
    public void setDeblockFilter(CharSequence deblockFilter) {
        this.deblockFilter = deblockFilter;
    }

    public ChannelInputSettings withDeblockFilter(CharSequence deblockFilter) {
        this.deblockFilter = deblockFilter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-filterstrength
     * 
     */
    @JsonIgnore
    public Number getFilterStrength() {
        return filterStrength;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-filterstrength
     * 
     */
    @JsonIgnore
    public void setFilterStrength(Number filterStrength) {
        this.filterStrength = filterStrength;
    }

    public ChannelInputSettings withFilterStrength(Number filterStrength) {
        this.filterStrength = filterStrength;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-inputfilter
     * 
     */
    @JsonIgnore
    public CharSequence getInputFilter() {
        return inputFilter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-inputfilter
     * 
     */
    @JsonIgnore
    public void setInputFilter(CharSequence inputFilter) {
        this.inputFilter = inputFilter;
    }

    public ChannelInputSettings withInputFilter(CharSequence inputFilter) {
        this.inputFilter = inputFilter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-sourceendbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getSourceEndBehavior() {
        return sourceEndBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-sourceendbehavior
     * 
     */
    @JsonIgnore
    public void setSourceEndBehavior(CharSequence sourceEndBehavior) {
        this.sourceEndBehavior = sourceEndBehavior;
    }

    public ChannelInputSettings withSourceEndBehavior(CharSequence sourceEndBehavior) {
        this.sourceEndBehavior = sourceEndBehavior;
        return this;
    }

    /**
     * ChannelVideoSelector
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html
     * 
     */
    @JsonIgnore
    public Property<ChannelVideoSelector> getVideoSelector() {
        return videoSelector;
    }

    /**
     * ChannelVideoSelector
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselector.html
     * 
     */
    @JsonIgnore
    public void setVideoSelector(Property<ChannelVideoSelector> videoSelector) {
        this.videoSelector = videoSelector;
    }

    public ChannelInputSettings withVideoSelector(Property<ChannelVideoSelector> videoSelector) {
        this.videoSelector = videoSelector;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-audioselectors
     * 
     */
    @JsonIgnore
    public List<Property<ChannelAudioSelector>> getAudioSelectors() {
        return audioSelectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-audioselectors
     * 
     */
    @JsonIgnore
    public void setAudioSelectors(List<Property<ChannelAudioSelector>> audioSelectors) {
        this.audioSelectors = audioSelectors;
    }

    public ChannelInputSettings withAudioSelectors(List<Property<ChannelAudioSelector>> audioSelectors) {
        this.audioSelectors = audioSelectors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-captionselectors
     * 
     */
    @JsonIgnore
    public List<Property<ChannelCaptionSelector>> getCaptionSelectors() {
        return captionSelectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-captionselectors
     * 
     */
    @JsonIgnore
    public void setCaptionSelectors(List<Property<ChannelCaptionSelector>> captionSelectors) {
        this.captionSelectors = captionSelectors;
    }

    public ChannelInputSettings withCaptionSelectors(List<Property<ChannelCaptionSelector>> captionSelectors) {
        this.captionSelectors = captionSelectors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-denoisefilter
     * 
     */
    @JsonIgnore
    public CharSequence getDenoiseFilter() {
        return denoiseFilter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputsettings.html#cfn-medialive-channel-inputsettings-denoisefilter
     * 
     */
    @JsonIgnore
    public void setDenoiseFilter(CharSequence denoiseFilter) {
        this.denoiseFilter = denoiseFilter;
    }

    public ChannelInputSettings withDenoiseFilter(CharSequence denoiseFilter) {
        this.denoiseFilter = denoiseFilter;
        return this;
    }

    /**
     * ChannelNetworkInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelNetworkInputSettings> getNetworkInputSettings() {
        return networkInputSettings;
    }

    /**
     * ChannelNetworkInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html
     * 
     */
    @JsonIgnore
    public void setNetworkInputSettings(Property<ChannelNetworkInputSettings> networkInputSettings) {
        this.networkInputSettings = networkInputSettings;
    }

    public ChannelInputSettings withNetworkInputSettings(Property<ChannelNetworkInputSettings> networkInputSettings) {
        this.networkInputSettings = networkInputSettings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deblockFilter", deblockFilter).append("filterStrength", filterStrength).append("inputFilter", inputFilter).append("sourceEndBehavior", sourceEndBehavior).append("videoSelector", videoSelector).append("audioSelectors", audioSelectors).append("captionSelectors", captionSelectors).append("denoiseFilter", denoiseFilter).append("networkInputSettings", networkInputSettings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceEndBehavior).append(deblockFilter).append(audioSelectors).append(inputFilter).append(networkInputSettings).append(videoSelector).append(filterStrength).append(captionSelectors).append(denoiseFilter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelInputSettings) == false) {
            return false;
        }
        ChannelInputSettings rhs = ((ChannelInputSettings) other);
        return new EqualsBuilder().append(sourceEndBehavior, rhs.sourceEndBehavior).append(deblockFilter, rhs.deblockFilter).append(audioSelectors, rhs.audioSelectors).append(inputFilter, rhs.inputFilter).append(networkInputSettings, rhs.networkInputSettings).append(videoSelector, rhs.videoSelector).append(filterStrength, rhs.filterStrength).append(captionSelectors, rhs.captionSelectors).append(denoiseFilter, rhs.denoiseFilter).isEquals();
    }

}
