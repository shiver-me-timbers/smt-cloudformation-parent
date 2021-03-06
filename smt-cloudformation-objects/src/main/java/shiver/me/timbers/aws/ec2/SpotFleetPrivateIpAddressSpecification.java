
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
 * SpotFleetPrivateIpAddressSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Primary",
    "PrivateIpAddress"
})
public class SpotFleetPrivateIpAddressSpecification implements Property<SpotFleetPrivateIpAddressSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-primary
     * 
     */
    @JsonProperty("Primary")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-primary")
    private CharSequence primary;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress")
    private CharSequence privateIpAddress;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-primary
     * 
     */
    @JsonIgnore
    public CharSequence getPrimary() {
        return primary;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-primary
     * 
     */
    @JsonIgnore
    public void setPrimary(CharSequence primary) {
        this.primary = primary;
    }

    public SpotFleetPrivateIpAddressSpecification withPrimary(CharSequence primary) {
        this.primary = primary;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress
     * 
     */
    @JsonIgnore
    public CharSequence getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-networkinterfaces-privateipaddresses.html#cfn-ec2-spotfleet-privateipaddressspecification-privateipaddress
     * 
     */
    @JsonIgnore
    public void setPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public SpotFleetPrivateIpAddressSpecification withPrivateIpAddress(CharSequence privateIpAddress) {
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
        if ((other instanceof SpotFleetPrivateIpAddressSpecification) == false) {
            return false;
        }
        SpotFleetPrivateIpAddressSpecification rhs = ((SpotFleetPrivateIpAddressSpecification) other);
        return new EqualsBuilder().append(privateIpAddress, rhs.privateIpAddress).append(primary, rhs.primary).isEquals();
    }

}
