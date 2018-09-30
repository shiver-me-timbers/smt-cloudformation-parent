
package aws.neptune;

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
 * DBClusterParameterGroupResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class DBClusterParameterGroupResource
    extends Resource
{

    /**
     * DBClusterParameterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html")
    private DBClusterParameterGroup properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DBClusterParameterGroupResource() {
    }

    /**
     * 
     * @param name
     */
    public DBClusterParameterGroupResource(java.lang.String name) {
        super(name);
    }

    /**
     * DBClusterParameterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html
     * 
     */
    public DBClusterParameterGroup getProperties() {
        return properties;
    }

    /**
     * DBClusterParameterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html
     * 
     */
    public void setProperties(DBClusterParameterGroup properties) {
        this.properties = properties;
    }

    public DBClusterParameterGroupResource withProperties(DBClusterParameterGroup properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public DBClusterParameterGroupResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public DBClusterParameterGroupResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public DBClusterParameterGroupResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public DBClusterParameterGroupResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public DBClusterParameterGroupResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public DBClusterParameterGroupResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public DBClusterParameterGroupResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public DBClusterParameterGroupResource withName(java.lang.String name) {
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
        if ((other instanceof DBClusterParameterGroupResource) == false) {
            return false;
        }
        DBClusterParameterGroupResource rhs = ((DBClusterParameterGroupResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
