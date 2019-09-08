
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
 * ResourceDefinitionResourceDataContainer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html
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
public class ResourceDefinitionResourceDataContainer implements Property<ResourceDefinitionResourceDataContainer>
{

    /**
     * ResourceDefinitionSecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonProperty("SecretsManagerSecretResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html")
    private Property<ResourceDefinitionSecretsManagerSecretResourceData> secretsManagerSecretResourceData;
    /**
     * ResourceDefinitionSageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonProperty("SageMakerMachineLearningModelResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html")
    private Property<ResourceDefinitionSageMakerMachineLearningModelResourceData> sageMakerMachineLearningModelResourceData;
    /**
     * ResourceDefinitionLocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html
     * 
     */
    @JsonProperty("LocalVolumeResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html")
    private Property<ResourceDefinitionLocalVolumeResourceData> localVolumeResourceData;
    /**
     * ResourceDefinitionVersionLocalDeviceResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
     * 
     */
    @JsonProperty("LocalDeviceResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html")
    private Property<ResourceDefinitionLocalDeviceResourceData> localDeviceResourceData;
    /**
     * ResourceDefinitionS3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonProperty("S3MachineLearningModelResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html")
    private Property<ResourceDefinitionS3MachineLearningModelResourceData> s3MachineLearningModelResourceData;

    /**
     * ResourceDefinitionSecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionSecretsManagerSecretResourceData> getSecretsManagerSecretResourceData() {
        return secretsManagerSecretResourceData;
    }

    /**
     * ResourceDefinitionSecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonIgnore
    public void setSecretsManagerSecretResourceData(Property<ResourceDefinitionSecretsManagerSecretResourceData> secretsManagerSecretResourceData) {
        this.secretsManagerSecretResourceData = secretsManagerSecretResourceData;
    }

    public ResourceDefinitionResourceDataContainer withSecretsManagerSecretResourceData(Property<ResourceDefinitionSecretsManagerSecretResourceData> secretsManagerSecretResourceData) {
        this.secretsManagerSecretResourceData = secretsManagerSecretResourceData;
        return this;
    }

    /**
     * ResourceDefinitionSageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionSageMakerMachineLearningModelResourceData> getSageMakerMachineLearningModelResourceData() {
        return sageMakerMachineLearningModelResourceData;
    }

    /**
     * ResourceDefinitionSageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public void setSageMakerMachineLearningModelResourceData(Property<ResourceDefinitionSageMakerMachineLearningModelResourceData> sageMakerMachineLearningModelResourceData) {
        this.sageMakerMachineLearningModelResourceData = sageMakerMachineLearningModelResourceData;
    }

    public ResourceDefinitionResourceDataContainer withSageMakerMachineLearningModelResourceData(Property<ResourceDefinitionSageMakerMachineLearningModelResourceData> sageMakerMachineLearningModelResourceData) {
        this.sageMakerMachineLearningModelResourceData = sageMakerMachineLearningModelResourceData;
        return this;
    }

    /**
     * ResourceDefinitionLocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionLocalVolumeResourceData> getLocalVolumeResourceData() {
        return localVolumeResourceData;
    }

    /**
     * ResourceDefinitionLocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html
     * 
     */
    @JsonIgnore
    public void setLocalVolumeResourceData(Property<ResourceDefinitionLocalVolumeResourceData> localVolumeResourceData) {
        this.localVolumeResourceData = localVolumeResourceData;
    }

    public ResourceDefinitionResourceDataContainer withLocalVolumeResourceData(Property<ResourceDefinitionLocalVolumeResourceData> localVolumeResourceData) {
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
    public Property<ResourceDefinitionLocalDeviceResourceData> getLocalDeviceResourceData() {
        return localDeviceResourceData;
    }

    /**
     * ResourceDefinitionVersionLocalDeviceResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
     * 
     */
    @JsonIgnore
    public void setLocalDeviceResourceData(Property<ResourceDefinitionLocalDeviceResourceData> localDeviceResourceData) {
        this.localDeviceResourceData = localDeviceResourceData;
    }

    public ResourceDefinitionResourceDataContainer withLocalDeviceResourceData(Property<ResourceDefinitionLocalDeviceResourceData> localDeviceResourceData) {
        this.localDeviceResourceData = localDeviceResourceData;
        return this;
    }

    /**
     * ResourceDefinitionS3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionS3MachineLearningModelResourceData> getS3MachineLearningModelResourceData() {
        return s3MachineLearningModelResourceData;
    }

    /**
     * ResourceDefinitionS3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public void setS3MachineLearningModelResourceData(Property<ResourceDefinitionS3MachineLearningModelResourceData> s3MachineLearningModelResourceData) {
        this.s3MachineLearningModelResourceData = s3MachineLearningModelResourceData;
    }

    public ResourceDefinitionResourceDataContainer withS3MachineLearningModelResourceData(Property<ResourceDefinitionS3MachineLearningModelResourceData> s3MachineLearningModelResourceData) {
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
        if ((other instanceof ResourceDefinitionResourceDataContainer) == false) {
            return false;
        }
        ResourceDefinitionResourceDataContainer rhs = ((ResourceDefinitionResourceDataContainer) other);
        return new EqualsBuilder().append(secretsManagerSecretResourceData, rhs.secretsManagerSecretResourceData).append(sageMakerMachineLearningModelResourceData, rhs.sageMakerMachineLearningModelResourceData).append(localDeviceResourceData, rhs.localDeviceResourceData).append(s3MachineLearningModelResourceData, rhs.s3MachineLearningModelResourceData).append(localVolumeResourceData, rhs.localVolumeResourceData).isEquals();
    }

}
