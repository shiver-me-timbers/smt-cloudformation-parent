
package aws.cloudfront;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StreamingDistributionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Logging",
    "Comment",
    "PriceClass",
    "S3Origin",
    "Enabled",
    "Aliases",
    "TrustedSigners"
})
public class StreamingDistributionConfig {

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    @JsonProperty("Logging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html")
    private Logging logging;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment
     * 
     */
    @JsonProperty("Comment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment")
    private CharSequence comment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass
     * 
     */
    @JsonProperty("PriceClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass")
    private CharSequence priceClass;
    /**
     * S3Origin
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html
     * 
     */
    @JsonProperty("S3Origin")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html")
    private S3Origin s3Origin;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases
     * 
     */
    @JsonProperty("Aliases")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases")
    private List<CharSequence> aliases = new ArrayList<CharSequence>();
    /**
     * TrustedSigners
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html
     * 
     */
    @JsonProperty("TrustedSigners")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html")
    private TrustedSigners trustedSigners;

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    public Logging getLogging() {
        return logging;
    }

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    public StreamingDistributionConfig withLogging(Logging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment
     * 
     */
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment
     * 
     */
    public void setComment(CharSequence comment) {
        this.comment = comment;
    }

    public StreamingDistributionConfig withComment(CharSequence comment) {
        this.comment = comment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass
     * 
     */
    public CharSequence getPriceClass() {
        return priceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass
     * 
     */
    public void setPriceClass(CharSequence priceClass) {
        this.priceClass = priceClass;
    }

    public StreamingDistributionConfig withPriceClass(CharSequence priceClass) {
        this.priceClass = priceClass;
        return this;
    }

    /**
     * S3Origin
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html
     * 
     */
    public S3Origin getS3Origin() {
        return s3Origin;
    }

    /**
     * S3Origin
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html
     * 
     */
    public void setS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
    }

    public StreamingDistributionConfig withS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public StreamingDistributionConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases
     * 
     */
    public List<CharSequence> getAliases() {
        return aliases;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases
     * 
     */
    public void setAliases(List<CharSequence> aliases) {
        this.aliases = aliases;
    }

    public StreamingDistributionConfig withAliases(List<CharSequence> aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * TrustedSigners
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html
     * 
     */
    public TrustedSigners getTrustedSigners() {
        return trustedSigners;
    }

    /**
     * TrustedSigners
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html
     * 
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    public StreamingDistributionConfig withTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("logging", logging).append("comment", comment).append("priceClass", priceClass).append("s3Origin", s3Origin).append("enabled", enabled).append("aliases", aliases).append("trustedSigners", trustedSigners).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trustedSigners).append(aliases).append(priceClass).append(logging).append(comment).append(s3Origin).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreamingDistributionConfig) == false) {
            return false;
        }
        StreamingDistributionConfig rhs = ((StreamingDistributionConfig) other);
        return new EqualsBuilder().append(trustedSigners, rhs.trustedSigners).append(aliases, rhs.aliases).append(priceClass, rhs.priceClass).append(logging, rhs.logging).append(comment, rhs.comment).append(s3Origin, rhs.s3Origin).append(enabled, rhs.enabled).isEquals();
    }

}
