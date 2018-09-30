
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
 * OnPremisesTagSetListObject
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OnPremisesTagGroup"
})
public class OnPremisesTagSetListObject {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup
     * 
     */
    @JsonProperty("OnPremisesTagGroup")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup")
    private Set<TagFilter> onPremisesTagGroup = new LinkedHashSet<TagFilter>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup
     * 
     */
    public Set<TagFilter> getOnPremisesTagGroup() {
        return onPremisesTagGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagsetlistobject.html#cfn-codedeploy-deploymentgroup-onpremisestagsetlistobject-onpremisestaggroup
     * 
     */
    public void setOnPremisesTagGroup(Set<TagFilter> onPremisesTagGroup) {
        this.onPremisesTagGroup = onPremisesTagGroup;
    }

    public OnPremisesTagSetListObject withOnPremisesTagGroup(Set<TagFilter> onPremisesTagGroup) {
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
        if ((other instanceof OnPremisesTagSetListObject) == false) {
            return false;
        }
        OnPremisesTagSetListObject rhs = ((OnPremisesTagSetListObject) other);
        return new EqualsBuilder().append(onPremisesTagGroup, rhs.onPremisesTagGroup).isEquals();
    }

}
