
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
 * SpotFleetTargetGroupsConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetGroups"
})
public class SpotFleetTargetGroupsConfig implements Property<SpotFleetTargetGroupsConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups
     * 
     */
    @JsonProperty("TargetGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups")
    private Set<Property<SpotFleetTargetGroup>> targetGroups = new LinkedHashSet<Property<SpotFleetTargetGroup>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetTargetGroup>> getTargetGroups() {
        return targetGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html#cfn-ec2-spotfleet-targetgroupsconfig-targetgroups
     * 
     */
    @JsonIgnore
    public void setTargetGroups(Set<Property<SpotFleetTargetGroup>> targetGroups) {
        this.targetGroups = targetGroups;
    }

    public SpotFleetTargetGroupsConfig withTargetGroups(Set<Property<SpotFleetTargetGroup>> targetGroups) {
        this.targetGroups = targetGroups;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetGroups", targetGroups).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetGroups).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpotFleetTargetGroupsConfig) == false) {
            return false;
        }
        SpotFleetTargetGroupsConfig rhs = ((SpotFleetTargetGroupsConfig) other);
        return new EqualsBuilder().append(targetGroups, rhs.targetGroups).isEquals();
    }

}
