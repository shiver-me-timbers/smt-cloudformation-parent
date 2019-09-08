
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
 * DeploymentGroupOnPremisesTagSetListObject
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OnPremisesTagGroup"
})
public class DeploymentGroupOnPremisesTagSetListObject implements Property<DeploymentGroupOnPremisesTagSetListObject>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup
     * 
     */
    @JsonProperty("OnPremisesTagGroup")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup")
    private Set<Property<DeploymentGroupTagFilter>> onPremisesTagGroup = new LinkedHashSet<Property<DeploymentGroupTagFilter>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentGroupTagFilter>> getOnPremisesTagGroup() {
        return onPremisesTagGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup
     * 
     */
    @JsonIgnore
    public void setOnPremisesTagGroup(Set<Property<DeploymentGroupTagFilter>> onPremisesTagGroup) {
        this.onPremisesTagGroup = onPremisesTagGroup;
    }

    public DeploymentGroupOnPremisesTagSetListObject withOnPremisesTagGroup(Set<Property<DeploymentGroupTagFilter>> onPremisesTagGroup) {
        this.onPremisesTagGroup = onPremisesTagGroup;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("onPremisesTagGroup", onPremisesTagGroup).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onPremisesTagGroup).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentGroupOnPremisesTagSetListObject) == false) {
            return false;
        }
        DeploymentGroupOnPremisesTagSetListObject rhs = ((DeploymentGroupOnPremisesTagSetListObject) other);
        return new EqualsBuilder().append(onPremisesTagGroup, rhs.onPremisesTagGroup).isEquals();
    }

}
