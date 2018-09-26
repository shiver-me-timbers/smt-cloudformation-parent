
package aws.events;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RunCommandParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RunCommandTargets"
})
public class RunCommandParameters {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets
     * 
     */
    @JsonProperty("RunCommandTargets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets")
    private Set<RunCommandTarget> runCommandTargets = new LinkedHashSet<RunCommandTarget>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets
     * 
     */
    public Set<RunCommandTarget> getRunCommandTargets() {
        return runCommandTargets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets
     * 
     */
    public void setRunCommandTargets(Set<RunCommandTarget> runCommandTargets) {
        this.runCommandTargets = runCommandTargets;
    }

    public RunCommandParameters withRunCommandTargets(Set<RunCommandTarget> runCommandTargets) {
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
        if ((other instanceof RunCommandParameters) == false) {
            return false;
        }
        RunCommandParameters rhs = ((RunCommandParameters) other);
        return new EqualsBuilder().append(runCommandTargets, rhs.runCommandTargets).isEquals();
    }

}
