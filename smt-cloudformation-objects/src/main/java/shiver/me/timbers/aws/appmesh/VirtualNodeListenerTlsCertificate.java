
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
 * VirtualNodeListenerTlsCertificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ACM",
    "File"
})
public class VirtualNodeListenerTlsCertificate implements Property<VirtualNodeListenerTlsCertificate>
{

    /**
     * VirtualNodeListenerTlsAcmCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html
     * 
     */
    @JsonProperty("ACM")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html")
    private Property<VirtualNodeListenerTlsAcmCertificate> aCM;
    /**
     * VirtualNodeListenerTlsFileCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html
     * 
     */
    @JsonProperty("File")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html")
    private Property<VirtualNodeListenerTlsFileCertificate> file;

    /**
     * VirtualNodeListenerTlsAcmCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeListenerTlsAcmCertificate> getACM() {
        return aCM;
    }

    /**
     * VirtualNodeListenerTlsAcmCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html
     * 
     */
    @JsonIgnore
    public void setACM(Property<VirtualNodeListenerTlsAcmCertificate> aCM) {
        this.aCM = aCM;
    }

    public VirtualNodeListenerTlsCertificate withACM(Property<VirtualNodeListenerTlsAcmCertificate> aCM) {
        this.aCM = aCM;
        return this;
    }

    /**
     * VirtualNodeListenerTlsFileCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeListenerTlsFileCertificate> getFile() {
        return file;
    }

    /**
     * VirtualNodeListenerTlsFileCertificate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html
     * 
     */
    @JsonIgnore
    public void setFile(Property<VirtualNodeListenerTlsFileCertificate> file) {
        this.file = file;
    }

    public VirtualNodeListenerTlsCertificate withFile(Property<VirtualNodeListenerTlsFileCertificate> file) {
        this.file = file;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aCM", aCM).append("file", file).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aCM).append(file).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeListenerTlsCertificate) == false) {
            return false;
        }
        VirtualNodeListenerTlsCertificate rhs = ((VirtualNodeListenerTlsCertificate) other);
        return new EqualsBuilder().append(aCM, rhs.aCM).append(file, rhs.file).isEquals();
    }

}
