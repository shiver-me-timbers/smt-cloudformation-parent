
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CloudFrontOriginAccessIdentityConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Comment"
})
public class CloudFrontOriginAccessIdentityConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment
     * 
     */
    @JsonProperty("Comment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment")
    private CharSequence comment;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment
     * 
     */
    public CharSequence getComment() {
        return comment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment
     * 
     */
    public void setComment(CharSequence comment) {
        this.comment = comment;
    }

    public CloudFrontOriginAccessIdentityConfig withComment(CharSequence comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("comment", comment).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(comment).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudFrontOriginAccessIdentityConfig) == false) {
            return false;
        }
        CloudFrontOriginAccessIdentityConfig rhs = ((CloudFrontOriginAccessIdentityConfig) other);
        return new EqualsBuilder().append(comment, rhs.comment).isEquals();
    }

}
