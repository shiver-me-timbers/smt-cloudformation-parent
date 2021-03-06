
package shiver.me.timbers.aws.ecs;

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
 * TaskDefinitionVolume
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DockerVolumeConfiguration",
    "Host",
    "Name"
})
public class TaskDefinitionVolume implements Property<TaskDefinitionVolume>
{

    /**
     * TaskDefinitionDockerVolumeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html
     * 
     */
    @JsonProperty("DockerVolumeConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html")
    private Property<TaskDefinitionDockerVolumeConfiguration> dockerVolumeConfiguration;
    /**
     * TaskDefinitionHostVolumeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
     * 
     */
    @JsonProperty("Host")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html")
    private Property<TaskDefinitionHostVolumeProperties> host;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name")
    private CharSequence name;

    /**
     * TaskDefinitionDockerVolumeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<TaskDefinitionDockerVolumeConfiguration> getDockerVolumeConfiguration() {
        return dockerVolumeConfiguration;
    }

    /**
     * TaskDefinitionDockerVolumeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html
     * 
     */
    @JsonIgnore
    public void setDockerVolumeConfiguration(Property<TaskDefinitionDockerVolumeConfiguration> dockerVolumeConfiguration) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
    }

    public TaskDefinitionVolume withDockerVolumeConfiguration(Property<TaskDefinitionDockerVolumeConfiguration> dockerVolumeConfiguration) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
        return this;
    }

    /**
     * TaskDefinitionHostVolumeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
     * 
     */
    @JsonIgnore
    public Property<TaskDefinitionHostVolumeProperties> getHost() {
        return host;
    }

    /**
     * TaskDefinitionHostVolumeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
     * 
     */
    @JsonIgnore
    public void setHost(Property<TaskDefinitionHostVolumeProperties> host) {
        this.host = host;
    }

    public TaskDefinitionVolume withHost(Property<TaskDefinitionHostVolumeProperties> host) {
        this.host = host;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public TaskDefinitionVolume withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dockerVolumeConfiguration", dockerVolumeConfiguration).append("host", host).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(host).append(name).append(dockerVolumeConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionVolume) == false) {
            return false;
        }
        TaskDefinitionVolume rhs = ((TaskDefinitionVolume) other);
        return new EqualsBuilder().append(host, rhs.host).append(name, rhs.name).append(dockerVolumeConfiguration, rhs.dockerVolumeConfiguration).isEquals();
    }

}
