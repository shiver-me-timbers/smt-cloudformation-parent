
package shiver.me.timbers.aws.ec2;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * SpotFleetSpotFleetRequestConfigData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
public class SpotFleetSpotFleetRequestConfigData implements Property<SpotFleetSpotFleetRequestConfigData>
{

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
    private Set<Property<SpotFleetSpotFleetLaunchSpecification>> launchSpecifications = new LinkedHashSet<Property<SpotFleetSpotFleetLaunchSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs
     * 
     */
    @JsonProperty("LaunchTemplateConfigs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs")
    private Set<Property<SpotFleetLaunchTemplateConfig>> launchTemplateConfigs = new LinkedHashSet<Property<SpotFleetLaunchTemplateConfig>>();
    /**
     * SpotFleetLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html
     * 
     */
    @JsonProperty("LoadBalancersConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html")
    private Property<SpotFleetLoadBalancersConfig> loadBalancersConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances
     * 
     */
    @JsonProperty("ReplaceUnhealthyInstances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances")
    private CharSequence replaceUnhealthyInstances;
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
    private Number targetCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration
     * 
     */
    @JsonProperty("TerminateInstancesWithExpiration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration")
    private CharSequence terminateInstancesWithExpiration;
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
    @JsonIgnore
    public CharSequence getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-allocationstrategy
     * 
     */
    @JsonIgnore
    public void setAllocationStrategy(CharSequence allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public SpotFleetSpotFleetRequestConfigData withAllocationStrategy(CharSequence allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-excesscapacityterminationpolicy
     * 
     */
    @JsonIgnore
    public void setExcessCapacityTerminationPolicy(CharSequence excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    public SpotFleetSpotFleetRequestConfigData withExcessCapacityTerminationPolicy(CharSequence excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole
     * 
     */
    @JsonIgnore
    public CharSequence getIamFleetRole() {
        return iamFleetRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-iamfleetrole
     * 
     */
    @JsonIgnore
    public void setIamFleetRole(CharSequence iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
    }

    public SpotFleetSpotFleetRequestConfigData withIamFleetRole(CharSequence iamFleetRole) {
        this.iamFleetRole = iamFleetRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-instanceinterruptionbehavior
     * 
     */
    @JsonIgnore
    public void setInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    public SpotFleetSpotFleetRequestConfigData withInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetSpotFleetLaunchSpecification>> getLaunchSpecifications() {
        return launchSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications
     * 
     */
    @JsonIgnore
    public void setLaunchSpecifications(Set<Property<SpotFleetSpotFleetLaunchSpecification>> launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
    }

    public SpotFleetSpotFleetRequestConfigData withLaunchSpecifications(Set<Property<SpotFleetSpotFleetLaunchSpecification>> launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetLaunchTemplateConfig>> getLaunchTemplateConfigs() {
        return launchTemplateConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-launchtemplateconfigs
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateConfigs(Set<Property<SpotFleetLaunchTemplateConfig>> launchTemplateConfigs) {
        this.launchTemplateConfigs = launchTemplateConfigs;
    }

    public SpotFleetSpotFleetRequestConfigData withLaunchTemplateConfigs(Set<Property<SpotFleetLaunchTemplateConfig>> launchTemplateConfigs) {
        this.launchTemplateConfigs = launchTemplateConfigs;
        return this;
    }

    /**
     * SpotFleetLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html
     * 
     */
    @JsonIgnore
    public Property<SpotFleetLoadBalancersConfig> getLoadBalancersConfig() {
        return loadBalancersConfig;
    }

    /**
     * SpotFleetLoadBalancersConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-loadbalancersconfig.html
     * 
     */
    @JsonIgnore
    public void setLoadBalancersConfig(Property<SpotFleetLoadBalancersConfig> loadBalancersConfig) {
        this.loadBalancersConfig = loadBalancersConfig;
    }

    public SpotFleetSpotFleetRequestConfigData withLoadBalancersConfig(Property<SpotFleetLoadBalancersConfig> loadBalancersConfig) {
        this.loadBalancersConfig = loadBalancersConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances
     * 
     */
    @JsonIgnore
    public CharSequence getReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-replaceunhealthyinstances
     * 
     */
    @JsonIgnore
    public void setReplaceUnhealthyInstances(CharSequence replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    public SpotFleetSpotFleetRequestConfigData withReplaceUnhealthyInstances(CharSequence replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice
     * 
     */
    @JsonIgnore
    public CharSequence getSpotPrice() {
        return spotPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-spotprice
     * 
     */
    @JsonIgnore
    public void setSpotPrice(CharSequence spotPrice) {
        this.spotPrice = spotPrice;
    }

    public SpotFleetSpotFleetRequestConfigData withSpotPrice(CharSequence spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity
     * 
     */
    @JsonIgnore
    public Number getTargetCapacity() {
        return targetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-targetcapacity
     * 
     */
    @JsonIgnore
    public void setTargetCapacity(Number targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    public SpotFleetSpotFleetRequestConfigData withTargetCapacity(Number targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration
     * 
     */
    @JsonIgnore
    public CharSequence getTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-terminateinstanceswithexpiration
     * 
     */
    @JsonIgnore
    public void setTerminateInstancesWithExpiration(CharSequence terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    public SpotFleetSpotFleetRequestConfigData withTerminateInstancesWithExpiration(CharSequence terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public SpotFleetSpotFleetRequestConfigData withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom
     * 
     */
    @JsonIgnore
    public CharSequence getValidFrom() {
        return validFrom;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validfrom
     * 
     */
    @JsonIgnore
    public void setValidFrom(CharSequence validFrom) {
        this.validFrom = validFrom;
    }

    public SpotFleetSpotFleetRequestConfigData withValidFrom(CharSequence validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil
     * 
     */
    @JsonIgnore
    public CharSequence getValidUntil() {
        return validUntil;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata.html#cfn-ec2-spotfleet-spotfleetrequestconfigdata-validuntil
     * 
     */
    @JsonIgnore
    public void setValidUntil(CharSequence validUntil) {
        this.validUntil = validUntil;
    }

    public SpotFleetSpotFleetRequestConfigData withValidUntil(CharSequence validUntil) {
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
        if ((other instanceof SpotFleetSpotFleetRequestConfigData) == false) {
            return false;
        }
        SpotFleetSpotFleetRequestConfigData rhs = ((SpotFleetSpotFleetRequestConfigData) other);
        return new EqualsBuilder().append(spotPrice, rhs.spotPrice).append(targetCapacity, rhs.targetCapacity).append(launchTemplateConfigs, rhs.launchTemplateConfigs).append(validFrom, rhs.validFrom).append(launchSpecifications, rhs.launchSpecifications).append(type, rhs.type).append(allocationStrategy, rhs.allocationStrategy).append(replaceUnhealthyInstances, rhs.replaceUnhealthyInstances).append(loadBalancersConfig, rhs.loadBalancersConfig).append(terminateInstancesWithExpiration, rhs.terminateInstancesWithExpiration).append(iamFleetRole, rhs.iamFleetRole).append(instanceInterruptionBehavior, rhs.instanceInterruptionBehavior).append(validUntil, rhs.validUntil).append(excessCapacityTerminationPolicy, rhs.excessCapacityTerminationPolicy).isEquals();
    }

}
