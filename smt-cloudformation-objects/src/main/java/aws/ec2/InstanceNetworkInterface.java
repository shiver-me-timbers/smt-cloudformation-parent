
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
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
 * InstanceNetworkInterface
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
public class InstanceNetworkInterface implements Property<InstanceNetworkInterface>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip
     * 
     */
    @JsonProperty("AssociatePublicIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip")
    private CharSequence associatePublicIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete
     * 
     */
    @JsonProperty("DeleteOnTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete")
    private CharSequence deleteOnTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex
     * 
     */
    @JsonProperty("DeviceIndex")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex")
    private CharSequence deviceIndex;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset
     * 
     */
    @JsonProperty("GroupSet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset")
    private List<CharSequence> groupSet = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount
     * 
     */
    @JsonProperty("Ipv6AddressCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount")
    private Number ipv6AddressCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses
     * 
     */
    @JsonProperty("Ipv6Addresses")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses")
    private List<Property<InstanceInstanceIpv6Address>> ipv6Addresses = new ArrayList<Property<InstanceInstanceIpv6Address>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface
     * 
     */
    @JsonProperty("NetworkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface")
    private CharSequence networkInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress")
    private CharSequence privateIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses
     * 
     */
    @JsonProperty("PrivateIpAddresses")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses")
    private List<Property<InstancePrivateIpAddressSpecification>> privateIpAddresses = new ArrayList<Property<InstancePrivateIpAddressSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip
     * 
     */
    @JsonProperty("SecondaryPrivateIpAddressCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip")
    private Number secondaryPrivateIpAddressCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid")
    private CharSequence subnetId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip
     * 
     */
    @JsonIgnore
    public CharSequence getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-associatepubip
     * 
     */
    @JsonIgnore
    public void setAssociatePublicIpAddress(CharSequence associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    public InstanceNetworkInterface withAssociatePublicIpAddress(CharSequence associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete
     * 
     */
    @JsonIgnore
    public CharSequence getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-delete
     * 
     */
    @JsonIgnore
    public void setDeleteOnTermination(CharSequence deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public InstanceNetworkInterface withDeleteOnTermination(CharSequence deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public InstanceNetworkInterface withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-deviceindex
     * 
     */
    @JsonIgnore
    public void setDeviceIndex(CharSequence deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    public InstanceNetworkInterface withDeviceIndex(CharSequence deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset
     * 
     */
    @JsonIgnore
    public List<CharSequence> getGroupSet() {
        return groupSet;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-groupset
     * 
     */
    @JsonIgnore
    public void setGroupSet(List<CharSequence> groupSet) {
        this.groupSet = groupSet;
    }

    public InstanceNetworkInterface withGroupSet(List<CharSequence> groupSet) {
        this.groupSet = groupSet;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount
     * 
     */
    @JsonIgnore
    public Number getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresscount
     * 
     */
    @JsonIgnore
    public void setIpv6AddressCount(Number ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    public InstanceNetworkInterface withIpv6AddressCount(Number ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses
     * 
     */
    @JsonIgnore
    public List<Property<InstanceInstanceIpv6Address>> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#cfn-ec2-instance-networkinterface-ipv6addresses
     * 
     */
    @JsonIgnore
    public void setIpv6Addresses(List<Property<InstanceInstanceIpv6Address>> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
    }

    public InstanceNetworkInterface withIpv6Addresses(List<Property<InstanceInstanceIpv6Address>> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface
     * 
     */
    @JsonIgnore
    public CharSequence getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-network-iface
     * 
     */
    @JsonIgnore
    public void setNetworkInterfaceId(CharSequence networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public InstanceNetworkInterface withNetworkInterfaceId(CharSequence networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress
     * 
     */
    @JsonIgnore
    public CharSequence getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddress
     * 
     */
    @JsonIgnore
    public void setPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public InstanceNetworkInterface withPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses
     * 
     */
    @JsonIgnore
    public List<Property<InstancePrivateIpAddressSpecification>> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-privateipaddresses
     * 
     */
    @JsonIgnore
    public void setPrivateIpAddresses(List<Property<InstancePrivateIpAddressSpecification>> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
    }

    public InstanceNetworkInterface withPrivateIpAddresses(List<Property<InstancePrivateIpAddressSpecification>> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip
     * 
     */
    @JsonIgnore
    public Number getSecondaryPrivateIpAddressCount() {
        return secondaryPrivateIpAddressCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-secondprivateip
     * 
     */
    @JsonIgnore
    public void setSecondaryPrivateIpAddressCount(Number secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    public InstanceNetworkInterface withSecondaryPrivateIpAddressCount(Number secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid
     * 
     */
    @JsonIgnore
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-iface-embedded.html#aws-properties-ec2-network-iface-embedded-subnetid
     * 
     */
    @JsonIgnore
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceNetworkInterface withSubnetId(CharSequence subnetId) {
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
        if ((other instanceof InstanceNetworkInterface) == false) {
            return false;
        }
        InstanceNetworkInterface rhs = ((InstanceNetworkInterface) other);
        return new EqualsBuilder().append(networkInterfaceId, rhs.networkInterfaceId).append(privateIpAddresses, rhs.privateIpAddresses).append(subnetId, rhs.subnetId).append(description, rhs.description).append(deleteOnTermination, rhs.deleteOnTermination).append(ipv6Addresses, rhs.ipv6Addresses).append(deviceIndex, rhs.deviceIndex).append(groupSet, rhs.groupSet).append(privateIpAddress, rhs.privateIpAddress).append(ipv6AddressCount, rhs.ipv6AddressCount).append(associatePublicIpAddress, rhs.associatePublicIpAddress).append(secondaryPrivateIpAddressCount, rhs.secondaryPrivateIpAddressCount).isEquals();
    }

}
