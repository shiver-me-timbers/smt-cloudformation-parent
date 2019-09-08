
package shiver.me.timbers.aws.emr;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ClusterEbsBlockDeviceConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VolumeSpecification",
    "VolumesPerInstance"
})
public class ClusterEbsBlockDeviceConfig implements Property<ClusterEbsBlockDeviceConfig>
{

    /**
     * ClusterVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html
     * 
     */
    @JsonProperty("VolumeSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html")
    private Property<ClusterVolumeSpecification> volumeSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonProperty("VolumesPerInstance")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance")
    private Number volumesPerInstance;

    /**
     * ClusterVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html
     * 
     */
    @JsonIgnore
    public Property<ClusterVolumeSpecification> getVolumeSpecification() {
        return volumeSpecification;
    }

    /**
     * ClusterVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-volumespecification.html
     * 
     */
    @JsonIgnore
    public void setVolumeSpecification(Property<ClusterVolumeSpecification> volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
    }

    public ClusterEbsBlockDeviceConfig withVolumeSpecification(Property<ClusterVolumeSpecification> volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonIgnore
    public Number getVolumesPerInstance() {
        return volumesPerInstance;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonIgnore
    public void setVolumesPerInstance(Number volumesPerInstance) {
        this.volumesPerInstance = volumesPerInstance;
    }

    public ClusterEbsBlockDeviceConfig withVolumesPerInstance(Number volumesPerInstance) {
        this.volumesPerInstance = volumesPerInstance;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("volumeSpecification", volumeSpecification).append("volumesPerInstance", volumesPerInstance).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeSpecification).append(volumesPerInstance).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterEbsBlockDeviceConfig) == false) {
            return false;
        }
        ClusterEbsBlockDeviceConfig rhs = ((ClusterEbsBlockDeviceConfig) other);
        return new EqualsBuilder().append(volumeSpecification, rhs.volumeSpecification).append(volumesPerInstance, rhs.volumesPerInstance).isEquals();
    }

}
