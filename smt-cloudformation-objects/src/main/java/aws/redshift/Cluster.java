
package aws.redshift;

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
 * Cluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllowVersionUpgrade",
    "AutomatedSnapshotRetentionPeriod",
    "AvailabilityZone",
    "ClusterIdentifier",
    "ClusterParameterGroupName",
    "ClusterSecurityGroups",
    "ClusterSubnetGroupName",
    "ClusterType",
    "ClusterVersion",
    "DBName",
    "ElasticIp",
    "Encrypted",
    "HsmClientCertificateIdentifier",
    "HsmConfigurationIdentifier",
    "IamRoles",
    "KmsKeyId",
    "LoggingProperties",
    "MasterUserPassword",
    "MasterUsername",
    "NodeType",
    "NumberOfNodes",
    "OwnerAccount",
    "Port",
    "PreferredMaintenanceWindow",
    "PubliclyAccessible",
    "SnapshotClusterIdentifier",
    "SnapshotIdentifier",
    "Tags",
    "VpcSecurityGroupIds"
})
public class Cluster {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade
     * 
     */
    @JsonProperty("AllowVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade")
    private Boolean allowVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod
     * 
     */
    @JsonProperty("AutomatedSnapshotRetentionPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod")
    private Integer automatedSnapshotRetentionPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone")
    private String availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier
     * 
     */
    @JsonProperty("ClusterIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier")
    private String clusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname
     * 
     */
    @JsonProperty("ClusterParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname")
    private String clusterParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups
     * 
     */
    @JsonProperty("ClusterSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups")
    private List<String> clusterSecurityGroups = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname
     * 
     */
    @JsonProperty("ClusterSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname")
    private String clusterSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype
     * 
     */
    @JsonProperty("ClusterType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype")
    private String clusterType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion
     * 
     */
    @JsonProperty("ClusterVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion")
    private String clusterVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname
     * 
     */
    @JsonProperty("DBName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname")
    private String dBName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip
     * 
     */
    @JsonProperty("ElasticIp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip")
    private String elasticIp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted")
    private Boolean encrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertidentifier
     * 
     */
    @JsonProperty("HsmClientCertificateIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertidentifier")
    private String hsmClientCertificateIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier
     * 
     */
    @JsonProperty("HsmConfigurationIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier")
    private String hsmConfigurationIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles
     * 
     */
    @JsonProperty("IamRoles")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles")
    private Set<String> iamRoles = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid")
    private String kmsKeyId;
    /**
     * LoggingProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html
     * 
     */
    @JsonProperty("LoggingProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html")
    private LoggingProperties loggingProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword
     * 
     */
    @JsonProperty("MasterUserPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword")
    private String masterUserPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername")
    private String masterUsername;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    @JsonProperty("NodeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype")
    private String nodeType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    @JsonProperty("NumberOfNodes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype")
    private Integer numberOfNodes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount
     * 
     */
    @JsonProperty("OwnerAccount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount")
    private String ownerAccount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow")
    private String preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible")
    private Boolean publiclyAccessible;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier
     * 
     */
    @JsonProperty("SnapshotClusterIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier")
    private String snapshotClusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier
     * 
     */
    @JsonProperty("SnapshotIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier")
    private String snapshotIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids")
    private List<String> vpcSecurityGroupIds = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade
     * 
     */
    @JsonProperty("AllowVersionUpgrade")
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade
     * 
     */
    @JsonProperty("AllowVersionUpgrade")
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }

    public Cluster withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod
     * 
     */
    @JsonProperty("AutomatedSnapshotRetentionPeriod")
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod
     * 
     */
    @JsonProperty("AutomatedSnapshotRetentionPeriod")
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }

    public Cluster withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Cluster withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier
     * 
     */
    @JsonProperty("ClusterIdentifier")
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier
     * 
     */
    @JsonProperty("ClusterIdentifier")
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    public Cluster withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname
     * 
     */
    @JsonProperty("ClusterParameterGroupName")
    public String getClusterParameterGroupName() {
        return clusterParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname
     * 
     */
    @JsonProperty("ClusterParameterGroupName")
    public void setClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }

    public Cluster withClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups
     * 
     */
    @JsonProperty("ClusterSecurityGroups")
    public List<String> getClusterSecurityGroups() {
        return clusterSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups
     * 
     */
    @JsonProperty("ClusterSecurityGroups")
    public void setClusterSecurityGroups(List<String> clusterSecurityGroups) {
        this.clusterSecurityGroups = clusterSecurityGroups;
    }

    public Cluster withClusterSecurityGroups(List<String> clusterSecurityGroups) {
        this.clusterSecurityGroups = clusterSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname
     * 
     */
    @JsonProperty("ClusterSubnetGroupName")
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname
     * 
     */
    @JsonProperty("ClusterSubnetGroupName")
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    public Cluster withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype
     * 
     */
    @JsonProperty("ClusterType")
    public String getClusterType() {
        return clusterType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype
     * 
     */
    @JsonProperty("ClusterType")
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public Cluster withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion
     * 
     */
    @JsonProperty("ClusterVersion")
    public String getClusterVersion() {
        return clusterVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion
     * 
     */
    @JsonProperty("ClusterVersion")
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public Cluster withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname
     * 
     */
    @JsonProperty("DBName")
    public String getDBName() {
        return dBName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname
     * 
     */
    @JsonProperty("DBName")
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    public Cluster withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip
     * 
     */
    @JsonProperty("ElasticIp")
    public String getElasticIp() {
        return elasticIp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip
     * 
     */
    @JsonProperty("ElasticIp")
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    public Cluster withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted
     * 
     */
    @JsonProperty("Encrypted")
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Cluster withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertidentifier
     * 
     */
    @JsonProperty("HsmClientCertificateIdentifier")
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertidentifier
     * 
     */
    @JsonProperty("HsmClientCertificateIdentifier")
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }

    public Cluster withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier
     * 
     */
    @JsonProperty("HsmConfigurationIdentifier")
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier
     * 
     */
    @JsonProperty("HsmConfigurationIdentifier")
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    public Cluster withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles
     * 
     */
    @JsonProperty("IamRoles")
    public Set<String> getIamRoles() {
        return iamRoles;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles
     * 
     */
    @JsonProperty("IamRoles")
    public void setIamRoles(Set<String> iamRoles) {
        this.iamRoles = iamRoles;
    }

    public Cluster withIamRoles(Set<String> iamRoles) {
        this.iamRoles = iamRoles;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public Cluster withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * LoggingProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html
     * 
     */
    @JsonProperty("LoggingProperties")
    public LoggingProperties getLoggingProperties() {
        return loggingProperties;
    }

    /**
     * LoggingProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html
     * 
     */
    @JsonProperty("LoggingProperties")
    public void setLoggingProperties(LoggingProperties loggingProperties) {
        this.loggingProperties = loggingProperties;
    }

    public Cluster withLoggingProperties(LoggingProperties loggingProperties) {
        this.loggingProperties = loggingProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword
     * 
     */
    @JsonProperty("MasterUserPassword")
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword
     * 
     */
    @JsonProperty("MasterUserPassword")
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    public Cluster withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    public Cluster withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    @JsonProperty("NodeType")
    public String getNodeType() {
        return nodeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    @JsonProperty("NodeType")
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Cluster withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    @JsonProperty("NumberOfNodes")
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    @JsonProperty("NumberOfNodes")
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    public Cluster withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount
     * 
     */
    @JsonProperty("OwnerAccount")
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount
     * 
     */
    @JsonProperty("OwnerAccount")
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public Cluster withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port
     * 
     */
    @JsonProperty("Port")
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port
     * 
     */
    @JsonProperty("Port")
    public void setPort(Integer port) {
        this.port = port;
    }

    public Cluster withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public Cluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    public Cluster withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier
     * 
     */
    @JsonProperty("SnapshotClusterIdentifier")
    public String getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier
     * 
     */
    @JsonProperty("SnapshotClusterIdentifier")
    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    public Cluster withSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier
     * 
     */
    @JsonProperty("SnapshotIdentifier")
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier
     * 
     */
    @JsonProperty("SnapshotIdentifier")
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    public Cluster withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Cluster withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    public List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    public void setVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public Cluster withVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allowVersionUpgrade", allowVersionUpgrade).append("automatedSnapshotRetentionPeriod", automatedSnapshotRetentionPeriod).append("availabilityZone", availabilityZone).append("clusterIdentifier", clusterIdentifier).append("clusterParameterGroupName", clusterParameterGroupName).append("clusterSecurityGroups", clusterSecurityGroups).append("clusterSubnetGroupName", clusterSubnetGroupName).append("clusterType", clusterType).append("clusterVersion", clusterVersion).append("dBName", dBName).append("elasticIp", elasticIp).append("encrypted", encrypted).append("hsmClientCertificateIdentifier", hsmClientCertificateIdentifier).append("hsmConfigurationIdentifier", hsmConfigurationIdentifier).append("iamRoles", iamRoles).append("kmsKeyId", kmsKeyId).append("loggingProperties", loggingProperties).append("masterUserPassword", masterUserPassword).append("masterUsername", masterUsername).append("nodeType", nodeType).append("numberOfNodes", numberOfNodes).append("ownerAccount", ownerAccount).append("port", port).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("publiclyAccessible", publiclyAccessible).append("snapshotClusterIdentifier", snapshotClusterIdentifier).append("snapshotIdentifier", snapshotIdentifier).append("tags", tags).append("vpcSecurityGroupIds", vpcSecurityGroupIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vpcSecurityGroupIds).append(allowVersionUpgrade).append(clusterIdentifier).append(numberOfNodes).append(ownerAccount).append(availabilityZone).append(clusterVersion).append(elasticIp).append(loggingProperties).append(publiclyAccessible).append(clusterParameterGroupName).append(hsmClientCertificateIdentifier).append(hsmConfigurationIdentifier).append(masterUserPassword).append(clusterType).append(masterUsername).append(dBName).append(iamRoles).append(clusterSecurityGroups).append(snapshotIdentifier).append(nodeType).append(clusterSubnetGroupName).append(tags).append(encrypted).append(port).append(snapshotClusterIdentifier).append(preferredMaintenanceWindow).append(kmsKeyId).append(automatedSnapshotRetentionPeriod).toHashCode();
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
        return new EqualsBuilder().append(vpcSecurityGroupIds, rhs.vpcSecurityGroupIds).append(allowVersionUpgrade, rhs.allowVersionUpgrade).append(clusterIdentifier, rhs.clusterIdentifier).append(numberOfNodes, rhs.numberOfNodes).append(ownerAccount, rhs.ownerAccount).append(availabilityZone, rhs.availabilityZone).append(clusterVersion, rhs.clusterVersion).append(elasticIp, rhs.elasticIp).append(loggingProperties, rhs.loggingProperties).append(publiclyAccessible, rhs.publiclyAccessible).append(clusterParameterGroupName, rhs.clusterParameterGroupName).append(hsmClientCertificateIdentifier, rhs.hsmClientCertificateIdentifier).append(hsmConfigurationIdentifier, rhs.hsmConfigurationIdentifier).append(masterUserPassword, rhs.masterUserPassword).append(clusterType, rhs.clusterType).append(masterUsername, rhs.masterUsername).append(dBName, rhs.dBName).append(iamRoles, rhs.iamRoles).append(clusterSecurityGroups, rhs.clusterSecurityGroups).append(snapshotIdentifier, rhs.snapshotIdentifier).append(nodeType, rhs.nodeType).append(clusterSubnetGroupName, rhs.clusterSubnetGroupName).append(tags, rhs.tags).append(encrypted, rhs.encrypted).append(port, rhs.port).append(snapshotClusterIdentifier, rhs.snapshotClusterIdentifier).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(kmsKeyId, rhs.kmsKeyId).append(automatedSnapshotRetentionPeriod, rhs.automatedSnapshotRetentionPeriod).isEquals();
    }

}
