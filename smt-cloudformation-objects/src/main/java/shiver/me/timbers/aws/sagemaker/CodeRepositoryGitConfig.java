
package shiver.me.timbers.aws.sagemaker;

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
 * CodeRepositoryGitConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SecretArn",
    "Branch",
    "RepositoryUrl"
})
public class CodeRepositoryGitConfig implements Property<CodeRepositoryGitConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-secretarn
     * 
     */
    @JsonProperty("SecretArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-secretarn")
    private CharSequence secretArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-branch
     * 
     */
    @JsonProperty("Branch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-branch")
    private CharSequence branch;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-repositoryurl
     * 
     */
    @JsonProperty("RepositoryUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-repositoryurl")
    private CharSequence repositoryUrl;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-secretarn
     * 
     */
    @JsonIgnore
    public CharSequence getSecretArn() {
        return secretArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-secretarn
     * 
     */
    @JsonIgnore
    public void setSecretArn(CharSequence secretArn) {
        this.secretArn = secretArn;
    }

    public CodeRepositoryGitConfig withSecretArn(CharSequence secretArn) {
        this.secretArn = secretArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-branch
     * 
     */
    @JsonIgnore
    public CharSequence getBranch() {
        return branch;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-branch
     * 
     */
    @JsonIgnore
    public void setBranch(CharSequence branch) {
        this.branch = branch;
    }

    public CodeRepositoryGitConfig withBranch(CharSequence branch) {
        this.branch = branch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-repositoryurl
     * 
     */
    @JsonIgnore
    public CharSequence getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html#cfn-sagemaker-coderepository-gitconfig-repositoryurl
     * 
     */
    @JsonIgnore
    public void setRepositoryUrl(CharSequence repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public CodeRepositoryGitConfig withRepositoryUrl(CharSequence repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("secretArn", secretArn).append("branch", branch).append("repositoryUrl", repositoryUrl).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(branch).append(secretArn).append(repositoryUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodeRepositoryGitConfig) == false) {
            return false;
        }
        CodeRepositoryGitConfig rhs = ((CodeRepositoryGitConfig) other);
        return new EqualsBuilder().append(branch, rhs.branch).append(secretArn, rhs.secretArn).append(repositoryUrl, rhs.repositoryUrl).isEquals();
    }

}
