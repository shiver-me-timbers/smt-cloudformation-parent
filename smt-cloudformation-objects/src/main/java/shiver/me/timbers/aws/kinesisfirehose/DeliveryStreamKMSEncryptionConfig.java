
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
 * DeliveryStreamKMSEncryptionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AWSKMSKeyARN"
})
public class DeliveryStreamKMSEncryptionConfig implements Property<DeliveryStreamKMSEncryptionConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn
     * 
     */
    @JsonProperty("AWSKMSKeyARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn")
    private CharSequence aWSKMSKeyARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn
     * 
     */
    @JsonIgnore
    public CharSequence getAWSKMSKeyARN() {
        return aWSKMSKeyARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn
     * 
     */
    @JsonIgnore
    public void setAWSKMSKeyARN(CharSequence aWSKMSKeyARN) {
        this.aWSKMSKeyARN = aWSKMSKeyARN;
    }

    public DeliveryStreamKMSEncryptionConfig withAWSKMSKeyARN(CharSequence aWSKMSKeyARN) {
        this.aWSKMSKeyARN = aWSKMSKeyARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aWSKMSKeyARN", aWSKMSKeyARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aWSKMSKeyARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamKMSEncryptionConfig) == false) {
            return false;
        }
        DeliveryStreamKMSEncryptionConfig rhs = ((DeliveryStreamKMSEncryptionConfig) other);
        return new EqualsBuilder().append(aWSKMSKeyARN, rhs.aWSKMSKeyARN).isEquals();
    }

}
