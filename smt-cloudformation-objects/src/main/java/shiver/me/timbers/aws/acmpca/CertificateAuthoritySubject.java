
package shiver.me.timbers.aws.acmpca;

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
 * CertificateAuthoritySubject
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Country",
    "Organization",
    "OrganizationalUnit",
    "DistinguishedNameQualifier",
    "State",
    "CommonName",
    "SerialNumber",
    "Locality",
    "Title",
    "Surname",
    "GivenName",
    "Initials",
    "Pseudonym",
    "GenerationQualifier"
})
public class CertificateAuthoritySubject implements Property<CertificateAuthoritySubject>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-country
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-country")
    private CharSequence country;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organization
     * 
     */
    @JsonProperty("Organization")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organization")
    private CharSequence organization;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organizationalunit
     * 
     */
    @JsonProperty("OrganizationalUnit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organizationalunit")
    private CharSequence organizationalUnit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-distinguishednamequalifier
     * 
     */
    @JsonProperty("DistinguishedNameQualifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-distinguishednamequalifier")
    private CharSequence distinguishedNameQualifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-state
     * 
     */
    @JsonProperty("State")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-state")
    private CharSequence state;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-commonname
     * 
     */
    @JsonProperty("CommonName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-commonname")
    private CharSequence commonName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-serialnumber
     * 
     */
    @JsonProperty("SerialNumber")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-serialnumber")
    private CharSequence serialNumber;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-locality
     * 
     */
    @JsonProperty("Locality")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-locality")
    private CharSequence locality;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-title
     * 
     */
    @JsonProperty("Title")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-title")
    private CharSequence title;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-surname
     * 
     */
    @JsonProperty("Surname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-surname")
    private CharSequence surname;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-givenname
     * 
     */
    @JsonProperty("GivenName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-givenname")
    private CharSequence givenName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-initials
     * 
     */
    @JsonProperty("Initials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-initials")
    private CharSequence initials;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-pseudonym
     * 
     */
    @JsonProperty("Pseudonym")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-pseudonym")
    private CharSequence pseudonym;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-generationqualifier
     * 
     */
    @JsonProperty("GenerationQualifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-generationqualifier")
    private CharSequence generationQualifier;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-country
     * 
     */
    @JsonIgnore
    public CharSequence getCountry() {
        return country;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-country
     * 
     */
    @JsonIgnore
    public void setCountry(CharSequence country) {
        this.country = country;
    }

    public CertificateAuthoritySubject withCountry(CharSequence country) {
        this.country = country;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organization
     * 
     */
    @JsonIgnore
    public CharSequence getOrganization() {
        return organization;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organization
     * 
     */
    @JsonIgnore
    public void setOrganization(CharSequence organization) {
        this.organization = organization;
    }

    public CertificateAuthoritySubject withOrganization(CharSequence organization) {
        this.organization = organization;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organizationalunit
     * 
     */
    @JsonIgnore
    public CharSequence getOrganizationalUnit() {
        return organizationalUnit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-organizationalunit
     * 
     */
    @JsonIgnore
    public void setOrganizationalUnit(CharSequence organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    public CertificateAuthoritySubject withOrganizationalUnit(CharSequence organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-distinguishednamequalifier
     * 
     */
    @JsonIgnore
    public CharSequence getDistinguishedNameQualifier() {
        return distinguishedNameQualifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-distinguishednamequalifier
     * 
     */
    @JsonIgnore
    public void setDistinguishedNameQualifier(CharSequence distinguishedNameQualifier) {
        this.distinguishedNameQualifier = distinguishedNameQualifier;
    }

    public CertificateAuthoritySubject withDistinguishedNameQualifier(CharSequence distinguishedNameQualifier) {
        this.distinguishedNameQualifier = distinguishedNameQualifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-state
     * 
     */
    @JsonIgnore
    public CharSequence getState() {
        return state;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-state
     * 
     */
    @JsonIgnore
    public void setState(CharSequence state) {
        this.state = state;
    }

    public CertificateAuthoritySubject withState(CharSequence state) {
        this.state = state;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-commonname
     * 
     */
    @JsonIgnore
    public CharSequence getCommonName() {
        return commonName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-commonname
     * 
     */
    @JsonIgnore
    public void setCommonName(CharSequence commonName) {
        this.commonName = commonName;
    }

    public CertificateAuthoritySubject withCommonName(CharSequence commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-serialnumber
     * 
     */
    @JsonIgnore
    public CharSequence getSerialNumber() {
        return serialNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-serialnumber
     * 
     */
    @JsonIgnore
    public void setSerialNumber(CharSequence serialNumber) {
        this.serialNumber = serialNumber;
    }

    public CertificateAuthoritySubject withSerialNumber(CharSequence serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-locality
     * 
     */
    @JsonIgnore
    public CharSequence getLocality() {
        return locality;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-locality
     * 
     */
    @JsonIgnore
    public void setLocality(CharSequence locality) {
        this.locality = locality;
    }

    public CertificateAuthoritySubject withLocality(CharSequence locality) {
        this.locality = locality;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-title
     * 
     */
    @JsonIgnore
    public CharSequence getTitle() {
        return title;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-title
     * 
     */
    @JsonIgnore
    public void setTitle(CharSequence title) {
        this.title = title;
    }

    public CertificateAuthoritySubject withTitle(CharSequence title) {
        this.title = title;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-surname
     * 
     */
    @JsonIgnore
    public CharSequence getSurname() {
        return surname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-surname
     * 
     */
    @JsonIgnore
    public void setSurname(CharSequence surname) {
        this.surname = surname;
    }

    public CertificateAuthoritySubject withSurname(CharSequence surname) {
        this.surname = surname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-givenname
     * 
     */
    @JsonIgnore
    public CharSequence getGivenName() {
        return givenName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-givenname
     * 
     */
    @JsonIgnore
    public void setGivenName(CharSequence givenName) {
        this.givenName = givenName;
    }

    public CertificateAuthoritySubject withGivenName(CharSequence givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-initials
     * 
     */
    @JsonIgnore
    public CharSequence getInitials() {
        return initials;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-initials
     * 
     */
    @JsonIgnore
    public void setInitials(CharSequence initials) {
        this.initials = initials;
    }

    public CertificateAuthoritySubject withInitials(CharSequence initials) {
        this.initials = initials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-pseudonym
     * 
     */
    @JsonIgnore
    public CharSequence getPseudonym() {
        return pseudonym;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-pseudonym
     * 
     */
    @JsonIgnore
    public void setPseudonym(CharSequence pseudonym) {
        this.pseudonym = pseudonym;
    }

    public CertificateAuthoritySubject withPseudonym(CharSequence pseudonym) {
        this.pseudonym = pseudonym;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-generationqualifier
     * 
     */
    @JsonIgnore
    public CharSequence getGenerationQualifier() {
        return generationQualifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html#cfn-acmpca-certificateauthority-subject-generationqualifier
     * 
     */
    @JsonIgnore
    public void setGenerationQualifier(CharSequence generationQualifier) {
        this.generationQualifier = generationQualifier;
    }

    public CertificateAuthoritySubject withGenerationQualifier(CharSequence generationQualifier) {
        this.generationQualifier = generationQualifier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("country", country).append("organization", organization).append("organizationalUnit", organizationalUnit).append("distinguishedNameQualifier", distinguishedNameQualifier).append("state", state).append("commonName", commonName).append("serialNumber", serialNumber).append("locality", locality).append("title", title).append("surname", surname).append("givenName", givenName).append("initials", initials).append("pseudonym", pseudonym).append("generationQualifier", generationQualifier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(commonName).append(serialNumber).append(initials).append(givenName).append(locality).append(title).append(pseudonym).append(distinguishedNameQualifier).append(surname).append(organization).append(generationQualifier).append(state).append(organizationalUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CertificateAuthoritySubject) == false) {
            return false;
        }
        CertificateAuthoritySubject rhs = ((CertificateAuthoritySubject) other);
        return new EqualsBuilder().append(country, rhs.country).append(commonName, rhs.commonName).append(serialNumber, rhs.serialNumber).append(initials, rhs.initials).append(givenName, rhs.givenName).append(locality, rhs.locality).append(title, rhs.title).append(pseudonym, rhs.pseudonym).append(distinguishedNameQualifier, rhs.distinguishedNameQualifier).append(surname, rhs.surname).append(organization, rhs.organization).append(generationQualifier, rhs.generationQualifier).append(state, rhs.state).append(organizationalUnit, rhs.organizationalUnit).isEquals();
    }

}
