
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
 * CacheCluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AZMode",
    "AutoMinorVersionUpgrade",
    "CacheNodeType",
    "CacheParameterGroupName",
    "CacheSecurityGroupNames",
    "CacheSubnetGroupName",
    "ClusterName",
    "Engine",
    "EngineVersion",
    "NotificationTopicArn",
    "NumCacheNodes",
    "Port",
    "PreferredAvailabilityZone",
    "PreferredAvailabilityZones",
    "PreferredMaintenanceWindow",
    "SnapshotArns",
    "SnapshotName",
    "SnapshotRetentionLimit",
    "SnapshotWindow",
    "Tags",
    "VpcSecurityGroupIds"
})
public class CacheCluster {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-azmode
     * 
     */
    @JsonProperty("AZMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-azmode")
    private CharSequence aZMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-autominorversionupgrade")
    private Boolean autoMinorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachenodetype
     * 
     */
    @JsonProperty("CacheNodeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachenodetype")
    private CharSequence cacheNodeType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cacheparametergroupname
     * 
     */
    @JsonProperty("CacheParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cacheparametergroupname")
    private CharSequence cacheParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames
     * 
     */
    @JsonProperty("CacheSecurityGroupNames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames")
    private List<CharSequence> cacheSecurityGroupNames = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname
     * 
     */
    @JsonProperty("CacheSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname")
    private CharSequence cacheSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-clustername
     * 
     */
    @JsonProperty("ClusterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-clustername")
    private CharSequence clusterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engine
     * 
     */
    @JsonProperty("Engine")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engine")
    private CharSequence engine;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engineversion")
    private CharSequence engineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-notificationtopicarn
     * 
     */
    @JsonProperty("NotificationTopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-notificationtopicarn")
    private CharSequence notificationTopicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-numcachenodes
     * 
     */
    @JsonProperty("NumCacheNodes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-numcachenodes")
    private Integer numCacheNodes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone
     * 
     */
    @JsonProperty("PreferredAvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone")
    private CharSequence preferredAvailabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones
     * 
     */
    @JsonProperty("PreferredAvailabilityZones")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones")
    private Set<CharSequence> preferredAvailabilityZones = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotarns
     * 
     */
    @JsonProperty("SnapshotArns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotarns")
    private Set<CharSequence> snapshotArns = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotname
     * 
     */
    @JsonProperty("SnapshotName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotname")
    private CharSequence snapshotName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit
     * 
     */
    @JsonProperty("SnapshotRetentionLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit")
    private Integer snapshotRetentionLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotwindow
     * 
     */
    @JsonProperty("SnapshotWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotwindow")
    private CharSequence snapshotWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids")
    private List<CharSequence> vpcSecurityGroupIds = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-azmode
     * 
     */
    public CharSequence getAZMode() {
        return aZMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-azmode
     * 
     */
    public void setAZMode(CharSequence aZMode) {
        this.aZMode = aZMode;
    }

    public CacheCluster withAZMode(CharSequence aZMode) {
        this.aZMode = aZMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-autominorversionupgrade
     * 
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-autominorversionupgrade
     * 
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    public CacheCluster withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachenodetype
     * 
     */
    public CharSequence getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachenodetype
     * 
     */
    public void setCacheNodeType(CharSequence cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    public CacheCluster withCacheNodeType(CharSequence cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cacheparametergroupname
     * 
     */
    public CharSequence getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cacheparametergroupname
     * 
     */
    public void setCacheParameterGroupName(CharSequence cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    public CacheCluster withCacheParameterGroupName(CharSequence cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames
     * 
     */
    public List<CharSequence> getCacheSecurityGroupNames() {
        return cacheSecurityGroupNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames
     * 
     */
    public void setCacheSecurityGroupNames(List<CharSequence> cacheSecurityGroupNames) {
        this.cacheSecurityGroupNames = cacheSecurityGroupNames;
    }

    public CacheCluster withCacheSecurityGroupNames(List<CharSequence> cacheSecurityGroupNames) {
        this.cacheSecurityGroupNames = cacheSecurityGroupNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname
     * 
     */
    public CharSequence getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname
     * 
     */
    public void setCacheSubnetGroupName(CharSequence cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    public CacheCluster withCacheSubnetGroupName(CharSequence cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-clustername
     * 
     */
    public CharSequence getClusterName() {
        return clusterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-clustername
     * 
     */
    public void setClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
    }

    public CacheCluster withClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engine
     * 
     */
    public CharSequence getEngine() {
        return engine;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engine
     * 
     */
    public void setEngine(CharSequence engine) {
        this.engine = engine;
    }

    public CacheCluster withEngine(CharSequence engine) {
        this.engine = engine;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engineversion
     * 
     */
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-engineversion
     * 
     */
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public CacheCluster withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-notificationtopicarn
     * 
     */
    public CharSequence getNotificationTopicArn() {
        return notificationTopicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-notificationtopicarn
     * 
     */
    public void setNotificationTopicArn(CharSequence notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    public CacheCluster withNotificationTopicArn(CharSequence notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-numcachenodes
     * 
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-numcachenodes
     * 
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    public CacheCluster withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-port
     * 
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public CacheCluster withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone
     * 
     */
    public CharSequence getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone
     * 
     */
    public void setPreferredAvailabilityZone(CharSequence preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }

    public CacheCluster withPreferredAvailabilityZone(CharSequence preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones
     * 
     */
    public Set<CharSequence> getPreferredAvailabilityZones() {
        return preferredAvailabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones
     * 
     */
    public void setPreferredAvailabilityZones(Set<CharSequence> preferredAvailabilityZones) {
        this.preferredAvailabilityZones = preferredAvailabilityZones;
    }

    public CacheCluster withPreferredAvailabilityZones(Set<CharSequence> preferredAvailabilityZones) {
        this.preferredAvailabilityZones = preferredAvailabilityZones;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow
     * 
     */
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow
     * 
     */
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public CacheCluster withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotarns
     * 
     */
    public Set<CharSequence> getSnapshotArns() {
        return snapshotArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotarns
     * 
     */
    public void setSnapshotArns(Set<CharSequence> snapshotArns) {
        this.snapshotArns = snapshotArns;
    }

    public CacheCluster withSnapshotArns(Set<CharSequence> snapshotArns) {
        this.snapshotArns = snapshotArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotname
     * 
     */
    public CharSequence getSnapshotName() {
        return snapshotName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotname
     * 
     */
    public void setSnapshotName(CharSequence snapshotName) {
        this.snapshotName = snapshotName;
    }

    public CacheCluster withSnapshotName(CharSequence snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit
     * 
     */
    public Integer getSnapshotRetentionLimit() {
        return snapshotRetentionLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit
     * 
     */
    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    public CacheCluster withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotwindow
     * 
     */
    public CharSequence getSnapshotWindow() {
        return snapshotWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-snapshotwindow
     * 
     */
    public void setSnapshotWindow(CharSequence snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    public CacheCluster withSnapshotWindow(CharSequence snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CacheCluster withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids
     * 
     */
    public List<CharSequence> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cache-cluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids
     * 
     */
    public void setVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public CacheCluster withVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aZMode", aZMode).append("autoMinorVersionUpgrade", autoMinorVersionUpgrade).append("cacheNodeType", cacheNodeType).append("cacheParameterGroupName", cacheParameterGroupName).append("cacheSecurityGroupNames", cacheSecurityGroupNames).append("cacheSubnetGroupName", cacheSubnetGroupName).append("clusterName", clusterName).append("engine", engine).append("engineVersion", engineVersion).append("notificationTopicArn", notificationTopicArn).append("numCacheNodes", numCacheNodes).append("port", port).append("preferredAvailabilityZone", preferredAvailabilityZone).append("preferredAvailabilityZones", preferredAvailabilityZones).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("snapshotArns", snapshotArns).append("snapshotName", snapshotName).append("snapshotRetentionLimit", snapshotRetentionLimit).append("snapshotWindow", snapshotWindow).append("tags", tags).append("vpcSecurityGroupIds", vpcSecurityGroupIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(engineVersion).append(vpcSecurityGroupIds).append(aZMode).append(cacheSubnetGroupName).append(preferredAvailabilityZones).append(preferredAvailabilityZone).append(snapshotWindow).append(snapshotArns).append(snapshotRetentionLimit).append(numCacheNodes).append(tags).append(cacheNodeType).append(engine).append(port).append(cacheSecurityGroupNames).append(notificationTopicArn).append(clusterName).append(preferredMaintenanceWindow).append(snapshotName).append(autoMinorVersionUpgrade).append(cacheParameterGroupName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CacheCluster) == false) {
            return false;
        }
        CacheCluster rhs = ((CacheCluster) other);
        return new EqualsBuilder().append(engineVersion, rhs.engineVersion).append(vpcSecurityGroupIds, rhs.vpcSecurityGroupIds).append(aZMode, rhs.aZMode).append(cacheSubnetGroupName, rhs.cacheSubnetGroupName).append(preferredAvailabilityZones, rhs.preferredAvailabilityZones).append(preferredAvailabilityZone, rhs.preferredAvailabilityZone).append(snapshotWindow, rhs.snapshotWindow).append(snapshotArns, rhs.snapshotArns).append(snapshotRetentionLimit, rhs.snapshotRetentionLimit).append(numCacheNodes, rhs.numCacheNodes).append(tags, rhs.tags).append(cacheNodeType, rhs.cacheNodeType).append(engine, rhs.engine).append(port, rhs.port).append(cacheSecurityGroupNames, rhs.cacheSecurityGroupNames).append(notificationTopicArn, rhs.notificationTopicArn).append(clusterName, rhs.clusterName).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(snapshotName, rhs.snapshotName).append(autoMinorVersionUpgrade, rhs.autoMinorVersionUpgrade).append(cacheParameterGroupName, rhs.cacheParameterGroupName).isEquals();
    }

}
