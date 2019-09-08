
package shiver.me.timbers.aws.s3;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * BucketPublicAccessBlockConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockPublicAcls",
    "BlockPublicPolicy",
    "IgnorePublicAcls",
    "RestrictPublicBuckets"
})
public class BucketPublicAccessBlockConfiguration implements Property<BucketPublicAccessBlockConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicacls
     * 
     */
    @JsonProperty("BlockPublicAcls")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicacls")
    private CharSequence blockPublicAcls;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicpolicy
     * 
     */
    @JsonProperty("BlockPublicPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicpolicy")
    private CharSequence blockPublicPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-ignorepublicacls
     * 
     */
    @JsonProperty("IgnorePublicAcls")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-ignorepublicacls")
    private CharSequence ignorePublicAcls;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-restrictpublicbuckets
     * 
     */
    @JsonProperty("RestrictPublicBuckets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-restrictpublicbuckets")
    private CharSequence restrictPublicBuckets;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicacls
     * 
     */
    @JsonIgnore
    public CharSequence getBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicacls
     * 
     */
    @JsonIgnore
    public void setBlockPublicAcls(CharSequence blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    public BucketPublicAccessBlockConfiguration withBlockPublicAcls(CharSequence blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicpolicy
     * 
     */
    @JsonIgnore
    public void setBlockPublicPolicy(CharSequence blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    public BucketPublicAccessBlockConfiguration withBlockPublicPolicy(CharSequence blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-ignorepublicacls
     * 
     */
    @JsonIgnore
    public CharSequence getIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-ignorepublicacls
     * 
     */
    @JsonIgnore
    public void setIgnorePublicAcls(CharSequence ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    public BucketPublicAccessBlockConfiguration withIgnorePublicAcls(CharSequence ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-restrictpublicbuckets
     * 
     */
    @JsonIgnore
    public CharSequence getRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-restrictpublicbuckets
     * 
     */
    @JsonIgnore
    public void setRestrictPublicBuckets(CharSequence restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    public BucketPublicAccessBlockConfiguration withRestrictPublicBuckets(CharSequence restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blockPublicAcls", blockPublicAcls).append("blockPublicPolicy", blockPublicPolicy).append("ignorePublicAcls", ignorePublicAcls).append("restrictPublicBuckets", restrictPublicBuckets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(blockPublicPolicy).append(blockPublicAcls).append(restrictPublicBuckets).append(ignorePublicAcls).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketPublicAccessBlockConfiguration) == false) {
            return false;
        }
        BucketPublicAccessBlockConfiguration rhs = ((BucketPublicAccessBlockConfiguration) other);
        return new EqualsBuilder().append(blockPublicPolicy, rhs.blockPublicPolicy).append(blockPublicAcls, rhs.blockPublicAcls).append(restrictPublicBuckets, rhs.restrictPublicBuckets).append(ignorePublicAcls, rhs.ignorePublicAcls).isEquals();
    }

}
