
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NetworkInterfaceAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeleteOnTermination",
    "DeviceIndex",
    "InstanceId",
    "NetworkInterfaceId"
})
public class NetworkInterfaceAttachment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deleteonterm
     * 
     */
    @JsonProperty("DeleteOnTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deleteonterm")
    private Boolean deleteOnTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deviceindex
     * 
     */
    @JsonProperty("DeviceIndex")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deviceindex")
    private CharSequence deviceIndex;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-networkinterfaceid")
    private CharSequence networkInterfaceId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deleteonterm
     * 
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deleteonterm
     * 
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public NetworkInterfaceAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deviceindex
     * 
     */
    public CharSequence getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-deviceindex
     * 
     */
    public void setDeviceIndex(CharSequence deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    public NetworkInterfaceAttachment withDeviceIndex(CharSequence deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-instanceid
     * 
     */
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-instanceid
     * 
     */
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public NetworkInterfaceAttachment withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-networkinterfaceid
     * 
     */
    public CharSequence getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-interface-attachment.html#cfn-ec2-network-interface-attachment-networkinterfaceid
     * 
     */
    public void setNetworkInterfaceId(CharSequence networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public NetworkInterfaceAttachment withNetworkInterfaceId(CharSequence networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deleteOnTermination", deleteOnTermination).append("deviceIndex", deviceIndex).append("instanceId", instanceId).append("networkInterfaceId", networkInterfaceId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkInterfaceId).append(deleteOnTermination).append(instanceId).append(deviceIndex).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetworkInterfaceAttachment) == false) {
            return false;
        }
        NetworkInterfaceAttachment rhs = ((NetworkInterfaceAttachment) other);
        return new EqualsBuilder().append(networkInterfaceId, rhs.networkInterfaceId).append(deleteOnTermination, rhs.deleteOnTermination).append(instanceId, rhs.instanceId).append(deviceIndex, rhs.deviceIndex).isEquals();
    }

}
