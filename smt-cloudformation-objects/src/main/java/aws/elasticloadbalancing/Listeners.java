
package aws.elasticloadbalancing;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Listeners
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InstancePort",
    "InstanceProtocol",
    "LoadBalancerPort",
    "PolicyNames",
    "Protocol",
    "SSLCertificateId"
})
public class Listeners {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceport
     * 
     */
    @JsonProperty("InstancePort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceport")
    private CharSequence instancePort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceprotocol
     * 
     */
    @JsonProperty("InstanceProtocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceprotocol")
    private CharSequence instanceProtocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-loadbalancerport
     * 
     */
    @JsonProperty("LoadBalancerPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-loadbalancerport")
    private CharSequence loadBalancerPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames
     * 
     */
    @JsonProperty("PolicyNames")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames")
    private Set<CharSequence> policyNames = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-protocol")
    private CharSequence protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-sslcertificateid
     * 
     */
    @JsonProperty("SSLCertificateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-sslcertificateid")
    private CharSequence sSLCertificateId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceport
     * 
     */
    public CharSequence getInstancePort() {
        return instancePort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceport
     * 
     */
    public void setInstancePort(CharSequence instancePort) {
        this.instancePort = instancePort;
    }

    public Listeners withInstancePort(CharSequence instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceprotocol
     * 
     */
    public CharSequence getInstanceProtocol() {
        return instanceProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-instanceprotocol
     * 
     */
    public void setInstanceProtocol(CharSequence instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
    }

    public Listeners withInstanceProtocol(CharSequence instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-loadbalancerport
     * 
     */
    public CharSequence getLoadBalancerPort() {
        return loadBalancerPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-loadbalancerport
     * 
     */
    public void setLoadBalancerPort(CharSequence loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    public Listeners withLoadBalancerPort(CharSequence loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames
     * 
     */
    public Set<CharSequence> getPolicyNames() {
        return policyNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames
     * 
     */
    public void setPolicyNames(Set<CharSequence> policyNames) {
        this.policyNames = policyNames;
    }

    public Listeners withPolicyNames(Set<CharSequence> policyNames) {
        this.policyNames = policyNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-protocol
     * 
     */
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-protocol
     * 
     */
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public Listeners withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-sslcertificateid
     * 
     */
    public CharSequence getSSLCertificateId() {
        return sSLCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-sslcertificateid
     * 
     */
    public void setSSLCertificateId(CharSequence sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
    }

    public Listeners withSSLCertificateId(CharSequence sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("instancePort", instancePort).append("instanceProtocol", instanceProtocol).append("loadBalancerPort", loadBalancerPort).append("policyNames", policyNames).append("protocol", protocol).append("sSLCertificateId", sSLCertificateId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instancePort).append(sSLCertificateId).append(instanceProtocol).append(protocol).append(policyNames).append(loadBalancerPort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Listeners) == false) {
            return false;
        }
        Listeners rhs = ((Listeners) other);
        return new EqualsBuilder().append(instancePort, rhs.instancePort).append(sSLCertificateId, rhs.sSLCertificateId).append(instanceProtocol, rhs.instanceProtocol).append(protocol, rhs.protocol).append(policyNames, rhs.policyNames).append(loadBalancerPort, rhs.loadBalancerPort).isEquals();
    }

}
