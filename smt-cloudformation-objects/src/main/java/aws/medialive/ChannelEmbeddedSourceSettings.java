
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
 * ChannelEmbeddedSourceSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Source608ChannelNumber",
    "Scte20Detection",
    "Source608TrackNumber",
    "Convert608To708"
})
public class ChannelEmbeddedSourceSettings implements Property<ChannelEmbeddedSourceSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-source608channelnumber
     * 
     */
    @JsonProperty("Source608ChannelNumber")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-source608channelnumber")
    private Number source608ChannelNumber;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-scte20detection
     * 
     */
    @JsonProperty("Scte20Detection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-scte20detection")
    private CharSequence scte20Detection;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-source608tracknumber
     * 
     */
    @JsonProperty("Source608TrackNumber")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-source608tracknumber")
    private Number source608TrackNumber;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-convert608to708
     * 
     */
    @JsonProperty("Convert608To708")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-convert608to708")
    private CharSequence convert608To708;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-source608channelnumber
     * 
     */
    @JsonIgnore
    public Number getSource608ChannelNumber() {
        return source608ChannelNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-source608channelnumber
     * 
     */
    @JsonIgnore
    public void setSource608ChannelNumber(Number source608ChannelNumber) {
        this.source608ChannelNumber = source608ChannelNumber;
    }

    public ChannelEmbeddedSourceSettings withSource608ChannelNumber(Number source608ChannelNumber) {
        this.source608ChannelNumber = source608ChannelNumber;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-scte20detection
     * 
     */
    @JsonIgnore
    public CharSequence getScte20Detection() {
        return scte20Detection;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-scte20detection
     * 
     */
    @JsonIgnore
    public void setScte20Detection(CharSequence scte20Detection) {
        this.scte20Detection = scte20Detection;
    }

    public ChannelEmbeddedSourceSettings withScte20Detection(CharSequence scte20Detection) {
        this.scte20Detection = scte20Detection;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-source608tracknumber
     * 
     */
    @JsonIgnore
    public Number getSource608TrackNumber() {
        return source608TrackNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-source608tracknumber
     * 
     */
    @JsonIgnore
    public void setSource608TrackNumber(Number source608TrackNumber) {
        this.source608TrackNumber = source608TrackNumber;
    }

    public ChannelEmbeddedSourceSettings withSource608TrackNumber(Number source608TrackNumber) {
        this.source608TrackNumber = source608TrackNumber;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-convert608to708
     * 
     */
    @JsonIgnore
    public CharSequence getConvert608To708() {
        return convert608To708;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddedsourcesettings.html#cfn-medialive-channel-embeddedsourcesettings-convert608to708
     * 
     */
    @JsonIgnore
    public void setConvert608To708(CharSequence convert608To708) {
        this.convert608To708 = convert608To708;
    }

    public ChannelEmbeddedSourceSettings withConvert608To708(CharSequence convert608To708) {
        this.convert608To708 = convert608To708;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("source608ChannelNumber", source608ChannelNumber).append("scte20Detection", scte20Detection).append("source608TrackNumber", source608TrackNumber).append("convert608To708", convert608To708).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(source608ChannelNumber).append(convert608To708).append(scte20Detection).append(source608TrackNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelEmbeddedSourceSettings) == false) {
            return false;
        }
        ChannelEmbeddedSourceSettings rhs = ((ChannelEmbeddedSourceSettings) other);
        return new EqualsBuilder().append(source608ChannelNumber, rhs.source608ChannelNumber).append(convert608To708, rhs.convert608To708).append(scte20Detection, rhs.scte20Detection).append(source608TrackNumber, rhs.source608TrackNumber).isEquals();
    }

}
