
package shiver.me.timbers.aws.cognito;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.CreationPolicy;
import shiver.me.timbers.aws.DeletionPolicy;
import shiver.me.timbers.aws.HasCondition;
import shiver.me.timbers.aws.HasDependsOn;
import shiver.me.timbers.aws.Resource;
import shiver.me.timbers.aws.UpdatePolicy;


/**
 * IdentityPoolRoleAttachmentResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class IdentityPoolRoleAttachmentResource
    extends Resource
    implements HasCondition<IdentityPoolRoleAttachmentResource> , HasDependsOn<IdentityPoolRoleAttachmentResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::Cognito::IdentityPoolRoleAttachment";
    /**
     * IdentityPoolRoleAttachment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html")
    private IdentityPoolRoleAttachment properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IdentityPoolRoleAttachmentResource() {
    }

    /**
     * 
     * @param name
     */
    public IdentityPoolRoleAttachmentResource(java.lang.String name) {
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

    public IdentityPoolRoleAttachmentResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * IdentityPoolRoleAttachment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
     * 
     */
    @JsonIgnore
    public IdentityPoolRoleAttachment getProperties() {
        return properties;
    }

    /**
     * IdentityPoolRoleAttachment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
     * 
     */
    @JsonIgnore
    public void setProperties(IdentityPoolRoleAttachment properties) {
        this.properties = properties;
    }

    public IdentityPoolRoleAttachmentResource withProperties(IdentityPoolRoleAttachment properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public IdentityPoolRoleAttachmentResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public IdentityPoolRoleAttachmentResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public IdentityPoolRoleAttachmentResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public IdentityPoolRoleAttachmentResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public IdentityPoolRoleAttachmentResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public IdentityPoolRoleAttachmentResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public IdentityPoolRoleAttachmentResource withName(java.lang.String name) {
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
        if ((other instanceof IdentityPoolRoleAttachmentResource) == false) {
            return false;
        }
        IdentityPoolRoleAttachmentResource rhs = ((IdentityPoolRoleAttachmentResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
