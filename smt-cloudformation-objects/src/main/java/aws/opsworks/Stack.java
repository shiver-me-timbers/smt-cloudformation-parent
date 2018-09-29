
package aws.opsworks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
 * Stack
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private Map<String, String> attributes;
    /**
     * ChefConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
     * 
     */
    @JsonProperty("ChefConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html")
    private ChefConfiguration chefConfiguration;
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
    private Boolean clonePermissions;
    /**
     * StackConfigurationManager
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html
     * 
     */
    @JsonProperty("ConfigurationManager")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html")
    private StackConfigurationManager configurationManager;
    /**
     * DataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
     * 
     */
    @JsonProperty("CustomCookbooksSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html")
    private DataSource customCookbooksSource;
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
    private Set<ElasticIp> elasticIps = new LinkedHashSet<ElasticIp>();
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
    private Set<RdsDbInstance> rdsDbInstances = new LinkedHashSet<RdsDbInstance>();
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
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks
     * 
     */
    @JsonProperty("UseCustomCookbooks")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks")
    private Boolean useCustomCookbooks;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups
     * 
     */
    @JsonProperty("UseOpsworksSecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups")
    private Boolean useOpsworksSecurityGroups;
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
    public CharSequence getAgentVersion() {
        return agentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion
     * 
     */
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
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes
     * 
     */
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Stack withAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * ChefConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
     * 
     */
    public ChefConfiguration getChefConfiguration() {
        return chefConfiguration;
    }

    /**
     * ChefConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
     * 
     */
    public void setChefConfiguration(ChefConfiguration chefConfiguration) {
        this.chefConfiguration = chefConfiguration;
    }

    public Stack withChefConfiguration(ChefConfiguration chefConfiguration) {
        this.chefConfiguration = chefConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids
     * 
     */
    public Set<CharSequence> getCloneAppIds() {
        return cloneAppIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids
     * 
     */
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
    public Boolean getClonePermissions() {
        return clonePermissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions
     * 
     */
    public void setClonePermissions(Boolean clonePermissions) {
        this.clonePermissions = clonePermissions;
    }

    public Stack withClonePermissions(Boolean clonePermissions) {
        this.clonePermissions = clonePermissions;
        return this;
    }

    /**
     * StackConfigurationManager
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html
     * 
     */
    public StackConfigurationManager getConfigurationManager() {
        return configurationManager;
    }

    /**
     * StackConfigurationManager
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html
     * 
     */
    public void setConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    public Stack withConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
        return this;
    }

    /**
     * DataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
     * 
     */
    public DataSource getCustomCookbooksSource() {
        return customCookbooksSource;
    }

    /**
     * DataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
     * 
     */
    public void setCustomCookbooksSource(DataSource customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
    }

    public Stack withCustomCookbooksSource(DataSource customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson
     * 
     */
    public Object getCustomJson() {
        return customJson;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson
     * 
     */
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
    public CharSequence getDefaultAvailabilityZone() {
        return defaultAvailabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz
     * 
     */
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
    public CharSequence getDefaultInstanceProfileArn() {
        return defaultInstanceProfileArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof
     * 
     */
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
    public CharSequence getDefaultOs() {
        return defaultOs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos
     * 
     */
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
    public CharSequence getDefaultRootDeviceType() {
        return defaultRootDeviceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype
     * 
     */
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
    public CharSequence getDefaultSshKeyName() {
        return defaultSshKeyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname
     * 
     */
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
    public CharSequence getDefaultSubnetId() {
        return defaultSubnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet
     * 
     */
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
    public CharSequence getEcsClusterArn() {
        return ecsClusterArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn
     * 
     */
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
    public Set<ElasticIp> getElasticIps() {
        return elasticIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips
     * 
     */
    public void setElasticIps(Set<ElasticIp> elasticIps) {
        this.elasticIps = elasticIps;
    }

    public Stack withElasticIps(Set<ElasticIp> elasticIps) {
        this.elasticIps = elasticIps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme
     * 
     */
    public CharSequence getHostnameTheme() {
        return hostnameTheme;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme
     * 
     */
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
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name
     * 
     */
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
    public Set<RdsDbInstance> getRdsDbInstances() {
        return rdsDbInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances
     * 
     */
    public void setRdsDbInstances(Set<RdsDbInstance> rdsDbInstances) {
        this.rdsDbInstances = rdsDbInstances;
    }

    public Stack withRdsDbInstances(Set<RdsDbInstance> rdsDbInstances) {
        this.rdsDbInstances = rdsDbInstances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn
     * 
     */
    public CharSequence getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn
     * 
     */
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
    public CharSequence getSourceStackId() {
        return sourceStackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid
     * 
     */
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
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Stack withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks
     * 
     */
    public Boolean getUseCustomCookbooks() {
        return useCustomCookbooks;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks
     * 
     */
    public void setUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
    }

    public Stack withUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups
     * 
     */
    public Boolean getUseOpsworksSecurityGroups() {
        return useOpsworksSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups
     * 
     */
    public void setUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
    }

    public Stack withUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid
     * 
     */
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid
     * 
     */
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
