
package aws.autoscalingplans;

import java.util.ArrayList;
import java.util.List;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResourceId",
    "ServiceNamespace",
    "ScalableDimension",
    "MinCapacity",
    "TargetTrackingConfigurations",
    "MaxCapacity"
})
public class ScalingInstruction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid")
    private CharSequence resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace
     * 
     */
    @JsonProperty("ServiceNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace")
    private CharSequence serviceNamespace;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension
     * 
     */
    @JsonProperty("ScalableDimension")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension")
    private CharSequence scalableDimension;
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
    private List<TargetTrackingConfiguration> targetTrackingConfigurations = new ArrayList<TargetTrackingConfiguration>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity
     * 
     */
    @JsonProperty("MaxCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity")
    private Integer maxCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid
     * 
     */
    public CharSequence getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-resourceid
     * 
     */
    public void setResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
    }

    public ScalingInstruction withResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace
     * 
     */
    public CharSequence getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-servicenamespace
     * 
     */
    public void setServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    public ScalingInstruction withServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension
     * 
     */
    public CharSequence getScalableDimension() {
        return scalableDimension;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-scalabledimension
     * 
     */
    public void setScalableDimension(CharSequence scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    public ScalingInstruction withScalableDimension(CharSequence scalableDimension) {
        this.scalableDimension = scalableDimension;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity
     * 
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-mincapacity
     * 
     */
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
    public List<TargetTrackingConfiguration> getTargetTrackingConfigurations() {
        return targetTrackingConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-targettrackingconfigurations
     * 
     */
    public void setTargetTrackingConfigurations(List<TargetTrackingConfiguration> targetTrackingConfigurations) {
        this.targetTrackingConfigurations = targetTrackingConfigurations;
    }

    public ScalingInstruction withTargetTrackingConfigurations(List<TargetTrackingConfiguration> targetTrackingConfigurations) {
        this.targetTrackingConfigurations = targetTrackingConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity
     * 
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html#cfn-autoscalingplans-scalingplan-scalinginstruction-maxcapacity
     * 
     */
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ScalingInstruction withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resourceId", resourceId).append("serviceNamespace", serviceNamespace).append("scalableDimension", scalableDimension).append("minCapacity", minCapacity).append("targetTrackingConfigurations", targetTrackingConfigurations).append("maxCapacity", maxCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resourceId).append(scalableDimension).append(targetTrackingConfigurations).append(maxCapacity).append(minCapacity).append(serviceNamespace).toHashCode();
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
        return new EqualsBuilder().append(resourceId, rhs.resourceId).append(scalableDimension, rhs.scalableDimension).append(targetTrackingConfigurations, rhs.targetTrackingConfigurations).append(maxCapacity, rhs.maxCapacity).append(minCapacity, rhs.minCapacity).append(serviceNamespace, rhs.serviceNamespace).isEquals();
    }

}
