
package aws.codebuild;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ProjectEnvironment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "EnvironmentVariables",
    "PrivilegedMode",
    "ImagePullCredentialsType",
    "Image",
    "RegistryCredential",
    "ComputeType",
    "Certificate"
})
public class ProjectEnvironment implements Property<ProjectEnvironment>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables
     * 
     */
    @JsonProperty("EnvironmentVariables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables")
    private List<Property<ProjectEnvironmentVariable>> environmentVariables = new ArrayList<Property<ProjectEnvironmentVariable>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode
     * 
     */
    @JsonProperty("PrivilegedMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode")
    private CharSequence privilegedMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-imagepullcredentialstype
     * 
     */
    @JsonProperty("ImagePullCredentialsType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-imagepullcredentialstype")
    private CharSequence imagePullCredentialsType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image
     * 
     */
    @JsonProperty("Image")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image")
    private CharSequence image;
    /**
     * ProjectRegistryCredential
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html
     * 
     */
    @JsonProperty("RegistryCredential")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html")
    private Property<ProjectRegistryCredential> registryCredential;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype
     * 
     */
    @JsonProperty("ComputeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype")
    private CharSequence computeType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate
     * 
     */
    @JsonProperty("Certificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate")
    private CharSequence certificate;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ProjectEnvironment withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables
     * 
     */
    @JsonIgnore
    public List<Property<ProjectEnvironmentVariable>> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables
     * 
     */
    @JsonIgnore
    public void setEnvironmentVariables(List<Property<ProjectEnvironmentVariable>> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public ProjectEnvironment withEnvironmentVariables(List<Property<ProjectEnvironmentVariable>> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode
     * 
     */
    @JsonIgnore
    public CharSequence getPrivilegedMode() {
        return privilegedMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode
     * 
     */
    @JsonIgnore
    public void setPrivilegedMode(CharSequence privilegedMode) {
        this.privilegedMode = privilegedMode;
    }

    public ProjectEnvironment withPrivilegedMode(CharSequence privilegedMode) {
        this.privilegedMode = privilegedMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-imagepullcredentialstype
     * 
     */
    @JsonIgnore
    public CharSequence getImagePullCredentialsType() {
        return imagePullCredentialsType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-imagepullcredentialstype
     * 
     */
    @JsonIgnore
    public void setImagePullCredentialsType(CharSequence imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType;
    }

    public ProjectEnvironment withImagePullCredentialsType(CharSequence imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image
     * 
     */
    @JsonIgnore
    public CharSequence getImage() {
        return image;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image
     * 
     */
    @JsonIgnore
    public void setImage(CharSequence image) {
        this.image = image;
    }

    public ProjectEnvironment withImage(CharSequence image) {
        this.image = image;
        return this;
    }

    /**
     * ProjectRegistryCredential
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html
     * 
     */
    @JsonIgnore
    public Property<ProjectRegistryCredential> getRegistryCredential() {
        return registryCredential;
    }

    /**
     * ProjectRegistryCredential
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html
     * 
     */
    @JsonIgnore
    public void setRegistryCredential(Property<ProjectRegistryCredential> registryCredential) {
        this.registryCredential = registryCredential;
    }

    public ProjectEnvironment withRegistryCredential(Property<ProjectRegistryCredential> registryCredential) {
        this.registryCredential = registryCredential;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype
     * 
     */
    @JsonIgnore
    public CharSequence getComputeType() {
        return computeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype
     * 
     */
    @JsonIgnore
    public void setComputeType(CharSequence computeType) {
        this.computeType = computeType;
    }

    public ProjectEnvironment withComputeType(CharSequence computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate
     * 
     */
    @JsonIgnore
    public CharSequence getCertificate() {
        return certificate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate
     * 
     */
    @JsonIgnore
    public void setCertificate(CharSequence certificate) {
        this.certificate = certificate;
    }

    public ProjectEnvironment withCertificate(CharSequence certificate) {
        this.certificate = certificate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("environmentVariables", environmentVariables).append("privilegedMode", privilegedMode).append("imagePullCredentialsType", imagePullCredentialsType).append("image", image).append("registryCredential", registryCredential).append("computeType", computeType).append("certificate", certificate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(registryCredential).append(image).append(computeType).append(imagePullCredentialsType).append(environmentVariables).append(privilegedMode).append(certificate).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectEnvironment) == false) {
            return false;
        }
        ProjectEnvironment rhs = ((ProjectEnvironment) other);
        return new EqualsBuilder().append(registryCredential, rhs.registryCredential).append(image, rhs.image).append(computeType, rhs.computeType).append(imagePullCredentialsType, rhs.imagePullCredentialsType).append(environmentVariables, rhs.environmentVariables).append(privilegedMode, rhs.privilegedMode).append(certificate, rhs.certificate).append(type, rhs.type).isEquals();
    }

}
