
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EIPAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllocationId",
    "EIP",
    "InstanceId",
    "NetworkInterfaceId",
    "PrivateIpAddress"
})
public class EIPAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid
     * 
     */
    @JsonProperty("AllocationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid")
    private CharSequence allocationId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip
     * 
     */
    @JsonProperty("EIP")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip")
    private CharSequence eIP;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid")
    private CharSequence networkInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress")
    private CharSequence privateIpAddress;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid
     * 
     */
    public CharSequence getAllocationId() {
        return allocationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid
     * 
     */
    public void setAllocationId(CharSequence allocationId) {
        this.allocationId = allocationId;
    }

    public EIPAssociation withAllocationId(CharSequence allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip
     * 
     */
    public CharSequence getEIP() {
        return eIP;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip
     * 
     */
    public void setEIP(CharSequence eIP) {
        this.eIP = eIP;
    }

    public EIPAssociation withEIP(CharSequence eIP) {
        this.eIP = eIP;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid
     * 
     */
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid
     * 
     */
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public EIPAssociation withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid
     * 
     */
    public CharSequence getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid
     * 
     */
    public void setNetworkInterfaceId(CharSequence networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public EIPAssociation withNetworkInterfaceId(CharSequence networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress
     * 
     */
    public CharSequence getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress
     * 
     */
    public void setPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public EIPAssociation withPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allocationId", allocationId).append("eIP", eIP).append("instanceId", instanceId).append("networkInterfaceId", networkInterfaceId).append("privateIpAddress", privateIpAddress).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkInterfaceId).append(allocationId).append(instanceId).append(eIP).append(privateIpAddress).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EIPAssociation) == false) {
            return false;
        }
        EIPAssociation rhs = ((EIPAssociation) other);
        return new EqualsBuilder().append(networkInterfaceId, rhs.networkInterfaceId).append(allocationId, rhs.allocationId).append(instanceId, rhs.instanceId).append(eIP, rhs.eIP).append(privateIpAddress, rhs.privateIpAddress).isEquals();
    }

}
