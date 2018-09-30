
package aws.sagemaker;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ContainerDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContainerHostname",
    "Environment",
    "ModelDataUrl",
    "Image"
})
public class ContainerDefinition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname
     * 
     */
    @JsonProperty("ContainerHostname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname")
    private CharSequence containerHostname;
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
    public CharSequence getContainerHostname() {
        return containerHostname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-containerhostname
     * 
     */
    public void setContainerHostname(CharSequence containerHostname) {
        this.containerHostname = containerHostname;
    }

    public ContainerDefinition withContainerHostname(CharSequence containerHostname) {
        this.containerHostname = containerHostname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment
     * 
     */
    public Object getEnvironment() {
        return environment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-environment
     * 
     */
    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    public ContainerDefinition withEnvironment(Object environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl
     * 
     */
    public CharSequence getModelDataUrl() {
        return modelDataUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-modeldataurl
     * 
     */
    public void setModelDataUrl(CharSequence modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
    }

    public ContainerDefinition withModelDataUrl(CharSequence modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image
     * 
     */
    public CharSequence getImage() {
        return image;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html#cfn-sagemaker-model-containerdefinition-image
     * 
     */
    public void setImage(CharSequence image) {
        this.image = image;
    }

    public ContainerDefinition withImage(CharSequence image) {
        this.image = image;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("containerHostname", containerHostname).append("environment", environment).append("modelDataUrl", modelDataUrl).append("image", image).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containerHostname).append(image).append(environment).append(modelDataUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContainerDefinition) == false) {
            return false;
        }
        ContainerDefinition rhs = ((ContainerDefinition) other);
        return new EqualsBuilder().append(containerHostname, rhs.containerHostname).append(image, rhs.image).append(environment, rhs.environment).append(modelDataUrl, rhs.modelDataUrl).isEquals();
    }

}
