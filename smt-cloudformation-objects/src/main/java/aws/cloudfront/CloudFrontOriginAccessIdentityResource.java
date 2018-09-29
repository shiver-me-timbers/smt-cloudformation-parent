
package aws.cloudfront;

import java.util.List;
import java.util.Map;
import aws.CreationPolicy;
import aws.DeletionPolicy;
import aws.HasAttributes;
import aws.Resource;
import aws.UpdatePolicy;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CloudFrontOriginAccessIdentityResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class CloudFrontOriginAccessIdentityResource
    extends Resource
    implements HasAttributes<CloudFrontOriginAccessIdentityAttributes>
{

    /**
     * CloudFrontOriginAccessIdentity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html")
    private CloudFrontOriginAccessIdentity properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CloudFrontOriginAccessIdentityResource() {
    }

    /**
     * 
     * @param name
     */
    public CloudFrontOriginAccessIdentityResource(java.lang.String name) {
        super(name);
    }

    /**
     * CloudFrontOriginAccessIdentity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
     * 
     */
    public CloudFrontOriginAccessIdentity getProperties() {
        return properties;
    }

    /**
     * CloudFrontOriginAccessIdentity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
     * 
     */
    public void setProperties(CloudFrontOriginAccessIdentity properties) {
        this.properties = properties;
    }

    public CloudFrontOriginAccessIdentityResource withProperties(CloudFrontOriginAccessIdentity properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public CloudFrontOriginAccessIdentityResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public CloudFrontOriginAccessIdentityResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public CloudFrontOriginAccessIdentityResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public CloudFrontOriginAccessIdentityResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public CloudFrontOriginAccessIdentityResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public CloudFrontOriginAccessIdentityResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public CloudFrontOriginAccessIdentityResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public CloudFrontOriginAccessIdentityResource withName(java.lang.String name) {
        super.withName(name);
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("properties", properties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(properties).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudFrontOriginAccessIdentityResource) == false) {
            return false;
        }
        CloudFrontOriginAccessIdentityResource rhs = ((CloudFrontOriginAccessIdentityResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
