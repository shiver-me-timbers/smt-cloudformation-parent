
package aws.elasticache;

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
 * ReplicationGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AtRestEncryptionEnabled",
    "AuthToken",
    "AutoMinorVersionUpgrade",
    "AutomaticFailoverEnabled",
    "CacheNodeType",
    "CacheParameterGroupName",
    "CacheSecurityGroupNames",
    "CacheSubnetGroupName",
    "Engine",
    "EngineVersion",
    "NodeGroupConfiguration",
    "NotificationTopicArn",
    "NumCacheClusters",
    "NumNodeGroups",
    "Port",
    "PreferredCacheClusterAZs",
    "PreferredMaintenanceWindow",
    "PrimaryClusterId",
    "ReplicasPerNodeGroup",
    "ReplicationGroupDescription",
    "ReplicationGroupId",
    "SecurityGroupIds",
    "SnapshotArns",
    "SnapshotName",
    "SnapshotRetentionLimit",
    "SnapshotWindow",
    "SnapshottingClusterId",
    "Tags",
    "TransitEncryptionEnabled"
})
public class ReplicationGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled
     * 
     */
    @JsonProperty("AtRestEncryptionEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled")
    private Boolean atRestEncryptionEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken
     * 
     */
    @JsonProperty("AuthToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken")
    private CharSequence authToken;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade")
    private Boolean autoMinorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled
     * 
     */
    @JsonProperty("AutomaticFailoverEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled")
    private Boolean automaticFailoverEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype
     * 
     */
    @JsonProperty("CacheNodeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype")
    private CharSequence cacheNodeType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname
     * 
     */
    @JsonProperty("CacheParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname")
    private CharSequence cacheParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames
     * 
     */
    @JsonProperty("CacheSecurityGroupNames")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames")
    private Set<CharSequence> cacheSecurityGroupNames = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname
     * 
     */
    @JsonProperty("CacheSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname")
    private CharSequence cacheSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine
     * 
     */
    @JsonProperty("Engine")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine")
    private CharSequence engine;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion")
    private CharSequence engineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration
     * 
     */
    @JsonProperty("NodeGroupConfiguration")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration")
    private Set<NodeGroupConfiguration> nodeGroupConfiguration = new LinkedHashSet<NodeGroupConfiguration>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn
     * 
     */
    @JsonProperty("NotificationTopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn")
    private CharSequence notificationTopicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters
     * 
     */
    @JsonProperty("NumCacheClusters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters")
    private Integer numCacheClusters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups
     * 
     */
    @JsonProperty("NumNodeGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups")
    private Integer numNodeGroups;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs
     * 
     */
    @JsonProperty("PreferredCacheClusterAZs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs")
    private Set<CharSequence> preferredCacheClusterAZs = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid
     * 
     */
    @JsonProperty("PrimaryClusterId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid")
    private CharSequence primaryClusterId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup
     * 
     */
    @JsonProperty("ReplicasPerNodeGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup")
    private Integer replicasPerNodeGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription
     * 
     */
    @JsonProperty("ReplicationGroupDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription")
    private CharSequence replicationGroupDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid
     * 
     */
    @JsonProperty("ReplicationGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid")
    private CharSequence replicationGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids")
    private Set<CharSequence> securityGroupIds = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns
     * 
     */
    @JsonProperty("SnapshotArns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns")
    private Set<CharSequence> snapshotArns = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname
     * 
     */
    @JsonProperty("SnapshotName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname")
    private CharSequence snapshotName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit
     * 
     */
    @JsonProperty("SnapshotRetentionLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit")
    private Integer snapshotRetentionLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow
     * 
     */
    @JsonProperty("SnapshotWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow")
    private CharSequence snapshotWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid
     * 
     */
    @JsonProperty("SnapshottingClusterId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid")
    private CharSequence snapshottingClusterId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled
     * 
     */
    @JsonProperty("TransitEncryptionEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled")
    private Boolean transitEncryptionEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled
     * 
     */
    public Boolean getAtRestEncryptionEnabled() {
        return atRestEncryptionEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled
     * 
     */
    public void setAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
    }

    public ReplicationGroup withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken
     * 
     */
    public CharSequence getAuthToken() {
        return authToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken
     * 
     */
    public void setAuthToken(CharSequence authToken) {
        this.authToken = authToken;
    }

    public ReplicationGroup withAuthToken(CharSequence authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade
     * 
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade
     * 
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    public ReplicationGroup withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled
     * 
     */
    public Boolean getAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled
     * 
     */
    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }

    public ReplicationGroup withAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype
     * 
     */
    public CharSequence getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype
     * 
     */
    public void setCacheNodeType(CharSequence cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    public ReplicationGroup withCacheNodeType(CharSequence cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname
     * 
     */
    public CharSequence getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname
     * 
     */
    public void setCacheParameterGroupName(CharSequence cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    public ReplicationGroup withCacheParameterGroupName(CharSequence cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames
     * 
     */
    public Set<CharSequence> getCacheSecurityGroupNames() {
        return cacheSecurityGroupNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames
     * 
     */
    public void setCacheSecurityGroupNames(Set<CharSequence> cacheSecurityGroupNames) {
        this.cacheSecurityGroupNames = cacheSecurityGroupNames;
    }

    public ReplicationGroup withCacheSecurityGroupNames(Set<CharSequence> cacheSecurityGroupNames) {
        this.cacheSecurityGroupNames = cacheSecurityGroupNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname
     * 
     */
    public CharSequence getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname
     * 
     */
    public void setCacheSubnetGroupName(CharSequence cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    public ReplicationGroup withCacheSubnetGroupName(CharSequence cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine
     * 
     */
    public CharSequence getEngine() {
        return engine;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine
     * 
     */
    public void setEngine(CharSequence engine) {
        this.engine = engine;
    }

    public ReplicationGroup withEngine(CharSequence engine) {
        this.engine = engine;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion
     * 
     */
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion
     * 
     */
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ReplicationGroup withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration
     * 
     */
    public Set<NodeGroupConfiguration> getNodeGroupConfiguration() {
        return nodeGroupConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration
     * 
     */
    public void setNodeGroupConfiguration(Set<NodeGroupConfiguration> nodeGroupConfiguration) {
        this.nodeGroupConfiguration = nodeGroupConfiguration;
    }

    public ReplicationGroup withNodeGroupConfiguration(Set<NodeGroupConfiguration> nodeGroupConfiguration) {
        this.nodeGroupConfiguration = nodeGroupConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn
     * 
     */
    public CharSequence getNotificationTopicArn() {
        return notificationTopicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn
     * 
     */
    public void setNotificationTopicArn(CharSequence notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    public ReplicationGroup withNotificationTopicArn(CharSequence notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters
     * 
     */
    public Integer getNumCacheClusters() {
        return numCacheClusters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters
     * 
     */
    public void setNumCacheClusters(Integer numCacheClusters) {
        this.numCacheClusters = numCacheClusters;
    }

    public ReplicationGroup withNumCacheClusters(Integer numCacheClusters) {
        this.numCacheClusters = numCacheClusters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups
     * 
     */
    public Integer getNumNodeGroups() {
        return numNodeGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups
     * 
     */
    public void setNumNodeGroups(Integer numNodeGroups) {
        this.numNodeGroups = numNodeGroups;
    }

    public ReplicationGroup withNumNodeGroups(Integer numNodeGroups) {
        this.numNodeGroups = numNodeGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port
     * 
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public ReplicationGroup withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs
     * 
     */
    public Set<CharSequence> getPreferredCacheClusterAZs() {
        return preferredCacheClusterAZs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs
     * 
     */
    public void setPreferredCacheClusterAZs(Set<CharSequence> preferredCacheClusterAZs) {
        this.preferredCacheClusterAZs = preferredCacheClusterAZs;
    }

    public ReplicationGroup withPreferredCacheClusterAZs(Set<CharSequence> preferredCacheClusterAZs) {
        this.preferredCacheClusterAZs = preferredCacheClusterAZs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow
     * 
     */
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow
     * 
     */
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public ReplicationGroup withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid
     * 
     */
    public CharSequence getPrimaryClusterId() {
        return primaryClusterId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid
     * 
     */
    public void setPrimaryClusterId(CharSequence primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    public ReplicationGroup withPrimaryClusterId(CharSequence primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup
     * 
     */
    public Integer getReplicasPerNodeGroup() {
        return replicasPerNodeGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup
     * 
     */
    public void setReplicasPerNodeGroup(Integer replicasPerNodeGroup) {
        this.replicasPerNodeGroup = replicasPerNodeGroup;
    }

    public ReplicationGroup withReplicasPerNodeGroup(Integer replicasPerNodeGroup) {
        this.replicasPerNodeGroup = replicasPerNodeGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription
     * 
     */
    public CharSequence getReplicationGroupDescription() {
        return replicationGroupDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription
     * 
     */
    public void setReplicationGroupDescription(CharSequence replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
    }

    public ReplicationGroup withReplicationGroupDescription(CharSequence replicationGroupDescription) {
        this.replicationGroupDescription = replicationGroupDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid
     * 
     */
    public CharSequence getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid
     * 
     */
    public void setReplicationGroupId(CharSequence replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    public ReplicationGroup withReplicationGroupId(CharSequence replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids
     * 
     */
    public Set<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids
     * 
     */
    public void setSecurityGroupIds(Set<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public ReplicationGroup withSecurityGroupIds(Set<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns
     * 
     */
    public Set<CharSequence> getSnapshotArns() {
        return snapshotArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns
     * 
     */
    public void setSnapshotArns(Set<CharSequence> snapshotArns) {
        this.snapshotArns = snapshotArns;
    }

    public ReplicationGroup withSnapshotArns(Set<CharSequence> snapshotArns) {
        this.snapshotArns = snapshotArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname
     * 
     */
    public CharSequence getSnapshotName() {
        return snapshotName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname
     * 
     */
    public void setSnapshotName(CharSequence snapshotName) {
        this.snapshotName = snapshotName;
    }

    public ReplicationGroup withSnapshotName(CharSequence snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit
     * 
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit
     * 
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    public ReplicationGroup withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow
     * 
     */
    public CharSequence getSnapshotWindow() {
        return snapshotWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow
     * 
     */
    public void setSnapshotWindow(CharSequence snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    public ReplicationGroup withSnapshotWindow(CharSequence snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid
     * 
     */
    public CharSequence getSnapshottingClusterId() {
        return snapshottingClusterId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid
     * 
     */
    public void setSnapshottingClusterId(CharSequence snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
    }

    public ReplicationGroup withSnapshottingClusterId(CharSequence snapshottingClusterId) {
        this.snapshottingClusterId = snapshottingClusterId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ReplicationGroup withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled
     * 
     */
    public Boolean getTransitEncryptionEnabled() {
        return transitEncryptionEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled
     * 
     */
    public void setTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
    }

    public ReplicationGroup withTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("atRestEncryptionEnabled", atRestEncryptionEnabled).append("authToken", authToken).append("autoMinorVersionUpgrade", autoMinorVersionUpgrade).append("automaticFailoverEnabled", automaticFailoverEnabled).append("cacheNodeType", cacheNodeType).append("cacheParameterGroupName", cacheParameterGroupName).append("cacheSecurityGroupNames", cacheSecurityGroupNames).append("cacheSubnetGroupName", cacheSubnetGroupName).append("engine", engine).append("engineVersion", engineVersion).append("nodeGroupConfiguration", nodeGroupConfiguration).append("notificationTopicArn", notificationTopicArn).append("numCacheClusters", numCacheClusters).append("numNodeGroups", numNodeGroups).append("port", port).append("preferredCacheClusterAZs", preferredCacheClusterAZs).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("primaryClusterId", primaryClusterId).append("replicasPerNodeGroup", replicasPerNodeGroup).append("replicationGroupDescription", replicationGroupDescription).append("replicationGroupId", replicationGroupId).append("securityGroupIds", securityGroupIds).append("snapshotArns", snapshotArns).append("snapshotName", snapshotName).append("snapshotRetentionLimit", snapshotRetentionLimit).append("snapshotWindow", snapshotWindow).append("snapshottingClusterId", snapshottingClusterId).append("tags", tags).append("transitEncryptionEnabled", transitEncryptionEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(replicationGroupDescription).append(cacheSubnetGroupName).append(primaryClusterId).append(atRestEncryptionEnabled).append(authToken).append(numNodeGroups).append(snapshotRetentionLimit).append(preferredCacheClusterAZs).append(engine).append(cacheSecurityGroupNames).append(securityGroupIds).append(snapshotName).append(automaticFailoverEnabled).append(engineVersion).append(snapshotWindow).append(snapshotArns).append(nodeGroupConfiguration).append(tags).append(snapshottingClusterId).append(cacheNodeType).append(numCacheClusters).append(replicasPerNodeGroup).append(port).append(notificationTopicArn).append(preferredMaintenanceWindow).append(transitEncryptionEnabled).append(replicationGroupId).append(autoMinorVersionUpgrade).append(cacheParameterGroupName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationGroup) == false) {
            return false;
        }
        ReplicationGroup rhs = ((ReplicationGroup) other);
        return new EqualsBuilder().append(replicationGroupDescription, rhs.replicationGroupDescription).append(cacheSubnetGroupName, rhs.cacheSubnetGroupName).append(primaryClusterId, rhs.primaryClusterId).append(atRestEncryptionEnabled, rhs.atRestEncryptionEnabled).append(authToken, rhs.authToken).append(numNodeGroups, rhs.numNodeGroups).append(snapshotRetentionLimit, rhs.snapshotRetentionLimit).append(preferredCacheClusterAZs, rhs.preferredCacheClusterAZs).append(engine, rhs.engine).append(cacheSecurityGroupNames, rhs.cacheSecurityGroupNames).append(securityGroupIds, rhs.securityGroupIds).append(snapshotName, rhs.snapshotName).append(automaticFailoverEnabled, rhs.automaticFailoverEnabled).append(engineVersion, rhs.engineVersion).append(snapshotWindow, rhs.snapshotWindow).append(snapshotArns, rhs.snapshotArns).append(nodeGroupConfiguration, rhs.nodeGroupConfiguration).append(tags, rhs.tags).append(snapshottingClusterId, rhs.snapshottingClusterId).append(cacheNodeType, rhs.cacheNodeType).append(numCacheClusters, rhs.numCacheClusters).append(replicasPerNodeGroup, rhs.replicasPerNodeGroup).append(port, rhs.port).append(notificationTopicArn, rhs.notificationTopicArn).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(transitEncryptionEnabled, rhs.transitEncryptionEnabled).append(replicationGroupId, rhs.replicationGroupId).append(autoMinorVersionUpgrade, rhs.autoMinorVersionUpgrade).append(cacheParameterGroupName, rhs.cacheParameterGroupName).isEquals();
    }

}
