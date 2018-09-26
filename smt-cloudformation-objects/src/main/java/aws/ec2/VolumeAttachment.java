
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VolumeAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Device",
    "InstanceId",
    "VolumeId"
})
public class VolumeAttachment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device
     * 
     */
    @JsonProperty("Device")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device")
    private CharSequence device;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid
     * 
     */
    @JsonProperty("VolumeId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid")
    private CharSequence volumeId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device
     * 
     */
    public CharSequence getDevice() {
        return device;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device
     * 
     */
    public void setDevice(CharSequence device) {
        this.device = device;
    }

    public VolumeAttachment withDevice(CharSequence device) {
        this.device = device;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid
     * 
     */
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid
     * 
     */
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public VolumeAttachment withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid
     * 
     */
    public CharSequence getVolumeId() {
        return volumeId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid
     * 
     */
    public void setVolumeId(CharSequence volumeId) {
        this.volumeId = volumeId;
    }

    public VolumeAttachment withVolumeId(CharSequence volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("device", device).append("instanceId", instanceId).append("volumeId", volumeId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeId).append(instanceId).append(device).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VolumeAttachment) == false) {
            return false;
        }
        VolumeAttachment rhs = ((VolumeAttachment) other);
        return new EqualsBuilder().append(volumeId, rhs.volumeId).append(instanceId, rhs.instanceId).append(device, rhs.device).isEquals();
    }

}
