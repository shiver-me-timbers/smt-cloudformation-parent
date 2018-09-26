
package aws.elasticloadbalancingv2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Certificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CertificateArn"
})
public class Certificate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html#cfn-elasticloadbalancingv2-listener-certificates-certificatearn
     * 
     */
    @JsonProperty("CertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html#cfn-elasticloadbalancingv2-listener-certificates-certificatearn")
    private CharSequence certificateArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html#cfn-elasticloadbalancingv2-listener-certificates-certificatearn
     * 
     */
    public CharSequence getCertificateArn() {
        return certificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificates.html#cfn-elasticloadbalancingv2-listener-certificates-certificatearn
     * 
     */
    public void setCertificateArn(CharSequence certificateArn) {
        this.certificateArn = certificateArn;
    }

    public Certificate withCertificateArn(CharSequence certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateArn", certificateArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateArn).toHashCode();
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
        return new EqualsBuilder().append(certificateArn, rhs.certificateArn).isEquals();
    }

}
