
package aws.autoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LifecycleHook
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AutoScalingGroupName",
    "DefaultResult",
    "HeartbeatTimeout",
    "LifecycleHookName",
    "LifecycleTransition",
    "NotificationMetadata",
    "NotificationTargetARN",
    "RoleARN"
})
public class LifecycleHook {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname")
    private CharSequence autoScalingGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult
     * 
     */
    @JsonProperty("DefaultResult")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult")
    private CharSequence defaultResult;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout
     * 
     */
    @JsonProperty("HeartbeatTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout")
    private Integer heartbeatTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname
     * 
     */
    @JsonProperty("LifecycleHookName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname")
    private CharSequence lifecycleHookName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition
     * 
     */
    @JsonProperty("LifecycleTransition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition")
    private CharSequence lifecycleTransition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata
     * 
     */
    @JsonProperty("NotificationMetadata")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata")
    private CharSequence notificationMetadata;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn
     * 
     */
    @JsonProperty("NotificationTargetARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn")
    private CharSequence notificationTargetARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn")
    private CharSequence roleARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname
     * 
     */
    public CharSequence getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname
     * 
     */
    public void setAutoScalingGroupName(CharSequence autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    public LifecycleHook withAutoScalingGroupName(CharSequence autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult
     * 
     */
    public CharSequence getDefaultResult() {
        return defaultResult;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult
     * 
     */
    public void setDefaultResult(CharSequence defaultResult) {
        this.defaultResult = defaultResult;
    }

    public LifecycleHook withDefaultResult(CharSequence defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout
     * 
     */
    public Integer getHeartbeatTimeout() {
        return heartbeatTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout
     * 
     */
    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    public LifecycleHook withHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname
     * 
     */
    public CharSequence getLifecycleHookName() {
        return lifecycleHookName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname
     * 
     */
    public void setLifecycleHookName(CharSequence lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    public LifecycleHook withLifecycleHookName(CharSequence lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition
     * 
     */
    public CharSequence getLifecycleTransition() {
        return lifecycleTransition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition
     * 
     */
    public void setLifecycleTransition(CharSequence lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }

    public LifecycleHook withLifecycleTransition(CharSequence lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata
     * 
     */
    public CharSequence getNotificationMetadata() {
        return notificationMetadata;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata
     * 
     */
    public void setNotificationMetadata(CharSequence notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    public LifecycleHook withNotificationMetadata(CharSequence notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn
     * 
     */
    public CharSequence getNotificationTargetARN() {
        return notificationTargetARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn
     * 
     */
    public void setNotificationTargetARN(CharSequence notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }

    public LifecycleHook withNotificationTargetARN(CharSequence notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn
     * 
     */
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn
     * 
     */
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public LifecycleHook withRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoScalingGroupName", autoScalingGroupName).append("defaultResult", defaultResult).append("heartbeatTimeout", heartbeatTimeout).append("lifecycleHookName", lifecycleHookName).append("lifecycleTransition", lifecycleTransition).append("notificationMetadata", notificationMetadata).append("notificationTargetARN", notificationTargetARN).append("roleARN", roleARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(autoScalingGroupName).append(notificationMetadata).append(roleARN).append(lifecycleTransition).append(lifecycleHookName).append(defaultResult).append(heartbeatTimeout).append(notificationTargetARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecycleHook) == false) {
            return false;
        }
        LifecycleHook rhs = ((LifecycleHook) other);
        return new EqualsBuilder().append(autoScalingGroupName, rhs.autoScalingGroupName).append(notificationMetadata, rhs.notificationMetadata).append(roleARN, rhs.roleARN).append(lifecycleTransition, rhs.lifecycleTransition).append(lifecycleHookName, rhs.lifecycleHookName).append(defaultResult, rhs.defaultResult).append(heartbeatTimeout, rhs.heartbeatTimeout).append(notificationTargetARN, rhs.notificationTargetARN).isEquals();
    }

}
