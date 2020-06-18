
package shiver.me.timbers.aws.transfer;

import java.util.ArrayList;
import java.util.List;
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
 * ServerEndpointDetails
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AddressAllocationIds",
    "VpcId",
    "VpcEndpointId",
    "SubnetIds"
})
public class ServerEndpointDetails implements Property<ServerEndpointDetails>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-addressallocationids
     * 
     */
    @JsonProperty("AddressAllocationIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-addressallocationids")
    private List<CharSequence> addressAllocationIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcid")
    private CharSequence vpcId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcendpointid
     * 
     */
    @JsonProperty("VpcEndpointId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcendpointid")
    private CharSequence vpcEndpointId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-subnetids")
    private List<CharSequence> subnetIds = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-addressallocationids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAddressAllocationIds() {
        return addressAllocationIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-addressallocationids
     * 
     */
    @JsonIgnore
    public void setAddressAllocationIds(List<CharSequence> addressAllocationIds) {
        this.addressAllocationIds = addressAllocationIds;
    }

    public ServerEndpointDetails withAddressAllocationIds(List<CharSequence> addressAllocationIds) {
        this.addressAllocationIds = addressAllocationIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcid
     * 
     */
    @JsonIgnore
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcid
     * 
     */
    @JsonIgnore
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public ServerEndpointDetails withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcendpointid
     * 
     */
    @JsonIgnore
    public CharSequence getVpcEndpointId() {
        return vpcEndpointId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcendpointid
     * 
     */
    @JsonIgnore
    public void setVpcEndpointId(CharSequence vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    public ServerEndpointDetails withVpcEndpointId(CharSequence vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-subnetids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-subnetids
     * 
     */
    @JsonIgnore
    public void setSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public ServerEndpointDetails withSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("addressAllocationIds", addressAllocationIds).append("vpcId", vpcId).append("vpcEndpointId", vpcEndpointId).append("subnetIds", subnetIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(addressAllocationIds).append(vpcId).append(vpcEndpointId).append(subnetIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServerEndpointDetails) == false) {
            return false;
        }
        ServerEndpointDetails rhs = ((ServerEndpointDetails) other);
        return new EqualsBuilder().append(addressAllocationIds, rhs.addressAllocationIds).append(vpcId, rhs.vpcId).append(vpcEndpointId, rhs.vpcEndpointId).append(subnetIds, rhs.subnetIds).isEquals();
    }

}
