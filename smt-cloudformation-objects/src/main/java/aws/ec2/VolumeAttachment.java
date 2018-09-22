
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
    private String device;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid")
    private String instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid
     * 
     */
    @JsonProperty("VolumeId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid")
    private String volumeId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device
     * 
     */
    @JsonProperty("Device")
    public String getDevice() {
        return device;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-device
     * 
     */
    @JsonProperty("Device")
    public void setDevice(String device) {
        this.device = device;
    }

    public VolumeAttachment withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public VolumeAttachment withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid
     * 
     */
    @JsonProperty("VolumeId")
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volumeattachment.html#cfn-ec2-ebs-volumeattachment-volumeid
     * 
     */
    @JsonProperty("VolumeId")
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public VolumeAttachment withVolumeId(String volumeId) {
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
