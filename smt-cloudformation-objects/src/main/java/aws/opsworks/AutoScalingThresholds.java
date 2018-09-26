
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AutoScalingThresholds
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CpuThreshold",
    "IgnoreMetricsTime",
    "InstanceCount",
    "LoadThreshold",
    "MemoryThreshold",
    "ThresholdsWaitTime"
})
public class AutoScalingThresholds {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold
     * 
     */
    @JsonProperty("CpuThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold")
    private Double cpuThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime
     * 
     */
    @JsonProperty("IgnoreMetricsTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime")
    private Integer ignoreMetricsTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount
     * 
     */
    @JsonProperty("InstanceCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount")
    private Integer instanceCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold
     * 
     */
    @JsonProperty("LoadThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold")
    private Double loadThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold
     * 
     */
    @JsonProperty("MemoryThreshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold")
    private Double memoryThreshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime
     * 
     */
    @JsonProperty("ThresholdsWaitTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime")
    private Integer thresholdsWaitTime;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold
     * 
     */
    public Double getCpuThreshold() {
        return cpuThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-cputhreshold
     * 
     */
    public void setCpuThreshold(Double cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    public AutoScalingThresholds withCpuThreshold(Double cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime
     * 
     */
    public Integer getIgnoreMetricsTime() {
        return ignoreMetricsTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-ignoremetricstime
     * 
     */
    public void setIgnoreMetricsTime(Integer ignoreMetricsTime) {
        this.ignoreMetricsTime = ignoreMetricsTime;
    }

    public AutoScalingThresholds withIgnoreMetricsTime(Integer ignoreMetricsTime) {
        this.ignoreMetricsTime = ignoreMetricsTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount
     * 
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-instancecount
     * 
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public AutoScalingThresholds withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold
     * 
     */
    public Double getLoadThreshold() {
        return loadThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-loadthreshold
     * 
     */
    public void setLoadThreshold(Double loadThreshold) {
        this.loadThreshold = loadThreshold;
    }

    public AutoScalingThresholds withLoadThreshold(Double loadThreshold) {
        this.loadThreshold = loadThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold
     * 
     */
    public Double getMemoryThreshold() {
        return memoryThreshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-memorythreshold
     * 
     */
    public void setMemoryThreshold(Double memoryThreshold) {
        this.memoryThreshold = memoryThreshold;
    }

    public AutoScalingThresholds withMemoryThreshold(Double memoryThreshold) {
        this.memoryThreshold = memoryThreshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime
     * 
     */
    public Integer getThresholdsWaitTime() {
        return thresholdsWaitTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling-autoscalingthresholds.html#cfn-opsworks-layer-loadbasedautoscaling-autoscalingthresholds-thresholdwaittime
     * 
     */
    public void setThresholdsWaitTime(Integer thresholdsWaitTime) {
        this.thresholdsWaitTime = thresholdsWaitTime;
    }

    public AutoScalingThresholds withThresholdsWaitTime(Integer thresholdsWaitTime) {
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
        if ((other instanceof AutoScalingThresholds) == false) {
            return false;
        }
        AutoScalingThresholds rhs = ((AutoScalingThresholds) other);
        return new EqualsBuilder().append(thresholdsWaitTime, rhs.thresholdsWaitTime).append(memoryThreshold, rhs.memoryThreshold).append(cpuThreshold, rhs.cpuThreshold).append(instanceCount, rhs.instanceCount).append(loadThreshold, rhs.loadThreshold).append(ignoreMetricsTime, rhs.ignoreMetricsTime).isEquals();
    }

}
