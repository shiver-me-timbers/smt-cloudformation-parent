
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
 * ImagePipeline
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Name",
    "Description",
    "ImageTestsConfiguration",
    "Status",
    "Schedule",
    "ImageRecipeArn",
    "DistributionConfigurationArn",
    "InfrastructureConfigurationArn",
    "Tags"
})
public class ImagePipeline {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description")
    private CharSequence description;
    /**
     * ImagePipelineImageTestsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html
     * 
     */
    @JsonProperty("ImageTestsConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html")
    private Property<ImagePipelineImageTestsConfiguration> imageTestsConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status")
    private CharSequence status;
    /**
     * ImagePipelineSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html")
    private Property<ImagePipelineSchedule> schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn
     * 
     */
    @JsonProperty("ImageRecipeArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn")
    private CharSequence imageRecipeArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-distributionconfigurationarn
     * 
     */
    @JsonProperty("DistributionConfigurationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-distributionconfigurationarn")
    private CharSequence distributionConfigurationArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn
     * 
     */
    @JsonProperty("InfrastructureConfigurationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn")
    private CharSequence infrastructureConfigurationArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags")
    private Map<String, CharSequence> tags;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ImagePipeline withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ImagePipeline withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * ImagePipelineImageTestsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ImagePipelineImageTestsConfiguration> getImageTestsConfiguration() {
        return imageTestsConfiguration;
    }

    /**
     * ImagePipelineImageTestsConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html
     * 
     */
    @JsonIgnore
    public void setImageTestsConfiguration(Property<ImagePipelineImageTestsConfiguration> imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    public ImagePipeline withImageTestsConfiguration(Property<ImagePipelineImageTestsConfiguration> imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status
     * 
     */
    @JsonIgnore
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status
     * 
     */
    @JsonIgnore
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public ImagePipeline withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    /**
     * ImagePipelineSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html
     * 
     */
    @JsonIgnore
    public Property<ImagePipelineSchedule> getSchedule() {
        return schedule;
    }

    /**
     * ImagePipelineSchedule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html
     * 
     */
    @JsonIgnore
    public void setSchedule(Property<ImagePipelineSchedule> schedule) {
        this.schedule = schedule;
    }

    public ImagePipeline withSchedule(Property<ImagePipelineSchedule> schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn
     * 
     */
    @JsonIgnore
    public CharSequence getImageRecipeArn() {
        return imageRecipeArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn
     * 
     */
    @JsonIgnore
    public void setImageRecipeArn(CharSequence imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    public ImagePipeline withImageRecipeArn(CharSequence imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-distributionconfigurationarn
     * 
     */
    @JsonIgnore
    public CharSequence getDistributionConfigurationArn() {
        return distributionConfigurationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-distributionconfigurationarn
     * 
     */
    @JsonIgnore
    public void setDistributionConfigurationArn(CharSequence distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    public ImagePipeline withDistributionConfigurationArn(CharSequence distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn
     * 
     */
    @JsonIgnore
    public CharSequence getInfrastructureConfigurationArn() {
        return infrastructureConfigurationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn
     * 
     */
    @JsonIgnore
    public void setInfrastructureConfigurationArn(CharSequence infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    public ImagePipeline withInfrastructureConfigurationArn(CharSequence infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags
     * 
     */
    @JsonIgnore
    public Map<String, CharSequence> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags
     * 
     */
    @JsonIgnore
    public void setTags(Map<String, CharSequence> tags) {
        this.tags = tags;
    }

    public ImagePipeline withTags(Map<String, CharSequence> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("name", name).append("description", description).append("imageTestsConfiguration", imageTestsConfiguration).append("status", status).append("schedule", schedule).append("imageRecipeArn", imageRecipeArn).append("distributionConfigurationArn", distributionConfigurationArn).append("infrastructureConfigurationArn", infrastructureConfigurationArn).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schedule).append(distributionConfigurationArn).append(name).append(description).append(infrastructureConfigurationArn).append(imageRecipeArn).append(imageTestsConfiguration).append(status).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagePipeline) == false) {
            return false;
        }
        ImagePipeline rhs = ((ImagePipeline) other);
        return new EqualsBuilder().append(schedule, rhs.schedule).append(distributionConfigurationArn, rhs.distributionConfigurationArn).append(name, rhs.name).append(description, rhs.description).append(infrastructureConfigurationArn, rhs.infrastructureConfigurationArn).append(imageRecipeArn, rhs.imageRecipeArn).append(imageTestsConfiguration, rhs.imageTestsConfiguration).append(status, rhs.status).append(tags, rhs.tags).isEquals();
    }

}
