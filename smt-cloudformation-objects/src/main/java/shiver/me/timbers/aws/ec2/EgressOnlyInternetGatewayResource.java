
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
import shiver.me.timbers.aws.HasCondition;
import shiver.me.timbers.aws.HasDependsOn;
import shiver.me.timbers.aws.Resource;
import shiver.me.timbers.aws.UpdatePolicy;


/**
 * EgressOnlyInternetGatewayResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class EgressOnlyInternetGatewayResource
    extends Resource
    implements HasCondition<EgressOnlyInternetGatewayResource> , HasDependsOn<EgressOnlyInternetGatewayResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::EC2::EgressOnlyInternetGateway";
    /**
     * EgressOnlyInternetGateway
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html")
    private EgressOnlyInternetGateway properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EgressOnlyInternetGatewayResource() {
    }

    /**
     * 
     * @param name
     */
    public EgressOnlyInternetGatewayResource(java.lang.String name) {
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

    public EgressOnlyInternetGatewayResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * EgressOnlyInternetGateway
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html
     * 
     */
    @JsonIgnore
    public EgressOnlyInternetGateway getProperties() {
        return properties;
    }

    /**
     * EgressOnlyInternetGateway
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html
     * 
     */
    @JsonIgnore
    public void setProperties(EgressOnlyInternetGateway properties) {
        this.properties = properties;
    }

    public EgressOnlyInternetGatewayResource withProperties(EgressOnlyInternetGateway properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public EgressOnlyInternetGatewayResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public EgressOnlyInternetGatewayResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public EgressOnlyInternetGatewayResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public EgressOnlyInternetGatewayResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public EgressOnlyInternetGatewayResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public EgressOnlyInternetGatewayResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public EgressOnlyInternetGatewayResource withName(java.lang.String name) {
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
        if ((other instanceof EgressOnlyInternetGatewayResource) == false) {
            return false;
        }
        EgressOnlyInternetGatewayResource rhs = ((EgressOnlyInternetGatewayResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
