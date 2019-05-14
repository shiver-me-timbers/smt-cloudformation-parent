
package aws.ec2;

import java.util.List;
import java.util.Map;
import aws.CreationPolicy;
import aws.DeletionPolicy;
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
 * TransitGatewayRouteTablePropagationResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class TransitGatewayRouteTablePropagationResource
    extends Resource
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::EC2::TransitGatewayRouteTablePropagation";
    /**
     * TransitGatewayRouteTablePropagation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html")
    private TransitGatewayRouteTablePropagation properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransitGatewayRouteTablePropagationResource() {
    }

    /**
     * 
     * @param name
     */
    public TransitGatewayRouteTablePropagationResource(java.lang.String name) {
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

    public TransitGatewayRouteTablePropagationResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * TransitGatewayRouteTablePropagation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html
     * 
     */
    @JsonIgnore
    public TransitGatewayRouteTablePropagation getProperties() {
        return properties;
    }

    /**
     * TransitGatewayRouteTablePropagation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html
     * 
     */
    @JsonIgnore
    public void setProperties(TransitGatewayRouteTablePropagation properties) {
        this.properties = properties;
    }

    public TransitGatewayRouteTablePropagationResource withProperties(TransitGatewayRouteTablePropagation properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public TransitGatewayRouteTablePropagationResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public TransitGatewayRouteTablePropagationResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public TransitGatewayRouteTablePropagationResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public TransitGatewayRouteTablePropagationResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public TransitGatewayRouteTablePropagationResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public TransitGatewayRouteTablePropagationResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public TransitGatewayRouteTablePropagationResource withName(java.lang.String name) {
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
        if ((other instanceof TransitGatewayRouteTablePropagationResource) == false) {
            return false;
        }
        TransitGatewayRouteTablePropagationResource rhs = ((TransitGatewayRouteTablePropagationResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}