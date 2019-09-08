
package shiver.me.timbers.aws.msk;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ClusterBrokerNodeGroupInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SecurityGroups",
    "ClientSubnets",
    "StorageInfo",
    "BrokerAZDistribution",
    "InstanceType"
})
public class ClusterBrokerNodeGroupInfo implements Property<ClusterBrokerNodeGroupInfo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-securitygroups")
    private List<CharSequence> securityGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-clientsubnets
     * 
     */
    @JsonProperty("ClientSubnets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-clientsubnets")
    private List<CharSequence> clientSubnets = new ArrayList<CharSequence>();
    /**
     * ClusterStorageInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html
     * 
     */
    @JsonProperty("StorageInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html")
    private Property<ClusterStorageInfo> storageInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-brokerazdistribution
     * 
     */
    @JsonProperty("BrokerAZDistribution")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-brokerazdistribution")
    private CharSequence brokerAZDistribution;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-instancetype")
    private CharSequence instanceType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-securitygroups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-securitygroups
     * 
     */
    @JsonIgnore
    public void setSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ClusterBrokerNodeGroupInfo withSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-clientsubnets
     * 
     */
    @JsonIgnore
    public List<CharSequence> getClientSubnets() {
        return clientSubnets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-clientsubnets
     * 
     */
    @JsonIgnore
    public void setClientSubnets(List<CharSequence> clientSubnets) {
        this.clientSubnets = clientSubnets;
    }

    public ClusterBrokerNodeGroupInfo withClientSubnets(List<CharSequence> clientSubnets) {
        this.clientSubnets = clientSubnets;
        return this;
    }

    /**
     * ClusterStorageInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html
     * 
     */
    @JsonIgnore
    public Property<ClusterStorageInfo> getStorageInfo() {
        return storageInfo;
    }

    /**
     * ClusterStorageInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html
     * 
     */
    @JsonIgnore
    public void setStorageInfo(Property<ClusterStorageInfo> storageInfo) {
        this.storageInfo = storageInfo;
    }

    public ClusterBrokerNodeGroupInfo withStorageInfo(Property<ClusterStorageInfo> storageInfo) {
        this.storageInfo = storageInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-brokerazdistribution
     * 
     */
    @JsonIgnore
    public CharSequence getBrokerAZDistribution() {
        return brokerAZDistribution;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-brokerazdistribution
     * 
     */
    @JsonIgnore
    public void setBrokerAZDistribution(CharSequence brokerAZDistribution) {
        this.brokerAZDistribution = brokerAZDistribution;
    }

    public ClusterBrokerNodeGroupInfo withBrokerAZDistribution(CharSequence brokerAZDistribution) {
        this.brokerAZDistribution = brokerAZDistribution;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html#cfn-msk-cluster-brokernodegroupinfo-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public ClusterBrokerNodeGroupInfo withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("securityGroups", securityGroups).append("clientSubnets", clientSubnets).append("storageInfo", storageInfo).append("brokerAZDistribution", brokerAZDistribution).append("instanceType", instanceType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(securityGroups).append(clientSubnets).append(brokerAZDistribution).append(storageInfo).append(instanceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterBrokerNodeGroupInfo) == false) {
            return false;
        }
        ClusterBrokerNodeGroupInfo rhs = ((ClusterBrokerNodeGroupInfo) other);
        return new EqualsBuilder().append(securityGroups, rhs.securityGroups).append(clientSubnets, rhs.clientSubnets).append(brokerAZDistribution, rhs.brokerAZDistribution).append(storageInfo, rhs.storageInfo).append(instanceType, rhs.instanceType).isEquals();
    }

}
