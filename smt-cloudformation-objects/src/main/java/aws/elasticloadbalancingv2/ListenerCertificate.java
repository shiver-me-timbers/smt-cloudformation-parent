
package aws.elasticloadbalancingv2;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ListenerCertificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Certificates",
    "ListenerArn"
})
public class ListenerCertificate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates
     * 
     */
    @JsonProperty("Certificates")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates")
    private Set<Property<Certificate>> certificates = new LinkedHashSet<Property<Certificate>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn
     * 
     */
    @JsonProperty("ListenerArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn")
    private CharSequence listenerArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates
     * 
     */
    @JsonIgnore
    public Set<Property<Certificate>> getCertificates() {
        return certificates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-certificates
     * 
     */
    @JsonIgnore
    public void setCertificates(Set<Property<Certificate>> certificates) {
        this.certificates = certificates;
    }

    public ListenerCertificate withCertificates(Set<Property<Certificate>> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn
     * 
     */
    @JsonIgnore
    public CharSequence getListenerArn() {
        return listenerArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenercertificate.html#cfn-elasticloadbalancingv2-listenercertificate-listenerarn
     * 
     */
    @JsonIgnore
    public void setListenerArn(CharSequence listenerArn) {
        this.listenerArn = listenerArn;
    }

    public ListenerCertificate withListenerArn(CharSequence listenerArn) {
        this.listenerArn = listenerArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificates", certificates).append("listenerArn", listenerArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(certificates).append(listenerArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerCertificate) == false) {
            return false;
        }
        ListenerCertificate rhs = ((ListenerCertificate) other);
        return new EqualsBuilder().append(certificates, rhs.certificates).append(listenerArn, rhs.listenerArn).isEquals();
    }

}
