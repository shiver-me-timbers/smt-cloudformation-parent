
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceIpv6Address
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Ipv6Address"
})
public class InstanceIpv6Address {

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
    public CharSequence getIpv6Address() {
        return ipv6Address;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address
     * 
     */
    public void setIpv6Address(CharSequence ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public InstanceIpv6Address withIpv6Address(CharSequence ipv6Address) {
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
        if ((other instanceof InstanceIpv6Address) == false) {
            return false;
        }
        InstanceIpv6Address rhs = ((InstanceIpv6Address) other);
        return new EqualsBuilder().append(ipv6Address, rhs.ipv6Address).isEquals();
    }

}
