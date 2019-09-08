
package shiver.me.timbers.aws.elasticloadbalancing;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * LoadBalancerPolicies
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Attributes",
    "InstancePorts",
    "LoadBalancerPorts",
    "PolicyName",
    "PolicyType"
})
public class LoadBalancerPolicies implements Property<LoadBalancerPolicies>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes")
    private Set<Object> attributes = new LinkedHashSet<Object>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports
     * 
     */
    @JsonProperty("InstancePorts")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports")
    private Set<CharSequence> instancePorts = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports
     * 
     */
    @JsonProperty("LoadBalancerPorts")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports")
    private Set<CharSequence> loadBalancerPorts = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname")
    private CharSequence policyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype")
    private CharSequence policyType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes
     * 
     */
    @JsonIgnore
    public Set<Object> getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-attributes
     * 
     */
    @JsonIgnore
    public void setAttributes(Set<Object> attributes) {
        this.attributes = attributes;
    }

    public LoadBalancerPolicies withAttributes(Set<Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getInstancePorts() {
        return instancePorts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-instanceports
     * 
     */
    @JsonIgnore
    public void setInstancePorts(Set<CharSequence> instancePorts) {
        this.instancePorts = instancePorts;
    }

    public LoadBalancerPolicies withInstancePorts(Set<CharSequence> instancePorts) {
        this.instancePorts = instancePorts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getLoadBalancerPorts() {
        return loadBalancerPorts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-loadbalancerports
     * 
     */
    @JsonIgnore
    public void setLoadBalancerPorts(Set<CharSequence> loadBalancerPorts) {
        this.loadBalancerPorts = loadBalancerPorts;
    }

    public LoadBalancerPolicies withLoadBalancerPorts(Set<CharSequence> loadBalancerPorts) {
        this.loadBalancerPorts = loadBalancerPorts;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname
     * 
     */
    @JsonIgnore
    public CharSequence getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policyname
     * 
     */
    @JsonIgnore
    public void setPolicyName(CharSequence policyName) {
        this.policyName = policyName;
    }

    public LoadBalancerPolicies withPolicyName(CharSequence policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype
     * 
     */
    @JsonIgnore
    public CharSequence getPolicyType() {
        return policyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-policy.html#cfn-ec2-elb-policy-policytype
     * 
     */
    @JsonIgnore
    public void setPolicyType(CharSequence policyType) {
        this.policyType = policyType;
    }

    public LoadBalancerPolicies withPolicyType(CharSequence policyType) {
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
        if ((other instanceof LoadBalancerPolicies) == false) {
            return false;
        }
        LoadBalancerPolicies rhs = ((LoadBalancerPolicies) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).append(loadBalancerPorts, rhs.loadBalancerPorts).append(policyName, rhs.policyName).append(instancePorts, rhs.instancePorts).append(policyType, rhs.policyType).isEquals();
    }

}
