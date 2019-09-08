
package shiver.me.timbers.aws.greengrass;

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
 * SubscriptionDefinitionSubscriptionDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Subscriptions"
})
public class SubscriptionDefinitionSubscriptionDefinitionVersion implements Property<SubscriptionDefinitionSubscriptionDefinitionVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinition-subscriptiondefinitionversion-subscriptions
     * 
     */
    @JsonProperty("Subscriptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinition-subscriptiondefinitionversion-subscriptions")
    private List<Property<SubscriptionDefinitionSubscription>> subscriptions = new ArrayList<Property<SubscriptionDefinitionSubscription>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinition-subscriptiondefinitionversion-subscriptions
     * 
     */
    @JsonIgnore
    public List<Property<SubscriptionDefinitionSubscription>> getSubscriptions() {
        return subscriptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinition-subscriptiondefinitionversion-subscriptions
     * 
     */
    @JsonIgnore
    public void setSubscriptions(List<Property<SubscriptionDefinitionSubscription>> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public SubscriptionDefinitionSubscriptionDefinitionVersion withSubscriptions(List<Property<SubscriptionDefinitionSubscription>> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("subscriptions", subscriptions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subscriptions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriptionDefinitionSubscriptionDefinitionVersion) == false) {
            return false;
        }
        SubscriptionDefinitionSubscriptionDefinitionVersion rhs = ((SubscriptionDefinitionSubscriptionDefinitionVersion) other);
        return new EqualsBuilder().append(subscriptions, rhs.subscriptions).isEquals();
    }

}
