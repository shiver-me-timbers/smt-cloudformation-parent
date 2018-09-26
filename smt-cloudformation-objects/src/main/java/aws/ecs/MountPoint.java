
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * MountPoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContainerPath",
    "ReadOnly",
    "SourceVolume"
})
public class MountPoint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-containerpath
     * 
     */
    @JsonProperty("ContainerPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-containerpath")
    private CharSequence containerPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-readonly
     * 
     */
    @JsonProperty("ReadOnly")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-readonly")
    private Boolean readOnly;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-sourcevolume
     * 
     */
    @JsonProperty("SourceVolume")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-sourcevolume")
    private CharSequence sourceVolume;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-containerpath
     * 
     */
    public CharSequence getContainerPath() {
        return containerPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-containerpath
     * 
     */
    public void setContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
    }

    public MountPoint withContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-readonly
     * 
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-readonly
     * 
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public MountPoint withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-sourcevolume
     * 
     */
    public CharSequence getSourceVolume() {
        return sourceVolume;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-mountpoints.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints-sourcevolume
     * 
     */
    public void setSourceVolume(CharSequence sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    public MountPoint withSourceVolume(CharSequence sourceVolume) {
        this.sourceVolume = sourceVolume;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerPath", containerPath).append("readOnly", readOnly).append("sourceVolume", sourceVolume).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(readOnly).append(containerPath).append(sourceVolume).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MountPoint) == false) {
            return false;
        }
        MountPoint rhs = ((MountPoint) other);
        return new EqualsBuilder().append(readOnly, rhs.readOnly).append(containerPath, rhs.containerPath).append(sourceVolume, rhs.sourceVolume).isEquals();
    }

}
