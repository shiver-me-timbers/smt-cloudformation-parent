
package shiver.me.timbers.aws.greengrass;

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
 * ResourceDefinitionVersionSageMakerMachineLearningModelResourceData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DestinationPath",
    "SageMakerJobArn"
})
public class ResourceDefinitionVersionSageMakerMachineLearningModelResourceData implements Property<ResourceDefinitionVersionSageMakerMachineLearningModelResourceData>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonProperty("DestinationPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-destinationpath")
    private CharSequence destinationPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-sagemakerjobarn
     * 
     */
    @JsonProperty("SageMakerJobArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-sagemakerjobarn")
    private CharSequence sageMakerJobArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationPath() {
        return destinationPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonIgnore
    public void setDestinationPath(CharSequence destinationPath) {
        this.destinationPath = destinationPath;
    }

    public ResourceDefinitionVersionSageMakerMachineLearningModelResourceData withDestinationPath(CharSequence destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-sagemakerjobarn
     * 
     */
    @JsonIgnore
    public CharSequence getSageMakerJobArn() {
        return sageMakerJobArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-sagemakerjobarn
     * 
     */
    @JsonIgnore
    public void setSageMakerJobArn(CharSequence sageMakerJobArn) {
        this.sageMakerJobArn = sageMakerJobArn;
    }

    public ResourceDefinitionVersionSageMakerMachineLearningModelResourceData withSageMakerJobArn(CharSequence sageMakerJobArn) {
        this.sageMakerJobArn = sageMakerJobArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationPath", destinationPath).append("sageMakerJobArn", sageMakerJobArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationPath).append(sageMakerJobArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionVersionSageMakerMachineLearningModelResourceData) == false) {
            return false;
        }
        ResourceDefinitionVersionSageMakerMachineLearningModelResourceData rhs = ((ResourceDefinitionVersionSageMakerMachineLearningModelResourceData) other);
        return new EqualsBuilder().append(destinationPath, rhs.destinationPath).append(sageMakerJobArn, rhs.sageMakerJobArn).isEquals();
    }

}
