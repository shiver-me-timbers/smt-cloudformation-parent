
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PlacementGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Strategy"
})
public class PlacementGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy
     * 
     */
    @JsonProperty("Strategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy")
    private CharSequence strategy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy
     * 
     */
    public CharSequence getStrategy() {
        return strategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-placementgroup.html#cfn-ec2-placementgroup-strategy
     * 
     */
    public void setStrategy(CharSequence strategy) {
        this.strategy = strategy;
    }

    public PlacementGroup withStrategy(CharSequence strategy) {
        this.strategy = strategy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("strategy", strategy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(strategy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlacementGroup) == false) {
            return false;
        }
        PlacementGroup rhs = ((PlacementGroup) other);
        return new EqualsBuilder().append(strategy, rhs.strategy).isEquals();
    }

}
