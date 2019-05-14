
package aws.kinesisanalyticsv2;

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
 * S3ContentLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BucketARN",
    "FileKey",
    "ObjectVersion"
})
public class S3ContentLocation implements Property<S3ContentLocation>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-bucketarn
     * 
     */
    @JsonProperty("BucketARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-bucketarn")
    private CharSequence bucketARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-filekey
     * 
     */
    @JsonProperty("FileKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-filekey")
    private CharSequence fileKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-objectversion
     * 
     */
    @JsonProperty("ObjectVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-objectversion")
    private CharSequence objectVersion;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-bucketarn
     * 
     */
    @JsonIgnore
    public CharSequence getBucketARN() {
        return bucketARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-bucketarn
     * 
     */
    @JsonIgnore
    public void setBucketARN(CharSequence bucketARN) {
        this.bucketARN = bucketARN;
    }

    public S3ContentLocation withBucketARN(CharSequence bucketARN) {
        this.bucketARN = bucketARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-filekey
     * 
     */
    @JsonIgnore
    public CharSequence getFileKey() {
        return fileKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-filekey
     * 
     */
    @JsonIgnore
    public void setFileKey(CharSequence fileKey) {
        this.fileKey = fileKey;
    }

    public S3ContentLocation withFileKey(CharSequence fileKey) {
        this.fileKey = fileKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-objectversion
     * 
     */
    @JsonIgnore
    public CharSequence getObjectVersion() {
        return objectVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html#cfn-kinesisanalyticsv2-application-s3contentlocation-objectversion
     * 
     */
    @JsonIgnore
    public void setObjectVersion(CharSequence objectVersion) {
        this.objectVersion = objectVersion;
    }

    public S3ContentLocation withObjectVersion(CharSequence objectVersion) {
        this.objectVersion = objectVersion;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketARN", bucketARN).append("fileKey", fileKey).append("objectVersion", objectVersion).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(objectVersion).append(fileKey).append(bucketARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3ContentLocation) == false) {
            return false;
        }
        S3ContentLocation rhs = ((S3ContentLocation) other);
        return new EqualsBuilder().append(objectVersion, rhs.objectVersion).append(fileKey, rhs.fileKey).append(bucketARN, rhs.bucketARN).isEquals();
    }

}