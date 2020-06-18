
package shiver.me.timbers.aws.gamelift;

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
 * FleetCertificateConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CertificateType"
})
public class FleetCertificateConfiguration implements Property<FleetCertificateConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html#cfn-gamelift-fleet-certificateconfiguration-certificatetype
     * 
     */
    @JsonProperty("CertificateType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html#cfn-gamelift-fleet-certificateconfiguration-certificatetype")
    private CharSequence certificateType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html#cfn-gamelift-fleet-certificateconfiguration-certificatetype
     * 
     */
    @JsonIgnore
    public CharSequence getCertificateType() {
        return certificateType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html#cfn-gamelift-fleet-certificateconfiguration-certificatetype
     * 
     */
    @JsonIgnore
    public void setCertificateType(CharSequence certificateType) {
        this.certificateType = certificateType;
    }

    public FleetCertificateConfiguration withCertificateType(CharSequence certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateType", certificateType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FleetCertificateConfiguration) == false) {
            return false;
        }
        FleetCertificateConfiguration rhs = ((FleetCertificateConfiguration) other);
        return new EqualsBuilder().append(certificateType, rhs.certificateType).isEquals();
    }

}
