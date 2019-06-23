
package aws.codedeploy;

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
 * DeploymentGroupOnPremisesTagSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OnPremisesTagSetList"
})
public class DeploymentGroupOnPremisesTagSet implements Property<DeploymentGroupOnPremisesTagSet>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist
     * 
     */
    @JsonProperty("OnPremisesTagSetList")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist")
    private Set<Property<DeploymentGroupOnPremisesTagSetListObject>> onPremisesTagSetList = new LinkedHashSet<Property<DeploymentGroupOnPremisesTagSetListObject>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentGroupOnPremisesTagSetListObject>> getOnPremisesTagSetList() {
        return onPremisesTagSetList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist
     * 
     */
    @JsonIgnore
    public void setOnPremisesTagSetList(Set<Property<DeploymentGroupOnPremisesTagSetListObject>> onPremisesTagSetList) {
        this.onPremisesTagSetList = onPremisesTagSetList;
    }

    public DeploymentGroupOnPremisesTagSet withOnPremisesTagSetList(Set<Property<DeploymentGroupOnPremisesTagSetListObject>> onPremisesTagSetList) {
        this.onPremisesTagSetList = onPremisesTagSetList;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("onPremisesTagSetList", onPremisesTagSetList).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onPremisesTagSetList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentGroupOnPremisesTagSet) == false) {
            return false;
        }
        DeploymentGroupOnPremisesTagSet rhs = ((DeploymentGroupOnPremisesTagSet) other);
        return new EqualsBuilder().append(onPremisesTagSetList, rhs.onPremisesTagSetList).isEquals();
    }

}
