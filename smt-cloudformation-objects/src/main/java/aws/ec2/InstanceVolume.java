
package aws.ec2;

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
 * InstanceVolume
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Device",
    "VolumeId"
})
public class InstanceVolume implements Property<InstanceVolume>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device
     * 
     */
    @JsonProperty("Device")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device")
    private CharSequence device;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid
     * 
     */
    @JsonProperty("VolumeId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid")
    private CharSequence volumeId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device
     * 
     */
    @JsonIgnore
    public CharSequence getDevice() {
        return device;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device
     * 
     */
    @JsonIgnore
    public void setDevice(CharSequence device) {
        this.device = device;
    }

    public InstanceVolume withDevice(CharSequence device) {
        this.device = device;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid
     * 
     */
    @JsonIgnore
    public CharSequence getVolumeId() {
        return volumeId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid
     * 
     */
    @JsonIgnore
    public void setVolumeId(CharSequence volumeId) {
        this.volumeId = volumeId;
    }

    public InstanceVolume withVolumeId(CharSequence volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("device", device).append("volumeId", volumeId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeId).append(device).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceVolume) == false) {
            return false;
        }
        InstanceVolume rhs = ((InstanceVolume) other);
        return new EqualsBuilder().append(volumeId, rhs.volumeId).append(device, rhs.device).isEquals();
    }

}
