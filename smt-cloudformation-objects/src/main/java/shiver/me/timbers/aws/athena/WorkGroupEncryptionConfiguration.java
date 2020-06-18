
package shiver.me.timbers.aws.athena;

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
 * WorkGroupEncryptionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EncryptionOption",
    "KmsKey"
})
public class WorkGroupEncryptionConfiguration implements Property<WorkGroupEncryptionConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-encryptionoption
     * 
     */
    @JsonProperty("EncryptionOption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-encryptionoption")
    private CharSequence encryptionOption;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-kmskey
     * 
     */
    @JsonProperty("KmsKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-kmskey")
    private CharSequence kmsKey;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-encryptionoption
     * 
     */
    @JsonIgnore
    public CharSequence getEncryptionOption() {
        return encryptionOption;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-encryptionoption
     * 
     */
    @JsonIgnore
    public void setEncryptionOption(CharSequence encryptionOption) {
        this.encryptionOption = encryptionOption;
    }

    public WorkGroupEncryptionConfiguration withEncryptionOption(CharSequence encryptionOption) {
        this.encryptionOption = encryptionOption;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-kmskey
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKey() {
        return kmsKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-kmskey
     * 
     */
    @JsonIgnore
    public void setKmsKey(CharSequence kmsKey) {
        this.kmsKey = kmsKey;
    }

    public WorkGroupEncryptionConfiguration withKmsKey(CharSequence kmsKey) {
        this.kmsKey = kmsKey;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("encryptionOption", encryptionOption).append("kmsKey", kmsKey).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kmsKey).append(encryptionOption).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkGroupEncryptionConfiguration) == false) {
            return false;
        }
        WorkGroupEncryptionConfiguration rhs = ((WorkGroupEncryptionConfiguration) other);
        return new EqualsBuilder().append(kmsKey, rhs.kmsKey).append(encryptionOption, rhs.encryptionOption).isEquals();
    }

}
