
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
 * ChannelHlsInputSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BufferSegments",
    "Retries",
    "Bandwidth",
    "RetryInterval"
})
public class ChannelHlsInputSettings implements Property<ChannelHlsInputSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-buffersegments
     * 
     */
    @JsonProperty("BufferSegments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-buffersegments")
    private Number bufferSegments;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-retries
     * 
     */
    @JsonProperty("Retries")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-retries")
    private Number retries;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-bandwidth
     * 
     */
    @JsonProperty("Bandwidth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-bandwidth")
    private Number bandwidth;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-retryinterval
     * 
     */
    @JsonProperty("RetryInterval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-retryinterval")
    private Number retryInterval;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-buffersegments
     * 
     */
    @JsonIgnore
    public Number getBufferSegments() {
        return bufferSegments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-buffersegments
     * 
     */
    @JsonIgnore
    public void setBufferSegments(Number bufferSegments) {
        this.bufferSegments = bufferSegments;
    }

    public ChannelHlsInputSettings withBufferSegments(Number bufferSegments) {
        this.bufferSegments = bufferSegments;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-retries
     * 
     */
    @JsonIgnore
    public Number getRetries() {
        return retries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-retries
     * 
     */
    @JsonIgnore
    public void setRetries(Number retries) {
        this.retries = retries;
    }

    public ChannelHlsInputSettings withRetries(Number retries) {
        this.retries = retries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-bandwidth
     * 
     */
    @JsonIgnore
    public Number getBandwidth() {
        return bandwidth;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-bandwidth
     * 
     */
    @JsonIgnore
    public void setBandwidth(Number bandwidth) {
        this.bandwidth = bandwidth;
    }

    public ChannelHlsInputSettings withBandwidth(Number bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-retryinterval
     * 
     */
    @JsonIgnore
    public Number getRetryInterval() {
        return retryInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html#cfn-medialive-channel-hlsinputsettings-retryinterval
     * 
     */
    @JsonIgnore
    public void setRetryInterval(Number retryInterval) {
        this.retryInterval = retryInterval;
    }

    public ChannelHlsInputSettings withRetryInterval(Number retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bufferSegments", bufferSegments).append("retries", retries).append("bandwidth", bandwidth).append("retryInterval", retryInterval).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(retries).append(retryInterval).append(bufferSegments).append(bandwidth).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelHlsInputSettings) == false) {
            return false;
        }
        ChannelHlsInputSettings rhs = ((ChannelHlsInputSettings) other);
        return new EqualsBuilder().append(retries, rhs.retries).append(retryInterval, rhs.retryInterval).append(bufferSegments, rhs.bufferSegments).append(bandwidth, rhs.bandwidth).isEquals();
    }

}
