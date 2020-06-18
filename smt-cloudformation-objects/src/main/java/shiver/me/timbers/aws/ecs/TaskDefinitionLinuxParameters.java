
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
 * TaskDefinitionLinuxParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Capabilities",
    "Devices",
    "InitProcessEnabled",
    "MaxSwap",
    "SharedMemorySize",
    "Swappiness",
    "Tmpfs"
})
public class TaskDefinitionLinuxParameters implements Property<TaskDefinitionLinuxParameters>
{

    /**
     * TaskDefinitionKernelCapabilities
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
     * 
     */
    @JsonProperty("Capabilities")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html")
    private Property<TaskDefinitionKernelCapabilities> capabilities;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices
     * 
     */
    @JsonProperty("Devices")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices")
    private Set<Property<TaskDefinitionDevice>> devices = new LinkedHashSet<Property<TaskDefinitionDevice>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled
     * 
     */
    @JsonProperty("InitProcessEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled")
    private CharSequence initProcessEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-maxswap
     * 
     */
    @JsonProperty("MaxSwap")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-maxswap")
    private Number maxSwap;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize
     * 
     */
    @JsonProperty("SharedMemorySize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize")
    private Number sharedMemorySize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-swappiness
     * 
     */
    @JsonProperty("Swappiness")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-swappiness")
    private Number swappiness;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs
     * 
     */
    @JsonProperty("Tmpfs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs")
    private Set<Property<TaskDefinitionTmpfs>> tmpfs = new LinkedHashSet<Property<TaskDefinitionTmpfs>>();

    /**
     * TaskDefinitionKernelCapabilities
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
     * 
     */
    @JsonIgnore
    public Property<TaskDefinitionKernelCapabilities> getCapabilities() {
        return capabilities;
    }

    /**
     * TaskDefinitionKernelCapabilities
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html
     * 
     */
    @JsonIgnore
    public void setCapabilities(Property<TaskDefinitionKernelCapabilities> capabilities) {
        this.capabilities = capabilities;
    }

    public TaskDefinitionLinuxParameters withCapabilities(Property<TaskDefinitionKernelCapabilities> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionDevice>> getDevices() {
        return devices;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices
     * 
     */
    @JsonIgnore
    public void setDevices(Set<Property<TaskDefinitionDevice>> devices) {
        this.devices = devices;
    }

    public TaskDefinitionLinuxParameters withDevices(Set<Property<TaskDefinitionDevice>> devices) {
        this.devices = devices;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled
     * 
     */
    @JsonIgnore
    public CharSequence getInitProcessEnabled() {
        return initProcessEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled
     * 
     */
    @JsonIgnore
    public void setInitProcessEnabled(CharSequence initProcessEnabled) {
        this.initProcessEnabled = initProcessEnabled;
    }

    public TaskDefinitionLinuxParameters withInitProcessEnabled(CharSequence initProcessEnabled) {
        this.initProcessEnabled = initProcessEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-maxswap
     * 
     */
    @JsonIgnore
    public Number getMaxSwap() {
        return maxSwap;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-maxswap
     * 
     */
    @JsonIgnore
    public void setMaxSwap(Number maxSwap) {
        this.maxSwap = maxSwap;
    }

    public TaskDefinitionLinuxParameters withMaxSwap(Number maxSwap) {
        this.maxSwap = maxSwap;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize
     * 
     */
    @JsonIgnore
    public Number getSharedMemorySize() {
        return sharedMemorySize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize
     * 
     */
    @JsonIgnore
    public void setSharedMemorySize(Number sharedMemorySize) {
        this.sharedMemorySize = sharedMemorySize;
    }

    public TaskDefinitionLinuxParameters withSharedMemorySize(Number sharedMemorySize) {
        this.sharedMemorySize = sharedMemorySize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-swappiness
     * 
     */
    @JsonIgnore
    public Number getSwappiness() {
        return swappiness;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-swappiness
     * 
     */
    @JsonIgnore
    public void setSwappiness(Number swappiness) {
        this.swappiness = swappiness;
    }

    public TaskDefinitionLinuxParameters withSwappiness(Number swappiness) {
        this.swappiness = swappiness;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionTmpfs>> getTmpfs() {
        return tmpfs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs
     * 
     */
    @JsonIgnore
    public void setTmpfs(Set<Property<TaskDefinitionTmpfs>> tmpfs) {
        this.tmpfs = tmpfs;
    }

    public TaskDefinitionLinuxParameters withTmpfs(Set<Property<TaskDefinitionTmpfs>> tmpfs) {
        this.tmpfs = tmpfs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("capabilities", capabilities).append("devices", devices).append("initProcessEnabled", initProcessEnabled).append("maxSwap", maxSwap).append("sharedMemorySize", sharedMemorySize).append("swappiness", swappiness).append("tmpfs", tmpfs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(swappiness).append(tmpfs).append(capabilities).append(devices).append(maxSwap).append(initProcessEnabled).append(sharedMemorySize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionLinuxParameters) == false) {
            return false;
        }
        TaskDefinitionLinuxParameters rhs = ((TaskDefinitionLinuxParameters) other);
        return new EqualsBuilder().append(swappiness, rhs.swappiness).append(tmpfs, rhs.tmpfs).append(capabilities, rhs.capabilities).append(devices, rhs.devices).append(maxSwap, rhs.maxSwap).append(initProcessEnabled, rhs.initProcessEnabled).append(sharedMemorySize, rhs.sharedMemorySize).isEquals();
    }

}
