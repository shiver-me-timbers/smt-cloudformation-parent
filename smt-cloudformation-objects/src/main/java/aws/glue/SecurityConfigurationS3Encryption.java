
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
 * SecurityConfigurationS3Encryption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KmsKeyArn",
    "S3EncryptionMode"
})
public class SecurityConfigurationS3Encryption implements Property<SecurityConfigurationS3Encryption>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-kmskeyarn
     * 
     */
    @JsonProperty("KmsKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-kmskeyarn")
    private CharSequence kmsKeyArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-s3encryptionmode
     * 
     */
    @JsonProperty("S3EncryptionMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-s3encryptionmode")
    private CharSequence s3EncryptionMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-kmskeyarn
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-kmskeyarn
     * 
     */
    @JsonIgnore
    public void setKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    public SecurityConfigurationS3Encryption withKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-s3encryptionmode
     * 
     */
    @JsonIgnore
    public CharSequence getS3EncryptionMode() {
        return s3EncryptionMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryption.html#cfn-glue-securityconfiguration-s3encryption-s3encryptionmode
     * 
     */
    @JsonIgnore
    public void setS3EncryptionMode(CharSequence s3EncryptionMode) {
        this.s3EncryptionMode = s3EncryptionMode;
    }

    public SecurityConfigurationS3Encryption withS3EncryptionMode(CharSequence s3EncryptionMode) {
        this.s3EncryptionMode = s3EncryptionMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kmsKeyArn", kmsKeyArn).append("s3EncryptionMode", s3EncryptionMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kmsKeyArn).append(s3EncryptionMode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityConfigurationS3Encryption) == false) {
            return false;
        }
        SecurityConfigurationS3Encryption rhs = ((SecurityConfigurationS3Encryption) other);
        return new EqualsBuilder().append(kmsKeyArn, rhs.kmsKeyArn).append(s3EncryptionMode, rhs.s3EncryptionMode).isEquals();
    }

}
