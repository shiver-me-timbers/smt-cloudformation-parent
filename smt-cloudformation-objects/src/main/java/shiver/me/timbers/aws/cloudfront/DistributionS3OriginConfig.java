
package shiver.me.timbers.aws.cloudfront;

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
 * DistributionS3OriginConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OriginAccessIdentity"
})
public class DistributionS3OriginConfig implements Property<DistributionS3OriginConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity
     * 
     */
    @JsonProperty("OriginAccessIdentity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity")
    private CharSequence originAccessIdentity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity
     * 
     */
    @JsonIgnore
    public CharSequence getOriginAccessIdentity() {
        return originAccessIdentity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity
     * 
     */
    @JsonIgnore
    public void setOriginAccessIdentity(CharSequence originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }

    public DistributionS3OriginConfig withOriginAccessIdentity(CharSequence originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("originAccessIdentity", originAccessIdentity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originAccessIdentity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionS3OriginConfig) == false) {
            return false;
        }
        DistributionS3OriginConfig rhs = ((DistributionS3OriginConfig) other);
        return new EqualsBuilder().append(originAccessIdentity, rhs.originAccessIdentity).isEquals();
    }

}
