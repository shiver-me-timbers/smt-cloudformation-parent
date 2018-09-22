
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
 * Policies
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Attributes",
    "InstancePorts",
    "LoadBalancerPorts",
    "PolicyName",
    "PolicyType"
})
public class Policies {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes")
    private Set<Attribute> attributes = new LinkedHashSet<Attribute>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports
     * 
     */
    @JsonProperty("InstancePorts")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports")
    private Set<String> instancePorts = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports
     * 
     */
    @JsonProperty("LoadBalancerPorts")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports")
    private Set<String> loadBalancerPorts = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname")
    private String policyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype")
    private String policyType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes
     * 
     */
    @JsonProperty("Attributes")
    public Set<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes
     * 
     */
    @JsonProperty("Attributes")
    public void setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Policies withAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports
     * 
     */
    @JsonProperty("InstancePorts")
    public Set<String> getInstancePorts() {
        return instancePorts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports
     * 
     */
    @JsonProperty("InstancePorts")
    public void setInstancePorts(Set<String> instancePorts) {
        this.instancePorts = instancePorts;
    }

    public Policies withInstancePorts(Set<String> instancePorts) {
        this.instancePorts = instancePorts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports
     * 
     */
    @JsonProperty("LoadBalancerPorts")
    public Set<String> getLoadBalancerPorts() {
        return loadBalancerPorts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports
     * 
     */
    @JsonProperty("LoadBalancerPorts")
    public void setLoadBalancerPorts(Set<String> loadBalancerPorts) {
        this.loadBalancerPorts = loadBalancerPorts;
    }

    public Policies withLoadBalancerPorts(Set<String> loadBalancerPorts) {
        this.loadBalancerPorts = loadBalancerPorts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    public String getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Policies withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    public String getPolicyType() {
        return policyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Policies withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributes", attributes).append("instancePorts", instancePorts).append("loadBalancerPorts", loadBalancerPorts).append("policyName", policyName).append("policyType", policyType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).append(loadBalancerPorts).append(policyName).append(instancePorts).append(policyType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Policies) == false) {
            return false;
        }
        Policies rhs = ((Policies) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).append(loadBalancerPorts, rhs.loadBalancerPorts).append(policyName, rhs.policyName).append(instancePorts, rhs.instancePorts).append(policyType, rhs.policyType).isEquals();
    }

}
