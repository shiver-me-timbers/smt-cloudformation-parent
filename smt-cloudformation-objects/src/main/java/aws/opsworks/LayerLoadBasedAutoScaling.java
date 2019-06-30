
package aws.opsworks;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LayerLoadBasedAutoScaling
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DownScaling",
    "Enable",
    "UpScaling"
})
public class LayerLoadBasedAutoScaling implements Property<LayerLoadBasedAutoScaling>
{

    /**
     * LayerAutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    @JsonProperty("DownScaling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html")
    private Property<aws.opsworks.LayerAutoScalingThresholds> downScaling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable
     * 
     */
    @JsonProperty("Enable")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable")
    private CharSequence enable;
    /**
     * LayerAutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    @JsonProperty("UpScaling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html")
    private Property<aws.opsworks.LayerAutoScalingThresholds> upScaling;

    /**
     * LayerAutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    @JsonIgnore
    public Property<aws.opsworks.LayerAutoScalingThresholds> getDownScaling() {
        return downScaling;
    }

    /**
     * LayerAutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    @JsonIgnore
    public void setDownScaling(Property<aws.opsworks.LayerAutoScalingThresholds> downScaling) {
        this.downScaling = downScaling;
    }

    public LayerLoadBasedAutoScaling withDownScaling(Property<aws.opsworks.LayerAutoScalingThresholds> downScaling) {
        this.downScaling = downScaling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable
     * 
     */
    @JsonIgnore
    public CharSequence getEnable() {
        return enable;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html#cfn-opsworks-layer-loadbasedautoscaling-enable
     * 
     */
    @JsonIgnore
    public void setEnable(CharSequence enable) {
        this.enable = enable;
    }

    public LayerLoadBasedAutoScaling withEnable(CharSequence enable) {
        this.enable = enable;
        return this;
    }

    /**
     * LayerAutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    @JsonIgnore
    public Property<aws.opsworks.LayerAutoScalingThresholds> getUpScaling() {
        return upScaling;
    }

    /**
     * LayerAutoScalingThresholds
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
     * 
     */
    @JsonIgnore
    public void setUpScaling(Property<aws.opsworks.LayerAutoScalingThresholds> upScaling) {
        this.upScaling = upScaling;
    }

    public LayerLoadBasedAutoScaling withUpScaling(Property<aws.opsworks.LayerAutoScalingThresholds> upScaling) {
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
        if ((other instanceof LayerLoadBasedAutoScaling) == false) {
            return false;
        }
        LayerLoadBasedAutoScaling rhs = ((LayerLoadBasedAutoScaling) other);
        return new EqualsBuilder().append(downScaling, rhs.downScaling).append(upScaling, rhs.upScaling).append(enable, rhs.enable).isEquals();
    }

}
