
package aws.codedeploy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3Location
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Bucket",
    "BundleType",
    "ETag",
    "Key",
    "Version"
})
public class S3Location {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bucket
     * 
     */
    @JsonProperty("Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bucket")
    private String bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bundletype
     * 
     */
    @JsonProperty("BundleType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bundletype")
    private String bundleType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-etag
     * 
     */
    @JsonProperty("ETag")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-etag")
    private String eTag;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-key")
    private String key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-value
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-value")
    private String version;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bucket
     * 
     */
    @JsonProperty("Bucket")
    public String getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bucket
     * 
     */
    @JsonProperty("Bucket")
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public S3Location withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bundletype
     * 
     */
    @JsonProperty("BundleType")
    public String getBundleType() {
        return bundleType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-bundletype
     * 
     */
    @JsonProperty("BundleType")
    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }

    public S3Location withBundleType(String bundleType) {
        this.bundleType = bundleType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-etag
     * 
     */
    @JsonProperty("ETag")
    public String getETag() {
        return eTag;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-etag
     * 
     */
    @JsonProperty("ETag")
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    public S3Location withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-key
     * 
     */
    @JsonProperty("Key")
    public String getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-key
     * 
     */
    @JsonProperty("Key")
    public void setKey(String key) {
        this.key = key;
    }

    public S3Location withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-value
     * 
     */
    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment-revision-s3location.html#cfn-properties-codedeploy-deploymentgroup-deployment-revision-s3location-value
     * 
     */
    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    public S3Location withVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucket", bucket).append("bundleType", bundleType).append("eTag", eTag).append("key", key).append("version", version).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucket).append(eTag).append(bundleType).append(version).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3Location) == false) {
            return false;
        }
        S3Location rhs = ((S3Location) other);
        return new EqualsBuilder().append(bucket, rhs.bucket).append(eTag, rhs.eTag).append(bundleType, rhs.bundleType).append(version, rhs.version).append(key, rhs.key).isEquals();
    }

}
