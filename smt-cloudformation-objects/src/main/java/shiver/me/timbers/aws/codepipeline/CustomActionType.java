
package shiver.me.timbers.aws.codepipeline;

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
 * CustomActionType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Category",
    "ConfigurationProperties",
    "InputArtifactDetails",
    "OutputArtifactDetails",
    "Provider",
    "Settings",
    "Version"
})
public class CustomActionType {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category
     * 
     */
    @JsonProperty("Category")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category")
    private CharSequence category;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties
     * 
     */
    @JsonProperty("ConfigurationProperties")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties")
    private Set<Property<CustomActionTypeConfigurationProperties>> configurationProperties = new LinkedHashSet<Property<CustomActionTypeConfigurationProperties>>();
    /**
     * CustomActionTypeArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonProperty("InputArtifactDetails")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html")
    private Property<shiver.me.timbers.aws.codepipeline.CustomActionTypeArtifactDetails> inputArtifactDetails;
    /**
     * CustomActionTypeArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonProperty("OutputArtifactDetails")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html")
    private Property<shiver.me.timbers.aws.codepipeline.CustomActionTypeArtifactDetails> outputArtifactDetails;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider
     * 
     */
    @JsonProperty("Provider")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider")
    private CharSequence provider;
    /**
     * CustomActionTypeSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
     * 
     */
    @JsonProperty("Settings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html")
    private Property<CustomActionTypeSettings> settings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version")
    private CharSequence version;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category
     * 
     */
    @JsonIgnore
    public CharSequence getCategory() {
        return category;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category
     * 
     */
    @JsonIgnore
    public void setCategory(CharSequence category) {
        this.category = category;
    }

    public CustomActionType withCategory(CharSequence category) {
        this.category = category;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties
     * 
     */
    @JsonIgnore
    public Set<Property<CustomActionTypeConfigurationProperties>> getConfigurationProperties() {
        return configurationProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties
     * 
     */
    @JsonIgnore
    public void setConfigurationProperties(Set<Property<CustomActionTypeConfigurationProperties>> configurationProperties) {
        this.configurationProperties = configurationProperties;
    }

    public CustomActionType withConfigurationProperties(Set<Property<CustomActionTypeConfigurationProperties>> configurationProperties) {
        this.configurationProperties = configurationProperties;
        return this;
    }

    /**
     * CustomActionTypeArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.codepipeline.CustomActionTypeArtifactDetails> getInputArtifactDetails() {
        return inputArtifactDetails;
    }

    /**
     * CustomActionTypeArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonIgnore
    public void setInputArtifactDetails(Property<shiver.me.timbers.aws.codepipeline.CustomActionTypeArtifactDetails> inputArtifactDetails) {
        this.inputArtifactDetails = inputArtifactDetails;
    }

    public CustomActionType withInputArtifactDetails(Property<shiver.me.timbers.aws.codepipeline.CustomActionTypeArtifactDetails> inputArtifactDetails) {
        this.inputArtifactDetails = inputArtifactDetails;
        return this;
    }

    /**
     * CustomActionTypeArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.codepipeline.CustomActionTypeArtifactDetails> getOutputArtifactDetails() {
        return outputArtifactDetails;
    }

    /**
     * CustomActionTypeArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonIgnore
    public void setOutputArtifactDetails(Property<shiver.me.timbers.aws.codepipeline.CustomActionTypeArtifactDetails> outputArtifactDetails) {
        this.outputArtifactDetails = outputArtifactDetails;
    }

    public CustomActionType withOutputArtifactDetails(Property<shiver.me.timbers.aws.codepipeline.CustomActionTypeArtifactDetails> outputArtifactDetails) {
        this.outputArtifactDetails = outputArtifactDetails;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider
     * 
     */
    @JsonIgnore
    public CharSequence getProvider() {
        return provider;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider
     * 
     */
    @JsonIgnore
    public void setProvider(CharSequence provider) {
        this.provider = provider;
    }

    public CustomActionType withProvider(CharSequence provider) {
        this.provider = provider;
        return this;
    }

    /**
     * CustomActionTypeSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
     * 
     */
    @JsonIgnore
    public Property<CustomActionTypeSettings> getSettings() {
        return settings;
    }

    /**
     * CustomActionTypeSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
     * 
     */
    @JsonIgnore
    public void setSettings(Property<CustomActionTypeSettings> settings) {
        this.settings = settings;
    }

    public CustomActionType withSettings(Property<CustomActionTypeSettings> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version
     * 
     */
    @JsonIgnore
    public CharSequence getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version
     * 
     */
    @JsonIgnore
    public void setVersion(CharSequence version) {
        this.version = version;
    }

    public CustomActionType withVersion(CharSequence version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("category", category).append("configurationProperties", configurationProperties).append("inputArtifactDetails", inputArtifactDetails).append("outputArtifactDetails", outputArtifactDetails).append("provider", provider).append("settings", settings).append("version", version).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(settings).append(provider).append(inputArtifactDetails).append(outputArtifactDetails).append(category).append(configurationProperties).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomActionType) == false) {
            return false;
        }
        CustomActionType rhs = ((CustomActionType) other);
        return new EqualsBuilder().append(settings, rhs.settings).append(provider, rhs.provider).append(inputArtifactDetails, rhs.inputArtifactDetails).append(outputArtifactDetails, rhs.outputArtifactDetails).append(category, rhs.category).append(configurationProperties, rhs.configurationProperties).append(version, rhs.version).isEquals();
    }

}
