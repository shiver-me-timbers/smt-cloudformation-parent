
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3OutputLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OutputS3BucketName",
    "OutputS3KeyPrefix"
})
public class S3OutputLocation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname
     * 
     */
    @JsonProperty("OutputS3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname")
    private CharSequence outputS3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix
     * 
     */
    @JsonProperty("OutputS3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix")
    private CharSequence outputS3KeyPrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname
     * 
     */
    public CharSequence getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3bucketname
     * 
     */
    public void setOutputS3BucketName(CharSequence outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    public S3OutputLocation withOutputS3BucketName(CharSequence outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix
     * 
     */
    public CharSequence getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html#cfn-ssm-association-s3outputlocation-outputs3keyprefix
     * 
     */
    public void setOutputS3KeyPrefix(CharSequence outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    public S3OutputLocation withOutputS3KeyPrefix(CharSequence outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("outputS3BucketName", outputS3BucketName).append("outputS3KeyPrefix", outputS3KeyPrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outputS3KeyPrefix).append(outputS3BucketName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3OutputLocation) == false) {
            return false;
        }
        S3OutputLocation rhs = ((S3OutputLocation) other);
        return new EqualsBuilder().append(outputS3KeyPrefix, rhs.outputS3KeyPrefix).append(outputS3BucketName, rhs.outputS3BucketName).isEquals();
    }

}
