
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DomainName
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CertificateArn",
    "DomainName",
    "EndpointConfiguration",
    "RegionalCertificateArn"
})
public class DomainName {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn
     * 
     */
    @JsonProperty("CertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn")
    private String certificateArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname")
    private String domainName;
    /**
     * EndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonProperty("EndpointConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html")
    private EndpointConfiguration endpointConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn
     * 
     */
    @JsonProperty("RegionalCertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn")
    private String regionalCertificateArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn
     * 
     */
    @JsonProperty("CertificateArn")
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-certificatearn
     * 
     */
    @JsonProperty("CertificateArn")
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    public DomainName withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname
     * 
     */
    @JsonProperty("DomainName")
    public String getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-domainname
     * 
     */
    @JsonProperty("DomainName")
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DomainName withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * EndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonProperty("EndpointConfiguration")
    public EndpointConfiguration getEndpointConfiguration() {
        return endpointConfiguration;
    }

    /**
     * EndpointConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
     * 
     */
    @JsonProperty("EndpointConfiguration")
    public void setEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    public DomainName withEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn
     * 
     */
    @JsonProperty("RegionalCertificateArn")
    public String getRegionalCertificateArn() {
        return regionalCertificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html#cfn-apigateway-domainname-regionalcertificatearn
     * 
     */
    @JsonProperty("RegionalCertificateArn")
    public void setRegionalCertificateArn(String regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
    }

    public DomainName withRegionalCertificateArn(String regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateArn", certificateArn).append("domainName", domainName).append("endpointConfiguration", endpointConfiguration).append("regionalCertificateArn", regionalCertificateArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endpointConfiguration).append(certificateArn).append(regionalCertificateArn).append(domainName).toHashCode();
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
        return new EqualsBuilder().append(endpointConfiguration, rhs.endpointConfiguration).append(certificateArn, rhs.certificateArn).append(regionalCertificateArn, rhs.regionalCertificateArn).append(domainName, rhs.domainName).isEquals();
    }

}
