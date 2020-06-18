
package shiver.me.timbers.aws.certificatemanager;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Certificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CertificateAuthorityArn",
    "CertificateTransparencyLoggingPreference",
    "DomainName",
    "DomainValidationOptions",
    "SubjectAlternativeNames",
    "Tags",
    "ValidationMethod"
})
public class Certificate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificateauthorityarn
     * 
     */
    @JsonProperty("CertificateAuthorityArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificateauthorityarn")
    private CharSequence certificateAuthorityArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificatetransparencyloggingpreference
     * 
     */
    @JsonProperty("CertificateTransparencyLoggingPreference")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificatetransparencyloggingpreference")
    private CharSequence certificateTransparencyLoggingPreference;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname")
    private CharSequence domainName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions
     * 
     */
    @JsonProperty("DomainValidationOptions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions")
    private Set<Property<CertificateDomainValidationOption>> domainValidationOptions = new LinkedHashSet<Property<CertificateDomainValidationOption>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames
     * 
     */
    @JsonProperty("SubjectAlternativeNames")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames")
    private Set<CharSequence> subjectAlternativeNames = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod
     * 
     */
    @JsonProperty("ValidationMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod")
    private CharSequence validationMethod;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificateauthorityarn
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateAuthorityArn() {
        return certificateAuthorityArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificateauthorityarn
     * 
     */
    @JsonIgnore
    public void setCertificateAuthorityArn(CharSequence certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    public Certificate withCertificateAuthorityArn(CharSequence certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificatetransparencyloggingpreference
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateTransparencyLoggingPreference() {
        return certificateTransparencyLoggingPreference;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificatetransparencyloggingpreference
     * 
     */
    @JsonIgnore
    public void setCertificateTransparencyLoggingPreference(CharSequence certificateTransparencyLoggingPreference) {
        this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
    }

    public Certificate withCertificateTransparencyLoggingPreference(CharSequence certificateTransparencyLoggingPreference) {
        this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname
     * 
     */
    @JsonIgnore
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname
     * 
     */
    @JsonIgnore
    public void setDomainName(CharSequence domainName) {
        this.domainName = domainName;
    }

    public Certificate withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions
     * 
     */
    @JsonIgnore
    public Set<Property<CertificateDomainValidationOption>> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions
     * 
     */
    @JsonIgnore
    public void setDomainValidationOptions(Set<Property<CertificateDomainValidationOption>> domainValidationOptions) {
        this.domainValidationOptions = domainValidationOptions;
    }

    public Certificate withDomainValidationOptions(Set<Property<CertificateDomainValidationOption>> domainValidationOptions) {
        this.domainValidationOptions = domainValidationOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames
     * 
     */
    @JsonIgnore
    public void setSubjectAlternativeNames(Set<CharSequence> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    public Certificate withSubjectAlternativeNames(Set<CharSequence> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Certificate withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod
     * 
     */
    @JsonIgnore
    public CharSequence getValidationMethod() {
        return validationMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod
     * 
     */
    @JsonIgnore
    public void setValidationMethod(CharSequence validationMethod) {
        this.validationMethod = validationMethod;
    }

    public Certificate withValidationMethod(CharSequence validationMethod) {
        this.validationMethod = validationMethod;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateAuthorityArn", certificateAuthorityArn).append("certificateTransparencyLoggingPreference", certificateTransparencyLoggingPreference).append("domainName", domainName).append("domainValidationOptions", domainValidationOptions).append("subjectAlternativeNames", subjectAlternativeNames).append("tags", tags).append("validationMethod", validationMethod).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateAuthorityArn).append(validationMethod).append(certificateTransparencyLoggingPreference).append(subjectAlternativeNames).append(domainName).append(domainValidationOptions).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Certificate) == false) {
            return false;
        }
        Certificate rhs = ((Certificate) other);
        return new EqualsBuilder().append(certificateAuthorityArn, rhs.certificateAuthorityArn).append(validationMethod, rhs.validationMethod).append(certificateTransparencyLoggingPreference, rhs.certificateTransparencyLoggingPreference).append(subjectAlternativeNames, rhs.subjectAlternativeNames).append(domainName, rhs.domainName).append(domainValidationOptions, rhs.domainValidationOptions).append(tags, rhs.tags).isEquals();
    }

}
