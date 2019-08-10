
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
 * ClientVpnEndpointDirectoryServiceAuthenticationRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DirectoryId"
})
public class ClientVpnEndpointDirectoryServiceAuthenticationRequest implements Property<ClientVpnEndpointDirectoryServiceAuthenticationRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html#cfn-ec2-clientvpnendpoint-directoryserviceauthenticationrequest-directoryid
     * 
     */
    @JsonProperty("DirectoryId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html#cfn-ec2-clientvpnendpoint-directoryserviceauthenticationrequest-directoryid")
    private CharSequence directoryId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html#cfn-ec2-clientvpnendpoint-directoryserviceauthenticationrequest-directoryid
     * 
     */
    @JsonIgnore
    public CharSequence getDirectoryId() {
        return directoryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html#cfn-ec2-clientvpnendpoint-directoryserviceauthenticationrequest-directoryid
     * 
     */
    @JsonIgnore
    public void setDirectoryId(CharSequence directoryId) {
        this.directoryId = directoryId;
    }

    public ClientVpnEndpointDirectoryServiceAuthenticationRequest withDirectoryId(CharSequence directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("directoryId", directoryId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(directoryId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientVpnEndpointDirectoryServiceAuthenticationRequest) == false) {
            return false;
        }
        ClientVpnEndpointDirectoryServiceAuthenticationRequest rhs = ((ClientVpnEndpointDirectoryServiceAuthenticationRequest) other);
        return new EqualsBuilder().append(directoryId, rhs.directoryId).isEquals();
    }

}
