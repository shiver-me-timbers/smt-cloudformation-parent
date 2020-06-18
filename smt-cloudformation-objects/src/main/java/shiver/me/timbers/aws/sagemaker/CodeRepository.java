
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
 * CodeRepository
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CodeRepositoryName",
    "GitConfig"
})
public class CodeRepository {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname
     * 
     */
    @JsonProperty("CodeRepositoryName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname")
    private CharSequence codeRepositoryName;
    /**
     * CodeRepositoryGitConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html
     * 
     */
    @JsonProperty("GitConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html")
    private Property<CodeRepositoryGitConfig> gitConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname
     * 
     */
    @JsonIgnore
    public CharSequence getCodeRepositoryName() {
        return codeRepositoryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-coderepository.html#cfn-sagemaker-coderepository-coderepositoryname
     * 
     */
    @JsonIgnore
    public void setCodeRepositoryName(CharSequence codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
    }

    public CodeRepository withCodeRepositoryName(CharSequence codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
        return this;
    }

    /**
     * CodeRepositoryGitConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html
     * 
     */
    @JsonIgnore
    public Property<CodeRepositoryGitConfig> getGitConfig() {
        return gitConfig;
    }

    /**
     * CodeRepositoryGitConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-coderepository-gitconfig.html
     * 
     */
    @JsonIgnore
    public void setGitConfig(Property<CodeRepositoryGitConfig> gitConfig) {
        this.gitConfig = gitConfig;
    }

    public CodeRepository withGitConfig(Property<CodeRepositoryGitConfig> gitConfig) {
        this.gitConfig = gitConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("codeRepositoryName", codeRepositoryName).append("gitConfig", gitConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codeRepositoryName).append(gitConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodeRepository) == false) {
            return false;
        }
        CodeRepository rhs = ((CodeRepository) other);
        return new EqualsBuilder().append(codeRepositoryName, rhs.codeRepositoryName).append(gitConfig, rhs.gitConfig).isEquals();
    }

}
