
package aws.iot;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CertificateSigningRequest",
    "Status"
})
public class Certificate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest
     * 
     */
    @JsonProperty("CertificateSigningRequest")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest")
    private CharSequence certificateSigningRequest;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status")
    private CharSequence status;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest
     * 
     */
    public CharSequence getCertificateSigningRequest() {
        return certificateSigningRequest;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-certificatesigningrequest
     * 
     */
    public void setCertificateSigningRequest(CharSequence certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
    }

    public Certificate withCertificateSigningRequest(CharSequence certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status
     * 
     */
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificate.html#cfn-iot-certificate-status
     * 
     */
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public Certificate withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateSigningRequest", certificateSigningRequest).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateSigningRequest).append(status).toHashCode();
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
        return new EqualsBuilder().append(certificateSigningRequest, rhs.certificateSigningRequest).append(status, rhs.status).isEquals();
    }

}
