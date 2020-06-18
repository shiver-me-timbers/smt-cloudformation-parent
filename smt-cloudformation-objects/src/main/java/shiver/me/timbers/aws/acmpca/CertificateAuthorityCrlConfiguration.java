
package shiver.me.timbers.aws.acmpca;

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
 * CertificateAuthorityCrlConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Enabled",
    "ExpirationInDays",
    "CustomCname",
    "S3BucketName"
})
public class CertificateAuthorityCrlConfiguration implements Property<CertificateAuthorityCrlConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-enabled")
    private CharSequence enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-expirationindays
     * 
     */
    @JsonProperty("ExpirationInDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-expirationindays")
    private Number expirationInDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-customcname
     * 
     */
    @JsonProperty("CustomCname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-customcname")
    private CharSequence customCname;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-s3bucketname")
    private CharSequence s3BucketName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(CharSequence enabled) {
        this.enabled = enabled;
    }

    public CertificateAuthorityCrlConfiguration withEnabled(CharSequence enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-expirationindays
     * 
     */
    @JsonIgnore
    public Number getExpirationInDays() {
        return expirationInDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-expirationindays
     * 
     */
    @JsonIgnore
    public void setExpirationInDays(Number expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    public CertificateAuthorityCrlConfiguration withExpirationInDays(Number expirationInDays) {
        this.expirationInDays = expirationInDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-customcname
     * 
     */
    @JsonIgnore
    public CharSequence getCustomCname() {
        return customCname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-customcname
     * 
     */
    @JsonIgnore
    public void setCustomCname(CharSequence customCname) {
        this.customCname = customCname;
    }

    public CertificateAuthorityCrlConfiguration withCustomCname(CharSequence customCname) {
        this.customCname = customCname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-s3bucketname
     * 
     */
    @JsonIgnore
    public CharSequence getS3BucketName() {
        return s3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html#cfn-acmpca-certificateauthority-crlconfiguration-s3bucketname
     * 
     */
    @JsonIgnore
    public void setS3BucketName(CharSequence s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    public CertificateAuthorityCrlConfiguration withS3BucketName(CharSequence s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("expirationInDays", expirationInDays).append("customCname", customCname).append("s3BucketName", s3BucketName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customCname).append(expirationInDays).append(enabled).append(s3BucketName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CertificateAuthorityCrlConfiguration) == false) {
            return false;
        }
        CertificateAuthorityCrlConfiguration rhs = ((CertificateAuthorityCrlConfiguration) other);
        return new EqualsBuilder().append(customCname, rhs.customCname).append(expirationInDays, rhs.expirationInDays).append(enabled, rhs.enabled).append(s3BucketName, rhs.s3BucketName).isEquals();
    }

}
