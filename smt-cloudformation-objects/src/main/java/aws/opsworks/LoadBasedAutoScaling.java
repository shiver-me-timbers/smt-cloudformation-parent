
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LoadBasedAutoScaling
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DownScaling",
    "Enable",
    "UpScaling"
})
public class LoadBasedAutoScaling {

    /**
     * AutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    @JsonProperty("DownScaling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html")
    private AutoScalingThresholds downScaling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable
     * 
     */
    @JsonProperty("Enable")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable")
    private Boolean enable;
    /**
     * AutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    @JsonProperty("UpScaling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html")
    private AutoScalingThresholds upScaling;

    /**
     * AutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    public AutoScalingThresholds getDownScaling() {
        return downScaling;
    }

    /**
     * AutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    public void setDownScaling(AutoScalingThresholds downScaling) {
        this.downScaling = downScaling;
    }

    public LoadBasedAutoScaling withDownScaling(AutoScalingThresholds downScaling) {
        this.downScaling = downScaling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable
     * 
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable
     * 
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public LoadBasedAutoScaling withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * AutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    public AutoScalingThresholds getUpScaling() {
        return upScaling;
    }

    /**
     * AutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    public void setUpScaling(AutoScalingThresholds upScaling) {
        this.upScaling = upScaling;
    }

    public LoadBasedAutoScaling withUpScaling(AutoScalingThresholds upScaling) {
        this.upScaling = upScaling;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("downScaling", downScaling).append("enable", enable).append("upScaling", upScaling).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(downScaling).append(upScaling).append(enable).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadBasedAutoScaling) == false) {
            return false;
        }
        LoadBasedAutoScaling rhs = ((LoadBasedAutoScaling) other);
        return new EqualsBuilder().append(downScaling, rhs.downScaling).append(upScaling, rhs.upScaling).append(enable, rhs.enable).isEquals();
    }

}
