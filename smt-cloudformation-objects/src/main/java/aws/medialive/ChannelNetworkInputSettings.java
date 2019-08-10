
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
 * ChannelNetworkInputSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ServerValidation",
    "HlsInputSettings"
})
public class ChannelNetworkInputSettings implements Property<ChannelNetworkInputSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html#cfn-medialive-channel-networkinputsettings-servervalidation
     * 
     */
    @JsonProperty("ServerValidation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html#cfn-medialive-channel-networkinputsettings-servervalidation")
    private CharSequence serverValidation;
    /**
     * ChannelHlsInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html
     * 
     */
    @JsonProperty("HlsInputSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html")
    private Property<ChannelHlsInputSettings> hlsInputSettings;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html#cfn-medialive-channel-networkinputsettings-servervalidation
     * 
     */
    @JsonIgnore
    public CharSequence getServerValidation() {
        return serverValidation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html#cfn-medialive-channel-networkinputsettings-servervalidation
     * 
     */
    @JsonIgnore
    public void setServerValidation(CharSequence serverValidation) {
        this.serverValidation = serverValidation;
    }

    public ChannelNetworkInputSettings withServerValidation(CharSequence serverValidation) {
        this.serverValidation = serverValidation;
        return this;
    }

    /**
     * ChannelHlsInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelHlsInputSettings> getHlsInputSettings() {
        return hlsInputSettings;
    }

    /**
     * ChannelHlsInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html
     * 
     */
    @JsonIgnore
    public void setHlsInputSettings(Property<ChannelHlsInputSettings> hlsInputSettings) {
        this.hlsInputSettings = hlsInputSettings;
    }

    public ChannelNetworkInputSettings withHlsInputSettings(Property<ChannelHlsInputSettings> hlsInputSettings) {
        this.hlsInputSettings = hlsInputSettings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serverValidation", serverValidation).append("hlsInputSettings", hlsInputSettings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hlsInputSettings).append(serverValidation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelNetworkInputSettings) == false) {
            return false;
        }
        ChannelNetworkInputSettings rhs = ((ChannelNetworkInputSettings) other);
        return new EqualsBuilder().append(hlsInputSettings, rhs.hlsInputSettings).append(serverValidation, rhs.serverValidation).isEquals();
    }

}
