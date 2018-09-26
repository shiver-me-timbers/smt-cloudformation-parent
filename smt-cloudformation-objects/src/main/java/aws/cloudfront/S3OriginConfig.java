
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3OriginConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OriginAccessIdentity"
})
public class S3OriginConfig {

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
    public CharSequence getOriginAccessIdentity() {
        return originAccessIdentity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity
     * 
     */
    public void setOriginAccessIdentity(CharSequence originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }

    public S3OriginConfig withOriginAccessIdentity(CharSequence originAccessIdentity) {
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
        if ((other instanceof S3OriginConfig) == false) {
            return false;
        }
        S3OriginConfig rhs = ((S3OriginConfig) other);
        return new EqualsBuilder().append(originAccessIdentity, rhs.originAccessIdentity).isEquals();
    }

}
