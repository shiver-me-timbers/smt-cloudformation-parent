
package shiver.me.timbers.aws.amazonmq;

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
 * Broker
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SecurityGroups",
    "StorageType",
    "EngineVersion",
    "Configuration",
    "MaintenanceWindowStartTime",
    "HostInstanceType",
    "AutoMinorVersionUpgrade",
    "Users",
    "Logs",
    "SubnetIds",
    "BrokerName",
    "DeploymentMode",
    "EngineType",
    "PubliclyAccessible",
    "EncryptionOptions",
    "Tags"
})
public class Broker {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups")
    private List<CharSequence> securityGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype
     * 
     */
    @JsonProperty("StorageType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype")
    private CharSequence storageType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion")
    private CharSequence engineVersion;
    /**
     * BrokerConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    @JsonProperty("Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html")
    private Property<BrokerConfigurationId> configuration;
    /**
     * BrokerMaintenanceWindow
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html
     * 
     */
    @JsonProperty("MaintenanceWindowStartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html")
    private Property<BrokerMaintenanceWindow> maintenanceWindowStartTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype
     * 
     */
    @JsonProperty("HostInstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype")
    private CharSequence hostInstanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade")
    private CharSequence autoMinorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users
     * 
     */
    @JsonProperty("Users")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users")
    private List<Property<BrokerUser>> users = new ArrayList<Property<BrokerUser>>();
    /**
     * BrokerLogList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html
     * 
     */
    @JsonProperty("Logs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html")
    private Property<BrokerLogList> logs;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids")
    private List<CharSequence> subnetIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername
     * 
     */
    @JsonProperty("BrokerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername")
    private CharSequence brokerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode
     * 
     */
    @JsonProperty("DeploymentMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode")
    private CharSequence deploymentMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype
     * 
     */
    @JsonProperty("EngineType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype")
    private CharSequence engineType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible")
    private CharSequence publiclyAccessible;
    /**
     * BrokerEncryptionOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html
     * 
     */
    @JsonProperty("EncryptionOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html")
    private Property<BrokerEncryptionOptions> encryptionOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags")
    private List<Property<BrokerTagsEntry>> tags = new ArrayList<Property<BrokerTagsEntry>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups
     * 
     */
    @JsonIgnore
    public void setSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public Broker withSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype
     * 
     */
    @JsonIgnore
    public CharSequence getStorageType() {
        return storageType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-storagetype
     * 
     */
    @JsonIgnore
    public void setStorageType(CharSequence storageType) {
        this.storageType = storageType;
    }

    public Broker withStorageType(CharSequence storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion
     * 
     */
    @JsonIgnore
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion
     * 
     */
    @JsonIgnore
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public Broker withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * BrokerConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    @JsonIgnore
    public Property<BrokerConfigurationId> getConfiguration() {
        return configuration;
    }

    /**
     * BrokerConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    @JsonIgnore
    public void setConfiguration(Property<BrokerConfigurationId> configuration) {
        this.configuration = configuration;
    }

    public Broker withConfiguration(Property<BrokerConfigurationId> configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * BrokerMaintenanceWindow
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html
     * 
     */
    @JsonIgnore
    public Property<BrokerMaintenanceWindow> getMaintenanceWindowStartTime() {
        return maintenanceWindowStartTime;
    }

    /**
     * BrokerMaintenanceWindow
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html
     * 
     */
    @JsonIgnore
    public void setMaintenanceWindowStartTime(Property<BrokerMaintenanceWindow> maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
    }

    public Broker withMaintenanceWindowStartTime(Property<BrokerMaintenanceWindow> maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype
     * 
     */
    @JsonIgnore
    public CharSequence getHostInstanceType() {
        return hostInstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype
     * 
     */
    @JsonIgnore
    public void setHostInstanceType(CharSequence hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    public Broker withHostInstanceType(CharSequence hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade
     * 
     */
    @JsonIgnore
    public CharSequence getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade
     * 
     */
    @JsonIgnore
    public void setAutoMinorVersionUpgrade(CharSequence autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    public Broker withAutoMinorVersionUpgrade(CharSequence autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users
     * 
     */
    @JsonIgnore
    public List<Property<BrokerUser>> getUsers() {
        return users;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users
     * 
     */
    @JsonIgnore
    public void setUsers(List<Property<BrokerUser>> users) {
        this.users = users;
    }

    public Broker withUsers(List<Property<BrokerUser>> users) {
        this.users = users;
        return this;
    }

    /**
     * BrokerLogList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html
     * 
     */
    @JsonIgnore
    public Property<BrokerLogList> getLogs() {
        return logs;
    }

    /**
     * BrokerLogList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html
     * 
     */
    @JsonIgnore
    public void setLogs(Property<BrokerLogList> logs) {
        this.logs = logs;
    }

    public Broker withLogs(Property<BrokerLogList> logs) {
        this.logs = logs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids
     * 
     */
    @JsonIgnore
    public void setSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public Broker withSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername
     * 
     */
    @JsonIgnore
    public CharSequence getBrokerName() {
        return brokerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername
     * 
     */
    @JsonIgnore
    public void setBrokerName(CharSequence brokerName) {
        this.brokerName = brokerName;
    }

    public Broker withBrokerName(CharSequence brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentMode() {
        return deploymentMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode
     * 
     */
    @JsonIgnore
    public void setDeploymentMode(CharSequence deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    public Broker withDeploymentMode(CharSequence deploymentMode) {
        this.deploymentMode = deploymentMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype
     * 
     */
    @JsonIgnore
    public CharSequence getEngineType() {
        return engineType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype
     * 
     */
    @JsonIgnore
    public void setEngineType(CharSequence engineType) {
        this.engineType = engineType;
    }

    public Broker withEngineType(CharSequence engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible
     * 
     */
    @JsonIgnore
    public CharSequence getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible
     * 
     */
    @JsonIgnore
    public void setPubliclyAccessible(CharSequence publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    public Broker withPubliclyAccessible(CharSequence publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * BrokerEncryptionOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html
     * 
     */
    @JsonIgnore
    public Property<BrokerEncryptionOptions> getEncryptionOptions() {
        return encryptionOptions;
    }

    /**
     * BrokerEncryptionOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-encryptionoptions.html
     * 
     */
    @JsonIgnore
    public void setEncryptionOptions(Property<BrokerEncryptionOptions> encryptionOptions) {
        this.encryptionOptions = encryptionOptions;
    }

    public Broker withEncryptionOptions(Property<BrokerEncryptionOptions> encryptionOptions) {
        this.encryptionOptions = encryptionOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags
     * 
     */
    @JsonIgnore
    public List<Property<BrokerTagsEntry>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<BrokerTagsEntry>> tags) {
        this.tags = tags;
    }

    public Broker withTags(List<Property<BrokerTagsEntry>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("securityGroups", securityGroups).append("storageType", storageType).append("engineVersion", engineVersion).append("configuration", configuration).append("maintenanceWindowStartTime", maintenanceWindowStartTime).append("hostInstanceType", hostInstanceType).append("autoMinorVersionUpgrade", autoMinorVersionUpgrade).append("users", users).append("logs", logs).append("subnetIds", subnetIds).append("brokerName", brokerName).append("deploymentMode", deploymentMode).append("engineType", engineType).append("publiclyAccessible", publiclyAccessible).append("encryptionOptions", encryptionOptions).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(engineVersion).append(deploymentMode).append(maintenanceWindowStartTime).append(configuration).append(engineType).append(hostInstanceType).append(users).append(tags).append(publiclyAccessible).append(encryptionOptions).append(storageType).append(securityGroups).append(brokerName).append(logs).append(autoMinorVersionUpgrade).append(subnetIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Broker) == false) {
            return false;
        }
        Broker rhs = ((Broker) other);
        return new EqualsBuilder().append(engineVersion, rhs.engineVersion).append(deploymentMode, rhs.deploymentMode).append(maintenanceWindowStartTime, rhs.maintenanceWindowStartTime).append(configuration, rhs.configuration).append(engineType, rhs.engineType).append(hostInstanceType, rhs.hostInstanceType).append(users, rhs.users).append(tags, rhs.tags).append(publiclyAccessible, rhs.publiclyAccessible).append(encryptionOptions, rhs.encryptionOptions).append(storageType, rhs.storageType).append(securityGroups, rhs.securityGroups).append(brokerName, rhs.brokerName).append(logs, rhs.logs).append(autoMinorVersionUpgrade, rhs.autoMinorVersionUpgrade).append(subnetIds, rhs.subnetIds).isEquals();
    }

}
