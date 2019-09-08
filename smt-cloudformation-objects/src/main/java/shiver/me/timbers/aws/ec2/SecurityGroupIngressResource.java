
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
 * SecurityGroupIngressResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class SecurityGroupIngressResource
    extends Resource
    implements HasCondition<SecurityGroupIngressResource> , HasDependsOn<SecurityGroupIngressResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::EC2::SecurityGroupIngress";
    /**
     * SecurityGroupIngress
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html")
    private SecurityGroupIngress properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecurityGroupIngressResource() {
    }

    /**
     * 
     * @param name
     */
    public SecurityGroupIngressResource(java.lang.String name) {
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

    public SecurityGroupIngressResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * SecurityGroupIngress
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html
     * 
     */
    @JsonIgnore
    public SecurityGroupIngress getProperties() {
        return properties;
    }

    /**
     * SecurityGroupIngress
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html
     * 
     */
    @JsonIgnore
    public void setProperties(SecurityGroupIngress properties) {
        this.properties = properties;
    }

    public SecurityGroupIngressResource withProperties(SecurityGroupIngress properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public SecurityGroupIngressResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public SecurityGroupIngressResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public SecurityGroupIngressResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public SecurityGroupIngressResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public SecurityGroupIngressResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public SecurityGroupIngressResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public SecurityGroupIngressResource withName(java.lang.String name) {
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
        if ((other instanceof SecurityGroupIngressResource) == false) {
            return false;
        }
        SecurityGroupIngressResource rhs = ((SecurityGroupIngressResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}