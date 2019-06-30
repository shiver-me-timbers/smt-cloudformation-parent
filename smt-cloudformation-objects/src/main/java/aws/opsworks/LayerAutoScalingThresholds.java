
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
 * LayerAutoScalingThresholds
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CpuThreshold",
    "IgnoreMetricsTime",
    "InstanceCount",
    "LoadThreshold",
    "MemoryThreshold",
    "ThresholdsWaitTime"
})
public class LayerAutoScalingThresholds implements Property<LayerAutoScalingThresholds>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold
     * 
     */
    @JsonProperty("CpuThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold")
    private Number cpuThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime
     * 
     */
    @JsonProperty("IgnoreMetricsTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime")
    private Number ignoreMetricsTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount
     * 
     */
    @JsonProperty("InstanceCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount")
    private Number instanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold
     * 
     */
    @JsonProperty("LoadThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold")
    private Number loadThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold
     * 
     */
    @JsonProperty("MemoryThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold")
    private Number memoryThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime
     * 
     */
    @JsonProperty("ThresholdsWaitTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime")
    private Number thresholdsWaitTime;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold
     * 
     */
    @JsonIgnore
    public Number getCpuThreshold() {
        return cpuThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold
     * 
     */
    @JsonIgnore
    public void setCpuThreshold(Number cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    public LayerAutoScalingThresholds withCpuThreshold(Number cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime
     * 
     */
    @JsonIgnore
    public Number getIgnoreMetricsTime() {
        return ignoreMetricsTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime
     * 
     */
    @JsonIgnore
    public void setIgnoreMetricsTime(Number ignoreMetricsTime) {
        this.ignoreMetricsTime = ignoreMetricsTime;
    }

    public LayerAutoScalingThresholds withIgnoreMetricsTime(Number ignoreMetricsTime) {
        this.ignoreMetricsTime = ignoreMetricsTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount
     * 
     */
    @JsonIgnore
    public Number getInstanceCount() {
        return instanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount
     * 
     */
    @JsonIgnore
    public void setInstanceCount(Number instanceCount) {
        this.instanceCount = instanceCount;
    }

    public LayerAutoScalingThresholds withInstanceCount(Number instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold
     * 
     */
    @JsonIgnore
    public Number getLoadThreshold() {
        return loadThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold
     * 
     */
    @JsonIgnore
    public void setLoadThreshold(Number loadThreshold) {
        this.loadThreshold = loadThreshold;
    }

    public LayerAutoScalingThresholds withLoadThreshold(Number loadThreshold) {
        this.loadThreshold = loadThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold
     * 
     */
    @JsonIgnore
    public Number getMemoryThreshold() {
        return memoryThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold
     * 
     */
    @JsonIgnore
    public void setMemoryThreshold(Number memoryThreshold) {
        this.memoryThreshold = memoryThreshold;
    }

    public LayerAutoScalingThresholds withMemoryThreshold(Number memoryThreshold) {
        this.memoryThreshold = memoryThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime
     * 
     */
    @JsonIgnore
    public Number getThresholdsWaitTime() {
        return thresholdsWaitTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime
     * 
     */
    @JsonIgnore
    public void setThresholdsWaitTime(Number thresholdsWaitTime) {
        this.thresholdsWaitTime = thresholdsWaitTime;
    }

    public LayerAutoScalingThresholds withThresholdsWaitTime(Number thresholdsWaitTime) {
        this.thresholdsWaitTime = thresholdsWaitTime;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cpuThreshold", cpuThreshold).append("ignoreMetricsTime", ignoreMetricsTime).append("instanceCount", instanceCount).append("loadThreshold", loadThreshold).append("memoryThreshold", memoryThreshold).append("thresholdsWaitTime", thresholdsWaitTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(thresholdsWaitTime).append(memoryThreshold).append(cpuThreshold).append(instanceCount).append(loadThreshold).append(ignoreMetricsTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LayerAutoScalingThresholds) == false) {
            return false;
        }
        LayerAutoScalingThresholds rhs = ((LayerAutoScalingThresholds) other);
        return new EqualsBuilder().append(thresholdsWaitTime, rhs.thresholdsWaitTime).append(memoryThreshold, rhs.memoryThreshold).append(cpuThreshold, rhs.cpuThreshold).append(instanceCount, rhs.instanceCount).append(loadThreshold, rhs.loadThreshold).append(ignoreMetricsTime, rhs.ignoreMetricsTime).isEquals();
    }

}
