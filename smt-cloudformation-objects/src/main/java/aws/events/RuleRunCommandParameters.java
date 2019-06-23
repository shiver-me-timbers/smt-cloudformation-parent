
package aws.events;

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
 * RuleRunCommandParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RunCommandTargets"
})
public class RuleRunCommandParameters implements Property<RuleRunCommandParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets
     * 
     */
    @JsonProperty("RunCommandTargets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets")
    private Set<Property<RuleRunCommandTarget>> runCommandTargets = new LinkedHashSet<Property<RuleRunCommandTarget>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets
     * 
     */
    @JsonIgnore
    public Set<Property<RuleRunCommandTarget>> getRunCommandTargets() {
        return runCommandTargets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets
     * 
     */
    @JsonIgnore
    public void setRunCommandTargets(Set<Property<RuleRunCommandTarget>> runCommandTargets) {
        this.runCommandTargets = runCommandTargets;
    }

    public RuleRunCommandParameters withRunCommandTargets(Set<Property<RuleRunCommandTarget>> runCommandTargets) {
        this.runCommandTargets = runCommandTargets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("runCommandTargets", runCommandTargets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(runCommandTargets).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleRunCommandParameters) == false) {
            return false;
        }
        RuleRunCommandParameters rhs = ((RuleRunCommandParameters) other);
        return new EqualsBuilder().append(runCommandTargets, rhs.runCommandTargets).isEquals();
    }

}
