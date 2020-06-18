
package shiver.me.timbers.aws.eks;

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


/**
 * Nodegroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ScalingConfig",
    "Labels",
    "ReleaseVersion",
    "NodegroupName",
    "Subnets",
    "NodeRole",
    "AmiType",
    "ForceUpdateEnabled",
    "Version",
    "RemoteAccess",
    "DiskSize",
    "ClusterName",
    "InstanceTypes",
    "Tags"
})
public class Nodegroup {

    /**
     * NodegroupScalingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html
     * 
     */
    @JsonProperty("ScalingConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html")
    private Property<NodegroupScalingConfig> scalingConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels
     * 
     */
    @JsonProperty("Labels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels")
    private Object labels;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-releaseversion
     * 
     */
    @JsonProperty("ReleaseVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-releaseversion")
    private CharSequence releaseVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname
     * 
     */
    @JsonProperty("NodegroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname")
    private CharSequence nodegroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-subnets
     * 
     */
    @JsonProperty("Subnets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-subnets")
    private List<CharSequence> subnets = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-noderole
     * 
     */
    @JsonProperty("NodeRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-noderole")
    private CharSequence nodeRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-amitype
     * 
     */
    @JsonProperty("AmiType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-amitype")
    private CharSequence amiType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-forceupdateenabled
     * 
     */
    @JsonProperty("ForceUpdateEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-forceupdateenabled")
    private CharSequence forceUpdateEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-version
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-version")
    private CharSequence version;
    /**
     * NodegroupRemoteAccess
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html
     * 
     */
    @JsonProperty("RemoteAccess")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html")
    private Property<NodegroupRemoteAccess> remoteAccess;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-disksize
     * 
     */
    @JsonProperty("DiskSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-disksize")
    private Number diskSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername
     * 
     */
    @JsonProperty("ClusterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername")
    private CharSequence clusterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes
     * 
     */
    @JsonProperty("InstanceTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes")
    private List<CharSequence> instanceTypes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags")
    private Object tags;

    /**
     * NodegroupScalingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html
     * 
     */
    @JsonIgnore
    public Property<NodegroupScalingConfig> getScalingConfig() {
        return scalingConfig;
    }

    /**
     * NodegroupScalingConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html
     * 
     */
    @JsonIgnore
    public void setScalingConfig(Property<NodegroupScalingConfig> scalingConfig) {
        this.scalingConfig = scalingConfig;
    }

    public Nodegroup withScalingConfig(Property<NodegroupScalingConfig> scalingConfig) {
        this.scalingConfig = scalingConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels
     * 
     */
    @JsonIgnore
    public Object getLabels() {
        return labels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-labels
     * 
     */
    @JsonIgnore
    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public Nodegroup withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-releaseversion
     * 
     */
    @JsonIgnore
    public CharSequence getReleaseVersion() {
        return releaseVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-releaseversion
     * 
     */
    @JsonIgnore
    public void setReleaseVersion(CharSequence releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public Nodegroup withReleaseVersion(CharSequence releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname
     * 
     */
    @JsonIgnore
    public CharSequence getNodegroupName() {
        return nodegroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-nodegroupname
     * 
     */
    @JsonIgnore
    public void setNodegroupName(CharSequence nodegroupName) {
        this.nodegroupName = nodegroupName;
    }

    public Nodegroup withNodegroupName(CharSequence nodegroupName) {
        this.nodegroupName = nodegroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-subnets
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnets() {
        return subnets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-subnets
     * 
     */
    @JsonIgnore
    public void setSubnets(List<CharSequence> subnets) {
        this.subnets = subnets;
    }

    public Nodegroup withSubnets(List<CharSequence> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-noderole
     * 
     */
    @JsonIgnore
    public CharSequence getNodeRole() {
        return nodeRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-noderole
     * 
     */
    @JsonIgnore
    public void setNodeRole(CharSequence nodeRole) {
        this.nodeRole = nodeRole;
    }

    public Nodegroup withNodeRole(CharSequence nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-amitype
     * 
     */
    @JsonIgnore
    public CharSequence getAmiType() {
        return amiType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-amitype
     * 
     */
    @JsonIgnore
    public void setAmiType(CharSequence amiType) {
        this.amiType = amiType;
    }

    public Nodegroup withAmiType(CharSequence amiType) {
        this.amiType = amiType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-forceupdateenabled
     * 
     */
    @JsonIgnore
    public CharSequence getForceUpdateEnabled() {
        return forceUpdateEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-forceupdateenabled
     * 
     */
    @JsonIgnore
    public void setForceUpdateEnabled(CharSequence forceUpdateEnabled) {
        this.forceUpdateEnabled = forceUpdateEnabled;
    }

    public Nodegroup withForceUpdateEnabled(CharSequence forceUpdateEnabled) {
        this.forceUpdateEnabled = forceUpdateEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-version
     * 
     */
    @JsonIgnore
    public CharSequence getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-version
     * 
     */
    @JsonIgnore
    public void setVersion(CharSequence version) {
        this.version = version;
    }

    public Nodegroup withVersion(CharSequence version) {
        this.version = version;
        return this;
    }

    /**
     * NodegroupRemoteAccess
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html
     * 
     */
    @JsonIgnore
    public Property<NodegroupRemoteAccess> getRemoteAccess() {
        return remoteAccess;
    }

    /**
     * NodegroupRemoteAccess
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html
     * 
     */
    @JsonIgnore
    public void setRemoteAccess(Property<NodegroupRemoteAccess> remoteAccess) {
        this.remoteAccess = remoteAccess;
    }

    public Nodegroup withRemoteAccess(Property<NodegroupRemoteAccess> remoteAccess) {
        this.remoteAccess = remoteAccess;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-disksize
     * 
     */
    @JsonIgnore
    public Number getDiskSize() {
        return diskSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-disksize
     * 
     */
    @JsonIgnore
    public void setDiskSize(Number diskSize) {
        this.diskSize = diskSize;
    }

    public Nodegroup withDiskSize(Number diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername
     * 
     */
    @JsonIgnore
    public CharSequence getClusterName() {
        return clusterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-clustername
     * 
     */
    @JsonIgnore
    public void setClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
    }

    public Nodegroup withClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-instancetypes
     * 
     */
    @JsonIgnore
    public void setInstanceTypes(List<CharSequence> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }

    public Nodegroup withInstanceTypes(List<CharSequence> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html#cfn-eks-nodegroup-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Nodegroup withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("scalingConfig", scalingConfig).append("labels", labels).append("releaseVersion", releaseVersion).append("nodegroupName", nodegroupName).append("subnets", subnets).append("nodeRole", nodeRole).append("amiType", amiType).append("forceUpdateEnabled", forceUpdateEnabled).append("version", version).append("remoteAccess", remoteAccess).append("diskSize", diskSize).append("clusterName", clusterName).append("instanceTypes", instanceTypes).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scalingConfig).append(instanceTypes).append(releaseVersion).append(version).append(labels).append(tags).append(diskSize).append(nodegroupName).append(forceUpdateEnabled).append(nodeRole).append(clusterName).append(subnets).append(amiType).append(remoteAccess).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nodegroup) == false) {
            return false;
        }
        Nodegroup rhs = ((Nodegroup) other);
        return new EqualsBuilder().append(scalingConfig, rhs.scalingConfig).append(instanceTypes, rhs.instanceTypes).append(releaseVersion, rhs.releaseVersion).append(version, rhs.version).append(labels, rhs.labels).append(tags, rhs.tags).append(diskSize, rhs.diskSize).append(nodegroupName, rhs.nodegroupName).append(forceUpdateEnabled, rhs.forceUpdateEnabled).append(nodeRole, rhs.nodeRole).append(clusterName, rhs.clusterName).append(subnets, rhs.subnets).append(amiType, rhs.amiType).append(remoteAccess, rhs.remoteAccess).isEquals();
    }

}
