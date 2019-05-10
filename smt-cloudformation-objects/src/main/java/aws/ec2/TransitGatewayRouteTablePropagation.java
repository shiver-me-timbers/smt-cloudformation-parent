
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TransitGatewayRouteTablePropagation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TransitGatewayRouteTableId",
    "TransitGatewayAttachmentId"
})
public class TransitGatewayRouteTablePropagation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid
     * 
     */
    @JsonProperty("TransitGatewayRouteTableId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid")
    private CharSequence transitGatewayRouteTableId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid
     * 
     */
    @JsonProperty("TransitGatewayAttachmentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid")
    private CharSequence transitGatewayAttachmentId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid
     * 
     */
    @JsonIgnore
    public CharSequence getTransitGatewayRouteTableId() {
        return transitGatewayRouteTableId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid
     * 
     */
    @JsonIgnore
    public void setTransitGatewayRouteTableId(CharSequence transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    public TransitGatewayRouteTablePropagation withTransitGatewayRouteTableId(CharSequence transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid
     * 
     */
    @JsonIgnore
    public CharSequence getTransitGatewayAttachmentId() {
        return transitGatewayAttachmentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid
     * 
     */
    @JsonIgnore
    public void setTransitGatewayAttachmentId(CharSequence transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    public TransitGatewayRouteTablePropagation withTransitGatewayAttachmentId(CharSequence transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transitGatewayRouteTableId", transitGatewayRouteTableId).append("transitGatewayAttachmentId", transitGatewayAttachmentId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transitGatewayRouteTableId).append(transitGatewayAttachmentId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransitGatewayRouteTablePropagation) == false) {
            return false;
        }
        TransitGatewayRouteTablePropagation rhs = ((TransitGatewayRouteTablePropagation) other);
        return new EqualsBuilder().append(transitGatewayRouteTableId, rhs.transitGatewayRouteTableId).append(transitGatewayAttachmentId, rhs.transitGatewayAttachmentId).isEquals();
    }

}
