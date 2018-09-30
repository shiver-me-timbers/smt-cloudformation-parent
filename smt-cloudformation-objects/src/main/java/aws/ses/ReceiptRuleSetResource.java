
package aws.ses;

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
 * ReceiptRuleSetResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class ReceiptRuleSetResource
    extends Resource
{

    /**
     * ReceiptRuleSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html")
    private ReceiptRuleSet properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReceiptRuleSetResource() {
    }

    /**
     * 
     * @param name
     */
    public ReceiptRuleSetResource(java.lang.String name) {
        super(name);
    }

    /**
     * ReceiptRuleSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html
     * 
     */
    public ReceiptRuleSet getProperties() {
        return properties;
    }

    /**
     * ReceiptRuleSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html
     * 
     */
    public void setProperties(ReceiptRuleSet properties) {
        this.properties = properties;
    }

    public ReceiptRuleSetResource withProperties(ReceiptRuleSet properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public ReceiptRuleSetResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public ReceiptRuleSetResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public ReceiptRuleSetResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public ReceiptRuleSetResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public ReceiptRuleSetResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public ReceiptRuleSetResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public ReceiptRuleSetResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public ReceiptRuleSetResource withName(java.lang.String name) {
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
        if ((other instanceof ReceiptRuleSetResource) == false) {
            return false;
        }
        ReceiptRuleSetResource rhs = ((ReceiptRuleSetResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
