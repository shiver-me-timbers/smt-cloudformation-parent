
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
 * ChannelDvbSubSourceSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Pid"
})
public class ChannelDvbSubSourceSettings implements Property<ChannelDvbSubSourceSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html#cfn-medialive-channel-dvbsubsourcesettings-pid
     * 
     */
    @JsonProperty("Pid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html#cfn-medialive-channel-dvbsubsourcesettings-pid")
    private Number pid;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html#cfn-medialive-channel-dvbsubsourcesettings-pid
     * 
     */
    @JsonIgnore
    public Number getPid() {
        return pid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubsourcesettings.html#cfn-medialive-channel-dvbsubsourcesettings-pid
     * 
     */
    @JsonIgnore
    public void setPid(Number pid) {
        this.pid = pid;
    }

    public ChannelDvbSubSourceSettings withPid(Number pid) {
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
        if ((other instanceof ChannelDvbSubSourceSettings) == false) {
            return false;
        }
        ChannelDvbSubSourceSettings rhs = ((ChannelDvbSubSourceSettings) other);
        return new EqualsBuilder().append(pid, rhs.pid).isEquals();
    }

}
