
package aws.codedeploy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RevisionLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GitHubLocation",
    "RevisionType",
    "S3Location"
})
public class RevisionLocation {

    /**
     * GitHubLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
     * 
     */
    @JsonProperty("GitHubLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html")
    private GitHubLocation gitHubLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype
     * 
     */
    @JsonProperty("RevisionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype")
    private CharSequence revisionType;
    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
     * 
     */
    @JsonProperty("S3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html")
    private S3Location s3Location;

    /**
     * GitHubLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
     * 
     */
    public GitHubLocation getGitHubLocation() {
        return gitHubLocation;
    }

    /**
     * GitHubLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
     * 
     */
    public void setGitHubLocation(GitHubLocation gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
    }

    public RevisionLocation withGitHubLocation(GitHubLocation gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype
     * 
     */
    public CharSequence getRevisionType() {
        return revisionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype
     * 
     */
    public void setRevisionType(CharSequence revisionType) {
        this.revisionType = revisionType;
    }

    public RevisionLocation withRevisionType(CharSequence revisionType) {
        this.revisionType = revisionType;
        return this;
    }

    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
     * 
     */
    public S3Location getS3Location() {
        return s3Location;
    }

    /**
     * S3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
     * 
     */
    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    public RevisionLocation withS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gitHubLocation", gitHubLocation).append("revisionType", revisionType).append("s3Location", s3Location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(gitHubLocation).append(revisionType).append(s3Location).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RevisionLocation) == false) {
            return false;
        }
        RevisionLocation rhs = ((RevisionLocation) other);
        return new EqualsBuilder().append(gitHubLocation, rhs.gitHubLocation).append(revisionType, rhs.revisionType).append(s3Location, rhs.s3Location).isEquals();
    }

}
