
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
 * VirtualNodeListenerTls
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Mode",
    "Certificate"
})
public class VirtualNodeListenerTls implements Property<VirtualNodeListenerTls>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-mode
     * 
     */
    @JsonProperty("Mode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-mode")
    private CharSequence mode;
    /**
     * VirtualNodeListenerTlsCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html
     * 
     */
    @JsonProperty("Certificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html")
    private Property<VirtualNodeListenerTlsCertificate> certificate;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-mode
     * 
     */
    @JsonIgnore
    public CharSequence getMode() {
        return mode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html#cfn-appmesh-virtualnode-listenertls-mode
     * 
     */
    @JsonIgnore
    public void setMode(CharSequence mode) {
        this.mode = mode;
    }

    public VirtualNodeListenerTls withMode(CharSequence mode) {
        this.mode = mode;
        return this;
    }

    /**
     * VirtualNodeListenerTlsCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeListenerTlsCertificate> getCertificate() {
        return certificate;
    }

    /**
     * VirtualNodeListenerTlsCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html
     * 
     */
    @JsonIgnore
    public void setCertificate(Property<VirtualNodeListenerTlsCertificate> certificate) {
        this.certificate = certificate;
    }

    public VirtualNodeListenerTls withCertificate(Property<VirtualNodeListenerTlsCertificate> certificate) {
        this.certificate = certificate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mode", mode).append("certificate", certificate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mode).append(certificate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeListenerTls) == false) {
            return false;
        }
        VirtualNodeListenerTls rhs = ((VirtualNodeListenerTls) other);
        return new EqualsBuilder().append(mode, rhs.mode).append(certificate, rhs.certificate).isEquals();
    }

}
