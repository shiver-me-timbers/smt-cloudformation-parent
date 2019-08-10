
package aws.ec2;

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
 * ClientVpnTargetNetworkAssociationResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class ClientVpnTargetNetworkAssociationResource
    extends Resource
    implements HasCondition<ClientVpnTargetNetworkAssociationResource> , HasDependsOn<ClientVpnTargetNetworkAssociationResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::EC2::ClientVpnTargetNetworkAssociation";
    /**
     * ClientVpnTargetNetworkAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html")
    private ClientVpnTargetNetworkAssociation properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClientVpnTargetNetworkAssociationResource() {
    }

    /**
     * 
     * @param name
     */
    public ClientVpnTargetNetworkAssociationResource(java.lang.String name) {
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

    public ClientVpnTargetNetworkAssociationResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * ClientVpnTargetNetworkAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html
     * 
     */
    @JsonIgnore
    public ClientVpnTargetNetworkAssociation getProperties() {
        return properties;
    }

    /**
     * ClientVpnTargetNetworkAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html
     * 
     */
    @JsonIgnore
    public void setProperties(ClientVpnTargetNetworkAssociation properties) {
        this.properties = properties;
    }

    public ClientVpnTargetNetworkAssociationResource withProperties(ClientVpnTargetNetworkAssociation properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public ClientVpnTargetNetworkAssociationResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public ClientVpnTargetNetworkAssociationResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public ClientVpnTargetNetworkAssociationResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public ClientVpnTargetNetworkAssociationResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public ClientVpnTargetNetworkAssociationResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public ClientVpnTargetNetworkAssociationResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public ClientVpnTargetNetworkAssociationResource withName(java.lang.String name) {
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
        if ((other instanceof ClientVpnTargetNetworkAssociationResource) == false) {
            return false;
        }
        ClientVpnTargetNetworkAssociationResource rhs = ((ClientVpnTargetNetworkAssociationResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
