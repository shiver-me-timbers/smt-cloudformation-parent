
package aws.neptune;

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
 * DBInstanceResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class DBInstanceResource
    extends Resource
    implements HasAttributes<DBInstanceAttributes>
{

    /**
     * DBInstance
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html")
    private DBInstance properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DBInstanceResource() {
    }

    /**
     * 
     * @param name
     */
    public DBInstanceResource(java.lang.String name) {
        super(name);
    }

    /**
     * DBInstance
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html
     * 
     */
    public DBInstance getProperties() {
        return properties;
    }

    /**
     * DBInstance
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html
     * 
     */
    public void setProperties(DBInstance properties) {
        this.properties = properties;
    }

    public DBInstanceResource withProperties(DBInstance properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public DBInstanceResource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public DBInstanceResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public DBInstanceResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public DBInstanceResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public DBInstanceResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public DBInstanceResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public DBInstanceResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public DBInstanceResource withName(java.lang.String name) {
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
        if ((other instanceof DBInstanceResource) == false) {
            return false;
        }
        DBInstanceResource rhs = ((DBInstanceResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
