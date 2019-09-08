
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
 * ChannelVideoSelectorProgramId
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ProgramId"
})
public class ChannelVideoSelectorProgramId implements Property<ChannelVideoSelectorProgramId>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html#cfn-medialive-channel-videoselectorprogramid-programid
     * 
     */
    @JsonProperty("ProgramId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html#cfn-medialive-channel-videoselectorprogramid-programid")
    private Number programId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html#cfn-medialive-channel-videoselectorprogramid-programid
     * 
     */
    @JsonIgnore
    public Number getProgramId() {
        return programId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html#cfn-medialive-channel-videoselectorprogramid-programid
     * 
     */
    @JsonIgnore
    public void setProgramId(Number programId) {
        this.programId = programId;
    }

    public ChannelVideoSelectorProgramId withProgramId(Number programId) {
        this.programId = programId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("programId", programId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(programId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelVideoSelectorProgramId) == false) {
            return false;
        }
        ChannelVideoSelectorProgramId rhs = ((ChannelVideoSelectorProgramId) other);
        return new EqualsBuilder().append(programId, rhs.programId).isEquals();
    }

}
