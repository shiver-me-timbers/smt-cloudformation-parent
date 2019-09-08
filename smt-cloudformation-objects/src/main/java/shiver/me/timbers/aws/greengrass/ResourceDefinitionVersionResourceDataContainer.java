
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
 * ResourceDefinitionVersionResourceDataContainer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SecretsManagerSecretResourceData",
    "SageMakerMachineLearningModelResourceData",
    "LocalVolumeResourceData",
    "LocalDeviceResourceData",
    "S3MachineLearningModelResourceData"
})
public class ResourceDefinitionVersionResourceDataContainer implements Property<ResourceDefinitionVersionResourceDataContainer>
{

    /**
     * ResourceDefinitionVersionSecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonProperty("SecretsManagerSecretResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html")
    private Property<ResourceDefinitionVersionSecretsManagerSecretResourceData> secretsManagerSecretResourceData;
    /**
     * ResourceDefinitionVersionSageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonProperty("SageMakerMachineLearningModelResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html")
    private Property<ResourceDefinitionVersionSageMakerMachineLearningModelResourceData> sageMakerMachineLearningModelResourceData;
    /**
     * ResourceDefinitionVersionLocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html
     * 
     */
    @JsonProperty("LocalVolumeResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html")
    private Property<ResourceDefinitionVersionLocalVolumeResourceData> localVolumeResourceData;
    /**
     * ResourceDefinitionVersionLocalDeviceResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
     * 
     */
    @JsonProperty("LocalDeviceResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html")
    private Property<ResourceDefinitionVersionLocalDeviceResourceData> localDeviceResourceData;
    /**
     * ResourceDefinitionVersionS3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonProperty("S3MachineLearningModelResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html")
    private Property<ResourceDefinitionVersionS3MachineLearningModelResourceData> s3MachineLearningModelResourceData;

    /**
     * ResourceDefinitionVersionSecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionVersionSecretsManagerSecretResourceData> getSecretsManagerSecretResourceData() {
        return secretsManagerSecretResourceData;
    }

    /**
     * ResourceDefinitionVersionSecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonIgnore
    public void setSecretsManagerSecretResourceData(Property<ResourceDefinitionVersionSecretsManagerSecretResourceData> secretsManagerSecretResourceData) {
        this.secretsManagerSecretResourceData = secretsManagerSecretResourceData;
    }

    public ResourceDefinitionVersionResourceDataContainer withSecretsManagerSecretResourceData(Property<ResourceDefinitionVersionSecretsManagerSecretResourceData> secretsManagerSecretResourceData) {
        this.secretsManagerSecretResourceData = secretsManagerSecretResourceData;
        return this;
    }

    /**
     * ResourceDefinitionVersionSageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionVersionSageMakerMachineLearningModelResourceData> getSageMakerMachineLearningModelResourceData() {
        return sageMakerMachineLearningModelResourceData;
    }

    /**
     * ResourceDefinitionVersionSageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public void setSageMakerMachineLearningModelResourceData(Property<ResourceDefinitionVersionSageMakerMachineLearningModelResourceData> sageMakerMachineLearningModelResourceData) {
        this.sageMakerMachineLearningModelResourceData = sageMakerMachineLearningModelResourceData;
    }

    public ResourceDefinitionVersionResourceDataContainer withSageMakerMachineLearningModelResourceData(Property<ResourceDefinitionVersionSageMakerMachineLearningModelResourceData> sageMakerMachineLearningModelResourceData) {
        this.sageMakerMachineLearningModelResourceData = sageMakerMachineLearningModelResourceData;
        return this;
    }

    /**
     * ResourceDefinitionVersionLocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionVersionLocalVolumeResourceData> getLocalVolumeResourceData() {
        return localVolumeResourceData;
    }

    /**
     * ResourceDefinitionVersionLocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html
     * 
     */
    @JsonIgnore
    public void setLocalVolumeResourceData(Property<ResourceDefinitionVersionLocalVolumeResourceData> localVolumeResourceData) {
        this.localVolumeResourceData = localVolumeResourceData;
    }

    public ResourceDefinitionVersionResourceDataContainer withLocalVolumeResourceData(Property<ResourceDefinitionVersionLocalVolumeResourceData> localVolumeResourceData) {
        this.localVolumeResourceData = localVolumeResourceData;
        return this;
    }

    /**
     * ResourceDefinitionVersionLocalDeviceResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionVersionLocalDeviceResourceData> getLocalDeviceResourceData() {
        return localDeviceResourceData;
    }

    /**
     * ResourceDefinitionVersionLocalDeviceResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
     * 
     */
    @JsonIgnore
    public void setLocalDeviceResourceData(Property<ResourceDefinitionVersionLocalDeviceResourceData> localDeviceResourceData) {
        this.localDeviceResourceData = localDeviceResourceData;
    }

    public ResourceDefinitionVersionResourceDataContainer withLocalDeviceResourceData(Property<ResourceDefinitionVersionLocalDeviceResourceData> localDeviceResourceData) {
        this.localDeviceResourceData = localDeviceResourceData;
        return this;
    }

    /**
     * ResourceDefinitionVersionS3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionVersionS3MachineLearningModelResourceData> getS3MachineLearningModelResourceData() {
        return s3MachineLearningModelResourceData;
    }

    /**
     * ResourceDefinitionVersionS3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public void setS3MachineLearningModelResourceData(Property<ResourceDefinitionVersionS3MachineLearningModelResourceData> s3MachineLearningModelResourceData) {
        this.s3MachineLearningModelResourceData = s3MachineLearningModelResourceData;
    }

    public ResourceDefinitionVersionResourceDataContainer withS3MachineLearningModelResourceData(Property<ResourceDefinitionVersionS3MachineLearningModelResourceData> s3MachineLearningModelResourceData) {
        this.s3MachineLearningModelResourceData = s3MachineLearningModelResourceData;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("secretsManagerSecretResourceData", secretsManagerSecretResourceData).append("sageMakerMachineLearningModelResourceData", sageMakerMachineLearningModelResourceData).append("localVolumeResourceData", localVolumeResourceData).append("localDeviceResourceData", localDeviceResourceData).append("s3MachineLearningModelResourceData", s3MachineLearningModelResourceData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secretsManagerSecretResourceData).append(sageMakerMachineLearningModelResourceData).append(localDeviceResourceData).append(s3MachineLearningModelResourceData).append(localVolumeResourceData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionVersionResourceDataContainer) == false) {
            return false;
        }
        ResourceDefinitionVersionResourceDataContainer rhs = ((ResourceDefinitionVersionResourceDataContainer) other);
        return new EqualsBuilder().append(secretsManagerSecretResourceData, rhs.secretsManagerSecretResourceData).append(sageMakerMachineLearningModelResourceData, rhs.sageMakerMachineLearningModelResourceData).append(localDeviceResourceData, rhs.localDeviceResourceData).append(s3MachineLearningModelResourceData, rhs.s3MachineLearningModelResourceData).append(localVolumeResourceData, rhs.localVolumeResourceData).isEquals();
    }

}
