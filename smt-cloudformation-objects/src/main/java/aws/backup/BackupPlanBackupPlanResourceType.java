
package aws.backup;

import java.util.ArrayList;
import java.util.List;
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
 * BackupPlanBackupPlanResourceType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BackupPlanName",
    "BackupPlanRule"
})
public class BackupPlanBackupPlanResourceType implements Property<BackupPlanBackupPlanResourceType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanname
     * 
     */
    @JsonProperty("BackupPlanName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanname")
    private CharSequence backupPlanName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanrule
     * 
     */
    @JsonProperty("BackupPlanRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanrule")
    private List<Property<BackupPlanBackupRuleResourceType>> backupPlanRule = new ArrayList<Property<BackupPlanBackupRuleResourceType>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanname
     * 
     */
    @JsonIgnore
    public CharSequence getBackupPlanName() {
        return backupPlanName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanname
     * 
     */
    @JsonIgnore
    public void setBackupPlanName(CharSequence backupPlanName) {
        this.backupPlanName = backupPlanName;
    }

    public BackupPlanBackupPlanResourceType withBackupPlanName(CharSequence backupPlanName) {
        this.backupPlanName = backupPlanName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanrule
     * 
     */
    @JsonIgnore
    public List<Property<BackupPlanBackupRuleResourceType>> getBackupPlanRule() {
        return backupPlanRule;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupplanresourcetype.html#cfn-backup-backupplan-backupplanresourcetype-backupplanrule
     * 
     */
    @JsonIgnore
    public void setBackupPlanRule(List<Property<BackupPlanBackupRuleResourceType>> backupPlanRule) {
        this.backupPlanRule = backupPlanRule;
    }

    public BackupPlanBackupPlanResourceType withBackupPlanRule(List<Property<BackupPlanBackupRuleResourceType>> backupPlanRule) {
        this.backupPlanRule = backupPlanRule;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backupPlanName", backupPlanName).append("backupPlanRule", backupPlanRule).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(backupPlanName).append(backupPlanRule).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupPlanBackupPlanResourceType) == false) {
            return false;
        }
        BackupPlanBackupPlanResourceType rhs = ((BackupPlanBackupPlanResourceType) other);
        return new EqualsBuilder().append(backupPlanName, rhs.backupPlanName).append(backupPlanRule, rhs.backupPlanRule).isEquals();
    }

}
