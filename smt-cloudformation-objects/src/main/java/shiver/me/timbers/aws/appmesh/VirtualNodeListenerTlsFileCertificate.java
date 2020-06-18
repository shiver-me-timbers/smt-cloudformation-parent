
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
 * VirtualNodeListenerTlsFileCertificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PrivateKey",
    "CertificateChain"
})
public class VirtualNodeListenerTlsFileCertificate implements Property<VirtualNodeListenerTlsFileCertificate>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-privatekey
     * 
     */
    @JsonProperty("PrivateKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-privatekey")
    private CharSequence privateKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-certificatechain
     * 
     */
    @JsonProperty("CertificateChain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-certificatechain")
    private CharSequence certificateChain;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-privatekey
     * 
     */
    @JsonIgnore
    public CharSequence getPrivateKey() {
        return privateKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-privatekey
     * 
     */
    @JsonIgnore
    public void setPrivateKey(CharSequence privateKey) {
        this.privateKey = privateKey;
    }

    public VirtualNodeListenerTlsFileCertificate withPrivateKey(CharSequence privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-certificatechain
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateChain() {
        return certificateChain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html#cfn-appmesh-virtualnode-listenertlsfilecertificate-certificatechain
     * 
     */
    @JsonIgnore
    public void setCertificateChain(CharSequence certificateChain) {
        this.certificateChain = certificateChain;
    }

    public VirtualNodeListenerTlsFileCertificate withCertificateChain(CharSequence certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("privateKey", privateKey).append("certificateChain", certificateChain).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateChain).append(privateKey).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeListenerTlsFileCertificate) == false) {
            return false;
        }
        VirtualNodeListenerTlsFileCertificate rhs = ((VirtualNodeListenerTlsFileCertificate) other);
        return new EqualsBuilder().append(certificateChain, rhs.certificateChain).append(privateKey, rhs.privateKey).isEquals();
    }

}
