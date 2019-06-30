
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
 * ClusterEbsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EbsBlockDeviceConfigs",
    "EbsOptimized"
})
public class ClusterEbsConfiguration implements Property<ClusterEbsConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    @JsonProperty("EbsBlockDeviceConfigs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs")
    private Set<Property<ClusterEbsBlockDeviceConfig>> ebsBlockDeviceConfigs = new LinkedHashSet<Property<ClusterEbsBlockDeviceConfig>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized")
    private CharSequence ebsOptimized;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    @JsonIgnore
    public Set<Property<ClusterEbsBlockDeviceConfig>> getEbsBlockDeviceConfigs() {
        return ebsBlockDeviceConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    @JsonIgnore
    public void setEbsBlockDeviceConfigs(Set<Property<ClusterEbsBlockDeviceConfig>> ebsBlockDeviceConfigs) {
        this.ebsBlockDeviceConfigs = ebsBlockDeviceConfigs;
    }

    public ClusterEbsConfiguration withEbsBlockDeviceConfigs(Set<Property<ClusterEbsBlockDeviceConfig>> ebsBlockDeviceConfigs) {
        this.ebsBlockDeviceConfigs = ebsBlockDeviceConfigs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized
     * 
     */
    @JsonIgnore
    public CharSequence getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized
     * 
     */
    @JsonIgnore
    public void setEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public ClusterEbsConfiguration withEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ebsBlockDeviceConfigs", ebsBlockDeviceConfigs).append("ebsOptimized", ebsOptimized).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ebsBlockDeviceConfigs).append(ebsOptimized).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterEbsConfiguration) == false) {
            return false;
        }
        ClusterEbsConfiguration rhs = ((ClusterEbsConfiguration) other);
        return new EqualsBuilder().append(ebsBlockDeviceConfigs, rhs.ebsBlockDeviceConfigs).append(ebsOptimized, rhs.ebsOptimized).isEquals();
    }

}
