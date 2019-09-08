
package shiver.me.timbers.aws.lambda;

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
 * LayerVersionContent
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3ObjectVersion",
    "S3Bucket",
    "S3Key"
})
public class LayerVersionContent implements Property<LayerVersionContent>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3objectversion
     * 
     */
    @JsonProperty("S3ObjectVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3objectversion")
    private CharSequence s3ObjectVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3bucket
     * 
     */
    @JsonProperty("S3Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3bucket")
    private CharSequence s3Bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3key
     * 
     */
    @JsonProperty("S3Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3key")
    private CharSequence s3Key;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3objectversion
     * 
     */
    @JsonIgnore
    public CharSequence getS3ObjectVersion() {
        return s3ObjectVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3objectversion
     * 
     */
    @JsonIgnore
    public void setS3ObjectVersion(CharSequence s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    public LayerVersionContent withS3ObjectVersion(CharSequence s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3bucket
     * 
     */
    @JsonIgnore
    public CharSequence getS3Bucket() {
        return s3Bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3bucket
     * 
     */
    @JsonIgnore
    public void setS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public LayerVersionContent withS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3key
     * 
     */
    @JsonIgnore
    public CharSequence getS3Key() {
        return s3Key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3key
     * 
     */
    @JsonIgnore
    public void setS3Key(CharSequence s3Key) {
        this.s3Key = s3Key;
    }

    public LayerVersionContent withS3Key(CharSequence s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3ObjectVersion", s3ObjectVersion).append("s3Bucket", s3Bucket).append("s3Key", s3Key).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3ObjectVersion).append(s3Key).append(s3Bucket).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LayerVersionContent) == false) {
            return false;
        }
        LayerVersionContent rhs = ((LayerVersionContent) other);
        return new EqualsBuilder().append(s3ObjectVersion, rhs.s3ObjectVersion).append(s3Key, rhs.s3Key).append(s3Bucket, rhs.s3Bucket).isEquals();
    }

}
