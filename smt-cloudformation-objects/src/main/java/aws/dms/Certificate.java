
package aws.dms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Certificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CertificateIdentifier",
    "CertificatePem",
    "CertificateWallet"
})
public class Certificate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier
     * 
     */
    @JsonProperty("CertificateIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier")
    private CharSequence certificateIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem
     * 
     */
    @JsonProperty("CertificatePem")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem")
    private CharSequence certificatePem;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet
     * 
     */
    @JsonProperty("CertificateWallet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet")
    private CharSequence certificateWallet;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier
     * 
     */
    public CharSequence getCertificateIdentifier() {
        return certificateIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier
     * 
     */
    public void setCertificateIdentifier(CharSequence certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    public Certificate withCertificateIdentifier(CharSequence certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem
     * 
     */
    public CharSequence getCertificatePem() {
        return certificatePem;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem
     * 
     */
    public void setCertificatePem(CharSequence certificatePem) {
        this.certificatePem = certificatePem;
    }

    public Certificate withCertificatePem(CharSequence certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet
     * 
     */
    public CharSequence getCertificateWallet() {
        return certificateWallet;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet
     * 
     */
    public void setCertificateWallet(CharSequence certificateWallet) {
        this.certificateWallet = certificateWallet;
    }

    public Certificate withCertificateWallet(CharSequence certificateWallet) {
        this.certificateWallet = certificateWallet;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateIdentifier", certificateIdentifier).append("certificatePem", certificatePem).append("certificateWallet", certificateWallet).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateIdentifier).append(certificatePem).append(certificateWallet).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Certificate) == false) {
            return false;
        }
        Certificate rhs = ((Certificate) other);
        return new EqualsBuilder().append(certificateIdentifier, rhs.certificateIdentifier).append(certificatePem, rhs.certificatePem).append(certificateWallet, rhs.certificateWallet).isEquals();
    }

}
