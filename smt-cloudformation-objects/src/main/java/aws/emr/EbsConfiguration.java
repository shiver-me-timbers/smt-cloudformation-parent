
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
 * EbsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EbsBlockDeviceConfigs",
    "EbsOptimized"
})
public class EbsConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    @JsonProperty("EbsBlockDeviceConfigs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs")
    private Set<EbsBlockDeviceConfig> ebsBlockDeviceConfigs = new LinkedHashSet<EbsBlockDeviceConfig>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized")
    private Boolean ebsOptimized;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    public Set<EbsBlockDeviceConfig> getEbsBlockDeviceConfigs() {
        return ebsBlockDeviceConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    public void setEbsBlockDeviceConfigs(Set<EbsBlockDeviceConfig> ebsBlockDeviceConfigs) {
        this.ebsBlockDeviceConfigs = ebsBlockDeviceConfigs;
    }

    public EbsConfiguration withEbsBlockDeviceConfigs(Set<EbsBlockDeviceConfig> ebsBlockDeviceConfigs) {
        this.ebsBlockDeviceConfigs = ebsBlockDeviceConfigs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized
     * 
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsconfiguration.html#cfn-elasticmapreduce-cluster-ebsconfiguration-ebsoptimized
     * 
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public EbsConfiguration withEbsOptimized(Boolean ebsOptimized) {
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
        if ((other instanceof EbsConfiguration) == false) {
            return false;
        }
        EbsConfiguration rhs = ((EbsConfiguration) other);
        return new EqualsBuilder().append(ebsBlockDeviceConfigs, rhs.ebsBlockDeviceConfigs).append(ebsOptimized, rhs.ebsOptimized).isEquals();
    }

}
