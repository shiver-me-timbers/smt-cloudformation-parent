
package aws.glue;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConnectionPasswordEncryption",
    "EncryptionAtRest"
})
public class DataCatalogEncryptionSettingsDataCatalogEncryptionSettings implements Property<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings>
{

    /**
     * DataCatalogEncryptionSettingsConnectionPasswordEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html
     * 
     */
    @JsonProperty("ConnectionPasswordEncryption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html")
    private Property<DataCatalogEncryptionSettingsConnectionPasswordEncryption> connectionPasswordEncryption;
    /**
     * DataCatalogEncryptionSettingsEncryptionAtRest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html
     * 
     */
    @JsonProperty("EncryptionAtRest")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html")
    private Property<DataCatalogEncryptionSettingsEncryptionAtRest> encryptionAtRest;

    /**
     * DataCatalogEncryptionSettingsConnectionPasswordEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html
     * 
     */
    @JsonIgnore
    public Property<DataCatalogEncryptionSettingsConnectionPasswordEncryption> getConnectionPasswordEncryption() {
        return connectionPasswordEncryption;
    }

    /**
     * DataCatalogEncryptionSettingsConnectionPasswordEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html
     * 
     */
    @JsonIgnore
    public void setConnectionPasswordEncryption(Property<DataCatalogEncryptionSettingsConnectionPasswordEncryption> connectionPasswordEncryption) {
        this.connectionPasswordEncryption = connectionPasswordEncryption;
    }

    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettings withConnectionPasswordEncryption(Property<DataCatalogEncryptionSettingsConnectionPasswordEncryption> connectionPasswordEncryption) {
        this.connectionPasswordEncryption = connectionPasswordEncryption;
        return this;
    }

    /**
     * DataCatalogEncryptionSettingsEncryptionAtRest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html
     * 
     */
    @JsonIgnore
    public Property<DataCatalogEncryptionSettingsEncryptionAtRest> getEncryptionAtRest() {
        return encryptionAtRest;
    }

    /**
     * DataCatalogEncryptionSettingsEncryptionAtRest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html
     * 
     */
    @JsonIgnore
    public void setEncryptionAtRest(Property<DataCatalogEncryptionSettingsEncryptionAtRest> encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
    }

    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettings withEncryptionAtRest(Property<DataCatalogEncryptionSettingsEncryptionAtRest> encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connectionPasswordEncryption", connectionPasswordEncryption).append("encryptionAtRest", encryptionAtRest).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(encryptionAtRest).append(connectionPasswordEncryption).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataCatalogEncryptionSettingsDataCatalogEncryptionSettings) == false) {
            return false;
        }
        DataCatalogEncryptionSettingsDataCatalogEncryptionSettings rhs = ((DataCatalogEncryptionSettingsDataCatalogEncryptionSettings) other);
        return new EqualsBuilder().append(encryptionAtRest, rhs.encryptionAtRest).append(connectionPasswordEncryption, rhs.connectionPasswordEncryption).isEquals();
    }

}
