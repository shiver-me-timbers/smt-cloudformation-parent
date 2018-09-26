
package aws.ecs;

import java.util.List;
import java.util.Map;
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


/**
 * ClusterResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class ClusterResource
    extends Resource
    implements HasAttributes<ClusterAttributes>
{

    /**
     * Cluster
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html")
    private Cluster properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClusterResource() {
    }

    /**
     * 
     * @param name
     */
    public ClusterResource(java.lang.String name) {
        super(name);
    }

    /**
     * Cluster
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html
     * 
     */
    public Cluster getProperties() {
        return properties;
    }

    /**
     * Cluster
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html
     * 
     */
    public void setProperties(Cluster properties) {
        this.properties = properties;
    }

    public ClusterResource withProperties(Cluster properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public ClusterResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public ClusterResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public ClusterResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public ClusterResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public ClusterResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public ClusterResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public ClusterResource withName(java.lang.String name) {
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
        if ((other instanceof ClusterResource) == false) {
            return false;
        }
        ClusterResource rhs = ((ClusterResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
