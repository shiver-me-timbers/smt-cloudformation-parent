
package aws.ecs;

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
 * AwsVpcConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AssignPublicIp",
    "SecurityGroups",
    "Subnets"
})
public class AwsVpcConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip
     * 
     */
    @JsonProperty("AssignPublicIp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip")
    private CharSequence assignPublicIp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups")
    private Set<CharSequence> securityGroups = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets
     * 
     */
    @JsonProperty("Subnets")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets")
    private Set<CharSequence> subnets = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip
     * 
     */
    public CharSequence getAssignPublicIp() {
        return assignPublicIp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-assignpublicip
     * 
     */
    public void setAssignPublicIp(CharSequence assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    public AwsVpcConfiguration withAssignPublicIp(CharSequence assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups
     * 
     */
    public Set<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-securitygroups
     * 
     */
    public void setSecurityGroups(Set<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public AwsVpcConfiguration withSecurityGroups(Set<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets
     * 
     */
    public Set<CharSequence> getSubnets() {
        return subnets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html#cfn-ecs-service-awsvpcconfiguration-subnets
     * 
     */
    public void setSubnets(Set<CharSequence> subnets) {
        this.subnets = subnets;
    }

    public AwsVpcConfiguration withSubnets(Set<CharSequence> subnets) {
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
        if ((other instanceof AwsVpcConfiguration) == false) {
            return false;
        }
        AwsVpcConfiguration rhs = ((AwsVpcConfiguration) other);
        return new EqualsBuilder().append(securityGroups, rhs.securityGroups).append(subnets, rhs.subnets).append(assignPublicIp, rhs.assignPublicIp).isEquals();
    }

}
