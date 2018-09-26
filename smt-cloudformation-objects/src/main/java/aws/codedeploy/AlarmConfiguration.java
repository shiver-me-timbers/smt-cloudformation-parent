
package aws.codedeploy;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AlarmConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Alarms",
    "Enabled",
    "IgnorePollAlarmFailure"
})
public class AlarmConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms
     * 
     */
    @JsonProperty("Alarms")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms")
    private Set<Alarm> alarms = new LinkedHashSet<Alarm>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure
     * 
     */
    @JsonProperty("IgnorePollAlarmFailure")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure")
    private Boolean ignorePollAlarmFailure;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms
     * 
     */
    public Set<Alarm> getAlarms() {
        return alarms;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-alarms
     * 
     */
    public void setAlarms(Set<Alarm> alarms) {
        this.alarms = alarms;
    }

    public AlarmConfiguration withAlarms(Set<Alarm> alarms) {
        this.alarms = alarms;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AlarmConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure
     * 
     */
    public Boolean getIgnorePollAlarmFailure() {
        return ignorePollAlarmFailure;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html#cfn-codedeploy-deploymentgroup-alarmconfiguration-ignorepollalarmfailure
     * 
     */
    public void setIgnorePollAlarmFailure(Boolean ignorePollAlarmFailure) {
        this.ignorePollAlarmFailure = ignorePollAlarmFailure;
    }

    public AlarmConfiguration withIgnorePollAlarmFailure(Boolean ignorePollAlarmFailure) {
        this.ignorePollAlarmFailure = ignorePollAlarmFailure;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alarms", alarms).append("enabled", enabled).append("ignorePollAlarmFailure", ignorePollAlarmFailure).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ignorePollAlarmFailure).append(enabled).append(alarms).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlarmConfiguration) == false) {
            return false;
        }
        AlarmConfiguration rhs = ((AlarmConfiguration) other);
        return new EqualsBuilder().append(ignorePollAlarmFailure, rhs.ignorePollAlarmFailure).append(enabled, rhs.enabled).append(alarms, rhs.alarms).isEquals();
    }

}
