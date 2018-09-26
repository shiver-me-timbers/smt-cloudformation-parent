
package aws.elasticloadbalancingv2;

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
 * Listener
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Certificates",
    "DefaultActions",
    "LoadBalancerArn",
    "Port",
    "Protocol",
    "SslPolicy"
})
public class Listener {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates
     * 
     */
    @JsonProperty("Certificates")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates")
    private Set<Certificate> certificates = new LinkedHashSet<Certificate>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions
     * 
     */
    @JsonProperty("DefaultActions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions")
    private Set<Action> defaultActions = new LinkedHashSet<Action>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn
     * 
     */
    @JsonProperty("LoadBalancerArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn")
    private CharSequence loadBalancerArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port
     * 
     */
    @JsonProperty("Port")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port")
    private Integer port;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol")
    private CharSequence protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy
     * 
     */
    @JsonProperty("SslPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy")
    private CharSequence sslPolicy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates
     * 
     */
    public Set<Certificate> getCertificates() {
        return certificates;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-certificates
     * 
     */
    public void setCertificates(Set<Certificate> certificates) {
        this.certificates = certificates;
    }

    public Listener withCertificates(Set<Certificate> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions
     * 
     */
    public Set<Action> getDefaultActions() {
        return defaultActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-defaultactions
     * 
     */
    public void setDefaultActions(Set<Action> defaultActions) {
        this.defaultActions = defaultActions;
    }

    public Listener withDefaultActions(Set<Action> defaultActions) {
        this.defaultActions = defaultActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn
     * 
     */
    public CharSequence getLoadBalancerArn() {
        return loadBalancerArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-loadbalancerarn
     * 
     */
    public void setLoadBalancerArn(CharSequence loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    public Listener withLoadBalancerArn(CharSequence loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port
     * 
     */
    public Integer getPort() {
        return port;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-port
     * 
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    public Listener withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol
     * 
     */
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-protocol
     * 
     */
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public Listener withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy
     * 
     */
    public CharSequence getSslPolicy() {
        return sslPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listener.html#cfn-elasticloadbalancingv2-listener-sslpolicy
     * 
     */
    public void setSslPolicy(CharSequence sslPolicy) {
        this.sslPolicy = sslPolicy;
    }

    public Listener withSslPolicy(CharSequence sslPolicy) {
        this.sslPolicy = sslPolicy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("certificates", certificates).append("defaultActions", defaultActions).append("loadBalancerArn", loadBalancerArn).append("port", port).append("protocol", protocol).append("sslPolicy", sslPolicy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(loadBalancerArn).append(protocol).append(certificates).append(port).append(sslPolicy).append(defaultActions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Listener) == false) {
            return false;
        }
        Listener rhs = ((Listener) other);
        return new EqualsBuilder().append(loadBalancerArn, rhs.loadBalancerArn).append(protocol, rhs.protocol).append(certificates, rhs.certificates).append(port, rhs.port).append(sslPolicy, rhs.sslPolicy).append(defaultActions, rhs.defaultActions).isEquals();
    }

}
