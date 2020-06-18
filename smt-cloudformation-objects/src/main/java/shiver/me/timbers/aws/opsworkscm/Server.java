
package shiver.me.timbers.aws.opsworkscm;

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
import shiver.me.timbers.aws.Tag;


/**
 * Server
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KeyPair",
    "EngineVersion",
    "ServiceRoleArn",
    "DisableAutomatedBackup",
    "BackupId",
    "EngineModel",
    "PreferredMaintenanceWindow",
    "AssociatePublicIpAddress",
    "InstanceProfileArn",
    "CustomCertificate",
    "PreferredBackupWindow",
    "SecurityGroupIds",
    "SubnetIds",
    "CustomDomain",
    "CustomPrivateKey",
    "ServerName",
    "EngineAttributes",
    "BackupRetentionCount",
    "InstanceType",
    "Tags",
    "Engine"
})
public class Server {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-keypair
     * 
     */
    @JsonProperty("KeyPair")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-keypair")
    private CharSequence keyPair;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineversion")
    private CharSequence engineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servicerolearn")
    private CharSequence serviceRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup
     * 
     */
    @JsonProperty("DisableAutomatedBackup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup")
    private CharSequence disableAutomatedBackup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupid
     * 
     */
    @JsonProperty("BackupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupid")
    private CharSequence backupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-enginemodel
     * 
     */
    @JsonProperty("EngineModel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-enginemodel")
    private CharSequence engineModel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress
     * 
     */
    @JsonProperty("AssociatePublicIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress")
    private CharSequence associatePublicIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instanceprofilearn
     * 
     */
    @JsonProperty("InstanceProfileArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instanceprofilearn")
    private CharSequence instanceProfileArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customcertificate
     * 
     */
    @JsonProperty("CustomCertificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customcertificate")
    private CharSequence customCertificate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredbackupwindow
     * 
     */
    @JsonProperty("PreferredBackupWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredbackupwindow")
    private CharSequence preferredBackupWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-securitygroupids")
    private List<CharSequence> securityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-subnetids")
    private List<CharSequence> subnetIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customdomain
     * 
     */
    @JsonProperty("CustomDomain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customdomain")
    private CharSequence customDomain;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customprivatekey
     * 
     */
    @JsonProperty("CustomPrivateKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customprivatekey")
    private CharSequence customPrivateKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servername
     * 
     */
    @JsonProperty("ServerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servername")
    private CharSequence serverName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineattributes
     * 
     */
    @JsonProperty("EngineAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineattributes")
    private List<Property<ServerEngineAttribute>> engineAttributes = new ArrayList<Property<ServerEngineAttribute>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupretentioncount
     * 
     */
    @JsonProperty("BackupRetentionCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupretentioncount")
    private Number backupRetentionCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engine
     * 
     */
    @JsonProperty("Engine")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engine")
    private CharSequence engine;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-keypair
     * 
     */
    @JsonIgnore
    public CharSequence getKeyPair() {
        return keyPair;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-keypair
     * 
     */
    @JsonIgnore
    public void setKeyPair(CharSequence keyPair) {
        this.keyPair = keyPair;
    }

    public Server withKeyPair(CharSequence keyPair) {
        this.keyPair = keyPair;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineversion
     * 
     */
    @JsonIgnore
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineversion
     * 
     */
    @JsonIgnore
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public Server withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servicerolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servicerolearn
     * 
     */
    @JsonIgnore
    public void setServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public Server withServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup
     * 
     */
    @JsonIgnore
    public CharSequence getDisableAutomatedBackup() {
        return disableAutomatedBackup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-disableautomatedbackup
     * 
     */
    @JsonIgnore
    public void setDisableAutomatedBackup(CharSequence disableAutomatedBackup) {
        this.disableAutomatedBackup = disableAutomatedBackup;
    }

    public Server withDisableAutomatedBackup(CharSequence disableAutomatedBackup) {
        this.disableAutomatedBackup = disableAutomatedBackup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupid
     * 
     */
    @JsonIgnore
    public CharSequence getBackupId() {
        return backupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupid
     * 
     */
    @JsonIgnore
    public void setBackupId(CharSequence backupId) {
        this.backupId = backupId;
    }

    public Server withBackupId(CharSequence backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-enginemodel
     * 
     */
    @JsonIgnore
    public CharSequence getEngineModel() {
        return engineModel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-enginemodel
     * 
     */
    @JsonIgnore
    public void setEngineModel(CharSequence engineModel) {
        this.engineModel = engineModel;
    }

    public Server withEngineModel(CharSequence engineModel) {
        this.engineModel = engineModel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredmaintenancewindow
     * 
     */
    @JsonIgnore
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredmaintenancewindow
     * 
     */
    @JsonIgnore
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public Server withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress
     * 
     */
    @JsonIgnore
    public CharSequence getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-associatepublicipaddress
     * 
     */
    @JsonIgnore
    public void setAssociatePublicIpAddress(CharSequence associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    public Server withAssociatePublicIpAddress(CharSequence associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instanceprofilearn
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceProfileArn() {
        return instanceProfileArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instanceprofilearn
     * 
     */
    @JsonIgnore
    public void setInstanceProfileArn(CharSequence instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
    }

    public Server withInstanceProfileArn(CharSequence instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customcertificate
     * 
     */
    @JsonIgnore
    public CharSequence getCustomCertificate() {
        return customCertificate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customcertificate
     * 
     */
    @JsonIgnore
    public void setCustomCertificate(CharSequence customCertificate) {
        this.customCertificate = customCertificate;
    }

    public Server withCustomCertificate(CharSequence customCertificate) {
        this.customCertificate = customCertificate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredbackupwindow
     * 
     */
    @JsonIgnore
    public CharSequence getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-preferredbackupwindow
     * 
     */
    @JsonIgnore
    public void setPreferredBackupWindow(CharSequence preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    public Server withPreferredBackupWindow(CharSequence preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-securitygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-securitygroupids
     * 
     */
    @JsonIgnore
    public void setSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public Server withSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-subnetids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-subnetids
     * 
     */
    @JsonIgnore
    public void setSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public Server withSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customdomain
     * 
     */
    @JsonIgnore
    public CharSequence getCustomDomain() {
        return customDomain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customdomain
     * 
     */
    @JsonIgnore
    public void setCustomDomain(CharSequence customDomain) {
        this.customDomain = customDomain;
    }

    public Server withCustomDomain(CharSequence customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customprivatekey
     * 
     */
    @JsonIgnore
    public CharSequence getCustomPrivateKey() {
        return customPrivateKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-customprivatekey
     * 
     */
    @JsonIgnore
    public void setCustomPrivateKey(CharSequence customPrivateKey) {
        this.customPrivateKey = customPrivateKey;
    }

    public Server withCustomPrivateKey(CharSequence customPrivateKey) {
        this.customPrivateKey = customPrivateKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servername
     * 
     */
    @JsonIgnore
    public CharSequence getServerName() {
        return serverName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-servername
     * 
     */
    @JsonIgnore
    public void setServerName(CharSequence serverName) {
        this.serverName = serverName;
    }

    public Server withServerName(CharSequence serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineattributes
     * 
     */
    @JsonIgnore
    public List<Property<ServerEngineAttribute>> getEngineAttributes() {
        return engineAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engineattributes
     * 
     */
    @JsonIgnore
    public void setEngineAttributes(List<Property<ServerEngineAttribute>> engineAttributes) {
        this.engineAttributes = engineAttributes;
    }

    public Server withEngineAttributes(List<Property<ServerEngineAttribute>> engineAttributes) {
        this.engineAttributes = engineAttributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupretentioncount
     * 
     */
    @JsonIgnore
    public Number getBackupRetentionCount() {
        return backupRetentionCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-backupretentioncount
     * 
     */
    @JsonIgnore
    public void setBackupRetentionCount(Number backupRetentionCount) {
        this.backupRetentionCount = backupRetentionCount;
    }

    public Server withBackupRetentionCount(Number backupRetentionCount) {
        this.backupRetentionCount = backupRetentionCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public Server withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Server withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engine
     * 
     */
    @JsonIgnore
    public CharSequence getEngine() {
        return engine;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworkscm-server.html#cfn-opsworkscm-server-engine
     * 
     */
    @JsonIgnore
    public void setEngine(CharSequence engine) {
        this.engine = engine;
    }

    public Server withEngine(CharSequence engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("keyPair", keyPair).append("engineVersion", engineVersion).append("serviceRoleArn", serviceRoleArn).append("disableAutomatedBackup", disableAutomatedBackup).append("backupId", backupId).append("engineModel", engineModel).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("associatePublicIpAddress", associatePublicIpAddress).append("instanceProfileArn", instanceProfileArn).append("customCertificate", customCertificate).append("preferredBackupWindow", preferredBackupWindow).append("securityGroupIds", securityGroupIds).append("subnetIds", subnetIds).append("customDomain", customDomain).append("customPrivateKey", customPrivateKey).append("serverName", serverName).append("engineAttributes", engineAttributes).append("backupRetentionCount", backupRetentionCount).append("instanceType", instanceType).append("tags", tags).append("engine", engine).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(engineVersion).append(customCertificate).append(engineModel).append(engineAttributes).append(backupId).append(instanceType).append(serverName).append(instanceProfileArn).append(disableAutomatedBackup).append(preferredBackupWindow).append(customDomain).append(tags).append(engine).append(securityGroupIds).append(backupRetentionCount).append(preferredMaintenanceWindow).append(keyPair).append(associatePublicIpAddress).append(customPrivateKey).append(serviceRoleArn).append(subnetIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Server) == false) {
            return false;
        }
        Server rhs = ((Server) other);
        return new EqualsBuilder().append(engineVersion, rhs.engineVersion).append(customCertificate, rhs.customCertificate).append(engineModel, rhs.engineModel).append(engineAttributes, rhs.engineAttributes).append(backupId, rhs.backupId).append(instanceType, rhs.instanceType).append(serverName, rhs.serverName).append(instanceProfileArn, rhs.instanceProfileArn).append(disableAutomatedBackup, rhs.disableAutomatedBackup).append(preferredBackupWindow, rhs.preferredBackupWindow).append(customDomain, rhs.customDomain).append(tags, rhs.tags).append(engine, rhs.engine).append(securityGroupIds, rhs.securityGroupIds).append(backupRetentionCount, rhs.backupRetentionCount).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(keyPair, rhs.keyPair).append(associatePublicIpAddress, rhs.associatePublicIpAddress).append(customPrivateKey, rhs.customPrivateKey).append(serviceRoleArn, rhs.serviceRoleArn).append(subnetIds, rhs.subnetIds).isEquals();
    }

}
