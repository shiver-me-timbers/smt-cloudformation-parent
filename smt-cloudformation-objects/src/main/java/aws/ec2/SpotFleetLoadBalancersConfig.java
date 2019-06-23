
package aws.ec2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SpotFleetLoadBalancersConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClassicLoadBalancersConfig",
    "TargetGroupsConfig"
})
public class SpotFleetLoadBalancersConfig implements Property<SpotFleetLoadBalancersConfig>
{

    /**
     * SpotFleetClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    @JsonProperty("ClassicLoadBalancersConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html")
    private Property<SpotFleetClassicLoadBalancersConfig> classicLoadBalancersConfig;
    /**
     * SpotFleetTargetGroupsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html
     * 
     */
    @JsonProperty("TargetGroupsConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html")
    private Property<SpotFleetTargetGroupsConfig> targetGroupsConfig;

    /**
     * SpotFleetClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    @JsonIgnore
    public Property<SpotFleetClassicLoadBalancersConfig> getClassicLoadBalancersConfig() {
        return classicLoadBalancersConfig;
    }

    /**
     * SpotFleetClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    @JsonIgnore
    public void setClassicLoadBalancersConfig(Property<SpotFleetClassicLoadBalancersConfig> classicLoadBalancersConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
    }

    public SpotFleetLoadBalancersConfig withClassicLoadBalancersConfig(Property<SpotFleetClassicLoadBalancersConfig> classicLoadBalancersConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
        return this;
    }

    /**
     * SpotFleetTargetGroupsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html
     * 
     */
    @JsonIgnore
    public Property<SpotFleetTargetGroupsConfig> getTargetGroupsConfig() {
        return targetGroupsConfig;
    }

    /**
     * SpotFleetTargetGroupsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html
     * 
     */
    @JsonIgnore
    public void setTargetGroupsConfig(Property<SpotFleetTargetGroupsConfig> targetGroupsConfig) {
        this.targetGroupsConfig = targetGroupsConfig;
    }

    public SpotFleetLoadBalancersConfig withTargetGroupsConfig(Property<SpotFleetTargetGroupsConfig> targetGroupsConfig) {
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
        if ((other instanceof SpotFleetLoadBalancersConfig) == false) {
            return false;
        }
        SpotFleetLoadBalancersConfig rhs = ((SpotFleetLoadBalancersConfig) other);
        return new EqualsBuilder().append(targetGroupsConfig, rhs.targetGroupsConfig).append(classicLoadBalancersConfig, rhs.classicLoadBalancersConfig).isEquals();
    }

}
