
package aws.batch;

import java.util.ArrayList;
import java.util.List;
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
 * JobDefinitionDevice
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HostPath",
    "Permissions",
    "ContainerPath"
})
public class JobDefinitionDevice implements Property<JobDefinitionDevice>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-hostpath
     * 
     */
    @JsonProperty("HostPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-hostpath")
    private CharSequence hostPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-permissions
     * 
     */
    @JsonProperty("Permissions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-permissions")
    private List<CharSequence> permissions = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-containerpath
     * 
     */
    @JsonProperty("ContainerPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-containerpath")
    private CharSequence containerPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-hostpath
     * 
     */
    @JsonIgnore
    public CharSequence getHostPath() {
        return hostPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-hostpath
     * 
     */
    @JsonIgnore
    public void setHostPath(CharSequence hostPath) {
        this.hostPath = hostPath;
    }

    public JobDefinitionDevice withHostPath(CharSequence hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-permissions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getPermissions() {
        return permissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-permissions
     * 
     */
    @JsonIgnore
    public void setPermissions(List<CharSequence> permissions) {
        this.permissions = permissions;
    }

    public JobDefinitionDevice withPermissions(List<CharSequence> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-containerpath
     * 
     */
    @JsonIgnore
    public CharSequence getContainerPath() {
        return containerPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-device.html#cfn-batch-jobdefinition-device-containerpath
     * 
     */
    @JsonIgnore
    public void setContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
    }

    public JobDefinitionDevice withContainerPath(CharSequence containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hostPath", hostPath).append("permissions", permissions).append("containerPath", containerPath).toString();
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
        if ((other instanceof JobDefinitionDevice) == false) {
            return false;
        }
        JobDefinitionDevice rhs = ((JobDefinitionDevice) other);
        return new EqualsBuilder().append(containerPath, rhs.containerPath).append(hostPath, rhs.hostPath).append(permissions, rhs.permissions).isEquals();
    }

}
