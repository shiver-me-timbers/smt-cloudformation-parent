
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LoadBalancersConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ClassicLoadBalancersConfig",
    "TargetGroupsConfig"
})
public class LoadBalancersConfig {

    /**
     * ClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    @JsonProperty("ClassicLoadBalancersConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html")
    private ClassicLoadBalancersConfig classicLoadBalancersConfig;
    /**
     * TargetGroupsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html
     * 
     */
    @JsonProperty("TargetGroupsConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html")
    private TargetGroupsConfig targetGroupsConfig;

    /**
     * ClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    public ClassicLoadBalancersConfig getClassicLoadBalancersConfig() {
        return classicLoadBalancersConfig;
    }

    /**
     * ClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    public void setClassicLoadBalancersConfig(ClassicLoadBalancersConfig classicLoadBalancersConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
    }

    public LoadBalancersConfig withClassicLoadBalancersConfig(ClassicLoadBalancersConfig classicLoadBalancersConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
        return this;
    }

    /**
     * TargetGroupsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html
     * 
     */
    public TargetGroupsConfig getTargetGroupsConfig() {
        return targetGroupsConfig;
    }

    /**
     * TargetGroupsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html
     * 
     */
    public void setTargetGroupsConfig(TargetGroupsConfig targetGroupsConfig) {
        this.targetGroupsConfig = targetGroupsConfig;
    }

    public LoadBalancersConfig withTargetGroupsConfig(TargetGroupsConfig targetGroupsConfig) {
        this.targetGroupsConfig = targetGroupsConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("classicLoadBalancersConfig", classicLoadBalancersConfig).append("targetGroupsConfig", targetGroupsConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetGroupsConfig).append(classicLoadBalancersConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadBalancersConfig) == false) {
            return false;
        }
        LoadBalancersConfig rhs = ((LoadBalancersConfig) other);
        return new EqualsBuilder().append(targetGroupsConfig, rhs.targetGroupsConfig).append(classicLoadBalancersConfig, rhs.classicLoadBalancersConfig).isEquals();
    }

}
