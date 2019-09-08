
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
 * ChannelAudioPidSelection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Pid"
})
public class ChannelAudioPidSelection implements Property<ChannelAudioPidSelection>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html#cfn-medialive-channel-audiopidselection-pid
     * 
     */
    @JsonProperty("Pid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html#cfn-medialive-channel-audiopidselection-pid")
    private Number pid;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html#cfn-medialive-channel-audiopidselection-pid
     * 
     */
    @JsonIgnore
    public Number getPid() {
        return pid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiopidselection.html#cfn-medialive-channel-audiopidselection-pid
     * 
     */
    @JsonIgnore
    public void setPid(Number pid) {
        this.pid = pid;
    }

    public ChannelAudioPidSelection withPid(Number pid) {
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
        if ((other instanceof ChannelAudioPidSelection) == false) {
            return false;
        }
        ChannelAudioPidSelection rhs = ((ChannelAudioPidSelection) other);
        return new EqualsBuilder().append(pid, rhs.pid).isEquals();
    }

}
