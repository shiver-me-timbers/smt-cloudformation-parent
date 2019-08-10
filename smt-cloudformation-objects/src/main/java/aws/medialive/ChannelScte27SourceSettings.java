
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
 * ChannelScte27SourceSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Pid"
})
public class ChannelScte27SourceSettings implements Property<ChannelScte27SourceSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html#cfn-medialive-channel-scte27sourcesettings-pid
     * 
     */
    @JsonProperty("Pid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html#cfn-medialive-channel-scte27sourcesettings-pid")
    private Number pid;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html#cfn-medialive-channel-scte27sourcesettings-pid
     * 
     */
    @JsonIgnore
    public Number getPid() {
        return pid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-scte27sourcesettings.html#cfn-medialive-channel-scte27sourcesettings-pid
     * 
     */
    @JsonIgnore
    public void setPid(Number pid) {
        this.pid = pid;
    }

    public ChannelScte27SourceSettings withPid(Number pid) {
        this.pid = pid;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pid", pid).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pid).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelScte27SourceSettings) == false) {
            return false;
        }
        ChannelScte27SourceSettings rhs = ((ChannelScte27SourceSettings) other);
        return new EqualsBuilder().append(pid, rhs.pid).isEquals();
    }

}
