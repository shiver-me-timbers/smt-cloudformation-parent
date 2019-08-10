
package aws.s3;

import aws.Property;
import aws.iam.PolicyDocument;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    private CharSequence bucket;
    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html")
    private Property<PolicyDocument> policyDocument;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-bucket
     * 
     */
    @JsonIgnore
    public CharSequence getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html#aws-properties-s3-policy-bucket
     * 
     */
    @JsonIgnore
    public void setBucket(CharSequence bucket) {
        this.bucket = bucket;
    }

    public BucketPolicy withBucket(CharSequence bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public Property<PolicyDocument> getPolicyDocument() {
        return policyDocument;
    }

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public void setPolicyDocument(Property<PolicyDocument> policyDocument) {
        this.policyDocument = policyDocument;
    }

    public BucketPolicy withPolicyDocument(Property<PolicyDocument> policyDocument) {
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
