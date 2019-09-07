
package aws.rds;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DBInstance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AllocatedStorage",
    "AllowMajorVersionUpgrade",
    "AssociatedRoles",
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
    "DeleteAutomatedBackups",
    "DeletionProtection",
    "Domain",
    "DomainIAMRoleName",
    "EnableCloudwatchLogsExports",
    "EnableIAMDatabaseAuthentication",
    "EnablePerformanceInsights",
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
    "PerformanceInsightsKMSKeyId",
    "PerformanceInsightsRetentionPeriod",
    "Port",
    "PreferredBackupWindow",
    "PreferredMaintenanceWindow",
    "ProcessorFeatures",
    "PromotionTier",
    "PubliclyAccessible",
    "SourceDBInstanceIdentifier",
    "SourceRegion",
    "StorageEncrypted",
    "StorageType",
    "Tags",
    "Timezone",
    "UseDefaultProcessorFeatures",
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
    private CharSequence allowMajorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-associatedroles
     * 
     */
    @JsonProperty("AssociatedRoles")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-associatedroles")
    private Set<Property<DBInstanceDBInstanceRole>> associatedRoles = new LinkedHashSet<Property<DBInstanceDBInstanceRole>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade")
    private CharSequence autoMinorVersionUpgrade;
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
    private Number backupRetentionPeriod;
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
    private CharSequence copyTagsToSnapshot;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-deleteautomatedbackups
     * 
     */
    @JsonProperty("DeleteAutomatedBackups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-deleteautomatedbackups")
    private CharSequence deleteAutomatedBackups;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-deletionprotection
     * 
     */
    @JsonProperty("DeletionProtection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-deletionprotection")
    private CharSequence deletionProtection;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enablecloudwatchlogsexports
     * 
     */
    @JsonProperty("EnableCloudwatchLogsExports")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enablecloudwatchlogsexports")
    private Set<CharSequence> enableCloudwatchLogsExports = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableiamdatabaseauthentication
     * 
     */
    @JsonProperty("EnableIAMDatabaseAuthentication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableiamdatabaseauthentication")
    private CharSequence enableIAMDatabaseAuthentication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableperformanceinsights
     * 
     */
    @JsonProperty("EnablePerformanceInsights")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableperformanceinsights")
    private CharSequence enablePerformanceInsights;
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
    private Number iops;
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
    private Number monitoringInterval;
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
    private CharSequence multiAZ;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname
     * 
     */
    @JsonProperty("OptionGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname")
    private CharSequence optionGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-performanceinsightskmskeyid
     * 
     */
    @JsonProperty("PerformanceInsightsKMSKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-performanceinsightskmskeyid")
    private CharSequence performanceInsightsKMSKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-performanceinsightsretentionperiod
     * 
     */
    @JsonProperty("PerformanceInsightsRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-performanceinsightsretentionperiod")
    private Number performanceInsightsRetentionPeriod;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-processorfeatures
     * 
     */
    @JsonProperty("ProcessorFeatures")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-processorfeatures")
    private Set<Property<DBInstanceProcessorFeature>> processorFeatures = new LinkedHashSet<Property<DBInstanceProcessorFeature>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-promotiontier
     * 
     */
    @JsonProperty("PromotionTier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-promotiontier")
    private Number promotionTier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible")
    private CharSequence publiclyAccessible;
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
    private CharSequence storageEncrypted;
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
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone
     * 
     */
    @JsonProperty("Timezone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone")
    private CharSequence timezone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures
     * 
     */
    @JsonProperty("UseDefaultProcessorFeatures")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures")
    private CharSequence useDefaultProcessorFeatures;
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
    @JsonIgnore
    public CharSequence getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allocatedstorage
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-allowmajorversionupgrade
     * 
     */
    @JsonIgnore
    public void setAllowMajorVersionUpgrade(CharSequence allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    public DBInstance withAllowMajorVersionUpgrade(CharSequence allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-associatedroles
     * 
     */
    @JsonIgnore
    public Set<Property<DBInstanceDBInstanceRole>> getAssociatedRoles() {
        return associatedRoles;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-associatedroles
     * 
     */
    @JsonIgnore
    public void setAssociatedRoles(Set<Property<DBInstanceDBInstanceRole>> associatedRoles) {
        this.associatedRoles = associatedRoles;
    }

    public DBInstance withAssociatedRoles(Set<Property<DBInstanceDBInstanceRole>> associatedRoles) {
        this.associatedRoles = associatedRoles;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade
     * 
     */
    @JsonIgnore
    public CharSequence getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-autominorversionupgrade
     * 
     */
    @JsonIgnore
    public void setAutoMinorVersionUpgrade(CharSequence autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    public DBInstance withAutoMinorVersionUpgrade(CharSequence autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-availabilityzone
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Number getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-backupretentionperiod
     * 
     */
    @JsonIgnore
    public void setBackupRetentionPeriod(Number backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    public DBInstance withBackupRetentionPeriod(Number backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname
     * 
     */
    @JsonIgnore
    public CharSequence getCharacterSetName() {
        return characterSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-charactersetname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-copytagstosnapshot
     * 
     */
    @JsonIgnore
    public void setCopyTagsToSnapshot(CharSequence copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    public DBInstance withCopyTagsToSnapshot(CharSequence copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier
     * 
     */
    @JsonIgnore
    public CharSequence getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbclusteridentifier
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceclass
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbinstanceidentifier
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDBName() {
        return dBName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbparametergroupname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<CharSequence> getDBSecurityGroups() {
        return dBSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsecuritygroups
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsnapshotidentifier
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-dbsubnetgroupname
     * 
     */
    @JsonIgnore
    public void setDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    public DBInstance withDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-deleteautomatedbackups
     * 
     */
    @JsonIgnore
    public CharSequence getDeleteAutomatedBackups() {
        return deleteAutomatedBackups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-deleteautomatedbackups
     * 
     */
    @JsonIgnore
    public void setDeleteAutomatedBackups(CharSequence deleteAutomatedBackups) {
        this.deleteAutomatedBackups = deleteAutomatedBackups;
    }

    public DBInstance withDeleteAutomatedBackups(CharSequence deleteAutomatedBackups) {
        this.deleteAutomatedBackups = deleteAutomatedBackups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-deletionprotection
     * 
     */
    @JsonIgnore
    public CharSequence getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-deletionprotection
     * 
     */
    @JsonIgnore
    public void setDeletionProtection(CharSequence deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    public DBInstance withDeletionProtection(CharSequence deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain
     * 
     */
    @JsonIgnore
    public CharSequence getDomain() {
        return domain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domain
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getDomainIAMRoleName() {
        return domainIAMRoleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-domainiamrolename
     * 
     */
    @JsonIgnore
    public void setDomainIAMRoleName(CharSequence domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    public DBInstance withDomainIAMRoleName(CharSequence domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enablecloudwatchlogsexports
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getEnableCloudwatchLogsExports() {
        return enableCloudwatchLogsExports;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enablecloudwatchlogsexports
     * 
     */
    @JsonIgnore
    public void setEnableCloudwatchLogsExports(Set<CharSequence> enableCloudwatchLogsExports) {
        this.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
    }

    public DBInstance withEnableCloudwatchLogsExports(Set<CharSequence> enableCloudwatchLogsExports) {
        this.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableiamdatabaseauthentication
     * 
     */
    @JsonIgnore
    public CharSequence getEnableIAMDatabaseAuthentication() {
        return enableIAMDatabaseAuthentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableiamdatabaseauthentication
     * 
     */
    @JsonIgnore
    public void setEnableIAMDatabaseAuthentication(CharSequence enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    public DBInstance withEnableIAMDatabaseAuthentication(CharSequence enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableperformanceinsights
     * 
     */
    @JsonIgnore
    public CharSequence getEnablePerformanceInsights() {
        return enablePerformanceInsights;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-enableperformanceinsights
     * 
     */
    @JsonIgnore
    public void setEnablePerformanceInsights(CharSequence enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    public DBInstance withEnablePerformanceInsights(CharSequence enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine
     * 
     */
    @JsonIgnore
    public CharSequence getEngine() {
        return engine;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engine
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-engineversion
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Number getIops() {
        return iops;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-iops
     * 
     */
    @JsonIgnore
    public void setIops(Number iops) {
        this.iops = iops;
    }

    public DBInstance withIops(Number iops) {
        this.iops = iops;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-kmskeyid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getLicenseModel() {
        return licenseModel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-licensemodel
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masteruserpassword
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getMasterUsername() {
        return masterUsername;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-masterusername
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Number getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringinterval
     * 
     */
    @JsonIgnore
    public void setMonitoringInterval(Number monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    public DBInstance withMonitoringInterval(Number monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getMonitoringRoleArn() {
        return monitoringRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-monitoringrolearn
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getMultiAZ() {
        return multiAZ;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-multiaz
     * 
     */
    @JsonIgnore
    public void setMultiAZ(CharSequence multiAZ) {
        this.multiAZ = multiAZ;
    }

    public DBInstance withMultiAZ(CharSequence multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname
     * 
     */
    @JsonIgnore
    public CharSequence getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-optiongroupname
     * 
     */
    @JsonIgnore
    public void setOptionGroupName(CharSequence optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    public DBInstance withOptionGroupName(CharSequence optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-performanceinsightskmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getPerformanceInsightsKMSKeyId() {
        return performanceInsightsKMSKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-performanceinsightskmskeyid
     * 
     */
    @JsonIgnore
    public void setPerformanceInsightsKMSKeyId(CharSequence performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
    }

    public DBInstance withPerformanceInsightsKMSKeyId(CharSequence performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-performanceinsightsretentionperiod
     * 
     */
    @JsonIgnore
    public Number getPerformanceInsightsRetentionPeriod() {
        return performanceInsightsRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-performanceinsightsretentionperiod
     * 
     */
    @JsonIgnore
    public void setPerformanceInsightsRetentionPeriod(Number performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
    }

    public DBInstance withPerformanceInsightsRetentionPeriod(Number performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port
     * 
     */
    @JsonIgnore
    public CharSequence getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-port
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getPreferredBackupWindow() {
        return preferredBackupWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredbackupwindow
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-preferredmaintenancewindow
     * 
     */
    @JsonIgnore
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public DBInstance withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-processorfeatures
     * 
     */
    @JsonIgnore
    public Set<Property<DBInstanceProcessorFeature>> getProcessorFeatures() {
        return processorFeatures;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-processorfeatures
     * 
     */
    @JsonIgnore
    public void setProcessorFeatures(Set<Property<DBInstanceProcessorFeature>> processorFeatures) {
        this.processorFeatures = processorFeatures;
    }

    public DBInstance withProcessorFeatures(Set<Property<DBInstanceProcessorFeature>> processorFeatures) {
        this.processorFeatures = processorFeatures;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-promotiontier
     * 
     */
    @JsonIgnore
    public Number getPromotionTier() {
        return promotionTier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-promotiontier
     * 
     */
    @JsonIgnore
    public void setPromotionTier(Number promotionTier) {
        this.promotionTier = promotionTier;
    }

    public DBInstance withPromotionTier(Number promotionTier) {
        this.promotionTier = promotionTier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible
     * 
     */
    @JsonIgnore
    public CharSequence getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-publiclyaccessible
     * 
     */
    @JsonIgnore
    public void setPubliclyAccessible(CharSequence publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    public DBInstance withPubliclyAccessible(CharSequence publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourcedbinstanceidentifier
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getSourceRegion() {
        return sourceRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-sourceregion
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storageencrypted
     * 
     */
    @JsonIgnore
    public void setStorageEncrypted(CharSequence storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    public DBInstance withStorageEncrypted(CharSequence storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype
     * 
     */
    @JsonIgnore
    public CharSequence getStorageType() {
        return storageType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-storagetype
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public DBInstance withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone
     * 
     */
    @JsonIgnore
    public CharSequence getTimezone() {
        return timezone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-timezone
     * 
     */
    @JsonIgnore
    public void setTimezone(CharSequence timezone) {
        this.timezone = timezone;
    }

    public DBInstance withTimezone(CharSequence timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures
     * 
     */
    @JsonIgnore
    public CharSequence getUseDefaultProcessorFeatures() {
        return useDefaultProcessorFeatures;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-usedefaultprocessorfeatures
     * 
     */
    @JsonIgnore
    public void setUseDefaultProcessorFeatures(CharSequence useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
    }

    public DBInstance withUseDefaultProcessorFeatures(CharSequence useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getVPCSecurityGroups() {
        return vPCSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-database-instance.html#cfn-rds-dbinstance-vpcsecuritygroups
     * 
     */
    @JsonIgnore
    public void setVPCSecurityGroups(List<CharSequence> vPCSecurityGroups) {
        this.vPCSecurityGroups = vPCSecurityGroups;
    }

    public DBInstance withVPCSecurityGroups(List<CharSequence> vPCSecurityGroups) {
        this.vPCSecurityGroups = vPCSecurityGroups;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allocatedStorage", allocatedStorage).append("allowMajorVersionUpgrade", allowMajorVersionUpgrade).append("associatedRoles", associatedRoles).append("autoMinorVersionUpgrade", autoMinorVersionUpgrade).append("availabilityZone", availabilityZone).append("backupRetentionPeriod", backupRetentionPeriod).append("characterSetName", characterSetName).append("copyTagsToSnapshot", copyTagsToSnapshot).append("dBClusterIdentifier", dBClusterIdentifier).append("dBInstanceClass", dBInstanceClass).append("dBInstanceIdentifier", dBInstanceIdentifier).append("dBName", dBName).append("dBParameterGroupName", dBParameterGroupName).append("dBSecurityGroups", dBSecurityGroups).append("dBSnapshotIdentifier", dBSnapshotIdentifier).append("dBSubnetGroupName", dBSubnetGroupName).append("deleteAutomatedBackups", deleteAutomatedBackups).append("deletionProtection", deletionProtection).append("domain", domain).append("domainIAMRoleName", domainIAMRoleName).append("enableCloudwatchLogsExports", enableCloudwatchLogsExports).append("enableIAMDatabaseAuthentication", enableIAMDatabaseAuthentication).append("enablePerformanceInsights", enablePerformanceInsights).append("engine", engine).append("engineVersion", engineVersion).append("iops", iops).append("kmsKeyId", kmsKeyId).append("licenseModel", licenseModel).append("masterUserPassword", masterUserPassword).append("masterUsername", masterUsername).append("monitoringInterval", monitoringInterval).append("monitoringRoleArn", monitoringRoleArn).append("multiAZ", multiAZ).append("optionGroupName", optionGroupName).append("performanceInsightsKMSKeyId", performanceInsightsKMSKeyId).append("performanceInsightsRetentionPeriod", performanceInsightsRetentionPeriod).append("port", port).append("preferredBackupWindow", preferredBackupWindow).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("processorFeatures", processorFeatures).append("promotionTier", promotionTier).append("publiclyAccessible", publiclyAccessible).append("sourceDBInstanceIdentifier", sourceDBInstanceIdentifier).append("sourceRegion", sourceRegion).append("storageEncrypted", storageEncrypted).append("storageType", storageType).append("tags", tags).append("timezone", timezone).append("useDefaultProcessorFeatures", useDefaultProcessorFeatures).append("vPCSecurityGroups", vPCSecurityGroups).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allocatedStorage).append(enablePerformanceInsights).append(associatedRoles).append(availabilityZone).append(deleteAutomatedBackups).append(dBSubnetGroupName).append(dBSecurityGroups).append(iops).append(performanceInsightsKMSKeyId).append(vPCSecurityGroups).append(dBSnapshotIdentifier).append(optionGroupName).append(performanceInsightsRetentionPeriod).append(engineVersion).append(masterUsername).append(dBInstanceClass).append(processorFeatures).append(tags).append(enableIAMDatabaseAuthentication).append(port).append(dBParameterGroupName).append(domain).append(monitoringInterval).append(backupRetentionPeriod).append(useDefaultProcessorFeatures).append(domainIAMRoleName).append(promotionTier).append(kmsKeyId).append(dBClusterIdentifier).append(enableCloudwatchLogsExports).append(timezone).append(preferredBackupWindow).append(deletionProtection).append(dBInstanceIdentifier).append(engine).append(sourceDBInstanceIdentifier).append(publiclyAccessible).append(masterUserPassword).append(allowMajorVersionUpgrade).append(dBName).append(multiAZ).append(characterSetName).append(monitoringRoleArn).append(storageEncrypted).append(licenseModel).append(preferredMaintenanceWindow).append(sourceRegion).append(storageType).append(autoMinorVersionUpgrade).append(copyTagsToSnapshot).toHashCode();
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
        return new EqualsBuilder().append(allocatedStorage, rhs.allocatedStorage).append(enablePerformanceInsights, rhs.enablePerformanceInsights).append(associatedRoles, rhs.associatedRoles).append(availabilityZone, rhs.availabilityZone).append(deleteAutomatedBackups, rhs.deleteAutomatedBackups).append(dBSubnetGroupName, rhs.dBSubnetGroupName).append(dBSecurityGroups, rhs.dBSecurityGroups).append(iops, rhs.iops).append(performanceInsightsKMSKeyId, rhs.performanceInsightsKMSKeyId).append(vPCSecurityGroups, rhs.vPCSecurityGroups).append(dBSnapshotIdentifier, rhs.dBSnapshotIdentifier).append(optionGroupName, rhs.optionGroupName).append(performanceInsightsRetentionPeriod, rhs.performanceInsightsRetentionPeriod).append(engineVersion, rhs.engineVersion).append(masterUsername, rhs.masterUsername).append(dBInstanceClass, rhs.dBInstanceClass).append(processorFeatures, rhs.processorFeatures).append(tags, rhs.tags).append(enableIAMDatabaseAuthentication, rhs.enableIAMDatabaseAuthentication).append(port, rhs.port).append(dBParameterGroupName, rhs.dBParameterGroupName).append(domain, rhs.domain).append(monitoringInterval, rhs.monitoringInterval).append(backupRetentionPeriod, rhs.backupRetentionPeriod).append(useDefaultProcessorFeatures, rhs.useDefaultProcessorFeatures).append(domainIAMRoleName, rhs.domainIAMRoleName).append(promotionTier, rhs.promotionTier).append(kmsKeyId, rhs.kmsKeyId).append(dBClusterIdentifier, rhs.dBClusterIdentifier).append(enableCloudwatchLogsExports, rhs.enableCloudwatchLogsExports).append(timezone, rhs.timezone).append(preferredBackupWindow, rhs.preferredBackupWindow).append(deletionProtection, rhs.deletionProtection).append(dBInstanceIdentifier, rhs.dBInstanceIdentifier).append(engine, rhs.engine).append(sourceDBInstanceIdentifier, rhs.sourceDBInstanceIdentifier).append(publiclyAccessible, rhs.publiclyAccessible).append(masterUserPassword, rhs.masterUserPassword).append(allowMajorVersionUpgrade, rhs.allowMajorVersionUpgrade).append(dBName, rhs.dBName).append(multiAZ, rhs.multiAZ).append(characterSetName, rhs.characterSetName).append(monitoringRoleArn, rhs.monitoringRoleArn).append(storageEncrypted, rhs.storageEncrypted).append(licenseModel, rhs.licenseModel).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(sourceRegion, rhs.sourceRegion).append(storageType, rhs.storageType).append(autoMinorVersionUpgrade, rhs.autoMinorVersionUpgrade).append(copyTagsToSnapshot, rhs.copyTagsToSnapshot).isEquals();
    }

}
