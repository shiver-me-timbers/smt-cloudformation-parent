
package shiver.me.timbers.aws.codestar;

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
 * GitHubRepository
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EnableIssues",
    "RepositoryName",
    "RepositoryAccessToken",
    "RepositoryOwner",
    "IsPrivate",
    "Code",
    "RepositoryDescription"
})
public class GitHubRepository {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues
     * 
     */
    @JsonProperty("EnableIssues")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues")
    private CharSequence enableIssues;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname
     * 
     */
    @JsonProperty("RepositoryName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname")
    private CharSequence repositoryName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken
     * 
     */
    @JsonProperty("RepositoryAccessToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken")
    private CharSequence repositoryAccessToken;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner
     * 
     */
    @JsonProperty("RepositoryOwner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner")
    private CharSequence repositoryOwner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate
     * 
     */
    @JsonProperty("IsPrivate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate")
    private CharSequence isPrivate;
    /**
     * GitHubRepositoryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-code.html
     * 
     */
    @JsonProperty("Code")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-code.html")
    private Property<GitHubRepositoryCode> code;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription
     * 
     */
    @JsonProperty("RepositoryDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription")
    private CharSequence repositoryDescription;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues
     * 
     */
    @JsonIgnore
    public CharSequence getEnableIssues() {
        return enableIssues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-enableissues
     * 
     */
    @JsonIgnore
    public void setEnableIssues(CharSequence enableIssues) {
        this.enableIssues = enableIssues;
    }

    public GitHubRepository withEnableIssues(CharSequence enableIssues) {
        this.enableIssues = enableIssues;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname
     * 
     */
    @JsonIgnore
    public CharSequence getRepositoryName() {
        return repositoryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryname
     * 
     */
    @JsonIgnore
    public void setRepositoryName(CharSequence repositoryName) {
        this.repositoryName = repositoryName;
    }

    public GitHubRepository withRepositoryName(CharSequence repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken
     * 
     */
    @JsonIgnore
    public CharSequence getRepositoryAccessToken() {
        return repositoryAccessToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryaccesstoken
     * 
     */
    @JsonIgnore
    public void setRepositoryAccessToken(CharSequence repositoryAccessToken) {
        this.repositoryAccessToken = repositoryAccessToken;
    }

    public GitHubRepository withRepositoryAccessToken(CharSequence repositoryAccessToken) {
        this.repositoryAccessToken = repositoryAccessToken;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner
     * 
     */
    @JsonIgnore
    public CharSequence getRepositoryOwner() {
        return repositoryOwner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositoryowner
     * 
     */
    @JsonIgnore
    public void setRepositoryOwner(CharSequence repositoryOwner) {
        this.repositoryOwner = repositoryOwner;
    }

    public GitHubRepository withRepositoryOwner(CharSequence repositoryOwner) {
        this.repositoryOwner = repositoryOwner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate
     * 
     */
    @JsonIgnore
    public CharSequence getIsPrivate() {
        return isPrivate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-isprivate
     * 
     */
    @JsonIgnore
    public void setIsPrivate(CharSequence isPrivate) {
        this.isPrivate = isPrivate;
    }

    public GitHubRepository withIsPrivate(CharSequence isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * GitHubRepositoryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-code.html
     * 
     */
    @JsonIgnore
    public Property<GitHubRepositoryCode> getCode() {
        return code;
    }

    /**
     * GitHubRepositoryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-code.html
     * 
     */
    @JsonIgnore
    public void setCode(Property<GitHubRepositoryCode> code) {
        this.code = code;
    }

    public GitHubRepository withCode(Property<GitHubRepositoryCode> code) {
        this.code = code;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription
     * 
     */
    @JsonIgnore
    public CharSequence getRepositoryDescription() {
        return repositoryDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html#cfn-codestar-githubrepository-repositorydescription
     * 
     */
    @JsonIgnore
    public void setRepositoryDescription(CharSequence repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    public GitHubRepository withRepositoryDescription(CharSequence repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enableIssues", enableIssues).append("repositoryName", repositoryName).append("repositoryAccessToken", repositoryAccessToken).append("repositoryOwner", repositoryOwner).append("isPrivate", isPrivate).append("code", code).append("repositoryDescription", repositoryDescription).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(repositoryAccessToken).append(repositoryOwner).append(repositoryDescription).append(isPrivate).append(repositoryName).append(enableIssues).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GitHubRepository) == false) {
            return false;
        }
        GitHubRepository rhs = ((GitHubRepository) other);
        return new EqualsBuilder().append(code, rhs.code).append(repositoryAccessToken, rhs.repositoryAccessToken).append(repositoryOwner, rhs.repositoryOwner).append(repositoryDescription, rhs.repositoryDescription).append(isPrivate, rhs.isPrivate).append(repositoryName, rhs.repositoryName).append(enableIssues, rhs.enableIssues).isEquals();
    }

}
