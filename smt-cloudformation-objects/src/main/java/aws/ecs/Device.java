
package aws.ecs;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Device
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContainerPath",
    "HostPath",
    "Permissions"
})
public class Device {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath
     * 
     */
    @JsonProperty("ContainerPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath")
    private CharSequence containerPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath
     * 
     */
    @JsonProperty("HostPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath")
    private CharSequence hostPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions
     * 
     */
    @JsonProperty("Permissions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions")
    private Set<CharSequence> permissions = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath
     * 
     */
    public CharSequence getContainerPath() {
        return containerPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath
     * 
     */
    public void setContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
    }

    public Device withContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath
     * 
     */
    public CharSequence getHostPath() {
        return hostPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath
     * 
     */
    public void setHostPath(CharSequence hostPath) {
        this.hostPath = hostPath;
    }

    public Device withHostPath(CharSequence hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions
     * 
     */
    public Set<CharSequence> getPermissions() {
        return permissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions
     * 
     */
    public void setPermissions(Set<CharSequence> permissions) {
        this.permissions = permissions;
    }

    public Device withPermissions(Set<CharSequence> permissions) {
        this.permissions = permissions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerPath", containerPath).append("hostPath", hostPath).append("permissions", permissions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containerPath).append(hostPath).append(permissions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Device) == false) {
            return false;
        }
        Device rhs = ((Device) other);
        return new EqualsBuilder().append(containerPath, rhs.containerPath).append(hostPath, rhs.hostPath).append(permissions, rhs.permissions).isEquals();
    }

}
