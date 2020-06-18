
package shiver.me.timbers.aws.fsx;

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
 * FileSystemWindowsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SelfManagedActiveDirectoryConfiguration",
    "WeeklyMaintenanceStartTime",
    "ActiveDirectoryId",
    "DeploymentType",
    "ThroughputCapacity",
    "CopyTagsToBackups",
    "DailyAutomaticBackupStartTime",
    "AutomaticBackupRetentionDays",
    "PreferredSubnetId"
})
public class FileSystemWindowsConfiguration implements Property<FileSystemWindowsConfiguration>
{

    /**
     * FileSystemSelfManagedActiveDirectoryConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration-selfmanagedactivedirectoryconfiguration.html
     * 
     */
    @JsonProperty("SelfManagedActiveDirectoryConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration-selfmanagedactivedirectoryconfiguration.html")
    private Property<FileSystemSelfManagedActiveDirectoryConfiguration> selfManagedActiveDirectoryConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-weeklymaintenancestarttime
     * 
     */
    @JsonProperty("WeeklyMaintenanceStartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-weeklymaintenancestarttime")
    private CharSequence weeklyMaintenanceStartTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-activedirectoryid
     * 
     */
    @JsonProperty("ActiveDirectoryId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-activedirectoryid")
    private CharSequence activeDirectoryId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-deploymenttype
     * 
     */
    @JsonProperty("DeploymentType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-deploymenttype")
    private CharSequence deploymentType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity
     * 
     */
    @JsonProperty("ThroughputCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity")
    private Number throughputCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups
     * 
     */
    @JsonProperty("CopyTagsToBackups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups")
    private CharSequence copyTagsToBackups;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-dailyautomaticbackupstarttime
     * 
     */
    @JsonProperty("DailyAutomaticBackupStartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-dailyautomaticbackupstarttime")
    private CharSequence dailyAutomaticBackupStartTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-automaticbackupretentiondays
     * 
     */
    @JsonProperty("AutomaticBackupRetentionDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-automaticbackupretentiondays")
    private Number automaticBackupRetentionDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-preferredsubnetid
     * 
     */
    @JsonProperty("PreferredSubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-preferredsubnetid")
    private CharSequence preferredSubnetId;

    /**
     * FileSystemSelfManagedActiveDirectoryConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration-selfmanagedactivedirectoryconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<FileSystemSelfManagedActiveDirectoryConfiguration> getSelfManagedActiveDirectoryConfiguration() {
        return selfManagedActiveDirectoryConfiguration;
    }

    /**
     * FileSystemSelfManagedActiveDirectoryConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration-selfmanagedactivedirectoryconfiguration.html
     * 
     */
    @JsonIgnore
    public void setSelfManagedActiveDirectoryConfiguration(Property<FileSystemSelfManagedActiveDirectoryConfiguration> selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    public FileSystemWindowsConfiguration withSelfManagedActiveDirectoryConfiguration(Property<FileSystemSelfManagedActiveDirectoryConfiguration> selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-weeklymaintenancestarttime
     * 
     */
    @JsonIgnore
    public CharSequence getWeeklyMaintenanceStartTime() {
        return weeklyMaintenanceStartTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-weeklymaintenancestarttime
     * 
     */
    @JsonIgnore
    public void setWeeklyMaintenanceStartTime(CharSequence weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    public FileSystemWindowsConfiguration withWeeklyMaintenanceStartTime(CharSequence weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-activedirectoryid
     * 
     */
    @JsonIgnore
    public CharSequence getActiveDirectoryId() {
        return activeDirectoryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-activedirectoryid
     * 
     */
    @JsonIgnore
    public void setActiveDirectoryId(CharSequence activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    public FileSystemWindowsConfiguration withActiveDirectoryId(CharSequence activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-deploymenttype
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentType() {
        return deploymentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-deploymenttype
     * 
     */
    @JsonIgnore
    public void setDeploymentType(CharSequence deploymentType) {
        this.deploymentType = deploymentType;
    }

    public FileSystemWindowsConfiguration withDeploymentType(CharSequence deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity
     * 
     */
    @JsonIgnore
    public Number getThroughputCapacity() {
        return throughputCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity
     * 
     */
    @JsonIgnore
    public void setThroughputCapacity(Number throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    public FileSystemWindowsConfiguration withThroughputCapacity(Number throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups
     * 
     */
    @JsonIgnore
    public CharSequence getCopyTagsToBackups() {
        return copyTagsToBackups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups
     * 
     */
    @JsonIgnore
    public void setCopyTagsToBackups(CharSequence copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    public FileSystemWindowsConfiguration withCopyTagsToBackups(CharSequence copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-dailyautomaticbackupstarttime
     * 
     */
    @JsonIgnore
    public CharSequence getDailyAutomaticBackupStartTime() {
        return dailyAutomaticBackupStartTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-dailyautomaticbackupstarttime
     * 
     */
    @JsonIgnore
    public void setDailyAutomaticBackupStartTime(CharSequence dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    public FileSystemWindowsConfiguration withDailyAutomaticBackupStartTime(CharSequence dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-automaticbackupretentiondays
     * 
     */
    @JsonIgnore
    public Number getAutomaticBackupRetentionDays() {
        return automaticBackupRetentionDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-automaticbackupretentiondays
     * 
     */
    @JsonIgnore
    public void setAutomaticBackupRetentionDays(Number automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    public FileSystemWindowsConfiguration withAutomaticBackupRetentionDays(Number automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-preferredsubnetid
     * 
     */
    @JsonIgnore
    public CharSequence getPreferredSubnetId() {
        return preferredSubnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-preferredsubnetid
     * 
     */
    @JsonIgnore
    public void setPreferredSubnetId(CharSequence preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
    }

    public FileSystemWindowsConfiguration withPreferredSubnetId(CharSequence preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("selfManagedActiveDirectoryConfiguration", selfManagedActiveDirectoryConfiguration).append("weeklyMaintenanceStartTime", weeklyMaintenanceStartTime).append("activeDirectoryId", activeDirectoryId).append("deploymentType", deploymentType).append("throughputCapacity", throughputCapacity).append("copyTagsToBackups", copyTagsToBackups).append("dailyAutomaticBackupStartTime", dailyAutomaticBackupStartTime).append("automaticBackupRetentionDays", automaticBackupRetentionDays).append("preferredSubnetId", preferredSubnetId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(throughputCapacity).append(activeDirectoryId).append(deploymentType).append(selfManagedActiveDirectoryConfiguration).append(weeklyMaintenanceStartTime).append(copyTagsToBackups).append(dailyAutomaticBackupStartTime).append(preferredSubnetId).append(automaticBackupRetentionDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileSystemWindowsConfiguration) == false) {
            return false;
        }
        FileSystemWindowsConfiguration rhs = ((FileSystemWindowsConfiguration) other);
        return new EqualsBuilder().append(throughputCapacity, rhs.throughputCapacity).append(activeDirectoryId, rhs.activeDirectoryId).append(deploymentType, rhs.deploymentType).append(selfManagedActiveDirectoryConfiguration, rhs.selfManagedActiveDirectoryConfiguration).append(weeklyMaintenanceStartTime, rhs.weeklyMaintenanceStartTime).append(copyTagsToBackups, rhs.copyTagsToBackups).append(dailyAutomaticBackupStartTime, rhs.dailyAutomaticBackupStartTime).append(preferredSubnetId, rhs.preferredSubnetId).append(automaticBackupRetentionDays, rhs.automaticBackupRetentionDays).isEquals();
    }

}
