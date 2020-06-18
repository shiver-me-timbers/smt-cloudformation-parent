
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
 * Certificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CertificateAuthorityArn",
    "CertificateSigningRequest",
    "SigningAlgorithm",
    "TemplateArn",
    "Validity"
})
public class Certificate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificateauthorityarn
     * 
     */
    @JsonProperty("CertificateAuthorityArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificateauthorityarn")
    private CharSequence certificateAuthorityArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificatesigningrequest
     * 
     */
    @JsonProperty("CertificateSigningRequest")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificatesigningrequest")
    private CharSequence certificateSigningRequest;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-signingalgorithm
     * 
     */
    @JsonProperty("SigningAlgorithm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-signingalgorithm")
    private CharSequence signingAlgorithm;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-templatearn
     * 
     */
    @JsonProperty("TemplateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-templatearn")
    private CharSequence templateArn;
    /**
     * CertificateValidity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html
     * 
     */
    @JsonProperty("Validity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html")
    private Property<CertificateValidity> validity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificateauthorityarn
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateAuthorityArn() {
        return certificateAuthorityArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificateauthorityarn
     * 
     */
    @JsonIgnore
    public void setCertificateAuthorityArn(CharSequence certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    public Certificate withCertificateAuthorityArn(CharSequence certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificatesigningrequest
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateSigningRequest() {
        return certificateSigningRequest;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificatesigningrequest
     * 
     */
    @JsonIgnore
    public void setCertificateSigningRequest(CharSequence certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
    }

    public Certificate withCertificateSigningRequest(CharSequence certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-signingalgorithm
     * 
     */
    @JsonIgnore
    public CharSequence getSigningAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-signingalgorithm
     * 
     */
    @JsonIgnore
    public void setSigningAlgorithm(CharSequence signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public Certificate withSigningAlgorithm(CharSequence signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-templatearn
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateArn() {
        return templateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-templatearn
     * 
     */
    @JsonIgnore
    public void setTemplateArn(CharSequence templateArn) {
        this.templateArn = templateArn;
    }

    public Certificate withTemplateArn(CharSequence templateArn) {
        this.templateArn = templateArn;
        return this;
    }

    /**
     * CertificateValidity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html
     * 
     */
    @JsonIgnore
    public Property<CertificateValidity> getValidity() {
        return validity;
    }

    /**
     * CertificateValidity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html
     * 
     */
    @JsonIgnore
    public void setValidity(Property<CertificateValidity> validity) {
        this.validity = validity;
    }

    public Certificate withValidity(Property<CertificateValidity> validity) {
        this.validity = validity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateAuthorityArn", certificateAuthorityArn).append("certificateSigningRequest", certificateSigningRequest).append("signingAlgorithm", signingAlgorithm).append("templateArn", templateArn).append("validity", validity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateSigningRequest).append(templateArn).append(certificateAuthorityArn).append(validity).append(signingAlgorithm).toHashCode();
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
        return new EqualsBuilder().append(certificateSigningRequest, rhs.certificateSigningRequest).append(templateArn, rhs.templateArn).append(certificateAuthorityArn, rhs.certificateAuthorityArn).append(validity, rhs.validity).append(signingAlgorithm, rhs.signingAlgorithm).isEquals();
    }

}
