
package shiver.me.timbers.aws.ec2;

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
import shiver.me.timbers.aws.HasAttributes;
import shiver.me.timbers.aws.HasCondition;
import shiver.me.timbers.aws.HasDependsOn;
import shiver.me.timbers.aws.Resource;
import shiver.me.timbers.aws.UpdatePolicy;


/**
 * GatewayRouteTableAssociationResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class GatewayRouteTableAssociationResource
    extends Resource
    implements HasAttributes<GatewayRouteTableAssociationAttributes> , HasCondition<GatewayRouteTableAssociationResource> , HasDependsOn<GatewayRouteTableAssociationResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::EC2::GatewayRouteTableAssociation";
    /**
     * GatewayRouteTableAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html")
    private GatewayRouteTableAssociation properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GatewayRouteTableAssociationResource() {
    }

    /**
     * 
     * @param name
     */
    public GatewayRouteTableAssociationResource(java.lang.String name) {
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

    public GatewayRouteTableAssociationResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * GatewayRouteTableAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html
     * 
     */
    @JsonIgnore
    public GatewayRouteTableAssociation getProperties() {
        return properties;
    }

    /**
     * GatewayRouteTableAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html
     * 
     */
    @JsonIgnore
    public void setProperties(GatewayRouteTableAssociation properties) {
        this.properties = properties;
    }

    public GatewayRouteTableAssociationResource withProperties(GatewayRouteTableAssociation properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public GatewayRouteTableAssociationResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public GatewayRouteTableAssociationResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public GatewayRouteTableAssociationResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public GatewayRouteTableAssociationResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public GatewayRouteTableAssociationResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public GatewayRouteTableAssociationResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public GatewayRouteTableAssociationResource withName(java.lang.String name) {
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
        if ((other instanceof GatewayRouteTableAssociationResource) == false) {
            return false;
        }
        GatewayRouteTableAssociationResource rhs = ((GatewayRouteTableAssociationResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
