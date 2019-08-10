
package aws.glue;

import java.util.List;
import java.util.Map;
import aws.CreationPolicy;
import aws.DeletionPolicy;
import aws.HasCondition;
import aws.HasDependsOn;
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
 * DataCatalogEncryptionSettingsResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Properties"
})
public class DataCatalogEncryptionSettingsResource
    extends Resource
    implements HasCondition<DataCatalogEncryptionSettingsResource> , HasDependsOn<DataCatalogEncryptionSettingsResource>
{

    @JsonProperty("Type")
    private java.lang.String type = "AWS::Glue::DataCatalogEncryptionSettings";
    /**
     * DataCatalogEncryptionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html")
    private DataCatalogEncryptionSettings properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataCatalogEncryptionSettingsResource() {
    }

    /**
     * 
     * @param name
     */
    public DataCatalogEncryptionSettingsResource(java.lang.String name) {
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

    public DataCatalogEncryptionSettingsResource withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * DataCatalogEncryptionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html
     * 
     */
    @JsonIgnore
    public DataCatalogEncryptionSettings getProperties() {
        return properties;
    }

    /**
     * DataCatalogEncryptionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html
     * 
     */
    @JsonIgnore
    public void setProperties(DataCatalogEncryptionSettings properties) {
        this.properties = properties;
    }

    public DataCatalogEncryptionSettingsResource withProperties(DataCatalogEncryptionSettings properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public DataCatalogEncryptionSettingsResource withCondition(java.lang.String condition) {
        super.withCondition(condition);
        return this;
    }

    @Override
    public DataCatalogEncryptionSettingsResource withCreationPolicy(CreationPolicy creationPolicy) {
        super.withCreationPolicy(creationPolicy);
        return this;
    }

    @Override
    public DataCatalogEncryptionSettingsResource withUpdatePolicy(UpdatePolicy updatePolicy) {
        super.withUpdatePolicy(updatePolicy);
        return this;
    }

    @Override
    public DataCatalogEncryptionSettingsResource withDeletionPolicy(DeletionPolicy deletionPolicy) {
        super.withDeletionPolicy(deletionPolicy);
        return this;
    }

    @Override
    public DataCatalogEncryptionSettingsResource withDependsOn(List<java.lang.String> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    @Override
    public DataCatalogEncryptionSettingsResource withMetadata(Map<String, Object> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    @Override
    public DataCatalogEncryptionSettingsResource withName(java.lang.String name) {
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
        if ((other instanceof DataCatalogEncryptionSettingsResource) == false) {
            return false;
        }
        DataCatalogEncryptionSettingsResource rhs = ((DataCatalogEncryptionSettingsResource) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(type, rhs.type).append(properties, rhs.properties).isEquals();
    }

}
