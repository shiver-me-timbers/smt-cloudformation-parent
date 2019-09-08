
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
 * BackupPlanLifecycleResourceType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeleteAfterDays",
    "MoveToColdStorageAfterDays"
})
public class BackupPlanLifecycleResourceType implements Property<BackupPlanLifecycleResourceType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-deleteafterdays
     * 
     */
    @JsonProperty("DeleteAfterDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-deleteafterdays")
    private Number deleteAfterDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-movetocoldstorageafterdays
     * 
     */
    @JsonProperty("MoveToColdStorageAfterDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-movetocoldstorageafterdays")
    private Number moveToColdStorageAfterDays;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-deleteafterdays
     * 
     */
    @JsonIgnore
    public Number getDeleteAfterDays() {
        return deleteAfterDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-deleteafterdays
     * 
     */
    @JsonIgnore
    public void setDeleteAfterDays(Number deleteAfterDays) {
        this.deleteAfterDays = deleteAfterDays;
    }

    public BackupPlanLifecycleResourceType withDeleteAfterDays(Number deleteAfterDays) {
        this.deleteAfterDays = deleteAfterDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-movetocoldstorageafterdays
     * 
     */
    @JsonIgnore
    public Number getMoveToColdStorageAfterDays() {
        return moveToColdStorageAfterDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-lifecycleresourcetype.html#cfn-backup-backupplan-lifecycleresourcetype-movetocoldstorageafterdays
     * 
     */
    @JsonIgnore
    public void setMoveToColdStorageAfterDays(Number moveToColdStorageAfterDays) {
        this.moveToColdStorageAfterDays = moveToColdStorageAfterDays;
    }

    public BackupPlanLifecycleResourceType withMoveToColdStorageAfterDays(Number moveToColdStorageAfterDays) {
        this.moveToColdStorageAfterDays = moveToColdStorageAfterDays;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deleteAfterDays", deleteAfterDays).append("moveToColdStorageAfterDays", moveToColdStorageAfterDays).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deleteAfterDays).append(moveToColdStorageAfterDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupPlanLifecycleResourceType) == false) {
            return false;
        }
        BackupPlanLifecycleResourceType rhs = ((BackupPlanLifecycleResourceType) other);
        return new EqualsBuilder().append(deleteAfterDays, rhs.deleteAfterDays).append(moveToColdStorageAfterDays, rhs.moveToColdStorageAfterDays).isEquals();
    }

}
