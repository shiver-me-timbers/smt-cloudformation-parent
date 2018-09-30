
package aws.kinesisanalytics;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3ReferenceDataSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BucketARN",
    "FileKey",
    "ReferenceRoleARN"
})
public class S3ReferenceDataSource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn
     * 
     */
    @JsonProperty("BucketARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn")
    private CharSequence bucketARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey
     * 
     */
    @JsonProperty("FileKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey")
    private CharSequence fileKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn
     * 
     */
    @JsonProperty("ReferenceRoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn")
    private CharSequence referenceRoleARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn
     * 
     */
    public CharSequence getBucketARN() {
        return bucketARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn
     * 
     */
    public void setBucketARN(CharSequence bucketARN) {
        this.bucketARN = bucketARN;
    }

    public S3ReferenceDataSource withBucketARN(CharSequence bucketARN) {
        this.bucketARN = bucketARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey
     * 
     */
    public CharSequence getFileKey() {
        return fileKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey
     * 
     */
    public void setFileKey(CharSequence fileKey) {
        this.fileKey = fileKey;
    }

    public S3ReferenceDataSource withFileKey(CharSequence fileKey) {
        this.fileKey = fileKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn
     * 
     */
    public CharSequence getReferenceRoleARN() {
        return referenceRoleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn
     * 
     */
    public void setReferenceRoleARN(CharSequence referenceRoleARN) {
        this.referenceRoleARN = referenceRoleARN;
    }

    public S3ReferenceDataSource withReferenceRoleARN(CharSequence referenceRoleARN) {
        this.referenceRoleARN = referenceRoleARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketARN", bucketARN).append("fileKey", fileKey).append("referenceRoleARN", referenceRoleARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fileKey).append(bucketARN).append(referenceRoleARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3ReferenceDataSource) == false) {
            return false;
        }
        S3ReferenceDataSource rhs = ((S3ReferenceDataSource) other);
        return new EqualsBuilder().append(fileKey, rhs.fileKey).append(bucketARN, rhs.bucketARN).append(referenceRoleARN, rhs.referenceRoleARN).isEquals();
    }

}
