
package aws.ecs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LoadBalancer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContainerName",
    "ContainerPort",
    "LoadBalancerName",
    "TargetGroupArn"
})
public class LoadBalancer {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containername
     * 
     */
    @JsonProperty("ContainerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containername")
    private CharSequence containerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containerport
     * 
     */
    @JsonProperty("ContainerPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containerport")
    private Integer containerPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-loadbalancername
     * 
     */
    @JsonProperty("LoadBalancerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-loadbalancername")
    private CharSequence loadBalancerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-targetgrouparn
     * 
     */
    @JsonProperty("TargetGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-targetgrouparn")
    private CharSequence targetGroupArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containername
     * 
     */
    public CharSequence getContainerName() {
        return containerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containername
     * 
     */
    public void setContainerName(CharSequence containerName) {
        this.containerName = containerName;
    }

    public LoadBalancer withContainerName(CharSequence containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containerport
     * 
     */
    public Integer getContainerPort() {
        return containerPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-containerport
     * 
     */
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    public LoadBalancer withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-loadbalancername
     * 
     */
    public CharSequence getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-loadbalancername
     * 
     */
    public void setLoadBalancerName(CharSequence loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public LoadBalancer withLoadBalancerName(CharSequence loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-targetgrouparn
     * 
     */
    public CharSequence getTargetGroupArn() {
        return targetGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancers.html#cfn-ecs-service-loadbalancers-targetgrouparn
     * 
     */
    public void setTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    public LoadBalancer withTargetGroupArn(CharSequence targetGroupArn) {
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
        if ((other instanceof LoadBalancer) == false) {
            return false;
        }
        LoadBalancer rhs = ((LoadBalancer) other);
        return new EqualsBuilder().append(containerPort, rhs.containerPort).append(containerName, rhs.containerName).append(loadBalancerName, rhs.loadBalancerName).append(targetGroupArn, rhs.targetGroupArn).isEquals();
    }

}
