
package aws.opsworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    private Map<String, CharSequence> attributes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips
     * 
     */
    @JsonProperty("AutoAssignElasticIps")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips")
    private CharSequence autoAssignElasticIps;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips
     * 
     */
    @JsonProperty("AutoAssignPublicIps")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips")
    private CharSequence autoAssignPublicIps;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn
     * 
     */
    @JsonProperty("CustomInstanceProfileArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn")
    private CharSequence customInstanceProfileArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson
     * 
     */
    @JsonProperty("CustomJson")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson")
    private Object customJson;
    /**
     * LayerRecipes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
     * 
     */
    @JsonProperty("CustomRecipes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html")
    private Property<LayerRecipes> customRecipes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids
     * 
     */
    @JsonProperty("CustomSecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids")
    private List<CharSequence> customSecurityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing
     * 
     */
    @JsonProperty("EnableAutoHealing")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing")
    private CharSequence enableAutoHealing;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot
     * 
     */
    @JsonProperty("InstallUpdatesOnBoot")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot")
    private CharSequence installUpdatesOnBoot;
    /**
     * LayerLifecycleEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
     * 
     */
    @JsonProperty("LifecycleEventConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html")
    private Property<LayerLifecycleEventConfiguration> lifecycleEventConfiguration;
    /**
     * LayerLoadBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
     * 
     */
    @JsonProperty("LoadBasedAutoScaling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html")
    private Property<LayerLoadBasedAutoScaling> loadBasedAutoScaling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages
     * 
     */
    @JsonProperty("Packages")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages")
    private List<CharSequence> packages = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname
     * 
     */
    @JsonProperty("Shortname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname")
    private CharSequence shortname;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid
     * 
     */
    @JsonProperty("StackId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid")
    private CharSequence stackId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances
     * 
     */
    @JsonProperty("UseEbsOptimizedInstances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances")
    private CharSequence useEbsOptimizedInstances;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations
     * 
     */
    @JsonProperty("VolumeConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations")
    private List<Property<LayerVolumeConfiguration>> volumeConfigurations = new ArrayList<Property<LayerVolumeConfiguration>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-attributes
     * 
     */
    @JsonIgnore
    public void setAttributes(Map<String, CharSequence> attributes) {
        this.attributes = attributes;
    }

    public Layer withAttributes(Map<String, CharSequence> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips
     * 
     */
    @JsonIgnore
    public CharSequence getAutoAssignElasticIps() {
        return autoAssignElasticIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignelasticips
     * 
     */
    @JsonIgnore
    public void setAutoAssignElasticIps(CharSequence autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
    }

    public Layer withAutoAssignElasticIps(CharSequence autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips
     * 
     */
    @JsonIgnore
    public CharSequence getAutoAssignPublicIps() {
        return autoAssignPublicIps;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-autoassignpublicips
     * 
     */
    @JsonIgnore
    public void setAutoAssignPublicIps(CharSequence autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
    }

    public Layer withAutoAssignPublicIps(CharSequence autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn
     * 
     */
    @JsonIgnore
    public CharSequence getCustomInstanceProfileArn() {
        return customInstanceProfileArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-custominstanceprofilearn
     * 
     */
    @JsonIgnore
    public void setCustomInstanceProfileArn(CharSequence customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
    }

    public Layer withCustomInstanceProfileArn(CharSequence customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson
     * 
     */
    @JsonIgnore
    public Object getCustomJson() {
        return customJson;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customjson
     * 
     */
    @JsonIgnore
    public void setCustomJson(Object customJson) {
        this.customJson = customJson;
    }

    public Layer withCustomJson(Object customJson) {
        this.customJson = customJson;
        return this;
    }

    /**
     * LayerRecipes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
     * 
     */
    @JsonIgnore
    public Property<LayerRecipes> getCustomRecipes() {
        return customRecipes;
    }

    /**
     * LayerRecipes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-recipes.html
     * 
     */
    @JsonIgnore
    public void setCustomRecipes(Property<LayerRecipes> customRecipes) {
        this.customRecipes = customRecipes;
    }

    public Layer withCustomRecipes(Property<LayerRecipes> customRecipes) {
        this.customRecipes = customRecipes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCustomSecurityGroupIds() {
        return customSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-customsecuritygroupids
     * 
     */
    @JsonIgnore
    public void setCustomSecurityGroupIds(List<CharSequence> customSecurityGroupIds) {
        this.customSecurityGroupIds = customSecurityGroupIds;
    }

    public Layer withCustomSecurityGroupIds(List<CharSequence> customSecurityGroupIds) {
        this.customSecurityGroupIds = customSecurityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing
     * 
     */
    @JsonIgnore
    public CharSequence getEnableAutoHealing() {
        return enableAutoHealing;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-enableautohealing
     * 
     */
    @JsonIgnore
    public void setEnableAutoHealing(CharSequence enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
    }

    public Layer withEnableAutoHealing(CharSequence enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot
     * 
     */
    @JsonIgnore
    public CharSequence getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-installupdatesonboot
     * 
     */
    @JsonIgnore
    public void setInstallUpdatesOnBoot(CharSequence installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }

    public Layer withInstallUpdatesOnBoot(CharSequence installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        return this;
    }

    /**
     * LayerLifecycleEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<LayerLifecycleEventConfiguration> getLifecycleEventConfiguration() {
        return lifecycleEventConfiguration;
    }

    /**
     * LayerLifecycleEventConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-lifecycleeventconfiguration.html
     * 
     */
    @JsonIgnore
    public void setLifecycleEventConfiguration(Property<LayerLifecycleEventConfiguration> lifecycleEventConfiguration) {
        this.lifecycleEventConfiguration = lifecycleEventConfiguration;
    }

    public Layer withLifecycleEventConfiguration(Property<LayerLifecycleEventConfiguration> lifecycleEventConfiguration) {
        this.lifecycleEventConfiguration = lifecycleEventConfiguration;
        return this;
    }

    /**
     * LayerLoadBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
     * 
     */
    @JsonIgnore
    public Property<LayerLoadBasedAutoScaling> getLoadBasedAutoScaling() {
        return loadBasedAutoScaling;
    }

    /**
     * LayerLoadBasedAutoScaling
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
     * 
     */
    @JsonIgnore
    public void setLoadBasedAutoScaling(Property<LayerLoadBasedAutoScaling> loadBasedAutoScaling) {
        this.loadBasedAutoScaling = loadBasedAutoScaling;
    }

    public Layer withLoadBasedAutoScaling(Property<LayerLoadBasedAutoScaling> loadBasedAutoScaling) {
        this.loadBasedAutoScaling = loadBasedAutoScaling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Layer withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages
     * 
     */
    @JsonIgnore
    public List<CharSequence> getPackages() {
        return packages;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-packages
     * 
     */
    @JsonIgnore
    public void setPackages(List<CharSequence> packages) {
        this.packages = packages;
    }

    public Layer withPackages(List<CharSequence> packages) {
        this.packages = packages;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname
     * 
     */
    @JsonIgnore
    public CharSequence getShortname() {
        return shortname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-shortname
     * 
     */
    @JsonIgnore
    public void setShortname(CharSequence shortname) {
        this.shortname = shortname;
    }

    public Layer withShortname(CharSequence shortname) {
        this.shortname = shortname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid
     * 
     */
    @JsonIgnore
    public CharSequence getStackId() {
        return stackId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-stackid
     * 
     */
    @JsonIgnore
    public void setStackId(CharSequence stackId) {
        this.stackId = stackId;
    }

    public Layer withStackId(CharSequence stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Layer withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Layer withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances
     * 
     */
    @JsonIgnore
    public CharSequence getUseEbsOptimizedInstances() {
        return useEbsOptimizedInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-useebsoptimizedinstances
     * 
     */
    @JsonIgnore
    public void setUseEbsOptimizedInstances(CharSequence useEbsOptimizedInstances) {
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }

    public Layer withUseEbsOptimizedInstances(CharSequence useEbsOptimizedInstances) {
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations
     * 
     */
    @JsonIgnore
    public List<Property<LayerVolumeConfiguration>> getVolumeConfigurations() {
        return volumeConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-layer.html#cfn-opsworks-layer-volumeconfigurations
     * 
     */
    @JsonIgnore
    public void setVolumeConfigurations(List<Property<LayerVolumeConfiguration>> volumeConfigurations) {
        this.volumeConfigurations = volumeConfigurations;
    }

    public Layer withVolumeConfigurations(List<Property<LayerVolumeConfiguration>> volumeConfigurations) {
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
