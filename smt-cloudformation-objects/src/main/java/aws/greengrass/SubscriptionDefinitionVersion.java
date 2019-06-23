
package aws.greengrass;

import java.util.ArrayList;
import java.util.List;
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
 * SubscriptionDefinitionVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SubscriptionDefinitionId",
    "Subscriptions"
})
public class SubscriptionDefinitionVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid
     * 
     */
    @JsonProperty("SubscriptionDefinitionId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid")
    private CharSequence subscriptionDefinitionId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions
     * 
     */
    @JsonProperty("Subscriptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions")
    private List<Property<SubscriptionDefinitionVersionSubscription>> subscriptions = new ArrayList<Property<SubscriptionDefinitionVersionSubscription>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid
     * 
     */
    @JsonIgnore
    public CharSequence getSubscriptionDefinitionId() {
        return subscriptionDefinitionId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid
     * 
     */
    @JsonIgnore
    public void setSubscriptionDefinitionId(CharSequence subscriptionDefinitionId) {
        this.subscriptionDefinitionId = subscriptionDefinitionId;
    }

    public SubscriptionDefinitionVersion withSubscriptionDefinitionId(CharSequence subscriptionDefinitionId) {
        this.subscriptionDefinitionId = subscriptionDefinitionId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions
     * 
     */
    @JsonIgnore
    public List<Property<SubscriptionDefinitionVersionSubscription>> getSubscriptions() {
        return subscriptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions
     * 
     */
    @JsonIgnore
    public void setSubscriptions(List<Property<SubscriptionDefinitionVersionSubscription>> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public SubscriptionDefinitionVersion withSubscriptions(List<Property<SubscriptionDefinitionVersionSubscription>> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("subscriptionDefinitionId", subscriptionDefinitionId).append("subscriptions", subscriptions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subscriptionDefinitionId).append(subscriptions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriptionDefinitionVersion) == false) {
            return false;
        }
        SubscriptionDefinitionVersion rhs = ((SubscriptionDefinitionVersion) other);
        return new EqualsBuilder().append(subscriptionDefinitionId, rhs.subscriptionDefinitionId).append(subscriptions, rhs.subscriptions).isEquals();
    }

}
