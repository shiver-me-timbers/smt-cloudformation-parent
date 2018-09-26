
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PrivateIpAdd
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PrivateIpAddress",
    "Primary"
})
public class PrivateIpAdd {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress")
    private CharSequence privateIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary
     * 
     */
    @JsonProperty("Primary")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary")
    private Boolean primary;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress
     * 
     */
    public CharSequence getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-privateipaddress
     * 
     */
    public void setPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public PrivateIpAdd withPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary
     * 
     */
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-privateipadd.html#cfn-ec2-launchtemplate-privateipadd-primary
     * 
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public PrivateIpAdd withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("privateIpAddress", privateIpAddress).append("primary", primary).toString();
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
        if ((other instanceof PrivateIpAdd) == false) {
            return false;
        }
        PrivateIpAdd rhs = ((PrivateIpAdd) other);
        return new EqualsBuilder().append(privateIpAddress, rhs.privateIpAddress).append(primary, rhs.primary).isEquals();
    }

}
