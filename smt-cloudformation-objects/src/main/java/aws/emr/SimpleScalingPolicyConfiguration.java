
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SimpleScalingPolicyConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AdjustmentType",
    "CoolDown",
    "ScalingAdjustment"
})
public class SimpleScalingPolicyConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-adjustmenttype
     * 
     */
    @JsonProperty("AdjustmentType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-adjustmenttype")
    private CharSequence adjustmentType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-cooldown
     * 
     */
    @JsonProperty("CoolDown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-cooldown")
    private Integer coolDown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-scalingadjustment
     * 
     */
    @JsonProperty("ScalingAdjustment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-scalingadjustment")
    private Integer scalingAdjustment;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-adjustmenttype
     * 
     */
    public CharSequence getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-adjustmenttype
     * 
     */
    public void setAdjustmentType(CharSequence adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public SimpleScalingPolicyConfiguration withAdjustmentType(CharSequence adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-cooldown
     * 
     */
    public Integer getCoolDown() {
        return coolDown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-cooldown
     * 
     */
    public void setCoolDown(Integer coolDown) {
        this.coolDown = coolDown;
    }

    public SimpleScalingPolicyConfiguration withCoolDown(Integer coolDown) {
        this.coolDown = coolDown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-scalingadjustment
     * 
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html#cfn-elasticmapreduce-cluster-simplescalingpolicyconfiguration-scalingadjustment
     * 
     */
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    public SimpleScalingPolicyConfiguration withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("adjustmentType", adjustmentType).append("coolDown", coolDown).append("scalingAdjustment", scalingAdjustment).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scalingAdjustment).append(adjustmentType).append(coolDown).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleScalingPolicyConfiguration) == false) {
            return false;
        }
        SimpleScalingPolicyConfiguration rhs = ((SimpleScalingPolicyConfiguration) other);
        return new EqualsBuilder().append(scalingAdjustment, rhs.scalingAdjustment).append(adjustmentType, rhs.adjustmentType).append(coolDown, rhs.coolDown).isEquals();
    }

}
