
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SubnetRouteTableAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RouteTableId",
    "SubnetId"
})
public class SubnetRouteTableAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-routetableid
     * 
     */
    @JsonProperty("RouteTableId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-routetableid")
    private CharSequence routeTableId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-subnetid")
    private CharSequence subnetId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-routetableid
     * 
     */
    public CharSequence getRouteTableId() {
        return routeTableId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-routetableid
     * 
     */
    public void setRouteTableId(CharSequence routeTableId) {
        this.routeTableId = routeTableId;
    }

    public SubnetRouteTableAssociation withRouteTableId(CharSequence routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-subnetid
     * 
     */
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet-route-table-assoc.html#cfn-ec2-subnetroutetableassociation-subnetid
     * 
     */
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public SubnetRouteTableAssociation withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("routeTableId", routeTableId).append("subnetId", subnetId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(routeTableId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubnetRouteTableAssociation) == false) {
            return false;
        }
        SubnetRouteTableAssociation rhs = ((SubnetRouteTableAssociation) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(routeTableId, rhs.routeTableId).isEquals();
    }

}
