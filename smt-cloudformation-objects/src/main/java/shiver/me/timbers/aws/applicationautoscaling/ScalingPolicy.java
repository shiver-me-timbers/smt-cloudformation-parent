
package shiver.me.timbers.aws.applicationautoscaling;

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
 * ScalingPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
     * ScalingPolicyStepScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("StepScalingPolicyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html")
    private Property<ScalingPolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration;
    /**
     * ScalingPolicyTargetTrackingScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("TargetTrackingScalingPolicyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html")
    private Property<ScalingPolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname
     * 
     */
    @JsonIgnore
    public CharSequence getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getPolicyType() {
        return policyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getScalableDimension() {
        return scalableDimension;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getScalingTargetId() {
        return scalingTargetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace
     * 
     */
    @JsonIgnore
    public void setServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    public ScalingPolicy withServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * ScalingPolicyStepScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPolicyStepScalingPolicyConfiguration> getStepScalingPolicyConfiguration() {
        return stepScalingPolicyConfiguration;
    }

    /**
     * ScalingPolicyStepScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
     * 
     */
    @JsonIgnore
    public void setStepScalingPolicyConfiguration(Property<ScalingPolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration) {
        this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
    }

    public ScalingPolicy withStepScalingPolicyConfiguration(Property<ScalingPolicyStepScalingPolicyConfiguration> stepScalingPolicyConfiguration) {
        this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
        return this;
    }

    /**
     * ScalingPolicyTargetTrackingScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ScalingPolicyTargetTrackingScalingPolicyConfiguration> getTargetTrackingScalingPolicyConfiguration() {
        return targetTrackingScalingPolicyConfiguration;
    }

    /**
     * ScalingPolicyTargetTrackingScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
     * 
     */
    @JsonIgnore
    public void setTargetTrackingScalingPolicyConfiguration(Property<ScalingPolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration) {
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
    }

    public ScalingPolicy withTargetTrackingScalingPolicyConfiguration(Property<ScalingPolicyTargetTrackingScalingPolicyConfiguration> targetTrackingScalingPolicyConfiguration) {
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
