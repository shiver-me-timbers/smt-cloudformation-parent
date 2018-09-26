
package aws.elasticbeanstalk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SourceBundle
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "S3Bucket",
    "S3Key"
})
public class SourceBundle {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3bucket
     * 
     */
    @JsonProperty("S3Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3bucket")
    private CharSequence s3Bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3key
     * 
     */
    @JsonProperty("S3Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3key")
    private CharSequence s3Key;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3bucket
     * 
     */
    public CharSequence getS3Bucket() {
        return s3Bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3bucket
     * 
     */
    public void setS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public SourceBundle withS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3key
     * 
     */
    public CharSequence getS3Key() {
        return s3Key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-sourcebundle.html#cfn-beanstalk-sourcebundle-s3key
     * 
     */
    public void setS3Key(CharSequence s3Key) {
        this.s3Key = s3Key;
    }

    public SourceBundle withS3Key(CharSequence s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Bucket", s3Bucket).append("s3Key", s3Key).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Bucket).append(s3Key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceBundle) == false) {
            return false;
        }
        SourceBundle rhs = ((SourceBundle) other);
        return new EqualsBuilder().append(s3Bucket, rhs.s3Bucket).append(s3Key, rhs.s3Key).isEquals();
    }

}
