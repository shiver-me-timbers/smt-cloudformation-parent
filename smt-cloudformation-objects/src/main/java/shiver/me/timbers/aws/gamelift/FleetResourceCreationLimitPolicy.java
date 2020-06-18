
package shiver.me.timbers.aws.gamelift;

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
 * FleetResourceCreationLimitPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NewGameSessionsPerCreator",
    "PolicyPeriodInMinutes"
})
public class FleetResourceCreationLimitPolicy implements Property<FleetResourceCreationLimitPolicy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-newgamesessionspercreator
     * 
     */
    @JsonProperty("NewGameSessionsPerCreator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-newgamesessionspercreator")
    private Number newGameSessionsPerCreator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-policyperiodinminutes
     * 
     */
    @JsonProperty("PolicyPeriodInMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-policyperiodinminutes")
    private Number policyPeriodInMinutes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-newgamesessionspercreator
     * 
     */
    @JsonIgnore
    public Number getNewGameSessionsPerCreator() {
        return newGameSessionsPerCreator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-newgamesessionspercreator
     * 
     */
    @JsonIgnore
    public void setNewGameSessionsPerCreator(Number newGameSessionsPerCreator) {
        this.newGameSessionsPerCreator = newGameSessionsPerCreator;
    }

    public FleetResourceCreationLimitPolicy withNewGameSessionsPerCreator(Number newGameSessionsPerCreator) {
        this.newGameSessionsPerCreator = newGameSessionsPerCreator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-policyperiodinminutes
     * 
     */
    @JsonIgnore
    public Number getPolicyPeriodInMinutes() {
        return policyPeriodInMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-policyperiodinminutes
     * 
     */
    @JsonIgnore
    public void setPolicyPeriodInMinutes(Number policyPeriodInMinutes) {
        this.policyPeriodInMinutes = policyPeriodInMinutes;
    }

    public FleetResourceCreationLimitPolicy withPolicyPeriodInMinutes(Number policyPeriodInMinutes) {
        this.policyPeriodInMinutes = policyPeriodInMinutes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("newGameSessionsPerCreator", newGameSessionsPerCreator).append("policyPeriodInMinutes", policyPeriodInMinutes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(newGameSessionsPerCreator).append(policyPeriodInMinutes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FleetResourceCreationLimitPolicy) == false) {
            return false;
        }
        FleetResourceCreationLimitPolicy rhs = ((FleetResourceCreationLimitPolicy) other);
        return new EqualsBuilder().append(newGameSessionsPerCreator, rhs.newGameSessionsPerCreator).append(policyPeriodInMinutes, rhs.policyPeriodInMinutes).isEquals();
    }

}
