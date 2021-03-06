
package shiver.me.timbers.aws.ecs;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * TaskDefinitionTmpfs
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContainerPath",
    "MountOptions",
    "Size"
})
public class TaskDefinitionTmpfs implements Property<TaskDefinitionTmpfs>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath
     * 
     */
    @JsonProperty("ContainerPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath")
    private CharSequence containerPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions
     * 
     */
    @JsonProperty("MountOptions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions")
    private Set<CharSequence> mountOptions = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size
     * 
     */
    @JsonProperty("Size")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size")
    private Number size;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath
     * 
     */
    @JsonIgnore
    public CharSequence getContainerPath() {
        return containerPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath
     * 
     */
    @JsonIgnore
    public void setContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
    }

    public TaskDefinitionTmpfs withContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getMountOptions() {
        return mountOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions
     * 
     */
    @JsonIgnore
    public void setMountOptions(Set<CharSequence> mountOptions) {
        this.mountOptions = mountOptions;
    }

    public TaskDefinitionTmpfs withMountOptions(Set<CharSequence> mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size
     * 
     */
    @JsonIgnore
    public Number getSize() {
        return size;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size
     * 
     */
    @JsonIgnore
    public void setSize(Number size) {
        this.size = size;
    }

    public TaskDefinitionTmpfs withSize(Number size) {
        this.size = size;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerPath", containerPath).append("mountOptions", mountOptions).append("size", size).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mountOptions).append(containerPath).append(size).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionTmpfs) == false) {
            return false;
        }
        TaskDefinitionTmpfs rhs = ((TaskDefinitionTmpfs) other);
        return new EqualsBuilder().append(mountOptions, rhs.mountOptions).append(containerPath, rhs.containerPath).append(size, rhs.size).isEquals();
    }

}
