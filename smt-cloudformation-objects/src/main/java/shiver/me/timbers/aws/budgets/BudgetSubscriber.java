
package shiver.me.timbers.aws.budgets;

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
 * BudgetSubscriber
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SubscriptionType",
    "Address"
})
public class BudgetSubscriber implements Property<BudgetSubscriber>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype
     * 
     */
    @JsonProperty("SubscriptionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype")
    private CharSequence subscriptionType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address
     * 
     */
    @JsonProperty("Address")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address")
    private CharSequence address;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype
     * 
     */
    @JsonIgnore
    public CharSequence getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype
     * 
     */
    @JsonIgnore
    public void setSubscriptionType(CharSequence subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public BudgetSubscriber withSubscriptionType(CharSequence subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address
     * 
     */
    @JsonIgnore
    public CharSequence getAddress() {
        return address;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address
     * 
     */
    @JsonIgnore
    public void setAddress(CharSequence address) {
        this.address = address;
    }

    public BudgetSubscriber withAddress(CharSequence address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("subscriptionType", subscriptionType).append("address", address).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subscriptionType).append(address).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BudgetSubscriber) == false) {
            return false;
        }
        BudgetSubscriber rhs = ((BudgetSubscriber) other);
        return new EqualsBuilder().append(subscriptionType, rhs.subscriptionType).append(address, rhs.address).isEquals();
    }

}
