
package aws.redshift;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LoggingProperties
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BucketName",
    "S3KeyPrefix"
})
public class LoggingProperties {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-bucketname
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-bucketname")
    private CharSequence bucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-s3keyprefix
     * 
     */
    @JsonProperty("S3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-s3keyprefix")
    private CharSequence s3KeyPrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-bucketname
     * 
     */
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-bucketname
     * 
     */
    public void setBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
    }

    public LoggingProperties withBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-s3keyprefix
     * 
     */
    public CharSequence getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html#cfn-redshift-cluster-loggingproperties-s3keyprefix
     * 
     */
    public void setS3KeyPrefix(CharSequence s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    public LoggingProperties withS3KeyPrefix(CharSequence s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketName", bucketName).append("s3KeyPrefix", s3KeyPrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucketName).append(s3KeyPrefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoggingProperties) == false) {
            return false;
        }
        LoggingProperties rhs = ((LoggingProperties) other);
        return new EqualsBuilder().append(bucketName, rhs.bucketName).append(s3KeyPrefix, rhs.s3KeyPrefix).isEquals();
    }

}
