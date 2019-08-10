
package aws.servicecatalog;

import java.util.List;
import java.util.Map;
import aws.CreationPolicy;
import aws.DeletionPolicy;
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
 * ResourceUpdateConstraintResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class ResourceUpdateConstraintResource
    extends Resource
    implements HasCondition<ResourceUpdateConstraintResource> , HasDependsOn<ResourceUpdateConstraintResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::ServiceCatalog::ResourceUpdateConstraint";
    /**
     * ResourceUpdateConstraint
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html")
    private ResourceUpdateConstraint properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResourceUpdateConstraintResource() {
    }

    /**
     * 
     * @param name
     */
    public ResourceUpdateConstraintResource(java.lang.String name) {
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

    public ResourceUpdateConstraintResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * ResourceUpdateConstraint
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html
     * 
     */
    @JsonIgnore
    public ResourceUpdateConstraint getProperties() {
        return properties;
    }

    /**
     * ResourceUpdateConstraint
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html
     * 
     */
    @JsonIgnore
    public void setProperties(ResourceUpdateConstraint properties) {
        this.properties = properties;
    }

    public ResourceUpdateConstraintResource withProperties(ResourceUpdateConstraint properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public ResourceUpdateConstraintResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public ResourceUpdateConstraintResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public ResourceUpdateConstraintResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public ResourceUpdateConstraintResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public ResourceUpdateConstraintResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public ResourceUpdateConstraintResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public ResourceUpdateConstraintResource withName(java.lang.String name) {
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
        if ((other instanceof ResourceUpdateConstraintResource) == false) {
            return false;
        }
        ResourceUpdateConstraintResource rhs = ((ResourceUpdateConstraintResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
