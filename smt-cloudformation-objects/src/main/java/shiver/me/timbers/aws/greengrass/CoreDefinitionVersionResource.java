
package shiver.me.timbers.aws.greengrass;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.CreationPolicy;
import shiver.me.timbers.aws.DeletionPolicy;
import shiver.me.timbers.aws.HasCondition;
import shiver.me.timbers.aws.HasDependsOn;
import shiver.me.timbers.aws.Resource;
import shiver.me.timbers.aws.UpdatePolicy;


/**
 * CoreDefinitionVersionResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class CoreDefinitionVersionResource
    extends Resource
    implements HasCondition<CoreDefinitionVersionResource> , HasDependsOn<CoreDefinitionVersionResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::Greengrass::CoreDefinitionVersion";
    /**
     * CoreDefinitionVersion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html")
    private CoreDefinitionVersion properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CoreDefinitionVersionResource() {
    }

    /**
     * 
     * @param name
     */
    public CoreDefinitionVersionResource(java.lang.String name) {
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

    public CoreDefinitionVersionResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * CoreDefinitionVersion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html
     * 
     */
    @JsonIgnore
    public CoreDefinitionVersion getProperties() {
        return properties;
    }

    /**
     * CoreDefinitionVersion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html
     * 
     */
    @JsonIgnore
    public void setProperties(CoreDefinitionVersion properties) {
        this.properties = properties;
    }

    public CoreDefinitionVersionResource withProperties(CoreDefinitionVersion properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public CoreDefinitionVersionResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public CoreDefinitionVersionResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public CoreDefinitionVersionResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public CoreDefinitionVersionResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public CoreDefinitionVersionResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public CoreDefinitionVersionResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public CoreDefinitionVersionResource withName(java.lang.String name) {
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
        if ((other instanceof CoreDefinitionVersionResource) == false) {
            return false;
        }
        CoreDefinitionVersionResource rhs = ((CoreDefinitionVersionResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
