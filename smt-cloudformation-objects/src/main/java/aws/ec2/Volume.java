
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Volume
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Device",
    "VolumeId"
})
public class Volume {

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
    public CharSequence getDevice() {
        return device;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-device
     * 
     */
    public void setDevice(CharSequence device) {
        this.device = device;
    }

    public Volume withDevice(CharSequence device) {
        this.device = device;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid
     * 
     */
    public CharSequence getVolumeId() {
        return volumeId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-mount-point.html#cfn-ec2-mountpoint-volumeid
     * 
     */
    public void setVolumeId(CharSequence volumeId) {
        this.volumeId = volumeId;
    }

    public Volume withVolumeId(CharSequence volumeId) {
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
        if ((other instanceof Volume) == false) {
            return false;
        }
        Volume rhs = ((Volume) other);
        return new EqualsBuilder().append(volumeId, rhs.volumeId).append(device, rhs.device).isEquals();
    }

}
