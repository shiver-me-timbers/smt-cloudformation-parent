
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
 * TaskSetLoadBalancer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContainerName",
    "ContainerPort",
    "LoadBalancerName",
    "TargetGroupArn"
})
public class TaskSetLoadBalancer implements Property<TaskSetLoadBalancer>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containername
     * 
     */
    @JsonProperty("ContainerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containername")
    private CharSequence containerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containerport
     * 
     */
    @JsonProperty("ContainerPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containerport")
    private Number containerPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-loadbalancername
     * 
     */
    @JsonProperty("LoadBalancerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-loadbalancername")
    private CharSequence loadBalancerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-targetgrouparn
     * 
     */
    @JsonProperty("TargetGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-targetgrouparn")
    private CharSequence targetGroupArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containername
     * 
     */
    @JsonIgnore
    public CharSequence getContainerName() {
        return containerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containername
     * 
     */
    @JsonIgnore
    public void setContainerName(CharSequence containerName) {
        this.containerName = containerName;
    }

    public TaskSetLoadBalancer withContainerName(CharSequence containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containerport
     * 
     */
    @JsonIgnore
    public Number getContainerPort() {
        return containerPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containerport
     * 
     */
    @JsonIgnore
    public void setContainerPort(Number containerPort) {
        this.containerPort = containerPort;
    }

    public TaskSetLoadBalancer withContainerPort(Number containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-loadbalancername
     * 
     */
    @JsonIgnore
    public CharSequence getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-loadbalancername
     * 
     */
    @JsonIgnore
    public void setLoadBalancerName(CharSequence loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public TaskSetLoadBalancer withLoadBalancerName(CharSequence loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-targetgrouparn
     * 
     */
    @JsonIgnore
    public CharSequence getTargetGroupArn() {
        return targetGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-targetgrouparn
     * 
     */
    @JsonIgnore
    public void setTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    public TaskSetLoadBalancer withTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerName", containerName).append("containerPort", containerPort).append("loadBalancerName", loadBalancerName).append("targetGroupArn", targetGroupArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containerPort).append(containerName).append(loadBalancerName).append(targetGroupArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskSetLoadBalancer) == false) {
            return false;
        }
        TaskSetLoadBalancer rhs = ((TaskSetLoadBalancer) other);
        return new EqualsBuilder().append(containerPort, rhs.containerPort).append(containerName, rhs.containerName).append(loadBalancerName, rhs.loadBalancerName).append(targetGroupArn, rhs.targetGroupArn).isEquals();
    }

}
