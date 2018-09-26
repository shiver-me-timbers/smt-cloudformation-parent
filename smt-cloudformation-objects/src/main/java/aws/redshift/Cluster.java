
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
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier
     * 
     */
    @JsonProperty("ClusterIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier")
    private CharSequence clusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname
     * 
     */
    @JsonProperty("ClusterParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname")
    private CharSequence clusterParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups
     * 
     */
    @JsonProperty("ClusterSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups")
    private List<CharSequence> clusterSecurityGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname
     * 
     */
    @JsonProperty("ClusterSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname")
    private CharSequence clusterSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype
     * 
     */
    @JsonProperty("ClusterType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype")
    private CharSequence clusterType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion
     * 
     */
    @JsonProperty("ClusterVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion")
    private CharSequence clusterVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname
     * 
     */
    @JsonProperty("DBName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname")
    private CharSequence dBName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip
     * 
     */
    @JsonProperty("ElasticIp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip")
    private CharSequence elasticIp;
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
    private CharSequence hsmClientCertificateIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier
     * 
     */
    @JsonProperty("HsmConfigurationIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier")
    private CharSequence hsmConfigurationIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles
     * 
     */
    @JsonProperty("IamRoles")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles")
    private Set<CharSequence> iamRoles = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid")
    private CharSequence kmsKeyId;
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
    private CharSequence masterUserPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername
     * 
     */
    @JsonProperty("MasterUsername")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername")
    private CharSequence masterUsername;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    @JsonProperty("NodeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype")
    private CharSequence nodeType;
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
    private CharSequence ownerAccount;
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
    private CharSequence preferredMaintenanceWindow;
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
    private CharSequence snapshotClusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier
     * 
     */
    @JsonProperty("SnapshotIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier")
    private CharSequence snapshotIdentifier;
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
    private List<CharSequence> vpcSecurityGroupIds = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade
     * 
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-allowversionupgrade
     * 
     */
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
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-automatedsnapshotretentionperiod
     * 
     */
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
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-availabilityzone
     * 
     */
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Cluster withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier
     * 
     */
    public CharSequence getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusteridentifier
     * 
     */
    public void setClusterIdentifier(CharSequence clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    public Cluster withClusterIdentifier(CharSequence clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname
     * 
     */
    public CharSequence getClusterParameterGroupName() {
        return clusterParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterparametergroupname
     * 
     */
    public void setClusterParameterGroupName(CharSequence clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }

    public Cluster withClusterParameterGroupName(CharSequence clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups
     * 
     */
    public List<CharSequence> getClusterSecurityGroups() {
        return clusterSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersecuritygroups
     * 
     */
    public void setClusterSecurityGroups(List<CharSequence> clusterSecurityGroups) {
        this.clusterSecurityGroups = clusterSecurityGroups;
    }

    public Cluster withClusterSecurityGroups(List<CharSequence> clusterSecurityGroups) {
        this.clusterSecurityGroups = clusterSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname
     * 
     */
    public CharSequence getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustersubnetgroupname
     * 
     */
    public void setClusterSubnetGroupName(CharSequence clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }

    public Cluster withClusterSubnetGroupName(CharSequence clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype
     * 
     */
    public CharSequence getClusterType() {
        return clusterType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clustertype
     * 
     */
    public void setClusterType(CharSequence clusterType) {
        this.clusterType = clusterType;
    }

    public Cluster withClusterType(CharSequence clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion
     * 
     */
    public CharSequence getClusterVersion() {
        return clusterVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-clusterversion
     * 
     */
    public void setClusterVersion(CharSequence clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public Cluster withClusterVersion(CharSequence clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname
     * 
     */
    public CharSequence getDBName() {
        return dBName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-dbname
     * 
     */
    public void setDBName(CharSequence dBName) {
        this.dBName = dBName;
    }

    public Cluster withDBName(CharSequence dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip
     * 
     */
    public CharSequence getElasticIp() {
        return elasticIp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-elasticip
     * 
     */
    public void setElasticIp(CharSequence elasticIp) {
        this.elasticIp = elasticIp;
    }

    public Cluster withElasticIp(CharSequence elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted
     * 
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-encrypted
     * 
     */
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
    public CharSequence getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-hsmclientcertidentifier
     * 
     */
    public void setHsmClientCertificateIdentifier(CharSequence hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }

    public Cluster withHsmClientCertificateIdentifier(CharSequence hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier
     * 
     */
    public CharSequence getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-HsmConfigurationIdentifier
     * 
     */
    public void setHsmConfigurationIdentifier(CharSequence hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    public Cluster withHsmConfigurationIdentifier(CharSequence hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles
     * 
     */
    public Set<CharSequence> getIamRoles() {
        return iamRoles;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-iamroles
     * 
     */
    public void setIamRoles(Set<CharSequence> iamRoles) {
        this.iamRoles = iamRoles;
    }

    public Cluster withIamRoles(Set<CharSequence> iamRoles) {
        this.iamRoles = iamRoles;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid
     * 
     */
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-kmskeyid
     * 
     */
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public Cluster withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * LoggingProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html
     * 
     */
    public LoggingProperties getLoggingProperties() {
        return loggingProperties;
    }

    /**
     * LoggingProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html
     * 
     */
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
    public CharSequence getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masteruserpassword
     * 
     */
    public void setMasterUserPassword(CharSequence masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    public Cluster withMasterUserPassword(CharSequence masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername
     * 
     */
    public CharSequence getMasterUsername() {
        return masterUsername;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-masterusername
     * 
     */
    public void setMasterUsername(CharSequence masterUsername) {
        this.masterUsername = masterUsername;
    }

    public Cluster withMasterUsername(CharSequence masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    public CharSequence getNodeType() {
        return nodeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    public void setNodeType(CharSequence nodeType) {
        this.nodeType = nodeType;
    }

    public Cluster withNodeType(CharSequence nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-nodetype
     * 
     */
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
    public CharSequence getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-owneraccount
     * 
     */
    public void setOwnerAccount(CharSequence ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public Cluster withOwnerAccount(CharSequence ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-port
     * 
     */
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
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-preferredmaintenancewindow
     * 
     */
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public Cluster withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible
     * 
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-publiclyaccessible
     * 
     */
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
    public CharSequence getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotclusteridentifier
     * 
     */
    public void setSnapshotClusterIdentifier(CharSequence snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    public Cluster withSnapshotClusterIdentifier(CharSequence snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier
     * 
     */
    public CharSequence getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-snapshotidentifier
     * 
     */
    public void setSnapshotIdentifier(CharSequence snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    public Cluster withSnapshotIdentifier(CharSequence snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-tags
     * 
     */
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
    public List<CharSequence> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html#cfn-redshift-cluster-vpcsecuritygroupids
     * 
     */
    public void setVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public Cluster withVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
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
