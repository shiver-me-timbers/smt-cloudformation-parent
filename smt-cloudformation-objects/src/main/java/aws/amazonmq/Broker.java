
package aws.amazonmq;

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
 * Broker
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SecurityGroups",
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
    "PubliclyAccessible"
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion")
    private CharSequence engineVersion;
    /**
     * ConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    @JsonProperty("Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html")
    private ConfigurationId configuration;
    /**
     * MaintenanceWindow
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html
     * 
     */
    @JsonProperty("MaintenanceWindowStartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html")
    private MaintenanceWindow maintenanceWindowStartTime;
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
    private Boolean autoMinorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users
     * 
     */
    @JsonProperty("Users")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users")
    private List<User> users = new ArrayList<User>();
    /**
     * LogList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html
     * 
     */
    @JsonProperty("Logs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html")
    private LogList logs;
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
    private Boolean publiclyAccessible;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups
     * 
     */
    public List<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-securitygroups
     * 
     */
    public void setSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public Broker withSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion
     * 
     */
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-engineversion
     * 
     */
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public Broker withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * ConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    public ConfigurationId getConfiguration() {
        return configuration;
    }

    /**
     * ConfigurationId
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-configurationid.html
     * 
     */
    public void setConfiguration(ConfigurationId configuration) {
        this.configuration = configuration;
    }

    public Broker withConfiguration(ConfigurationId configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * MaintenanceWindow
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html
     * 
     */
    public MaintenanceWindow getMaintenanceWindowStartTime() {
        return maintenanceWindowStartTime;
    }

    /**
     * MaintenanceWindow
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-maintenancewindow.html
     * 
     */
    public void setMaintenanceWindowStartTime(MaintenanceWindow maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
    }

    public Broker withMaintenanceWindowStartTime(MaintenanceWindow maintenanceWindowStartTime) {
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype
     * 
     */
    public CharSequence getHostInstanceType() {
        return hostInstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-hostinstancetype
     * 
     */
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
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-autominorversionupgrade
     * 
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    public Broker withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users
     * 
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-users
     * 
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Broker withUsers(List<User> users) {
        this.users = users;
        return this;
    }

    /**
     * LogList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html
     * 
     */
    public LogList getLogs() {
        return logs;
    }

    /**
     * LogList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-broker-loglist.html
     * 
     */
    public void setLogs(LogList logs) {
        this.logs = logs;
    }

    public Broker withLogs(LogList logs) {
        this.logs = logs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids
     * 
     */
    public List<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-subnetids
     * 
     */
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
    public CharSequence getBrokerName() {
        return brokerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-brokername
     * 
     */
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
    public CharSequence getDeploymentMode() {
        return deploymentMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-deploymentmode
     * 
     */
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
    public CharSequence getEngineType() {
        return engineType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-enginetype
     * 
     */
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
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-broker.html#cfn-amazonmq-broker-publiclyaccessible
     * 
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    public Broker withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("securityGroups", securityGroups).append("engineVersion", engineVersion).append("configuration", configuration).append("maintenanceWindowStartTime", maintenanceWindowStartTime).append("hostInstanceType", hostInstanceType).append("autoMinorVersionUpgrade", autoMinorVersionUpgrade).append("users", users).append("logs", logs).append("subnetIds", subnetIds).append("brokerName", brokerName).append("deploymentMode", deploymentMode).append("engineType", engineType).append("publiclyAccessible", publiclyAccessible).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(engineVersion).append(deploymentMode).append(maintenanceWindowStartTime).append(configuration).append(engineType).append(hostInstanceType).append(users).append(publiclyAccessible).append(securityGroups).append(brokerName).append(logs).append(autoMinorVersionUpgrade).append(subnetIds).toHashCode();
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
        return new EqualsBuilder().append(engineVersion, rhs.engineVersion).append(deploymentMode, rhs.deploymentMode).append(maintenanceWindowStartTime, rhs.maintenanceWindowStartTime).append(configuration, rhs.configuration).append(engineType, rhs.engineType).append(hostInstanceType, rhs.hostInstanceType).append(users, rhs.users).append(publiclyAccessible, rhs.publiclyAccessible).append(securityGroups, rhs.securityGroups).append(brokerName, rhs.brokerName).append(logs, rhs.logs).append(autoMinorVersionUpgrade, rhs.autoMinorVersionUpgrade).append(subnetIds, rhs.subnetIds).isEquals();
    }

}
