
package aws.emr;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceFleetConfigEbsBlockDeviceConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VolumeSpecification",
    "VolumesPerInstance"
})
public class InstanceFleetConfigEbsBlockDeviceConfig implements Property<InstanceFleetConfigEbsBlockDeviceConfig>
{

    /**
     * InstanceFleetConfigVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html
     * 
     */
    @JsonProperty("VolumeSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html")
    private Property<InstanceFleetConfigVolumeSpecification> volumeSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonProperty("VolumesPerInstance")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance")
    private Number volumesPerInstance;

    /**
     * InstanceFleetConfigVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html
     * 
     */
    @JsonIgnore
    public Property<InstanceFleetConfigVolumeSpecification> getVolumeSpecification() {
        return volumeSpecification;
    }

    /**
     * InstanceFleetConfigVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-volumespecification.html
     * 
     */
    @JsonIgnore
    public void setVolumeSpecification(Property<InstanceFleetConfigVolumeSpecification> volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
    }

    public InstanceFleetConfigEbsBlockDeviceConfig withVolumeSpecification(Property<InstanceFleetConfigVolumeSpecification> volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonIgnore
    public Number getVolumesPerInstance() {
        return volumesPerInstance;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig.html#cfn-elasticmapreduce-instancefleetconfig-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonIgnore
    public void setVolumesPerInstance(Number volumesPerInstance) {
        this.volumesPerInstance = volumesPerInstance;
    }

    public InstanceFleetConfigEbsBlockDeviceConfig withVolumesPerInstance(Number volumesPerInstance) {
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
        if ((other instanceof InstanceFleetConfigEbsBlockDeviceConfig) == false) {
            return false;
        }
        InstanceFleetConfigEbsBlockDeviceConfig rhs = ((InstanceFleetConfigEbsBlockDeviceConfig) other);
        return new EqualsBuilder().append(volumeSpecification, rhs.volumeSpecification).append(volumesPerInstance, rhs.volumesPerInstance).isEquals();
    }

}
