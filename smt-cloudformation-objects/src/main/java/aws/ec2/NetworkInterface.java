
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NetworkInterface
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AssociatePublicIpAddress",
    "DeleteOnTermination",
    "Description",
    "DeviceIndex",
    "GroupSet",
    "Ipv6AddressCount",
    "Ipv6Addresses",
    "NetworkInterfaceId",
    "PrivateIpAddress",
    "PrivateIpAddresses",
    "SecondaryPrivateIpAddressCount",
    "SubnetId"
})
public class NetworkInterface {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip
     * 
     */
    @JsonProperty("AssociatePublicIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip")
    private Boolean associatePublicIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete
     * 
     */
    @JsonProperty("DeleteOnTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete")
    private Boolean deleteOnTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex
     * 
     */
    @JsonProperty("DeviceIndex")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex")
    private String deviceIndex;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset
     * 
     */
    @JsonProperty("GroupSet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset")
    private List<String> groupSet = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount
     * 
     */
    @JsonProperty("Ipv6AddressCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount")
    private Integer ipv6AddressCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses
     * 
     */
    @JsonProperty("Ipv6Addresses")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses")
    private List<InstanceIpv6Address> ipv6Addresses = new ArrayList<InstanceIpv6Address>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface")
    private String networkInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress")
    private String privateIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses
     * 
     */
    @JsonProperty("PrivateIpAddresses")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses")
    private List<PrivateIpAddressSpecification> privateIpAddresses = new ArrayList<PrivateIpAddressSpecification>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip
     * 
     */
    @JsonProperty("SecondaryPrivateIpAddressCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip")
    private Integer secondaryPrivateIpAddressCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid")
    private String subnetId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip
     * 
     */
    @JsonProperty("AssociatePublicIpAddress")
    public Boolean getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip
     * 
     */
    @JsonProperty("AssociatePublicIpAddress")
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    public NetworkInterface withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete
     * 
     */
    @JsonProperty("DeleteOnTermination")
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete
     * 
     */
    @JsonProperty("DeleteOnTermination")
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public NetworkInterface withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public NetworkInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex
     * 
     */
    @JsonProperty("DeviceIndex")
    public String getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex
     * 
     */
    @JsonProperty("DeviceIndex")
    public void setDeviceIndex(String deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    public NetworkInterface withDeviceIndex(String deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset
     * 
     */
    @JsonProperty("GroupSet")
    public List<String> getGroupSet() {
        return groupSet;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset
     * 
     */
    @JsonProperty("GroupSet")
    public void setGroupSet(List<String> groupSet) {
        this.groupSet = groupSet;
    }

    public NetworkInterface withGroupSet(List<String> groupSet) {
        this.groupSet = groupSet;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount
     * 
     */
    @JsonProperty("Ipv6AddressCount")
    public Integer getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount
     * 
     */
    @JsonProperty("Ipv6AddressCount")
    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    public NetworkInterface withIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses
     * 
     */
    @JsonProperty("Ipv6Addresses")
    public List<InstanceIpv6Address> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses
     * 
     */
    @JsonProperty("Ipv6Addresses")
    public void setIpv6Addresses(List<InstanceIpv6Address> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
    }

    public NetworkInterface withIpv6Addresses(List<InstanceIpv6Address> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public NetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public NetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses
     * 
     */
    @JsonProperty("PrivateIpAddresses")
    public List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses
     * 
     */
    @JsonProperty("PrivateIpAddresses")
    public void setPrivateIpAddresses(List<PrivateIpAddressSpecification> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
    }

    public NetworkInterface withPrivateIpAddresses(List<PrivateIpAddressSpecification> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip
     * 
     */
    @JsonProperty("SecondaryPrivateIpAddressCount")
    public Integer getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip
     * 
     */
    @JsonProperty("SecondaryPrivateIpAddressCount")
    public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    public NetworkInterface withSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public NetworkInterface withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("associatePublicIpAddress", associatePublicIpAddress).append("deleteOnTermination", deleteOnTermination).append("description", description).append("deviceIndex", deviceIndex).append("groupSet", groupSet).append("ipv6AddressCount", ipv6AddressCount).append("ipv6Addresses", ipv6Addresses).append("networkInterfaceId", networkInterfaceId).append("privateIpAddress", privateIpAddress).append("privateIpAddresses", privateIpAddresses).append("secondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount).append("subnetId", subnetId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(networkInterfaceId).append(privateIpAddresses).append(subnetId).append(description).append(deleteOnTermination).append(ipv6Addresses).append(deviceIndex).append(groupSet).append(privateIpAddress).append(ipv6AddressCount).append(associatePublicIpAddress).append(secondaryPrivateIpAddressCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetworkInterface) == false) {
            return false;
        }
        NetworkInterface rhs = ((NetworkInterface) other);
        return new EqualsBuilder().append(networkInterfaceId, rhs.networkInterfaceId).append(privateIpAddresses, rhs.privateIpAddresses).append(subnetId, rhs.subnetId).append(description, rhs.description).append(deleteOnTermination, rhs.deleteOnTermination).append(ipv6Addresses, rhs.ipv6Addresses).append(deviceIndex, rhs.deviceIndex).append(groupSet, rhs.groupSet).append(privateIpAddress, rhs.privateIpAddress).append(ipv6AddressCount, rhs.ipv6AddressCount).append(associatePublicIpAddress, rhs.associatePublicIpAddress).append(secondaryPrivateIpAddressCount, rhs.secondaryPrivateIpAddressCount).isEquals();
    }

}
