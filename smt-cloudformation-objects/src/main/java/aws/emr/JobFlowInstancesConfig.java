
package aws.emr;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * JobFlowInstancesConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AdditionalMasterSecurityGroups",
    "AdditionalSlaveSecurityGroups",
    "CoreInstanceFleet",
    "CoreInstanceGroup",
    "Ec2KeyName",
    "Ec2SubnetId",
    "EmrManagedMasterSecurityGroup",
    "EmrManagedSlaveSecurityGroup",
    "HadoopVersion",
    "MasterInstanceFleet",
    "MasterInstanceGroup",
    "Placement",
    "ServiceAccessSecurityGroup",
    "TerminationProtected"
})
public class JobFlowInstancesConfig {

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
     * InstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    @JsonProperty("CoreInstanceFleet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html")
    private InstanceFleetConfig coreInstanceFleet;
    /**
     * InstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    @JsonProperty("CoreInstanceGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html")
    private InstanceGroupConfig coreInstanceGroup;
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
     * InstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    @JsonProperty("MasterInstanceFleet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html")
    private InstanceFleetConfig masterInstanceFleet;
    /**
     * InstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    @JsonProperty("MasterInstanceGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html")
    private InstanceGroupConfig masterInstanceGroup;
    /**
     * PlacementType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html
     * 
     */
    @JsonProperty("Placement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html")
    private PlacementType placement;
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
    private Boolean terminationProtected;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups
     * 
     */
    public Set<CharSequence> getAdditionalMasterSecurityGroups() {
        return additionalMasterSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalmastersecuritygroups
     * 
     */
    public void setAdditionalMasterSecurityGroups(Set<CharSequence> additionalMasterSecurityGroups) {
        this.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
    }

    public JobFlowInstancesConfig withAdditionalMasterSecurityGroups(Set<CharSequence> additionalMasterSecurityGroups) {
        this.additionalMasterSecurityGroups = additionalMasterSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups
     * 
     */
    public Set<CharSequence> getAdditionalSlaveSecurityGroups() {
        return additionalSlaveSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-additionalslavesecuritygroups
     * 
     */
    public void setAdditionalSlaveSecurityGroups(Set<CharSequence> additionalSlaveSecurityGroups) {
        this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
    }

    public JobFlowInstancesConfig withAdditionalSlaveSecurityGroups(Set<CharSequence> additionalSlaveSecurityGroups) {
        this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroups;
        return this;
    }

    /**
     * InstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    public InstanceFleetConfig getCoreInstanceFleet() {
        return coreInstanceFleet;
    }

    /**
     * InstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    public void setCoreInstanceFleet(InstanceFleetConfig coreInstanceFleet) {
        this.coreInstanceFleet = coreInstanceFleet;
    }

    public JobFlowInstancesConfig withCoreInstanceFleet(InstanceFleetConfig coreInstanceFleet) {
        this.coreInstanceFleet = coreInstanceFleet;
        return this;
    }

    /**
     * InstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    public InstanceGroupConfig getCoreInstanceGroup() {
        return coreInstanceGroup;
    }

    /**
     * InstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    public void setCoreInstanceGroup(InstanceGroupConfig coreInstanceGroup) {
        this.coreInstanceGroup = coreInstanceGroup;
    }

    public JobFlowInstancesConfig withCoreInstanceGroup(InstanceGroupConfig coreInstanceGroup) {
        this.coreInstanceGroup = coreInstanceGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname
     * 
     */
    public CharSequence getEc2KeyName() {
        return ec2KeyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2keyname
     * 
     */
    public void setEc2KeyName(CharSequence ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    public JobFlowInstancesConfig withEc2KeyName(CharSequence ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid
     * 
     */
    public CharSequence getEc2SubnetId() {
        return ec2SubnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-ec2subnetid
     * 
     */
    public void setEc2SubnetId(CharSequence ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }

    public JobFlowInstancesConfig withEc2SubnetId(CharSequence ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup
     * 
     */
    public CharSequence getEmrManagedMasterSecurityGroup() {
        return emrManagedMasterSecurityGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedmastersecuritygroup
     * 
     */
    public void setEmrManagedMasterSecurityGroup(CharSequence emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
    }

    public JobFlowInstancesConfig withEmrManagedMasterSecurityGroup(CharSequence emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup
     * 
     */
    public CharSequence getEmrManagedSlaveSecurityGroup() {
        return emrManagedSlaveSecurityGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-emrmanagedslavesecuritygroup
     * 
     */
    public void setEmrManagedSlaveSecurityGroup(CharSequence emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
    }

    public JobFlowInstancesConfig withEmrManagedSlaveSecurityGroup(CharSequence emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion
     * 
     */
    public CharSequence getHadoopVersion() {
        return hadoopVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-hadoopversion
     * 
     */
    public void setHadoopVersion(CharSequence hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }

    public JobFlowInstancesConfig withHadoopVersion(CharSequence hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
        return this;
    }

    /**
     * InstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    public InstanceFleetConfig getMasterInstanceFleet() {
        return masterInstanceFleet;
    }

    /**
     * InstanceFleetConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetconfig.html
     * 
     */
    public void setMasterInstanceFleet(InstanceFleetConfig masterInstanceFleet) {
        this.masterInstanceFleet = masterInstanceFleet;
    }

    public JobFlowInstancesConfig withMasterInstanceFleet(InstanceFleetConfig masterInstanceFleet) {
        this.masterInstanceFleet = masterInstanceFleet;
        return this;
    }

    /**
     * InstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    public InstanceGroupConfig getMasterInstanceGroup() {
        return masterInstanceGroup;
    }

    /**
     * InstanceGroupConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancegroupconfig.html
     * 
     */
    public void setMasterInstanceGroup(InstanceGroupConfig masterInstanceGroup) {
        this.masterInstanceGroup = masterInstanceGroup;
    }

    public JobFlowInstancesConfig withMasterInstanceGroup(InstanceGroupConfig masterInstanceGroup) {
        this.masterInstanceGroup = masterInstanceGroup;
        return this;
    }

    /**
     * PlacementType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html
     * 
     */
    public PlacementType getPlacement() {
        return placement;
    }

    /**
     * PlacementType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-placementtype.html
     * 
     */
    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }

    public JobFlowInstancesConfig withPlacement(PlacementType placement) {
        this.placement = placement;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup
     * 
     */
    public CharSequence getServiceAccessSecurityGroup() {
        return serviceAccessSecurityGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-serviceaccesssecuritygroup
     * 
     */
    public void setServiceAccessSecurityGroup(CharSequence serviceAccessSecurityGroup) {
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
    }

    public JobFlowInstancesConfig withServiceAccessSecurityGroup(CharSequence serviceAccessSecurityGroup) {
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected
     * 
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-jobflowinstancesconfig.html#cfn-elasticmapreduce-cluster-jobflowinstancesconfig-terminationprotected
     * 
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    public JobFlowInstancesConfig withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalMasterSecurityGroups", additionalMasterSecurityGroups).append("additionalSlaveSecurityGroups", additionalSlaveSecurityGroups).append("coreInstanceFleet", coreInstanceFleet).append("coreInstanceGroup", coreInstanceGroup).append("ec2KeyName", ec2KeyName).append("ec2SubnetId", ec2SubnetId).append("emrManagedMasterSecurityGroup", emrManagedMasterSecurityGroup).append("emrManagedSlaveSecurityGroup", emrManagedSlaveSecurityGroup).append("hadoopVersion", hadoopVersion).append("masterInstanceFleet", masterInstanceFleet).append("masterInstanceGroup", masterInstanceGroup).append("placement", placement).append("serviceAccessSecurityGroup", serviceAccessSecurityGroup).append("terminationProtected", terminationProtected).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(coreInstanceFleet).append(coreInstanceGroup).append(serviceAccessSecurityGroup).append(hadoopVersion).append(additionalMasterSecurityGroups).append(ec2KeyName).append(masterInstanceFleet).append(terminationProtected).append(additionalSlaveSecurityGroups).append(masterInstanceGroup).append(placement).append(emrManagedMasterSecurityGroup).append(emrManagedSlaveSecurityGroup).append(ec2SubnetId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobFlowInstancesConfig) == false) {
            return false;
        }
        JobFlowInstancesConfig rhs = ((JobFlowInstancesConfig) other);
        return new EqualsBuilder().append(coreInstanceFleet, rhs.coreInstanceFleet).append(coreInstanceGroup, rhs.coreInstanceGroup).append(serviceAccessSecurityGroup, rhs.serviceAccessSecurityGroup).append(hadoopVersion, rhs.hadoopVersion).append(additionalMasterSecurityGroups, rhs.additionalMasterSecurityGroups).append(ec2KeyName, rhs.ec2KeyName).append(masterInstanceFleet, rhs.masterInstanceFleet).append(terminationProtected, rhs.terminationProtected).append(additionalSlaveSecurityGroups, rhs.additionalSlaveSecurityGroups).append(masterInstanceGroup, rhs.masterInstanceGroup).append(placement, rhs.placement).append(emrManagedMasterSecurityGroup, rhs.emrManagedMasterSecurityGroup).append(emrManagedSlaveSecurityGroup, rhs.emrManagedSlaveSecurityGroup).append(ec2SubnetId, rhs.ec2SubnetId).isEquals();
    }

}
