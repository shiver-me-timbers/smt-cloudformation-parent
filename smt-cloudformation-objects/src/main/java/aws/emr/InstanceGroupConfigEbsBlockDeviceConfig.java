
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
 * InstanceGroupConfigEbsBlockDeviceConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VolumeSpecification",
    "VolumesPerInstance"
})
public class InstanceGroupConfigEbsBlockDeviceConfig implements Property<InstanceGroupConfigEbsBlockDeviceConfig>
{

    /**
     * InstanceGroupConfigVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html
     * 
     */
    @JsonProperty("VolumeSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html")
    private Property<InstanceGroupConfigVolumeSpecification> volumeSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonProperty("VolumesPerInstance")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumesperinstance")
    private Number volumesPerInstance;

    /**
     * InstanceGroupConfigVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html
     * 
     */
    @JsonIgnore
    public Property<InstanceGroupConfigVolumeSpecification> getVolumeSpecification() {
        return volumeSpecification;
    }

    /**
     * InstanceGroupConfigVolumeSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig-volumespecification.html
     * 
     */
    @JsonIgnore
    public void setVolumeSpecification(Property<InstanceGroupConfigVolumeSpecification> volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
    }

    public InstanceGroupConfigEbsBlockDeviceConfig withVolumeSpecification(Property<InstanceGroupConfigVolumeSpecification> volumeSpecification) {
        this.volumeSpecification = volumeSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonIgnore
    public Number getVolumesPerInstance() {
        return volumesPerInstance;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-ebsconfiguration-ebsblockdeviceconfig.html#cfn-emr-ebsconfiguration-ebsblockdeviceconfig-volumesperinstance
     * 
     */
    @JsonIgnore
    public void setVolumesPerInstance(Number volumesPerInstance) {
        this.volumesPerInstance = volumesPerInstance;
    }

    public InstanceGroupConfigEbsBlockDeviceConfig withVolumesPerInstance(Number volumesPerInstance) {
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
        if ((other instanceof InstanceGroupConfigEbsBlockDeviceConfig) == false) {
            return false;
        }
        InstanceGroupConfigEbsBlockDeviceConfig rhs = ((InstanceGroupConfigEbsBlockDeviceConfig) other);
        return new EqualsBuilder().append(volumeSpecification, rhs.volumeSpecification).append(volumesPerInstance, rhs.volumesPerInstance).isEquals();
    }

}
