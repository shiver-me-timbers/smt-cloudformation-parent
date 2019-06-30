
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
 * TransitGatewayRoute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TransitGatewayRouteTableId",
    "DestinationCidrBlock",
    "Blackhole",
    "TransitGatewayAttachmentId"
})
public class TransitGatewayRoute {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid
     * 
     */
    @JsonProperty("TransitGatewayRouteTableId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid")
    private CharSequence transitGatewayRouteTableId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock
     * 
     */
    @JsonProperty("DestinationCidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock")
    private CharSequence destinationCidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole
     * 
     */
    @JsonProperty("Blackhole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole")
    private CharSequence blackhole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid
     * 
     */
    @JsonProperty("TransitGatewayAttachmentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid")
    private CharSequence transitGatewayAttachmentId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid
     * 
     */
    @JsonIgnore
    public CharSequence getTransitGatewayRouteTableId() {
        return transitGatewayRouteTableId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid
     * 
     */
    @JsonIgnore
    public void setTransitGatewayRouteTableId(CharSequence transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    public TransitGatewayRoute withTransitGatewayRouteTableId(CharSequence transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock
     * 
     */
    @JsonIgnore
    public void setDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public TransitGatewayRoute withDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole
     * 
     */
    @JsonIgnore
    public CharSequence getBlackhole() {
        return blackhole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole
     * 
     */
    @JsonIgnore
    public void setBlackhole(CharSequence blackhole) {
        this.blackhole = blackhole;
    }

    public TransitGatewayRoute withBlackhole(CharSequence blackhole) {
        this.blackhole = blackhole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid
     * 
     */
    @JsonIgnore
    public CharSequence getTransitGatewayAttachmentId() {
        return transitGatewayAttachmentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid
     * 
     */
    @JsonIgnore
    public void setTransitGatewayAttachmentId(CharSequence transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    public TransitGatewayRoute withTransitGatewayAttachmentId(CharSequence transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transitGatewayRouteTableId", transitGatewayRouteTableId).append("destinationCidrBlock", destinationCidrBlock).append("blackhole", blackhole).append("transitGatewayAttachmentId", transitGatewayAttachmentId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationCidrBlock).append(transitGatewayRouteTableId).append(transitGatewayAttachmentId).append(blackhole).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransitGatewayRoute) == false) {
            return false;
        }
        TransitGatewayRoute rhs = ((TransitGatewayRoute) other);
        return new EqualsBuilder().append(destinationCidrBlock, rhs.destinationCidrBlock).append(transitGatewayRouteTableId, rhs.transitGatewayRouteTableId).append(transitGatewayAttachmentId, rhs.transitGatewayAttachmentId).append(blackhole, rhs.blackhole).isEquals();
    }

}
