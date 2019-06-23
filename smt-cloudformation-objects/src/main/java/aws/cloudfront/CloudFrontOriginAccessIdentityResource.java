
package aws.cloudfront;

import java.util.List;
import java.util.Map;
import aws.CreationPolicy;
import aws.DeletionPolicy;
import aws.HasAttributes;
import aws.HasCondition;
import aws.HasDependsOn;
import aws.Resource;
import aws.UpdatePolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class CloudFrontOriginAccessIdentityResource
    extends Resource
    implements HasAttributes<CloudFrontOriginAccessIdentityAttributes> , HasCondition<CloudFrontOriginAccessIdentityResource> , HasDependsOn<CloudFrontOriginAccessIdentityResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::CloudFront::CloudFrontOriginAccessIdentity";
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

    @JsonIgnore
    public java.lang.String getType() {
        return type;
    }

    @JsonIgnore
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public CloudFrontOriginAccessIdentityResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * CloudFrontOriginAccessIdentity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
     * 
     */
    @JsonIgnore
    public CloudFrontOriginAccessIdentity getProperties() {
        return properties;
    }

    /**
     * CloudFrontOriginAccessIdentity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html
     * 
     */
    @JsonIgnore
    public void setProperties(CloudFrontOriginAccessIdentity properties) {
        this.properties = properties;
    }

    public CloudFrontOriginAccessIdentityResource withProperties(CloudFrontOriginAccessIdentity properties) {
        this.properties = properties;
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
        return new ToStringBuilder(this).appendSuper(super.toString()).append("type", type).append("properties", properties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(type).append(properties).toHashCode();
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
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
