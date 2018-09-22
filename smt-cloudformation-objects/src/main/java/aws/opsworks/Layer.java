
package aws.opsworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Layer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Attributes",
    "AutoAssignElasticIps",
    "AutoAssignPublicIps",
    "CustomInstanceProfileArn",
    "CustomJson",
    "CustomRecipes",
    "CustomSecurityGroupIds",
    "EnableAutoHealing",
    "InstallUpdatesOnBoot",
    "LifecycleEventConfiguration",
    "LoadBasedAutoScaling",
    "Name",
    "Packages",
    "Shortname",
    "StackId",
    "Tags",
    "Type",
    "UseEbsOptimizedInstances",
    "VolumeConfigurations"
})
public class Layer {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes")
    private Map<String, String> attributes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips
     * 
     */
    @JsonProperty("AutoAssignElasticIps")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips")
    private Boolean autoAssignElasticIps;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips
     * 
     */
    @JsonProperty("AutoAssignPublicIps")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips")
    private Boolean autoAssignPublicIps;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn
     * 
     */
    @JsonProperty("CustomInstanceProfileArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn")
    private java.lang.String customInstanceProfileArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson
     * 
     */
    @JsonProperty("CustomJson")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson")
    private CustomJson customJson;
    /**
     * Recipes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
     * 
     */
    @JsonProperty("CustomRecipes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html")
    private Recipes customRecipes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids
     * 
     */
    @JsonProperty("CustomSecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids")
    private List<java.lang.String> customSecurityGroupIds = new ArrayList<java.lang.String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing
     * 
     */
    @JsonProperty("EnableAutoHealing")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing")
    private Boolean enableAutoHealing;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot
     * 
     */
    @JsonProperty("InstallUpdatesOnBoot")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot")
    private Boolean installUpdatesOnBoot;
    /**
     * LifecycleEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
     * 
     */
    @JsonProperty("LifecycleEventConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html")
    private LifecycleEventConfiguration lifecycleEventConfiguration;
    /**
     * LoadBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
     * 
     */
    @JsonProperty("LoadBasedAutoScaling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html")
    private LoadBasedAutoScaling loadBasedAutoScaling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name")
    private java.lang.String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages
     * 
     */
    @JsonProperty("Packages")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages")
    private List<java.lang.String> packages = new ArrayList<java.lang.String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname
     * 
     */
    @JsonProperty("Shortname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname")
    private java.lang.String shortname;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid
     * 
     */
    @JsonProperty("StackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid")
    private java.lang.String stackId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type")
    private java.lang.String type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances
     * 
     */
    @JsonProperty("UseEbsOptimizedInstances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances")
    private Boolean useEbsOptimizedInstances;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations
     * 
     */
    @JsonProperty("VolumeConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations")
    private List<VolumeConfiguration> volumeConfigurations = new ArrayList<VolumeConfiguration>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes
     * 
     */
    @JsonProperty("Attributes")
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes
     * 
     */
    @JsonProperty("Attributes")
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Layer withAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips
     * 
     */
    @JsonProperty("AutoAssignElasticIps")
    public Boolean getAutoAssignElasticIps() {
        return autoAssignElasticIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips
     * 
     */
    @JsonProperty("AutoAssignElasticIps")
    public void setAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
    }

