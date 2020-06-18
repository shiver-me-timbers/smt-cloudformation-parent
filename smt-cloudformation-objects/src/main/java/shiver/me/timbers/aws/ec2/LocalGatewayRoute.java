
package shiver.me.timbers.aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LocalGatewayRoute
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DestinationCidrBlock",
    "LocalGatewayRouteTableId",
    "LocalGatewayVirtualInterfaceGroupId"
})
public class LocalGatewayRoute {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock
     * 
     */
    @JsonProperty("DestinationCidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock")
    private CharSequence destinationCidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid
     * 
     */
    @JsonProperty("LocalGatewayRouteTableId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid")
    private CharSequence localGatewayRouteTableId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid
     * 
     */
    @JsonProperty("LocalGatewayVirtualInterfaceGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid")
    private CharSequence localGatewayVirtualInterfaceGroupId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock
     * 
     */
    @JsonIgnore
    public void setDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public LocalGatewayRoute withDestinationCidrBlock(CharSequence destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid
     * 
     */
    @JsonIgnore
    public CharSequence getLocalGatewayRouteTableId() {
        return localGatewayRouteTableId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid
     * 
     */
    @JsonIgnore
    public void setLocalGatewayRouteTableId(CharSequence localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    public LocalGatewayRoute withLocalGatewayRouteTableId(CharSequence localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid
     * 
     */
    @JsonIgnore
    public CharSequence getLocalGatewayVirtualInterfaceGroupId() {
        return localGatewayVirtualInterfaceGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid
     * 
     */
    @JsonIgnore
    public void setLocalGatewayVirtualInterfaceGroupId(CharSequence localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    public LocalGatewayRoute withLocalGatewayVirtualInterfaceGroupId(CharSequence localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationCidrBlock", destinationCidrBlock).append("localGatewayRouteTableId", localGatewayRouteTableId).append("localGatewayVirtualInterfaceGroupId", localGatewayVirtualInterfaceGroupId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationCidrBlock).append(localGatewayRouteTableId).append(localGatewayVirtualInterfaceGroupId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocalGatewayRoute) == false) {
            return false;
        }
        LocalGatewayRoute rhs = ((LocalGatewayRoute) other);
        return new EqualsBuilder().append(destinationCidrBlock, rhs.destinationCidrBlock).append(localGatewayRouteTableId, rhs.localGatewayRouteTableId).append(localGatewayVirtualInterfaceGroupId, rhs.localGatewayVirtualInterfaceGroupId).isEquals();
    }

}
