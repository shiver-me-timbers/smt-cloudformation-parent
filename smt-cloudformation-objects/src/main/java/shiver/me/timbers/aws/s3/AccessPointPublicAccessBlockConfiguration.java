
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
 * AccessPointPublicAccessBlockConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockPublicAcls",
    "IgnorePublicAcls",
    "BlockPublicPolicy",
    "RestrictPublicBuckets"
})
public class AccessPointPublicAccessBlockConfiguration implements Property<AccessPointPublicAccessBlockConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicacls
     * 
     */
    @JsonProperty("BlockPublicAcls")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicacls")
    private CharSequence blockPublicAcls;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-ignorepublicacls
     * 
     */
    @JsonProperty("IgnorePublicAcls")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-ignorepublicacls")
    private CharSequence ignorePublicAcls;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicpolicy
     * 
     */
    @JsonProperty("BlockPublicPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicpolicy")
    private CharSequence blockPublicPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets
     * 
     */
    @JsonProperty("RestrictPublicBuckets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets")
    private CharSequence restrictPublicBuckets;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicacls
     * 
     */
    @JsonIgnore
    public CharSequence getBlockPublicAcls() {
        return blockPublicAcls;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicacls
     * 
     */
    @JsonIgnore
    public void setBlockPublicAcls(CharSequence blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    public AccessPointPublicAccessBlockConfiguration withBlockPublicAcls(CharSequence blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-ignorepublicacls
     * 
     */
    @JsonIgnore
    public CharSequence getIgnorePublicAcls() {
        return ignorePublicAcls;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-ignorepublicacls
     * 
     */
    @JsonIgnore
    public void setIgnorePublicAcls(CharSequence ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    public AccessPointPublicAccessBlockConfiguration withIgnorePublicAcls(CharSequence ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getBlockPublicPolicy() {
        return blockPublicPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-blockpublicpolicy
     * 
     */
    @JsonIgnore
    public void setBlockPublicPolicy(CharSequence blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    public AccessPointPublicAccessBlockConfiguration withBlockPublicPolicy(CharSequence blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets
     * 
     */
    @JsonIgnore
    public CharSequence getRestrictPublicBuckets() {
        return restrictPublicBuckets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-publicaccessblockconfiguration.html#cfn-s3-accesspoint-publicaccessblockconfiguration-restrictpublicbuckets
     * 
     */
    @JsonIgnore
    public void setRestrictPublicBuckets(CharSequence restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    public AccessPointPublicAccessBlockConfiguration withRestrictPublicBuckets(CharSequence restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blockPublicAcls", blockPublicAcls).append("ignorePublicAcls", ignorePublicAcls).append("blockPublicPolicy", blockPublicPolicy).append("restrictPublicBuckets", restrictPublicBuckets).toString();
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
        if ((other instanceof AccessPointPublicAccessBlockConfiguration) == false) {
            return false;
        }
        AccessPointPublicAccessBlockConfiguration rhs = ((AccessPointPublicAccessBlockConfiguration) other);
        return new EqualsBuilder().append(blockPublicPolicy, rhs.blockPublicPolicy).append(blockPublicAcls, rhs.blockPublicAcls).append(restrictPublicBuckets, rhs.restrictPublicBuckets).append(ignorePublicAcls, rhs.ignorePublicAcls).isEquals();
    }

}
