
package shiver.me.timbers.aws.codeguruprofiler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ProfilingGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ProfilingGroupName",
    "AgentPermissions"
})
public class ProfilingGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-profilinggroupname
     * 
     */
    @JsonProperty("ProfilingGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-profilinggroupname")
    private CharSequence profilingGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-agentpermissions
     * 
     */
    @JsonProperty("AgentPermissions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-agentpermissions")
    private Object agentPermissions;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-profilinggroupname
     * 
     */
    @JsonIgnore
    public CharSequence getProfilingGroupName() {
        return profilingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-profilinggroupname
     * 
     */
    @JsonIgnore
    public void setProfilingGroupName(CharSequence profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    public ProfilingGroup withProfilingGroupName(CharSequence profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-agentpermissions
     * 
     */
    @JsonIgnore
    public Object getAgentPermissions() {
        return agentPermissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html#cfn-codeguruprofiler-profilinggroup-agentpermissions
     * 
     */
    @JsonIgnore
    public void setAgentPermissions(Object agentPermissions) {
        this.agentPermissions = agentPermissions;
    }

    public ProfilingGroup withAgentPermissions(Object agentPermissions) {
        this.agentPermissions = agentPermissions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("profilingGroupName", profilingGroupName).append("agentPermissions", agentPermissions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(profilingGroupName).append(agentPermissions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfilingGroup) == false) {
            return false;
        }
        ProfilingGroup rhs = ((ProfilingGroup) other);
        return new EqualsBuilder().append(profilingGroupName, rhs.profilingGroupName).append(agentPermissions, rhs.agentPermissions).isEquals();
    }

}
