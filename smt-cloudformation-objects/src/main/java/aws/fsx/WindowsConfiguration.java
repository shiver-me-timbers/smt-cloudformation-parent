
package aws.fsx;

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
 * WindowsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "WeeklyMaintenanceStartTime",
    "ActiveDirectoryId",
    "ThroughputCapacity",
    "CopyTagsToBackups",
    "DailyAutomaticBackupStartTime",
    "AutomaticBackupRetentionDays"
})
public class WindowsConfiguration implements Property<WindowsConfiguration>
{

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity
     * 
     */
    @JsonProperty("ThroughputCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity")
    private Integer throughputCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups
     * 
     */
    @JsonProperty("CopyTagsToBackups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups")
    private Boolean copyTagsToBackups;
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
    private Integer automaticBackupRetentionDays;

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

    public WindowsConfiguration withWeeklyMaintenanceStartTime(CharSequence weeklyMaintenanceStartTime) {
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

    public WindowsConfiguration withActiveDirectoryId(CharSequence activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity
     * 
     */
    @JsonIgnore
    public Integer getThroughputCapacity() {
        return throughputCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity
     * 
     */
    @JsonIgnore
    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    public WindowsConfiguration withThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups
     * 
     */
    @JsonIgnore
    public Boolean getCopyTagsToBackups() {
        return copyTagsToBackups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups
     * 
     */
    @JsonIgnore
    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    public WindowsConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
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

    public WindowsConfiguration withDailyAutomaticBackupStartTime(CharSequence dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-automaticbackupretentiondays
     * 
     */
    @JsonIgnore
    public Integer getAutomaticBackupRetentionDays() {
        return automaticBackupRetentionDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-automaticbackupretentiondays
     * 
     */
    @JsonIgnore
    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    public WindowsConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("weeklyMaintenanceStartTime", weeklyMaintenanceStartTime).append("activeDirectoryId", activeDirectoryId).append("throughputCapacity", throughputCapacity).append("copyTagsToBackups", copyTagsToBackups).append("dailyAutomaticBackupStartTime", dailyAutomaticBackupStartTime).append("automaticBackupRetentionDays", automaticBackupRetentionDays).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(throughputCapacity).append(activeDirectoryId).append(weeklyMaintenanceStartTime).append(copyTagsToBackups).append(dailyAutomaticBackupStartTime).append(automaticBackupRetentionDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WindowsConfiguration) == false) {
            return false;
        }
        WindowsConfiguration rhs = ((WindowsConfiguration) other);
        return new EqualsBuilder().append(throughputCapacity, rhs.throughputCapacity).append(activeDirectoryId, rhs.activeDirectoryId).append(weeklyMaintenanceStartTime, rhs.weeklyMaintenanceStartTime).append(copyTagsToBackups, rhs.copyTagsToBackups).append(dailyAutomaticBackupStartTime, rhs.dailyAutomaticBackupStartTime).append(automaticBackupRetentionDays, rhs.automaticBackupRetentionDays).isEquals();
    }

}
