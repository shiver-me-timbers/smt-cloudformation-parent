
package aws.elasticsearch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EncryptionAtRestOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enabled",
    "KmsKeyId"
})
public class EncryptionAtRestOptions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid")
    private CharSequence kmsKeyId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public EncryptionAtRestOptions withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid
     * 
     */
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html#cfn-elasticsearch-domain-encryptionatrestoptions-kmskeyid
     * 
     */
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public EncryptionAtRestOptions withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("kmsKeyId", kmsKeyId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enabled).append(kmsKeyId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EncryptionAtRestOptions) == false) {
            return false;
        }
        EncryptionAtRestOptions rhs = ((EncryptionAtRestOptions) other);
        return new EqualsBuilder().append(enabled, rhs.enabled).append(kmsKeyId, rhs.kmsKeyId).isEquals();
    }

}
