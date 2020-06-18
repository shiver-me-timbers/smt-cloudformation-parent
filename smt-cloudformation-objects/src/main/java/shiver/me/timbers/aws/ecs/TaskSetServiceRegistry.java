
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
 * TaskSetServiceRegistry
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContainerName",
    "ContainerPort",
    "Port",
    "RegistryArn"
})
public class TaskSetServiceRegistry implements Property<TaskSetServiceRegistry>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containername
     * 
     */
    @JsonProperty("ContainerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containername")
    private CharSequence containerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containerport
     * 
     */
    @JsonProperty("ContainerPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containerport")
    private Number containerPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-port")
    private Number port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-registryarn
     * 
     */
    @JsonProperty("RegistryArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-registryarn")
    private CharSequence registryArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containername
     * 
     */
    @JsonIgnore
    public CharSequence getContainerName() {
        return containerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containername
     * 
     */
    @JsonIgnore
    public void setContainerName(CharSequence containerName) {
        this.containerName = containerName;
    }

    public TaskSetServiceRegistry withContainerName(CharSequence containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containerport
     * 
     */
    @JsonIgnore
    public Number getContainerPort() {
        return containerPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containerport
     * 
     */
    @JsonIgnore
    public void setContainerPort(Number containerPort) {
        this.containerPort = containerPort;
    }

    public TaskSetServiceRegistry withContainerPort(Number containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-port
     * 
     */
    @JsonIgnore
    public Number getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-port
     * 
     */
    @JsonIgnore
    public void setPort(Number port) {
        this.port = port;
    }

    public TaskSetServiceRegistry withPort(Number port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-registryarn
     * 
     */
    @JsonIgnore
    public CharSequence getRegistryArn() {
        return registryArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-registryarn
     * 
     */
    @JsonIgnore
    public void setRegistryArn(CharSequence registryArn) {
        this.registryArn = registryArn;
    }

    public TaskSetServiceRegistry withRegistryArn(CharSequence registryArn) {
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
        if ((other instanceof TaskSetServiceRegistry) == false) {
            return false;
        }
        TaskSetServiceRegistry rhs = ((TaskSetServiceRegistry) other);
        return new EqualsBuilder().append(containerPort, rhs.containerPort).append(registryArn, rhs.registryArn).append(port, rhs.port).append(containerName, rhs.containerName).isEquals();
    }

}
