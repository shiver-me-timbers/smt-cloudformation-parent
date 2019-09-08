
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
 * DataCatalogEncryptionSettingsConnectionPasswordEncryption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReturnConnectionPasswordEncrypted",
    "KmsKeyId"
})
public class DataCatalogEncryptionSettingsConnectionPasswordEncryption implements Property<DataCatalogEncryptionSettingsConnectionPasswordEncryption>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-returnconnectionpasswordencrypted
     * 
     */
    @JsonProperty("ReturnConnectionPasswordEncrypted")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-returnconnectionpasswordencrypted")
    private CharSequence returnConnectionPasswordEncrypted;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-kmskeyid")
    private CharSequence kmsKeyId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-returnconnectionpasswordencrypted
     * 
     */
    @JsonIgnore
    public CharSequence getReturnConnectionPasswordEncrypted() {
        return returnConnectionPasswordEncrypted;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-returnconnectionpasswordencrypted
     * 
     */
    @JsonIgnore
    public void setReturnConnectionPasswordEncrypted(CharSequence returnConnectionPasswordEncrypted) {
        this.returnConnectionPasswordEncrypted = returnConnectionPasswordEncrypted;
    }

    public DataCatalogEncryptionSettingsConnectionPasswordEncryption withReturnConnectionPasswordEncrypted(CharSequence returnConnectionPasswordEncrypted) {
        this.returnConnectionPasswordEncrypted = returnConnectionPasswordEncrypted;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-kmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-datacatalogencryptionsettings-connectionpasswordencryption.html#cfn-glue-datacatalogencryptionsettings-connectionpasswordencryption-kmskeyid
     * 
     */
    @JsonIgnore
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public DataCatalogEncryptionSettingsConnectionPasswordEncryption withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("returnConnectionPasswordEncrypted", returnConnectionPasswordEncrypted).append("kmsKeyId", kmsKeyId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(returnConnectionPasswordEncrypted).append(kmsKeyId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataCatalogEncryptionSettingsConnectionPasswordEncryption) == false) {
            return false;
        }
        DataCatalogEncryptionSettingsConnectionPasswordEncryption rhs = ((DataCatalogEncryptionSettingsConnectionPasswordEncryption) other);
        return new EqualsBuilder().append(returnConnectionPasswordEncrypted, rhs.returnConnectionPasswordEncrypted).append(kmsKeyId, rhs.kmsKeyId).isEquals();
    }

}
