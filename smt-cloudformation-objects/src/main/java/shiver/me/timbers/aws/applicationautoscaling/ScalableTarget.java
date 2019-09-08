
package shiver.me.timbers.aws.applicationautoscaling;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ScalableTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxCapacity",
    "MinCapacity",
    "ResourceId",
    "RoleARN",
    "ScalableDimension",
    "ScheduledActions",
    "ServiceNamespace",
    "SuspendedState"
})
public class ScalableTarget {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity
     * 
     */
    @JsonProperty("MaxCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity")
    private Number maxCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity
     * 
     */
    @JsonProperty("MinCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity")
    private Number minCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid
     * 
     */
    @JsonProperty("ResourceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid")
    private CharSequence resourceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn")
    private CharSequence roleARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension
     * 
     */
    @JsonProperty("ScalableDimension")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension")
    private CharSequence scalableDimension;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions
     * 
     */
    @JsonProperty("ScheduledActions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions")
    private Set<Property<ScalableTargetScheduledAction>> scheduledActions = new LinkedHashSet<Property<ScalableTargetScheduledAction>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace
     * 
     */
    @JsonProperty("ServiceNamespace")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace")
    private CharSequence serviceNamespace;
    /**
     * ScalableTargetSuspendedState
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html
     * 
     */
    @JsonProperty("SuspendedState")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html")
    private Property<ScalableTargetSuspendedState> suspendedState;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity
     * 
     */
    @JsonIgnore
    public Number getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity
     * 
     */
    @JsonIgnore
    public void setMaxCapacity(Number maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ScalableTarget withMaxCapacity(Number maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity
     * 
     */
    @JsonIgnore
    public Number getMinCapacity() {
        return minCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity
     * 
     */
    @JsonIgnore
    public void setMinCapacity(Number minCapacity) {
        this.minCapacity = minCapacity;
    }

    public ScalableTarget withMinCapacity(Number minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid
     * 
     */
    @JsonIgnore
    public CharSequence getResourceId() {
        return resourceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid
     * 
     */
    @JsonIgnore
    public void setResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
    }

    public ScalableTarget withResourceId(CharSequence resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public ScalableTarget withRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension
     * 
     */
    @JsonIgnore
    public CharSequence getScalableDimension() {
        return scalableDimension;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension
     * 
     */
    @JsonIgnore
    public void setScalableDimension(CharSequence scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    public ScalableTarget withScalableDimension(CharSequence scalableDimension) {
        this.scalableDimension = scalableDimension;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions
     * 
     */
    @JsonIgnore
    public Set<Property<ScalableTargetScheduledAction>> getScheduledActions() {
        return scheduledActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions
     * 
     */
    @JsonIgnore
    public void setScheduledActions(Set<Property<ScalableTargetScheduledAction>> scheduledActions) {
        this.scheduledActions = scheduledActions;
    }

    public ScalableTarget withScheduledActions(Set<Property<ScalableTargetScheduledAction>> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace
     * 
     */
    @JsonIgnore
    public CharSequence getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace
     * 
     */
    @JsonIgnore
    public void setServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    public ScalableTarget withServiceNamespace(CharSequence serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * ScalableTargetSuspendedState
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html
     * 
     */
    @JsonIgnore
    public Property<ScalableTargetSuspendedState> getSuspendedState() {
        return suspendedState;
    }

    /**
     * ScalableTargetSuspendedState
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html
     * 
     */
    @JsonIgnore
    public void setSuspendedState(Property<ScalableTargetSuspendedState> suspendedState) {
        this.suspendedState = suspendedState;
    }

    public ScalableTarget withSuspendedState(Property<ScalableTargetSuspendedState> suspendedState) {
        this.suspendedState = suspendedState;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxCapacity", maxCapacity).append("minCapacity", minCapacity).append("resourceId", resourceId).append("roleARN", roleARN).append("scalableDimension", scalableDimension).append("scheduledActions", scheduledActions).append("serviceNamespace", serviceNamespace).append("suspendedState", suspendedState).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scheduledActions).append(suspendedState).append(resourceId).append(scalableDimension).append(roleARN).append(maxCapacity).append(minCapacity).append(serviceNamespace).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalableTarget) == false) {
            return false;
        }
        ScalableTarget rhs = ((ScalableTarget) other);
        return new EqualsBuilder().append(scheduledActions, rhs.scheduledActions).append(suspendedState, rhs.suspendedState).append(resourceId, rhs.resourceId).append(scalableDimension, rhs.scalableDimension).append(roleARN, rhs.roleARN).append(maxCapacity, rhs.maxCapacity).append(minCapacity, rhs.minCapacity).append(serviceNamespace, rhs.serviceNamespace).isEquals();
    }

}
