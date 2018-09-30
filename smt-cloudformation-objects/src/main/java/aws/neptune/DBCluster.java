
package aws.neptune;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DBCluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "StorageEncrypted",
    "KmsKeyId",
    "AvailabilityZones",
    "SnapshotIdentifier",
    "Port",
    "DBClusterIdentifier",
    "PreferredMaintenanceWindow",
    "IamAuthEnabled",
    "DBSubnetGroupName",
    "PreferredBackupWindow",
    "VpcSecurityGroupIds",
    "DBClusterParameterGroupName",
    "BackupRetentionPeriod",
    "Tags"
})
public class DBCluster {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted
     * 
     */
    @JsonProperty("StorageEncrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted")
    private Boolean storageEncrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid")
    private CharSequence kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones
     * 
     */
    @JsonProperty("AvailabilityZones")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones")
    private List<CharSequence> availabilityZones = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier
     * 
     */
    @JsonProperty("SnapshotIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier")
    private CharSequence snapshotIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier
     * 
     */
    @JsonProperty("DBClusterIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier")
    private CharSequence dBClusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled
     * 
     */
    @JsonProperty("IamAuthEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled")
    private Boolean iamAuthEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname")
    private CharSequence dBSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow
     * 
     */
    @JsonProperty("PreferredBackupWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow")
    private CharSequence preferredBackupWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids")
    private List<CharSequence> vpcSecurityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname
     * 
     */
    @JsonProperty("DBClusterParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname")
    private CharSequence dBClusterParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-backupretentionperiod
     * 
     */
    @JsonProperty("BackupRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-backupretentionperiod")
    private Integer backupRetentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted
     * 
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-storageencrypted
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid
     * 
     */
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-kmskeyid
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones
     * 
     */
    public List<CharSequence> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-availabilityzones
     * 
     */
    public void setAvailabilityZones(List<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public DBCluster withAvailabilityZones(List<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier
     * 
     */
    public CharSequence getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-snapshotidentifier
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-port
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier
     * 
     */
    public CharSequence getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusteridentifier
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow
     * 
     */
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredmaintenancewindow
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled
     * 
     */
    public Boolean getIamAuthEnabled() {
        return iamAuthEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-iamauthenabled
     * 
     */
    public void setIamAuthEnabled(Boolean iamAuthEnabled) {
        this.iamAuthEnabled = iamAuthEnabled;
    }

    public DBCluster withIamAuthEnabled(Boolean iamAuthEnabled) {
        this.iamAuthEnabled = iamAuthEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname
     * 
     */
    public CharSequence getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbsubnetgroupname
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow
     * 
     */
    public CharSequence getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-preferredbackupwindow
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids
     * 
     */
    public List<CharSequence> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-vpcsecuritygroupids
     * 
     */
    public void setVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public DBCluster withVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname
     * 
     */
    public CharSequence getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-dbclusterparametergroupname
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-backupretentionperiod
     * 
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-backupretentionperiod
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbcluster.html#cfn-neptune-dbcluster-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DBCluster withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("storageEncrypted", storageEncrypted).append("kmsKeyId", kmsKeyId).append("availabilityZones", availabilityZones).append("snapshotIdentifier", snapshotIdentifier).append("port", port).append("dBClusterIdentifier", dBClusterIdentifier).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("iamAuthEnabled", iamAuthEnabled).append("dBSubnetGroupName", dBSubnetGroupName).append("preferredBackupWindow", preferredBackupWindow).append("vpcSecurityGroupIds", vpcSecurityGroupIds).append("dBClusterParameterGroupName", dBClusterParameterGroupName).append("backupRetentionPeriod", backupRetentionPeriod).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vpcSecurityGroupIds).append(iamAuthEnabled).append(availabilityZones).append(snapshotIdentifier).append(storageEncrypted).append(preferredBackupWindow).append(dBSubnetGroupName).append(tags).append(dBClusterParameterGroupName).append(port).append(preferredMaintenanceWindow).append(backupRetentionPeriod).append(kmsKeyId).append(dBClusterIdentifier).toHashCode();
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
        return new EqualsBuilder().append(vpcSecurityGroupIds, rhs.vpcSecurityGroupIds).append(iamAuthEnabled, rhs.iamAuthEnabled).append(availabilityZones, rhs.availabilityZones).append(snapshotIdentifier, rhs.snapshotIdentifier).append(storageEncrypted, rhs.storageEncrypted).append(preferredBackupWindow, rhs.preferredBackupWindow).append(dBSubnetGroupName, rhs.dBSubnetGroupName).append(tags, rhs.tags).append(dBClusterParameterGroupName, rhs.dBClusterParameterGroupName).append(port, rhs.port).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(backupRetentionPeriod, rhs.backupRetentionPeriod).append(kmsKeyId, rhs.kmsKeyId).append(dBClusterIdentifier, rhs.dBClusterIdentifier).isEquals();
    }

}
