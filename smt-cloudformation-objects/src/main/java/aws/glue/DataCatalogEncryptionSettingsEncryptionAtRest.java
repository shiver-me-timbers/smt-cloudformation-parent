
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
 * DataCatalogEncryptionSettingsEncryptionAtRest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CatalogEncryptionMode",
    "SseAwsKmsKeyId"
})
public class DataCatalogEncryptionSettingsEncryptionAtRest implements Property<DataCatalogEncryptionSettingsEncryptionAtRest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-catalogencryptionmode
     * 
     */
    @JsonProperty("CatalogEncryptionMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-catalogencryptionmode")
    private CharSequence catalogEncryptionMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-sseawskmskeyid
     * 
     */
    @JsonProperty("SseAwsKmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-sseawskmskeyid")
    private CharSequence sseAwsKmsKeyId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-catalogencryptionmode
     * 
     */
    @JsonIgnore
    public CharSequence getCatalogEncryptionMode() {
        return catalogEncryptionMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-catalogencryptionmode
     * 
     */
    @JsonIgnore
    public void setCatalogEncryptionMode(CharSequence catalogEncryptionMode) {
        this.catalogEncryptionMode = catalogEncryptionMode;
    }

    public DataCatalogEncryptionSettingsEncryptionAtRest withCatalogEncryptionMode(CharSequence catalogEncryptionMode) {
        this.catalogEncryptionMode = catalogEncryptionMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-sseawskmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getSseAwsKmsKeyId() {
        return sseAwsKmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-encryptionatrest.html#cfn-glue-datacatalogencryptionsettings-encryptionatrest-sseawskmskeyid
     * 
     */
    @JsonIgnore
    public void setSseAwsKmsKeyId(CharSequence sseAwsKmsKeyId) {
        this.sseAwsKmsKeyId = sseAwsKmsKeyId;
    }

    public DataCatalogEncryptionSettingsEncryptionAtRest withSseAwsKmsKeyId(CharSequence sseAwsKmsKeyId) {
        this.sseAwsKmsKeyId = sseAwsKmsKeyId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("catalogEncryptionMode", catalogEncryptionMode).append("sseAwsKmsKeyId", sseAwsKmsKeyId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(catalogEncryptionMode).append(sseAwsKmsKeyId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataCatalogEncryptionSettingsEncryptionAtRest) == false) {
            return false;
        }
        DataCatalogEncryptionSettingsEncryptionAtRest rhs = ((DataCatalogEncryptionSettingsEncryptionAtRest) other);
        return new EqualsBuilder().append(catalogEncryptionMode, rhs.catalogEncryptionMode).append(sseAwsKmsKeyId, rhs.sseAwsKmsKeyId).isEquals();
    }

}
