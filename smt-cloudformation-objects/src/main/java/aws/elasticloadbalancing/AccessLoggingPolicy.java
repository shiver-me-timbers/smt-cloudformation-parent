
package aws.elasticloadbalancing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AccessLoggingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EmitInterval",
    "Enabled",
    "S3BucketName",
    "S3BucketPrefix"
})
public class AccessLoggingPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-emitinterval
     * 
     */
    @JsonProperty("EmitInterval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-emitinterval")
    private Integer emitInterval;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketname")
    private CharSequence s3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketprefix
     * 
     */
    @JsonProperty("S3BucketPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketprefix")
    private CharSequence s3BucketPrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-emitinterval
     * 
     */
    public Integer getEmitInterval() {
        return emitInterval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-emitinterval
     * 
     */
    public void setEmitInterval(Integer emitInterval) {
        this.emitInterval = emitInterval;
    }

    public AccessLoggingPolicy withEmitInterval(Integer emitInterval) {
        this.emitInterval = emitInterval;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AccessLoggingPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketname
     * 
     */
    public CharSequence getS3BucketName() {
        return s3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketname
     * 
     */
    public void setS3BucketName(CharSequence s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    public AccessLoggingPolicy withS3BucketName(CharSequence s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketprefix
     * 
     */
    public CharSequence getS3BucketPrefix() {
        return s3BucketPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-accessloggingpolicy.html#cfn-elb-accessloggingpolicy-s3bucketprefix
     * 
     */
    public void setS3BucketPrefix(CharSequence s3BucketPrefix) {
        this.s3BucketPrefix = s3BucketPrefix;
    }

    public AccessLoggingPolicy withS3BucketPrefix(CharSequence s3BucketPrefix) {
        this.s3BucketPrefix = s3BucketPrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("emitInterval", emitInterval).append("enabled", enabled).append("s3BucketName", s3BucketName).append("s3BucketPrefix", s3BucketPrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(emitInterval).append(enabled).append(s3BucketPrefix).append(s3BucketName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessLoggingPolicy) == false) {
            return false;
        }
        AccessLoggingPolicy rhs = ((AccessLoggingPolicy) other);
        return new EqualsBuilder().append(emitInterval, rhs.emitInterval).append(enabled, rhs.enabled).append(s3BucketPrefix, rhs.s3BucketPrefix).append(s3BucketName, rhs.s3BucketName).isEquals();
    }

}
