
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
 * LaunchTemplateIpv6Add
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Ipv6Address"
})
public class LaunchTemplateIpv6Add implements Property<LaunchTemplateIpv6Add>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address
     * 
     */
    @JsonProperty("Ipv6Address")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address")
    private CharSequence ipv6Address;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address
     * 
     */
    @JsonIgnore
    public CharSequence getIpv6Address() {
        return ipv6Address;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html#cfn-ec2-launchtemplate-ipv6add-ipv6address
     * 
     */
    @JsonIgnore
    public void setIpv6Address(CharSequence ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public LaunchTemplateIpv6Add withIpv6Address(CharSequence ipv6Address) {
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
        if ((other instanceof LaunchTemplateIpv6Add) == false) {
            return false;
        }
        LaunchTemplateIpv6Add rhs = ((LaunchTemplateIpv6Add) other);
        return new EqualsBuilder().append(ipv6Address, rhs.ipv6Address).isEquals();
    }

}
