
package aws.ec2;

import java.util.List;
import java.util.Map;
import aws.CreationPolicy;
import aws.DeletionPolicy;
import aws.Resource;
import aws.UpdatePolicy;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPCEndpointServicePermissionsResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class VPCEndpointServicePermissionsResource
    extends Resource
{

    /**
     * VPCEndpointServicePermissions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html")
    private VPCEndpointServicePermissions properties;

    /**
     * VPCEndpointServicePermissions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html
     * 
     */
    @JsonProperty("Properties")
    public VPCEndpointServicePermissions getProperties() {
        return properties;
    }

    /**
     * VPCEndpointServicePermissions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html
     * 
     */
    @JsonProperty("Properties")
    public void setProperties(VPCEndpointServicePermissions properties) {
        this.properties = properties;
    }

    public VPCEndpointServicePermissionsResource withProperties(VPCEndpointServicePermissions properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public VPCEndpointServicePermissionsResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public VPCEndpointServicePermissionsResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public VPCEndpointServicePermissionsResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public VPCEndpointServicePermissionsResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public VPCEndpointServicePermissionsResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public VPCEndpointServicePermissionsResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("properties", properties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(properties).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCEndpointServicePermissionsResource) == false) {
            return false;
        }
        VPCEndpointServicePermissionsResource rhs = ((VPCEndpointServicePermissionsResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}