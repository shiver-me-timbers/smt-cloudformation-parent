
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CloudwatchAlarmAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AlarmName",
    "RoleArn",
    "StateReason",
    "StateValue"
})
public class CloudwatchAlarmAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname
     * 
     */
    @JsonProperty("AlarmName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname")
    private CharSequence alarmName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason
     * 
     */
    @JsonProperty("StateReason")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason")
    private CharSequence stateReason;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue
     * 
     */
    @JsonProperty("StateValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue")
    private CharSequence stateValue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname
     * 
     */
    public CharSequence getAlarmName() {
        return alarmName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname
     * 
     */
    public void setAlarmName(CharSequence alarmName) {
        this.alarmName = alarmName;
    }

    public CloudwatchAlarmAction withAlarmName(CharSequence alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public CloudwatchAlarmAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason
     * 
     */
    public CharSequence getStateReason() {
        return stateReason;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason
     * 
     */
    public void setStateReason(CharSequence stateReason) {
        this.stateReason = stateReason;
    }

    public CloudwatchAlarmAction withStateReason(CharSequence stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue
     * 
     */
    public CharSequence getStateValue() {
        return stateValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue
     * 
     */
    public void setStateValue(CharSequence stateValue) {
        this.stateValue = stateValue;
    }

    public CloudwatchAlarmAction withStateValue(CharSequence stateValue) {
        this.stateValue = stateValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alarmName", alarmName).append("roleArn", roleArn).append("stateReason", stateReason).append("stateValue", stateValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stateValue).append(alarmName).append(stateReason).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudwatchAlarmAction) == false) {
            return false;
        }
        CloudwatchAlarmAction rhs = ((CloudwatchAlarmAction) other);
        return new EqualsBuilder().append(stateValue, rhs.stateValue).append(alarmName, rhs.alarmName).append(stateReason, rhs.stateReason).append(roleArn, rhs.roleArn).isEquals();
    }

}
