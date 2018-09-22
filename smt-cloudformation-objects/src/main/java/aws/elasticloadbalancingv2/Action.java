
package aws.elasticloadbalancingv2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Action
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TargetGroupArn",
    "Type"
})
public class Action {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn
     * 
     */
    @JsonProperty("TargetGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn")
    private String targetGroupArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type")
    private String type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn
     * 
     */
    @JsonProperty("TargetGroupArn")
    public String getTargetGroupArn() {
        return targetGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-targetgrouparn
     * 
     */
    @JsonProperty("TargetGroupArn")
    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    public Action withTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type
     * 
     */
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-defaultactions.html#cfn-elasticloadbalancingv2-listener-defaultactions-type
     * 
     */
    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    public Action withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetGroupArn", targetGroupArn).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(targetGroupArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Action) == false) {
            return false;
        }
        Action rhs = ((Action) other);
        return new EqualsBuilder().append(type, rhs.type).append(targetGroupArn, rhs.targetGroupArn).isEquals();
    }

}
