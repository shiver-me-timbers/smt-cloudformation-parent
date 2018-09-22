
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Destination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BucketAccountId",
    "BucketArn",
    "Format",
    "Prefix"
})
public class Destination {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid
     * 
     */
    @JsonProperty("BucketAccountId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid")
    private String bucketAccountId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn
     * 
     */
    @JsonProperty("BucketArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn")
    private String bucketArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format
     * 
     */
    @JsonProperty("Format")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format")
    private String format;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix")
    private String prefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid
     * 
     */
    @JsonProperty("BucketAccountId")
    public String getBucketAccountId() {
        return bucketAccountId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid
     * 
     */
    @JsonProperty("BucketAccountId")
    public void setBucketAccountId(String bucketAccountId) {
        this.bucketAccountId = bucketAccountId;
    }

    public Destination withBucketAccountId(String bucketAccountId) {
        this.bucketAccountId = bucketAccountId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn
     * 
     */
    @JsonProperty("BucketArn")
    public String getBucketArn() {
        return bucketArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn
     * 
     */
    @JsonProperty("BucketArn")
    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    public Destination withBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format
     * 
     */
    @JsonProperty("Format")
    public String getFormat() {
        return format;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format
     * 
     */
    @JsonProperty("Format")
    public void setFormat(String format) {
        this.format = format;
    }

    public Destination withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix
     * 
     */
    @JsonProperty("Prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix
     * 
     */
    @JsonProperty("Prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Destination withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketAccountId", bucketAccountId).append("bucketArn", bucketArn).append("format", format).append("prefix", prefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(format).append(bucketAccountId).append(bucketArn).append(prefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Destination) == false) {
            return false;
        }
        Destination rhs = ((Destination) other);
        return new EqualsBuilder().append(format, rhs.format).append(bucketAccountId, rhs.bucketAccountId).append(bucketArn, rhs.bucketArn).append(prefix, rhs.prefix).isEquals();
    }

}
