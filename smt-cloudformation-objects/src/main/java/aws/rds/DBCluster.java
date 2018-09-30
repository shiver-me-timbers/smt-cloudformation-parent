
package aws.rds;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DBCluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AvailabilityZones",
    "BackupRetentionPeriod",
    "DBClusterIdentifier",
    "DBClusterParameterGroupName",
    "DBSubnetGroupName",
    "DatabaseName",
    "Engine",
    "EngineMode",
    "EngineVersion",
    "KmsKeyId",
    "MasterUserPassword",
    "MasterUsername",
    "Port",
    "PreferredBackupWindow",
    "PreferredMaintenanceWindow",
    "ReplicationSourceIdentifier",
    "ScalingConfiguration",
    "SnapshotIdentifier",
    "StorageEncrypted",
    "Tags",
    "VpcSecurityGroupIds"
})
public class DBCluster {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones
     * 
     */
    @JsonProperty("AvailabilityZones")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones")
    private Set<CharSequence> availabilityZones = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backuprententionperiod
     * 
     */
    @JsonProperty("BackupRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backuprententionperiod")
    private Integer backupRetentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier
     * 
     */
    @JsonProperty("DBClusterIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier")
    private CharSequence dBClusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname
     * 
     */
    @JsonProperty("DBClusterParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname")
    private CharSequence dBClusterParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname")
    private CharSequence dBSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename")
    private CharSequence databaseName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine
     * 
     */
    @JsonProperty("Engine")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine")
    private CharSequence engine;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode
     * 
     */
    @JsonProperty("EngineMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode")
    private CharSequence engineMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion")
    private CharSequence engineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid")
    private CharSequence kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword
     * 
     */
    @JsonProperty("MasterUserPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword")
    private CharSequence masterUserPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername")
    private CharSequence masterUsername;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow
     * 
     */
    @JsonProperty("PreferredBackupWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow")
    private CharSequence preferredBackupWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier
     * 
     */
    @JsonProperty("ReplicationSourceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier")
    private CharSequence replicationSourceIdentifier;
    /**
     * ScalingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html
     * 
     */
    @JsonProperty("ScalingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html")
    private ScalingConfiguration scalingConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier
     * 
     */
    @JsonProperty("SnapshotIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier")
    private CharSequence snapshotIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted
     * 
     */
    @JsonProperty("StorageEncrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted")
    private Boolean storageEncrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids")
    private Set<CharSequence> vpcSecurityGroupIds = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones
     * 
     */
    public Set<CharSequence> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-availabilityzones
     * 
     */
    public void setAvailabilityZones(Set<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public DBCluster withAvailabilityZones(Set<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backuprententionperiod
     * 
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-backuprententionperiod
     * 
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    public DBCluster withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier
     * 
     */
    public CharSequence getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusteridentifier
     * 
     */
    public void setDBClusterIdentifier(CharSequence dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    public DBCluster withDBClusterIdentifier(CharSequence dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname
     * 
     */
    public CharSequence getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbclusterparametergroupname
     * 
     */
    public void setDBClusterParameterGroupName(CharSequence dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    public DBCluster withDBClusterParameterGroupName(CharSequence dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname
     * 
     */
    public CharSequence getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-dbsubnetgroupname
     * 
     */
    public void setDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    public DBCluster withDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename
     * 
     */
    public CharSequence getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-databasename
     * 
     */
    public void setDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
    }

    public DBCluster withDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine
     * 
     */
    public CharSequence getEngine() {
        return engine;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engine
     * 
     */
    public void setEngine(CharSequence engine) {
        this.engine = engine;
    }

    public DBCluster withEngine(CharSequence engine) {
        this.engine = engine;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode
     * 
     */
    public CharSequence getEngineMode() {
        return engineMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-enginemode
     * 
     */
    public void setEngineMode(CharSequence engineMode) {
        this.engineMode = engineMode;
    }

    public DBCluster withEngineMode(CharSequence engineMode) {
        this.engineMode = engineMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion
     * 
     */
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-engineversion
     * 
     */
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public DBCluster withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid
     * 
     */
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-kmskeyid
     * 
     */
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public DBCluster withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword
     * 
     */
    public CharSequence getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masteruserpassword
     * 
     */
    public void setMasterUserPassword(CharSequence masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    public DBCluster withMasterUserPassword(CharSequence masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername
     * 
     */
    public CharSequence getMasterUsername() {
        return masterUsername;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-masterusername
     * 
     */
    public void setMasterUsername(CharSequence masterUsername) {
        this.masterUsername = masterUsername;
    }

    public DBCluster withMasterUsername(CharSequence masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-port
     * 
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public DBCluster withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow
     * 
     */
    public CharSequence getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredbackupwindow
     * 
     */
    public void setPreferredBackupWindow(CharSequence preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    public DBCluster withPreferredBackupWindow(CharSequence preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow
     * 
     */
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-preferredmaintenancewindow
     * 
     */
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public DBCluster withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier
     * 
     */
    public CharSequence getReplicationSourceIdentifier() {
        return replicationSourceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-replicationsourceidentifier
     * 
     */
    public void setReplicationSourceIdentifier(CharSequence replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    public DBCluster withReplicationSourceIdentifier(CharSequence replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
        return this;
    }

    /**
     * ScalingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html
     * 
     */
    public ScalingConfiguration getScalingConfiguration() {
        return scalingConfiguration;
    }

    /**
     * ScalingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html
     * 
     */
    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    public DBCluster withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier
     * 
     */
    public CharSequence getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-snapshotidentifier
     * 
     */
    public void setSnapshotIdentifier(CharSequence snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    public DBCluster withSnapshotIdentifier(CharSequence snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted
     * 
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-storageencrypted
     * 
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    public DBCluster withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DBCluster withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids
     * 
     */
    public Set<CharSequence> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbcluster.html#cfn-rds-dbcluster-vpcsecuritygroupids
     * 
     */
    public void setVpcSecurityGroupIds(Set<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public DBCluster withVpcSecurityGroupIds(Set<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("availabilityZones", availabilityZones).append("backupRetentionPeriod", backupRetentionPeriod).append("dBClusterIdentifier", dBClusterIdentifier).append("dBClusterParameterGroupName", dBClusterParameterGroupName).append("dBSubnetGroupName", dBSubnetGroupName).append("databaseName", databaseName).append("engine", engine).append("engineMode", engineMode).append("engineVersion", engineVersion).append("kmsKeyId", kmsKeyId).append("masterUserPassword", masterUserPassword).append("masterUsername", masterUsername).append("port", port).append("preferredBackupWindow", preferredBackupWindow).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("replicationSourceIdentifier", replicationSourceIdentifier).append("scalingConfiguration", scalingConfiguration).append("snapshotIdentifier", snapshotIdentifier).append("storageEncrypted", storageEncrypted).append("tags", tags).append("vpcSecurityGroupIds", vpcSecurityGroupIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(engineVersion).append(masterUsername).append(vpcSecurityGroupIds).append(databaseName).append(availabilityZones).append(snapshotIdentifier).append(storageEncrypted).append(preferredBackupWindow).append(dBSubnetGroupName).append(tags).append(dBClusterParameterGroupName).append(engineMode).append(engine).append(port).append(replicationSourceIdentifier).append(preferredMaintenanceWindow).append(backupRetentionPeriod).append(kmsKeyId).append(dBClusterIdentifier).append(masterUserPassword).append(scalingConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBCluster) == false) {
            return false;
        }
        DBCluster rhs = ((DBCluster) other);
        return new EqualsBuilder().append(engineVersion, rhs.engineVersion).append(masterUsername, rhs.masterUsername).append(vpcSecurityGroupIds, rhs.vpcSecurityGroupIds).append(databaseName, rhs.databaseName).append(availabilityZones, rhs.availabilityZones).append(snapshotIdentifier, rhs.snapshotIdentifier).append(storageEncrypted, rhs.storageEncrypted).append(preferredBackupWindow, rhs.preferredBackupWindow).append(dBSubnetGroupName, rhs.dBSubnetGroupName).append(tags, rhs.tags).append(dBClusterParameterGroupName, rhs.dBClusterParameterGroupName).append(engineMode, rhs.engineMode).append(engine, rhs.engine).append(port, rhs.port).append(replicationSourceIdentifier, rhs.replicationSourceIdentifier).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(backupRetentionPeriod, rhs.backupRetentionPeriod).append(kmsKeyId, rhs.kmsKeyId).append(dBClusterIdentifier, rhs.dBClusterIdentifier).append(masterUserPassword, rhs.masterUserPassword).append(scalingConfiguration, rhs.scalingConfiguration).isEquals();
    }

}
