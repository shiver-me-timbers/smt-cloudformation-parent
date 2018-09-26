
package aws.applicationautoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScalableTargetAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MaxCapacity",
    "MinCapacity"
})
public class ScalableTargetAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity
     * 
     */
    @JsonProperty("MaxCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity")
    private Integer maxCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity
     * 
     */
    @JsonProperty("MinCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity")
    private Integer minCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity
     * 
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity
     * 
     */
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ScalableTargetAction withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity
     * 
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity
     * 
     */
    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    public ScalableTargetAction withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxCapacity", maxCapacity).append("minCapacity", minCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxCapacity).append(minCapacity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalableTargetAction) == false) {
            return false;
        }
        ScalableTargetAction rhs = ((ScalableTargetAction) other);
        return new EqualsBuilder().append(maxCapacity, rhs.maxCapacity).append(minCapacity, rhs.minCapacity).isEquals();
    }

}
