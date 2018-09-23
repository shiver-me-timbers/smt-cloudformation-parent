
package aws.lambda;

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
 * PermissionResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class PermissionResource
    extends Resource
{

    /**
     * Permission
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html")
    private Permission properties;

    /**
     * Permission
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html
     * 
     */
    @JsonProperty("Properties")
    public Permission getProperties() {
        return properties;
    }

    /**
     * Permission
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html
     * 
     */
    @JsonProperty("Properties")
    public void setProperties(Permission properties) {
        this.properties = properties;
    }

    public PermissionResource withProperties(Permission properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public PermissionResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public PermissionResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public PermissionResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public PermissionResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public PermissionResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public PermissionResource withMetadata(Map<String, Object> metadata) {
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
        if ((other instanceof PermissionResource) == false) {
            return false;
        }
        PermissionResource rhs = ((PermissionResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}