
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
 * InstanceGroupConfigEbsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EbsBlockDeviceConfigs",
    "EbsOptimized"
})
public class InstanceGroupConfigEbsConfiguration implements Property<InstanceGroupConfigEbsConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    @JsonProperty("EbsBlockDeviceConfigs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfigs")
    private Set<Property<InstanceGroupConfigEbsBlockDeviceConfig>> ebsBlockDeviceConfigs = new LinkedHashSet<Property<InstanceGroupConfigEbsBlockDeviceConfig>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsoptimized")
    private CharSequence ebsOptimized;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    @JsonIgnore
    public Set<Property<InstanceGroupConfigEbsBlockDeviceConfig>> getEbsBlockDeviceConfigs() {
        return ebsBlockDeviceConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfigs
     * 
     */
    @JsonIgnore
    public void setEbsBlockDeviceConfigs(Set<Property<InstanceGroupConfigEbsBlockDeviceConfig>> ebsBlockDeviceConfigs) {
        this.ebsBlockDeviceConfigs = ebsBlockDeviceConfigs;
    }

    public InstanceGroupConfigEbsConfiguration withEbsBlockDeviceConfigs(Set<Property<InstanceGroupConfigEbsBlockDeviceConfig>> ebsBlockDeviceConfigs) {
        this.ebsBlockDeviceConfigs = ebsBlockDeviceConfigs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsoptimized
     * 
     */
    @JsonIgnore
    public CharSequence getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration.html#cfn-emr-ebsconfiguration-ebsoptimized
     * 
     */
    @JsonIgnore
    public void setEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public InstanceGroupConfigEbsConfiguration withEbsOptimized(CharSequence ebsOptimized) {
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
        if ((other instanceof InstanceGroupConfigEbsConfiguration) == false) {
            return false;
        }
        InstanceGroupConfigEbsConfiguration rhs = ((InstanceGroupConfigEbsConfiguration) other);
        return new EqualsBuilder().append(ebsBlockDeviceConfigs, rhs.ebsBlockDeviceConfigs).append(ebsOptimized, rhs.ebsOptimized).isEquals();
    }

}
