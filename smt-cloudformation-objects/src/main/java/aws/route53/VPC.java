
package aws.route53;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPC
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "VPCId",
    "VPCRegion"
})
public class VPC {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid
     * 
     */
    @JsonProperty("VPCId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid")
    private CharSequence vPCId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion
     * 
     */
    @JsonProperty("VPCRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion")
    private CharSequence vPCRegion;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid
     * 
     */
    public CharSequence getVPCId() {
        return vPCId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid
     * 
     */
    public void setVPCId(CharSequence vPCId) {
        this.vPCId = vPCId;
    }

    public VPC withVPCId(CharSequence vPCId) {
        this.vPCId = vPCId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion
     * 
     */
    public CharSequence getVPCRegion() {
        return vPCRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion
     * 
     */
    public void setVPCRegion(CharSequence vPCRegion) {
        this.vPCRegion = vPCRegion;
    }

    public VPC withVPCRegion(CharSequence vPCRegion) {
        this.vPCRegion = vPCRegion;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vPCId", vPCId).append("vPCRegion", vPCRegion).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vPCId).append(vPCRegion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPC) == false) {
            return false;
        }
        VPC rhs = ((VPC) other);
        return new EqualsBuilder().append(vPCId, rhs.vPCId).append(vPCRegion, rhs.vPCRegion).isEquals();
    }

}
