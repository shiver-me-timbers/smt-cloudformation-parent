
package shiver.me.timbers.aws.sagemaker;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Model
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ExecutionRoleArn",
    "PrimaryContainer",
    "ModelName",
    "VpcConfig",
    "Containers",
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
     * ModelContainerDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html
     * 
     */
    @JsonProperty("PrimaryContainer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html")
    private Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition> primaryContainer;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname
     * 
     */
    @JsonProperty("ModelName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname")
    private CharSequence modelName;
    /**
     * ModelVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html")
    private Property<ModelVpcConfig> vpcConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers
     * 
     */
    @JsonProperty("Containers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers")
    private List<Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition>> containers = new ArrayList<Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn
     * 
     */
    @JsonIgnore
    public void setExecutionRoleArn(CharSequence executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    public Model withExecutionRoleArn(CharSequence executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * ModelContainerDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition> getPrimaryContainer() {
        return primaryContainer;
    }

    /**
     * ModelContainerDefinition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html
     * 
     */
    @JsonIgnore
    public void setPrimaryContainer(Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition> primaryContainer) {
        this.primaryContainer = primaryContainer;
    }

    public Model withPrimaryContainer(Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition> primaryContainer) {
        this.primaryContainer = primaryContainer;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname
     * 
     */
    @JsonIgnore
    public CharSequence getModelName() {
        return modelName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname
     * 
     */
    @JsonIgnore
    public void setModelName(CharSequence modelName) {
        this.modelName = modelName;
    }

    public Model withModelName(CharSequence modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * ModelVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html
     * 
     */
    @JsonIgnore
    public Property<ModelVpcConfig> getVpcConfig() {
        return vpcConfig;
    }

    /**
     * ModelVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html
     * 
     */
    @JsonIgnore
    public void setVpcConfig(Property<ModelVpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public Model withVpcConfig(Property<ModelVpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers
     * 
     */
    @JsonIgnore
    public List<Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition>> getContainers() {
        return containers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers
     * 
     */
    @JsonIgnore
    public void setContainers(List<Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition>> containers) {
        this.containers = containers;
    }

    public Model withContainers(List<Property<shiver.me.timbers.aws.sagemaker.ModelContainerDefinition>> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Model withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("executionRoleArn", executionRoleArn).append("primaryContainer", primaryContainer).append("modelName", modelName).append("vpcConfig", vpcConfig).append("containers", containers).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(modelName).append(executionRoleArn).append(primaryContainer).append(vpcConfig).append(containers).append(tags).toHashCode();
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
        return new EqualsBuilder().append(modelName, rhs.modelName).append(executionRoleArn, rhs.executionRoleArn).append(primaryContainer, rhs.primaryContainer).append(vpcConfig, rhs.vpcConfig).append(containers, rhs.containers).append(tags, rhs.tags).isEquals();
    }

}
