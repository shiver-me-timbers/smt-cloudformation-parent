
package aws.codedeploy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GitHubLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CommitId",
    "Repository"
})
public class GitHubLocation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-commitid
     * 
     */
    @JsonProperty("CommitId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-commitid")
    private CharSequence commitId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-repository
     * 
     */
    @JsonProperty("Repository")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-repository")
    private CharSequence repository;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-commitid
     * 
     */
    public CharSequence getCommitId() {
        return commitId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-commitid
     * 
     */
    public void setCommitId(CharSequence commitId) {
        this.commitId = commitId;
    }

    public GitHubLocation withCommitId(CharSequence commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-repository
     * 
     */
    public CharSequence getRepository() {
        return repository;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-githublocation-repository
     * 
     */
    public void setRepository(CharSequence repository) {
        this.repository = repository;
    }

    public GitHubLocation withRepository(CharSequence repository) {
        this.repository = repository;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("commitId", commitId).append("repository", repository).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(repository).append(commitId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GitHubLocation) == false) {
            return false;
        }
        GitHubLocation rhs = ((GitHubLocation) other);
        return new EqualsBuilder().append(repository, rhs.repository).append(commitId, rhs.commitId).isEquals();
    }

}
