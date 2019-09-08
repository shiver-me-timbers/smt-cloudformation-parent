
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
 * ChannelVideoSelectorPid
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Pid"
})
public class ChannelVideoSelectorPid implements Property<ChannelVideoSelectorPid>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html#cfn-medialive-channel-videoselectorpid-pid
     * 
     */
    @JsonProperty("Pid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html#cfn-medialive-channel-videoselectorpid-pid")
    private Number pid;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html#cfn-medialive-channel-videoselectorpid-pid
     * 
     */
    @JsonIgnore
    public Number getPid() {
        return pid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorpid.html#cfn-medialive-channel-videoselectorpid-pid
     * 
     */
    @JsonIgnore
    public void setPid(Number pid) {
        this.pid = pid;
    }

    public ChannelVideoSelectorPid withPid(Number pid) {
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
        if ((other instanceof ChannelVideoSelectorPid) == false) {
            return false;
        }
        ChannelVideoSelectorPid rhs = ((ChannelVideoSelectorPid) other);
        return new EqualsBuilder().append(pid, rhs.pid).isEquals();
    }

}
