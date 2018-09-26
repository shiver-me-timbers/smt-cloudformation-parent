
package aws.certificatemanager;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Certificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DomainName",
    "DomainValidationOptions",
    "SubjectAlternativeNames",
    "Tags",
    "ValidationMethod"
})
public class Certificate {

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
    private Set<DomainValidationOption> domainValidationOptions = new LinkedHashSet<DomainValidationOption>();
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
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod
     * 
     */
    @JsonProperty("ValidationMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod")
    private CharSequence validationMethod;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname
     * 
     */
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname
     * 
     */
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
    public Set<DomainValidationOption> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions
     * 
     */
    public void setDomainValidationOptions(Set<DomainValidationOption> domainValidationOptions) {
        this.domainValidationOptions = domainValidationOptions;
    }

    public Certificate withDomainValidationOptions(Set<DomainValidationOption> domainValidationOptions) {
        this.domainValidationOptions = domainValidationOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames
     * 
     */
    public Set<CharSequence> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames
     * 
     */
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
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Certificate withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod
     * 
     */
    public CharSequence getValidationMethod() {
        return validationMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod
     * 
     */
    public void setValidationMethod(CharSequence validationMethod) {
        this.validationMethod = validationMethod;
    }

    public Certificate withValidationMethod(CharSequence validationMethod) {
        this.validationMethod = validationMethod;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domainName", domainName).append("domainValidationOptions", domainValidationOptions).append("subjectAlternativeNames", subjectAlternativeNames).append("tags", tags).append("validationMethod", validationMethod).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(domainValidationOptions).append(validationMethod).append(subjectAlternativeNames).append(domainName).append(tags).toHashCode();
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
        return new EqualsBuilder().append(domainValidationOptions, rhs.domainValidationOptions).append(validationMethod, rhs.validationMethod).append(subjectAlternativeNames, rhs.subjectAlternativeNames).append(domainName, rhs.domainName).append(tags, rhs.tags).isEquals();
    }

}
