
package aws.codedeploy;

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
 * DeploymentGroupRevisionLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GitHubLocation",
    "RevisionType",
    "S3Location"
})
public class DeploymentGroupRevisionLocation implements Property<DeploymentGroupRevisionLocation>
{

    /**
     * DeploymentGroupGitHubLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
     * 
     */
    @JsonProperty("GitHubLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html")
    private Property<DeploymentGroupGitHubLocation> gitHubLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype
     * 
     */
    @JsonProperty("RevisionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype")
    private CharSequence revisionType;
    /**
     * DeploymentGroupS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
     * 
     */
    @JsonProperty("S3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html")
    private Property<DeploymentGroupS3Location> s3Location;

    /**
     * DeploymentGroupGitHubLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupGitHubLocation> getGitHubLocation() {
        return gitHubLocation;
    }

    /**
     * DeploymentGroupGitHubLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-githublocation.html
     * 
     */
    @JsonIgnore
    public void setGitHubLocation(Property<DeploymentGroupGitHubLocation> gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
    }

    public DeploymentGroupRevisionLocation withGitHubLocation(Property<DeploymentGroupGitHubLocation> gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype
     * 
     */
    @JsonIgnore
    public CharSequence getRevisionType() {
        return revisionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-revisiontype
     * 
     */
    @JsonIgnore
    public void setRevisionType(CharSequence revisionType) {
        this.revisionType = revisionType;
    }

    public DeploymentGroupRevisionLocation withRevisionType(CharSequence revisionType) {
        this.revisionType = revisionType;
        return this;
    }

    /**
     * DeploymentGroupS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupS3Location> getS3Location() {
        return s3Location;
    }

    /**
     * DeploymentGroupS3Location
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
     * 
     */
    @JsonIgnore
    public void setS3Location(Property<DeploymentGroupS3Location> s3Location) {
        this.s3Location = s3Location;
    }

    public DeploymentGroupRevisionLocation withS3Location(Property<DeploymentGroupS3Location> s3Location) {
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
        if ((other instanceof DeploymentGroupRevisionLocation) == false) {
            return false;
        }
        DeploymentGroupRevisionLocation rhs = ((DeploymentGroupRevisionLocation) other);
        return new EqualsBuilder().append(gitHubLocation, rhs.gitHubLocation).append(revisionType, rhs.revisionType).append(s3Location, rhs.s3Location).isEquals();
    }

}
