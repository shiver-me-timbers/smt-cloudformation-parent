
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LoggingInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "S3Bucket",
    "Region",
    "S3Prefix"
})
public class LoggingInfo {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket
     * 
     */
    @JsonProperty("S3Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket")
    private CharSequence s3Bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region")
    private CharSequence region;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix
     * 
     */
    @JsonProperty("S3Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix")
    private CharSequence s3Prefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket
     * 
     */
    public CharSequence getS3Bucket() {
        return s3Bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3bucket
     * 
     */
    public void setS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    public LoggingInfo withS3Bucket(CharSequence s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region
     * 
     */
    public CharSequence getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-region
     * 
     */
    public void setRegion(CharSequence region) {
        this.region = region;
    }

    public LoggingInfo withRegion(CharSequence region) {
        this.region = region;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix
     * 
     */
    public CharSequence getS3Prefix() {
        return s3Prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-logginginfo.html#cfn-ssm-maintenancewindowtask-logginginfo-s3prefix
     * 
     */
    public void setS3Prefix(CharSequence s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    public LoggingInfo withS3Prefix(CharSequence s3Prefix) {
        this.s3Prefix = s3Prefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Bucket", s3Bucket).append("region", region).append("s3Prefix", s3Prefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(region).append(s3Prefix).append(s3Bucket).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoggingInfo) == false) {
            return false;
        }
        LoggingInfo rhs = ((LoggingInfo) other);
        return new EqualsBuilder().append(region, rhs.region).append(s3Prefix, rhs.s3Prefix).append(s3Bucket, rhs.s3Bucket).isEquals();
    }

}
