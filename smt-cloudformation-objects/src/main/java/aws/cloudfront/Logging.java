
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Logging
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Bucket",
    "Enabled",
    "Prefix"
})
public class Logging {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket
     * 
     */
    @JsonProperty("Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket")
    private String bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix")
    private String prefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket
     * 
     */
    @JsonProperty("Bucket")
    public String getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-bucket
     * 
     */
    @JsonProperty("Bucket")
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public Logging withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled
     * 
     */
    @JsonProperty("Enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-enabled
     * 
     */
    @JsonProperty("Enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Logging withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix
     * 
     */
    @JsonProperty("Prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html#cfn-cloudfront-streamingdistribution-logging-prefix
     * 
     */
    @JsonProperty("Prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Logging withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucket", bucket).append("enabled", enabled).append("prefix", prefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucket).append(enabled).append(prefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Logging) == false) {
            return false;
        }
        Logging rhs = ((Logging) other);
        return new EqualsBuilder().append(bucket, rhs.bucket).append(enabled, rhs.enabled).append(prefix, rhs.prefix).isEquals();
    }

}
