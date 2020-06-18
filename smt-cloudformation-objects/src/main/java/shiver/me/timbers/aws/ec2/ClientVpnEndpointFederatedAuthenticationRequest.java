
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
 * ClientVpnEndpointFederatedAuthenticationRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SAMLProviderArn"
})
public class ClientVpnEndpointFederatedAuthenticationRequest implements Property<ClientVpnEndpointFederatedAuthenticationRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html#cfn-ec2-clientvpnendpoint-federatedauthenticationrequest-samlproviderarn
     * 
     */
    @JsonProperty("SAMLProviderArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html#cfn-ec2-clientvpnendpoint-federatedauthenticationrequest-samlproviderarn")
    private CharSequence sAMLProviderArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html#cfn-ec2-clientvpnendpoint-federatedauthenticationrequest-samlproviderarn
     * 
     */
    @JsonIgnore
    public CharSequence getSAMLProviderArn() {
        return sAMLProviderArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html#cfn-ec2-clientvpnendpoint-federatedauthenticationrequest-samlproviderarn
     * 
     */
    @JsonIgnore
    public void setSAMLProviderArn(CharSequence sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
    }

    public ClientVpnEndpointFederatedAuthenticationRequest withSAMLProviderArn(CharSequence sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sAMLProviderArn", sAMLProviderArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sAMLProviderArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientVpnEndpointFederatedAuthenticationRequest) == false) {
            return false;
        }
        ClientVpnEndpointFederatedAuthenticationRequest rhs = ((ClientVpnEndpointFederatedAuthenticationRequest) other);
        return new EqualsBuilder().append(sAMLProviderArn, rhs.sAMLProviderArn).isEquals();
    }

}
