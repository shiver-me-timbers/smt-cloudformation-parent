
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceFleetConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClusterId",
    "InstanceFleetType",
    "InstanceTypeConfigs",
    "LaunchSpecifications",
    "Name",
    "TargetOnDemandCapacity",
    "TargetSpotCapacity"
})
public class InstanceFleetConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-clusterid
     * 
     */
    @JsonProperty("ClusterId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-clusterid")
    private CharSequence clusterId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancefleettype
     * 
     */
    @JsonProperty("InstanceFleetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancefleettype")
    private CharSequence instanceFleetType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfigs
     * 
     */
    @JsonProperty("InstanceTypeConfigs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfigs")
    private Set<Property<InstanceFleetConfigInstanceTypeConfig>> instanceTypeConfigs = new LinkedHashSet<Property<InstanceFleetConfigInstanceTypeConfig>>();
    /**
     * InstanceFleetConfigInstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html
     * 
     */
    @JsonProperty("LaunchSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html")
    private Property<InstanceFleetConfigInstanceFleetProvisioningSpecifications> launchSpecifications;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetondemandcapacity
     * 
     */
    @JsonProperty("TargetOnDemandCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetondemandcapacity")
    private Integer targetOnDemandCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetspotcapacity
     * 
     */
    @JsonProperty("TargetSpotCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetspotcapacity")
    private Integer targetSpotCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-clusterid
     * 
     */
    @JsonIgnore
    public CharSequence getClusterId() {
        return clusterId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-clusterid
     * 
     */
    @JsonIgnore
    public void setClusterId(CharSequence clusterId) {
        this.clusterId = clusterId;
    }

    public InstanceFleetConfig withClusterId(CharSequence clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancefleettype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceFleetType() {
        return instanceFleetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancefleettype
     * 
     */
    @JsonIgnore
    public void setInstanceFleetType(CharSequence instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
    }

    public InstanceFleetConfig withInstanceFleetType(CharSequence instanceFleetType) {
        this.instanceFleetType = instanceFleetType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfigs
     * 
     */
    @JsonIgnore
    public Set<Property<InstanceFleetConfigInstanceTypeConfig>> getInstanceTypeConfigs() {
        return instanceTypeConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-instancetypeconfigs
     * 
     */
    @JsonIgnore
    public void setInstanceTypeConfigs(Set<Property<InstanceFleetConfigInstanceTypeConfig>> instanceTypeConfigs) {
        this.instanceTypeConfigs = instanceTypeConfigs;
    }

    public InstanceFleetConfig withInstanceTypeConfigs(Set<Property<InstanceFleetConfigInstanceTypeConfig>> instanceTypeConfigs) {
        this.instanceTypeConfigs = instanceTypeConfigs;
        return this;
    }

    /**
     * InstanceFleetConfigInstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html
     * 
     */
    @JsonIgnore
    public Property<InstanceFleetConfigInstanceFleetProvisioningSpecifications> getLaunchSpecifications() {
        return launchSpecifications;
    }

    /**
     * InstanceFleetConfigInstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html
     * 
     */
    @JsonIgnore
    public void setLaunchSpecifications(Property<InstanceFleetConfigInstanceFleetProvisioningSpecifications> launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
    }

    public InstanceFleetConfig withLaunchSpecifications(Property<InstanceFleetConfigInstanceFleetProvisioningSpecifications> launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public InstanceFleetConfig withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetondemandcapacity
     * 
     */
    @JsonIgnore
    public Integer getTargetOnDemandCapacity() {
        return targetOnDemandCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetondemandcapacity
     * 
     */
    @JsonIgnore
    public void setTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
    }

    public InstanceFleetConfig withTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetspotcapacity
     * 
     */
    @JsonIgnore
    public Integer getTargetSpotCapacity() {
        return targetSpotCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticmapreduce-instancefleetconfig.html#cfn-elasticmapreduce-instancefleetconfig-targetspotcapacity
     * 
     */
    @JsonIgnore
    public void setTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
    }

    public InstanceFleetConfig withTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clusterId", clusterId).append("instanceFleetType", instanceFleetType).append("instanceTypeConfigs", instanceTypeConfigs).append("launchSpecifications", launchSpecifications).append("name", name).append("targetOnDemandCapacity", targetOnDemandCapacity).append("targetSpotCapacity", targetSpotCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(targetSpotCapacity).append(clusterId).append(targetOnDemandCapacity).append(launchSpecifications).append(instanceFleetType).append(instanceTypeConfigs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceFleetConfig) == false) {
            return false;
        }
        InstanceFleetConfig rhs = ((InstanceFleetConfig) other);
        return new EqualsBuilder().append(name, rhs.name).append(targetSpotCapacity, rhs.targetSpotCapacity).append(clusterId, rhs.clusterId).append(targetOnDemandCapacity, rhs.targetOnDemandCapacity).append(launchSpecifications, rhs.launchSpecifications).append(instanceFleetType, rhs.instanceFleetType).append(instanceTypeConfigs, rhs.instanceTypeConfigs).isEquals();
    }

}
