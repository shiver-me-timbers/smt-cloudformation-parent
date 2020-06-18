
package shiver.me.timbers.aws.msk;

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
 * Cluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BrokerNodeGroupInfo",
    "EnhancedMonitoring",
    "KafkaVersion",
    "NumberOfBrokerNodes",
    "EncryptionInfo",
    "OpenMonitoring",
    "ClusterName",
    "ClientAuthentication",
    "LoggingInfo",
    "Tags",
    "ConfigurationInfo"
})
public class Cluster {

    /**
     * ClusterBrokerNodeGroupInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html
     * 
     */
    @JsonProperty("BrokerNodeGroupInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html")
    private Property<ClusterBrokerNodeGroupInfo> brokerNodeGroupInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring
     * 
     */
    @JsonProperty("EnhancedMonitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring")
    private CharSequence enhancedMonitoring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion
     * 
     */
    @JsonProperty("KafkaVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion")
    private CharSequence kafkaVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes
     * 
     */
    @JsonProperty("NumberOfBrokerNodes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes")
    private Number numberOfBrokerNodes;
    /**
     * ClusterEncryptionInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html
     * 
     */
    @JsonProperty("EncryptionInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html")
    private Property<ClusterEncryptionInfo> encryptionInfo;
    /**
     * ClusterOpenMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html
     * 
     */
    @JsonProperty("OpenMonitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html")
    private Property<ClusterOpenMonitoring> openMonitoring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername
     * 
     */
    @JsonProperty("ClusterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername")
    private CharSequence clusterName;
    /**
     * ClusterClientAuthentication
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html
     * 
     */
    @JsonProperty("ClientAuthentication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html")
    private Property<ClusterClientAuthentication> clientAuthentication;
    /**
     * ClusterLoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html
     * 
     */
    @JsonProperty("LoggingInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html")
    private Property<ClusterLoggingInfo> loggingInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags")
    private Object tags;
    /**
     * ClusterConfigurationInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html
     * 
     */
    @JsonProperty("ConfigurationInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html")
    private Property<ClusterConfigurationInfo> configurationInfo;

    /**
     * ClusterBrokerNodeGroupInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html
     * 
     */
    @JsonIgnore
    public Property<ClusterBrokerNodeGroupInfo> getBrokerNodeGroupInfo() {
        return brokerNodeGroupInfo;
    }

    /**
     * ClusterBrokerNodeGroupInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-brokernodegroupinfo.html
     * 
     */
    @JsonIgnore
    public void setBrokerNodeGroupInfo(Property<ClusterBrokerNodeGroupInfo> brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
    }

