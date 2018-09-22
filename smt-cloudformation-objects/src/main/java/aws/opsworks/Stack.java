
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
    private java.lang.String agentVersion;
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
    private Set<java.lang.String> cloneAppIds = new LinkedHashSet<java.lang.String>();
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
    private CustomJson_ customJson;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz
     * 
     */
    @JsonProperty("DefaultAvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz")
    private java.lang.String defaultAvailabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof
     * 
     */
    @JsonProperty("DefaultInstanceProfileArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof")
    private java.lang.String defaultInstanceProfileArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos
     * 
     */
    @JsonProperty("DefaultOs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos")
    private java.lang.String defaultOs;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype
     * 
     */
    @JsonProperty("DefaultRootDeviceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype")
    private java.lang.String defaultRootDeviceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname
     * 
     */
    @JsonProperty("DefaultSshKeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname")
    private java.lang.String defaultSshKeyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet
     * 
     */
    @JsonProperty("DefaultSubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet")
    private java.lang.String defaultSubnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn
     * 
     */
    @JsonProperty("EcsClusterArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn")
    private java.lang.String ecsClusterArn;
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
    private java.lang.String hostnameTheme;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name")
    private java.lang.String name;
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
    private java.lang.String serviceRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid
     * 
     */
    @JsonProperty("SourceStackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid")
    private java.lang.String sourceStackId;
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
    private java.lang.String vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion
     * 
     */
    @JsonProperty("AgentVersion")
    public java.lang.String getAgentVersion() {
        return agentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-agentversion
     * 
     */
    @JsonProperty("AgentVersion")
    public void setAgentVersion(java.lang.String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Stack withAgentVersion(java.lang.String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes
     * 
     */
    @JsonProperty("Attributes")
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-attributes
     * 
     */
    @JsonProperty("Attributes")
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
    @JsonProperty("ChefConfiguration")
    public ChefConfiguration getChefConfiguration() {
        return chefConfiguration;
    }

    /**
     * ChefConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
     * 
     */
    @JsonProperty("ChefConfiguration")
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
    @JsonProperty("CloneAppIds")
    public Set<java.lang.String> getCloneAppIds() {
        return cloneAppIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-cloneappids
     * 
     */
    @JsonProperty("CloneAppIds")
    public void setCloneAppIds(Set<java.lang.String> cloneAppIds) {
        this.cloneAppIds = cloneAppIds;
    }

    public Stack withCloneAppIds(Set<java.lang.String> cloneAppIds) {
        this.cloneAppIds = cloneAppIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions
     * 
     */
    @JsonProperty("ClonePermissions")
    public Boolean getClonePermissions() {
        return clonePermissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-clonepermissions
     * 
     */
    @JsonProperty("ClonePermissions")
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
    @JsonProperty("ConfigurationManager")
    public StackConfigurationManager getConfigurationManager() {
        return configurationManager;
    }

    /**
     * StackConfigurationManager
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-stackconfigmanager.html
     * 
     */
    @JsonProperty("ConfigurationManager")
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
    @JsonProperty("CustomCookbooksSource")
    public DataSource getCustomCookbooksSource() {
        return customCookbooksSource;
    }

    /**
     * DataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-datasource.html
     * 
     */
    @JsonProperty("CustomCookbooksSource")
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
    @JsonProperty("CustomJson")
    public CustomJson_ getCustomJson() {
        return customJson;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-custjson
     * 
     */
    @JsonProperty("CustomJson")
    public void setCustomJson(CustomJson_ customJson) {
        this.customJson = customJson;
    }

    public Stack withCustomJson(CustomJson_ customJson) {
        this.customJson = customJson;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz
     * 
     */
    @JsonProperty("DefaultAvailabilityZone")
    public java.lang.String getDefaultAvailabilityZone() {
        return defaultAvailabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultaz
     * 
     */
    @JsonProperty("DefaultAvailabilityZone")
    public void setDefaultAvailabilityZone(java.lang.String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }

    public Stack withDefaultAvailabilityZone(java.lang.String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof
     * 
     */
    @JsonProperty("DefaultInstanceProfileArn")
    public java.lang.String getDefaultInstanceProfileArn() {
        return defaultInstanceProfileArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultinstanceprof
     * 
     */
    @JsonProperty("DefaultInstanceProfileArn")
    public void setDefaultInstanceProfileArn(java.lang.String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
    }

    public Stack withDefaultInstanceProfileArn(java.lang.String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos
     * 
     */
    @JsonProperty("DefaultOs")
    public java.lang.String getDefaultOs() {
        return defaultOs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultos
     * 
     */
    @JsonProperty("DefaultOs")
    public void setDefaultOs(java.lang.String defaultOs) {
        this.defaultOs = defaultOs;
    }

    public Stack withDefaultOs(java.lang.String defaultOs) {
        this.defaultOs = defaultOs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype
     * 
     */
    @JsonProperty("DefaultRootDeviceType")
    public java.lang.String getDefaultRootDeviceType() {
        return defaultRootDeviceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultrootdevicetype
     * 
     */
    @JsonProperty("DefaultRootDeviceType")
    public void setDefaultRootDeviceType(java.lang.String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
    }

    public Stack withDefaultRootDeviceType(java.lang.String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname
     * 
     */
    @JsonProperty("DefaultSshKeyName")
    public java.lang.String getDefaultSshKeyName() {
        return defaultSshKeyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-defaultsshkeyname
     * 
     */
    @JsonProperty("DefaultSshKeyName")
    public void setDefaultSshKeyName(java.lang.String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
    }

    public Stack withDefaultSshKeyName(java.lang.String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet
     * 
     */
    @JsonProperty("DefaultSubnetId")
    public java.lang.String getDefaultSubnetId() {
        return defaultSubnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#defaultsubnet
     * 
     */
    @JsonProperty("DefaultSubnetId")
    public void setDefaultSubnetId(java.lang.String defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
    }

    public Stack withDefaultSubnetId(java.lang.String defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn
     * 
     */
    @JsonProperty("EcsClusterArn")
    public java.lang.String getEcsClusterArn() {
        return ecsClusterArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-ecsclusterarn
     * 
     */
    @JsonProperty("EcsClusterArn")
    public void setEcsClusterArn(java.lang.String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }

    public Stack withEcsClusterArn(java.lang.String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips
     * 
     */
    @JsonProperty("ElasticIps")
    public Set<ElasticIp> getElasticIps() {
        return elasticIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-elasticips
     * 
     */
    @JsonProperty("ElasticIps")
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
    @JsonProperty("HostnameTheme")
    public java.lang.String getHostnameTheme() {
        return hostnameTheme;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-hostnametheme
     * 
     */
    @JsonProperty("HostnameTheme")
    public void setHostnameTheme(java.lang.String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
    }

    public Stack withHostnameTheme(java.lang.String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name
     * 
     */
    @JsonProperty("Name")
    public java.lang.String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-name
     * 
     */
    @JsonProperty("Name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Stack withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances
     * 
     */
    @JsonProperty("RdsDbInstances")
    public Set<RdsDbInstance> getRdsDbInstances() {
        return rdsDbInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-rdsdbinstances
     * 
     */
    @JsonProperty("RdsDbInstances")
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
    @JsonProperty("ServiceRoleArn")
    public java.lang.String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    public void setServiceRoleArn(java.lang.String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public Stack withServiceRoleArn(java.lang.String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid
     * 
     */
    @JsonProperty("SourceStackId")
    public java.lang.String getSourceStackId() {
        return sourceStackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-sourcestackid
     * 
     */
    @JsonProperty("SourceStackId")
    public void setSourceStackId(java.lang.String sourceStackId) {
        this.sourceStackId = sourceStackId;
    }

    public Stack withSourceStackId(java.lang.String sourceStackId) {
        this.sourceStackId = sourceStackId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-tags
     * 
     */
    @JsonProperty("Tags")
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
    @JsonProperty("UseCustomCookbooks")
    public Boolean getUseCustomCookbooks() {
        return useCustomCookbooks;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#usecustcookbooks
     * 
     */
    @JsonProperty("UseCustomCookbooks")
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
    @JsonProperty("UseOpsworksSecurityGroups")
    public Boolean getUseOpsworksSecurityGroups() {
        return useOpsworksSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-useopsworkssecuritygroups
     * 
     */
    @JsonProperty("UseOpsworksSecurityGroups")
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
    @JsonProperty("VpcId")
    public java.lang.String getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-stack.html#cfn-opsworks-stack-vpcid
     * 
     */
    @JsonProperty("VpcId")
    public void setVpcId(java.lang.String vpcId) {
        this.vpcId = vpcId;
    }

    public Stack withVpcId(java.lang.String vpcId) {
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
