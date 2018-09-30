
package aws.dax;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Cluster
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SSESpecification",
    "Description",
    "ReplicationFactor",
    "ParameterGroupName",
    "AvailabilityZones",
    "IAMRoleARN",
    "SubnetGroupName",
    "PreferredMaintenanceWindow",
    "NotificationTopicARN",
    "SecurityGroupIds",
    "NodeType",
    "ClusterName",
    "Tags"
})
public class Cluster {

    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html
     * 
     */
    @JsonProperty("SSESpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html")
    private SSESpecification sSESpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor
     * 
     */
    @JsonProperty("ReplicationFactor")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor")
    private Integer replicationFactor;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname
     * 
     */
    @JsonProperty("ParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname")
    private CharSequence parameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones
     * 
     */
    @JsonProperty("AvailabilityZones")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones")
    private List<CharSequence> availabilityZones = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn
     * 
     */
    @JsonProperty("IAMRoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn")
    private CharSequence iAMRoleARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname
     * 
     */
    @JsonProperty("SubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname")
    private CharSequence subnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn
     * 
     */
    @JsonProperty("NotificationTopicARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn")
    private CharSequence notificationTopicARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids")
    private List<CharSequence> securityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype
     * 
     */
    @JsonProperty("NodeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype")
    private CharSequence nodeType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername
     * 
     */
    @JsonProperty("ClusterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername")
    private CharSequence clusterName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags")
    private Object tags;

    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html
     * 
     */
    public SSESpecification getSSESpecification() {
        return sSESpecification;
    }

    /**
     * SSESpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html
     * 
     */
    public void setSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
    }

    public Cluster withSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Cluster withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor
     * 
     */
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-replicationfactor
     * 
     */
    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    public Cluster withReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname
     * 
     */
    public CharSequence getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-parametergroupname
     * 
     */
    public void setParameterGroupName(CharSequence parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    public Cluster withParameterGroupName(CharSequence parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones
     * 
     */
    public List<CharSequence> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-availabilityzones
     * 
     */
    public void setAvailabilityZones(List<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public Cluster withAvailabilityZones(List<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn
     * 
     */
    public CharSequence getIAMRoleARN() {
        return iAMRoleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-iamrolearn
     * 
     */
    public void setIAMRoleARN(CharSequence iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
    }

    public Cluster withIAMRoleARN(CharSequence iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname
     * 
     */
    public CharSequence getSubnetGroupName() {
        return subnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-subnetgroupname
     * 
     */
    public void setSubnetGroupName(CharSequence subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
    }

    public Cluster withSubnetGroupName(CharSequence subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow
     * 
     */
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-preferredmaintenancewindow
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn
     * 
     */
    public CharSequence getNotificationTopicARN() {
        return notificationTopicARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-notificationtopicarn
     * 
     */
    public void setNotificationTopicARN(CharSequence notificationTopicARN) {
        this.notificationTopicARN = notificationTopicARN;
    }

    public Cluster withNotificationTopicARN(CharSequence notificationTopicARN) {
        this.notificationTopicARN = notificationTopicARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids
     * 
     */
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-securitygroupids
     * 
     */
    public void setSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public Cluster withSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype
     * 
     */
    public CharSequence getNodeType() {
        return nodeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-nodetype
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername
     * 
     */
    public CharSequence getClusterName() {
        return clusterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-clustername
     * 
     */
    public void setClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
    }

    public Cluster withClusterName(CharSequence clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags
     * 
     */
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html#cfn-dax-cluster-tags
     * 
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Cluster withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sSESpecification", sSESpecification).append("description", description).append("replicationFactor", replicationFactor).append("parameterGroupName", parameterGroupName).append("availabilityZones", availabilityZones).append("iAMRoleARN", iAMRoleARN).append("subnetGroupName", subnetGroupName).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("notificationTopicARN", notificationTopicARN).append("securityGroupIds", securityGroupIds).append("nodeType", nodeType).append("clusterName", clusterName).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parameterGroupName).append(replicationFactor).append(sSESpecification).append(description).append(availabilityZones).append(nodeType).append(tags).append(iAMRoleARN).append(notificationTopicARN).append(securityGroupIds).append(preferredMaintenanceWindow).append(clusterName).append(subnetGroupName).toHashCode();
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
        return new EqualsBuilder().append(parameterGroupName, rhs.parameterGroupName).append(replicationFactor, rhs.replicationFactor).append(sSESpecification, rhs.sSESpecification).append(description, rhs.description).append(availabilityZones, rhs.availabilityZones).append(nodeType, rhs.nodeType).append(tags, rhs.tags).append(iAMRoleARN, rhs.iAMRoleARN).append(notificationTopicARN, rhs.notificationTopicARN).append(securityGroupIds, rhs.securityGroupIds).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(clusterName, rhs.clusterName).append(subnetGroupName, rhs.subnetGroupName).isEquals();
    }

}
