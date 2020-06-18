
package shiver.me.timbers.aws.gamelift;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * Fleet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BuildId",
    "CertificateConfiguration",
    "Description",
    "DesiredEC2Instances",
    "EC2InboundPermissions",
    "EC2InstanceType",
    "FleetType",
    "InstanceRoleARN",
    "LogPaths",
    "MaxSize",
    "MetricGroups",
    "MinSize",
    "Name",
    "NewGameSessionProtectionPolicy",
    "PeerVpcAwsAccountId",
    "PeerVpcId",
    "ResourceCreationLimitPolicy",
    "RuntimeConfiguration",
    "ScriptId",
    "ServerLaunchParameters",
    "ServerLaunchPath"
})
public class Fleet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid
     * 
     */
    @JsonProperty("BuildId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid")
    private CharSequence buildId;
    /**
     * FleetCertificateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html
     * 
     */
    @JsonProperty("CertificateConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html")
    private Property<FleetCertificateConfiguration> certificateConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances
     * 
     */
    @JsonProperty("DesiredEC2Instances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances")
    private Number desiredEC2Instances;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions
     * 
     */
    @JsonProperty("EC2InboundPermissions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions")
    private Set<Property<FleetIpPermission>> eC2InboundPermissions = new LinkedHashSet<Property<FleetIpPermission>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype
     * 
     */
    @JsonProperty("EC2InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype")
    private CharSequence eC2InstanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype
     * 
     */
    @JsonProperty("FleetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype")
    private CharSequence fleetType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn
     * 
     */
    @JsonProperty("InstanceRoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn")
    private CharSequence instanceRoleARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    @JsonProperty("LogPaths")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths")
    private Set<CharSequence> logPaths = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize")
    private Number maxSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups
     * 
     */
    @JsonProperty("MetricGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups")
    private Set<CharSequence> metricGroups = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize
     * 
     */
    @JsonProperty("MinSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize")
    private Number minSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-newgamesessionprotectionpolicy
     * 
     */
    @JsonProperty("NewGameSessionProtectionPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-newgamesessionprotectionpolicy")
    private CharSequence newGameSessionProtectionPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid
     * 
     */
    @JsonProperty("PeerVpcAwsAccountId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid")
    private CharSequence peerVpcAwsAccountId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid
     * 
     */
    @JsonProperty("PeerVpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid")
    private CharSequence peerVpcId;
    /**
     * FleetResourceCreationLimitPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html
     * 
     */
    @JsonProperty("ResourceCreationLimitPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html")
    private Property<FleetResourceCreationLimitPolicy> resourceCreationLimitPolicy;
    /**
     * FleetRuntimeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html
     * 
     */
    @JsonProperty("RuntimeConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html")
    private Property<FleetRuntimeConfiguration> runtimeConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid
     * 
     */
    @JsonProperty("ScriptId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid")
    private CharSequence scriptId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    @JsonProperty("ServerLaunchParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters")
    private CharSequence serverLaunchParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    @JsonProperty("ServerLaunchPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath")
    private CharSequence serverLaunchPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid
     * 
     */
    @JsonIgnore
    public CharSequence getBuildId() {
        return buildId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid
     * 
     */
    @JsonIgnore
    public void setBuildId(CharSequence buildId) {
        this.buildId = buildId;
    }

    public Fleet withBuildId(CharSequence buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * FleetCertificateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<FleetCertificateConfiguration> getCertificateConfiguration() {
        return certificateConfiguration;
    }

    /**
     * FleetCertificateConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html
     * 
     */
    @JsonIgnore
    public void setCertificateConfiguration(Property<FleetCertificateConfiguration> certificateConfiguration) {
        this.certificateConfiguration = certificateConfiguration;
    }

    public Fleet withCertificateConfiguration(Property<FleetCertificateConfiguration> certificateConfiguration) {
        this.certificateConfiguration = certificateConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Fleet withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances
     * 
     */
    @JsonIgnore
    public Number getDesiredEC2Instances() {
        return desiredEC2Instances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances
     * 
     */
    @JsonIgnore
    public void setDesiredEC2Instances(Number desiredEC2Instances) {
        this.desiredEC2Instances = desiredEC2Instances;
    }

    public Fleet withDesiredEC2Instances(Number desiredEC2Instances) {
        this.desiredEC2Instances = desiredEC2Instances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions
     * 
     */
    @JsonIgnore
    public Set<Property<FleetIpPermission>> getEC2InboundPermissions() {
        return eC2InboundPermissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions
     * 
     */
    @JsonIgnore
    public void setEC2InboundPermissions(Set<Property<FleetIpPermission>> eC2InboundPermissions) {
        this.eC2InboundPermissions = eC2InboundPermissions;
    }

    public Fleet withEC2InboundPermissions(Set<Property<FleetIpPermission>> eC2InboundPermissions) {
        this.eC2InboundPermissions = eC2InboundPermissions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getEC2InstanceType() {
        return eC2InstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype
     * 
     */
    @JsonIgnore
    public void setEC2InstanceType(CharSequence eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    public Fleet withEC2InstanceType(CharSequence eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype
     * 
     */
    @JsonIgnore
    public CharSequence getFleetType() {
        return fleetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype
     * 
     */
    @JsonIgnore
    public void setFleetType(CharSequence fleetType) {
        this.fleetType = fleetType;
    }

    public Fleet withFleetType(CharSequence fleetType) {
        this.fleetType = fleetType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceRoleARN() {
        return instanceRoleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn
     * 
     */
    @JsonIgnore
    public void setInstanceRoleARN(CharSequence instanceRoleARN) {
        this.instanceRoleARN = instanceRoleARN;
    }

    public Fleet withInstanceRoleARN(CharSequence instanceRoleARN) {
        this.instanceRoleARN = instanceRoleARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getLogPaths() {
        return logPaths;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths
     * 
     */
    @JsonIgnore
    public void setLogPaths(Set<CharSequence> logPaths) {
        this.logPaths = logPaths;
    }

    public Fleet withLogPaths(Set<CharSequence> logPaths) {
        this.logPaths = logPaths;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize
     * 
     */
    @JsonIgnore
    public Number getMaxSize() {
        return maxSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize
     * 
     */
    @JsonIgnore
    public void setMaxSize(Number maxSize) {
        this.maxSize = maxSize;
    }

    public Fleet withMaxSize(Number maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getMetricGroups() {
        return metricGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups
     * 
     */
    @JsonIgnore
    public void setMetricGroups(Set<CharSequence> metricGroups) {
        this.metricGroups = metricGroups;
    }

    public Fleet withMetricGroups(Set<CharSequence> metricGroups) {
        this.metricGroups = metricGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize
     * 
     */
    @JsonIgnore
    public Number getMinSize() {
        return minSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize
     * 
     */
    @JsonIgnore
    public void setMinSize(Number minSize) {
        this.minSize = minSize;
    }

    public Fleet withMinSize(Number minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Fleet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-newgamesessionprotectionpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getNewGameSessionProtectionPolicy() {
        return newGameSessionProtectionPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-newgamesessionprotectionpolicy
     * 
     */
    @JsonIgnore
    public void setNewGameSessionProtectionPolicy(CharSequence newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
    }

    public Fleet withNewGameSessionProtectionPolicy(CharSequence newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid
     * 
     */
    @JsonIgnore
    public CharSequence getPeerVpcAwsAccountId() {
        return peerVpcAwsAccountId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid
     * 
     */
    @JsonIgnore
    public void setPeerVpcAwsAccountId(CharSequence peerVpcAwsAccountId) {
        this.peerVpcAwsAccountId = peerVpcAwsAccountId;
    }

    public Fleet withPeerVpcAwsAccountId(CharSequence peerVpcAwsAccountId) {
        this.peerVpcAwsAccountId = peerVpcAwsAccountId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid
     * 
     */
    @JsonIgnore
    public CharSequence getPeerVpcId() {
        return peerVpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid
     * 
     */
    @JsonIgnore
    public void setPeerVpcId(CharSequence peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    public Fleet withPeerVpcId(CharSequence peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    /**
     * FleetResourceCreationLimitPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html
     * 
     */
    @JsonIgnore
    public Property<FleetResourceCreationLimitPolicy> getResourceCreationLimitPolicy() {
        return resourceCreationLimitPolicy;
    }

    /**
     * FleetResourceCreationLimitPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html
     * 
     */
    @JsonIgnore
    public void setResourceCreationLimitPolicy(Property<FleetResourceCreationLimitPolicy> resourceCreationLimitPolicy) {
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
    }

    public Fleet withResourceCreationLimitPolicy(Property<FleetResourceCreationLimitPolicy> resourceCreationLimitPolicy) {
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
        return this;
    }

    /**
     * FleetRuntimeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<FleetRuntimeConfiguration> getRuntimeConfiguration() {
        return runtimeConfiguration;
    }

    /**
     * FleetRuntimeConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html
     * 
     */
    @JsonIgnore
    public void setRuntimeConfiguration(Property<FleetRuntimeConfiguration> runtimeConfiguration) {
        this.runtimeConfiguration = runtimeConfiguration;
    }

    public Fleet withRuntimeConfiguration(Property<FleetRuntimeConfiguration> runtimeConfiguration) {
        this.runtimeConfiguration = runtimeConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid
     * 
     */
    @JsonIgnore
    public CharSequence getScriptId() {
        return scriptId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid
     * 
     */
    @JsonIgnore
    public void setScriptId(CharSequence scriptId) {
        this.scriptId = scriptId;
    }

    public Fleet withScriptId(CharSequence scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    @JsonIgnore
    public CharSequence getServerLaunchParameters() {
        return serverLaunchParameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters
     * 
     */
    @JsonIgnore
    public void setServerLaunchParameters(CharSequence serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    public Fleet withServerLaunchParameters(CharSequence serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    @JsonIgnore
    public CharSequence getServerLaunchPath() {
        return serverLaunchPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath
     * 
     */
    @JsonIgnore
    public void setServerLaunchPath(CharSequence serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    public Fleet withServerLaunchPath(CharSequence serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("buildId", buildId).append("certificateConfiguration", certificateConfiguration).append("description", description).append("desiredEC2Instances", desiredEC2Instances).append("eC2InboundPermissions", eC2InboundPermissions).append("eC2InstanceType", eC2InstanceType).append("fleetType", fleetType).append("instanceRoleARN", instanceRoleARN).append("logPaths", logPaths).append("maxSize", maxSize).append("metricGroups", metricGroups).append("minSize", minSize).append("name", name).append("newGameSessionProtectionPolicy", newGameSessionProtectionPolicy).append("peerVpcAwsAccountId", peerVpcAwsAccountId).append("peerVpcId", peerVpcId).append("resourceCreationLimitPolicy", resourceCreationLimitPolicy).append("runtimeConfiguration", runtimeConfiguration).append("scriptId", scriptId).append("serverLaunchParameters", serverLaunchParameters).append("serverLaunchPath", serverLaunchPath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logPaths).append(instanceRoleARN).append(metricGroups).append(desiredEC2Instances).append(eC2InstanceType).append(eC2InboundPermissions).append(certificateConfiguration).append(description).append(buildId).append(maxSize).append(scriptId).append(fleetType).append(newGameSessionProtectionPolicy).append(serverLaunchPath).append(runtimeConfiguration).append(peerVpcId).append(name).append(resourceCreationLimitPolicy).append(serverLaunchParameters).append(minSize).append(peerVpcAwsAccountId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fleet) == false) {
            return false;
        }
        Fleet rhs = ((Fleet) other);
        return new EqualsBuilder().append(logPaths, rhs.logPaths).append(instanceRoleARN, rhs.instanceRoleARN).append(metricGroups, rhs.metricGroups).append(desiredEC2Instances, rhs.desiredEC2Instances).append(eC2InstanceType, rhs.eC2InstanceType).append(eC2InboundPermissions, rhs.eC2InboundPermissions).append(certificateConfiguration, rhs.certificateConfiguration).append(description, rhs.description).append(buildId, rhs.buildId).append(maxSize, rhs.maxSize).append(scriptId, rhs.scriptId).append(fleetType, rhs.fleetType).append(newGameSessionProtectionPolicy, rhs.newGameSessionProtectionPolicy).append(serverLaunchPath, rhs.serverLaunchPath).append(runtimeConfiguration, rhs.runtimeConfiguration).append(peerVpcId, rhs.peerVpcId).append(name, rhs.name).append(resourceCreationLimitPolicy, rhs.resourceCreationLimitPolicy).append(serverLaunchParameters, rhs.serverLaunchParameters).append(minSize, rhs.minSize).append(peerVpcAwsAccountId, rhs.peerVpcAwsAccountId).isEquals();
    }

}
