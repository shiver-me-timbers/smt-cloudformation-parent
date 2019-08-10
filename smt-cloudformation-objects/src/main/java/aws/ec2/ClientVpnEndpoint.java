
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
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
 * ClientVpnEndpoint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClientCidrBlock",
    "ConnectionLogOptions",
    "SplitTunnel",
    "Description",
    "TagSpecifications",
    "AuthenticationOptions",
    "ServerCertificateArn",
    "DnsServers",
    "TransportProtocol"
})
public class ClientVpnEndpoint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientcidrblock
     * 
     */
    @JsonProperty("ClientCidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientcidrblock")
    private CharSequence clientCidrBlock;
    /**
     * ClientVpnEndpointConnectionLogOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html
     * 
     */
    @JsonProperty("ConnectionLogOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html")
    private Property<ClientVpnEndpointConnectionLogOptions> connectionLogOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel
     * 
     */
    @JsonProperty("SplitTunnel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel")
    private CharSequence splitTunnel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications")
    private List<Property<ClientVpnEndpointTagSpecification>> tagSpecifications = new ArrayList<Property<ClientVpnEndpointTagSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions
     * 
     */
    @JsonProperty("AuthenticationOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions")
    private List<Property<ClientVpnEndpointClientAuthenticationRequest>> authenticationOptions = new ArrayList<Property<ClientVpnEndpointClientAuthenticationRequest>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-servercertificatearn
     * 
     */
    @JsonProperty("ServerCertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-servercertificatearn")
    private CharSequence serverCertificateArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers
     * 
     */
    @JsonProperty("DnsServers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers")
    private List<CharSequence> dnsServers = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-transportprotocol
     * 
     */
    @JsonProperty("TransportProtocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-transportprotocol")
    private CharSequence transportProtocol;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientcidrblock
     * 
     */
    @JsonIgnore
    public CharSequence getClientCidrBlock() {
        return clientCidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientcidrblock
     * 
     */
    @JsonIgnore
    public void setClientCidrBlock(CharSequence clientCidrBlock) {
        this.clientCidrBlock = clientCidrBlock;
    }

    public ClientVpnEndpoint withClientCidrBlock(CharSequence clientCidrBlock) {
        this.clientCidrBlock = clientCidrBlock;
        return this;
    }

    /**
     * ClientVpnEndpointConnectionLogOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html
     * 
     */
    @JsonIgnore
    public Property<ClientVpnEndpointConnectionLogOptions> getConnectionLogOptions() {
        return connectionLogOptions;
    }

    /**
     * ClientVpnEndpointConnectionLogOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html
     * 
     */
    @JsonIgnore
    public void setConnectionLogOptions(Property<ClientVpnEndpointConnectionLogOptions> connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
    }

    public ClientVpnEndpoint withConnectionLogOptions(Property<ClientVpnEndpointConnectionLogOptions> connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel
     * 
     */
    @JsonIgnore
    public CharSequence getSplitTunnel() {
        return splitTunnel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel
     * 
     */
    @JsonIgnore
    public void setSplitTunnel(CharSequence splitTunnel) {
        this.splitTunnel = splitTunnel;
    }

    public ClientVpnEndpoint withSplitTunnel(CharSequence splitTunnel) {
        this.splitTunnel = splitTunnel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ClientVpnEndpoint withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications
     * 
     */
    @JsonIgnore
    public List<Property<ClientVpnEndpointTagSpecification>> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications
     * 
     */
    @JsonIgnore
    public void setTagSpecifications(List<Property<ClientVpnEndpointTagSpecification>> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
    }

    public ClientVpnEndpoint withTagSpecifications(List<Property<ClientVpnEndpointTagSpecification>> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions
     * 
     */
    @JsonIgnore
    public List<Property<ClientVpnEndpointClientAuthenticationRequest>> getAuthenticationOptions() {
        return authenticationOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions
     * 
     */
    @JsonIgnore
    public void setAuthenticationOptions(List<Property<ClientVpnEndpointClientAuthenticationRequest>> authenticationOptions) {
        this.authenticationOptions = authenticationOptions;
    }

    public ClientVpnEndpoint withAuthenticationOptions(List<Property<ClientVpnEndpointClientAuthenticationRequest>> authenticationOptions) {
        this.authenticationOptions = authenticationOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-servercertificatearn
     * 
     */
    @JsonIgnore
    public CharSequence getServerCertificateArn() {
        return serverCertificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-servercertificatearn
     * 
     */
    @JsonIgnore
    public void setServerCertificateArn(CharSequence serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    public ClientVpnEndpoint withServerCertificateArn(CharSequence serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers
     * 
     */
    @JsonIgnore
    public List<CharSequence> getDnsServers() {
        return dnsServers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers
     * 
     */
    @JsonIgnore
    public void setDnsServers(List<CharSequence> dnsServers) {
        this.dnsServers = dnsServers;
    }

    public ClientVpnEndpoint withDnsServers(List<CharSequence> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-transportprotocol
     * 
     */
    @JsonIgnore
    public CharSequence getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-transportprotocol
     * 
     */
    @JsonIgnore
    public void setTransportProtocol(CharSequence transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    public ClientVpnEndpoint withTransportProtocol(CharSequence transportProtocol) {
        this.transportProtocol = transportProtocol;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientCidrBlock", clientCidrBlock).append("connectionLogOptions", connectionLogOptions).append("splitTunnel", splitTunnel).append("description", description).append("tagSpecifications", tagSpecifications).append("authenticationOptions", authenticationOptions).append("serverCertificateArn", serverCertificateArn).append("dnsServers", dnsServers).append("transportProtocol", transportProtocol).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tagSpecifications).append(clientCidrBlock).append(serverCertificateArn).append(splitTunnel).append(authenticationOptions).append(transportProtocol).append(description).append(connectionLogOptions).append(dnsServers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientVpnEndpoint) == false) {
            return false;
        }
        ClientVpnEndpoint rhs = ((ClientVpnEndpoint) other);
        return new EqualsBuilder().append(tagSpecifications, rhs.tagSpecifications).append(clientCidrBlock, rhs.clientCidrBlock).append(serverCertificateArn, rhs.serverCertificateArn).append(splitTunnel, rhs.splitTunnel).append(authenticationOptions, rhs.authenticationOptions).append(transportProtocol, rhs.transportProtocol).append(description, rhs.description).append(connectionLogOptions, rhs.connectionLogOptions).append(dnsServers, rhs.dnsServers).isEquals();
    }

}
