
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
    private String policyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype")
    private String policyType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid")
    private String resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension
     * 
     */
    @JsonProperty("ScalableDimension")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension")
    private String scalableDimension;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid
     * 
     */
    @JsonProperty("ScalingTargetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid")
    private String scalingTargetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace
     * 
     */
    @JsonProperty("ServiceNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace")
    private String serviceNamespace;
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
    @JsonProperty("PolicyName")
    public String getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ScalingPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    public String getPolicyType() {
        return policyType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype
     * 
     */
    @JsonProperty("PolicyType")
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public ScalingPolicy withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    public String getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ScalingPolicy withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension
     * 
     */
    @JsonProperty("ScalableDimension")
    public String getScalableDimension() {
        return scalableDimension;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension
     * 
     */
    @JsonProperty("ScalableDimension")
    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    public ScalingPolicy withScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid
     * 
     */
    @JsonProperty("ScalingTargetId")
    public String getScalingTargetId() {
        return scalingTargetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid
     * 
     */
    @JsonProperty("ScalingTargetId")
    public void setScalingTargetId(String scalingTargetId) {
        this.scalingTargetId = scalingTargetId;
    }

    public ScalingPolicy withScalingTargetId(String scalingTargetId) {
        this.scalingTargetId = scalingTargetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace
     * 
     */
    @JsonProperty("ServiceNamespace")
    public String getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace
     * 
     */
    @JsonProperty("ServiceNamespace")
    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    public ScalingPolicy withServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * StepScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("StepScalingPolicyConfiguration")
    public StepScalingPolicyConfiguration getStepScalingPolicyConfiguration() {
        return stepScalingPolicyConfiguration;
    }

    /**
     * StepScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("StepScalingPolicyConfiguration")
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
    @JsonProperty("TargetTrackingScalingPolicyConfiguration")
    public TargetTrackingScalingPolicyConfiguration getTargetTrackingScalingPolicyConfiguration() {
        return targetTrackingScalingPolicyConfiguration;
    }

    /**
     * TargetTrackingScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("TargetTrackingScalingPolicyConfiguration")
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
