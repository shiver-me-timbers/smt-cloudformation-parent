
package shiver.me.timbers.aws.msk;

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


/**
 * ClusterTls
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CertificateAuthorityArnList"
})
public class ClusterTls implements Property<ClusterTls>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-certificateauthorityarnlist
     * 
     */
    @JsonProperty("CertificateAuthorityArnList")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-certificateauthorityarnlist")
    private List<CharSequence> certificateAuthorityArnList = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-certificateauthorityarnlist
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCertificateAuthorityArnList() {
        return certificateAuthorityArnList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-tls.html#cfn-msk-cluster-tls-certificateauthorityarnlist
     * 
     */
    @JsonIgnore
    public void setCertificateAuthorityArnList(List<CharSequence> certificateAuthorityArnList) {
        this.certificateAuthorityArnList = certificateAuthorityArnList;
    }

    public ClusterTls withCertificateAuthorityArnList(List<CharSequence> certificateAuthorityArnList) {
        this.certificateAuthorityArnList = certificateAuthorityArnList;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificateAuthorityArnList", certificateAuthorityArnList).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificateAuthorityArnList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterTls) == false) {
            return false;
        }
        ClusterTls rhs = ((ClusterTls) other);
        return new EqualsBuilder().append(certificateAuthorityArnList, rhs.certificateAuthorityArnList).isEquals();
    }

}
