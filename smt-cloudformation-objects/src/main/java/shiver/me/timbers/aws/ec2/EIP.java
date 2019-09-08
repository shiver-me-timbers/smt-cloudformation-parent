
package shiver.me.timbers.aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EIP
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Domain",
    "InstanceId",
    "PublicIpv4Pool"
})
public class EIP {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain
     * 
     */
    @JsonProperty("Domain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain")
    private CharSequence domain;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-publicipv4pool
     * 
     */
    @JsonProperty("PublicIpv4Pool")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-publicipv4pool")
    private CharSequence publicIpv4Pool;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain
     * 
     */
    @JsonIgnore
    public CharSequence getDomain() {
        return domain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain
     * 
     */
    @JsonIgnore
    public void setDomain(CharSequence domain) {
        this.domain = domain;
    }

    public EIP withDomain(CharSequence domain) {
        this.domain = domain;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-instanceid
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-instanceid
     * 
     */
    @JsonIgnore
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public EIP withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-publicipv4pool
     * 
     */
    @JsonIgnore
    public CharSequence getPublicIpv4Pool() {
        return publicIpv4Pool;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-publicipv4pool
     * 
     */
    @JsonIgnore
    public void setPublicIpv4Pool(CharSequence publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
    }

    public EIP withPublicIpv4Pool(CharSequence publicIpv4Pool) {
        this.publicIpv4Pool = publicIpv4Pool;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domain", domain).append("instanceId", instanceId).append("publicIpv4Pool", publicIpv4Pool).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(publicIpv4Pool).append(instanceId).append(domain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EIP) == false) {
            return false;
        }
        EIP rhs = ((EIP) other);
        return new EqualsBuilder().append(publicIpv4Pool, rhs.publicIpv4Pool).append(instanceId, rhs.instanceId).append(domain, rhs.domain).isEquals();
    }

}
