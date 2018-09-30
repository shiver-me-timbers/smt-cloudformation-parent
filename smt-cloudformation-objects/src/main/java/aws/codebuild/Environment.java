
package aws.codebuild;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Environment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "EnvironmentVariables",
    "PrivilegedMode",
    "Image",
    "ComputeType",
    "Certificate"
})
public class Environment {

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
    private List<EnvironmentVariable> environmentVariables = new ArrayList<EnvironmentVariable>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode
     * 
     */
    @JsonProperty("PrivilegedMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode")
    private Boolean privilegedMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image
     * 
     */
    @JsonProperty("Image")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image")
    private CharSequence image;
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
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Environment withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables
     * 
     */
    public List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables
     * 
     */
    public void setEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public Environment withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode
     * 
     */
    public Boolean getPrivilegedMode() {
        return privilegedMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode
     * 
     */
    public void setPrivilegedMode(Boolean privilegedMode) {
        this.privilegedMode = privilegedMode;
    }

    public Environment withPrivilegedMode(Boolean privilegedMode) {
        this.privilegedMode = privilegedMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image
     * 
     */
    public CharSequence getImage() {
        return image;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image
     * 
     */
    public void setImage(CharSequence image) {
        this.image = image;
    }

    public Environment withImage(CharSequence image) {
        this.image = image;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype
     * 
     */
    public CharSequence getComputeType() {
        return computeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype
     * 
     */
    public void setComputeType(CharSequence computeType) {
        this.computeType = computeType;
    }

    public Environment withComputeType(CharSequence computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate
     * 
     */
    public CharSequence getCertificate() {
        return certificate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate
     * 
     */
    public void setCertificate(CharSequence certificate) {
        this.certificate = certificate;
    }

    public Environment withCertificate(CharSequence certificate) {
        this.certificate = certificate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("environmentVariables", environmentVariables).append("privilegedMode", privilegedMode).append("image", image).append("computeType", computeType).append("certificate", certificate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(image).append(computeType).append(environmentVariables).append(privilegedMode).append(certificate).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Environment) == false) {
            return false;
        }
        Environment rhs = ((Environment) other);
        return new EqualsBuilder().append(image, rhs.image).append(computeType, rhs.computeType).append(environmentVariables, rhs.environmentVariables).append(privilegedMode, rhs.privilegedMode).append(certificate, rhs.certificate).append(type, rhs.type).isEquals();
    }

}
