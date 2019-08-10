
package aws.ec2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ClientVpnEndpointCertificateAuthenticationRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClientRootCertificateChainArn"
})
public class ClientVpnEndpointCertificateAuthenticationRequest implements Property<ClientVpnEndpointCertificateAuthenticationRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html#cfn-ec2-clientvpnendpoint-certificateauthenticationrequest-clientrootcertificatechainarn
     * 
     */
    @JsonProperty("ClientRootCertificateChainArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html#cfn-ec2-clientvpnendpoint-certificateauthenticationrequest-clientrootcertificatechainarn")
    private CharSequence clientRootCertificateChainArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html#cfn-ec2-clientvpnendpoint-certificateauthenticationrequest-clientrootcertificatechainarn
     * 
     */
    @JsonIgnore
    public CharSequence getClientRootCertificateChainArn() {
        return clientRootCertificateChainArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html#cfn-ec2-clientvpnendpoint-certificateauthenticationrequest-clientrootcertificatechainarn
     * 
     */
    @JsonIgnore
    public void setClientRootCertificateChainArn(CharSequence clientRootCertificateChainArn) {
        this.clientRootCertificateChainArn = clientRootCertificateChainArn;
    }

    public ClientVpnEndpointCertificateAuthenticationRequest withClientRootCertificateChainArn(CharSequence clientRootCertificateChainArn) {
        this.clientRootCertificateChainArn = clientRootCertificateChainArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientRootCertificateChainArn", clientRootCertificateChainArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientRootCertificateChainArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientVpnEndpointCertificateAuthenticationRequest) == false) {
            return false;
        }
        ClientVpnEndpointCertificateAuthenticationRequest rhs = ((ClientVpnEndpointCertificateAuthenticationRequest) other);
        return new EqualsBuilder().append(clientRootCertificateChainArn, rhs.clientRootCertificateChainArn).isEquals();
    }

}
