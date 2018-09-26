
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PortMapping
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContainerPort",
    "HostPort",
    "Protocol"
})
public class PortMapping {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-containerport
     * 
     */
    @JsonProperty("ContainerPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-containerport")
    private Integer containerPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-readonly
     * 
     */
    @JsonProperty("HostPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-readonly")
    private Integer hostPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-sourcevolume
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-sourcevolume")
    private CharSequence protocol;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-containerport
     * 
     */
    public Integer getContainerPort() {
        return containerPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-containerport
     * 
     */
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    public PortMapping withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-readonly
     * 
     */
    public Integer getHostPort() {
        return hostPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-readonly
     * 
     */
    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    public PortMapping withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-sourcevolume
     * 
     */
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-portmappings.html#cfn-ecs-taskdefinition-containerdefinition-portmappings-sourcevolume
     * 
     */
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public PortMapping withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerPort", containerPort).append("hostPort", hostPort).append("protocol", protocol).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containerPort).append(hostPort).append(protocol).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortMapping) == false) {
            return false;
        }
        PortMapping rhs = ((PortMapping) other);
        return new EqualsBuilder().append(containerPort, rhs.containerPort).append(hostPort, rhs.hostPort).append(protocol, rhs.protocol).isEquals();
    }

}
