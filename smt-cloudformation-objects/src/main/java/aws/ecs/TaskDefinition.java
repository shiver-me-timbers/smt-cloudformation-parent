
package aws.ecs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TaskDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContainerDefinitions",
    "Cpu",
    "ExecutionRoleArn",
    "Family",
    "IpcMode",
    "Memory",
    "NetworkMode",
    "PidMode",
    "PlacementConstraints",
    "ProxyConfiguration",
    "RequiresCompatibilities",
    "Tags",
    "TaskRoleArn",
    "Volumes"
})
public class TaskDefinition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions
     * 
     */
    @JsonProperty("ContainerDefinitions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions")
    private Set<Property<TaskDefinitionContainerDefinition>> containerDefinitions = new LinkedHashSet<Property<TaskDefinitionContainerDefinition>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu
     * 
     */
    @JsonProperty("Cpu")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu")
    private CharSequence cpu;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn
     * 
     */
    @JsonProperty("ExecutionRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn")
    private CharSequence executionRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family
     * 
     */
    @JsonProperty("Family")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family")
    private CharSequence family;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ipcmode
     * 
     */
    @JsonProperty("IpcMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ipcmode")
    private CharSequence ipcMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory
     * 
     */
    @JsonProperty("Memory")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory")
    private CharSequence memory;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode
     * 
     */
    @JsonProperty("NetworkMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode")
    private CharSequence networkMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-pidmode
     * 
     */
    @JsonProperty("PidMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-pidmode")
    private CharSequence pidMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints
     * 
     */
    @JsonProperty("PlacementConstraints")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints")
    private Set<Property<TaskDefinitionTaskDefinitionPlacementConstraint>> placementConstraints = new LinkedHashSet<Property<TaskDefinitionTaskDefinitionPlacementConstraint>>();
    /**
     * TaskDefinitionProxyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html
     * 
     */
    @JsonProperty("ProxyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html")
    private Property<TaskDefinitionProxyConfiguration> proxyConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities
     * 
     */
    @JsonProperty("RequiresCompatibilities")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities")
    private Set<CharSequence> requiresCompatibilities = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn
     * 
     */
    @JsonProperty("TaskRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn")
    private CharSequence taskRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes
     * 
     */
    @JsonProperty("Volumes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes")
    private Set<Property<TaskDefinitionVolume>> volumes = new LinkedHashSet<Property<TaskDefinitionVolume>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionContainerDefinition>> getContainerDefinitions() {
        return containerDefinitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions
     * 
     */
    @JsonIgnore
    public void setContainerDefinitions(Set<Property<TaskDefinitionContainerDefinition>> containerDefinitions) {
        this.containerDefinitions = containerDefinitions;
    }

    public TaskDefinition withContainerDefinitions(Set<Property<TaskDefinitionContainerDefinition>> containerDefinitions) {
        this.containerDefinitions = containerDefinitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu
     * 
     */
    @JsonIgnore
    public CharSequence getCpu() {
        return cpu;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu
     * 
     */
    @JsonIgnore
    public void setCpu(CharSequence cpu) {
        this.cpu = cpu;
    }

    public TaskDefinition withCpu(CharSequence cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn
     * 
     */
    @JsonIgnore
    public void setExecutionRoleArn(CharSequence executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    public TaskDefinition withExecutionRoleArn(CharSequence executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family
     * 
     */
    @JsonIgnore
    public CharSequence getFamily() {
        return family;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family
     * 
     */
    @JsonIgnore
    public void setFamily(CharSequence family) {
        this.family = family;
    }

    public TaskDefinition withFamily(CharSequence family) {
        this.family = family;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ipcmode
     * 
     */
    @JsonIgnore
    public CharSequence getIpcMode() {
        return ipcMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ipcmode
     * 
     */
    @JsonIgnore
    public void setIpcMode(CharSequence ipcMode) {
        this.ipcMode = ipcMode;
    }

    public TaskDefinition withIpcMode(CharSequence ipcMode) {
        this.ipcMode = ipcMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory
     * 
     */
    @JsonIgnore
    public CharSequence getMemory() {
        return memory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory
     * 
     */
    @JsonIgnore
    public void setMemory(CharSequence memory) {
        this.memory = memory;
    }

    public TaskDefinition withMemory(CharSequence memory) {
        this.memory = memory;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode
     * 
     */
    @JsonIgnore
    public CharSequence getNetworkMode() {
        return networkMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode
     * 
     */
    @JsonIgnore
    public void setNetworkMode(CharSequence networkMode) {
        this.networkMode = networkMode;
    }

    public TaskDefinition withNetworkMode(CharSequence networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-pidmode
     * 
     */
    @JsonIgnore
    public CharSequence getPidMode() {
        return pidMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-pidmode
     * 
     */
    @JsonIgnore
    public void setPidMode(CharSequence pidMode) {
        this.pidMode = pidMode;
    }

    public TaskDefinition withPidMode(CharSequence pidMode) {
        this.pidMode = pidMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionTaskDefinitionPlacementConstraint>> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints
     * 
     */
    @JsonIgnore
    public void setPlacementConstraints(Set<Property<TaskDefinitionTaskDefinitionPlacementConstraint>> placementConstraints) {
        this.placementConstraints = placementConstraints;
    }

    public TaskDefinition withPlacementConstraints(Set<Property<TaskDefinitionTaskDefinitionPlacementConstraint>> placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * TaskDefinitionProxyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<TaskDefinitionProxyConfiguration> getProxyConfiguration() {
        return proxyConfiguration;
    }

    /**
     * TaskDefinitionProxyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html
     * 
     */
    @JsonIgnore
    public void setProxyConfiguration(Property<TaskDefinitionProxyConfiguration> proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    public TaskDefinition withProxyConfiguration(Property<TaskDefinitionProxyConfiguration> proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getRequiresCompatibilities() {
        return requiresCompatibilities;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities
     * 
     */
    @JsonIgnore
    public void setRequiresCompatibilities(Set<CharSequence> requiresCompatibilities) {
        this.requiresCompatibilities = requiresCompatibilities;
    }

    public TaskDefinition withRequiresCompatibilities(Set<CharSequence> requiresCompatibilities) {
        this.requiresCompatibilities = requiresCompatibilities;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public TaskDefinition withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getTaskRoleArn() {
        return taskRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn
     * 
     */
    @JsonIgnore
    public void setTaskRoleArn(CharSequence taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    public TaskDefinition withTaskRoleArn(CharSequence taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionVolume>> getVolumes() {
        return volumes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes
     * 
     */
    @JsonIgnore
    public void setVolumes(Set<Property<TaskDefinitionVolume>> volumes) {
        this.volumes = volumes;
    }

    public TaskDefinition withVolumes(Set<Property<TaskDefinitionVolume>> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerDefinitions", containerDefinitions).append("cpu", cpu).append("executionRoleArn", executionRoleArn).append("family", family).append("ipcMode", ipcMode).append("memory", memory).append("networkMode", networkMode).append("pidMode", pidMode).append("placementConstraints", placementConstraints).append("proxyConfiguration", proxyConfiguration).append("requiresCompatibilities", requiresCompatibilities).append("tags", tags).append("taskRoleArn", taskRoleArn).append("volumes", volumes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkMode).append(placementConstraints).append(pidMode).append(memory).append(volumes).append(cpu).append(tags).append(executionRoleArn).append(taskRoleArn).append(ipcMode).append(family).append(requiresCompatibilities).append(containerDefinitions).append(proxyConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinition) == false) {
            return false;
        }
        TaskDefinition rhs = ((TaskDefinition) other);
        return new EqualsBuilder().append(networkMode, rhs.networkMode).append(placementConstraints, rhs.placementConstraints).append(pidMode, rhs.pidMode).append(memory, rhs.memory).append(volumes, rhs.volumes).append(cpu, rhs.cpu).append(tags, rhs.tags).append(executionRoleArn, rhs.executionRoleArn).append(taskRoleArn, rhs.taskRoleArn).append(ipcMode, rhs.ipcMode).append(family, rhs.family).append(requiresCompatibilities, rhs.requiresCompatibilities).append(containerDefinitions, rhs.containerDefinitions).append(proxyConfiguration, rhs.proxyConfiguration).isEquals();
    }

}
