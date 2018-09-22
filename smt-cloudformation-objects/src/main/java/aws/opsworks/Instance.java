
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
    private String agentVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid
     * 
     */
    @JsonProperty("AmiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid")
    private String amiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture
     * 
     */
    @JsonProperty("Architecture")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture")
    private String architecture;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype
     * 
     */
    @JsonProperty("AutoScalingType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype")
    private String autoScalingType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone")
    private String availabilityZone;
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
    private Set<String> elasticIps = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname
     * 
     */
    @JsonProperty("Hostname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname")
    private String hostname;
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
    private String instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids
     * 
     */
    @JsonProperty("LayerIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids")
    private List<String> layerIds = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os
     * 
     */
    @JsonProperty("Os")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os")
    private String os;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype
     * 
     */
    @JsonProperty("RootDeviceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype")
    private String rootDeviceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname
     * 
     */
    @JsonProperty("SshKeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname")
    private String sshKeyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid
     * 
     */
    @JsonProperty("StackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid")
    private String stackId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid")
    private String subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy")
    private String tenancy;
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
    private String virtualizationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes
     * 
     */
    @JsonProperty("Volumes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes")
    private Set<String> volumes = new LinkedHashSet<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion
     * 
     */
    @JsonProperty("AgentVersion")
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion
     * 
     */
    @JsonProperty("AgentVersion")
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Instance withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid
     * 
     */
    @JsonProperty("AmiId")
    public String getAmiId() {
        return amiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid
     * 
     */
    @JsonProperty("AmiId")
    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    public Instance withAmiId(String amiId) {
        this.amiId = amiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture
     * 
     */
    @JsonProperty("Architecture")
    public String getArchitecture() {
        return architecture;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture
     * 
     */
    @JsonProperty("Architecture")
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public Instance withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype
     * 
     */
    @JsonProperty("AutoScalingType")
    public String getAutoScalingType() {
        return autoScalingType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype
     * 
     */
    @JsonProperty("AutoScalingType")
    public void setAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
    }

    public Instance withAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Instance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public Set<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
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
    @JsonProperty("EbsOptimized")
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
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
    @JsonProperty("ElasticIps")
    public Set<String> getElasticIps() {
        return elasticIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips
     * 
     */
    @JsonProperty("ElasticIps")
    public void setElasticIps(Set<String> elasticIps) {
        this.elasticIps = elasticIps;
    }

    public Instance withElasticIps(Set<String> elasticIps) {
        this.elasticIps = elasticIps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname
     * 
     */
    @JsonProperty("Hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname
     * 
     */
    @JsonProperty("Hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Instance withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot
     * 
     */
    @JsonProperty("InstallUpdatesOnBoot")
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot
     * 
     */
    @JsonProperty("InstallUpdatesOnBoot")
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
    @JsonProperty("InstanceType")
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Instance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids
     * 
     */
    @JsonProperty("LayerIds")
    public List<String> getLayerIds() {
        return layerIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids
     * 
     */
    @JsonProperty("LayerIds")
    public void setLayerIds(List<String> layerIds) {
        this.layerIds = layerIds;
    }

    public Instance withLayerIds(List<String> layerIds) {
        this.layerIds = layerIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os
     * 
     */
    @JsonProperty("Os")
    public String getOs() {
        return os;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os
     * 
     */
    @JsonProperty("Os")
    public void setOs(String os) {
        this.os = os;
    }

    public Instance withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype
     * 
     */
    @JsonProperty("RootDeviceType")
    public String getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype
     * 
     */
    @JsonProperty("RootDeviceType")
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    public Instance withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname
     * 
     */
    @JsonProperty("SshKeyName")
    public String getSshKeyName() {
        return sshKeyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname
     * 
     */
    @JsonProperty("SshKeyName")
    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }

    public Instance withSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid
     * 
     */
    @JsonProperty("StackId")
    public String getStackId() {
        return stackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid
     * 
     */
    @JsonProperty("StackId")
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public Instance withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Instance withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    public String getTenancy() {
        return tenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    public Instance withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * TimeBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html
     * 
     */
    @JsonProperty("TimeBasedAutoScaling")
    public TimeBasedAutoScaling getTimeBasedAutoScaling() {
        return timeBasedAutoScaling;
    }

    /**
     * TimeBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html
     * 
     */
    @JsonProperty("TimeBasedAutoScaling")
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
    @JsonProperty("VirtualizationType")
    public String getVirtualizationType() {
        return virtualizationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype
     * 
     */
    @JsonProperty("VirtualizationType")
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    public Instance withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes
     * 
     */
    @JsonProperty("Volumes")
    public Set<String> getVolumes() {
        return volumes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes
     * 
     */
    @JsonProperty("Volumes")
    public void setVolumes(Set<String> volumes) {
        this.volumes = volumes;
    }

    public Instance withVolumes(Set<String> volumes) {
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
