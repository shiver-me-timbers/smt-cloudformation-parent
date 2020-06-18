
package shiver.me.timbers.aws.cloudfront;

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
 * DistributionOriginGroupMembers
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Quantity",
    "Items"
})
public class DistributionOriginGroupMembers implements Property<DistributionOriginGroupMembers>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-quantity
     * 
     */
    @JsonProperty("Quantity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-quantity")
    private Number quantity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-items
     * 
     */
    @JsonProperty("Items")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-items")
    private List<Property<DistributionOriginGroupMember>> items = new ArrayList<Property<DistributionOriginGroupMember>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-quantity
     * 
     */
    @JsonIgnore
    public Number getQuantity() {
        return quantity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-quantity
     * 
     */
    @JsonIgnore
    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public DistributionOriginGroupMembers withQuantity(Number quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-items
     * 
     */
    @JsonIgnore
    public List<Property<DistributionOriginGroupMember>> getItems() {
        return items;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-items
     * 
     */
    @JsonIgnore
    public void setItems(List<Property<DistributionOriginGroupMember>> items) {
        this.items = items;
    }

    public DistributionOriginGroupMembers withItems(List<Property<DistributionOriginGroupMember>> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("quantity", quantity).append("items", items).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(items).append(quantity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionOriginGroupMembers) == false) {
            return false;
        }
        DistributionOriginGroupMembers rhs = ((DistributionOriginGroupMembers) other);
        return new EqualsBuilder().append(items, rhs.items).append(quantity, rhs.quantity).isEquals();
    }

}
