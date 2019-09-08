
package shiver.me.timbers.aws.glue;

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
 * SecurityConfigurationEncryptionConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-encryptionconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3Encryptions",
    "CloudWatchEncryption",
    "JobBookmarksEncryption"
})
public class SecurityConfigurationEncryptionConfiguration implements Property<SecurityConfigurationEncryptionConfiguration>
{

    /**
     * SecurityConfigurationS3Encryptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryptions.html
     * 
     */
    @JsonProperty("S3Encryptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryptions.html")
    private Property<SecurityConfigurationS3Encryptions> s3Encryptions;
    /**
     * SecurityConfigurationCloudWatchEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html
     * 
     */
    @JsonProperty("CloudWatchEncryption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html")
    private Property<SecurityConfigurationCloudWatchEncryption> cloudWatchEncryption;
    /**
     * SecurityConfigurationJobBookmarksEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html
     * 
     */
    @JsonProperty("JobBookmarksEncryption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html")
    private Property<SecurityConfigurationJobBookmarksEncryption> jobBookmarksEncryption;

    /**
     * SecurityConfigurationS3Encryptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryptions.html
     * 
     */
    @JsonIgnore
    public Property<SecurityConfigurationS3Encryptions> getS3Encryptions() {
        return s3Encryptions;
    }

    /**
     * SecurityConfigurationS3Encryptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-s3encryptions.html
     * 
     */
    @JsonIgnore
    public void setS3Encryptions(Property<SecurityConfigurationS3Encryptions> s3Encryptions) {
        this.s3Encryptions = s3Encryptions;
    }

    public SecurityConfigurationEncryptionConfiguration withS3Encryptions(Property<SecurityConfigurationS3Encryptions> s3Encryptions) {
        this.s3Encryptions = s3Encryptions;
        return this;
    }

    /**
     * SecurityConfigurationCloudWatchEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html
     * 
     */
    @JsonIgnore
    public Property<SecurityConfigurationCloudWatchEncryption> getCloudWatchEncryption() {
        return cloudWatchEncryption;
    }

    /**
     * SecurityConfigurationCloudWatchEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchEncryption(Property<SecurityConfigurationCloudWatchEncryption> cloudWatchEncryption) {
        this.cloudWatchEncryption = cloudWatchEncryption;
    }

    public SecurityConfigurationEncryptionConfiguration withCloudWatchEncryption(Property<SecurityConfigurationCloudWatchEncryption> cloudWatchEncryption) {
        this.cloudWatchEncryption = cloudWatchEncryption;
        return this;
    }

    /**
     * SecurityConfigurationJobBookmarksEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html
     * 
     */
    @JsonIgnore
    public Property<SecurityConfigurationJobBookmarksEncryption> getJobBookmarksEncryption() {
        return jobBookmarksEncryption;
    }

    /**
     * SecurityConfigurationJobBookmarksEncryption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-jobbookmarksencryption.html
     * 
     */
    @JsonIgnore
    public void setJobBookmarksEncryption(Property<SecurityConfigurationJobBookmarksEncryption> jobBookmarksEncryption) {
        this.jobBookmarksEncryption = jobBookmarksEncryption;
    }

    public SecurityConfigurationEncryptionConfiguration withJobBookmarksEncryption(Property<SecurityConfigurationJobBookmarksEncryption> jobBookmarksEncryption) {
        this.jobBookmarksEncryption = jobBookmarksEncryption;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Encryptions", s3Encryptions).append("cloudWatchEncryption", cloudWatchEncryption).append("jobBookmarksEncryption", jobBookmarksEncryption).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Encryptions).append(jobBookmarksEncryption).append(cloudWatchEncryption).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityConfigurationEncryptionConfiguration) == false) {
            return false;
        }
        SecurityConfigurationEncryptionConfiguration rhs = ((SecurityConfigurationEncryptionConfiguration) other);
        return new EqualsBuilder().append(s3Encryptions, rhs.s3Encryptions).append(jobBookmarksEncryption, rhs.jobBookmarksEncryption).append(cloudWatchEncryption, rhs.cloudWatchEncryption).isEquals();
    }

}
