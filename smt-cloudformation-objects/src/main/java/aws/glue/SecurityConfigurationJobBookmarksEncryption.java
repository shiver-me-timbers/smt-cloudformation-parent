
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
 * SecurityConfigurationJobBookmarksEncryption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KmsKeyArn",
    "JobBookmarksEncryptionMode"
})
public class SecurityConfigurationJobBookmarksEncryption implements Property<SecurityConfigurationJobBookmarksEncryption>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-kmskeyarn
     * 
     */
    @JsonProperty("KmsKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-kmskeyarn")
    private CharSequence kmsKeyArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-jobbookmarksencryptionmode
     * 
     */
    @JsonProperty("JobBookmarksEncryptionMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-jobbookmarksencryptionmode")
    private CharSequence jobBookmarksEncryptionMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-kmskeyarn
     * 
     */
    @JsonIgnore
    public CharSequence getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-kmskeyarn
     * 
     */
    @JsonIgnore
    public void setKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    public SecurityConfigurationJobBookmarksEncryption withKmsKeyArn(CharSequence kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-jobbookmarksencryptionmode
     * 
     */
    @JsonIgnore
    public CharSequence getJobBookmarksEncryptionMode() {
        return jobBookmarksEncryptionMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html#cfn-glue-securityconfiguration-jobbookmarksencryption-jobbookmarksencryptionmode
     * 
     */
    @JsonIgnore
    public void setJobBookmarksEncryptionMode(CharSequence jobBookmarksEncryptionMode) {
        this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
    }

    public SecurityConfigurationJobBookmarksEncryption withJobBookmarksEncryptionMode(CharSequence jobBookmarksEncryptionMode) {
        this.jobBookmarksEncryptionMode = jobBookmarksEncryptionMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kmsKeyArn", kmsKeyArn).append("jobBookmarksEncryptionMode", jobBookmarksEncryptionMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jobBookmarksEncryptionMode).append(kmsKeyArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityConfigurationJobBookmarksEncryption) == false) {
            return false;
        }
        SecurityConfigurationJobBookmarksEncryption rhs = ((SecurityConfigurationJobBookmarksEncryption) other);
        return new EqualsBuilder().append(jobBookmarksEncryptionMode, rhs.jobBookmarksEncryptionMode).append(kmsKeyArn, rhs.kmsKeyArn).isEquals();
    }

}
