
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
 * LocalGatewayRouteTableVPCAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LocalGatewayRouteTableId",
    "VpcId",
    "Tags"
})
public class LocalGatewayRouteTableVPCAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-localgatewayroutetableid
     * 
     */
    @JsonProperty("LocalGatewayRouteTableId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-localgatewayroutetableid")
    private CharSequence localGatewayRouteTableId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-vpcid
     * 
     */
    @JsonProperty("VpcId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-vpcid")
    private CharSequence vpcId;
    /**
     * LocalGatewayRouteTableVPCAssociationTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html")
    private Property<LocalGatewayRouteTableVPCAssociationTags> tags;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-localgatewayroutetableid
     * 
     */
    @JsonIgnore
    public CharSequence getLocalGatewayRouteTableId() {
        return localGatewayRouteTableId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-localgatewayroutetableid
     * 
     */
    @JsonIgnore
    public void setLocalGatewayRouteTableId(CharSequence localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    public LocalGatewayRouteTableVPCAssociation withLocalGatewayRouteTableId(CharSequence localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-vpcid
     * 
     */
    @JsonIgnore
    public CharSequence getVpcId() {
        return vpcId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-vpcid
     * 
     */
    @JsonIgnore
    public void setVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
    }

    public LocalGatewayRouteTableVPCAssociation withVpcId(CharSequence vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * LocalGatewayRouteTableVPCAssociationTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html
     * 
     */
    @JsonIgnore
    public Property<LocalGatewayRouteTableVPCAssociationTags> getTags() {
        return tags;
    }

    /**
     * LocalGatewayRouteTableVPCAssociationTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-localgatewayroutetablevpcassociation-tags.html
     * 
     */
    @JsonIgnore
    public void setTags(Property<LocalGatewayRouteTableVPCAssociationTags> tags) {
        this.tags = tags;
    }

    public LocalGatewayRouteTableVPCAssociation withTags(Property<LocalGatewayRouteTableVPCAssociationTags> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("localGatewayRouteTableId", localGatewayRouteTableId).append("vpcId", vpcId).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(localGatewayRouteTableId).append(vpcId).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocalGatewayRouteTableVPCAssociation) == false) {
            return false;
        }
        LocalGatewayRouteTableVPCAssociation rhs = ((LocalGatewayRouteTableVPCAssociation) other);
        return new EqualsBuilder().append(localGatewayRouteTableId, rhs.localGatewayRouteTableId).append(vpcId, rhs.vpcId).append(tags, rhs.tags).isEquals();
    }

}
