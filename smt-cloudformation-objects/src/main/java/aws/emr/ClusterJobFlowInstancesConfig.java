
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
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
 * ClusterJobFlowInstancesConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AdditionalMasterSecurityGroups",
    "AdditionalSlaveSecurityGroups",
    "CoreInstanceFleet",
    "CoreInstanceGroup",
    "Ec2KeyName",
    "Ec2SubnetId",
    "Ec2SubnetIds",
    "EmrManagedMasterSecurityGroup",
    "EmrManagedSlaveSecurityGroup",
    "HadoopVersion",
    "KeepJobFlowAliveWhenNoSteps",
    "MasterInstanceFleet",
    "MasterInstanceGroup",
    "Placement",
    "ServiceAccessSecurityGroup",
    "TerminationProtected"
})
public class ClusterJobFlowInstancesConfig implements Property<ClusterJobFlowInstancesConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups
     * 
     */
    @JsonProperty("AdditionalMasterSecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups")
    private Set<CharSequence> additionalMasterSecurityGroups = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups
     * 
     */
    @JsonProperty("AdditionalSlaveSecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups")
    private Set<CharSequence> additionalSlaveSecurityGroups = new LinkedHashSet<CharSequence>();
    /**
     * ClusterInstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    @JsonProperty("CoreInstanceFleet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html")
    private Property<aws.emr.ClusterInstanceFleetConfig> coreInstanceFleet;
    /**
     * ClusterInstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    @JsonProperty("CoreInstanceGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html")
    private Property<aws.emr.ClusterInstanceGroupConfig> coreInstanceGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname
     * 
     */
    @JsonProperty("Ec2KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname")
    private CharSequence ec2KeyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid
     * 
     */
    @JsonProperty("Ec2SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid")
    private CharSequence ec2SubnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetids
     * 
     */
    @JsonProperty("Ec2SubnetIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetids")
    private Set<CharSequence> ec2SubnetIds = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup
     * 
     */
    @JsonProperty("EmrManagedMasterSecurityGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup")
    private CharSequence emrManagedMasterSecurityGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup
     * 
     */
    @JsonProperty("EmrManagedSlaveSecurityGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup")
    private CharSequence emrManagedSlaveSecurityGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion
     * 
     */
    @JsonProperty("HadoopVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion")
    private CharSequence hadoopVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-keepjobflowalivewhennosteps
     * 
     */
    @JsonProperty("KeepJobFlowAliveWhenNoSteps")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-keepjobflowalivewhennosteps")
    private CharSequence keepJobFlowAliveWhenNoSteps;
    /**
     * ClusterInstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    @JsonProperty("MasterInstanceFleet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html")
    private Property<aws.emr.ClusterInstanceFleetConfig> masterInstanceFleet;
    /**
     * ClusterInstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    @JsonProperty("MasterInstanceGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html")
    private Property<aws.emr.ClusterInstanceGroupConfig> masterInstanceGroup;
    /**
     * ClusterPlacementType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html
     * 
     */
    @JsonProperty("Placement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html")
    private Property<ClusterPlacementType> placement;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup
     * 
     */
    @JsonProperty("ServiceAccessSecurityGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup")
    private CharSequence serviceAccessSecurityGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected
     * 
     */
    @JsonProperty("TerminationProtected")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected")
    private CharSequence terminationProtected;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAdditionalMasterSecurityGroups() {
        return additionalMasterSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups
     * 
     */
    @JsonIgnore
    public void setAdditionalMasterSecurityGroups(Set<CharSequence> additionalMasterSecurityGroups) {
        this.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
    }

    public ClusterJobFlowInstancesConfig withAdditionalMasterSecurityGroups(Set<CharSequence> additionalMasterSecurityGroups) {
        this.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAdditionalSlaveSecurityGroups() {
        return additionalSlaveSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups
     * 
     */
    @JsonIgnore
    public void setAdditionalSlaveSecurityGroups(Set<CharSequence> additionalSlaveSecurityGroups) {
        this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
    }

    public ClusterJobFlowInstancesConfig withAdditionalSlaveSecurityGroups(Set<CharSequence> additionalSlaveSecurityGroups) {
        this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
        return this;
    }

    /**
     * ClusterInstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    @JsonIgnore
    public Property<aws.emr.ClusterInstanceFleetConfig> getCoreInstanceFleet() {
        return coreInstanceFleet;
    }

    /**
     * ClusterInstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    @JsonIgnore
    public void setCoreInstanceFleet(Property<aws.emr.ClusterInstanceFleetConfig> coreInstanceFleet) {
        this.coreInstanceFleet = coreInstanceFleet;
    }

    public ClusterJobFlowInstancesConfig withCoreInstanceFleet(Property<aws.emr.ClusterInstanceFleetConfig> coreInstanceFleet) {
        this.coreInstanceFleet = coreInstanceFleet;
        return this;
    }

    /**
     * ClusterInstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    @JsonIgnore
    public Property<aws.emr.ClusterInstanceGroupConfig> getCoreInstanceGroup() {
        return coreInstanceGroup;
    }

    /**
     * ClusterInstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    @JsonIgnore
    public void setCoreInstanceGroup(Property<aws.emr.ClusterInstanceGroupConfig> coreInstanceGroup) {
        this.coreInstanceGroup = coreInstanceGroup;
    }

    public ClusterJobFlowInstancesConfig withCoreInstanceGroup(Property<aws.emr.ClusterInstanceGroupConfig> coreInstanceGroup) {
        this.coreInstanceGroup = coreInstanceGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname
     * 
     */
    @JsonIgnore
    public CharSequence getEc2KeyName() {
        return ec2KeyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname
     * 
     */
    @JsonIgnore
    public void setEc2KeyName(CharSequence ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    public ClusterJobFlowInstancesConfig withEc2KeyName(CharSequence ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid
     * 
     */
    @JsonIgnore
    public CharSequence getEc2SubnetId() {
        return ec2SubnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid
     * 
     */
    @JsonIgnore
    public void setEc2SubnetId(CharSequence ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }

    public ClusterJobFlowInstancesConfig withEc2SubnetId(CharSequence ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetids
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getEc2SubnetIds() {
        return ec2SubnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetids
     * 
     */
    @JsonIgnore
    public void setEc2SubnetIds(Set<CharSequence> ec2SubnetIds) {
        this.ec2SubnetIds = ec2SubnetIds;
    }

    public ClusterJobFlowInstancesConfig withEc2SubnetIds(Set<CharSequence> ec2SubnetIds) {
        this.ec2SubnetIds = ec2SubnetIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup
     * 
     */
    @JsonIgnore
    public CharSequence getEmrManagedMasterSecurityGroup() {
        return emrManagedMasterSecurityGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup
     * 
     */
    @JsonIgnore
    public void setEmrManagedMasterSecurityGroup(CharSequence emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
    }

    public ClusterJobFlowInstancesConfig withEmrManagedMasterSecurityGroup(CharSequence emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup
     * 
     */
    @JsonIgnore
    public CharSequence getEmrManagedSlaveSecurityGroup() {
        return emrManagedSlaveSecurityGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup
     * 
     */
    @JsonIgnore
    public void setEmrManagedSlaveSecurityGroup(CharSequence emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
    }

    public ClusterJobFlowInstancesConfig withEmrManagedSlaveSecurityGroup(CharSequence emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion
     * 
     */
    @JsonIgnore
    public CharSequence getHadoopVersion() {
        return hadoopVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion
     * 
     */
    @JsonIgnore
    public void setHadoopVersion(CharSequence hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }

    public ClusterJobFlowInstancesConfig withHadoopVersion(CharSequence hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-keepjobflowalivewhennosteps
     * 
     */
    @JsonIgnore
    public CharSequence getKeepJobFlowAliveWhenNoSteps() {
        return keepJobFlowAliveWhenNoSteps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-keepjobflowalivewhennosteps
     * 
     */
    @JsonIgnore
    public void setKeepJobFlowAliveWhenNoSteps(CharSequence keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }

    public ClusterJobFlowInstancesConfig withKeepJobFlowAliveWhenNoSteps(CharSequence keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        return this;
    }

    /**
     * ClusterInstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    @JsonIgnore
    public Property<aws.emr.ClusterInstanceFleetConfig> getMasterInstanceFleet() {
        return masterInstanceFleet;
    }

    /**
     * ClusterInstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    @JsonIgnore
    public void setMasterInstanceFleet(Property<aws.emr.ClusterInstanceFleetConfig> masterInstanceFleet) {
        this.masterInstanceFleet = masterInstanceFleet;
    }

    public ClusterJobFlowInstancesConfig withMasterInstanceFleet(Property<aws.emr.ClusterInstanceFleetConfig> masterInstanceFleet) {
        this.masterInstanceFleet = masterInstanceFleet;
        return this;
    }

    /**
     * ClusterInstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    @JsonIgnore
    public Property<aws.emr.ClusterInstanceGroupConfig> getMasterInstanceGroup() {
        return masterInstanceGroup;
    }

    /**
     * ClusterInstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    @JsonIgnore
    public void setMasterInstanceGroup(Property<aws.emr.ClusterInstanceGroupConfig> masterInstanceGroup) {
        this.masterInstanceGroup = masterInstanceGroup;
    }

    public ClusterJobFlowInstancesConfig withMasterInstanceGroup(Property<aws.emr.ClusterInstanceGroupConfig> masterInstanceGroup) {
        this.masterInstanceGroup = masterInstanceGroup;
        return this;
    }

    /**
     * ClusterPlacementType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html
     * 
     */
    @JsonIgnore
    public Property<ClusterPlacementType> getPlacement() {
        return placement;
    }

    /**
     * ClusterPlacementType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html
     * 
     */
    @JsonIgnore
    public void setPlacement(Property<ClusterPlacementType> placement) {
        this.placement = placement;
    }

    public ClusterJobFlowInstancesConfig withPlacement(Property<ClusterPlacementType> placement) {
        this.placement = placement;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup
     * 
     */
    @JsonIgnore
    public CharSequence getServiceAccessSecurityGroup() {
        return serviceAccessSecurityGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup
     * 
     */
    @JsonIgnore
    public void setServiceAccessSecurityGroup(CharSequence serviceAccessSecurityGroup) {
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
    }

    public ClusterJobFlowInstancesConfig withServiceAccessSecurityGroup(CharSequence serviceAccessSecurityGroup) {
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected
     * 
     */
    @JsonIgnore
    public CharSequence getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected
     * 
     */
    @JsonIgnore
    public void setTerminationProtected(CharSequence terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    public ClusterJobFlowInstancesConfig withTerminationProtected(CharSequence terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalMasterSecurityGroups", additionalMasterSecurityGroups).append("additionalSlaveSecurityGroups", additionalSlaveSecurityGroups).append("coreInstanceFleet", coreInstanceFleet).append("coreInstanceGroup", coreInstanceGroup).append("ec2KeyName", ec2KeyName).append("ec2SubnetId", ec2SubnetId).append("ec2SubnetIds", ec2SubnetIds).append("emrManagedMasterSecurityGroup", emrManagedMasterSecurityGroup).append("emrManagedSlaveSecurityGroup", emrManagedSlaveSecurityGroup).append("hadoopVersion", hadoopVersion).append("keepJobFlowAliveWhenNoSteps", keepJobFlowAliveWhenNoSteps).append("masterInstanceFleet", masterInstanceFleet).append("masterInstanceGroup", masterInstanceGroup).append("placement", placement).append("serviceAccessSecurityGroup", serviceAccessSecurityGroup).append("terminationProtected", terminationProtected).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(coreInstanceFleet).append(coreInstanceGroup).append(serviceAccessSecurityGroup).append(hadoopVersion).append(additionalMasterSecurityGroups).append(keepJobFlowAliveWhenNoSteps).append(ec2KeyName).append(ec2SubnetIds).append(masterInstanceFleet).append(terminationProtected).append(additionalSlaveSecurityGroups).append(masterInstanceGroup).append(placement).append(emrManagedMasterSecurityGroup).append(emrManagedSlaveSecurityGroup).append(ec2SubnetId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterJobFlowInstancesConfig) == false) {
            return false;
        }
        ClusterJobFlowInstancesConfig rhs = ((ClusterJobFlowInstancesConfig) other);
        return new EqualsBuilder().append(coreInstanceFleet, rhs.coreInstanceFleet).append(coreInstanceGroup, rhs.coreInstanceGroup).append(serviceAccessSecurityGroup, rhs.serviceAccessSecurityGroup).append(hadoopVersion, rhs.hadoopVersion).append(additionalMasterSecurityGroups, rhs.additionalMasterSecurityGroups).append(keepJobFlowAliveWhenNoSteps, rhs.keepJobFlowAliveWhenNoSteps).append(ec2KeyName, rhs.ec2KeyName).append(ec2SubnetIds, rhs.ec2SubnetIds).append(masterInstanceFleet, rhs.masterInstanceFleet).append(terminationProtected, rhs.terminationProtected).append(additionalSlaveSecurityGroups, rhs.additionalSlaveSecurityGroups).append(masterInstanceGroup, rhs.masterInstanceGroup).append(placement, rhs.placement).append(emrManagedMasterSecurityGroup, rhs.emrManagedMasterSecurityGroup).append(emrManagedSlaveSecurityGroup, rhs.emrManagedSlaveSecurityGroup).append(ec2SubnetId, rhs.ec2SubnetId).isEquals();
    }

}
