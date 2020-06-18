
package shiver.me.timbers.aws.cloudwatch;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CompositeAlarm
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AlarmName",
    "AlarmRule",
    "AlarmDescription",
    "ActionsEnabled",
    "OKActions",
    "AlarmActions",
    "InsufficientDataActions"
})
public class CompositeAlarm {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname
     * 
     */
    @JsonProperty("AlarmName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname")
    private CharSequence alarmName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmrule
     * 
     */
    @JsonProperty("AlarmRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmrule")
    private CharSequence alarmRule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription
     * 
     */
    @JsonProperty("AlarmDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription")
    private CharSequence alarmDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled
     * 
     */
    @JsonProperty("ActionsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled")
    private CharSequence actionsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions
     * 
     */
    @JsonProperty("OKActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions")
    private List<CharSequence> oKActions = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions
     * 
     */
    @JsonProperty("AlarmActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions")
    private List<CharSequence> alarmActions = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions
     * 
     */
    @JsonProperty("InsufficientDataActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions")
    private List<CharSequence> insufficientDataActions = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname
     * 
     */
    @JsonIgnore
    public CharSequence getAlarmName() {
        return alarmName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmname
     * 
     */
    @JsonIgnore
    public void setAlarmName(CharSequence alarmName) {
        this.alarmName = alarmName;
    }

    public CompositeAlarm withAlarmName(CharSequence alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmrule
     * 
     */
    @JsonIgnore
    public CharSequence getAlarmRule() {
        return alarmRule;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmrule
     * 
     */
    @JsonIgnore
    public void setAlarmRule(CharSequence alarmRule) {
        this.alarmRule = alarmRule;
    }

    public CompositeAlarm withAlarmRule(CharSequence alarmRule) {
        this.alarmRule = alarmRule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription
     * 
     */
    @JsonIgnore
    public CharSequence getAlarmDescription() {
        return alarmDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmdescription
     * 
     */
    @JsonIgnore
    public void setAlarmDescription(CharSequence alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public CompositeAlarm withAlarmDescription(CharSequence alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getActionsEnabled() {
        return actionsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-actionsenabled
     * 
     */
    @JsonIgnore
    public void setActionsEnabled(CharSequence actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
    }

    public CompositeAlarm withActionsEnabled(CharSequence actionsEnabled) {
        this.actionsEnabled = actionsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getOKActions() {
        return oKActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-okactions
     * 
     */
    @JsonIgnore
    public void setOKActions(List<CharSequence> oKActions) {
        this.oKActions = oKActions;
    }

    public CompositeAlarm withOKActions(List<CharSequence> oKActions) {
        this.oKActions = oKActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAlarmActions() {
        return alarmActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-alarmactions
     * 
     */
    @JsonIgnore
    public void setAlarmActions(List<CharSequence> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public CompositeAlarm withAlarmActions(List<CharSequence> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getInsufficientDataActions() {
        return insufficientDataActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html#cfn-cloudwatch-compositealarm-insufficientdataactions
     * 
     */
    @JsonIgnore
    public void setInsufficientDataActions(List<CharSequence> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
    }

    public CompositeAlarm withInsufficientDataActions(List<CharSequence> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alarmName", alarmName).append("alarmRule", alarmRule).append("alarmDescription", alarmDescription).append("actionsEnabled", actionsEnabled).append("oKActions", oKActions).append("alarmActions", alarmActions).append("insufficientDataActions", insufficientDataActions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alarmDescription).append(actionsEnabled).append(alarmRule).append(alarmName).append(oKActions).append(alarmActions).append(insufficientDataActions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompositeAlarm) == false) {
            return false;
        }
        CompositeAlarm rhs = ((CompositeAlarm) other);
        return new EqualsBuilder().append(alarmDescription, rhs.alarmDescription).append(actionsEnabled, rhs.actionsEnabled).append(alarmRule, rhs.alarmRule).append(alarmName, rhs.alarmName).append(oKActions, rhs.oKActions).append(alarmActions, rhs.alarmActions).append(insufficientDataActions, rhs.insufficientDataActions).isEquals();
    }

}
