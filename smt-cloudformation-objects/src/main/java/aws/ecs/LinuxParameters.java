
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
 * LinuxParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Capabilities",
    "Devices",
    "InitProcessEnabled",
    "SharedMemorySize",
    "Tmpfs"
})
public class LinuxParameters {

    /**
     * KernelCapabilities
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
     * 
     */
    @JsonProperty("Capabilities")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html")
    private KernelCapabilities capabilities;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices
     * 
     */
    @JsonProperty("Devices")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices")
    private Set<Device> devices = new LinkedHashSet<Device>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled
     * 
     */
    @JsonProperty("InitProcessEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled")
    private Boolean initProcessEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize
     * 
     */
    @JsonProperty("SharedMemorySize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize")
    private Integer sharedMemorySize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs
     * 
     */
    @JsonProperty("Tmpfs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs")
    private Set<Tmpfs> tmpfs = new LinkedHashSet<Tmpfs>();

    /**
     * KernelCapabilities
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
     * 
     */
    public KernelCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * KernelCapabilities
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
     * 
     */
    public void setCapabilities(KernelCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public LinuxParameters withCapabilities(KernelCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices
     * 
     */
    public Set<Device> getDevices() {
        return devices;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices
     * 
     */
    public void setDevices(Set<Device> devices) {
        this.devices = devices;
    }

    public LinuxParameters withDevices(Set<Device> devices) {
        this.devices = devices;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled
     * 
     */
    public Boolean getInitProcessEnabled() {
        return initProcessEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled
     * 
     */
    public void setInitProcessEnabled(Boolean initProcessEnabled) {
        this.initProcessEnabled = initProcessEnabled;
    }

    public LinuxParameters withInitProcessEnabled(Boolean initProcessEnabled) {
        this.initProcessEnabled = initProcessEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize
     * 
     */
    public Integer getSharedMemorySize() {
        return sharedMemorySize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize
     * 
     */
    public void setSharedMemorySize(Integer sharedMemorySize) {
        this.sharedMemorySize = sharedMemorySize;
    }

    public LinuxParameters withSharedMemorySize(Integer sharedMemorySize) {
        this.sharedMemorySize = sharedMemorySize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs
     * 
     */
    public Set<Tmpfs> getTmpfs() {
        return tmpfs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs
     * 
     */
    public void setTmpfs(Set<Tmpfs> tmpfs) {
        this.tmpfs = tmpfs;
    }

    public LinuxParameters withTmpfs(Set<Tmpfs> tmpfs) {
        this.tmpfs = tmpfs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("capabilities", capabilities).append("devices", devices).append("initProcessEnabled", initProcessEnabled).append("sharedMemorySize", sharedMemorySize).append("tmpfs", tmpfs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tmpfs).append(capabilities).append(initProcessEnabled).append(sharedMemorySize).append(devices).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LinuxParameters) == false) {
            return false;
        }
        LinuxParameters rhs = ((LinuxParameters) other);
        return new EqualsBuilder().append(tmpfs, rhs.tmpfs).append(capabilities, rhs.capabilities).append(initProcessEnabled, rhs.initProcessEnabled).append(sharedMemorySize, rhs.sharedMemorySize).append(devices, rhs.devices).isEquals();
    }

}
