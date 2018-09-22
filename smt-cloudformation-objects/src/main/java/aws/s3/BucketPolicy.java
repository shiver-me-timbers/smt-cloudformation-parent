
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BucketPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Bucket",
    "PolicyDocument"
})
public class BucketPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-bucket
     * 
     */
    @JsonProperty("Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-bucket")
    private String bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-policydocument")
    private PolicyDocument policyDocument;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-bucket
     * 
     */
    @JsonProperty("Bucket")
    public String getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-bucket
     * 
     */
    @JsonProperty("Bucket")
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public BucketPolicy withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    public PolicyDocument getPolicyDocument() {
        return policyDocument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-policydocument
     * 
     */
    @JsonProperty("PolicyDocument")
    public void setPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
    }

    public BucketPolicy withPolicyDocument(PolicyDocument policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucket", bucket).append("policyDocument", policyDocument).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucket).append(policyDocument).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketPolicy) == false) {
            return false;
        }
        BucketPolicy rhs = ((BucketPolicy) other);
        return new EqualsBuilder().append(bucket, rhs.bucket).append(policyDocument, rhs.policyDocument).isEquals();
    }

}
