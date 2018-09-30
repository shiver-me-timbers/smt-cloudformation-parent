
package aws.servicecatalog;

import java.util.List;
import java.util.Map;
import aws.CreationPolicy;
import aws.DeletionPolicy;
import aws.HasAttributes;
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
 * CloudFormationProvisionedProductResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class CloudFormationProvisionedProductResource
    extends Resource
    implements HasAttributes<CloudFormationProvisionedProductAttributes>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::ServiceCatalog::CloudFormationProvisionedProduct";
    /**
     * CloudFormationProvisionedProduct
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html")
    private CloudFormationProvisionedProduct properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CloudFormationProvisionedProductResource() {
    }

    /**
     * 
     * @param name
     */
    public CloudFormationProvisionedProductResource(java.lang.String name) {
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

    public CloudFormationProvisionedProductResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * CloudFormationProvisionedProduct
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html
     * 
     */
    @JsonIgnore
    public CloudFormationProvisionedProduct getProperties() {
        return properties;
    }

    /**
     * CloudFormationProvisionedProduct
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html
     * 
     */
    @JsonIgnore
    public void setProperties(CloudFormationProvisionedProduct properties) {
        this.properties = properties;
    }

    public CloudFormationProvisionedProductResource withProperties(CloudFormationProvisionedProduct properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public CloudFormationProvisionedProductResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public CloudFormationProvisionedProductResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public CloudFormationProvisionedProductResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public CloudFormationProvisionedProductResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public CloudFormationProvisionedProductResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public CloudFormationProvisionedProductResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public CloudFormationProvisionedProductResource withName(java.lang.String name) {
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
        if ((other instanceof CloudFormationProvisionedProductResource) == false) {
            return false;
        }
        CloudFormationProvisionedProductResource rhs = ((CloudFormationProvisionedProductResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
