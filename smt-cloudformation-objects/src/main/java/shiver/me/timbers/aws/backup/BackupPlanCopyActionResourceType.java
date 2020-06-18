
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
 * BackupPlanCopyActionResourceType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Lifecycle",
    "DestinationBackupVaultArn"
})
public class BackupPlanCopyActionResourceType implements Property<BackupPlanCopyActionResourceType>
{

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html#cfn-backup-backupplan-copyactionresourcetype-destinationbackupvaultarn
     * 
     */
    @JsonProperty("DestinationBackupVaultArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html#cfn-backup-backupplan-copyactionresourcetype-destinationbackupvaultarn")
    private CharSequence destinationBackupVaultArn;

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

    public BackupPlanCopyActionResourceType withLifecycle(Property<BackupPlanLifecycleResourceType> lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html#cfn-backup-backupplan-copyactionresourcetype-destinationbackupvaultarn
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationBackupVaultArn() {
        return destinationBackupVaultArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-copyactionresourcetype.html#cfn-backup-backupplan-copyactionresourcetype-destinationbackupvaultarn
     * 
     */
    @JsonIgnore
    public void setDestinationBackupVaultArn(CharSequence destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
    }

    public BackupPlanCopyActionResourceType withDestinationBackupVaultArn(CharSequence destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lifecycle", lifecycle).append("destinationBackupVaultArn", destinationBackupVaultArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lifecycle).append(destinationBackupVaultArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupPlanCopyActionResourceType) == false) {
            return false;
        }
        BackupPlanCopyActionResourceType rhs = ((BackupPlanCopyActionResourceType) other);
        return new EqualsBuilder().append(lifecycle, rhs.lifecycle).append(destinationBackupVaultArn, rhs.destinationBackupVaultArn).isEquals();
    }

}
