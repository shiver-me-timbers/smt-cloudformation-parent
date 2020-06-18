
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
 * ResourceDefinitionSageMakerMachineLearningModelResourceData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OwnerSetting",
    "DestinationPath",
    "SageMakerJobArn"
})
public class ResourceDefinitionSageMakerMachineLearningModelResourceData implements Property<ResourceDefinitionSageMakerMachineLearningModelResourceData>
{

    /**
     * ResourceDefinitionVersionResourceDownloadOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html
     * 
     */
    @JsonProperty("OwnerSetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html")
    private Property<ResourceDefinitionResourceDownloadOwnerSetting> ownerSetting;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonProperty("DestinationPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-destinationpath")
    private CharSequence destinationPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-sagemakerjobarn
     * 
     */
    @JsonProperty("SageMakerJobArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-sagemakerjobarn")
    private CharSequence sageMakerJobArn;

    /**
     * ResourceDefinitionVersionResourceDownloadOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionResourceDownloadOwnerSetting> getOwnerSetting() {
        return ownerSetting;
    }

    /**
     * ResourceDefinitionVersionResourceDownloadOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html
     * 
     */
    @JsonIgnore
    public void setOwnerSetting(Property<ResourceDefinitionResourceDownloadOwnerSetting> ownerSetting) {
        this.ownerSetting = ownerSetting;
    }

    public ResourceDefinitionSageMakerMachineLearningModelResourceData withOwnerSetting(Property<ResourceDefinitionResourceDownloadOwnerSetting> ownerSetting) {
        this.ownerSetting = ownerSetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationPath() {
        return destinationPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonIgnore
    public void setDestinationPath(CharSequence destinationPath) {
        this.destinationPath = destinationPath;
    }

    public ResourceDefinitionSageMakerMachineLearningModelResourceData withDestinationPath(CharSequence destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-sagemakerjobarn
     * 
     */
    @JsonIgnore
    public CharSequence getSageMakerJobArn() {
        return sageMakerJobArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-sagemakerjobarn
     * 
     */
    @JsonIgnore
    public void setSageMakerJobArn(CharSequence sageMakerJobArn) {
        this.sageMakerJobArn = sageMakerJobArn;
    }

    public ResourceDefinitionSageMakerMachineLearningModelResourceData withSageMakerJobArn(CharSequence sageMakerJobArn) {
        this.sageMakerJobArn = sageMakerJobArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ownerSetting", ownerSetting).append("destinationPath", destinationPath).append("sageMakerJobArn", sageMakerJobArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ownerSetting).append(destinationPath).append(sageMakerJobArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionSageMakerMachineLearningModelResourceData) == false) {
            return false;
        }
        ResourceDefinitionSageMakerMachineLearningModelResourceData rhs = ((ResourceDefinitionSageMakerMachineLearningModelResourceData) other);
        return new EqualsBuilder().append(ownerSetting, rhs.ownerSetting).append(destinationPath, rhs.destinationPath).append(sageMakerJobArn, rhs.sageMakerJobArn).isEquals();
    }

}
