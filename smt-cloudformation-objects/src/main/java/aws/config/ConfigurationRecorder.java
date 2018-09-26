
package aws.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ConfigurationRecorder
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "RecordingGroup",
    "RoleARN"
})
public class ConfigurationRecorder {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name")
    private CharSequence name;
    /**
     * RecordingGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html
     * 
     */
    @JsonProperty("RecordingGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html")
    private RecordingGroup recordingGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn")
    private CharSequence roleARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ConfigurationRecorder withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * RecordingGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html
     * 
     */
    public RecordingGroup getRecordingGroup() {
        return recordingGroup;
    }

    /**
     * RecordingGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationrecorder-recordinggroup.html
     * 
     */
    public void setRecordingGroup(RecordingGroup recordingGroup) {
        this.recordingGroup = recordingGroup;
    }

    public ConfigurationRecorder withRecordingGroup(RecordingGroup recordingGroup) {
        this.recordingGroup = recordingGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn
     * 
     */
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationrecorder.html#cfn-config-configurationrecorder-rolearn
     * 
     */
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public ConfigurationRecorder withRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("recordingGroup", recordingGroup).append("roleARN", roleARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(recordingGroup).append(roleARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationRecorder) == false) {
            return false;
        }
        ConfigurationRecorder rhs = ((ConfigurationRecorder) other);
        return new EqualsBuilder().append(name, rhs.name).append(recordingGroup, rhs.recordingGroup).append(roleARN, rhs.roleARN).isEquals();
    }

}
