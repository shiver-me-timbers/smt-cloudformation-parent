
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
 * ChannelScte20SourceSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Source608ChannelNumber",
    "Convert608To708"
})
public class ChannelScte20SourceSettings implements Property<ChannelScte20SourceSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html#cfn-medialive-channel-scte20sourcesettings-source608channelnumber
     * 
     */
    @JsonProperty("Source608ChannelNumber")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html#cfn-medialive-channel-scte20sourcesettings-source608channelnumber")
    private Number source608ChannelNumber;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html#cfn-medialive-channel-scte20sourcesettings-convert608to708
     * 
     */
    @JsonProperty("Convert608To708")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html#cfn-medialive-channel-scte20sourcesettings-convert608to708")
    private CharSequence convert608To708;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html#cfn-medialive-channel-scte20sourcesettings-source608channelnumber
     * 
     */
    @JsonIgnore
    public Number getSource608ChannelNumber() {
        return source608ChannelNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html#cfn-medialive-channel-scte20sourcesettings-source608channelnumber
     * 
     */
    @JsonIgnore
    public void setSource608ChannelNumber(Number source608ChannelNumber) {
        this.source608ChannelNumber = source608ChannelNumber;
    }

    public ChannelScte20SourceSettings withSource608ChannelNumber(Number source608ChannelNumber) {
        this.source608ChannelNumber = source608ChannelNumber;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html#cfn-medialive-channel-scte20sourcesettings-convert608to708
     * 
     */
    @JsonIgnore
    public CharSequence getConvert608To708() {
        return convert608To708;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte20sourcesettings.html#cfn-medialive-channel-scte20sourcesettings-convert608to708
     * 
     */
    @JsonIgnore
    public void setConvert608To708(CharSequence convert608To708) {
        this.convert608To708 = convert608To708;
    }

    public ChannelScte20SourceSettings withConvert608To708(CharSequence convert608To708) {
        this.convert608To708 = convert608To708;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("source608ChannelNumber", source608ChannelNumber).append("convert608To708", convert608To708).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(source608ChannelNumber).append(convert608To708).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelScte20SourceSettings) == false) {
            return false;
        }
        ChannelScte20SourceSettings rhs = ((ChannelScte20SourceSettings) other);
        return new EqualsBuilder().append(source608ChannelNumber, rhs.source608ChannelNumber).append(convert608To708, rhs.convert608To708).isEquals();
    }

}
