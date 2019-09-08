
package shiver.me.timbers.aws.ec2;

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
 * InstanceInstanceIpv6Address
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Ipv6Address"
})
public class InstanceInstanceIpv6Address implements Property<InstanceInstanceIpv6Address>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address
     * 
     */
    @JsonProperty("Ipv6Address")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address")
    private CharSequence ipv6Address;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address
     * 
     */
    @JsonIgnore
    public CharSequence getIpv6Address() {
        return ipv6Address;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address
     * 
     */
    @JsonIgnore
    public void setIpv6Address(CharSequence ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public InstanceInstanceIpv6Address withIpv6Address(CharSequence ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ipv6Address", ipv6Address).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ipv6Address).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceInstanceIpv6Address) == false) {
            return false;
        }
        InstanceInstanceIpv6Address rhs = ((InstanceInstanceIpv6Address) other);
        return new EqualsBuilder().append(ipv6Address, rhs.ipv6Address).isEquals();
    }

}
