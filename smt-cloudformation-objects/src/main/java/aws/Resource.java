
package aws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Resource
 * <p>
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resources-section-structure.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Condition",
    "CreationPolicy",
    "UpdatePolicy",
    "DeletionPolicy",
    "DependsOn",
    "Metadata"
})
public class Resource
    extends Named
    implements HasCondition<Template> , HasDependsOn<Template> , HasReference
{

    @JsonProperty("Type")
    private java.lang.String type;
    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/conditions-section-structure.html
     * 
     */
    @JsonProperty("Condition")
    @JsonPropertyDescription("https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/conditions-section-structure.html")
    private java.lang.String condition;
    @JsonProperty("CreationPolicy")
    private CreationPolicy creationPolicy;
    @JsonProperty("UpdatePolicy")
    private UpdatePolicy updatePolicy;
    /**
     * DeletionPolicy
     * <p>
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html
     * 
     */
    @JsonProperty("DeletionPolicy")
    @JsonPropertyDescription("https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html")
    private DeletionPolicy deletionPolicy;
    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html
     * 
     */
    @JsonProperty("DependsOn")
    @JsonPropertyDescription("https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html")
    private List<java.lang.String> dependsOn = new ArrayList<java.lang.String>();
    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html
     * 
     */
    @JsonProperty("Metadata")
    @JsonPropertyDescription("https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html")
    private Map<String, Object> metadata;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Resource() {
    }

    /**
     * 
     * @param name
     */
    public Resource(java.lang.String name) {
        super(name);
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public Resource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/conditions-section-structure.html
     * 
     */
    public java.lang.String getCondition() {
        return condition;
    }

    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/conditions-section-structure.html
     * 
     */
    public void setCondition(java.lang.String condition) {
        this.condition = condition;
    }

    public Resource withCondition(java.lang.String condition) {
        this.condition = condition;
        return this;
    }

    public CreationPolicy getCreationPolicy() {
        return creationPolicy;
    }

    public void setCreationPolicy(CreationPolicy creationPolicy) {
        this.creationPolicy = creationPolicy;
    }

    public Resource withCreationPolicy(CreationPolicy creationPolicy) {
        this.creationPolicy = creationPolicy;
        return this;
    }

    public UpdatePolicy getUpdatePolicy() {
        return updatePolicy;
    }

    public void setUpdatePolicy(UpdatePolicy updatePolicy) {
        this.updatePolicy = updatePolicy;
    }

    public Resource withUpdatePolicy(UpdatePolicy updatePolicy) {
        this.updatePolicy = updatePolicy;
        return this;
    }

    /**
     * DeletionPolicy
     * <p>
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html
     * 
     */
    public DeletionPolicy getDeletionPolicy() {
        return deletionPolicy;
    }

    /**
     * DeletionPolicy
     * <p>
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html
     * 
     */
    public void setDeletionPolicy(DeletionPolicy deletionPolicy) {
        this.deletionPolicy = deletionPolicy;
    }

    public Resource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        this.deletionPolicy = deletionPolicy;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html
     * 
     */
    public List<java.lang.String> getDependsOn() {
        return dependsOn;
    }

    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html
     * 
     */
    public void setDependsOn(List<java.lang.String> dependsOn) {
        this.dependsOn = dependsOn;
    }

    public Resource withDependsOn(List<java.lang.String> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html
     * 
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    /**
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html
     * 
     */
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public Resource withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public Resource withName(java.lang.String name) {
        super.withName(name);
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("type", type).append("condition", condition).append("creationPolicy", creationPolicy).append("updatePolicy", updatePolicy).append("deletionPolicy", deletionPolicy).append("dependsOn", dependsOn).append("metadata", metadata).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(condition).append(metadata).append(dependsOn).append(creationPolicy).append(updatePolicy).append(deletionPolicy).append(type).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(condition, rhs.condition).append(metadata, rhs.metadata).append(dependsOn, rhs.dependsOn).append(creationPolicy, rhs.creationPolicy).append(updatePolicy, rhs.updatePolicy).append(deletionPolicy, rhs.deletionPolicy).append(type, rhs.type).isEquals();
    }

}
