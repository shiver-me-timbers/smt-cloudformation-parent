
package aws.cloudfront;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Logging",
    "Comment",
    "PriceClass",
    "S3Origin",
    "Enabled",
    "Aliases",
    "TrustedSigners"
})
public class StreamingDistributionConfig implements Property<StreamingDistributionConfig>
{

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    @JsonProperty("Logging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html")
    private Property<Logging> logging;
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
    private Property<S3Origin> s3Origin;
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
    private Property<TrustedSigners> trustedSigners;

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    @JsonIgnore
    public Property<Logging> getLogging() {
        return logging;
    }

    /**
     * Logging
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html
     * 
     */
    @JsonIgnore
    public void setLogging(Property<Logging> logging) {
        this.logging = logging;
    }

    public StreamingDistributionConfig withLogging(Property<Logging> logging) {
        this.logging = logging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment
     * 
     */
    @JsonIgnore
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-comment
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getPriceClass() {
        return priceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-priceclass
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Property<S3Origin> getS3Origin() {
        return s3Origin;
    }

    /**
     * S3Origin
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html
     * 
     */
    @JsonIgnore
    public void setS3Origin(Property<S3Origin> s3Origin) {
        this.s3Origin = s3Origin;
    }

    public StreamingDistributionConfig withS3Origin(Property<S3Origin> s3Origin) {
        this.s3Origin = s3Origin;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled
     * 
     */
    @JsonIgnore
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-enabled
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<CharSequence> getAliases() {
        return aliases;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig-aliases
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Property<TrustedSigners> getTrustedSigners() {
        return trustedSigners;
    }

    /**
     * TrustedSigners
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html
     * 
     */
    @JsonIgnore
    public void setTrustedSigners(Property<TrustedSigners> trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    public StreamingDistributionConfig withTrustedSigners(Property<TrustedSigners> trustedSigners) {
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
