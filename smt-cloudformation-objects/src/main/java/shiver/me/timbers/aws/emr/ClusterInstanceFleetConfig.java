
package shiver.me.timbers.aws.emr;

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
 * ClusterInstanceFleetConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InstanceTypeConfigs",
    "LaunchSpecifications",
    "Name",
    "TargetOnDemandCapacity",
    "TargetSpotCapacity"
})
public class ClusterInstanceFleetConfig implements Property<ClusterInstanceFleetConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs
     * 
     */
    @JsonProperty("InstanceTypeConfigs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs")
    private Set<Property<ClusterInstanceTypeConfig>> instanceTypeConfigs = new LinkedHashSet<Property<ClusterInstanceTypeConfig>>();
    /**
     * ClusterInstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html
     * 
     */
    @JsonProperty("LaunchSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html")
    private Property<ClusterInstanceFleetProvisioningSpecifications> launchSpecifications;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity
     * 
     */
    @JsonProperty("TargetOnDemandCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity")
    private Number targetOnDemandCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity
     * 
     */
    @JsonProperty("TargetSpotCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity")
    private Number targetSpotCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs
     * 
     */
    @JsonIgnore
    public Set<Property<ClusterInstanceTypeConfig>> getInstanceTypeConfigs() {
        return instanceTypeConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs
     * 
     */
    @JsonIgnore
    public void setInstanceTypeConfigs(Set<Property<ClusterInstanceTypeConfig>> instanceTypeConfigs) {
        this.instanceTypeConfigs = instanceTypeConfigs;
    }

    public ClusterInstanceFleetConfig withInstanceTypeConfigs(Set<Property<ClusterInstanceTypeConfig>> instanceTypeConfigs) {
        this.instanceTypeConfigs = instanceTypeConfigs;
        return this;
    }

    /**
     * ClusterInstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html
     * 
     */
    @JsonIgnore
    public Property<ClusterInstanceFleetProvisioningSpecifications> getLaunchSpecifications() {
        return launchSpecifications;
    }

    /**
     * ClusterInstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html
     * 
     */
    @JsonIgnore
    public void setLaunchSpecifications(Property<ClusterInstanceFleetProvisioningSpecifications> launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
    }

    public ClusterInstanceFleetConfig withLaunchSpecifications(Property<ClusterInstanceFleetProvisioningSpecifications> launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ClusterInstanceFleetConfig withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity
     * 
     */
    @JsonIgnore
    public Number getTargetOnDemandCapacity() {
        return targetOnDemandCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity
     * 
     */
    @JsonIgnore
    public void setTargetOnDemandCapacity(Number targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
    }

    public ClusterInstanceFleetConfig withTargetOnDemandCapacity(Number targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity
     * 
     */
    @JsonIgnore
    public Number getTargetSpotCapacity() {
        return targetSpotCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity
     * 
     */
    @JsonIgnore
    public void setTargetSpotCapacity(Number targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
    }

    public ClusterInstanceFleetConfig withTargetSpotCapacity(Number targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instanceTypeConfigs", instanceTypeConfigs).append("launchSpecifications", launchSpecifications).append("name", name).append("targetOnDemandCapacity", targetOnDemandCapacity).append("targetSpotCapacity", targetSpotCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(targetSpotCapacity).append(targetOnDemandCapacity).append(launchSpecifications).append(instanceTypeConfigs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterInstanceFleetConfig) == false) {
            return false;
        }
        ClusterInstanceFleetConfig rhs = ((ClusterInstanceFleetConfig) other);
        return new EqualsBuilder().append(name, rhs.name).append(targetSpotCapacity, rhs.targetSpotCapacity).append(targetOnDemandCapacity, rhs.targetOnDemandCapacity).append(launchSpecifications, rhs.launchSpecifications).append(instanceTypeConfigs, rhs.instanceTypeConfigs).isEquals();
    }

}
