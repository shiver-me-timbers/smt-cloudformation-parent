
package aws.wafregional;

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

import java.util.List;
import java.util.Map;


/**
 * SizeConstraintSetResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class SizeConstraintSetResource
    extends Resource
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::WAFRegional::SizeConstraintSet";
    /**
     * SizeConstraintSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html")
    private SizeConstraintSet properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SizeConstraintSetResource() {
    }

    /**
     * 
     * @param name
     */
    public SizeConstraintSetResource(java.lang.String name) {
        super(name);
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public SizeConstraintSetResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * SizeConstraintSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html
     * 
     */
    public SizeConstraintSet getProperties() {
        return properties;
    }

    /**
     * SizeConstraintSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html
     * 
     */
    public void setProperties(SizeConstraintSet properties) {
        this.properties = properties;
    }

    public SizeConstraintSetResource withProperties(SizeConstraintSet properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public SizeConstraintSetResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public SizeConstraintSetResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public SizeConstraintSetResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public SizeConstraintSetResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public SizeConstraintSetResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public SizeConstraintSetResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public SizeConstraintSetResource withName(java.lang.String name) {
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
        if ((other instanceof SizeConstraintSetResource) == false) {
            return false;
        }
        SizeConstraintSetResource rhs = ((SizeConstraintSetResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
