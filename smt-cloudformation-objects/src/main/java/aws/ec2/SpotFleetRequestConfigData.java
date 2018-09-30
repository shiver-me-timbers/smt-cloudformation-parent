
package aws.ec2;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SpotFleetRequestConfigData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllocationStrategy",
    "ExcessCapacityTerminationPolicy",
    "IamFleetRole",
    "InstanceInterruptionBehavior",
    "LaunchSpecifications",
    "LaunchTemplateConfigs",
    "LoadBalancersConfig",
    "ReplaceUnhealthyInstances",
    "SpotPrice",
    "TargetCapacity",
    "TerminateInstancesWithExpiration",
    "Type",
    "ValidFrom",
    "ValidUntil"
})
public class SpotFleetRequestConfigData {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy
     * 
     */
    @JsonProperty("AllocationStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy")
    private CharSequence allocationStrategy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy
     * 
     */
    @JsonProperty("ExcessCapacityTerminationPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy")
    private CharSequence excessCapacityTerminationPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole
     * 
     */
    @JsonProperty("IamFleetRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole")
    private CharSequence iamFleetRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior
     * 
     */
    @JsonProperty("InstanceInterruptionBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior")
    private CharSequence instanceInterruptionBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications
     * 
     */
    @JsonProperty("LaunchSpecifications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications")
    private Set<SpotFleetLaunchSpecification> launchSpecifications = new LinkedHashSet<SpotFleetLaunchSpecification>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs
     * 
     */
    @JsonProperty("LaunchTemplateConfigs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs")
    private Set<LaunchTemplateConfig> launchTemplateConfigs = new LinkedHashSet<LaunchTemplateConfig>();
    /**
     * ClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    @JsonProperty("LoadBalancersConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html")
    private ClassicLoadBalancersConfig loadBalancersConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances
     * 
     */
    @JsonProperty("ReplaceUnhealthyInstances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances")
    private Boolean replaceUnhealthyInstances;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice")
    private CharSequence spotPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity
     * 
     */
    @JsonProperty("TargetCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity")
    private Integer targetCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration
     * 
     */
    @JsonProperty("TerminateInstancesWithExpiration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration")
    private Boolean terminateInstancesWithExpiration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom
     * 
     */
    @JsonProperty("ValidFrom")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom")
    private CharSequence validFrom;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil
     * 
     */
    @JsonProperty("ValidUntil")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil")
    private CharSequence validUntil;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy
     * 
     */
    public CharSequence getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy
     * 
     */
    public void setAllocationStrategy(CharSequence allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public SpotFleetRequestConfigData withAllocationStrategy(CharSequence allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy
     * 
     */
    public CharSequence getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy
     * 
     */
    public void setExcessCapacityTerminationPolicy(CharSequence excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    public SpotFleetRequestConfigData withExcessCapacityTerminationPolicy(CharSequence excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole
     * 
     */
    public CharSequence getIamFleetRole() {
        return iamFleetRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole
     * 
     */
    public void setIamFleetRole(CharSequence iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
    }

    public SpotFleetRequestConfigData withIamFleetRole(CharSequence iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior
     * 
     */
    public CharSequence getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior
     * 
     */
    public void setInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    public SpotFleetRequestConfigData withInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications
     * 
     */
    public Set<SpotFleetLaunchSpecification> getLaunchSpecifications() {
        return launchSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications
     * 
     */
    public void setLaunchSpecifications(Set<SpotFleetLaunchSpecification> launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
    }

    public SpotFleetRequestConfigData withLaunchSpecifications(Set<SpotFleetLaunchSpecification> launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs
     * 
     */
    public Set<LaunchTemplateConfig> getLaunchTemplateConfigs() {
        return launchTemplateConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs
     * 
     */
    public void setLaunchTemplateConfigs(Set<LaunchTemplateConfig> launchTemplateConfigs) {
        this.launchTemplateConfigs = launchTemplateConfigs;
    }

    public SpotFleetRequestConfigData withLaunchTemplateConfigs(Set<LaunchTemplateConfig> launchTemplateConfigs) {
        this.launchTemplateConfigs = launchTemplateConfigs;
        return this;
    }

    /**
     * ClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    public ClassicLoadBalancersConfig getLoadBalancersConfig() {
        return loadBalancersConfig;
    }

    /**
     * ClassicLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
     * 
     */
    public void setLoadBalancersConfig(ClassicLoadBalancersConfig loadBalancersConfig) {
        this.loadBalancersConfig = loadBalancersConfig;
    }

    public SpotFleetRequestConfigData withLoadBalancersConfig(ClassicLoadBalancersConfig loadBalancersConfig) {
        this.loadBalancersConfig = loadBalancersConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances
     * 
     */
    public Boolean getReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances
     * 
     */
    public void setReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    public SpotFleetRequestConfigData withReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice
     * 
     */
    public CharSequence getSpotPrice() {
        return spotPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice
     * 
     */
    public void setSpotPrice(CharSequence spotPrice) {
        this.spotPrice = spotPrice;
    }

    public SpotFleetRequestConfigData withSpotPrice(CharSequence spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity
     * 
     */
    public Integer getTargetCapacity() {
        return targetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity
     * 
     */
    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    public SpotFleetRequestConfigData withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration
     * 
     */
    public Boolean getTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration
     * 
     */
    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    public SpotFleetRequestConfigData withTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public SpotFleetRequestConfigData withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom
     * 
     */
    public CharSequence getValidFrom() {
        return validFrom;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom
     * 
     */
    public void setValidFrom(CharSequence validFrom) {
        this.validFrom = validFrom;
    }

    public SpotFleetRequestConfigData withValidFrom(CharSequence validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil
     * 
     */
    public CharSequence getValidUntil() {
        return validUntil;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil
     * 
     */
    public void setValidUntil(CharSequence validUntil) {
        this.validUntil = validUntil;
    }

    public SpotFleetRequestConfigData withValidUntil(CharSequence validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allocationStrategy", allocationStrategy).append("excessCapacityTerminationPolicy", excessCapacityTerminationPolicy).append("iamFleetRole", iamFleetRole).append("instanceInterruptionBehavior", instanceInterruptionBehavior).append("launchSpecifications", launchSpecifications).append("launchTemplateConfigs", launchTemplateConfigs).append("loadBalancersConfig", loadBalancersConfig).append("replaceUnhealthyInstances", replaceUnhealthyInstances).append("spotPrice", spotPrice).append("targetCapacity", targetCapacity).append("terminateInstancesWithExpiration", terminateInstancesWithExpiration).append("type", type).append("validFrom", validFrom).append("validUntil", validUntil).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(spotPrice).append(targetCapacity).append(launchTemplateConfigs).append(validFrom).append(launchSpecifications).append(type).append(allocationStrategy).append(replaceUnhealthyInstances).append(loadBalancersConfig).append(terminateInstancesWithExpiration).append(iamFleetRole).append(instanceInterruptionBehavior).append(validUntil).append(excessCapacityTerminationPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpotFleetRequestConfigData) == false) {
            return false;
        }
        SpotFleetRequestConfigData rhs = ((SpotFleetRequestConfigData) other);
        return new EqualsBuilder().append(spotPrice, rhs.spotPrice).append(targetCapacity, rhs.targetCapacity).append(launchTemplateConfigs, rhs.launchTemplateConfigs).append(validFrom, rhs.validFrom).append(launchSpecifications, rhs.launchSpecifications).append(type, rhs.type).append(allocationStrategy, rhs.allocationStrategy).append(replaceUnhealthyInstances, rhs.replaceUnhealthyInstances).append(loadBalancersConfig, rhs.loadBalancersConfig).append(terminateInstancesWithExpiration, rhs.terminateInstancesWithExpiration).append(iamFleetRole, rhs.iamFleetRole).append(instanceInterruptionBehavior, rhs.instanceInterruptionBehavior).append(validUntil, rhs.validUntil).append(excessCapacityTerminationPolicy, rhs.excessCapacityTerminationPolicy).isEquals();
    }

}
