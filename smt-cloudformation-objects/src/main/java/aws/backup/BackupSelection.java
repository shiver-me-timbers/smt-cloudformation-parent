
package aws.backup;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BackupSelection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BackupSelection",
    "BackupPlanId"
})
public class BackupSelection {

    /**
     * BackupSelectionBackupSelectionResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html
     * 
     */
    @JsonProperty("BackupSelection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html")
    private Property<BackupSelectionBackupSelectionResourceType> backupSelection;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid
     * 
     */
    @JsonProperty("BackupPlanId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid")
    private CharSequence backupPlanId;

    /**
     * BackupSelectionBackupSelectionResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html
     * 
     */
    @JsonIgnore
    public Property<BackupSelectionBackupSelectionResourceType> getBackupSelection() {
        return backupSelection;
    }

    /**
     * BackupSelectionBackupSelectionResourceType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-backupselectionresourcetype.html
     * 
     */
    @JsonIgnore
    public void setBackupSelection(Property<BackupSelectionBackupSelectionResourceType> backupSelection) {
        this.backupSelection = backupSelection;
    }

    public BackupSelection withBackupSelection(Property<BackupSelectionBackupSelectionResourceType> backupSelection) {
        this.backupSelection = backupSelection;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid
     * 
     */
    @JsonIgnore
    public CharSequence getBackupPlanId() {
        return backupPlanId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid
     * 
     */
    @JsonIgnore
    public void setBackupPlanId(CharSequence backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    public BackupSelection withBackupPlanId(CharSequence backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backupSelection", backupSelection).append("backupPlanId", backupPlanId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(backupPlanId).append(backupSelection).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupSelection) == false) {
            return false;
        }
        BackupSelection rhs = ((BackupSelection) other);
        return new EqualsBuilder().append(backupPlanId, rhs.backupPlanId).append(backupSelection, rhs.backupSelection).isEquals();
    }

}
