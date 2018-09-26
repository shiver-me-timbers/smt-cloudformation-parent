
package aws.certificatemanager;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DomainValidationOption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DomainName",
    "ValidationDomain"
})
public class DomainValidationOption {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoptions-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoptions-domainname")
    private CharSequence domainName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain
     * 
     */
    @JsonProperty("ValidationDomain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain")
    private CharSequence validationDomain;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoptions-domainname
     * 
     */
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoptions-domainname
     * 
     */
    public void setDomainName(CharSequence domainName) {
        this.domainName = domainName;
    }

    public DomainValidationOption withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain
     * 
     */
    public CharSequence getValidationDomain() {
        return validationDomain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain
     * 
     */
    public void setValidationDomain(CharSequence validationDomain) {
        this.validationDomain = validationDomain;
    }

    public DomainValidationOption withValidationDomain(CharSequence validationDomain) {
        this.validationDomain = validationDomain;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domainName", domainName).append("validationDomain", validationDomain).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(validationDomain).append(domainName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainValidationOption) == false) {
            return false;
        }
        DomainValidationOption rhs = ((DomainValidationOption) other);
        return new EqualsBuilder().append(validationDomain, rhs.validationDomain).append(domainName, rhs.domainName).isEquals();
    }

}
