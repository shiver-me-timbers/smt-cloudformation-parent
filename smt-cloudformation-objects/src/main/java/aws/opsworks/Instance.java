
package aws.opsworks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
 * Instance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AgentVersion",
    "AmiId",
    "Architecture",
    "AutoScalingType",
    "AvailabilityZone",
    "BlockDeviceMappings",
    "EbsOptimized",
    "ElasticIps",
    "Hostname",
    "InstallUpdatesOnBoot",
    "InstanceType",
    "LayerIds",
    "Os",
    "RootDeviceType",
    "SshKeyName",
    "StackId",
    "SubnetId",
    "Tenancy",
    "TimeBasedAutoScaling",
    "VirtualizationType",
    "Volumes"
})
public class Instance {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion
     * 
     */
    @JsonProperty("AgentVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion")
    private CharSequence agentVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid
     * 
     */
    @JsonProperty("AmiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid")
    private CharSequence amiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture
     * 
     */
    @JsonProperty("Architecture")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture")
    private CharSequence architecture;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype
     * 
     */
    @JsonProperty("AutoScalingType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype")
    private CharSequence autoScalingType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings")
    private Set<BlockDeviceMapping> blockDeviceMappings = new LinkedHashSet<BlockDeviceMapping>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized")
    private Boolean ebsOptimized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips
     * 
     */
    @JsonProperty("ElasticIps")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips")
    private Set<CharSequence> elasticIps = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname
     * 
     */
    @JsonProperty("Hostname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname")
    private CharSequence hostname;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot
     * 
     */
    @JsonProperty("InstallUpdatesOnBoot")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot")
    private Boolean installUpdatesOnBoot;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids
     * 
     */
    @JsonProperty("LayerIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids")
    private List<CharSequence> layerIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os
     * 
     */
    @JsonProperty("Os")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os")
    private CharSequence os;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype
     * 
     */
    @JsonProperty("RootDeviceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype")
    private CharSequence rootDeviceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname
     * 
     */
    @JsonProperty("SshKeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname")
    private CharSequence sshKeyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid
     * 
     */
    @JsonProperty("StackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid")
    private CharSequence stackId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid")
    private CharSequence subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy")
    private CharSequence tenancy;
    /**
     * TimeBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html
     * 
     */
    @JsonProperty("TimeBasedAutoScaling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html")
    private TimeBasedAutoScaling timeBasedAutoScaling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype
     * 
     */
    @JsonProperty("VirtualizationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype")
    private CharSequence virtualizationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes
     * 
     */
    @JsonProperty("Volumes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes")
    private Set<CharSequence> volumes = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion
     * 
     */
    public CharSequence getAgentVersion() {
        return agentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion
     * 
     */
    public void setAgentVersion(CharSequence agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Instance withAgentVersion(CharSequence agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid
     * 
     */
    public CharSequence getAmiId() {
        return amiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid
     * 
     */
    public void setAmiId(CharSequence amiId) {
        this.amiId = amiId;
    }

    public Instance withAmiId(CharSequence amiId) {
        this.amiId = amiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture
     * 
     */
    public CharSequence getArchitecture() {
        return architecture;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture
     * 
     */
    public void setArchitecture(CharSequence architecture) {
        this.architecture = architecture;
    }

    public Instance withArchitecture(CharSequence architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype
     * 
     */
    public CharSequence getAutoScalingType() {
        return autoScalingType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype
     * 
     */
    public void setAutoScalingType(CharSequence autoScalingType) {
        this.autoScalingType = autoScalingType;
    }

    public Instance withAutoScalingType(CharSequence autoScalingType) {
        this.autoScalingType = autoScalingType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone
     * 
     */
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone
     * 
     */
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Instance withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings
     * 
     */
    public Set<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings
     * 
     */
    public void setBlockDeviceMappings(Set<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public Instance withBlockDeviceMappings(Set<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized
     * 
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized
     * 
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public Instance withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips
     * 
     */
    public Set<CharSequence> getElasticIps() {
        return elasticIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips
     * 
     */
    public void setElasticIps(Set<CharSequence> elasticIps) {
        this.elasticIps = elasticIps;
    }

    public Instance withElasticIps(Set<CharSequence> elasticIps) {
        this.elasticIps = elasticIps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname
     * 
     */
    public CharSequence getHostname() {
        return hostname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname
     * 
     */
    public void setHostname(CharSequence hostname) {
        this.hostname = hostname;
    }

    public Instance withHostname(CharSequence hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot
     * 
     */
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot
     * 
     */
    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }

    public Instance withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype
     * 
     */
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype
     * 
     */
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public Instance withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids
     * 
     */
    public List<CharSequence> getLayerIds() {
        return layerIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids
     * 
     */
    public void setLayerIds(List<CharSequence> layerIds) {
        this.layerIds = layerIds;
    }

    public Instance withLayerIds(List<CharSequence> layerIds) {
        this.layerIds = layerIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os
     * 
     */
    public CharSequence getOs() {
        return os;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os
     * 
     */
    public void setOs(CharSequence os) {
        this.os = os;
    }

    public Instance withOs(CharSequence os) {
        this.os = os;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype
     * 
     */
    public CharSequence getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype
     * 
     */
    public void setRootDeviceType(CharSequence rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    public Instance withRootDeviceType(CharSequence rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname
     * 
     */
    public CharSequence getSshKeyName() {
        return sshKeyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname
     * 
     */
    public void setSshKeyName(CharSequence sshKeyName) {
        this.sshKeyName = sshKeyName;
    }

    public Instance withSshKeyName(CharSequence sshKeyName) {
        this.sshKeyName = sshKeyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid
     * 
     */
    public CharSequence getStackId() {
        return stackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid
     * 
     */
    public void setStackId(CharSequence stackId) {
        this.stackId = stackId;
    }

    public Instance withStackId(CharSequence stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid
     * 
     */
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid
     * 
     */
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public Instance withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy
     * 
     */
    public CharSequence getTenancy() {
        return tenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy
     * 
     */
    public void setTenancy(CharSequence tenancy) {
        this.tenancy = tenancy;
    }

    public Instance withTenancy(CharSequence tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * TimeBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html
     * 
     */
    public TimeBasedAutoScaling getTimeBasedAutoScaling() {
        return timeBasedAutoScaling;
    }

    /**
     * TimeBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html
     * 
     */
    public void setTimeBasedAutoScaling(TimeBasedAutoScaling timeBasedAutoScaling) {
        this.timeBasedAutoScaling = timeBasedAutoScaling;
    }

    public Instance withTimeBasedAutoScaling(TimeBasedAutoScaling timeBasedAutoScaling) {
        this.timeBasedAutoScaling = timeBasedAutoScaling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype
     * 
     */
    public CharSequence getVirtualizationType() {
        return virtualizationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype
     * 
     */
    public void setVirtualizationType(CharSequence virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    public Instance withVirtualizationType(CharSequence virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes
     * 
     */
    public Set<CharSequence> getVolumes() {
        return volumes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes
     * 
     */
    public void setVolumes(Set<CharSequence> volumes) {
        this.volumes = volumes;
    }

    public Instance withVolumes(Set<CharSequence> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("agentVersion", agentVersion).append("amiId", amiId).append("architecture", architecture).append("autoScalingType", autoScalingType).append("availabilityZone", availabilityZone).append("blockDeviceMappings", blockDeviceMappings).append("ebsOptimized", ebsOptimized).append("elasticIps", elasticIps).append("hostname", hostname).append("installUpdatesOnBoot", installUpdatesOnBoot).append("instanceType", instanceType).append("layerIds", layerIds).append("os", os).append("rootDeviceType", rootDeviceType).append("sshKeyName", sshKeyName).append("stackId", stackId).append("subnetId", subnetId).append("tenancy", tenancy).append("timeBasedAutoScaling", timeBasedAutoScaling).append("virtualizationType", virtualizationType).append("volumes", volumes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(ebsOptimized).append(virtualizationType).append(autoScalingType).append(blockDeviceMappings).append(installUpdatesOnBoot).append(os).append(timeBasedAutoScaling).append(instanceType).append(stackId).append(elasticIps).append(tenancy).append(volumes).append(availabilityZone).append(rootDeviceType).append(amiId).append(hostname).append(sshKeyName).append(agentVersion).append(layerIds).append(architecture).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Instance) == false) {
            return false;
        }
        Instance rhs = ((Instance) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(ebsOptimized, rhs.ebsOptimized).append(virtualizationType, rhs.virtualizationType).append(autoScalingType, rhs.autoScalingType).append(blockDeviceMappings, rhs.blockDeviceMappings).append(installUpdatesOnBoot, rhs.installUpdatesOnBoot).append(os, rhs.os).append(timeBasedAutoScaling, rhs.timeBasedAutoScaling).append(instanceType, rhs.instanceType).append(stackId, rhs.stackId).append(elasticIps, rhs.elasticIps).append(tenancy, rhs.tenancy).append(volumes, rhs.volumes).append(availabilityZone, rhs.availabilityZone).append(rootDeviceType, rhs.rootDeviceType).append(amiId, rhs.amiId).append(hostname, rhs.hostname).append(sshKeyName, rhs.sshKeyName).append(agentVersion, rhs.agentVersion).append(layerIds, rhs.layerIds).append(architecture, rhs.architecture).isEquals();
    }

}
