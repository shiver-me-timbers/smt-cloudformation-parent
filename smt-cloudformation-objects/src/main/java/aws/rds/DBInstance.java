
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
    private String allocatedStorage;
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
    private String availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod
     * 
     */
    @JsonProperty("BackupRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod")
    private String backupRetentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname
     * 
     */
    @JsonProperty("CharacterSetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname")
    private String characterSetName;
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
    private String dBClusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass
     * 
     */
    @JsonProperty("DBInstanceClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass")
    private String dBInstanceClass;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier
     * 
     */
    @JsonProperty("DBInstanceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier")
    private String dBInstanceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname
     * 
     */
    @JsonProperty("DBName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname")
    private String dBName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname
     * 
     */
    @JsonProperty("DBParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname")
    private String dBParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups
     * 
     */
    @JsonProperty("DBSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups")
    private List<String> dBSecurityGroups = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier
     * 
     */
    @JsonProperty("DBSnapshotIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier")
    private String dBSnapshotIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname")
    private String dBSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain
     * 
     */
    @JsonProperty("Domain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain")
    private String domain;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename
     * 
     */
    @JsonProperty("DomainIAMRoleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename")
    private String domainIAMRoleName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine
     * 
     */
    @JsonProperty("Engine")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine")
    private String engine;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion")
    private String engineVersion;
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
    private String kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel
     * 
     */
    @JsonProperty("LicenseModel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel")
    private String licenseModel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword
     * 
     */
    @JsonProperty("MasterUserPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword")
    private String masterUserPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername")
    private String masterUsername;
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
    private String monitoringRoleArn;
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
    private String optionGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port")
    private String port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow
     * 
     */
    @JsonProperty("PreferredBackupWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow")
    private String preferredBackupWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow")
    private String preferredMaintenanceWindow;
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
    private String sourceDBInstanceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion
     * 
     */
    @JsonProperty("SourceRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion")
    private String sourceRegion;
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
    private String storageType;
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
    private String timezone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups
     * 
     */
    @JsonProperty("VPCSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups")
    private List<String> vPCSecurityGroups = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage
     * 
     */
    @JsonProperty("AllocatedStorage")
    public String getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage
     * 
     */
    @JsonProperty("AllocatedStorage")
    public void setAllocatedStorage(String allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    public DBInstance withAllocatedStorage(String allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade
     * 
     */
    @JsonProperty("AllowMajorVersionUpgrade")
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade
     * 
     */
    @JsonProperty("AllowMajorVersionUpgrade")
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
    @JsonProperty("AutoMinorVersionUpgrade")
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
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
    @JsonProperty("AvailabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public DBInstance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod
     * 
     */
    @JsonProperty("BackupRetentionPeriod")
    public String getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod
     * 
     */
    @JsonProperty("BackupRetentionPeriod")
    public void setBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    public DBInstance withBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname
     * 
     */
    @JsonProperty("CharacterSetName")
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname
     * 
     */
    @JsonProperty("CharacterSetName")
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public DBInstance withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot
     * 
     */
    @JsonProperty("CopyTagsToSnapshot")
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot
     * 
     */
    @JsonProperty("CopyTagsToSnapshot")
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
    @JsonProperty("DBClusterIdentifier")
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier
     * 
     */
    @JsonProperty("DBClusterIdentifier")
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    public DBInstance withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass
     * 
     */
    @JsonProperty("DBInstanceClass")
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass
     * 
     */
    @JsonProperty("DBInstanceClass")
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    public DBInstance withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier
     * 
     */
    @JsonProperty("DBInstanceIdentifier")
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier
     * 
     */
    @JsonProperty("DBInstanceIdentifier")
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    public DBInstance withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname
     * 
     */
    @JsonProperty("DBName")
    public String getDBName() {
        return dBName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname
     * 
     */
    @JsonProperty("DBName")
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    public DBInstance withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname
     * 
     */
    @JsonProperty("DBParameterGroupName")
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname
     * 
     */
    @JsonProperty("DBParameterGroupName")
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    public DBInstance withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups
     * 
     */
    @JsonProperty("DBSecurityGroups")
    public List<String> getDBSecurityGroups() {
        return dBSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups
     * 
     */
    @JsonProperty("DBSecurityGroups")
    public void setDBSecurityGroups(List<String> dBSecurityGroups) {
        this.dBSecurityGroups = dBSecurityGroups;
    }

    public DBInstance withDBSecurityGroups(List<String> dBSecurityGroups) {
        this.dBSecurityGroups = dBSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier
     * 
     */
    @JsonProperty("DBSnapshotIdentifier")
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier
     * 
     */
    @JsonProperty("DBSnapshotIdentifier")
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    public DBInstance withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    public DBInstance withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain
     * 
     */
    @JsonProperty("Domain")
    public String getDomain() {
        return domain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain
     * 
     */
    @JsonProperty("Domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DBInstance withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename
     * 
     */
    @JsonProperty("DomainIAMRoleName")
    public String getDomainIAMRoleName() {
        return domainIAMRoleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename
     * 
     */
    @JsonProperty("DomainIAMRoleName")
    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    public DBInstance withDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine
     * 
     */
    @JsonProperty("Engine")
    public String getEngine() {
        return engine;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine
     * 
     */
    @JsonProperty("Engine")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public DBInstance withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public DBInstance withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops
     * 
     */
    @JsonProperty("Iops")
    public Integer getIops() {
        return iops;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops
     * 
     */
    @JsonProperty("Iops")
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
    @JsonProperty("KmsKeyId")
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public DBInstance withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel
     * 
     */
    @JsonProperty("LicenseModel")
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel
     * 
     */
    @JsonProperty("LicenseModel")
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    public DBInstance withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword
     * 
     */
    @JsonProperty("MasterUserPassword")
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword
     * 
     */
    @JsonProperty("MasterUserPassword")
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    public DBInstance withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    public DBInstance withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval
     * 
     */
    @JsonProperty("MonitoringInterval")
    public Integer getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval
     * 
     */
    @JsonProperty("MonitoringInterval")
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
    @JsonProperty("MonitoringRoleArn")
    public String getMonitoringRoleArn() {
        return monitoringRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn
     * 
     */
    @JsonProperty("MonitoringRoleArn")
    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    public DBInstance withMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz
     * 
     */
    @JsonProperty("MultiAZ")
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz
     * 
     */
    @JsonProperty("MultiAZ")
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
    @JsonProperty("OptionGroupName")
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname
     * 
     */
    @JsonProperty("OptionGroupName")
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    public DBInstance withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port
     * 
     */
    @JsonProperty("Port")
    public String getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port
     * 
     */
    @JsonProperty("Port")
    public void setPort(String port) {
        this.port = port;
    }

    public DBInstance withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow
     * 
     */
    @JsonProperty("PreferredBackupWindow")
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow
     * 
     */
    @JsonProperty("PreferredBackupWindow")
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    public DBInstance withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public DBInstance withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
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
    @JsonProperty("SourceDBInstanceIdentifier")
    public String getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier
     * 
     */
    @JsonProperty("SourceDBInstanceIdentifier")
    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }

    public DBInstance withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion
     * 
     */
    @JsonProperty("SourceRegion")
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion
     * 
     */
    @JsonProperty("SourceRegion")
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public DBInstance withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted
     * 
     */
    @JsonProperty("StorageEncrypted")
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted
     * 
     */
    @JsonProperty("StorageEncrypted")
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
    @JsonProperty("StorageType")
    public String getStorageType() {
        return storageType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype
     * 
     */
    @JsonProperty("StorageType")
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public DBInstance withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags
     * 
     */
    @JsonProperty("Tags")
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
    @JsonProperty("Timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone
     * 
     */
    @JsonProperty("Timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public DBInstance withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups
     * 
     */
    @JsonProperty("VPCSecurityGroups")
    public List<String> getVPCSecurityGroups() {
        return vPCSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups
     * 
     */
    @JsonProperty("VPCSecurityGroups")
    public void setVPCSecurityGroups(List<String> vPCSecurityGroups) {
        this.vPCSecurityGroups = vPCSecurityGroups;
    }

    public DBInstance withVPCSecurityGroups(List<String> vPCSecurityGroups) {
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
