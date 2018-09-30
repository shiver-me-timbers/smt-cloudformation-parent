
package aws.cloud9;

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
 * EnvironmentEC2Resource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Properties"
})
public class EnvironmentEC2Resource
    extends Resource
    implements HasAttributes<EnvironmentEC2Attributes>
{

    /**
     * EnvironmentEC2
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html")
    private EnvironmentEC2 properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnvironmentEC2Resource() {
    }

    /**
     * 
     * @param name
     */
    public EnvironmentEC2Resource(java.lang.String name) {
        super(name);
    }

    /**
     * EnvironmentEC2
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html
     * 
     */
    public EnvironmentEC2 getProperties() {
        return properties;
    }

    /**
     * EnvironmentEC2
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloud9-environmentec2.html
     * 
     */
    public void setProperties(EnvironmentEC2 properties) {
        this.properties = properties;
    }

    public EnvironmentEC2Resource withProperties(EnvironmentEC2 properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public EnvironmentEC2Resource withType(java.lang.String type) {
        super.withType(type);
        return this;
    }

    @Override
    public EnvironmentEC2Resource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public EnvironmentEC2Resource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public EnvironmentEC2Resource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public EnvironmentEC2Resource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public EnvironmentEC2Resource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public EnvironmentEC2Resource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public EnvironmentEC2Resource withName(java.lang.String name) {
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
        if ((other instanceof EnvironmentEC2Resource) == false) {
            return false;
        }
        EnvironmentEC2Resource rhs = ((EnvironmentEC2Resource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(properties, rhs.properties).isEquals();
    }

}
