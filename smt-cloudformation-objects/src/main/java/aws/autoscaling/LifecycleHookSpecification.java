
package aws.autoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LifecycleHookSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DefaultResult",
    "HeartbeatTimeout",
    "LifecycleHookName",
    "LifecycleTransition",
    "NotificationMetadata",
    "NotificationTargetARN",
    "RoleARN"
})
public class LifecycleHookSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult
     * 
     */
    @JsonProperty("DefaultResult")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult")
    private CharSequence defaultResult;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout
     * 
     */
    @JsonProperty("HeartbeatTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout")
    private Integer heartbeatTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname
     * 
     */
    @JsonProperty("LifecycleHookName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname")
    private CharSequence lifecycleHookName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition
     * 
     */
    @JsonProperty("LifecycleTransition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition")
    private CharSequence lifecycleTransition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata
     * 
     */
    @JsonProperty("NotificationMetadata")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata")
    private CharSequence notificationMetadata;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn
     * 
     */
    @JsonProperty("NotificationTargetARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn")
    private CharSequence notificationTargetARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn")
    private CharSequence roleARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult
     * 
     */
    public CharSequence getDefaultResult() {
        return defaultResult;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-defaultresult
     * 
     */
    public void setDefaultResult(CharSequence defaultResult) {
        this.defaultResult = defaultResult;
    }

    public LifecycleHookSpecification withDefaultResult(CharSequence defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout
     * 
     */
    public Integer getHeartbeatTimeout() {
        return heartbeatTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-heartbeattimeout
     * 
     */
    public void setHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
    }

    public LifecycleHookSpecification withHeartbeatTimeout(Integer heartbeatTimeout) {
        this.heartbeatTimeout = heartbeatTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname
     * 
     */
    public CharSequence getLifecycleHookName() {
        return lifecycleHookName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecyclehookname
     * 
     */
    public void setLifecycleHookName(CharSequence lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    public LifecycleHookSpecification withLifecycleHookName(CharSequence lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition
     * 
     */
    public CharSequence getLifecycleTransition() {
        return lifecycleTransition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-lifecycletransition
     * 
     */
    public void setLifecycleTransition(CharSequence lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
    }

    public LifecycleHookSpecification withLifecycleTransition(CharSequence lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata
     * 
     */
    public CharSequence getNotificationMetadata() {
        return notificationMetadata;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationmetadata
     * 
     */
    public void setNotificationMetadata(CharSequence notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
    }

    public LifecycleHookSpecification withNotificationMetadata(CharSequence notificationMetadata) {
        this.notificationMetadata = notificationMetadata;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn
     * 
     */
    public CharSequence getNotificationTargetARN() {
        return notificationTargetARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-notificationtargetarn
     * 
     */
    public void setNotificationTargetARN(CharSequence notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
    }

    public LifecycleHookSpecification withNotificationTargetARN(CharSequence notificationTargetARN) {
        this.notificationTargetARN = notificationTargetARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn
     * 
     */
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-lifecyclehookspecification.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecification-rolearn
     * 
     */
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public LifecycleHookSpecification withRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("defaultResult", defaultResult).append("heartbeatTimeout", heartbeatTimeout).append("lifecycleHookName", lifecycleHookName).append("lifecycleTransition", lifecycleTransition).append("notificationMetadata", notificationMetadata).append("notificationTargetARN", notificationTargetARN).append("roleARN", roleARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notificationMetadata).append(roleARN).append(lifecycleTransition).append(lifecycleHookName).append(defaultResult).append(heartbeatTimeout).append(notificationTargetARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecycleHookSpecification) == false) {
            return false;
        }
        LifecycleHookSpecification rhs = ((LifecycleHookSpecification) other);
        return new EqualsBuilder().append(notificationMetadata, rhs.notificationMetadata).append(roleARN, rhs.roleARN).append(lifecycleTransition, rhs.lifecycleTransition).append(lifecycleHookName, rhs.lifecycleHookName).append(defaultResult, rhs.defaultResult).append(heartbeatTimeout, rhs.heartbeatTimeout).append(notificationTargetARN, rhs.notificationTargetARN).isEquals();
    }

}
