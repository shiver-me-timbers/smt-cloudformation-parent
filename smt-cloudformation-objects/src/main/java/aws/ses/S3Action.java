
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3Action
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BucketName",
    "KmsKeyArn",
    "TopicArn",
    "ObjectKeyPrefix"
})
public class S3Action {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname")
    private CharSequence bucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn
     * 
     */
    @JsonProperty("KmsKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn")
    private CharSequence kmsKeyArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn")
    private CharSequence topicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix
     * 
     */
    @JsonProperty("ObjectKeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix")
    private CharSequence objectKeyPrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname
     * 
     */
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-bucketname
     * 
     */
    public void setBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
    }

    public S3Action withBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn
     * 
     */
    public CharSequence getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-kmskeyarn
     * 
     */
    public void setKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    public S3Action withKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn
     * 
     */
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-topicarn
     * 
     */
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public S3Action withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix
     * 
     */
    public CharSequence getObjectKeyPrefix() {
        return objectKeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html#cfn-ses-receiptrule-s3action-objectkeyprefix
     * 
     */
    public void setObjectKeyPrefix(CharSequence objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
    }

    public S3Action withObjectKeyPrefix(CharSequence objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketName", bucketName).append("kmsKeyArn", kmsKeyArn).append("topicArn", topicArn).append("objectKeyPrefix", objectKeyPrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucketName).append(objectKeyPrefix).append(kmsKeyArn).append(topicArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3Action) == false) {
            return false;
        }
        S3Action rhs = ((S3Action) other);
        return new EqualsBuilder().append(bucketName, rhs.bucketName).append(objectKeyPrefix, rhs.objectKeyPrefix).append(kmsKeyArn, rhs.kmsKeyArn).append(topicArn, rhs.topicArn).isEquals();
    }

}
