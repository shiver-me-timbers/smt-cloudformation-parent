
package aws.codedeploy;

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
 * OnPremisesTagSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OnPremisesTagSetList"
})
public class OnPremisesTagSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist
     * 
     */
    @JsonProperty("OnPremisesTagSetList")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist")
    private Set<OnPremisesTagSetListObject> onPremisesTagSetList = new LinkedHashSet<OnPremisesTagSetListObject>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist
     * 
     */
    public Set<OnPremisesTagSetListObject> getOnPremisesTagSetList() {
        return onPremisesTagSetList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html#cfn-codedeploy-deploymentgroup-onpremisestagset-onpremisestagsetlist
     * 
     */
    public void setOnPremisesTagSetList(Set<OnPremisesTagSetListObject> onPremisesTagSetList) {
        this.onPremisesTagSetList = onPremisesTagSetList;
    }

    public OnPremisesTagSet withOnPremisesTagSetList(Set<OnPremisesTagSetListObject> onPremisesTagSetList) {
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
        if ((other instanceof OnPremisesTagSet) == false) {
            return false;
        }
        OnPremisesTagSet rhs = ((OnPremisesTagSet) other);
        return new EqualsBuilder().append(onPremisesTagSetList, rhs.onPremisesTagSetList).isEquals();
    }

}
