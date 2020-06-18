
package shiver.me.timbers.aws.backup;

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
import shiver.me.timbers.aws.Property;


/**
 * BackupPlanBackupRuleResourceType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CompletionWindowMinutes",
    "ScheduleExpression",
    "RecoveryPointTags",
    "CopyActions",
    "Lifecycle",
    "TargetBackupVault",
    "StartWindowMinutes",
    "RuleName"
})
public class BackupPlanBackupRuleResourceType implements Property<BackupPlanBackupRuleResourceType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-completionwindowminutes
     * 
     */
    @JsonProperty("CompletionWindowMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-completionwindowminutes")
    private Number completionWindowMinutes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-scheduleexpression
     * 
     */
    @JsonProperty("ScheduleExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-scheduleexpression")
    private CharSequence scheduleExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-recoverypointtags
     * 
     */
    @JsonProperty("RecoveryPointTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-recoverypointtags")
    private Object recoveryPointTags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-copyactions
     * 
     */
    @JsonProperty("CopyActions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-copyactions")
    private List<Property<BackupPlanCopyActionResourceType>> copyActions = new ArrayList<Property<BackupPlanCopyActionResourceType>>();
    /**
     * BackupPlanLifecycleResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html
     * 
     */
    @JsonProperty("Lifecycle")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html")
    private Property<BackupPlanLifecycleResourceType> lifecycle;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-targetbackupvault
     * 
     */
    @JsonProperty("TargetBackupVault")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-targetbackupvault")
    private CharSequence targetBackupVault;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-startwindowminutes
     * 
     */
    @JsonProperty("StartWindowMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-startwindowminutes")
    private Number startWindowMinutes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-rulename
     * 
     */
    @JsonProperty("RuleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-rulename")
    private CharSequence ruleName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-completionwindowminutes
     * 
     */
    @JsonIgnore
    public Number getCompletionWindowMinutes() {
        return completionWindowMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-completionwindowminutes
     * 
     */
    @JsonIgnore
    public void setCompletionWindowMinutes(Number completionWindowMinutes) {
        this.completionWindowMinutes = completionWindowMinutes;
    }

    public BackupPlanBackupRuleResourceType withCompletionWindowMinutes(Number completionWindowMinutes) {
        this.completionWindowMinutes = completionWindowMinutes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-scheduleexpression
     * 
     */
    @JsonIgnore
    public CharSequence getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-scheduleexpression
     * 
     */
    @JsonIgnore
    public void setScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    public BackupPlanBackupRuleResourceType withScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-recoverypointtags
     * 
     */
    @JsonIgnore
    public Object getRecoveryPointTags() {
        return recoveryPointTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-recoverypointtags
     * 
     */
    @JsonIgnore
    public void setRecoveryPointTags(Object recoveryPointTags) {
        this.recoveryPointTags = recoveryPointTags;
    }

    public BackupPlanBackupRuleResourceType withRecoveryPointTags(Object recoveryPointTags) {
        this.recoveryPointTags = recoveryPointTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-copyactions
     * 
     */
    @JsonIgnore
    public List<Property<BackupPlanCopyActionResourceType>> getCopyActions() {
        return copyActions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-copyactions
     * 
     */
    @JsonIgnore
    public void setCopyActions(List<Property<BackupPlanCopyActionResourceType>> copyActions) {
        this.copyActions = copyActions;
    }

    public BackupPlanBackupRuleResourceType withCopyActions(List<Property<BackupPlanCopyActionResourceType>> copyActions) {
        this.copyActions = copyActions;
        return this;
    }

    /**
     * BackupPlanLifecycleResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html
     * 
     */
    @JsonIgnore
    public Property<BackupPlanLifecycleResourceType> getLifecycle() {
        return lifecycle;
    }

    /**
     * BackupPlanLifecycleResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html
     * 
     */
    @JsonIgnore
    public void setLifecycle(Property<BackupPlanLifecycleResourceType> lifecycle) {
        this.lifecycle = lifecycle;
    }

    public BackupPlanBackupRuleResourceType withLifecycle(Property<BackupPlanLifecycleResourceType> lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-targetbackupvault
     * 
     */
    @JsonIgnore
    public CharSequence getTargetBackupVault() {
        return targetBackupVault;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-targetbackupvault
     * 
     */
    @JsonIgnore
    public void setTargetBackupVault(CharSequence targetBackupVault) {
        this.targetBackupVault = targetBackupVault;
    }

    public BackupPlanBackupRuleResourceType withTargetBackupVault(CharSequence targetBackupVault) {
        this.targetBackupVault = targetBackupVault;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-startwindowminutes
     * 
     */
    @JsonIgnore
    public Number getStartWindowMinutes() {
        return startWindowMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-startwindowminutes
     * 
     */
    @JsonIgnore
    public void setStartWindowMinutes(Number startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
    }

    public BackupPlanBackupRuleResourceType withStartWindowMinutes(Number startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-rulename
     * 
     */
    @JsonIgnore
    public CharSequence getRuleName() {
        return ruleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html#cfn-backup-backupplan-backupruleresourcetype-rulename
     * 
     */
    @JsonIgnore
    public void setRuleName(CharSequence ruleName) {
        this.ruleName = ruleName;
    }

    public BackupPlanBackupRuleResourceType withRuleName(CharSequence ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("completionWindowMinutes", completionWindowMinutes).append("scheduleExpression", scheduleExpression).append("recoveryPointTags", recoveryPointTags).append("copyActions", copyActions).append("lifecycle", lifecycle).append("targetBackupVault", targetBackupVault).append("startWindowMinutes", startWindowMinutes).append("ruleName", ruleName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lifecycle).append(targetBackupVault).append(startWindowMinutes).append(completionWindowMinutes).append(scheduleExpression).append(recoveryPointTags).append(copyActions).append(ruleName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupPlanBackupRuleResourceType) == false) {
            return false;
        }
        BackupPlanBackupRuleResourceType rhs = ((BackupPlanBackupRuleResourceType) other);
        return new EqualsBuilder().append(lifecycle, rhs.lifecycle).append(targetBackupVault, rhs.targetBackupVault).append(startWindowMinutes, rhs.startWindowMinutes).append(completionWindowMinutes, rhs.completionWindowMinutes).append(scheduleExpression, rhs.scheduleExpression).append(recoveryPointTags, rhs.recoveryPointTags).append(copyActions, rhs.copyActions).append(ruleName, rhs.ruleName).isEquals();
    }

}
