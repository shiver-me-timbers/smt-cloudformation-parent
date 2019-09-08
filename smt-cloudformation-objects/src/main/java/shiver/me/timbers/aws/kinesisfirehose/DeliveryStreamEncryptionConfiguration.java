
package shiver.me.timbers.aws.kinesisfirehose;

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
 * DeliveryStreamEncryptionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KMSEncryptionConfig",
    "NoEncryptionConfig"
})
public class DeliveryStreamEncryptionConfiguration implements Property<DeliveryStreamEncryptionConfiguration>
{

    /**
     * DeliveryStreamKMSEncryptionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
     * 
     */
    @JsonProperty("KMSEncryptionConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html")
    private Property<DeliveryStreamKMSEncryptionConfig> kMSEncryptionConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig
     * 
     */
    @JsonProperty("NoEncryptionConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig")
    private CharSequence noEncryptionConfig;

    /**
     * DeliveryStreamKMSEncryptionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamKMSEncryptionConfig> getKMSEncryptionConfig() {
        return kMSEncryptionConfig;
    }

    /**
     * DeliveryStreamKMSEncryptionConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
     * 
     */
    @JsonIgnore
    public void setKMSEncryptionConfig(Property<DeliveryStreamKMSEncryptionConfig> kMSEncryptionConfig) {
        this.kMSEncryptionConfig = kMSEncryptionConfig;
    }

    public DeliveryStreamEncryptionConfiguration withKMSEncryptionConfig(Property<DeliveryStreamKMSEncryptionConfig> kMSEncryptionConfig) {
        this.kMSEncryptionConfig = kMSEncryptionConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig
     * 
     */
    @JsonIgnore
    public CharSequence getNoEncryptionConfig() {
        return noEncryptionConfig;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html#cfn-kinesisfirehose-deliverystream-encryptionconfiguration-noencryptionconfig
     * 
     */
    @JsonIgnore
    public void setNoEncryptionConfig(CharSequence noEncryptionConfig) {
        this.noEncryptionConfig = noEncryptionConfig;
    }

    public DeliveryStreamEncryptionConfiguration withNoEncryptionConfig(CharSequence noEncryptionConfig) {
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
        if ((other instanceof DeliveryStreamEncryptionConfiguration) == false) {
            return false;
        }
        DeliveryStreamEncryptionConfiguration rhs = ((DeliveryStreamEncryptionConfiguration) other);
        return new EqualsBuilder().append(kMSEncryptionConfig, rhs.kMSEncryptionConfig).append(noEncryptionConfig, rhs.noEncryptionConfig).isEquals();
    }

}
