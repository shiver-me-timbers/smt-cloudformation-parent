
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EbsBlockDeviceConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "VolumeSpecification",
    "VolumesPerInstance"
})
public class EbsBlockDeviceConfig {

    /**
     * VolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html
     * 
     */
    @JsonProperty("VolumeSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html")
    private VolumeSpecification volumeSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonProperty("VolumesPerInstance")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance")
    private Integer volumesPerInstance;

    /**
     * VolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html
     * 
     */
    public VolumeSpecification getVolumeSpecification() {
        return volumeSpecification;
    }

    /**
     * VolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html
     * 
     */
    public void setVolumeSpecification(VolumeSpecification volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
    }

    public EbsBlockDeviceConfig withVolumeSpecification(VolumeSpecification volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    public Integer getVolumesPerInstance() {
        return volumesPerInstance;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-ebsblockdeviceconfig.html#cfn-elasticmapreduce-cluster-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    public void setVolumesPerInstance(Integer volumesPerInstance) {
        this.volumesPerInstance = volumesPerInstance;
    }

    public EbsBlockDeviceConfig withVolumesPerInstance(Integer volumesPerInstance) {
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
        if ((other instanceof EbsBlockDeviceConfig) == false) {
            return false;
        }
        EbsBlockDeviceConfig rhs = ((EbsBlockDeviceConfig) other);
        return new EqualsBuilder().append(volumeSpecification, rhs.volumeSpecification).append(volumesPerInstance, rhs.volumesPerInstance).isEquals();
    }

}
