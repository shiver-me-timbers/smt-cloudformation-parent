
package aws.sagemaker;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Model
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ExecutionRoleArn",
    "PrimaryContainer",
    "ModelName",
    "VpcConfig",
    "Tags"
})
public class Model {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn
     * 
     */
    @JsonProperty("ExecutionRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn")
    private CharSequence executionRoleArn;
    /**
     * ContainerDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html
     * 
     */
    @JsonProperty("PrimaryContainer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html")
    private ContainerDefinition primaryContainer;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname
     * 
     */
    @JsonProperty("ModelName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname")
    private CharSequence modelName;
    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html")
    private VpcConfig vpcConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn
     * 
     */
    public CharSequence getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn
     * 
     */
    public void setExecutionRoleArn(CharSequence executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    public Model withExecutionRoleArn(CharSequence executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * ContainerDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html
     * 
     */
    public ContainerDefinition getPrimaryContainer() {
        return primaryContainer;
    }

    /**
     * ContainerDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html
     * 
     */
    public void setPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
    }

    public Model withPrimaryContainer(ContainerDefinition primaryContainer) {
        this.primaryContainer = primaryContainer;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname
     * 
     */
    public CharSequence getModelName() {
        return modelName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname
     * 
     */
    public void setModelName(CharSequence modelName) {
        this.modelName = modelName;
    }

    public Model withModelName(CharSequence modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html
     * 
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * VpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html
     * 
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public Model withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Model withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("executionRoleArn", executionRoleArn).append("primaryContainer", primaryContainer).append("modelName", modelName).append("vpcConfig", vpcConfig).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(modelName).append(executionRoleArn).append(primaryContainer).append(vpcConfig).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Model) == false) {
            return false;
        }
        Model rhs = ((Model) other);
        return new EqualsBuilder().append(modelName, rhs.modelName).append(executionRoleArn, rhs.executionRoleArn).append(primaryContainer, rhs.primaryContainer).append(vpcConfig, rhs.vpcConfig).append(tags, rhs.tags).isEquals();
    }

}
