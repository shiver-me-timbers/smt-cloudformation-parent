
package shiver.me.timbers.aws.transfer;

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
import shiver.me.timbers.aws.Tag;


/**
 * Server
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LoggingRole",
    "Protocols",
    "IdentityProviderDetails",
    "EndpointType",
    "EndpointDetails",
    "IdentityProviderType",
    "Tags",
    "Certificate"
})
public class Server {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole
     * 
     */
    @JsonProperty("LoggingRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole")
    private CharSequence loggingRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocols
     * 
     */
    @JsonProperty("Protocols")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocols")
    private List<CharSequence> protocols = new ArrayList<CharSequence>();
    /**
     * ServerIdentityProviderDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html
     * 
     */
    @JsonProperty("IdentityProviderDetails")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html")
    private Property<ServerIdentityProviderDetails> identityProviderDetails;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointtype
     * 
     */
    @JsonProperty("EndpointType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointtype")
    private CharSequence endpointType;
    /**
     * ServerEndpointDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html
     * 
     */
    @JsonProperty("EndpointDetails")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html")
    private Property<ServerEndpointDetails> endpointDetails;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityprovidertype
     * 
     */
    @JsonProperty("IdentityProviderType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityprovidertype")
    private CharSequence identityProviderType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-certificate
     * 
     */
    @JsonProperty("Certificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-certificate")
    private CharSequence certificate;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole
     * 
     */
    @JsonIgnore
    public CharSequence getLoggingRole() {
        return loggingRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-loggingrole
     * 
     */
    @JsonIgnore
    public void setLoggingRole(CharSequence loggingRole) {
        this.loggingRole = loggingRole;
    }

    public Server withLoggingRole(CharSequence loggingRole) {
        this.loggingRole = loggingRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocols
     * 
     */
    @JsonIgnore
    public List<CharSequence> getProtocols() {
        return protocols;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-protocols
     * 
     */
    @JsonIgnore
    public void setProtocols(List<CharSequence> protocols) {
        this.protocols = protocols;
    }

    public Server withProtocols(List<CharSequence> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * ServerIdentityProviderDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html
     * 
     */
    @JsonIgnore
    public Property<ServerIdentityProviderDetails> getIdentityProviderDetails() {
        return identityProviderDetails;
    }

    /**
     * ServerIdentityProviderDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-identityproviderdetails.html
     * 
     */
    @JsonIgnore
    public void setIdentityProviderDetails(Property<ServerIdentityProviderDetails> identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    public Server withIdentityProviderDetails(Property<ServerIdentityProviderDetails> identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointtype
     * 
     */
    @JsonIgnore
    public CharSequence getEndpointType() {
        return endpointType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-endpointtype
     * 
     */
    @JsonIgnore
    public void setEndpointType(CharSequence endpointType) {
        this.endpointType = endpointType;
    }

    public Server withEndpointType(CharSequence endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * ServerEndpointDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html
     * 
     */
    @JsonIgnore
    public Property<ServerEndpointDetails> getEndpointDetails() {
        return endpointDetails;
    }

    /**
     * ServerEndpointDetails
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html
     * 
     */
    @JsonIgnore
    public void setEndpointDetails(Property<ServerEndpointDetails> endpointDetails) {
        this.endpointDetails = endpointDetails;
    }

    public Server withEndpointDetails(Property<ServerEndpointDetails> endpointDetails) {
        this.endpointDetails = endpointDetails;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityprovidertype
     * 
     */
    @JsonIgnore
    public CharSequence getIdentityProviderType() {
        return identityProviderType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-identityprovidertype
     * 
     */
    @JsonIgnore
    public void setIdentityProviderType(CharSequence identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    public Server withIdentityProviderType(CharSequence identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Server withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-certificate
     * 
     */
    @JsonIgnore
    public CharSequence getCertificate() {
        return certificate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-server.html#cfn-transfer-server-certificate
     * 
     */
    @JsonIgnore
    public void setCertificate(CharSequence certificate) {
        this.certificate = certificate;
    }

    public Server withCertificate(CharSequence certificate) {
        this.certificate = certificate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("loggingRole", loggingRole).append("protocols", protocols).append("identityProviderDetails", identityProviderDetails).append("endpointType", endpointType).append("endpointDetails", endpointDetails).append("identityProviderType", identityProviderType).append("tags", tags).append("certificate", certificate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endpointType).append(endpointDetails).append(certificate).append(identityProviderType).append(identityProviderDetails).append(protocols).append(loggingRole).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Server) == false) {
            return false;
        }
        Server rhs = ((Server) other);
        return new EqualsBuilder().append(endpointType, rhs.endpointType).append(endpointDetails, rhs.endpointDetails).append(certificate, rhs.certificate).append(identityProviderType, rhs.identityProviderType).append(identityProviderDetails, rhs.identityProviderDetails).append(protocols, rhs.protocols).append(loggingRole, rhs.loggingRole).append(tags, rhs.tags).isEquals();
    }

}
