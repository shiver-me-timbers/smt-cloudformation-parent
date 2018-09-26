
package aws.applicationautoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScalingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PolicyName",
    "PolicyType",
    "ResourceId",
    "ScalableDimension",
    "ScalingTargetId",
    "ServiceNamespace",
    "StepScalingPolicyConfiguration",
    "TargetTrackingScalingPolicyConfiguration"
})
public class ScalingPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname")
    private CharSequence policyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype")
    private CharSequence policyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid")
    private CharSequence resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension
     * 
     */
    @JsonProperty("ScalableDimension")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension")
    private CharSequence scalableDimension;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid
     * 
     */
    @JsonProperty("ScalingTargetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid")
    private CharSequence scalingTargetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace
     * 
     */
    @JsonProperty("ServiceNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace")
    private CharSequence serviceNamespace;
    /**
     * StepScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("StepScalingPolicyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html")
    private StepScalingPolicyConfiguration stepScalingPolicyConfiguration;
    /**
     * TargetTrackingScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("TargetTrackingScalingPolicyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html")
    private TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname
     * 
     */
    public CharSequence getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname
     * 
     */
    public void setPolicyName(CharSequence policyName) {
        this.policyName = policyName;
    }

    public ScalingPolicy withPolicyName(CharSequence policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype
     * 
     */
    public CharSequence getPolicyType() {
        return policyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype
     * 
     */
    public void setPolicyType(CharSequence policyType) {
        this.policyType = policyType;
    }

    public ScalingPolicy withPolicyType(CharSequence policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid
     * 
     */
    public CharSequence getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid
     * 
     */
    public void setResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
    }

    public ScalingPolicy withResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension
     * 
     */
    public CharSequence getScalableDimension() {
        return scalableDimension;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension
     * 
     */
    public void setScalableDimension(CharSequence scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    public ScalingPolicy withScalableDimension(CharSequence scalableDimension) {
        this.scalableDimension = scalableDimension;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid
     * 
     */
    public CharSequence getScalingTargetId() {
        return scalingTargetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid
     * 
     */
    public void setScalingTargetId(CharSequence scalingTargetId) {
        this.scalingTargetId = scalingTargetId;
    }

    public ScalingPolicy withScalingTargetId(CharSequence scalingTargetId) {
        this.scalingTargetId = scalingTargetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace
     * 
     */
    public CharSequence getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace
     * 
     */
    public void setServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    public ScalingPolicy withServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * StepScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
     * 
     */
    public StepScalingPolicyConfiguration getStepScalingPolicyConfiguration() {
        return stepScalingPolicyConfiguration;
    }

    /**
     * StepScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
     * 
     */
    public void setStepScalingPolicyConfiguration(StepScalingPolicyConfiguration stepScalingPolicyConfiguration) {
        this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
    }

    public ScalingPolicy withStepScalingPolicyConfiguration(StepScalingPolicyConfiguration stepScalingPolicyConfiguration) {
        this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
        return this;
    }

    /**
     * TargetTrackingScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
     * 
     */
    public TargetTrackingScalingPolicyConfiguration getTargetTrackingScalingPolicyConfiguration() {
        return targetTrackingScalingPolicyConfiguration;
    }

    /**
     * TargetTrackingScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
     * 
     */
    public void setTargetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
    }

    public ScalingPolicy withTargetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policyName", policyName).append("policyType", policyType).append("resourceId", resourceId).append("scalableDimension", scalableDimension).append("scalingTargetId", scalingTargetId).append("serviceNamespace", serviceNamespace).append("stepScalingPolicyConfiguration", stepScalingPolicyConfiguration).append("targetTrackingScalingPolicyConfiguration", targetTrackingScalingPolicyConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stepScalingPolicyConfiguration).append(resourceId).append(targetTrackingScalingPolicyConfiguration).append(scalableDimension).append(policyName).append(policyType).append(scalingTargetId).append(serviceNamespace).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingPolicy) == false) {
            return false;
        }
        ScalingPolicy rhs = ((ScalingPolicy) other);
        return new EqualsBuilder().append(stepScalingPolicyConfiguration, rhs.stepScalingPolicyConfiguration).append(resourceId, rhs.resourceId).append(targetTrackingScalingPolicyConfiguration, rhs.targetTrackingScalingPolicyConfiguration).append(scalableDimension, rhs.scalableDimension).append(policyName, rhs.policyName).append(policyType, rhs.policyType).append(scalingTargetId, rhs.scalingTargetId).append(serviceNamespace, rhs.serviceNamespace).isEquals();
    }

}