    public Layer withAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips
     * 
     */
    @JsonProperty("AutoAssignPublicIps")
    public Boolean getAutoAssignPublicIps() {
        return autoAssignPublicIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips
     * 
     */
    @JsonProperty("AutoAssignPublicIps")
    public void setAutoAssignPublicIps(Boolean autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
    }

    public Layer withAutoAssignPublicIps(Boolean autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn
     * 
     */
    @JsonProperty("CustomInstanceProfileArn")
    public java.lang.String getCustomInstanceProfileArn() {
        return customInstanceProfileArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn
     * 
     */
    @JsonProperty("CustomInstanceProfileArn")
    public void setCustomInstanceProfileArn(java.lang.String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
    }

    public Layer withCustomInstanceProfileArn(java.lang.String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson
     * 
     */
    @JsonProperty("CustomJson")
    public CustomJson getCustomJson() {
        return customJson;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson
     * 
     */
    @JsonProperty("CustomJson")
    public void setCustomJson(CustomJson customJson) {
        this.customJson = customJson;
    }

    public Layer withCustomJson(CustomJson customJson) {
        this.customJson = customJson;
        return this;
    }

    /**
     * Recipes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
     * 
     */
    @JsonProperty("CustomRecipes")
    public Recipes getCustomRecipes() {
        return customRecipes;
    }

    /**
     * Recipes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
     * 
     */
    @JsonProperty("CustomRecipes")
    public void setCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
    }

    public Layer withCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids
     * 
     */
    @JsonProperty("CustomSecurityGroupIds")
    public List<java.lang.String> getCustomSecurityGroupIds() {
        return customSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids
     * 
     */
    @JsonProperty("CustomSecurityGroupIds")
    public void setCustomSecurityGroupIds(List<java.lang.String> customSecurityGroupIds) {
        this.customSecurityGroupIds = customSecurityGroupIds;
    }

    public Layer withCustomSecurityGroupIds(List<java.lang.String> customSecurityGroupIds) {
        this.customSecurityGroupIds = customSecurityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing
     * 
     */
    @JsonProperty("EnableAutoHealing")
    public Boolean getEnableAutoHealing() {
        return enableAutoHealing;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing
     * 
     */
    @JsonProperty("EnableAutoHealing")
    public void setEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
    }

    public Layer withEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot
     * 
     */
    @JsonProperty("InstallUpdatesOnBoot")
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot
     * 
     */
    @JsonProperty("InstallUpdatesOnBoot")
    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }

    public Layer withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        return this;
    }

    /**
     * LifecycleEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
     * 
     */
    @JsonProperty("LifecycleEventConfiguration")
    public LifecycleEventConfiguration getLifecycleEventConfiguration() {
        return lifecycleEventConfiguration;
    }

    /**
     * LifecycleEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
     * 
     */
    @JsonProperty("LifecycleEventConfiguration")
    public void setLifecycleEventConfiguration(LifecycleEventConfiguration lifecycleEventConfiguration) {
        this.lifecycleEventConfiguration = lifecycleEventConfiguration;
    }

    public Layer withLifecycleEventConfiguration(LifecycleEventConfiguration lifecycleEventConfiguration) {
        this.lifecycleEventConfiguration = lifecycleEventConfiguration;
        return this;
    }

    /**
     * LoadBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
     * 
     */
    @JsonProperty("LoadBasedAutoScaling")
    public LoadBasedAutoScaling getLoadBasedAutoScaling() {
        return loadBasedAutoScaling;
    }

    /**
     * LoadBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
     * 
     */
    @JsonProperty("LoadBasedAutoScaling")
    public void setLoadBasedAutoScaling(LoadBasedAutoScaling loadBasedAutoScaling) {
        this.loadBasedAutoScaling = loadBasedAutoScaling;
    }

    public Layer withLoadBasedAutoScaling(LoadBasedAutoScaling loadBasedAutoScaling) {
        this.loadBasedAutoScaling = loadBasedAutoScaling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name
     * 
     */
    @JsonProperty("Name")
    public java.lang.String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name
     * 
     */
    @JsonProperty("Name")
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Layer withName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages
     * 
     */
    @JsonProperty("Packages")
    public List<java.lang.String> getPackages() {
        return packages;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages
     * 
     */
    @JsonProperty("Packages")
    public void setPackages(List<java.lang.String> packages) {
        this.packages = packages;
    }

    public Layer withPackages(List<java.lang.String> packages) {
        this.packages = packages;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname
     * 
     */
    @JsonProperty("Shortname")
    public java.lang.String getShortname() {
        return shortname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname
     * 
     */
    @JsonProperty("Shortname")
    public void setShortname(java.lang.String shortname) {
        this.shortname = shortname;
    }

    public Layer withShortname(java.lang.String shortname) {
        this.shortname = shortname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid
     * 
     */
    @JsonProperty("StackId")
    public java.lang.String getStackId() {
        return stackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid
     * 
     */
    @JsonProperty("StackId")
    public void setStackId(java.lang.String stackId) {
        this.stackId = stackId;
    }

    public Layer withStackId(java.lang.String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Layer withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type
     * 
     */
    @JsonProperty("Type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type
     * 
     */
    @JsonProperty("Type")
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public Layer withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances
     * 
     */
    @JsonProperty("UseEbsOptimizedInstances")
    public Boolean getUseEbsOptimizedInstances() {
        return useEbsOptimizedInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances
     * 
     */
    @JsonProperty("UseEbsOptimizedInstances")
    public void setUseEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }

    public Layer withUseEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations
     * 
     */
    @JsonProperty("VolumeConfigurations")
    public List<VolumeConfiguration> getVolumeConfigurations() {
        return volumeConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations
     * 
     */
    @JsonProperty("VolumeConfigurations")
    public void setVolumeConfigurations(List<VolumeConfiguration> volumeConfigurations) {
        this.volumeConfigurations = volumeConfigurations;
    }

    public Layer withVolumeConfigurations(List<VolumeConfiguration> volumeConfigurations) {
        this.volumeConfigurations = volumeConfigurations;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("attributes", attributes).append("autoAssignElasticIps", autoAssignElasticIps).append("autoAssignPublicIps", autoAssignPublicIps).append("customInstanceProfileArn", customInstanceProfileArn).append("customJson", customJson).append("customRecipes", customRecipes).append("customSecurityGroupIds", customSecurityGroupIds).append("enableAutoHealing", enableAutoHealing).append("installUpdatesOnBoot", installUpdatesOnBoot).append("lifecycleEventConfiguration", lifecycleEventConfiguration).append("loadBasedAutoScaling", loadBasedAutoScaling).append("name", name).append("packages", packages).append("shortname", shortname).append("stackId", stackId).append("tags", tags).append("type", type).append("useEbsOptimizedInstances", useEbsOptimizedInstances).append("volumeConfigurations", volumeConfigurations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeConfigurations).append(autoAssignPublicIps).append(installUpdatesOnBoot).append(customSecurityGroupIds).append(lifecycleEventConfiguration).append(stackId).append(loadBasedAutoScaling).append(enableAutoHealing).append(packages).append(type).append(customJson).append(shortname).append(autoAssignElasticIps).append(tags).append(useEbsOptimizedInstances).append(name).append(attributes).append(customRecipes).append(customInstanceProfileArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Layer) == false) {
            return false;
        }
        Layer rhs = ((Layer) other);
        return new EqualsBuilder().append(volumeConfigurations, rhs.volumeConfigurations).append(autoAssignPublicIps, rhs.autoAssignPublicIps).append(installUpdatesOnBoot, rhs.installUpdatesOnBoot).append(customSecurityGroupIds, rhs.customSecurityGroupIds).append(lifecycleEventConfiguration, rhs.lifecycleEventConfiguration).append(stackId, rhs.stackId).append(loadBasedAutoScaling, rhs.loadBasedAutoScaling).append(enableAutoHealing, rhs.enableAutoHealing).append(packages, rhs.packages).append(type, rhs.type).append(customJson, rhs.customJson).append(shortname, rhs.shortname).append(autoAssignElasticIps, rhs.autoAssignElasticIps).append(tags, rhs.tags).append(useEbsOptimizedInstances, rhs.useEbsOptimizedInstances).append(name, rhs.name).append(attributes, rhs.attributes).append(customRecipes, rhs.customRecipes).append(customInstanceProfileArn, rhs.customInstanceProfileArn).isEquals();
    }

}
