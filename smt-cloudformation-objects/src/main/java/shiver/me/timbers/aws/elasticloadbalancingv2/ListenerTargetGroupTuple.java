
package shiver.me.timbers.aws.elasticloadbalancingv2;

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
 * ListenerTargetGroupTuple
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetGroupArn",
    "Weight"
})
public class ListenerTargetGroupTuple implements Property<ListenerTargetGroupTuple>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-targetgrouparn
     * 
     */
    @JsonProperty("TargetGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-targetgrouparn")
    private CharSequence targetGroupArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-weight
     * 
     */
    @JsonProperty("Weight")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-weight")
    private Number weight;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-targetgrouparn
     * 
     */
    @JsonIgnore
    public CharSequence getTargetGroupArn() {
        return targetGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-targetgrouparn
     * 
     */
    @JsonIgnore
    public void setTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    public ListenerTargetGroupTuple withTargetGroupArn(CharSequence targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-weight
     * 
     */
    @JsonIgnore
    public Number getWeight() {
        return weight;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-targetgrouptuple.html#cfn-elasticloadbalancingv2-listener-targetgrouptuple-weight
     * 
     */
    @JsonIgnore
    public void setWeight(Number weight) {
        this.weight = weight;
    }

    public ListenerTargetGroupTuple withWeight(Number weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetGroupArn", targetGroupArn).append("weight", weight).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(weight).append(targetGroupArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListenerTargetGroupTuple) == false) {
            return false;
        }
        ListenerTargetGroupTuple rhs = ((ListenerTargetGroupTuple) other);
        return new EqualsBuilder().append(weight, rhs.weight).append(targetGroupArn, rhs.targetGroupArn).isEquals();
    }

}
