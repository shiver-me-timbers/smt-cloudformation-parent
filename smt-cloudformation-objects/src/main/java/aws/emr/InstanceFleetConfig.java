
package aws.emr;

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
 * InstanceFleetConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InstanceTypeConfigs",
    "LaunchSpecifications",
    "Name",
    "TargetOnDemandCapacity",
    "TargetSpotCapacity"
})
public class InstanceFleetConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs
     * 
     */
    @JsonProperty("InstanceTypeConfigs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs")
    private Set<InstanceTypeConfig> instanceTypeConfigs = new LinkedHashSet<InstanceTypeConfig>();
    /**
     * InstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html
     * 
     */
    @JsonProperty("LaunchSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html")
    private InstanceFleetProvisioningSpecifications launchSpecifications;
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
    private Integer targetOnDemandCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity
     * 
     */
    @JsonProperty("TargetSpotCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity")
    private Integer targetSpotCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs
     * 
     */
    public Set<InstanceTypeConfig> getInstanceTypeConfigs() {
        return instanceTypeConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-instancetypeconfigs
     * 
     */
    public void setInstanceTypeConfigs(Set<InstanceTypeConfig> instanceTypeConfigs) {
        this.instanceTypeConfigs = instanceTypeConfigs;
    }

    public InstanceFleetConfig withInstanceTypeConfigs(Set<InstanceTypeConfig> instanceTypeConfigs) {
        this.instanceTypeConfigs = instanceTypeConfigs;
        return this;
    }

    /**
     * InstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html
     * 
     */
    public InstanceFleetProvisioningSpecifications getLaunchSpecifications() {
        return launchSpecifications;
    }

    /**
     * InstanceFleetProvisioningSpecifications
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html
     * 
     */
    public void setLaunchSpecifications(InstanceFleetProvisioningSpecifications launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
    }

    public InstanceFleetConfig withLaunchSpecifications(InstanceFleetProvisioningSpecifications launchSpecifications) {
        this.launchSpecifications = launchSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public InstanceFleetConfig withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity
     * 
     */
    public Integer getTargetOnDemandCapacity() {
        return targetOnDemandCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetondemandcapacity
     * 
     */
    public void setTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
    }

    public InstanceFleetConfig withTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity
     * 
     */
    public Integer getTargetSpotCapacity() {
        return targetSpotCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html#cfn-elasticmapreduce-cluster-instancefleetconfig-targetspotcapacity
     * 
     */
    public void setTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
    }

    public InstanceFleetConfig withTargetSpotCapacity(Integer targetSpotCapacity) {
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
        if ((other instanceof InstanceFleetConfig) == false) {
            return false;
        }
        InstanceFleetConfig rhs = ((InstanceFleetConfig) other);
        return new EqualsBuilder().append(name, rhs.name).append(targetSpotCapacity, rhs.targetSpotCapacity).append(targetOnDemandCapacity, rhs.targetOnDemandCapacity).append(launchSpecifications, rhs.launchSpecifications).append(instanceTypeConfigs, rhs.instanceTypeConfigs).isEquals();
    }

}
