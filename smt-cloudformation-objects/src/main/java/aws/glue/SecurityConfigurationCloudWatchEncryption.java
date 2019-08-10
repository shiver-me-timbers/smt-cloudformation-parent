
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
 * SecurityConfigurationCloudWatchEncryption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KmsKeyArn",
    "CloudWatchEncryptionMode"
})
public class SecurityConfigurationCloudWatchEncryption implements Property<SecurityConfigurationCloudWatchEncryption>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-kmskeyarn
     * 
     */
    @JsonProperty("KmsKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-kmskeyarn")
    private CharSequence kmsKeyArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-cloudwatchencryptionmode
     * 
     */
    @JsonProperty("CloudWatchEncryptionMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-cloudwatchencryptionmode")
    private CharSequence cloudWatchEncryptionMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-kmskeyarn
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-kmskeyarn
     * 
     */
    @JsonIgnore
    public void setKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    public SecurityConfigurationCloudWatchEncryption withKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-cloudwatchencryptionmode
     * 
     */
    @JsonIgnore
    public CharSequence getCloudWatchEncryptionMode() {
        return cloudWatchEncryptionMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html#cfn-glue-securityconfiguration-cloudwatchencryption-cloudwatchencryptionmode
     * 
     */
    @JsonIgnore
    public void setCloudWatchEncryptionMode(CharSequence cloudWatchEncryptionMode) {
        this.cloudWatchEncryptionMode = cloudWatchEncryptionMode;
    }

    public SecurityConfigurationCloudWatchEncryption withCloudWatchEncryptionMode(CharSequence cloudWatchEncryptionMode) {
        this.cloudWatchEncryptionMode = cloudWatchEncryptionMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kmsKeyArn", kmsKeyArn).append("cloudWatchEncryptionMode", cloudWatchEncryptionMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kmsKeyArn).append(cloudWatchEncryptionMode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityConfigurationCloudWatchEncryption) == false) {
            return false;
        }
        SecurityConfigurationCloudWatchEncryption rhs = ((SecurityConfigurationCloudWatchEncryption) other);
        return new EqualsBuilder().append(kmsKeyArn, rhs.kmsKeyArn).append(cloudWatchEncryptionMode, rhs.cloudWatchEncryptionMode).isEquals();
    }

}
