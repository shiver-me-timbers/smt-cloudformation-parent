
package shiver.me.timbers.aws.sagemaker;

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
 * ModelContainerDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContainerHostname",
    "Mode",
    "Environment",
    "ModelDataUrl",
    "Image"
})
public class ModelContainerDefinition implements Property<ModelContainerDefinition>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname
     * 
     */
    @JsonProperty("ContainerHostname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname")
    private CharSequence containerHostname;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-mode
     * 
     */
    @JsonProperty("Mode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-mode")
    private CharSequence mode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment
     * 
     */
    @JsonProperty("Environment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment")
    private Object environment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl
     * 
     */
    @JsonProperty("ModelDataUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl")
    private CharSequence modelDataUrl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image
     * 
     */
    @JsonProperty("Image")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image")
    private CharSequence image;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname
     * 
     */
    @JsonIgnore
    public CharSequence getContainerHostname() {
        return containerHostname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname
     * 
     */
    @JsonIgnore
    public void setContainerHostname(CharSequence containerHostname) {
        this.containerHostname = containerHostname;
    }

    public ModelContainerDefinition withContainerHostname(CharSequence containerHostname) {
        this.containerHostname = containerHostname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-mode
     * 
     */
    @JsonIgnore
    public CharSequence getMode() {
        return mode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-mode
     * 
     */
    @JsonIgnore
    public void setMode(CharSequence mode) {
        this.mode = mode;
    }

    public ModelContainerDefinition withMode(CharSequence mode) {
        this.mode = mode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment
     * 
     */
    @JsonIgnore
    public Object getEnvironment() {
        return environment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment
     * 
     */
    @JsonIgnore
    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    public ModelContainerDefinition withEnvironment(Object environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl
     * 
     */
    @JsonIgnore
    public CharSequence getModelDataUrl() {
        return modelDataUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl
     * 
     */
    @JsonIgnore
    public void setModelDataUrl(CharSequence modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
    }

    public ModelContainerDefinition withModelDataUrl(CharSequence modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image
     * 
     */
    @JsonIgnore
    public CharSequence getImage() {
        return image;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image
     * 
     */
    @JsonIgnore
    public void setImage(CharSequence image) {
        this.image = image;
    }

    public ModelContainerDefinition withImage(CharSequence image) {
        this.image = image;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerHostname", containerHostname).append("mode", mode).append("environment", environment).append("modelDataUrl", modelDataUrl).append("image", image).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containerHostname).append(mode).append(image).append(environment).append(modelDataUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ModelContainerDefinition) == false) {
            return false;
        }
        ModelContainerDefinition rhs = ((ModelContainerDefinition) other);
        return new EqualsBuilder().append(containerHostname, rhs.containerHostname).append(mode, rhs.mode).append(image, rhs.image).append(environment, rhs.environment).append(modelDataUrl, rhs.modelDataUrl).isEquals();
    }

}
