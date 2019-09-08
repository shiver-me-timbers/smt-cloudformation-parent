
package shiver.me.timbers.aws.backup;

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
 * BackupPlan
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BackupPlan",
    "BackupPlanTags"
})
public class BackupPlan {

    /**
     * BackupPlanBackupPlanResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html
     * 
     */
    @JsonProperty("BackupPlan")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html")
    private Property<BackupPlanBackupPlanResourceType> backupPlan;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags
     * 
     */
    @JsonProperty("BackupPlanTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags")
    private Object backupPlanTags;

    /**
     * BackupPlanBackupPlanResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html
     * 
     */
    @JsonIgnore
    public Property<BackupPlanBackupPlanResourceType> getBackupPlan() {
        return backupPlan;
    }

    /**
     * BackupPlanBackupPlanResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html
     * 
     */
    @JsonIgnore
    public void setBackupPlan(Property<BackupPlanBackupPlanResourceType> backupPlan) {
        this.backupPlan = backupPlan;
    }

    public BackupPlan withBackupPlan(Property<BackupPlanBackupPlanResourceType> backupPlan) {
        this.backupPlan = backupPlan;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags
     * 
     */
    @JsonIgnore
    public Object getBackupPlanTags() {
        return backupPlanTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags
     * 
     */
    @JsonIgnore
    public void setBackupPlanTags(Object backupPlanTags) {
        this.backupPlanTags = backupPlanTags;
    }

    public BackupPlan withBackupPlanTags(Object backupPlanTags) {
        this.backupPlanTags = backupPlanTags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backupPlan", backupPlan).append("backupPlanTags", backupPlanTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(backupPlan).append(backupPlanTags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupPlan) == false) {
            return false;
        }
        BackupPlan rhs = ((BackupPlan) other);
        return new EqualsBuilder().append(backupPlan, rhs.backupPlan).append(backupPlanTags, rhs.backupPlanTags).isEquals();
    }

}
