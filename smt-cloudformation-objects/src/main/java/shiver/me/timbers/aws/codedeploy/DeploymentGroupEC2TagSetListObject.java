
package shiver.me.timbers.aws.codedeploy;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * DeploymentGroupEC2TagSetListObject
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Ec2TagGroup"
})
public class DeploymentGroupEC2TagSetListObject implements Property<DeploymentGroupEC2TagSetListObject>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html#cfn-codedeploy-deploymentgroup-ec2tagsetlistobject-ec2taggroup
     * 
     */
    @JsonProperty("Ec2TagGroup")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html#cfn-codedeploy-deploymentgroup-ec2tagsetlistobject-ec2taggroup")
    private Set<Property<DeploymentGroupEC2TagFilter>> ec2TagGroup = new LinkedHashSet<Property<DeploymentGroupEC2TagFilter>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html#cfn-codedeploy-deploymentgroup-ec2tagsetlistobject-ec2taggroup
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentGroupEC2TagFilter>> getEc2TagGroup() {
        return ec2TagGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagsetlistobject.html#cfn-codedeploy-deploymentgroup-ec2tagsetlistobject-ec2taggroup
     * 
     */
    @JsonIgnore
    public void setEc2TagGroup(Set<Property<DeploymentGroupEC2TagFilter>> ec2TagGroup) {
        this.ec2TagGroup = ec2TagGroup;
    }

    public DeploymentGroupEC2TagSetListObject withEc2TagGroup(Set<Property<DeploymentGroupEC2TagFilter>> ec2TagGroup) {
        this.ec2TagGroup = ec2TagGroup;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ec2TagGroup", ec2TagGroup).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ec2TagGroup).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentGroupEC2TagSetListObject) == false) {
            return false;
        }
        DeploymentGroupEC2TagSetListObject rhs = ((DeploymentGroupEC2TagSetListObject) other);
        return new EqualsBuilder().append(ec2TagGroup, rhs.ec2TagGroup).isEquals();
    }

}
