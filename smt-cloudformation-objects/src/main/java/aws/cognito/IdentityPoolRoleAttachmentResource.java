
package aws.cognito;

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
 * IdentityPoolRoleAttachmentResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class IdentityPoolRoleAttachmentResource
    extends Resource
{

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
     * IdentityPoolRoleAttachment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
     * 
     */
    @JsonProperty("Properties")
    public IdentityPoolRoleAttachment getProperties() {
        return properties;
    }

    /**
     * IdentityPoolRoleAttachment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html
     * 
     */
    @JsonProperty("Properties")
    public void setProperties(IdentityPoolRoleAttachment properties) {
        this.properties = properties;
    }

    public IdentityPoolRoleAttachmentResource withProperties(IdentityPoolRoleAttachment properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public IdentityPoolRoleAttachmentResource withType(java.lang.String type) {
        super.withType(type);
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
        if ((other instanceof IdentityPoolRoleAttachmentResource) == false) {
            return false;
        }
        IdentityPoolRoleAttachmentResource rhs = ((IdentityPoolRoleAttachmentResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
