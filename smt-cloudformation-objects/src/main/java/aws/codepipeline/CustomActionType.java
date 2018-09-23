
package aws.codepipeline;

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
 * CustomActionType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private String category;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties
     * 
     */
    @JsonProperty("ConfigurationProperties")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties")
    private Set<ConfigurationProperties> configurationProperties = new LinkedHashSet<ConfigurationProperties>();
    /**
     * ArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonProperty("InputArtifactDetails")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html")
    private ArtifactDetails inputArtifactDetails;
    /**
     * ArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonProperty("OutputArtifactDetails")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html")
    private ArtifactDetails outputArtifactDetails;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider
     * 
     */
    @JsonProperty("Provider")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider")
    private String provider;
    /**
     * Settings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
     * 
     */
    @JsonProperty("Settings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html")
    private Settings settings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version")
    private String version;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category
     * 
     */
    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-category
     * 
     */
    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    public CustomActionType withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties
     * 
     */
    @JsonProperty("ConfigurationProperties")
    public Set<ConfigurationProperties> getConfigurationProperties() {
        return configurationProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-configurationproperties
     * 
     */
    @JsonProperty("ConfigurationProperties")
    public void setConfigurationProperties(Set<ConfigurationProperties> configurationProperties) {
        this.configurationProperties = configurationProperties;
    }

    public CustomActionType withConfigurationProperties(Set<ConfigurationProperties> configurationProperties) {
        this.configurationProperties = configurationProperties;
        return this;
    }

    /**
     * ArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonProperty("InputArtifactDetails")
    public ArtifactDetails getInputArtifactDetails() {
        return inputArtifactDetails;
    }

    /**
     * ArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonProperty("InputArtifactDetails")
    public void setInputArtifactDetails(ArtifactDetails inputArtifactDetails) {
        this.inputArtifactDetails = inputArtifactDetails;
    }

    public CustomActionType withInputArtifactDetails(ArtifactDetails inputArtifactDetails) {
        this.inputArtifactDetails = inputArtifactDetails;
        return this;
    }

    /**
     * ArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonProperty("OutputArtifactDetails")
    public ArtifactDetails getOutputArtifactDetails() {
        return outputArtifactDetails;
    }

    /**
     * ArtifactDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-artifactdetails.html
     * 
     */
    @JsonProperty("OutputArtifactDetails")
    public void setOutputArtifactDetails(ArtifactDetails outputArtifactDetails) {
        this.outputArtifactDetails = outputArtifactDetails;
    }

    public CustomActionType withOutputArtifactDetails(ArtifactDetails outputArtifactDetails) {
        this.outputArtifactDetails = outputArtifactDetails;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider
     * 
     */
    @JsonProperty("Provider")
    public String getProvider() {
        return provider;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-provider
     * 
     */
    @JsonProperty("Provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CustomActionType withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Settings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
     * 
     */
    @JsonProperty("Settings")
    public Settings getSettings() {
        return settings;
    }

    /**
     * Settings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-customactiontype-settings.html
     * 
     */
    @JsonProperty("Settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public CustomActionType withSettings(Settings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version
     * 
     */
    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype.html#cfn-codepipeline-customactiontype-version
     * 
     */
    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    public CustomActionType withVersion(String version) {
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