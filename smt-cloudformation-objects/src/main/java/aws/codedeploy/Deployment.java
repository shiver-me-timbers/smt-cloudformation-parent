
package aws.codedeploy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Deployment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "IgnoreApplicationStopFailures",
    "Revision"
})
public class Deployment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures
     * 
     */
    @JsonProperty("IgnoreApplicationStopFailures")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures")
    private Boolean ignoreApplicationStopFailures;
    /**
     * RevisionLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html
     * 
     */
    @JsonProperty("Revision")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html")
    private RevisionLocation revision;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Deployment withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures
     * 
     */
    public Boolean getIgnoreApplicationStopFailures() {
        return ignoreApplicationStopFailures;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html#cfn-properties-codedeploy-deploymentgroup-deployment-ignoreapplicationstopfailures
     * 
     */
    public void setIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
    }

    public Deployment withIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
        return this;
    }

    /**
     * RevisionLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html
     * 
     */
    public RevisionLocation getRevision() {
        return revision;
    }

    /**
     * RevisionLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision.html
     * 
     */
    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    public Deployment withRevision(RevisionLocation revision) {
        this.revision = revision;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("ignoreApplicationStopFailures", ignoreApplicationStopFailures).append("revision", revision).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(ignoreApplicationStopFailures).append(revision).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Deployment) == false) {
            return false;
        }
        Deployment rhs = ((Deployment) other);
        return new EqualsBuilder().append(description, rhs.description).append(ignoreApplicationStopFailures, rhs.ignoreApplicationStopFailures).append(revision, rhs.revision).isEquals();
    }

}
