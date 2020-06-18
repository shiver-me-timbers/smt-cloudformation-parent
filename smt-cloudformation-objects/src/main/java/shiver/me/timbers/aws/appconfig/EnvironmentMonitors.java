
package shiver.me.timbers.aws.appconfig;

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
 * EnvironmentMonitors
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AlarmArn",
    "AlarmRoleArn"
})
public class EnvironmentMonitors implements Property<EnvironmentMonitors>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmarn
     * 
     */
    @JsonProperty("AlarmArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmarn")
    private CharSequence alarmArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmrolearn
     * 
     */
    @JsonProperty("AlarmRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmrolearn")
    private CharSequence alarmRoleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmarn
     * 
     */
    @JsonIgnore
    public CharSequence getAlarmArn() {
        return alarmArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmarn
     * 
     */
    @JsonIgnore
    public void setAlarmArn(CharSequence alarmArn) {
        this.alarmArn = alarmArn;
    }

    public EnvironmentMonitors withAlarmArn(CharSequence alarmArn) {
        this.alarmArn = alarmArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getAlarmRoleArn() {
        return alarmRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-environment-monitors.html#cfn-appconfig-environment-monitors-alarmrolearn
     * 
     */
    @JsonIgnore
    public void setAlarmRoleArn(CharSequence alarmRoleArn) {
        this.alarmRoleArn = alarmRoleArn;
    }

    public EnvironmentMonitors withAlarmRoleArn(CharSequence alarmRoleArn) {
        this.alarmRoleArn = alarmRoleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alarmArn", alarmArn).append("alarmRoleArn", alarmRoleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alarmRoleArn).append(alarmArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvironmentMonitors) == false) {
            return false;
        }
        EnvironmentMonitors rhs = ((EnvironmentMonitors) other);
        return new EqualsBuilder().append(alarmRoleArn, rhs.alarmRoleArn).append(alarmArn, rhs.alarmArn).isEquals();
    }

}
