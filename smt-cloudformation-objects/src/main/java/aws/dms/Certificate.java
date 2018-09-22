
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
    private String certificateIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem
     * 
     */
    @JsonProperty("CertificatePem")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem")
    private String certificatePem;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet
     * 
     */
    @JsonProperty("CertificateWallet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet")
    private String certificateWallet;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier
     * 
     */
    @JsonProperty("CertificateIdentifier")
    public String getCertificateIdentifier() {
        return certificateIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier
     * 
     */
    @JsonProperty("CertificateIdentifier")
    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    public Certificate withCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem
     * 
     */
    @JsonProperty("CertificatePem")
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem
     * 
     */
    @JsonProperty("CertificatePem")
    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    public Certificate withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet
     * 
     */
    @JsonProperty("CertificateWallet")
    public String getCertificateWallet() {
        return certificateWallet;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet
     * 
     */
    @JsonProperty("CertificateWallet")
    public void setCertificateWallet(String certificateWallet) {
        this.certificateWallet = certificateWallet;
    }

    public Certificate withCertificateWallet(String certificateWallet) {
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
