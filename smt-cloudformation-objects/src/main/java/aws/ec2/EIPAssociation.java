
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
    private String allocationId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip
     * 
     */
    @JsonProperty("EIP")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip")
    private String eIP;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid")
    private String instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid")
    private String networkInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress")
    private String privateIpAddress;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid
     * 
     */
    @JsonProperty("AllocationId")
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-allocationid
     * 
     */
    @JsonProperty("AllocationId")
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public EIPAssociation withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip
     * 
     */
    @JsonProperty("EIP")
    public String getEIP() {
        return eIP;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-eip
     * 
     */
    @JsonProperty("EIP")
    public void setEIP(String eIP) {
        this.eIP = eIP;
    }

    public EIPAssociation withEIP(String eIP) {
        this.eIP = eIP;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public EIPAssociation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-networkinterfaceid
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public EIPAssociation withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip-association.html#cfn-ec2-eipassociation-PrivateIpAddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public EIPAssociation withPrivateIpAddress(String privateIpAddress) {
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
