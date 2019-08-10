
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
 * ChannelCaptionSelectorSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselectorsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DvbSubSourceSettings",
    "Scte27SourceSettings",
    "AribSourceSettings",
    "EmbeddedSourceSettings",
    "Scte20SourceSettings",
    "TeletextSourceSettings"
})
public class ChannelCaptionSelectorSettings implements Property<ChannelCaptionSelectorSettings>
{

    /**
     * ChannelDvbSubSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html
     * 
     */
    @JsonProperty("DvbSubSourceSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html")
    private Property<ChannelDvbSubSourceSettings> dvbSubSourceSettings;
    /**
     * ChannelScte27SourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html
     * 
     */
    @JsonProperty("Scte27SourceSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html")
    private Property<ChannelScte27SourceSettings> scte27SourceSettings;
    /**
     * ChannelAribSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aribsourcesettings.html
     * 
     */
    @JsonProperty("AribSourceSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aribsourcesettings.html")
    private Property<ChannelAribSourceSettings> aribSourceSettings;
    /**
     * ChannelEmbeddedSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html
     * 
     */
    @JsonProperty("EmbeddedSourceSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html")
    private Property<ChannelEmbeddedSourceSettings> embeddedSourceSettings;
    /**
     * ChannelScte20SourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html
     * 
     */
    @JsonProperty("Scte20SourceSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html")
    private Property<ChannelScte20SourceSettings> scte20SourceSettings;
    /**
     * ChannelTeletextSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html
     * 
     */
    @JsonProperty("TeletextSourceSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html")
    private Property<ChannelTeletextSourceSettings> teletextSourceSettings;

    /**
     * ChannelDvbSubSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelDvbSubSourceSettings> getDvbSubSourceSettings() {
        return dvbSubSourceSettings;
    }

    /**
     * ChannelDvbSubSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html
     * 
     */
    @JsonIgnore
    public void setDvbSubSourceSettings(Property<ChannelDvbSubSourceSettings> dvbSubSourceSettings) {
        this.dvbSubSourceSettings = dvbSubSourceSettings;
    }

    public ChannelCaptionSelectorSettings withDvbSubSourceSettings(Property<ChannelDvbSubSourceSettings> dvbSubSourceSettings) {
        this.dvbSubSourceSettings = dvbSubSourceSettings;
        return this;
    }

    /**
     * ChannelScte27SourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelScte27SourceSettings> getScte27SourceSettings() {
        return scte27SourceSettings;
    }

    /**
     * ChannelScte27SourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html
     * 
     */
    @JsonIgnore
    public void setScte27SourceSettings(Property<ChannelScte27SourceSettings> scte27SourceSettings) {
        this.scte27SourceSettings = scte27SourceSettings;
    }

    public ChannelCaptionSelectorSettings withScte27SourceSettings(Property<ChannelScte27SourceSettings> scte27SourceSettings) {
        this.scte27SourceSettings = scte27SourceSettings;
        return this;
    }

    /**
     * ChannelAribSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aribsourcesettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelAribSourceSettings> getAribSourceSettings() {
        return aribSourceSettings;
    }

    /**
     * ChannelAribSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-aribsourcesettings.html
     * 
     */
    @JsonIgnore
    public void setAribSourceSettings(Property<ChannelAribSourceSettings> aribSourceSettings) {
        this.aribSourceSettings = aribSourceSettings;
    }

    public ChannelCaptionSelectorSettings withAribSourceSettings(Property<ChannelAribSourceSettings> aribSourceSettings) {
        this.aribSourceSettings = aribSourceSettings;
        return this;
    }

    /**
     * ChannelEmbeddedSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelEmbeddedSourceSettings> getEmbeddedSourceSettings() {
        return embeddedSourceSettings;
    }

    /**
     * ChannelEmbeddedSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html
     * 
     */
    @JsonIgnore
    public void setEmbeddedSourceSettings(Property<ChannelEmbeddedSourceSettings> embeddedSourceSettings) {
        this.embeddedSourceSettings = embeddedSourceSettings;
    }

    public ChannelCaptionSelectorSettings withEmbeddedSourceSettings(Property<ChannelEmbeddedSourceSettings> embeddedSourceSettings) {
        this.embeddedSourceSettings = embeddedSourceSettings;
        return this;
    }

    /**
     * ChannelScte20SourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelScte20SourceSettings> getScte20SourceSettings() {
        return scte20SourceSettings;
    }

    /**
     * ChannelScte20SourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html
     * 
     */
    @JsonIgnore
    public void setScte20SourceSettings(Property<ChannelScte20SourceSettings> scte20SourceSettings) {
        this.scte20SourceSettings = scte20SourceSettings;
    }

    public ChannelCaptionSelectorSettings withScte20SourceSettings(Property<ChannelScte20SourceSettings> scte20SourceSettings) {
        this.scte20SourceSettings = scte20SourceSettings;
        return this;
    }

    /**
     * ChannelTeletextSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelTeletextSourceSettings> getTeletextSourceSettings() {
        return teletextSourceSettings;
    }

    /**
     * ChannelTeletextSourceSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html
     * 
     */
    @JsonIgnore
    public void setTeletextSourceSettings(Property<ChannelTeletextSourceSettings> teletextSourceSettings) {
        this.teletextSourceSettings = teletextSourceSettings;
    }

    public ChannelCaptionSelectorSettings withTeletextSourceSettings(Property<ChannelTeletextSourceSettings> teletextSourceSettings) {
        this.teletextSourceSettings = teletextSourceSettings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dvbSubSourceSettings", dvbSubSourceSettings).append("scte27SourceSettings", scte27SourceSettings).append("aribSourceSettings", aribSourceSettings).append("embeddedSourceSettings", embeddedSourceSettings).append("scte20SourceSettings", scte20SourceSettings).append("teletextSourceSettings", teletextSourceSettings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(embeddedSourceSettings).append(scte20SourceSettings).append(dvbSubSourceSettings).append(aribSourceSettings).append(teletextSourceSettings).append(scte27SourceSettings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelCaptionSelectorSettings) == false) {
            return false;
        }
        ChannelCaptionSelectorSettings rhs = ((ChannelCaptionSelectorSettings) other);
        return new EqualsBuilder().append(embeddedSourceSettings, rhs.embeddedSourceSettings).append(scte20SourceSettings, rhs.scte20SourceSettings).append(dvbSubSourceSettings, rhs.dvbSubSourceSettings).append(aribSourceSettings, rhs.aribSourceSettings).append(teletextSourceSettings, rhs.teletextSourceSettings).append(scte27SourceSettings, rhs.scte27SourceSettings).isEquals();
    }

}
