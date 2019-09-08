
package shiver.me.timbers.aws.batch;

import java.util.ArrayList;
import java.util.List;
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
 * JobDefinitionContainerProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "User",
    "Memory",
    "Privileged",
    "LinuxParameters",
    "JobRoleArn",
    "ReadonlyRootFilesystem",
    "Vcpus",
    "Image",
    "ResourceRequirements",
    "MountPoints",
    "Volumes",
    "Command",
    "Environment",
    "Ulimits",
    "InstanceType"
})
public class JobDefinitionContainerProperties implements Property<JobDefinitionContainerProperties>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user
     * 
     */
    @JsonProperty("User")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user")
    private CharSequence user;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory
     * 
     */
    @JsonProperty("Memory")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory")
    private Number memory;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged
     * 
     */
    @JsonProperty("Privileged")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged")
    private CharSequence privileged;
    /**
     * JobDefinitionLinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html
     * 
     */
    @JsonProperty("LinuxParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html")
    private Property<JobDefinitionLinuxParameters> linuxParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn
     * 
     */
    @JsonProperty("JobRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn")
    private CharSequence jobRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem
     * 
     */
    @JsonProperty("ReadonlyRootFilesystem")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem")
    private CharSequence readonlyRootFilesystem;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus
     * 
     */
    @JsonProperty("Vcpus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus")
    private Number vcpus;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image
     * 
     */
    @JsonProperty("Image")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image")
    private CharSequence image;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-resourcerequirements
     * 
     */
    @JsonProperty("ResourceRequirements")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-resourcerequirements")
    private List<Property<JobDefinitionResourceRequirement>> resourceRequirements = new ArrayList<Property<JobDefinitionResourceRequirement>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints
     * 
     */
    @JsonProperty("MountPoints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints")
    private List<Property<JobDefinitionMountPoints>> mountPoints = new ArrayList<Property<JobDefinitionMountPoints>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes
     * 
     */
    @JsonProperty("Volumes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes")
    private List<Property<JobDefinitionVolumes>> volumes = new ArrayList<Property<JobDefinitionVolumes>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command
     * 
     */
    @JsonProperty("Command")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command")
    private List<CharSequence> command = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment")
    private List<Property<JobDefinitionEnvironment>> environment = new ArrayList<Property<JobDefinitionEnvironment>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits
     * 
     */
    @JsonProperty("Ulimits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits")
    private List<Property<JobDefinitionUlimit>> ulimits = new ArrayList<Property<JobDefinitionUlimit>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-instancetype")
    private CharSequence instanceType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user
     * 
     */
    @JsonIgnore
    public CharSequence getUser() {
        return user;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user
     * 
     */
    @JsonIgnore
    public void setUser(CharSequence user) {
        this.user = user;
    }

    public JobDefinitionContainerProperties withUser(CharSequence user) {
        this.user = user;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory
     * 
     */
    @JsonIgnore
    public Number getMemory() {
        return memory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory
     * 
     */
    @JsonIgnore
    public void setMemory(Number memory) {
        this.memory = memory;
    }

    public JobDefinitionContainerProperties withMemory(Number memory) {
        this.memory = memory;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged
     * 
     */
    @JsonIgnore
    public CharSequence getPrivileged() {
        return privileged;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged
     * 
     */
    @JsonIgnore
    public void setPrivileged(CharSequence privileged) {
        this.privileged = privileged;
    }

    public JobDefinitionContainerProperties withPrivileged(CharSequence privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * JobDefinitionLinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html
     * 
     */
    @JsonIgnore
    public Property<JobDefinitionLinuxParameters> getLinuxParameters() {
        return linuxParameters;
    }

    /**
     * JobDefinitionLinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties-linuxparameters.html
     * 
     */
    @JsonIgnore
    public void setLinuxParameters(Property<JobDefinitionLinuxParameters> linuxParameters) {
        this.linuxParameters = linuxParameters;
    }

    public JobDefinitionContainerProperties withLinuxParameters(Property<JobDefinitionLinuxParameters> linuxParameters) {
        this.linuxParameters = linuxParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getJobRoleArn() {
        return jobRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn
     * 
     */
    @JsonIgnore
    public void setJobRoleArn(CharSequence jobRoleArn) {
        this.jobRoleArn = jobRoleArn;
    }

    public JobDefinitionContainerProperties withJobRoleArn(CharSequence jobRoleArn) {
        this.jobRoleArn = jobRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem
     * 
     */
    @JsonIgnore
    public CharSequence getReadonlyRootFilesystem() {
        return readonlyRootFilesystem;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem
     * 
     */
    @JsonIgnore
    public void setReadonlyRootFilesystem(CharSequence readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    public JobDefinitionContainerProperties withReadonlyRootFilesystem(CharSequence readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus
     * 
     */
    @JsonIgnore
    public Number getVcpus() {
        return vcpus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus
     * 
     */
    @JsonIgnore
    public void setVcpus(Number vcpus) {
        this.vcpus = vcpus;
    }

    public JobDefinitionContainerProperties withVcpus(Number vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image
     * 
     */
    @JsonIgnore
    public CharSequence getImage() {
        return image;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image
     * 
     */
    @JsonIgnore
    public void setImage(CharSequence image) {
        this.image = image;
    }

    public JobDefinitionContainerProperties withImage(CharSequence image) {
        this.image = image;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-resourcerequirements
     * 
     */
    @JsonIgnore
    public List<Property<JobDefinitionResourceRequirement>> getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-resourcerequirements
     * 
     */
    @JsonIgnore
    public void setResourceRequirements(List<Property<JobDefinitionResourceRequirement>> resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
    }

    public JobDefinitionContainerProperties withResourceRequirements(List<Property<JobDefinitionResourceRequirement>> resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints
     * 
     */
    @JsonIgnore
    public List<Property<JobDefinitionMountPoints>> getMountPoints() {
        return mountPoints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints
     * 
     */
    @JsonIgnore
    public void setMountPoints(List<Property<JobDefinitionMountPoints>> mountPoints) {
        this.mountPoints = mountPoints;
    }

    public JobDefinitionContainerProperties withMountPoints(List<Property<JobDefinitionMountPoints>> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes
     * 
     */
    @JsonIgnore
    public List<Property<JobDefinitionVolumes>> getVolumes() {
        return volumes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes
     * 
     */
    @JsonIgnore
    public void setVolumes(List<Property<JobDefinitionVolumes>> volumes) {
        this.volumes = volumes;
    }

    public JobDefinitionContainerProperties withVolumes(List<Property<JobDefinitionVolumes>> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCommand() {
        return command;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command
     * 
     */
    @JsonIgnore
    public void setCommand(List<CharSequence> command) {
        this.command = command;
    }

    public JobDefinitionContainerProperties withCommand(List<CharSequence> command) {
        this.command = command;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment
     * 
     */
    @JsonIgnore
    public List<Property<JobDefinitionEnvironment>> getEnvironment() {
        return environment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment
     * 
     */
    @JsonIgnore
    public void setEnvironment(List<Property<JobDefinitionEnvironment>> environment) {
        this.environment = environment;
    }

    public JobDefinitionContainerProperties withEnvironment(List<Property<JobDefinitionEnvironment>> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits
     * 
     */
    @JsonIgnore
    public List<Property<JobDefinitionUlimit>> getUlimits() {
        return ulimits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits
     * 
     */
    @JsonIgnore
    public void setUlimits(List<Property<JobDefinitionUlimit>> ulimits) {
        this.ulimits = ulimits;
    }

    public JobDefinitionContainerProperties withUlimits(List<Property<JobDefinitionUlimit>> ulimits) {
        this.ulimits = ulimits;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public JobDefinitionContainerProperties withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("user", user).append("memory", memory).append("privileged", privileged).append("linuxParameters", linuxParameters).append("jobRoleArn", jobRoleArn).append("readonlyRootFilesystem", readonlyRootFilesystem).append("vcpus", vcpus).append("image", image).append("resourceRequirements", resourceRequirements).append("mountPoints", mountPoints).append("volumes", volumes).append("command", command).append("environment", environment).append("ulimits", ulimits).append("instanceType", instanceType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(image).append(memory).append(instanceType).append(volumes).append(vcpus).append(command).append(privileged).append(resourceRequirements).append(environment).append(ulimits).append(readonlyRootFilesystem).append(mountPoints).append(jobRoleArn).append(user).append(linuxParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobDefinitionContainerProperties) == false) {
            return false;
        }
        JobDefinitionContainerProperties rhs = ((JobDefinitionContainerProperties) other);
        return new EqualsBuilder().append(image, rhs.image).append(memory, rhs.memory).append(instanceType, rhs.instanceType).append(volumes, rhs.volumes).append(vcpus, rhs.vcpus).append(command, rhs.command).append(privileged, rhs.privileged).append(resourceRequirements, rhs.resourceRequirements).append(environment, rhs.environment).append(ulimits, rhs.ulimits).append(readonlyRootFilesystem, rhs.readonlyRootFilesystem).append(mountPoints, rhs.mountPoints).append(jobRoleArn, rhs.jobRoleArn).append(user, rhs.user).append(linuxParameters, rhs.linuxParameters).isEquals();
    }

}
