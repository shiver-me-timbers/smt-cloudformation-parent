
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3Origin
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DomainName",
    "OriginAccessIdentity"
})
public class S3Origin {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname")
    private CharSequence domainName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity
     * 
     */
    @JsonProperty("OriginAccessIdentity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity")
    private CharSequence originAccessIdentity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname
     * 
     */
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-domainname
     * 
     */
    public void setDomainName(CharSequence domainName) {
        this.domainName = domainName;
    }

    public S3Origin withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity
     * 
     */
    public CharSequence getOriginAccessIdentity() {
        return originAccessIdentity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html#cfn-cloudfront-streamingdistribution-s3origin-originaccessidentity
     * 
     */
    public void setOriginAccessIdentity(CharSequence originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }

    public S3Origin withOriginAccessIdentity(CharSequence originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domainName", domainName).append("originAccessIdentity", originAccessIdentity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originAccessIdentity).append(domainName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3Origin) == false) {
            return false;
        }
        S3Origin rhs = ((S3Origin) other);
        return new EqualsBuilder().append(originAccessIdentity, rhs.originAccessIdentity).append(domainName, rhs.domainName).isEquals();
    }

}
