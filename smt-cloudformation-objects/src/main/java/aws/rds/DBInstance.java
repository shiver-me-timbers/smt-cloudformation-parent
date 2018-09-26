
package aws.rds;

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
 * DBInstance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllocatedStorage",
    "AllowMajorVersionUpgrade",
    "AutoMinorVersionUpgrade",
    "AvailabilityZone",
    "BackupRetentionPeriod",
    "CharacterSetName",
    "CopyTagsToSnapshot",
    "DBClusterIdentifier",
    "DBInstanceClass",
    "DBInstanceIdentifier",
    "DBName",
    "DBParameterGroupName",
    "DBSecurityGroups",
    "DBSnapshotIdentifier",
    "DBSubnetGroupName",
    "Domain",
    "DomainIAMRoleName",
    "Engine",
    "EngineVersion",
    "Iops",
    "KmsKeyId",
    "LicenseModel",
    "MasterUserPassword",
    "MasterUsername",
    "MonitoringInterval",
    "MonitoringRoleArn",
    "MultiAZ",
    "OptionGroupName",
    "Port",
    "PreferredBackupWindow",
    "PreferredMaintenanceWindow",
    "PubliclyAccessible",
    "SourceDBInstanceIdentifier",
    "SourceRegion",
    "StorageEncrypted",
    "StorageType",
    "Tags",
    "Timezone",
    "VPCSecurityGroups"
})
public class DBInstance {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage
     * 
     */
    @JsonProperty("AllocatedStorage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage")
    private CharSequence allocatedStorage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade
     * 
     */
    @JsonProperty("AllowMajorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade")
    private Boolean allowMajorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade")
    private Boolean autoMinorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod
     * 
     */
    @JsonProperty("BackupRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod")
    private CharSequence backupRetentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname
     * 
     */
    @JsonProperty("CharacterSetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname")
    private CharSequence characterSetName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot
     * 
     */
    @JsonProperty("CopyTagsToSnapshot")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot")
    private Boolean copyTagsToSnapshot;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier
     * 
     */
    @JsonProperty("DBClusterIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier")
    private CharSequence dBClusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass
     * 
     */
    @JsonProperty("DBInstanceClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass")
    private CharSequence dBInstanceClass;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier
     * 
     */
    @JsonProperty("DBInstanceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier")
    private CharSequence dBInstanceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname
     * 
     */
    @JsonProperty("DBName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname")
    private CharSequence dBName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname
     * 
     */
    @JsonProperty("DBParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname")
    private CharSequence dBParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups
     * 
     */
    @JsonProperty("DBSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups")
    private List<CharSequence> dBSecurityGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier
     * 
     */
    @JsonProperty("DBSnapshotIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier")
    private CharSequence dBSnapshotIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname")
    private CharSequence dBSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain
     * 
     */
    @JsonProperty("Domain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain")
    private CharSequence domain;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename
     * 
     */
    @JsonProperty("DomainIAMRoleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename")
    private CharSequence domainIAMRoleName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine
     * 
     */
    @JsonProperty("Engine")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine")
    private CharSequence engine;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion")
    private CharSequence engineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops
     * 
     */
    @JsonProperty("Iops")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops")
    private Integer iops;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid")
    private CharSequence kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel
     * 
     */
    @JsonProperty("LicenseModel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel")
    private CharSequence licenseModel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword
     * 
     */
    @JsonProperty("MasterUserPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword")
    private CharSequence masterUserPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername")
    private CharSequence masterUsername;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval
     * 
     */
    @JsonProperty("MonitoringInterval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval")
    private Integer monitoringInterval;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn
     * 
     */
    @JsonProperty("MonitoringRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn")
    private CharSequence monitoringRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz
     * 
     */
    @JsonProperty("MultiAZ")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz")
    private Boolean multiAZ;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname
     * 
     */
    @JsonProperty("OptionGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname")
    private CharSequence optionGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port")
    private CharSequence port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow
     * 
     */
    @JsonProperty("PreferredBackupWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow")
    private CharSequence preferredBackupWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible")
    private Boolean publiclyAccessible;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier
     * 
     */
    @JsonProperty("SourceDBInstanceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier")
    private CharSequence sourceDBInstanceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion
     * 
     */
    @JsonProperty("SourceRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion")
    private CharSequence sourceRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted
     * 
     */
    @JsonProperty("StorageEncrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted")
    private Boolean storageEncrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype
     * 
     */
    @JsonProperty("StorageType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype")
    private CharSequence storageType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone
     * 
     */
    @JsonProperty("Timezone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone")
    private CharSequence timezone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups
     * 
     */
    @JsonProperty("VPCSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups")
    private List<CharSequence> vPCSecurityGroups = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage
     * 
     */
    public CharSequence getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage
     * 
     */
    public void setAllocatedStorage(CharSequence allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    public DBInstance withAllocatedStorage(CharSequence allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade
     * 
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade
     * 
     */
    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    public DBInstance withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade
     * 
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade
     * 
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    public DBInstance withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone
     * 
     */
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone
     * 
     */
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public DBInstance withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod
     * 
     */
    public CharSequence getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod
     * 
     */
    public void setBackupRetentionPeriod(CharSequence backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    public DBInstance withBackupRetentionPeriod(CharSequence backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname
     * 
     */
    public CharSequence getCharacterSetName() {
        return characterSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname
     * 
     */
    public void setCharacterSetName(CharSequence characterSetName) {
        this.characterSetName = characterSetName;
    }

    public DBInstance withCharacterSetName(CharSequence characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot
     * 
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot
     * 
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    public DBInstance withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier
     * 
     */
    public CharSequence getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier
     * 
     */
    public void setDBClusterIdentifier(CharSequence dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    public DBInstance withDBClusterIdentifier(CharSequence dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass
     * 
     */
    public CharSequence getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass
     * 
     */
    public void setDBInstanceClass(CharSequence dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    public DBInstance withDBInstanceClass(CharSequence dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier
     * 
     */
    public CharSequence getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier
     * 
     */
    public void setDBInstanceIdentifier(CharSequence dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    public DBInstance withDBInstanceIdentifier(CharSequence dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname
     * 
     */
    public CharSequence getDBName() {
        return dBName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname
     * 
     */
    public void setDBName(CharSequence dBName) {
        this.dBName = dBName;
    }

    public DBInstance withDBName(CharSequence dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname
     * 
     */
    public CharSequence getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname
     * 
     */
    public void setDBParameterGroupName(CharSequence dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    public DBInstance withDBParameterGroupName(CharSequence dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups
     * 
     */
    public List<CharSequence> getDBSecurityGroups() {
        return dBSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups
     * 
     */
    public void setDBSecurityGroups(List<CharSequence> dBSecurityGroups) {
        this.dBSecurityGroups = dBSecurityGroups;
    }

    public DBInstance withDBSecurityGroups(List<CharSequence> dBSecurityGroups) {
        this.dBSecurityGroups = dBSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier
     * 
     */
    public CharSequence getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier
     * 
     */
    public void setDBSnapshotIdentifier(CharSequence dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    public DBInstance withDBSnapshotIdentifier(CharSequence dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname
     * 
     */
    public CharSequence getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname
     * 
     */
    public void setDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    public DBInstance withDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain
     * 
     */
    public CharSequence getDomain() {
        return domain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain
     * 
     */
    public void setDomain(CharSequence domain) {
        this.domain = domain;
    }

    public DBInstance withDomain(CharSequence domain) {
        this.domain = domain;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename
     * 
     */
    public CharSequence getDomainIAMRoleName() {
        return domainIAMRoleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename
     * 
     */
    public void setDomainIAMRoleName(CharSequence domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    public DBInstance withDomainIAMRoleName(CharSequence domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine
     * 
     */
    public CharSequence getEngine() {
        return engine;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine
     * 
     */
    public void setEngine(CharSequence engine) {
        this.engine = engine;
    }

    public DBInstance withEngine(CharSequence engine) {
        this.engine = engine;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion
     * 
     */
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion
     * 
     */
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public DBInstance withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops
     * 
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops
     * 
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public DBInstance withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid
     * 
     */
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid
     * 
     */
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public DBInstance withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel
     * 
     */
    public CharSequence getLicenseModel() {
        return licenseModel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel
     * 
     */
    public void setLicenseModel(CharSequence licenseModel) {
        this.licenseModel = licenseModel;
    }

    public DBInstance withLicenseModel(CharSequence licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword
     * 
     */
    public CharSequence getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword
     * 
     */
    public void setMasterUserPassword(CharSequence masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    public DBInstance withMasterUserPassword(CharSequence masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername
     * 
     */
    public CharSequence getMasterUsername() {
        return masterUsername;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername
     * 
     */
    public void setMasterUsername(CharSequence masterUsername) {
        this.masterUsername = masterUsername;
    }

    public DBInstance withMasterUsername(CharSequence masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval
     * 
     */
    public Integer getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval
     * 
     */
    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    public DBInstance withMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn
     * 
     */
    public CharSequence getMonitoringRoleArn() {
        return monitoringRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn
     * 
     */
    public void setMonitoringRoleArn(CharSequence monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    public DBInstance withMonitoringRoleArn(CharSequence monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz
     * 
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz
     * 
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    public DBInstance withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname
     * 
     */
    public CharSequence getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname
     * 
     */
    public void setOptionGroupName(CharSequence optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    public DBInstance withOptionGroupName(CharSequence optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port
     * 
     */
    public CharSequence getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port
     * 
     */
    public void setPort(CharSequence port) {
        this.port = port;
    }

    public DBInstance withPort(CharSequence port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow
     * 
     */
    public CharSequence getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow
     * 
     */
    public void setPreferredBackupWindow(CharSequence preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    public DBInstance withPreferredBackupWindow(CharSequence preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow
     * 
     */
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow
     * 
     */
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public DBInstance withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible
     * 
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible
     * 
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    public DBInstance withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier
     * 
     */
    public CharSequence getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier
     * 
     */
    public void setSourceDBInstanceIdentifier(CharSequence sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }

    public DBInstance withSourceDBInstanceIdentifier(CharSequence sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion
     * 
     */
    public CharSequence getSourceRegion() {
        return sourceRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion
     * 
     */
    public void setSourceRegion(CharSequence sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public DBInstance withSourceRegion(CharSequence sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted
     * 
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted
     * 
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    public DBInstance withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype
     * 
     */
    public CharSequence getStorageType() {
        return storageType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype
     * 
     */
    public void setStorageType(CharSequence storageType) {
        this.storageType = storageType;
    }

    public DBInstance withStorageType(CharSequence storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DBInstance withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone
     * 
     */
    public CharSequence getTimezone() {
        return timezone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone
     * 
     */
    public void setTimezone(CharSequence timezone) {
        this.timezone = timezone;
    }

    public DBInstance withTimezone(CharSequence timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups
     * 
     */
    public List<CharSequence> getVPCSecurityGroups() {
        return vPCSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups
     * 
     */
    public void setVPCSecurityGroups(List<CharSequence> vPCSecurityGroups) {
        this.vPCSecurityGroups = vPCSecurityGroups;
    }

    public DBInstance withVPCSecurityGroups(List<CharSequence> vPCSecurityGroups) {
        this.vPCSecurityGroups = vPCSecurityGroups;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allocatedStorage", allocatedStorage).append("allowMajorVersionUpgrade", allowMajorVersionUpgrade).append("autoMinorVersionUpgrade", autoMinorVersionUpgrade).append("availabilityZone", availabilityZone).append("backupRetentionPeriod", backupRetentionPeriod).append("characterSetName", characterSetName).append("copyTagsToSnapshot", copyTagsToSnapshot).append("dBClusterIdentifier", dBClusterIdentifier).append("dBInstanceClass", dBInstanceClass).append("dBInstanceIdentifier", dBInstanceIdentifier).append("dBName", dBName).append("dBParameterGroupName", dBParameterGroupName).append("dBSecurityGroups", dBSecurityGroups).append("dBSnapshotIdentifier", dBSnapshotIdentifier).append("dBSubnetGroupName", dBSubnetGroupName).append("domain", domain).append("domainIAMRoleName", domainIAMRoleName).append("engine", engine).append("engineVersion", engineVersion).append("iops", iops).append("kmsKeyId", kmsKeyId).append("licenseModel", licenseModel).append("masterUserPassword", masterUserPassword).append("masterUsername", masterUsername).append("monitoringInterval", monitoringInterval).append("monitoringRoleArn", monitoringRoleArn).append("multiAZ", multiAZ).append("optionGroupName", optionGroupName).append("port", port).append("preferredBackupWindow", preferredBackupWindow).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("publiclyAccessible", publiclyAccessible).append("sourceDBInstanceIdentifier", sourceDBInstanceIdentifier).append("sourceRegion", sourceRegion).append("storageEncrypted", storageEncrypted).append("storageType", storageType).append("tags", tags).append("timezone", timezone).append("vPCSecurityGroups", vPCSecurityGroups).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allocatedStorage).append(timezone).append(availabilityZone).append(preferredBackupWindow).append(dBSubnetGroupName).append(dBInstanceIdentifier).append(dBSecurityGroups).append(engine).append(sourceDBInstanceIdentifier).append(iops).append(publiclyAccessible).append(vPCSecurityGroups).append(dBSnapshotIdentifier).append(optionGroupName).append(masterUserPassword).append(engineVersion).append(allowMajorVersionUpgrade).append(masterUsername).append(dBName).append(multiAZ).append(characterSetName).append(monitoringRoleArn).append(dBInstanceClass).append(storageEncrypted).append(tags).append(port).append(dBParameterGroupName).append(licenseModel).append(domain).append(monitoringInterval).append(preferredMaintenanceWindow).append(sourceRegion).append(backupRetentionPeriod).append(storageType).append(domainIAMRoleName).append(kmsKeyId).append(dBClusterIdentifier).append(autoMinorVersionUpgrade).append(copyTagsToSnapshot).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBInstance) == false) {
            return false;
        }
        DBInstance rhs = ((DBInstance) other);
        return new EqualsBuilder().append(allocatedStorage, rhs.allocatedStorage).append(timezone, rhs.timezone).append(availabilityZone, rhs.availabilityZone).append(preferredBackupWindow, rhs.preferredBackupWindow).append(dBSubnetGroupName, rhs.dBSubnetGroupName).append(dBInstanceIdentifier, rhs.dBInstanceIdentifier).append(dBSecurityGroups, rhs.dBSecurityGroups).append(engine, rhs.engine).append(sourceDBInstanceIdentifier, rhs.sourceDBInstanceIdentifier).append(iops, rhs.iops).append(publiclyAccessible, rhs.publiclyAccessible).append(vPCSecurityGroups, rhs.vPCSecurityGroups).append(dBSnapshotIdentifier, rhs.dBSnapshotIdentifier).append(optionGroupName, rhs.optionGroupName).append(masterUserPassword, rhs.masterUserPassword).append(engineVersion, rhs.engineVersion).append(allowMajorVersionUpgrade, rhs.allowMajorVersionUpgrade).append(masterUsername, rhs.masterUsername).append(dBName, rhs.dBName).append(multiAZ, rhs.multiAZ).append(characterSetName, rhs.characterSetName).append(monitoringRoleArn, rhs.monitoringRoleArn).append(dBInstanceClass, rhs.dBInstanceClass).append(storageEncrypted, rhs.storageEncrypted).append(tags, rhs.tags).append(port, rhs.port).append(dBParameterGroupName, rhs.dBParameterGroupName).append(licenseModel, rhs.licenseModel).append(domain, rhs.domain).append(monitoringInterval, rhs.monitoringInterval).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(sourceRegion, rhs.sourceRegion).append(backupRetentionPeriod, rhs.backupRetentionPeriod).append(storageType, rhs.storageType).append(domainIAMRoleName, rhs.domainIAMRoleName).append(kmsKeyId, rhs.kmsKeyId).append(dBClusterIdentifier, rhs.dBClusterIdentifier).append(autoMinorVersionUpgrade, rhs.autoMinorVersionUpgrade).append(copyTagsToSnapshot, rhs.copyTagsToSnapshot).isEquals();
    }

}
