
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Volume
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DockerVolumeConfiguration",
    "Host",
    "Name"
})
public class Volume {

    /**
     * DockerVolumeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html
     * 
     */
    @JsonProperty("DockerVolumeConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html")
    private DockerVolumeConfiguration dockerVolumeConfiguration;
    /**
     * HostVolumeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
     * 
     */
    @JsonProperty("Host")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html")
    private HostVolumeProperties host;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name")
    private CharSequence name;

    /**
     * DockerVolumeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html
     * 
     */
    public DockerVolumeConfiguration getDockerVolumeConfiguration() {
        return dockerVolumeConfiguration;
    }

    /**
     * DockerVolumeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html
     * 
     */
    public void setDockerVolumeConfiguration(DockerVolumeConfiguration dockerVolumeConfiguration) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
    }

    public Volume withDockerVolumeConfiguration(DockerVolumeConfiguration dockerVolumeConfiguration) {
        this.dockerVolumeConfiguration = dockerVolumeConfiguration;
        return this;
    }

    /**
     * HostVolumeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
     * 
     */
    public HostVolumeProperties getHost() {
        return host;
    }

    /**
     * HostVolumeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes-host.html
     * 
     */
    public void setHost(HostVolumeProperties host) {
        this.host = host;
    }

    public Volume withHost(HostVolumeProperties host) {
        this.host = host;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumes.html#cfn-ecs-taskdefinition-volumes-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Volume withName(CharSequence name) {
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
        if ((other instanceof Volume) == false) {
            return false;
        }
        Volume rhs = ((Volume) other);
        return new EqualsBuilder().append(host, rhs.host).append(name, rhs.name).append(dockerVolumeConfiguration, rhs.dockerVolumeConfiguration).isEquals();
    }

}
