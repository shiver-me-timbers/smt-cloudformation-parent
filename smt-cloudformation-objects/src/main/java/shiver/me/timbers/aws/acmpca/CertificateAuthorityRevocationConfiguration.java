
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
 * CertificateAuthorityRevocationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-revocationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CrlConfiguration"
})
public class CertificateAuthorityRevocationConfiguration implements Property<CertificateAuthorityRevocationConfiguration>
{

    /**
     * CertificateAuthorityCrlConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html
     * 
     */
    @JsonProperty("CrlConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html")
    private Property<CertificateAuthorityCrlConfiguration> crlConfiguration;

    /**
     * CertificateAuthorityCrlConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<CertificateAuthorityCrlConfiguration> getCrlConfiguration() {
        return crlConfiguration;
    }

    /**
     * CertificateAuthorityCrlConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificateauthority-crlconfiguration.html
     * 
     */
    @JsonIgnore
    public void setCrlConfiguration(Property<CertificateAuthorityCrlConfiguration> crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
    }

    public CertificateAuthorityRevocationConfiguration withCrlConfiguration(Property<CertificateAuthorityCrlConfiguration> crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("crlConfiguration", crlConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(crlConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CertificateAuthorityRevocationConfiguration) == false) {
            return false;
        }
        CertificateAuthorityRevocationConfiguration rhs = ((CertificateAuthorityRevocationConfiguration) other);
        return new EqualsBuilder().append(crlConfiguration, rhs.crlConfiguration).isEquals();
    }

}
