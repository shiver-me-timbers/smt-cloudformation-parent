
package shiver.me.timbers.aws.ecs;

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
 * TaskSetAwsVpcConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AssignPublicIp",
    "SecurityGroups",
    "Subnets"
})
public class TaskSetAwsVpcConfiguration implements Property<TaskSetAwsVpcConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-assignpublicip
     * 
     */
    @JsonProperty("AssignPublicIp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-assignpublicip")
    private CharSequence assignPublicIp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-securitygroups")
    private List<CharSequence> securityGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-subnets
     * 
     */
    @JsonProperty("Subnets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-subnets")
    private List<CharSequence> subnets = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-assignpublicip
     * 
     */
    @JsonIgnore
    public CharSequence getAssignPublicIp() {
        return assignPublicIp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-assignpublicip
     * 
     */
    @JsonIgnore
    public void setAssignPublicIp(CharSequence assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    public TaskSetAwsVpcConfiguration withAssignPublicIp(CharSequence assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-securitygroups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-securitygroups
     * 
     */
    @JsonIgnore
    public void setSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public TaskSetAwsVpcConfiguration withSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-subnets
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnets() {
        return subnets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-subnets
     * 
     */
    @JsonIgnore
    public void setSubnets(List<CharSequence> subnets) {
        this.subnets = subnets;
    }

    public TaskSetAwsVpcConfiguration withSubnets(List<CharSequence> subnets) {
        this.subnets = subnets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("assignPublicIp", assignPublicIp).append("securityGroups", securityGroups).append("subnets", subnets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(securityGroups).append(subnets).append(assignPublicIp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskSetAwsVpcConfiguration) == false) {
            return false;
        }
        TaskSetAwsVpcConfiguration rhs = ((TaskSetAwsVpcConfiguration) other);
        return new EqualsBuilder().append(securityGroups, rhs.securityGroups).append(subnets, rhs.subnets).append(assignPublicIp, rhs.assignPublicIp).isEquals();
    }

}