    public Cluster withBrokerNodeGroupInfo(Property<ClusterBrokerNodeGroupInfo> brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring
     * 
     */
    @JsonIgnore
    public CharSequence getEnhancedMonitoring() {
        return enhancedMonitoring;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-enhancedmonitoring
     * 
     */
    @JsonIgnore
    public void setEnhancedMonitoring(CharSequence enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    public Cluster withEnhancedMonitoring(CharSequence enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion
     * 
     */
    @JsonIgnore
    public CharSequence getKafkaVersion() {
        return kafkaVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-kafkaversion
     * 
     */
    @JsonIgnore
    public void setKafkaVersion(CharSequence kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
    }

    public Cluster withKafkaVersion(CharSequence kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes
     * 
     */
    @JsonIgnore
    public Number getNumberOfBrokerNodes() {
        return numberOfBrokerNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-numberofbrokernodes
     * 
     */
    @JsonIgnore
    public void setNumberOfBrokerNodes(Number numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
    }

    public Cluster withNumberOfBrokerNodes(Number numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
        return this;
    }

    /**
     * ClusterEncryptionInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html
     * 
     */
    @JsonIgnore
    public Property<ClusterEncryptionInfo> getEncryptionInfo() {
        return encryptionInfo;
    }

    /**
     * ClusterEncryptionInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-encryptioninfo.html
     * 
     */
    @JsonIgnore
    public void setEncryptionInfo(Property<ClusterEncryptionInfo> encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
    }

    public Cluster withEncryptionInfo(Property<ClusterEncryptionInfo> encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
        return this;
    }

    /**
     * ClusterOpenMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html
     * 
     */
    @JsonIgnore
    public Property<ClusterOpenMonitoring> getOpenMonitoring() {
        return openMonitoring;
    }

    /**
     * ClusterOpenMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html
     * 
     */
    @JsonIgnore
    public void setOpenMonitoring(Property<ClusterOpenMonitoring> openMonitoring) {
        this.openMonitoring = openMonitoring;
    }

    public Cluster withOpenMonitoring(Property<ClusterOpenMonitoring> openMonitoring) {
        this.openMonitoring = openMonitoring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername
     * 
     */
    @JsonIgnore
    public CharSequence getClusterName() {
        return clusterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-clustername
     * 
     */
    @JsonIgnore
    public void setClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
    }

    public Cluster withClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * ClusterClientAuthentication
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html
     * 
     */
    @JsonIgnore
    public Property<ClusterClientAuthentication> getClientAuthentication() {
        return clientAuthentication;
    }

    /**
     * ClusterClientAuthentication
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-clientauthentication.html
     * 
     */
    @JsonIgnore
    public void setClientAuthentication(Property<ClusterClientAuthentication> clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    public Cluster withClientAuthentication(Property<ClusterClientAuthentication> clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
        return this;
    }

    /**
     * ClusterLoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html
     * 
     */
    @JsonIgnore
    public Property<ClusterLoggingInfo> getLoggingInfo() {
        return loggingInfo;
    }

    /**
     * ClusterLoggingInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-logginginfo.html
     * 
     */
    @JsonIgnore
    public void setLoggingInfo(Property<ClusterLoggingInfo> loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    public Cluster withLoggingInfo(Property<ClusterLoggingInfo> loggingInfo) {
        this.loggingInfo = loggingInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-cluster.html#cfn-msk-cluster-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Cluster withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * ClusterConfigurationInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html
     * 
     */
    @JsonIgnore
    public Property<ClusterConfigurationInfo> getConfigurationInfo() {
        return configurationInfo;
    }

    /**
     * ClusterConfigurationInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html
     * 
     */
    @JsonIgnore
    public void setConfigurationInfo(Property<ClusterConfigurationInfo> configurationInfo) {
        this.configurationInfo = configurationInfo;
    }

    public Cluster withConfigurationInfo(Property<ClusterConfigurationInfo> configurationInfo) {
        this.configurationInfo = configurationInfo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("brokerNodeGroupInfo", brokerNodeGroupInfo).append("enhancedMonitoring", enhancedMonitoring).append("kafkaVersion", kafkaVersion).append("numberOfBrokerNodes", numberOfBrokerNodes).append("encryptionInfo", encryptionInfo).append("openMonitoring", openMonitoring).append("clusterName", clusterName).append("clientAuthentication", clientAuthentication).append("loggingInfo", loggingInfo).append("tags", tags).append("configurationInfo", configurationInfo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(numberOfBrokerNodes).append(encryptionInfo).append(configurationInfo).append(enhancedMonitoring).append(kafkaVersion).append(clusterName).append(clientAuthentication).append(loggingInfo).append(brokerNodeGroupInfo).append(openMonitoring).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cluster) == false) {
            return false;
        }
        Cluster rhs = ((Cluster) other);
        return new EqualsBuilder().append(numberOfBrokerNodes, rhs.numberOfBrokerNodes).append(encryptionInfo, rhs.encryptionInfo).append(configurationInfo, rhs.configurationInfo).append(enhancedMonitoring, rhs.enhancedMonitoring).append(kafkaVersion, rhs.kafkaVersion).append(clusterName, rhs.clusterName).append(clientAuthentication, rhs.clientAuthentication).append(loggingInfo, rhs.loggingInfo).append(brokerNodeGroupInfo, rhs.brokerNodeGroupInfo).append(openMonitoring, rhs.openMonitoring).append(tags, rhs.tags).isEquals();
    }

}
