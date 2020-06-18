
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
 * ChannelMultiplexProgramChannelDestinationSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MultiplexId",
    "ProgramName"
})
public class ChannelMultiplexProgramChannelDestinationSettings implements Property<ChannelMultiplexProgramChannelDestinationSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html#cfn-medialive-channel-multiplexprogramchanneldestinationsettings-multiplexid
     * 
     */
    @JsonProperty("MultiplexId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html#cfn-medialive-channel-multiplexprogramchanneldestinationsettings-multiplexid")
    private CharSequence multiplexId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html#cfn-medialive-channel-multiplexprogramchanneldestinationsettings-programname
     * 
     */
    @JsonProperty("ProgramName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html#cfn-medialive-channel-multiplexprogramchanneldestinationsettings-programname")
    private CharSequence programName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html#cfn-medialive-channel-multiplexprogramchanneldestinationsettings-multiplexid
     * 
     */
    @JsonIgnore
    public CharSequence getMultiplexId() {
        return multiplexId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html#cfn-medialive-channel-multiplexprogramchanneldestinationsettings-multiplexid
     * 
     */
    @JsonIgnore
    public void setMultiplexId(CharSequence multiplexId) {
        this.multiplexId = multiplexId;
    }

    public ChannelMultiplexProgramChannelDestinationSettings withMultiplexId(CharSequence multiplexId) {
        this.multiplexId = multiplexId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html#cfn-medialive-channel-multiplexprogramchanneldestinationsettings-programname
     * 
     */
    @JsonIgnore
    public CharSequence getProgramName() {
        return programName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-multiplexprogramchanneldestinationsettings.html#cfn-medialive-channel-multiplexprogramchanneldestinationsettings-programname
     * 
     */
    @JsonIgnore
    public void setProgramName(CharSequence programName) {
        this.programName = programName;
    }

    public ChannelMultiplexProgramChannelDestinationSettings withProgramName(CharSequence programName) {
        this.programName = programName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("multiplexId", multiplexId).append("programName", programName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(multiplexId).append(programName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelMultiplexProgramChannelDestinationSettings) == false) {
            return false;
        }
        ChannelMultiplexProgramChannelDestinationSettings rhs = ((ChannelMultiplexProgramChannelDestinationSettings) other);
        return new EqualsBuilder().append(multiplexId, rhs.multiplexId).append(programName, rhs.programName).isEquals();
    }

}
