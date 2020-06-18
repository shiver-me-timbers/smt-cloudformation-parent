
package shiver.me.timbers.aws.appmesh;

import java.util.ArrayList;
import java.util.List;
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
 * VirtualNodeTlsValidationContextAcmTrust
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CertificateAuthorityArns"
})
public class VirtualNodeTlsValidationContextAcmTrust implements Property<VirtualNodeTlsValidationContextAcmTrust>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextacmtrust-certificateauthorityarns
     * 
     */
    @JsonProperty("CertificateAuthorityArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextacmtrust-certificateauthorityarns")
    private List<CharSequence> certificateAuthorityArns = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextacmtrust-certificateauthorityarns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCertificateAuthorityArns() {
        return certificateAuthorityArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html#cfn-appmesh-virtualnode-tlsvalidationcontextacmtrust-certificateauthorityarns
     * 
     */
    @JsonIgnore
    public void setCertificateAuthorityArns(List<CharSequence> certificateAuthorityArns) {
        this.certificateAuthorityArns = certificateAuthorityArns;
    }

    public VirtualNodeTlsValidationContextAcmTrust withCertificateAuthorityArns(List<CharSequence> certificateAuthorityArns) {
        this.certificateAuthorityArns = certificateAuthorityArns;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateAuthorityArns", certificateAuthorityArns).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateAuthorityArns).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeTlsValidationContextAcmTrust) == false) {
            return false;
        }
        VirtualNodeTlsValidationContextAcmTrust rhs = ((VirtualNodeTlsValidationContextAcmTrust) other);
        return new EqualsBuilder().append(certificateAuthorityArns, rhs.certificateAuthorityArns).isEquals();
    }

}
