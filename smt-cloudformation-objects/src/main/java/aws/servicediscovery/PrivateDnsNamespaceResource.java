
package aws.servicediscovery;

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
 * PrivateDnsNamespaceResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class PrivateDnsNamespaceResource
    extends Resource
    implements HasAttributes<PrivateDnsNamespaceAttributes>
{

    /**
     * PrivateDnsNamespace
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html")
    private PrivateDnsNamespace properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrivateDnsNamespaceResource() {
    }

    /**
     * 
     * @param name
     */
    public PrivateDnsNamespaceResource(java.lang.String name) {
        super(name);
    }

    /**
     * PrivateDnsNamespace
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html
     * 
     */
    public PrivateDnsNamespace getProperties() {
        return properties;
    }

    /**
     * PrivateDnsNamespace
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-privatednsnamespace.html
     * 
     */
    public void setProperties(PrivateDnsNamespace properties) {
        this.properties = properties;
    }

    public PrivateDnsNamespaceResource withProperties(PrivateDnsNamespace properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public PrivateDnsNamespaceResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public PrivateDnsNamespaceResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public PrivateDnsNamespaceResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public PrivateDnsNamespaceResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public PrivateDnsNamespaceResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public PrivateDnsNamespaceResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public PrivateDnsNamespaceResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public PrivateDnsNamespaceResource withName(java.lang.String name) {
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
        if ((other instanceof PrivateDnsNamespaceResource) == false) {
            return false;
        }
        PrivateDnsNamespaceResource rhs = ((PrivateDnsNamespaceResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
