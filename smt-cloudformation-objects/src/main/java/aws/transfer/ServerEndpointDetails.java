
package aws.transfer;

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
 * ServerEndpointDetails
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VpcEndpointId"
})
public class ServerEndpointDetails implements Property<ServerEndpointDetails>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcendpointid
     * 
     */
    @JsonProperty("VpcEndpointId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html#cfn-transfer-server-endpointdetails-vpcendpointid")
    private CharSequence vpcEndpointId;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vpcEndpointId", vpcEndpointId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vpcEndpointId).toHashCode();
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
        return new EqualsBuilder().append(vpcEndpointId, rhs.vpcEndpointId).isEquals();
    }

}
