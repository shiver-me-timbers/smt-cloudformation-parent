
package aws.cloudfront;

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
 * CloudFrontOriginAccessIdentity
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudFrontOriginAccessIdentityConfig"
})
public class CloudFrontOriginAccessIdentity {

    /**
     * CloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html
     * 
     */
    @JsonProperty("CloudFrontOriginAccessIdentityConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html")
    private Property<CloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfig> cloudFrontOriginAccessIdentityConfig;

    /**
     * CloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html
     * 
     */
    @JsonIgnore
    public Property<CloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfig> getCloudFrontOriginAccessIdentityConfig() {
        return cloudFrontOriginAccessIdentityConfig;
    }

    /**
     * CloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html
     * 
     */
    @JsonIgnore
    public void setCloudFrontOriginAccessIdentityConfig(Property<CloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfig> cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = cloudFrontOriginAccessIdentityConfig;
    }

    public CloudFrontOriginAccessIdentity withCloudFrontOriginAccessIdentityConfig(Property<CloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfig> cloudFrontOriginAccessIdentityConfig) {
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
