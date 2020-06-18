
package shiver.me.timbers.aws.apigateway;

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
 * DomainName
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CertificateArn",
    "DomainName",
    "EndpointConfiguration",
    "RegionalCertificateArn",
    "SecurityPolicy",
    "Tags"
})
public class DomainName {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn
     * 
     */
    @JsonProperty("CertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn")
    private CharSequence certificateArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname")
    private CharSequence domainName;
    /**
     * DomainNameEndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonProperty("EndpointConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html")
    private Property<DomainNameEndpointConfiguration> endpointConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn
     * 
     */
    @JsonProperty("RegionalCertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn")
    private CharSequence regionalCertificateArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy
     * 
     */
    @JsonProperty("SecurityPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy")
    private CharSequence securityPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateArn() {
        return certificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn
     * 
     */
    @JsonIgnore
    public void setCertificateArn(CharSequence certificateArn) {
        this.certificateArn = certificateArn;
    }

    public DomainName withCertificateArn(CharSequence certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname
     * 
     */
    @JsonIgnore
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname
     * 
     */
    @JsonIgnore
    public void setDomainName(CharSequence domainName) {
        this.domainName = domainName;
    }

    public DomainName withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * DomainNameEndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DomainNameEndpointConfiguration> getEndpointConfiguration() {
        return endpointConfiguration;
    }

    /**
     * DomainNameEndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonIgnore
    public void setEndpointConfiguration(Property<DomainNameEndpointConfiguration> endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    public DomainName withEndpointConfiguration(Property<DomainNameEndpointConfiguration> endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn
     * 
     */
    @JsonIgnore
    public CharSequence getRegionalCertificateArn() {
        return regionalCertificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn
     * 
     */
    @JsonIgnore
    public void setRegionalCertificateArn(CharSequence regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
    }

    public DomainName withRegionalCertificateArn(CharSequence regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy
     * 
     */
    @JsonIgnore
    public CharSequence getSecurityPolicy() {
        return securityPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-securitypolicy
     * 
     */
    @JsonIgnore
    public void setSecurityPolicy(CharSequence securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    public DomainName withSecurityPolicy(CharSequence securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public DomainName withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateArn", certificateArn).append("domainName", domainName).append("endpointConfiguration", endpointConfiguration).append("regionalCertificateArn", regionalCertificateArn).append("securityPolicy", securityPolicy).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateArn).append(regionalCertificateArn).append(domainName).append(endpointConfiguration).append(securityPolicy).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainName) == false) {
            return false;
        }
        DomainName rhs = ((DomainName) other);
        return new EqualsBuilder().append(certificateArn, rhs.certificateArn).append(regionalCertificateArn, rhs.regionalCertificateArn).append(domainName, rhs.domainName).append(endpointConfiguration, rhs.endpointConfiguration).append(securityPolicy, rhs.securityPolicy).append(tags, rhs.tags).isEquals();
    }

}
