
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
 * ClientVpnAuthorizationRuleResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class ClientVpnAuthorizationRuleResource
    extends Resource
    implements HasCondition<ClientVpnAuthorizationRuleResource> , HasDependsOn<ClientVpnAuthorizationRuleResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::EC2::ClientVpnAuthorizationRule";
    /**
     * ClientVpnAuthorizationRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html")
    private ClientVpnAuthorizationRule properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClientVpnAuthorizationRuleResource() {
    }

    /**
     * 
     * @param name
     */
    public ClientVpnAuthorizationRuleResource(java.lang.String name) {
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

    public ClientVpnAuthorizationRuleResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * ClientVpnAuthorizationRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html
     * 
     */
    @JsonIgnore
    public ClientVpnAuthorizationRule getProperties() {
        return properties;
    }

    /**
     * ClientVpnAuthorizationRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html
     * 
     */
    @JsonIgnore
    public void setProperties(ClientVpnAuthorizationRule properties) {
        this.properties = properties;
    }

    public ClientVpnAuthorizationRuleResource withProperties(ClientVpnAuthorizationRule properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public ClientVpnAuthorizationRuleResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public ClientVpnAuthorizationRuleResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public ClientVpnAuthorizationRuleResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public ClientVpnAuthorizationRuleResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public ClientVpnAuthorizationRuleResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public ClientVpnAuthorizationRuleResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public ClientVpnAuthorizationRuleResource withName(java.lang.String name) {
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
        if ((other instanceof ClientVpnAuthorizationRuleResource) == false) {
            return false;
        }
        ClientVpnAuthorizationRuleResource rhs = ((ClientVpnAuthorizationRuleResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
