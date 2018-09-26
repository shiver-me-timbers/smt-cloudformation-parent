
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * KMSEncryptionConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AWSKMSKeyARN"
})
public class KMSEncryptionConfig {

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
    public CharSequence getAWSKMSKeyARN() {
        return aWSKMSKeyARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kmsencryptionconfig.html#cfn-kinesisfirehose-deliverystream-kmsencryptionconfig-awskmskeyarn
     * 
     */
    public void setAWSKMSKeyARN(CharSequence aWSKMSKeyARN) {
        this.aWSKMSKeyARN = aWSKMSKeyARN;
    }

    public KMSEncryptionConfig withAWSKMSKeyARN(CharSequence aWSKMSKeyARN) {
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
        if ((other instanceof KMSEncryptionConfig) == false) {
            return false;
        }
        KMSEncryptionConfig rhs = ((KMSEncryptionConfig) other);
        return new EqualsBuilder().append(aWSKMSKeyARN, rhs.aWSKMSKeyARN).isEquals();
    }

}
