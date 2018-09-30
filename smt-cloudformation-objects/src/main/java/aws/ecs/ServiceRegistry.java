
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ServiceRegistry
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContainerName",
    "ContainerPort",
    "Port",
    "RegistryArn"
})
public class ServiceRegistry {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername
     * 
     */
    @JsonProperty("ContainerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername")
    private CharSequence containerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport
     * 
     */
    @JsonProperty("ContainerPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport")
    private Integer containerPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn
     * 
     */
    @JsonProperty("RegistryArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn")
    private CharSequence registryArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername
     * 
     */
    public CharSequence getContainerName() {
        return containerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containername
     * 
     */
    public void setContainerName(CharSequence containerName) {
        this.containerName = containerName;
    }

    public ServiceRegistry withContainerName(CharSequence containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport
     * 
     */
    public Integer getContainerPort() {
        return containerPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-containerport
     * 
     */
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    public ServiceRegistry withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-port
     * 
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public ServiceRegistry withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn
     * 
     */
    public CharSequence getRegistryArn() {
        return registryArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html#cfn-ecs-service-serviceregistry-registryarn
     * 
     */
    public void setRegistryArn(CharSequence registryArn) {
        this.registryArn = registryArn;
    }

    public ServiceRegistry withRegistryArn(CharSequence registryArn) {
        this.registryArn = registryArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerName", containerName).append("containerPort", containerPort).append("port", port).append("registryArn", registryArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containerPort).append(registryArn).append(port).append(containerName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceRegistry) == false) {
            return false;
        }
        ServiceRegistry rhs = ((ServiceRegistry) other);
        return new EqualsBuilder().append(containerPort, rhs.containerPort).append(registryArn, rhs.registryArn).append(port, rhs.port).append(containerName, rhs.containerName).isEquals();
    }

}
