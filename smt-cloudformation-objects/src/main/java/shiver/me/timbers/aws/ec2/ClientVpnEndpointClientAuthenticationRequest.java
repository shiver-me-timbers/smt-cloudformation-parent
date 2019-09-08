
package shiver.me.timbers.aws.ec2;

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
 * ClientVpnEndpointClientAuthenticationRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MutualAuthentication",
    "Type",
    "ActiveDirectory"
})
public class ClientVpnEndpointClientAuthenticationRequest implements Property<ClientVpnEndpointClientAuthenticationRequest>
{

    /**
     * ClientVpnEndpointCertificateAuthenticationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html
     * 
     */
    @JsonProperty("MutualAuthentication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html")
    private Property<ClientVpnEndpointCertificateAuthenticationRequest> mutualAuthentication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-type")
    private CharSequence type;
    /**
     * ClientVpnEndpointDirectoryServiceAuthenticationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html
     * 
     */
    @JsonProperty("ActiveDirectory")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html")
    private Property<ClientVpnEndpointDirectoryServiceAuthenticationRequest> activeDirectory;

    /**
     * ClientVpnEndpointCertificateAuthenticationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html
     * 
     */
    @JsonIgnore
    public Property<ClientVpnEndpointCertificateAuthenticationRequest> getMutualAuthentication() {
        return mutualAuthentication;
    }

    /**
     * ClientVpnEndpointCertificateAuthenticationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html
     * 
     */
    @JsonIgnore
    public void setMutualAuthentication(Property<ClientVpnEndpointCertificateAuthenticationRequest> mutualAuthentication) {
        this.mutualAuthentication = mutualAuthentication;
    }

    public ClientVpnEndpointClientAuthenticationRequest withMutualAuthentication(Property<ClientVpnEndpointCertificateAuthenticationRequest> mutualAuthentication) {
        this.mutualAuthentication = mutualAuthentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ClientVpnEndpointClientAuthenticationRequest withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * ClientVpnEndpointDirectoryServiceAuthenticationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html
     * 
     */
    @JsonIgnore
    public Property<ClientVpnEndpointDirectoryServiceAuthenticationRequest> getActiveDirectory() {
        return activeDirectory;
    }

    /**
     * ClientVpnEndpointDirectoryServiceAuthenticationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html
     * 
     */
    @JsonIgnore
    public void setActiveDirectory(Property<ClientVpnEndpointDirectoryServiceAuthenticationRequest> activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    public ClientVpnEndpointClientAuthenticationRequest withActiveDirectory(Property<ClientVpnEndpointDirectoryServiceAuthenticationRequest> activeDirectory) {
        this.activeDirectory = activeDirectory;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mutualAuthentication", mutualAuthentication).append("type", type).append("activeDirectory", activeDirectory).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mutualAuthentication).append(type).append(activeDirectory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientVpnEndpointClientAuthenticationRequest) == false) {
            return false;
        }
        ClientVpnEndpointClientAuthenticationRequest rhs = ((ClientVpnEndpointClientAuthenticationRequest) other);
        return new EqualsBuilder().append(mutualAuthentication, rhs.mutualAuthentication).append(type, rhs.type).append(activeDirectory, rhs.activeDirectory).isEquals();
    }

}
