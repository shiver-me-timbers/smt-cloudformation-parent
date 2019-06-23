
package aws.ec2;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SpotFleetClassicLoadBalancersConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClassicLoadBalancers"
})
public class SpotFleetClassicLoadBalancersConfig implements Property<SpotFleetClassicLoadBalancersConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers
     * 
     */
    @JsonProperty("ClassicLoadBalancers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers")
    private Set<Property<SpotFleetClassicLoadBalancer>> classicLoadBalancers = new LinkedHashSet<Property<SpotFleetClassicLoadBalancer>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetClassicLoadBalancer>> getClassicLoadBalancers() {
        return classicLoadBalancers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-classicloadbalancersconfig.html#cfn-ec2-spotfleet-classicloadbalancersconfig-classicloadbalancers
     * 
     */
    @JsonIgnore
    public void setClassicLoadBalancers(Set<Property<SpotFleetClassicLoadBalancer>> classicLoadBalancers) {
        this.classicLoadBalancers = classicLoadBalancers;
    }

    public SpotFleetClassicLoadBalancersConfig withClassicLoadBalancers(Set<Property<SpotFleetClassicLoadBalancer>> classicLoadBalancers) {
        this.classicLoadBalancers = classicLoadBalancers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("classicLoadBalancers", classicLoadBalancers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(classicLoadBalancers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpotFleetClassicLoadBalancersConfig) == false) {
            return false;
        }
        SpotFleetClassicLoadBalancersConfig rhs = ((SpotFleetClassicLoadBalancersConfig) other);
        return new EqualsBuilder().append(classicLoadBalancers, rhs.classicLoadBalancers).isEquals();
    }

}
