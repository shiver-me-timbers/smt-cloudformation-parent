
package shiver.me.timbers.aws.imagebuilder;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * Image
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ImageTestsConfiguration",
    "ImageRecipeArn",
    "DistributionConfigurationArn",
    "InfrastructureConfigurationArn",
    "Tags"
})
public class Image {

    /**
     * ImagePipelineImageTestsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html
     * 
     */
    @JsonProperty("ImageTestsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html")
    private Property<ImageImageTestsConfiguration> imageTestsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn
     * 
     */
    @JsonProperty("ImageRecipeArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn")
    private CharSequence imageRecipeArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn
     * 
     */
    @JsonProperty("DistributionConfigurationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn")
    private CharSequence distributionConfigurationArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn
     * 
     */
    @JsonProperty("InfrastructureConfigurationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn")
    private CharSequence infrastructureConfigurationArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags")
    private Map<String, CharSequence> tags;

    /**
     * ImagePipelineImageTestsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ImageImageTestsConfiguration> getImageTestsConfiguration() {
        return imageTestsConfiguration;
    }

    /**
     * ImagePipelineImageTestsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html
     * 
     */
    @JsonIgnore
    public void setImageTestsConfiguration(Property<ImageImageTestsConfiguration> imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    public Image withImageTestsConfiguration(Property<ImageImageTestsConfiguration> imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn
     * 
     */
    @JsonIgnore
    public CharSequence getImageRecipeArn() {
        return imageRecipeArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn
     * 
     */
    @JsonIgnore
    public void setImageRecipeArn(CharSequence imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    public Image withImageRecipeArn(CharSequence imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn
     * 
     */
    @JsonIgnore
    public CharSequence getDistributionConfigurationArn() {
        return distributionConfigurationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn
     * 
     */
    @JsonIgnore
    public void setDistributionConfigurationArn(CharSequence distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    public Image withDistributionConfigurationArn(CharSequence distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn
     * 
     */
    @JsonIgnore
    public CharSequence getInfrastructureConfigurationArn() {
        return infrastructureConfigurationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn
     * 
     */
    @JsonIgnore
    public void setInfrastructureConfigurationArn(CharSequence infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    public Image withInfrastructureConfigurationArn(CharSequence infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags
     * 
     */
    @JsonIgnore
    public void setTags(Map<String, CharSequence> tags) {
        this.tags = tags;
    }

    public Image withTags(Map<String, CharSequence> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("imageTestsConfiguration", imageTestsConfiguration).append("imageRecipeArn", imageRecipeArn).append("distributionConfigurationArn", distributionConfigurationArn).append("infrastructureConfigurationArn", infrastructureConfigurationArn).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(infrastructureConfigurationArn).append(imageRecipeArn).append(imageTestsConfiguration).append(distributionConfigurationArn).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return new EqualsBuilder().append(infrastructureConfigurationArn, rhs.infrastructureConfigurationArn).append(imageRecipeArn, rhs.imageRecipeArn).append(imageTestsConfiguration, rhs.imageTestsConfiguration).append(distributionConfigurationArn, rhs.distributionConfigurationArn).append(tags, rhs.tags).isEquals();
    }

}
