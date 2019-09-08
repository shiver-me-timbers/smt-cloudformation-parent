
package shiver.me.timbers.aws.glue;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * DataCatalogEncryptionSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DataCatalogEncryptionSettings",
    "CatalogId"
})
public class DataCatalogEncryptionSettings {

    /**
     * DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html
     * 
     */
    @JsonProperty("DataCatalogEncryptionSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html")
    private Property<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings> dataCatalogEncryptionSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid
     * 
     */
    @JsonProperty("CatalogId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid")
    private CharSequence catalogId;

    /**
     * DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html
     * 
     */
    @JsonIgnore
    public Property<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings> getDataCatalogEncryptionSettings() {
        return dataCatalogEncryptionSettings;
    }

    /**
     * DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-datacatalogencryptionsettings.html
     * 
     */
    @JsonIgnore
    public void setDataCatalogEncryptionSettings(Property<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings> dataCatalogEncryptionSettings) {
        this.dataCatalogEncryptionSettings = dataCatalogEncryptionSettings;
    }

    public DataCatalogEncryptionSettings withDataCatalogEncryptionSettings(Property<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings> dataCatalogEncryptionSettings) {
        this.dataCatalogEncryptionSettings = dataCatalogEncryptionSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid
     * 
     */
    @JsonIgnore
    public CharSequence getCatalogId() {
        return catalogId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-datacatalogencryptionsettings.html#cfn-glue-datacatalogencryptionsettings-catalogid
     * 
     */
    @JsonIgnore
    public void setCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
    }

    public DataCatalogEncryptionSettings withCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataCatalogEncryptionSettings", dataCatalogEncryptionSettings).append("catalogId", catalogId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataCatalogEncryptionSettings).append(catalogId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataCatalogEncryptionSettings) == false) {
            return false;
        }
        DataCatalogEncryptionSettings rhs = ((DataCatalogEncryptionSettings) other);
        return new EqualsBuilder().append(dataCatalogEncryptionSettings, rhs.dataCatalogEncryptionSettings).append(catalogId, rhs.catalogId).isEquals();
    }

}
