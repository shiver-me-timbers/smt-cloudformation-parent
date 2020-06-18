
package shiver.me.timbers.aws.networkmanager;

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
 * CustomerGatewayAssociationResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class CustomerGatewayAssociationResource
    extends Resource
    implements HasCondition<CustomerGatewayAssociationResource> , HasDependsOn<CustomerGatewayAssociationResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::NetworkManager::CustomerGatewayAssociation";
    /**
     * CustomerGatewayAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html")
    private CustomerGatewayAssociation properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CustomerGatewayAssociationResource() {
    }

    /**
     * 
     * @param name
     */
    public CustomerGatewayAssociationResource(java.lang.String name) {
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

    public CustomerGatewayAssociationResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * CustomerGatewayAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html
     * 
     */
    @JsonIgnore
    public CustomerGatewayAssociation getProperties() {
        return properties;
    }

    /**
     * CustomerGatewayAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-customergatewayassociation.html
     * 
     */
    @JsonIgnore
    public void setProperties(CustomerGatewayAssociation properties) {
        this.properties = properties;
    }

    public CustomerGatewayAssociationResource withProperties(CustomerGatewayAssociation properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public CustomerGatewayAssociationResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public CustomerGatewayAssociationResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public CustomerGatewayAssociationResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public CustomerGatewayAssociationResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public CustomerGatewayAssociationResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public CustomerGatewayAssociationResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public CustomerGatewayAssociationResource withName(java.lang.String name) {
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
        if ((other instanceof CustomerGatewayAssociationResource) == false) {
            return false;
        }
        CustomerGatewayAssociationResource rhs = ((CustomerGatewayAssociationResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
