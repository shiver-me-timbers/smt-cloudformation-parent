
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
 * ChannelInputSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Codec",
    "MaximumBitrate",
    "Resolution"
})
public class ChannelInputSpecification implements Property<ChannelInputSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-codec
     * 
     */
    @JsonProperty("Codec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-codec")
    private CharSequence codec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-maximumbitrate
     * 
     */
    @JsonProperty("MaximumBitrate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-maximumbitrate")
    private CharSequence maximumBitrate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-resolution
     * 
     */
    @JsonProperty("Resolution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-resolution")
    private CharSequence resolution;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-codec
     * 
     */
    @JsonIgnore
    public CharSequence getCodec() {
        return codec;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-codec
     * 
     */
    @JsonIgnore
    public void setCodec(CharSequence codec) {
        this.codec = codec;
    }

    public ChannelInputSpecification withCodec(CharSequence codec) {
        this.codec = codec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-maximumbitrate
     * 
     */
    @JsonIgnore
    public CharSequence getMaximumBitrate() {
        return maximumBitrate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-maximumbitrate
     * 
     */
    @JsonIgnore
    public void setMaximumBitrate(CharSequence maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    public ChannelInputSpecification withMaximumBitrate(CharSequence maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-resolution
     * 
     */
    @JsonIgnore
    public CharSequence getResolution() {
        return resolution;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputspecification.html#cfn-medialive-channel-inputspecification-resolution
     * 
     */
    @JsonIgnore
    public void setResolution(CharSequence resolution) {
        this.resolution = resolution;
    }

    public ChannelInputSpecification withResolution(CharSequence resolution) {
        this.resolution = resolution;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codec", codec).append("maximumBitrate", maximumBitrate).append("resolution", resolution).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codec).append(resolution).append(maximumBitrate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelInputSpecification) == false) {
            return false;
        }
        ChannelInputSpecification rhs = ((ChannelInputSpecification) other);
        return new EqualsBuilder().append(codec, rhs.codec).append(resolution, rhs.resolution).append(maximumBitrate, rhs.maximumBitrate).isEquals();
    }

}
