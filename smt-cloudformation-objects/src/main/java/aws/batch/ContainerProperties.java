
package aws.batch;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ContainerProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MountPoints",
    "User",
    "Volumes",
    "Command",
    "Memory",
    "Privileged",
    "Environment",
    "JobRoleArn",
    "ReadonlyRootFilesystem",
    "Ulimits",
    "Vcpus",
    "Image"
})
public class ContainerProperties {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints
     * 
     */
    @JsonProperty("MountPoints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints")
    private List<MountPoints> mountPoints = new ArrayList<MountPoints>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user
     * 
     */
    @JsonProperty("User")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user")
    private CharSequence user;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes
     * 
     */
    @JsonProperty("Volumes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes")
    private List<Volumes> volumes = new ArrayList<Volumes>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command
     * 
     */
    @JsonProperty("Command")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command")
    private List<CharSequence> command = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory
     * 
     */
    @JsonProperty("Memory")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory")
    private Integer memory;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged
     * 
     */
    @JsonProperty("Privileged")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged")
    private Boolean privileged;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment")
    private List<Environment> environment = new ArrayList<Environment>();
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
    private Boolean readonlyRootFilesystem;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits
     * 
     */
    @JsonProperty("Ulimits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits")
    private List<Ulimit> ulimits = new ArrayList<Ulimit>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus
     * 
     */
    @JsonProperty("Vcpus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus")
    private Integer vcpus;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image
     * 
     */
    @JsonProperty("Image")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image")
    private CharSequence image;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints
     * 
     */
    public List<MountPoints> getMountPoints() {
        return mountPoints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-mountpoints
     * 
     */
    public void setMountPoints(List<MountPoints> mountPoints) {
        this.mountPoints = mountPoints;
    }

    public ContainerProperties withMountPoints(List<MountPoints> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user
     * 
     */
    public CharSequence getUser() {
        return user;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-user
     * 
     */
    public void setUser(CharSequence user) {
        this.user = user;
    }

    public ContainerProperties withUser(CharSequence user) {
        this.user = user;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes
     * 
     */
    public List<Volumes> getVolumes() {
        return volumes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-volumes
     * 
     */
    public void setVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
    }

    public ContainerProperties withVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command
     * 
     */
    public List<CharSequence> getCommand() {
        return command;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-command
     * 
     */
    public void setCommand(List<CharSequence> command) {
        this.command = command;
    }

    public ContainerProperties withCommand(List<CharSequence> command) {
        this.command = command;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory
     * 
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-memory
     * 
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ContainerProperties withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged
     * 
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-privileged
     * 
     */
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public ContainerProperties withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment
     * 
     */
    public List<Environment> getEnvironment() {
        return environment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-environment
     * 
     */
    public void setEnvironment(List<Environment> environment) {
        this.environment = environment;
    }

    public ContainerProperties withEnvironment(List<Environment> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn
     * 
     */
    public CharSequence getJobRoleArn() {
        return jobRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-jobrolearn
     * 
     */
    public void setJobRoleArn(CharSequence jobRoleArn) {
        this.jobRoleArn = jobRoleArn;
    }

    public ContainerProperties withJobRoleArn(CharSequence jobRoleArn) {
        this.jobRoleArn = jobRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem
     * 
     */
    public Boolean getReadonlyRootFilesystem() {
        return readonlyRootFilesystem;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-readonlyrootfilesystem
     * 
     */
    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    public ContainerProperties withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits
     * 
     */
    public List<Ulimit> getUlimits() {
        return ulimits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-ulimits
     * 
     */
    public void setUlimits(List<Ulimit> ulimits) {
        this.ulimits = ulimits;
    }

    public ContainerProperties withUlimits(List<Ulimit> ulimits) {
        this.ulimits = ulimits;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus
     * 
     */
    public Integer getVcpus() {
        return vcpus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-vcpus
     * 
     */
    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public ContainerProperties withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image
     * 
     */
    public CharSequence getImage() {
        return image;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html#cfn-batch-jobdefinition-containerproperties-image
     * 
     */
    public void setImage(CharSequence image) {
        this.image = image;
    }

    public ContainerProperties withImage(CharSequence image) {
        this.image = image;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mountPoints", mountPoints).append("user", user).append("volumes", volumes).append("command", command).append("memory", memory).append("privileged", privileged).append("environment", environment).append("jobRoleArn", jobRoleArn).append("readonlyRootFilesystem", readonlyRootFilesystem).append("ulimits", ulimits).append("vcpus", vcpus).append("image", image).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(image).append(memory).append(volumes).append(vcpus).append(command).append(privileged).append(environment).append(ulimits).append(readonlyRootFilesystem).append(mountPoints).append(jobRoleArn).append(user).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerProperties) == false) {
            return false;
        }
        ContainerProperties rhs = ((ContainerProperties) other);
        return new EqualsBuilder().append(image, rhs.image).append(memory, rhs.memory).append(volumes, rhs.volumes).append(vcpus, rhs.vcpus).append(command, rhs.command).append(privileged, rhs.privileged).append(environment, rhs.environment).append(ulimits, rhs.ulimits).append(readonlyRootFilesystem, rhs.readonlyRootFilesystem).append(mountPoints, rhs.mountPoints).append(jobRoleArn, rhs.jobRoleArn).append(user, rhs.user).isEquals();
    }

}
