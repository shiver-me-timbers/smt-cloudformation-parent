
package aws.greengrass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ResourceDataContainer
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
public class ResourceDataContainer {

    /**
     * SecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonProperty("SecretsManagerSecretResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html")
    private SecretsManagerSecretResourceData secretsManagerSecretResourceData;
    /**
     * SageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonProperty("SageMakerMachineLearningModelResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html")
    private SageMakerMachineLearningModelResourceData sageMakerMachineLearningModelResourceData;
    /**
     * LocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html
     * 
     */
    @JsonProperty("LocalVolumeResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html")
    private LocalVolumeResourceData localVolumeResourceData;
    /**
     * LocalDeviceResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
     * 
     */
    @JsonProperty("LocalDeviceResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html")
    private LocalDeviceResourceData localDeviceResourceData;
    /**
     * S3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonProperty("S3MachineLearningModelResourceData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html")
    private S3MachineLearningModelResourceData s3MachineLearningModelResourceData;

    /**
     * SecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonIgnore
    public SecretsManagerSecretResourceData getSecretsManagerSecretResourceData() {
        return secretsManagerSecretResourceData;
    }

    /**
     * SecretsManagerSecretResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html
     * 
     */
    @JsonIgnore
    public void setSecretsManagerSecretResourceData(SecretsManagerSecretResourceData secretsManagerSecretResourceData) {
        this.secretsManagerSecretResourceData = secretsManagerSecretResourceData;
    }

    public ResourceDataContainer withSecretsManagerSecretResourceData(SecretsManagerSecretResourceData secretsManagerSecretResourceData) {
        this.secretsManagerSecretResourceData = secretsManagerSecretResourceData;
        return this;
    }

    /**
     * SageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public SageMakerMachineLearningModelResourceData getSageMakerMachineLearningModelResourceData() {
        return sageMakerMachineLearningModelResourceData;
    }

    /**
     * SageMakerMachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public void setSageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceData sageMakerMachineLearningModelResourceData) {
        this.sageMakerMachineLearningModelResourceData = sageMakerMachineLearningModelResourceData;
    }

    public ResourceDataContainer withSageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceData sageMakerMachineLearningModelResourceData) {
        this.sageMakerMachineLearningModelResourceData = sageMakerMachineLearningModelResourceData;
        return this;
    }

    /**
     * LocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html
     * 
     */
    @JsonIgnore
    public LocalVolumeResourceData getLocalVolumeResourceData() {
        return localVolumeResourceData;
    }

    /**
     * LocalVolumeResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html
     * 
     */
    @JsonIgnore
    public void setLocalVolumeResourceData(LocalVolumeResourceData localVolumeResourceData) {
        this.localVolumeResourceData = localVolumeResourceData;
    }

    public ResourceDataContainer withLocalVolumeResourceData(LocalVolumeResourceData localVolumeResourceData) {
        this.localVolumeResourceData = localVolumeResourceData;
        return this;
    }

    /**
     * LocalDeviceResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
     * 
     */
    @JsonIgnore
    public LocalDeviceResourceData getLocalDeviceResourceData() {
        return localDeviceResourceData;
    }

    /**
     * LocalDeviceResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
     * 
     */
    @JsonIgnore
    public void setLocalDeviceResourceData(LocalDeviceResourceData localDeviceResourceData) {
        this.localDeviceResourceData = localDeviceResourceData;
    }

    public ResourceDataContainer withLocalDeviceResourceData(LocalDeviceResourceData localDeviceResourceData) {
        this.localDeviceResourceData = localDeviceResourceData;
        return this;
    }

    /**
     * S3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public S3MachineLearningModelResourceData getS3MachineLearningModelResourceData() {
        return s3MachineLearningModelResourceData;
    }

    /**
     * S3MachineLearningModelResourceData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html
     * 
     */
    @JsonIgnore
    public void setS3MachineLearningModelResourceData(S3MachineLearningModelResourceData s3MachineLearningModelResourceData) {
        this.s3MachineLearningModelResourceData = s3MachineLearningModelResourceData;
    }

    public ResourceDataContainer withS3MachineLearningModelResourceData(S3MachineLearningModelResourceData s3MachineLearningModelResourceData) {
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
        if ((other instanceof ResourceDataContainer) == false) {
            return false;
        }
        ResourceDataContainer rhs = ((ResourceDataContainer) other);
        return new EqualsBuilder().append(secretsManagerSecretResourceData, rhs.secretsManagerSecretResourceData).append(sageMakerMachineLearningModelResourceData, rhs.sageMakerMachineLearningModelResourceData).append(localDeviceResourceData, rhs.localDeviceResourceData).append(s3MachineLearningModelResourceData, rhs.s3MachineLearningModelResourceData).append(localVolumeResourceData, rhs.localVolumeResourceData).isEquals();
    }

}
