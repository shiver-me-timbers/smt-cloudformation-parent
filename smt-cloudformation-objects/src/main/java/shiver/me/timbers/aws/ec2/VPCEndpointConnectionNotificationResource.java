
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
 * VPCEndpointConnectionNotificationResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class VPCEndpointConnectionNotificationResource
    extends Resource
    implements HasCondition<VPCEndpointConnectionNotificationResource> , HasDependsOn<VPCEndpointConnectionNotificationResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::EC2::VPCEndpointConnectionNotification";
    /**
     * VPCEndpointConnectionNotification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html")
    private VPCEndpointConnectionNotification properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VPCEndpointConnectionNotificationResource() {
    }

    /**
     * 
     * @param name
     */
    public VPCEndpointConnectionNotificationResource(java.lang.String name) {
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

    public VPCEndpointConnectionNotificationResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * VPCEndpointConnectionNotification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html
     * 
     */
    @JsonIgnore
    public VPCEndpointConnectionNotification getProperties() {
        return properties;
    }

    /**
     * VPCEndpointConnectionNotification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html
     * 
     */
    @JsonIgnore
    public void setProperties(VPCEndpointConnectionNotification properties) {
        this.properties = properties;
    }

    public VPCEndpointConnectionNotificationResource withProperties(VPCEndpointConnectionNotification properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public VPCEndpointConnectionNotificationResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public VPCEndpointConnectionNotificationResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public VPCEndpointConnectionNotificationResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public VPCEndpointConnectionNotificationResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public VPCEndpointConnectionNotificationResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public VPCEndpointConnectionNotificationResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public VPCEndpointConnectionNotificationResource withName(java.lang.String name) {
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
        if ((other instanceof VPCEndpointConnectionNotificationResource) == false) {
            return false;
        }
        VPCEndpointConnectionNotificationResource rhs = ((VPCEndpointConnectionNotificationResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
