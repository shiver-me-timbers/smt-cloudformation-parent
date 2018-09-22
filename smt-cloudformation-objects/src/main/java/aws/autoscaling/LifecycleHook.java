
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
    private String autoScalingGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult
     * 
     */
    @JsonProperty("DefaultResult")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult")
    private String defaultResult;
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
    private String lifecycleHookName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition
     * 
     */
    @JsonProperty("LifecycleTransition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition")
    private String lifecycleTransition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata
     * 
     */
    @JsonProperty("NotificationMetadata")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata")
    private String notificationMetadata;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn
     * 
     */
    @JsonProperty("NotificationTargetARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn")
    private String notificationTargetARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn")
    private String roleARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    public LifecycleHook withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult
     * 
     */
    @JsonProperty("DefaultResult")
    public String getDefaultResult() {
        return defaultResult;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-defaultresult
     * 
     */
    @JsonProperty("DefaultResult")
    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }

    public LifecycleHook withDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout
     * 
     */
    @JsonProperty("HeartbeatTimeout")
    public Integer getHeartbeatTimeout() {
        return heartbeatTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-heartbeattimeout
     * 
     */
    @JsonProperty("HeartbeatTimeout")
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
    @JsonProperty("LifecycleHookName")
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-autoscaling-lifecyclehook-lifecyclehookname
     * 
     */
    @JsonProperty("LifecycleHookName")
    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    public LifecycleHook withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition
     * 
     */
    @JsonProperty("LifecycleTransition")
    public String getLifecycleTransition() {
        return lifecycleTransition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-lifecycletransition
     * 
     */
    @JsonProperty("LifecycleTransition")
    public void setLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }

    public LifecycleHook withLifecycleTransition(String lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata
     * 
     */
    @JsonProperty("NotificationMetadata")
    public String getNotificationMetadata() {
        return notificationMetadata;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationmetadata
     * 
     */
    @JsonProperty("NotificationMetadata")
    public void setNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    public LifecycleHook withNotificationMetadata(String notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn
     * 
     */
    @JsonProperty("NotificationTargetARN")
    public String getNotificationTargetARN() {
        return notificationTargetARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-notificationtargetarn
     * 
     */
    @JsonProperty("NotificationTargetARN")
    public void setNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }

    public LifecycleHook withNotificationTargetARN(String notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-lifecyclehook.html#cfn-as-lifecyclehook-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    public LifecycleHook withRoleARN(String roleARN) {
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
