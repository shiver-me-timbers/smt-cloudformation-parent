
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
 * PublicDnsNamespaceResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class PublicDnsNamespaceResource
    extends Resource
    implements HasAttributes<PublicDnsNamespaceAttributes>
{

    /**
     * PublicDnsNamespace
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html")
    private PublicDnsNamespace properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PublicDnsNamespaceResource() {
    }

    /**
     * 
     * @param name
     */
    public PublicDnsNamespaceResource(java.lang.String name) {
        super(name);
    }

    /**
     * PublicDnsNamespace
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html
     * 
     */
    public PublicDnsNamespace getProperties() {
        return properties;
    }

    /**
     * PublicDnsNamespace
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicediscovery-publicdnsnamespace.html
     * 
     */
    public void setProperties(PublicDnsNamespace properties) {
        this.properties = properties;
    }

    public PublicDnsNamespaceResource withProperties(PublicDnsNamespace properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public PublicDnsNamespaceResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public PublicDnsNamespaceResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public PublicDnsNamespaceResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public PublicDnsNamespaceResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public PublicDnsNamespaceResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public PublicDnsNamespaceResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public PublicDnsNamespaceResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public PublicDnsNamespaceResource withName(java.lang.String name) {
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
        if ((other instanceof PublicDnsNamespaceResource) == false) {
            return false;
        }
        PublicDnsNamespaceResource rhs = ((PublicDnsNamespaceResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
