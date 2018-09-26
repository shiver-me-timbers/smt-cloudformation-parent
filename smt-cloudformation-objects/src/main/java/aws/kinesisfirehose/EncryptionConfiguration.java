
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EncryptionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "KMSEncryptionConfig",
    "NoEncryptionConfig"
})
public class EncryptionConfiguration {

    /**
     * KMSEncryptionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
     * 
     */
    @JsonProperty("KMSEncryptionConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html")
    private KMSEncryptionConfig kMSEncryptionConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig
     * 
     */
    @JsonProperty("NoEncryptionConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig")
    private CharSequence noEncryptionConfig;

    /**
     * KMSEncryptionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
     * 
     */
    public KMSEncryptionConfig getKMSEncryptionConfig() {
        return kMSEncryptionConfig;
    }

    /**
     * KMSEncryptionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
     * 
     */
    public void setKMSEncryptionConfig(KMSEncryptionConfig kMSEncryptionConfig) {
        this.kMSEncryptionConfig = kMSEncryptionConfig;
    }

    public EncryptionConfiguration withKMSEncryptionConfig(KMSEncryptionConfig kMSEncryptionConfig) {
        this.kMSEncryptionConfig = kMSEncryptionConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig
     * 
     */
    public CharSequence getNoEncryptionConfig() {
        return noEncryptionConfig;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig
     * 
     */
    public void setNoEncryptionConfig(CharSequence noEncryptionConfig) {
        this.noEncryptionConfig = noEncryptionConfig;
    }

    public EncryptionConfiguration withNoEncryptionConfig(CharSequence noEncryptionConfig) {
        this.noEncryptionConfig = noEncryptionConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kMSEncryptionConfig", kMSEncryptionConfig).append("noEncryptionConfig", noEncryptionConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kMSEncryptionConfig).append(noEncryptionConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EncryptionConfiguration) == false) {
            return false;
        }
        EncryptionConfiguration rhs = ((EncryptionConfiguration) other);
        return new EqualsBuilder().append(kMSEncryptionConfig, rhs.kMSEncryptionConfig).append(noEncryptionConfig, rhs.noEncryptionConfig).isEquals();
    }

}
