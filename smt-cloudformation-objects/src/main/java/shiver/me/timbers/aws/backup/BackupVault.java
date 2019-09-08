
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
 * BackupVault
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BackupVaultTags",
    "BackupVaultName",
    "EncryptionKeyArn",
    "Notifications",
    "AccessPolicy"
})
public class BackupVault {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags
     * 
     */
    @JsonProperty("BackupVaultTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags")
    private Object backupVaultTags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname
     * 
     */
    @JsonProperty("BackupVaultName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname")
    private CharSequence backupVaultName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-encryptionkeyarn
     * 
     */
    @JsonProperty("EncryptionKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-encryptionkeyarn")
    private CharSequence encryptionKeyArn;
    /**
     * BackupVaultNotificationObjectType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html
     * 
     */
    @JsonProperty("Notifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html")
    private Property<BackupVaultNotificationObjectType> notifications;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy
     * 
     */
    @JsonProperty("AccessPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy")
    private Object accessPolicy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags
     * 
     */
    @JsonIgnore
    public Object getBackupVaultTags() {
        return backupVaultTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaulttags
     * 
     */
    @JsonIgnore
    public void setBackupVaultTags(Object backupVaultTags) {
        this.backupVaultTags = backupVaultTags;
    }

    public BackupVault withBackupVaultTags(Object backupVaultTags) {
        this.backupVaultTags = backupVaultTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname
     * 
     */
    @JsonIgnore
    public CharSequence getBackupVaultName() {
        return backupVaultName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-backupvaultname
     * 
     */
    @JsonIgnore
    public void setBackupVaultName(CharSequence backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    public BackupVault withBackupVaultName(CharSequence backupVaultName) {
        this.backupVaultName = backupVaultName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-encryptionkeyarn
     * 
     */
    @JsonIgnore
    public CharSequence getEncryptionKeyArn() {
        return encryptionKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-encryptionkeyarn
     * 
     */
    @JsonIgnore
    public void setEncryptionKeyArn(CharSequence encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    public BackupVault withEncryptionKeyArn(CharSequence encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
        return this;
    }

    /**
     * BackupVaultNotificationObjectType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html
     * 
     */
    @JsonIgnore
    public Property<BackupVaultNotificationObjectType> getNotifications() {
        return notifications;
    }

    /**
     * BackupVaultNotificationObjectType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupvault-notificationobjecttype.html
     * 
     */
    @JsonIgnore
    public void setNotifications(Property<BackupVaultNotificationObjectType> notifications) {
        this.notifications = notifications;
    }

    public BackupVault withNotifications(Property<BackupVaultNotificationObjectType> notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy
     * 
     */
    @JsonIgnore
    public Object getAccessPolicy() {
        return accessPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupvault.html#cfn-backup-backupvault-accesspolicy
     * 
     */
    @JsonIgnore
    public void setAccessPolicy(Object accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public BackupVault withAccessPolicy(Object accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backupVaultTags", backupVaultTags).append("backupVaultName", backupVaultName).append("encryptionKeyArn", encryptionKeyArn).append("notifications", notifications).append("accessPolicy", accessPolicy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(backupVaultTags).append(encryptionKeyArn).append(accessPolicy).append(backupVaultName).append(notifications).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackupVault) == false) {
            return false;
        }
        BackupVault rhs = ((BackupVault) other);
        return new EqualsBuilder().append(backupVaultTags, rhs.backupVaultTags).append(encryptionKeyArn, rhs.encryptionKeyArn).append(accessPolicy, rhs.accessPolicy).append(backupVaultName, rhs.backupVaultName).append(notifications, rhs.notifications).isEquals();
    }

}
