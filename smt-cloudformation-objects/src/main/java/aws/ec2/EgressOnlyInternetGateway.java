
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EgressOnlyInternetGateway
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "VpcId"
})
public class EgressOnlyInternetGateway {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid")
    private CharSequence vpcId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid
     * 
     */
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid
     * 
     */
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public EgressOnlyInternetGateway withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vpcId", vpcId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vpcId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EgressOnlyInternetGateway) == false) {
            return false;
        }
        EgressOnlyInternetGateway rhs = ((EgressOnlyInternetGateway) other);
        return new EqualsBuilder().append(vpcId, rhs.vpcId).isEquals();
    }

}
