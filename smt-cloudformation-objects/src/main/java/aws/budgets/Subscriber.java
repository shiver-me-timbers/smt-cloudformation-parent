
package aws.budgets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Subscriber
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SubscriptionType",
    "Address"
})
public class Subscriber {

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
    public CharSequence getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype
     * 
     */
    public void setSubscriptionType(CharSequence subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Subscriber withSubscriptionType(CharSequence subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address
     * 
     */
    public CharSequence getAddress() {
        return address;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address
     * 
     */
    public void setAddress(CharSequence address) {
        this.address = address;
    }

    public Subscriber withAddress(CharSequence address) {
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
        if ((other instanceof Subscriber) == false) {
            return false;
        }
        Subscriber rhs = ((Subscriber) other);
        return new EqualsBuilder().append(subscriptionType, rhs.subscriptionType).append(address, rhs.address).isEquals();
    }

}
