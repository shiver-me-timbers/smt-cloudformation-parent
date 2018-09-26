
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CloudFrontOriginAccessIdentity
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudFrontOriginAccessIdentityConfig"
})
public class CloudFrontOriginAccessIdentity {

    /**
     * CloudFrontOriginAccessIdentityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html
     * 
     */
    @JsonProperty("CloudFrontOriginAccessIdentityConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html")
    private CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig;

    /**
     * CloudFrontOriginAccessIdentityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html
     * 
     */
    public CloudFrontOriginAccessIdentityConfig getCloudFrontOriginAccessIdentityConfig() {
        return cloudFrontOriginAccessIdentityConfig;
    }

    /**
     * CloudFrontOriginAccessIdentityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html
     * 
     */
    public void setCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    }

    public CloudFrontOriginAccessIdentity withCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudFrontOriginAccessIdentityConfig", cloudFrontOriginAccessIdentityConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudFrontOriginAccessIdentityConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudFrontOriginAccessIdentity) == false) {
            return false;
        }
        CloudFrontOriginAccessIdentity rhs = ((CloudFrontOriginAccessIdentity) other);
        return new EqualsBuilder().append(cloudFrontOriginAccessIdentityConfig, rhs.cloudFrontOriginAccessIdentityConfig).isEquals();
    }

}
