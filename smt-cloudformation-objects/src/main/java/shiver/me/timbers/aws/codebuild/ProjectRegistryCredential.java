
package shiver.me.timbers.aws.codebuild;

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
 * ProjectRegistryCredential
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Credential",
    "CredentialProvider"
})
public class ProjectRegistryCredential implements Property<ProjectRegistryCredential>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credential
     * 
     */
    @JsonProperty("Credential")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credential")
    private CharSequence credential;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credentialprovider
     * 
     */
    @JsonProperty("CredentialProvider")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credentialprovider")
    private CharSequence credentialProvider;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credential
     * 
     */
    @JsonIgnore
    public CharSequence getCredential() {
        return credential;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credential
     * 
     */
    @JsonIgnore
    public void setCredential(CharSequence credential) {
        this.credential = credential;
    }

    public ProjectRegistryCredential withCredential(CharSequence credential) {
        this.credential = credential;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credentialprovider
     * 
     */
    @JsonIgnore
    public CharSequence getCredentialProvider() {
        return credentialProvider;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credentialprovider
     * 
     */
    @JsonIgnore
    public void setCredentialProvider(CharSequence credentialProvider) {
        this.credentialProvider = credentialProvider;
    }

    public ProjectRegistryCredential withCredentialProvider(CharSequence credentialProvider) {
        this.credentialProvider = credentialProvider;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("credential", credential).append("credentialProvider", credentialProvider).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(credential).append(credentialProvider).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectRegistryCredential) == false) {
            return false;
        }
        ProjectRegistryCredential rhs = ((ProjectRegistryCredential) other);
        return new EqualsBuilder().append(credential, rhs.credential).append(credentialProvider, rhs.credentialProvider).isEquals();
    }

}
