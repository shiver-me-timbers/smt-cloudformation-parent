
package aws.opsworks;

import java.util.List;
import java.util.Map;
import aws.CreationPolicy;
import aws.DeletionPolicy;
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
 * ElasticLoadBalancerAttachmentResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class ElasticLoadBalancerAttachmentResource
    extends Resource
{

    /**
     * ElasticLoadBalancerAttachment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html")
    private ElasticLoadBalancerAttachment properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ElasticLoadBalancerAttachmentResource() {
    }

    /**
     * 
     * @param name
     */
    public ElasticLoadBalancerAttachmentResource(java.lang.String name) {
        super(name);
    }

    /**
     * ElasticLoadBalancerAttachment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html
     * 
     */
    public ElasticLoadBalancerAttachment getProperties() {
        return properties;
    }

    /**
     * ElasticLoadBalancerAttachment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-elbattachment.html
     * 
     */
    public void setProperties(ElasticLoadBalancerAttachment properties) {
        this.properties = properties;
    }

    public ElasticLoadBalancerAttachmentResource withProperties(ElasticLoadBalancerAttachment properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public ElasticLoadBalancerAttachmentResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public ElasticLoadBalancerAttachmentResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public ElasticLoadBalancerAttachmentResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public ElasticLoadBalancerAttachmentResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public ElasticLoadBalancerAttachmentResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public ElasticLoadBalancerAttachmentResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public ElasticLoadBalancerAttachmentResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public ElasticLoadBalancerAttachmentResource withName(java.lang.String name) {
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
        if ((other instanceof ElasticLoadBalancerAttachmentResource) == false) {
            return false;
        }
        ElasticLoadBalancerAttachmentResource rhs = ((ElasticLoadBalancerAttachmentResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
