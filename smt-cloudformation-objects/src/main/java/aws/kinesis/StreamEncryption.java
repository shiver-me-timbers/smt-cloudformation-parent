
package aws.kinesis;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StreamEncryption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EncryptionType",
    "KeyId"
})
public class StreamEncryption {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-encryptiontype
     * 
     */
    @JsonProperty("EncryptionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-encryptiontype")
    private String encryptionType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-keyid
     * 
     */
    @JsonProperty("KeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-keyid")
    private String keyId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-encryptiontype
     * 
     */
    @JsonProperty("EncryptionType")
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-encryptiontype
     * 
     */
    @JsonProperty("EncryptionType")
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public StreamEncryption withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-keyid
     * 
     */
    @JsonProperty("KeyId")
    public String getKeyId() {
        return keyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html#cfn-kinesis-stream-streamencryption-keyid
     * 
     */
    @JsonProperty("KeyId")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public StreamEncryption withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("encryptionType", encryptionType).append("keyId", keyId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(encryptionType).append(keyId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreamEncryption) == false) {
            return false;
        }
        StreamEncryption rhs = ((StreamEncryption) other);
        return new EqualsBuilder().append(encryptionType, rhs.encryptionType).append(keyId, rhs.keyId).isEquals();
    }

}
