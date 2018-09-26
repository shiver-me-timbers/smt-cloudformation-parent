
package aws.lambda;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Code
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "S3Bucket",
    "S3Key",
    "S3ObjectVersion",
    "ZipFile"
})
public class Code {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3bucket
     * 
     */
    @JsonProperty("S3Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3bucket")
    private CharSequence s3Bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3key
     * 
     */
    @JsonProperty("S3Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3key")
    private CharSequence s3Key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3objectversion
     * 
     */
    @JsonProperty("S3ObjectVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3objectversion")
    private CharSequence s3ObjectVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile
     * 
     */
    @JsonProperty("ZipFile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile")
    private CharSequence zipFile;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3bucket
     * 
     */
    public CharSequence getS3Bucket() {
        return s3Bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3bucket
     * 
     */
    public void setS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public Code withS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3key
     * 
     */
    public CharSequence getS3Key() {
        return s3Key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3key
     * 
     */
    public void setS3Key(CharSequence s3Key) {
        this.s3Key = s3Key;
    }

    public Code withS3Key(CharSequence s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3objectversion
     * 
     */
    public CharSequence getS3ObjectVersion() {
        return s3ObjectVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-s3objectversion
     * 
     */
    public void setS3ObjectVersion(CharSequence s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    public Code withS3ObjectVersion(CharSequence s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile
     * 
     */
    public CharSequence getZipFile() {
        return zipFile;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-code.html#cfn-lambda-function-code-zipfile
     * 
     */
    public void setZipFile(CharSequence zipFile) {
        this.zipFile = zipFile;
    }

    public Code withZipFile(CharSequence zipFile) {
        this.zipFile = zipFile;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Bucket", s3Bucket).append("s3Key", s3Key).append("s3ObjectVersion", s3ObjectVersion).append("zipFile", zipFile).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3ObjectVersion).append(s3Key).append(zipFile).append(s3Bucket).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Code) == false) {
            return false;
        }
        Code rhs = ((Code) other);
        return new EqualsBuilder().append(s3ObjectVersion, rhs.s3ObjectVersion).append(s3Key, rhs.s3Key).append(zipFile, rhs.zipFile).append(s3Bucket, rhs.s3Bucket).isEquals();
    }

}
