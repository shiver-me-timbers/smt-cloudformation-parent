
package aws.autoscalingplans;

import java.util.ArrayList;
import java.util.List;
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
 * ScalingInstruction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DisableDynamicScaling",
    "ServiceNamespace",
    "PredictiveScalingMaxCapacityBehavior",
    "ScalableDimension",
    "ScalingPolicyUpdateBehavior",
    "MinCapacity",
    "TargetTrackingConfigurations",
    "PredictiveScalingMaxCapacityBuffer",
    "CustomizedLoadMetricSpecification",
    "PredefinedLoadMetricSpecification",
    "ResourceId",
    "ScheduledActionBufferTime",
    "MaxCapacity",
    "PredictiveScalingMode"
})
public class ScalingInstruction implements Property<ScalingInstruction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-disabledynamicscaling
     * 
     */
    @JsonProperty("DisableDynamicScaling")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-disabledynamicscaling")
    private Boolean disableDynamicScaling;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace
     * 
     */
    @JsonProperty("ServiceNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace")
    private CharSequence serviceNamespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybehavior
     * 
     */
    @JsonProperty("PredictiveScalingMaxCapacityBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybehavior")
    private CharSequence predictiveScalingMaxCapacityBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension
     * 
     */
    @JsonProperty("ScalableDimension")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension")
    private CharSequence scalableDimension;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalingpolicyupdatebehavior
     * 
     */
    @JsonProperty("ScalingPolicyUpdateBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalingpolicyupdatebehavior")
    private CharSequence scalingPolicyUpdateBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity
     * 
     */
    @JsonProperty("MinCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity")
    private Integer minCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations
     * 
     */
    @JsonProperty("TargetTrackingConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations")
    private List<Property<TargetTrackingConfiguration>> targetTrackingConfigurations = new ArrayList<Property<TargetTrackingConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybuffer
     * 
     */
    @JsonProperty("PredictiveScalingMaxCapacityBuffer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybuffer")
    private Integer predictiveScalingMaxCapacityBuffer;
    /**
     * CustomizedLoadMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html
     * 
     */
    @JsonProperty("CustomizedLoadMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html")
    private Property<CustomizedLoadMetricSpecification> customizedLoadMetricSpecification;
    /**
     * PredefinedLoadMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html
     * 
     */
    @JsonProperty("PredefinedLoadMetricSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html")
    private Property<PredefinedLoadMetricSpecification> predefinedLoadMetricSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid")
    private CharSequence resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scheduledactionbuffertime
     * 
     */
    @JsonProperty("ScheduledActionBufferTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scheduledactionbuffertime")
    private Integer scheduledActionBufferTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity
     * 
     */
    @JsonProperty("MaxCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity")
    private Integer maxCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmode
     * 
     */
    @JsonProperty("PredictiveScalingMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmode")
    private CharSequence predictiveScalingMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-disabledynamicscaling
     * 
     */
    @JsonIgnore
    public Boolean getDisableDynamicScaling() {
        return disableDynamicScaling;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-disabledynamicscaling
     * 
     */
    @JsonIgnore
    public void setDisableDynamicScaling(Boolean disableDynamicScaling) {
        this.disableDynamicScaling = disableDynamicScaling;
    }

    public ScalingInstruction withDisableDynamicScaling(Boolean disableDynamicScaling) {
        this.disableDynamicScaling = disableDynamicScaling;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace
     * 
     */
    @JsonIgnore
    public CharSequence getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace
     * 
     */
    @JsonIgnore
    public void setServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    public ScalingInstruction withServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybehavior
     * 
     */
    @JsonIgnore
    public CharSequence getPredictiveScalingMaxCapacityBehavior() {
        return predictiveScalingMaxCapacityBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybehavior
     * 
     */
    @JsonIgnore
    public void setPredictiveScalingMaxCapacityBehavior(CharSequence predictiveScalingMaxCapacityBehavior) {
        this.predictiveScalingMaxCapacityBehavior = predictiveScalingMaxCapacityBehavior;
    }

    public ScalingInstruction withPredictiveScalingMaxCapacityBehavior(CharSequence predictiveScalingMaxCapacityBehavior) {
        this.predictiveScalingMaxCapacityBehavior = predictiveScalingMaxCapacityBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension
     * 
     */
    @JsonIgnore
    public CharSequence getScalableDimension() {
        return scalableDimension;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension
     * 
     */
    @JsonIgnore
    public void setScalableDimension(CharSequence scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    public ScalingInstruction withScalableDimension(CharSequence scalableDimension) {
        this.scalableDimension = scalableDimension;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalingpolicyupdatebehavior
     * 
     */
    @JsonIgnore
    public CharSequence getScalingPolicyUpdateBehavior() {
        return scalingPolicyUpdateBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalingpolicyupdatebehavior
     * 
     */
    @JsonIgnore
    public void setScalingPolicyUpdateBehavior(CharSequence scalingPolicyUpdateBehavior) {
        this.scalingPolicyUpdateBehavior = scalingPolicyUpdateBehavior;
    }

    public ScalingInstruction withScalingPolicyUpdateBehavior(CharSequence scalingPolicyUpdateBehavior) {
        this.scalingPolicyUpdateBehavior = scalingPolicyUpdateBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity
     * 
     */
    @JsonIgnore
    public Integer getMinCapacity() {
        return minCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity
     * 
     */
    @JsonIgnore
    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    public ScalingInstruction withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations
     * 
     */
    @JsonIgnore
    public List<Property<TargetTrackingConfiguration>> getTargetTrackingConfigurations() {
        return targetTrackingConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations
     * 
     */
    @JsonIgnore
    public void setTargetTrackingConfigurations(List<Property<TargetTrackingConfiguration>> targetTrackingConfigurations) {
        this.targetTrackingConfigurations = targetTrackingConfigurations;
    }

    public ScalingInstruction withTargetTrackingConfigurations(List<Property<TargetTrackingConfiguration>> targetTrackingConfigurations) {
        this.targetTrackingConfigurations = targetTrackingConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybuffer
     * 
     */
    @JsonIgnore
    public Integer getPredictiveScalingMaxCapacityBuffer() {
        return predictiveScalingMaxCapacityBuffer;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmaxcapacitybuffer
     * 
     */
    @JsonIgnore
    public void setPredictiveScalingMaxCapacityBuffer(Integer predictiveScalingMaxCapacityBuffer) {
        this.predictiveScalingMaxCapacityBuffer = predictiveScalingMaxCapacityBuffer;
    }

    public ScalingInstruction withPredictiveScalingMaxCapacityBuffer(Integer predictiveScalingMaxCapacityBuffer) {
        this.predictiveScalingMaxCapacityBuffer = predictiveScalingMaxCapacityBuffer;
        return this;
    }

    /**
     * CustomizedLoadMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html
     * 
     */
    @JsonIgnore
    public Property<CustomizedLoadMetricSpecification> getCustomizedLoadMetricSpecification() {
        return customizedLoadMetricSpecification;
    }

    /**
     * CustomizedLoadMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html
     * 
     */
    @JsonIgnore
    public void setCustomizedLoadMetricSpecification(Property<CustomizedLoadMetricSpecification> customizedLoadMetricSpecification) {
        this.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
    }

    public ScalingInstruction withCustomizedLoadMetricSpecification(Property<CustomizedLoadMetricSpecification> customizedLoadMetricSpecification) {
        this.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
        return this;
    }

    /**
     * PredefinedLoadMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html
     * 
     */
    @JsonIgnore
    public Property<PredefinedLoadMetricSpecification> getPredefinedLoadMetricSpecification() {
        return predefinedLoadMetricSpecification;
    }

    /**
     * PredefinedLoadMetricSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-predefinedloadmetricspecification.html
     * 
     */
    @JsonIgnore
    public void setPredefinedLoadMetricSpecification(Property<PredefinedLoadMetricSpecification> predefinedLoadMetricSpecification) {
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
    }

    public ScalingInstruction withPredefinedLoadMetricSpecification(Property<PredefinedLoadMetricSpecification> predefinedLoadMetricSpecification) {
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid
     * 
     */
    @JsonIgnore
    public CharSequence getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid
     * 
     */
    @JsonIgnore
    public void setResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
    }

    public ScalingInstruction withResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scheduledactionbuffertime
     * 
     */
    @JsonIgnore
    public Integer getScheduledActionBufferTime() {
        return scheduledActionBufferTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scheduledactionbuffertime
     * 
     */
    @JsonIgnore
    public void setScheduledActionBufferTime(Integer scheduledActionBufferTime) {
        this.scheduledActionBufferTime = scheduledActionBufferTime;
    }

    public ScalingInstruction withScheduledActionBufferTime(Integer scheduledActionBufferTime) {
        this.scheduledActionBufferTime = scheduledActionBufferTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity
     * 
     */
    @JsonIgnore
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity
     * 
     */
    @JsonIgnore
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ScalingInstruction withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmode
     * 
     */
    @JsonIgnore
    public CharSequence getPredictiveScalingMode() {
        return predictiveScalingMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-predictivescalingmode
     * 
     */
    @JsonIgnore
    public void setPredictiveScalingMode(CharSequence predictiveScalingMode) {
        this.predictiveScalingMode = predictiveScalingMode;
    }

    public ScalingInstruction withPredictiveScalingMode(CharSequence predictiveScalingMode) {
        this.predictiveScalingMode = predictiveScalingMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("disableDynamicScaling", disableDynamicScaling).append("serviceNamespace", serviceNamespace).append("predictiveScalingMaxCapacityBehavior", predictiveScalingMaxCapacityBehavior).append("scalableDimension", scalableDimension).append("scalingPolicyUpdateBehavior", scalingPolicyUpdateBehavior).append("minCapacity", minCapacity).append("targetTrackingConfigurations", targetTrackingConfigurations).append("predictiveScalingMaxCapacityBuffer", predictiveScalingMaxCapacityBuffer).append("customizedLoadMetricSpecification", customizedLoadMetricSpecification).append("predefinedLoadMetricSpecification", predefinedLoadMetricSpecification).append("resourceId", resourceId).append("scheduledActionBufferTime", scheduledActionBufferTime).append("maxCapacity", maxCapacity).append("predictiveScalingMode", predictiveScalingMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(disableDynamicScaling).append(predictiveScalingMaxCapacityBehavior).append(resourceId).append(scheduledActionBufferTime).append(scalableDimension).append(targetTrackingConfigurations).append(predictiveScalingMaxCapacityBuffer).append(maxCapacity).append(predefinedLoadMetricSpecification).append(scalingPolicyUpdateBehavior).append(customizedLoadMetricSpecification).append(predictiveScalingMode).append(minCapacity).append(serviceNamespace).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingInstruction) == false) {
            return false;
        }
        ScalingInstruction rhs = ((ScalingInstruction) other);
        return new EqualsBuilder().append(disableDynamicScaling, rhs.disableDynamicScaling).append(predictiveScalingMaxCapacityBehavior, rhs.predictiveScalingMaxCapacityBehavior).append(resourceId, rhs.resourceId).append(scheduledActionBufferTime, rhs.scheduledActionBufferTime).append(scalableDimension, rhs.scalableDimension).append(targetTrackingConfigurations, rhs.targetTrackingConfigurations).append(predictiveScalingMaxCapacityBuffer, rhs.predictiveScalingMaxCapacityBuffer).append(maxCapacity, rhs.maxCapacity).append(predefinedLoadMetricSpecification, rhs.predefinedLoadMetricSpecification).append(scalingPolicyUpdateBehavior, rhs.scalingPolicyUpdateBehavior).append(customizedLoadMetricSpecification, rhs.customizedLoadMetricSpecification).append(predictiveScalingMode, rhs.predictiveScalingMode).append(minCapacity, rhs.minCapacity).append(serviceNamespace, rhs.serviceNamespace).isEquals();
    }

}
