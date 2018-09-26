
package aws.ec2;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Domain",
    "InstanceId"
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain
     * 
     */
    public CharSequence getDomain() {
        return domain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-domain
     * 
     */
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
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-eip.html#cfn-ec2-eip-instanceid
     * 
     */
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public EIP withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("domain", domain).append("instanceId", instanceId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(domain).append(instanceId).toHashCode();
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
        return new EqualsBuilder().append(domain, rhs.domain).append(instanceId, rhs.instanceId).isEquals();
    }

}
