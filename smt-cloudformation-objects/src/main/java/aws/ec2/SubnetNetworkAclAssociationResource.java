
package aws.ec2;

import aws.CreationPolicy;
import aws.DeletionPolicy;
import aws.HasAttributes;
import aws.Resource;
import aws.UpdatePolicy;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;


/**
 * SubnetNetworkAclAssociationResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class SubnetNetworkAclAssociationResource
    extends Resource
    implements HasAttributes<SubnetNetworkAclAssociationAttributes>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::EC2::SubnetNetworkAclAssociation";
    /**
     * SubnetNetworkAclAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html")
    private SubnetNetworkAclAssociation properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubnetNetworkAclAssociationResource() {
    }

    /**
     * 
     * @param name
     */
    public SubnetNetworkAclAssociationResource(java.lang.String name) {
        super(name);
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public SubnetNetworkAclAssociationResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * SubnetNetworkAclAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html
     * 
     */
    public SubnetNetworkAclAssociation getProperties() {
        return properties;
    }

    /**
     * SubnetNetworkAclAssociation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-network-acl-assoc.html
     * 
     */
    public void setProperties(SubnetNetworkAclAssociation properties) {
        this.properties = properties;
    }

    public SubnetNetworkAclAssociationResource withProperties(SubnetNetworkAclAssociation properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public SubnetNetworkAclAssociationResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public SubnetNetworkAclAssociationResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public SubnetNetworkAclAssociationResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public SubnetNetworkAclAssociationResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public SubnetNetworkAclAssociationResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public SubnetNetworkAclAssociationResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public SubnetNetworkAclAssociationResource withName(java.lang.String name) {
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
        if ((other instanceof SubnetNetworkAclAssociationResource) == false) {
            return false;
        }
        SubnetNetworkAclAssociationResource rhs = ((SubnetNetworkAclAssociationResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
