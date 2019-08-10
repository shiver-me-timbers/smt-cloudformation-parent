
package aws.codestar;

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
 * GitHubRepositoryS3
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ObjectVersion",
    "Bucket",
    "Key"
})
public class GitHubRepositoryS3 implements Property<GitHubRepositoryS3>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-objectversion
     * 
     */
    @JsonProperty("ObjectVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-objectversion")
    private CharSequence objectVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-bucket
     * 
     */
    @JsonProperty("Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-bucket")
    private CharSequence bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-key")
    private CharSequence key;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-objectversion
     * 
     */
    @JsonIgnore
    public CharSequence getObjectVersion() {
        return objectVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-objectversion
     * 
     */
    @JsonIgnore
    public void setObjectVersion(CharSequence objectVersion) {
        this.objectVersion = objectVersion;
    }

    public GitHubRepositoryS3 withObjectVersion(CharSequence objectVersion) {
        this.objectVersion = objectVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-bucket
     * 
     */
    @JsonIgnore
    public CharSequence getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-bucket
     * 
     */
    @JsonIgnore
    public void setBucket(CharSequence bucket) {
        this.bucket = bucket;
    }

    public GitHubRepositoryS3 withBucket(CharSequence bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-key
     * 
     */
    @JsonIgnore
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestar-githubrepository-s3.html#cfn-codestar-githubrepository-s3-key
     * 
     */
    @JsonIgnore
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public GitHubRepositoryS3 withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("objectVersion", objectVersion).append("bucket", bucket).append("key", key).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(objectVersion).append(bucket).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GitHubRepositoryS3) == false) {
            return false;
        }
        GitHubRepositoryS3 rhs = ((GitHubRepositoryS3) other);
        return new EqualsBuilder().append(objectVersion, rhs.objectVersion).append(bucket, rhs.bucket).append(key, rhs.key).isEquals();
    }

}
