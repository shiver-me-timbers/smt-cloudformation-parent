
package aws.ec2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstancePrivateIpAddressSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Primary",
    "PrivateIpAddress"
})
public class InstancePrivateIpAddressSpecification implements Property<InstancePrivateIpAddressSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary
     * 
     */
    @JsonProperty("Primary")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary")
    private Boolean primary;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress")
    private CharSequence privateIpAddress;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary
     * 
     */
    @JsonIgnore
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-primary
     * 
     */
    @JsonIgnore
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public InstancePrivateIpAddressSpecification withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress
     * 
     */
    @JsonIgnore
    public CharSequence getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-network-interface-privateipspec.html#cfn-ec2-networkinterface-privateipspecification-privateipaddress
     * 
     */
    @JsonIgnore
    public void setPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public InstancePrivateIpAddressSpecification withPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("primary", primary).append("privateIpAddress", privateIpAddress).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(privateIpAddress).append(primary).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstancePrivateIpAddressSpecification) == false) {
            return false;
        }
        InstancePrivateIpAddressSpecification rhs = ((InstancePrivateIpAddressSpecification) other);
        return new EqualsBuilder().append(privateIpAddress, rhs.privateIpAddress).append(primary, rhs.primary).isEquals();
    }

}
