
package shiver.me.timbers.aws.acmpca;

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
 * CertificateAuthority
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "KeyAlgorithm",
    "SigningAlgorithm",
    "Subject",
    "RevocationConfiguration",
    "Tags"
})
public class CertificateAuthority {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm
     * 
     */
    @JsonProperty("KeyAlgorithm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm")
    private CharSequence keyAlgorithm;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm
     * 
     */
    @JsonProperty("SigningAlgorithm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm")
    private CharSequence signingAlgorithm;
    /**
     * CertificateAuthoritySubject
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html
     * 
     */
    @JsonProperty("Subject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html")
    private Property<CertificateAuthoritySubject> subject;
    /**
     * CertificateAuthorityRevocationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html
     * 
     */
    @JsonProperty("RevocationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html")
    private Property<CertificateAuthorityRevocationConfiguration> revocationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public CertificateAuthority withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm
     * 
     */
    @JsonIgnore
    public CharSequence getKeyAlgorithm() {
        return keyAlgorithm;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-keyalgorithm
     * 
     */
    @JsonIgnore
    public void setKeyAlgorithm(CharSequence keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public CertificateAuthority withKeyAlgorithm(CharSequence keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm
     * 
     */
    @JsonIgnore
    public CharSequence getSigningAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-signingalgorithm
     * 
     */
    @JsonIgnore
    public void setSigningAlgorithm(CharSequence signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public CertificateAuthority withSigningAlgorithm(CharSequence signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * CertificateAuthoritySubject
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html
     * 
     */
    @JsonIgnore
    public Property<CertificateAuthoritySubject> getSubject() {
        return subject;
    }

    /**
     * CertificateAuthoritySubject
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-subject.html
     * 
     */
    @JsonIgnore
    public void setSubject(Property<CertificateAuthoritySubject> subject) {
        this.subject = subject;
    }

    public CertificateAuthority withSubject(Property<CertificateAuthoritySubject> subject) {
        this.subject = subject;
        return this;
    }

    /**
     * CertificateAuthorityRevocationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<CertificateAuthorityRevocationConfiguration> getRevocationConfiguration() {
        return revocationConfiguration;
    }

    /**
     * CertificateAuthorityRevocationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setRevocationConfiguration(Property<CertificateAuthorityRevocationConfiguration> revocationConfiguration) {
        this.revocationConfiguration = revocationConfiguration;
    }

    public CertificateAuthority withRevocationConfiguration(Property<CertificateAuthorityRevocationConfiguration> revocationConfiguration) {
        this.revocationConfiguration = revocationConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthority.html#cfn-acmpca-certificateauthority-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public CertificateAuthority withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("keyAlgorithm", keyAlgorithm).append("signingAlgorithm", signingAlgorithm).append("subject", subject).append("revocationConfiguration", revocationConfiguration).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyAlgorithm).append(signingAlgorithm).append(subject).append(revocationConfiguration).append(type).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CertificateAuthority) == false) {
            return false;
        }
        CertificateAuthority rhs = ((CertificateAuthority) other);
        return new EqualsBuilder().append(keyAlgorithm, rhs.keyAlgorithm).append(signingAlgorithm, rhs.signingAlgorithm).append(subject, rhs.subject).append(revocationConfiguration, rhs.revocationConfiguration).append(type, rhs.type).append(tags, rhs.tags).isEquals();
    }

}
