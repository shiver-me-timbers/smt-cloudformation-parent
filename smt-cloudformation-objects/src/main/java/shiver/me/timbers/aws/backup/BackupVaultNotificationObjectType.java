
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
 * BackupVaultNotificationObjectType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SNSTopicArn",
    "BackupVaultEvents"
})
public class BackupVaultNotificationObjectType implements Property<BackupVaultNotificationObjectType>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-snstopicarn
     * 
     */
    @JsonProperty("SNSTopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-snstopicarn")
    private CharSequence sNSTopicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-backupvaultevents
     * 
     */
    @JsonProperty("BackupVaultEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-backupvaultevents")
    private List<CharSequence> backupVaultEvents = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-snstopicarn
     * 
     */
    @JsonIgnore
    public CharSequence getSNSTopicArn() {
        return sNSTopicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-snstopicarn
     * 
     */
    @JsonIgnore
    public void setSNSTopicArn(CharSequence sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
    }

    public BackupVaultNotificationObjectType withSNSTopicArn(CharSequence sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-backupvaultevents
     * 
     */
    @JsonIgnore
    public List<CharSequence> getBackupVaultEvents() {
        return backupVaultEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html#cfn-backup-backupvault-notificationobjecttype-backupvaultevents
     * 
     */
    @JsonIgnore
    public void setBackupVaultEvents(List<CharSequence> backupVaultEvents) {
        this.backupVaultEvents = backupVaultEvents;
    }

    public BackupVaultNotificationObjectType withBackupVaultEvents(List<CharSequence> backupVaultEvents) {
        this.backupVaultEvents = backupVaultEvents;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sNSTopicArn", sNSTopicArn).append("backupVaultEvents", backupVaultEvents).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sNSTopicArn).append(backupVaultEvents).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupVaultNotificationObjectType) == false) {
            return false;
        }
        BackupVaultNotificationObjectType rhs = ((BackupVaultNotificationObjectType) other);
        return new EqualsBuilder().append(sNSTopicArn, rhs.sNSTopicArn).append(backupVaultEvents, rhs.backupVaultEvents).isEquals();
    }

}
