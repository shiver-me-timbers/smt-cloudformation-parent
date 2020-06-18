
package shiver.me.timbers.aws.appmesh;

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
 * VirtualNodeTlsValidationContextFileTrust
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CertificateChain"
})
public class VirtualNodeTlsValidationContextFileTrust implements Property<VirtualNodeTlsValidationContextFileTrust>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextfiletrust-certificatechain
     * 
     */
    @JsonProperty("CertificateChain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextfiletrust-certificatechain")
    private CharSequence certificateChain;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextfiletrust-certificatechain
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateChain() {
        return certificateChain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextfiletrust-certificatechain
     * 
     */
    @JsonIgnore
    public void setCertificateChain(CharSequence certificateChain) {
        this.certificateChain = certificateChain;
    }

    public VirtualNodeTlsValidationContextFileTrust withCertificateChain(CharSequence certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateChain", certificateChain).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateChain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeTlsValidationContextFileTrust) == false) {
            return false;
        }
        VirtualNodeTlsValidationContextFileTrust rhs = ((VirtualNodeTlsValidationContextFileTrust) other);
        return new EqualsBuilder().append(certificateChain, rhs.certificateChain).isEquals();
    }

}
