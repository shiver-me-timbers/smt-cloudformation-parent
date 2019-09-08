
package shiver.me.timbers.aws.dax;

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
 * ClusterSSESpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SSEEnabled"
})
public class ClusterSSESpecification implements Property<ClusterSSESpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html#cfn-dax-cluster-ssespecification-sseenabled
     * 
     */
    @JsonProperty("SSEEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html#cfn-dax-cluster-ssespecification-sseenabled")
    private CharSequence sSEEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html#cfn-dax-cluster-ssespecification-sseenabled
     * 
     */
    @JsonIgnore
    public CharSequence getSSEEnabled() {
        return sSEEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html#cfn-dax-cluster-ssespecification-sseenabled
     * 
     */
    @JsonIgnore
    public void setSSEEnabled(CharSequence sSEEnabled) {
        this.sSEEnabled = sSEEnabled;
    }

    public ClusterSSESpecification withSSEEnabled(CharSequence sSEEnabled) {
        this.sSEEnabled = sSEEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sSEEnabled", sSEEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sSEEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterSSESpecification) == false) {
            return false;
        }
        ClusterSSESpecification rhs = ((ClusterSSESpecification) other);
        return new EqualsBuilder().append(sSEEnabled, rhs.sSEEnabled).isEquals();
    }

}
