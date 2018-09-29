
package aws.redshift;

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
 * ClusterSecurityGroupIngressResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class ClusterSecurityGroupIngressResource
    extends Resource
{

    /**
     * ClusterSecurityGroupIngress
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html")
    private ClusterSecurityGroupIngress properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClusterSecurityGroupIngressResource() {
    }

    /**
     * 
     * @param name
     */
    public ClusterSecurityGroupIngressResource(java.lang.String name) {
        super(name);
    }

    /**
     * ClusterSecurityGroupIngress
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html
     * 
     */
    public ClusterSecurityGroupIngress getProperties() {
        return properties;
    }

    /**
     * ClusterSecurityGroupIngress
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html
     * 
     */
    public void setProperties(ClusterSecurityGroupIngress properties) {
        this.properties = properties;
    }

    public ClusterSecurityGroupIngressResource withProperties(ClusterSecurityGroupIngress properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public ClusterSecurityGroupIngressResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public ClusterSecurityGroupIngressResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public ClusterSecurityGroupIngressResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public ClusterSecurityGroupIngressResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public ClusterSecurityGroupIngressResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public ClusterSecurityGroupIngressResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public ClusterSecurityGroupIngressResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public ClusterSecurityGroupIngressResource withName(java.lang.String name) {
        super.withName(name);
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
        if ((other instanceof ClusterSecurityGroupIngressResource) == false) {
            return false;
        }
        ClusterSecurityGroupIngressResource rhs = ((ClusterSecurityGroupIngressResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
