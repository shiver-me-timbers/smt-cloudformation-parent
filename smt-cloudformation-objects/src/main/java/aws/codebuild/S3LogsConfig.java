
package aws.codebuild;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3LogsConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Status",
    "Location"
})
public class S3LogsConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status")
    private CharSequence status;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location")
    private CharSequence location;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status
     * 
     */
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status
     * 
     */
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public S3LogsConfig withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location
     * 
     */
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location
     * 
     */
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public S3LogsConfig withLocation(CharSequence location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("location", location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(location).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3LogsConfig) == false) {
            return false;
        }
        S3LogsConfig rhs = ((S3LogsConfig) other);
        return new EqualsBuilder().append(location, rhs.location).append(status, rhs.status).isEquals();
    }

}
