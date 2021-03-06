
package shiver.me.timbers.aws.opsworks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
import shiver.me.timbers.aws.Tag;


/**
 * Stack
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AgentVersion",
    "Attributes",
    "ChefConfiguration",
    "CloneAppIds",
    "ClonePermissions",
    "ConfigurationManager",
    "CustomCookbooksSource",
    "CustomJson",
    "DefaultAvailabilityZone",
    "DefaultInstanceProfileArn",
    "DefaultOs",
    "DefaultRootDeviceType",
    "DefaultSshKeyName",
    "DefaultSubnetId",
    "EcsClusterArn",
    "ElasticIps",
    "HostnameTheme",
    "Name",
    "RdsDbInstances",
    "ServiceRoleArn",
    "SourceStackId",
    "Tags",
    "UseCustomCookbooks",
    "UseOpsworksSecurityGroups",
    "VpcId"
})
public class Stack {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion
     * 
     */
    @JsonProperty("AgentVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion")
    private CharSequence agentVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes")
    private Map<String, CharSequence> attributes;
    /**
     * StackChefConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
     * 
     */
    @JsonProperty("ChefConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html")
    private Property<StackChefConfiguration> chefConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids
     * 
     */
    @JsonProperty("CloneAppIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids")
    private Set<CharSequence> cloneAppIds = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions
     * 
     */
    @JsonProperty("ClonePermissions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions")
    private CharSequence clonePermissions;
    /**
     * StackStackConfigurationManager
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html
     * 
     */
    @JsonProperty("ConfigurationManager")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html")
    private Property<StackStackConfigurationManager> configurationManager;
    /**
     * StackSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html
     * 
     */
    @JsonProperty("CustomCookbooksSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html")
    private Property<StackSource> customCookbooksSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson
     * 
     */
    @JsonProperty("CustomJson")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson")
    private Object customJson;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz
     * 
     */
    @JsonProperty("DefaultAvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz")
    private CharSequence defaultAvailabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof
     * 
     */
    @JsonProperty("DefaultInstanceProfileArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof")
    private CharSequence defaultInstanceProfileArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos
     * 
     */
    @JsonProperty("DefaultOs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos")
    private CharSequence defaultOs;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype
     * 
     */
    @JsonProperty("DefaultRootDeviceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype")
    private CharSequence defaultRootDeviceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname
     * 
     */
    @JsonProperty("DefaultSshKeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname")
    private CharSequence defaultSshKeyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet
     * 
     */
    @JsonProperty("DefaultSubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet")
    private CharSequence defaultSubnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn
     * 
     */
    @JsonProperty("EcsClusterArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn")
    private CharSequence ecsClusterArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips
     * 
     */
    @JsonProperty("ElasticIps")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips")
    private Set<Property<StackElasticIp>> elasticIps = new LinkedHashSet<Property<StackElasticIp>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme
     * 
     */
    @JsonProperty("HostnameTheme")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme")
    private CharSequence hostnameTheme;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances
     * 
     */
    @JsonProperty("RdsDbInstances")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances")
    private Set<Property<StackRdsDbInstance>> rdsDbInstances = new LinkedHashSet<Property<StackRdsDbInstance>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn")
    private CharSequence serviceRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid
     * 
     */
    @JsonProperty("SourceStackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid")
    private CharSequence sourceStackId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks
     * 
     */
    @JsonProperty("UseCustomCookbooks")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks")
    private CharSequence useCustomCookbooks;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups
     * 
     */
    @JsonProperty("UseOpsworksSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups")
    private CharSequence useOpsworksSecurityGroups;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion
     * 
     */
    @JsonIgnore
    public CharSequence getAgentVersion() {
        return agentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion
     * 
     */
    @JsonIgnore
    public void setAgentVersion(CharSequence agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Stack withAgentVersion(CharSequence agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes
     * 
     */
    @JsonIgnore
    public void setAttributes(Map<String, CharSequence> attributes) {
        this.attributes = attributes;
    }

    public Stack withAttributes(Map<String, CharSequence> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * StackChefConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<StackChefConfiguration> getChefConfiguration() {
        return chefConfiguration;
    }

    /**
     * StackChefConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
     * 
     */
    @JsonIgnore
    public void setChefConfiguration(Property<StackChefConfiguration> chefConfiguration) {
        this.chefConfiguration = chefConfiguration;
    }

    public Stack withChefConfiguration(Property<StackChefConfiguration> chefConfiguration) {
        this.chefConfiguration = chefConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getCloneAppIds() {
        return cloneAppIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids
     * 
     */
    @JsonIgnore
    public void setCloneAppIds(Set<CharSequence> cloneAppIds) {
        this.cloneAppIds = cloneAppIds;
    }

    public Stack withCloneAppIds(Set<CharSequence> cloneAppIds) {
        this.cloneAppIds = cloneAppIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions
     * 
     */
    @JsonIgnore
    public CharSequence getClonePermissions() {
        return clonePermissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions
     * 
     */
    @JsonIgnore
    public void setClonePermissions(CharSequence clonePermissions) {
        this.clonePermissions = clonePermissions;
    }

    public Stack withClonePermissions(CharSequence clonePermissions) {
        this.clonePermissions = clonePermissions;
        return this;
    }

    /**
     * StackStackConfigurationManager
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html
     * 
     */
    @JsonIgnore
    public Property<StackStackConfigurationManager> getConfigurationManager() {
        return configurationManager;
    }

    /**
     * StackStackConfigurationManager
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html
     * 
     */
    @JsonIgnore
    public void setConfigurationManager(Property<StackStackConfigurationManager> configurationManager) {
        this.configurationManager = configurationManager;
    }

    public Stack withConfigurationManager(Property<StackStackConfigurationManager> configurationManager) {
        this.configurationManager = configurationManager;
        return this;
    }

    /**
     * StackSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html
     * 
     */
    @JsonIgnore
    public Property<StackSource> getCustomCookbooksSource() {
        return customCookbooksSource;
    }

    /**
     * StackSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-source.html
     * 
     */
    @JsonIgnore
    public void setCustomCookbooksSource(Property<StackSource> customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
    }

    public Stack withCustomCookbooksSource(Property<StackSource> customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson
     * 
     */
    @JsonIgnore
    public Object getCustomJson() {
        return customJson;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson
     * 
     */
    @JsonIgnore
    public void setCustomJson(Object customJson) {
        this.customJson = customJson;
    }

    public Stack withCustomJson(Object customJson) {
        this.customJson = customJson;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultAvailabilityZone() {
        return defaultAvailabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz
     * 
     */
    @JsonIgnore
    public void setDefaultAvailabilityZone(CharSequence defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }

    public Stack withDefaultAvailabilityZone(CharSequence defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultInstanceProfileArn() {
        return defaultInstanceProfileArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof
     * 
     */
    @JsonIgnore
    public void setDefaultInstanceProfileArn(CharSequence defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
    }

    public Stack withDefaultInstanceProfileArn(CharSequence defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultOs() {
        return defaultOs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos
     * 
     */
    @JsonIgnore
    public void setDefaultOs(CharSequence defaultOs) {
        this.defaultOs = defaultOs;
    }

    public Stack withDefaultOs(CharSequence defaultOs) {
        this.defaultOs = defaultOs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultRootDeviceType() {
        return defaultRootDeviceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype
     * 
     */
    @JsonIgnore
    public void setDefaultRootDeviceType(CharSequence defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
    }

    public Stack withDefaultRootDeviceType(CharSequence defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultSshKeyName() {
        return defaultSshKeyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname
     * 
     */
    @JsonIgnore
    public void setDefaultSshKeyName(CharSequence defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
    }

    public Stack withDefaultSshKeyName(CharSequence defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultSubnetId() {
        return defaultSubnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet
     * 
     */
    @JsonIgnore
    public void setDefaultSubnetId(CharSequence defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
    }

    public Stack withDefaultSubnetId(CharSequence defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn
     * 
     */
    @JsonIgnore
    public CharSequence getEcsClusterArn() {
        return ecsClusterArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn
     * 
     */
    @JsonIgnore
    public void setEcsClusterArn(CharSequence ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }

    public Stack withEcsClusterArn(CharSequence ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips
     * 
     */
    @JsonIgnore
    public Set<Property<StackElasticIp>> getElasticIps() {
        return elasticIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips
     * 
     */
    @JsonIgnore
    public void setElasticIps(Set<Property<StackElasticIp>> elasticIps) {
        this.elasticIps = elasticIps;
    }

    public Stack withElasticIps(Set<Property<StackElasticIp>> elasticIps) {
        this.elasticIps = elasticIps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme
     * 
     */
    @JsonIgnore
    public CharSequence getHostnameTheme() {
        return hostnameTheme;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme
     * 
     */
    @JsonIgnore
    public void setHostnameTheme(CharSequence hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
    }

    public Stack withHostnameTheme(CharSequence hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Stack withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances
     * 
     */
    @JsonIgnore
    public Set<Property<StackRdsDbInstance>> getRdsDbInstances() {
        return rdsDbInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances
     * 
     */
    @JsonIgnore
    public void setRdsDbInstances(Set<Property<StackRdsDbInstance>> rdsDbInstances) {
        this.rdsDbInstances = rdsDbInstances;
    }

    public Stack withRdsDbInstances(Set<Property<StackRdsDbInstance>> rdsDbInstances) {
        this.rdsDbInstances = rdsDbInstances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn
     * 
     */
    @JsonIgnore
    public void setServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public Stack withServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid
     * 
     */
    @JsonIgnore
    public CharSequence getSourceStackId() {
        return sourceStackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid
     * 
     */
    @JsonIgnore
    public void setSourceStackId(CharSequence sourceStackId) {
        this.sourceStackId = sourceStackId;
    }

    public Stack withSourceStackId(CharSequence sourceStackId) {
        this.sourceStackId = sourceStackId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Stack withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks
     * 
     */
    @JsonIgnore
    public CharSequence getUseCustomCookbooks() {
        return useCustomCookbooks;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks
     * 
     */
    @JsonIgnore
    public void setUseCustomCookbooks(CharSequence useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
    }

    public Stack withUseCustomCookbooks(CharSequence useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups
     * 
     */
    @JsonIgnore
    public CharSequence getUseOpsworksSecurityGroups() {
        return useOpsworksSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups
     * 
     */
    @JsonIgnore
    public void setUseOpsworksSecurityGroups(CharSequence useOpsworksSecurityGroups) {
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
    }

    public Stack withUseOpsworksSecurityGroups(CharSequence useOpsworksSecurityGroups) {
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid
     * 
     */
    @JsonIgnore
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid
     * 
     */
    @JsonIgnore
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public Stack withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("agentVersion", agentVersion).append("attributes", attributes).append("chefConfiguration", chefConfiguration).append("cloneAppIds", cloneAppIds).append("clonePermissions", clonePermissions).append("configurationManager", configurationManager).append("customCookbooksSource", customCookbooksSource).append("customJson", customJson).append("defaultAvailabilityZone", defaultAvailabilityZone).append("defaultInstanceProfileArn", defaultInstanceProfileArn).append("defaultOs", defaultOs).append("defaultRootDeviceType", defaultRootDeviceType).append("defaultSshKeyName", defaultSshKeyName).append("defaultSubnetId", defaultSubnetId).append("ecsClusterArn", ecsClusterArn).append("elasticIps", elasticIps).append("hostnameTheme", hostnameTheme).append("name", name).append("rdsDbInstances", rdsDbInstances).append("serviceRoleArn", serviceRoleArn).append("sourceStackId", sourceStackId).append("tags", tags).append("useCustomCookbooks", useCustomCookbooks).append("useOpsworksSecurityGroups", useOpsworksSecurityGroups).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(useCustomCookbooks).append(defaultSubnetId).append(customJson).append(customCookbooksSource).append(rdsDbInstances).append(vpcId).append(serviceRoleArn).append(chefConfiguration).append(clonePermissions).append(elasticIps).append(cloneAppIds).append(defaultRootDeviceType).append(sourceStackId).append(tags).append(defaultAvailabilityZone).append(defaultOs).append(configurationManager).append(defaultSshKeyName).append(name).append(agentVersion).append(defaultInstanceProfileArn).append(hostnameTheme).append(useOpsworksSecurityGroups).append(attributes).append(ecsClusterArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stack) == false) {
            return false;
        }
        Stack rhs = ((Stack) other);
        return new EqualsBuilder().append(useCustomCookbooks, rhs.useCustomCookbooks).append(defaultSubnetId, rhs.defaultSubnetId).append(customJson, rhs.customJson).append(customCookbooksSource, rhs.customCookbooksSource).append(rdsDbInstances, rhs.rdsDbInstances).append(vpcId, rhs.vpcId).append(serviceRoleArn, rhs.serviceRoleArn).append(chefConfiguration, rhs.chefConfiguration).append(clonePermissions, rhs.clonePermissions).append(elasticIps, rhs.elasticIps).append(cloneAppIds, rhs.cloneAppIds).append(defaultRootDeviceType, rhs.defaultRootDeviceType).append(sourceStackId, rhs.sourceStackId).append(tags, rhs.tags).append(defaultAvailabilityZone, rhs.defaultAvailabilityZone).append(defaultOs, rhs.defaultOs).append(configurationManager, rhs.configurationManager).append(defaultSshKeyName, rhs.defaultSshKeyName).append(name, rhs.name).append(agentVersion, rhs.agentVersion).append(defaultInstanceProfileArn, rhs.defaultInstanceProfileArn).append(hostnameTheme, rhs.hostnameTheme).append(useOpsworksSecurityGroups, rhs.useOpsworksSecurityGroups).append(attributes, rhs.attributes).append(ecsClusterArn, rhs.ecsClusterArn).isEquals();
    }

}
