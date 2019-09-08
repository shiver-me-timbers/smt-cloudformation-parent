
package shiver.me.timbers.aws.route53;

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
 * HostedZoneVPC
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VPCId",
    "VPCRegion"
})
public class HostedZoneVPC implements Property<HostedZoneVPC>
{

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
    @JsonIgnore
    public CharSequence getVPCId() {
        return vPCId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcid
     * 
     */
    @JsonIgnore
    public void setVPCId(CharSequence vPCId) {
        this.vPCId = vPCId;
    }

    public HostedZoneVPC withVPCId(CharSequence vPCId) {
        this.vPCId = vPCId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion
     * 
     */
    @JsonIgnore
    public CharSequence getVPCRegion() {
        return vPCRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone-hostedzonevpcs.html#cfn-route53-hostedzone-hostedzonevpcs-vpcregion
     * 
     */
    @JsonIgnore
    public void setVPCRegion(CharSequence vPCRegion) {
        this.vPCRegion = vPCRegion;
    }

    public HostedZoneVPC withVPCRegion(CharSequence vPCRegion) {
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
        if ((other instanceof HostedZoneVPC) == false) {
            return false;
        }
        HostedZoneVPC rhs = ((HostedZoneVPC) other);
        return new EqualsBuilder().append(vPCId, rhs.vPCId).append(vPCRegion, rhs.vPCRegion).isEquals();
    }

}
