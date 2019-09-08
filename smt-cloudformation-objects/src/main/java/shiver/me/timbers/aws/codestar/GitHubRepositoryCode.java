
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
 * GitHubRepositoryCode
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-code.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3"
})
public class GitHubRepositoryCode implements Property<GitHubRepositoryCode>
{

    /**
     * GitHubRepositoryS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html
     * 
     */
    @JsonProperty("S3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html")
    private Property<GitHubRepositoryS3> s3;

    /**
     * GitHubRepositoryS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html
     * 
     */
    @JsonIgnore
    public Property<GitHubRepositoryS3> getS3() {
        return s3;
    }

    /**
     * GitHubRepositoryS3
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html
     * 
     */
    @JsonIgnore
    public void setS3(Property<GitHubRepositoryS3> s3) {
        this.s3 = s3;
    }

    public GitHubRepositoryCode withS3(Property<GitHubRepositoryS3> s3) {
        this.s3 = s3;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3", s3).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GitHubRepositoryCode) == false) {
            return false;
        }
        GitHubRepositoryCode rhs = ((GitHubRepositoryCode) other);
        return new EqualsBuilder().append(s3, rhs.s3).isEquals();
    }

}
