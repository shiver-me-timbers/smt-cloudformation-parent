
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
 * TaskDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContainerDefinitions",
    "Cpu",
    "ExecutionRoleArn",
    "Family",
    "Memory",
    "NetworkMode",
    "PlacementConstraints",
    "RequiresCompatibilities",
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
    private Set<ContainerDefinition> containerDefinitions = new LinkedHashSet<ContainerDefinition>();
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints
     * 
     */
    @JsonProperty("PlacementConstraints")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints")
    private Set<TaskDefinitionPlacementConstraint> placementConstraints = new LinkedHashSet<TaskDefinitionPlacementConstraint>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities
     * 
     */
    @JsonProperty("RequiresCompatibilities")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities")
    private Set<CharSequence> requiresCompatibilities = new LinkedHashSet<CharSequence>();
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
    private Set<Volume> volumes = new LinkedHashSet<Volume>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions
     * 
     */
    public Set<ContainerDefinition> getContainerDefinitions() {
        return containerDefinitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions
     * 
     */
    public void setContainerDefinitions(Set<ContainerDefinition> containerDefinitions) {
        this.containerDefinitions = containerDefinitions;
    }

    public TaskDefinition withContainerDefinitions(Set<ContainerDefinition> containerDefinitions) {
        this.containerDefinitions = containerDefinitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu
     * 
     */
    public CharSequence getCpu() {
        return cpu;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu
     * 
     */
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
    public CharSequence getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn
     * 
     */
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
    public CharSequence getFamily() {
        return family;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family
     * 
     */
    public void setFamily(CharSequence family) {
        this.family = family;
    }

    public TaskDefinition withFamily(CharSequence family) {
        this.family = family;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory
     * 
     */
    public CharSequence getMemory() {
        return memory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory
     * 
     */
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
    public CharSequence getNetworkMode() {
        return networkMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode
     * 
     */
    public void setNetworkMode(CharSequence networkMode) {
        this.networkMode = networkMode;
    }

    public TaskDefinition withNetworkMode(CharSequence networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints
     * 
     */
    public Set<TaskDefinitionPlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints
     * 
     */
    public void setPlacementConstraints(Set<TaskDefinitionPlacementConstraint> placementConstraints) {
        this.placementConstraints = placementConstraints;
    }

    public TaskDefinition withPlacementConstraints(Set<TaskDefinitionPlacementConstraint> placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities
     * 
     */
    public Set<CharSequence> getRequiresCompatibilities() {
        return requiresCompatibilities;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities
     * 
     */
    public void setRequiresCompatibilities(Set<CharSequence> requiresCompatibilities) {
        this.requiresCompatibilities = requiresCompatibilities;
    }

    public TaskDefinition withRequiresCompatibilities(Set<CharSequence> requiresCompatibilities) {
        this.requiresCompatibilities = requiresCompatibilities;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn
     * 
     */
    public CharSequence getTaskRoleArn() {
        return taskRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn
     * 
     */
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
    public Set<Volume> getVolumes() {
        return volumes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes
     * 
     */
    public void setVolumes(Set<Volume> volumes) {
        this.volumes = volumes;
    }

    public TaskDefinition withVolumes(Set<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerDefinitions", containerDefinitions).append("cpu", cpu).append("executionRoleArn", executionRoleArn).append("family", family).append("memory", memory).append("networkMode", networkMode).append("placementConstraints", placementConstraints).append("requiresCompatibilities", requiresCompatibilities).append("taskRoleArn", taskRoleArn).append("volumes", volumes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkMode).append(placementConstraints).append(memory).append(executionRoleArn).append(taskRoleArn).append(volumes).append(cpu).append(family).append(requiresCompatibilities).append(containerDefinitions).toHashCode();
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
        return new EqualsBuilder().append(networkMode, rhs.networkMode).append(placementConstraints, rhs.placementConstraints).append(memory, rhs.memory).append(executionRoleArn, rhs.executionRoleArn).append(taskRoleArn, rhs.taskRoleArn).append(volumes, rhs.volumes).append(cpu, rhs.cpu).append(family, rhs.family).append(requiresCompatibilities, rhs.requiresCompatibilities).append(containerDefinitions, rhs.containerDefinitions).isEquals();
    }

}
