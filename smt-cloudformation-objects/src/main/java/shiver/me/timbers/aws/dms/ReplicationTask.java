
package shiver.me.timbers.aws.dms;

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
import shiver.me.timbers.aws.Tag;


/**
 * ReplicationTask
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReplicationTaskSettings",
    "TableMappings",
    "CdcStartPosition",
    "ReplicationTaskIdentifier",
    "CdcStopPosition",
    "SourceEndpointArn",
    "MigrationType",
    "TargetEndpointArn",
    "ReplicationInstanceArn",
    "Tags",
    "TaskData",
    "CdcStartTime"
})
public class ReplicationTask {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings
     * 
     */
    @JsonProperty("ReplicationTaskSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings")
    private CharSequence replicationTaskSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings
     * 
     */
    @JsonProperty("TableMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings")
    private CharSequence tableMappings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstartposition
     * 
     */
    @JsonProperty("CdcStartPosition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstartposition")
    private CharSequence cdcStartPosition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier
     * 
     */
    @JsonProperty("ReplicationTaskIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier")
    private CharSequence replicationTaskIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstopposition
     * 
     */
    @JsonProperty("CdcStopPosition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstopposition")
    private CharSequence cdcStopPosition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn
     * 
     */
    @JsonProperty("SourceEndpointArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn")
    private CharSequence sourceEndpointArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype
     * 
     */
    @JsonProperty("MigrationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype")
    private CharSequence migrationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn
     * 
     */
    @JsonProperty("TargetEndpointArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn")
    private CharSequence targetEndpointArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn
     * 
     */
    @JsonProperty("ReplicationInstanceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn")
    private CharSequence replicationInstanceArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata
     * 
     */
    @JsonProperty("TaskData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata")
    private CharSequence taskData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime
     * 
     */
    @JsonProperty("CdcStartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime")
    private Number cdcStartTime;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings
     * 
     */
    @JsonIgnore
    public CharSequence getReplicationTaskSettings() {
        return replicationTaskSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings
     * 
     */
    @JsonIgnore
    public void setReplicationTaskSettings(CharSequence replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    public ReplicationTask withReplicationTaskSettings(CharSequence replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings
     * 
     */
    @JsonIgnore
    public CharSequence getTableMappings() {
        return tableMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings
     * 
     */
    @JsonIgnore
    public void setTableMappings(CharSequence tableMappings) {
        this.tableMappings = tableMappings;
    }

    public ReplicationTask withTableMappings(CharSequence tableMappings) {
        this.tableMappings = tableMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstartposition
     * 
     */
    @JsonIgnore
    public CharSequence getCdcStartPosition() {
        return cdcStartPosition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstartposition
     * 
     */
    @JsonIgnore
    public void setCdcStartPosition(CharSequence cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    public ReplicationTask withCdcStartPosition(CharSequence cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getReplicationTaskIdentifier() {
        return replicationTaskIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier
     * 
     */
    @JsonIgnore
    public void setReplicationTaskIdentifier(CharSequence replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
    }

    public ReplicationTask withReplicationTaskIdentifier(CharSequence replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstopposition
     * 
     */
    @JsonIgnore
    public CharSequence getCdcStopPosition() {
        return cdcStopPosition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstopposition
     * 
     */
    @JsonIgnore
    public void setCdcStopPosition(CharSequence cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
    }

    public ReplicationTask withCdcStopPosition(CharSequence cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn
     * 
     */
    @JsonIgnore
    public CharSequence getSourceEndpointArn() {
        return sourceEndpointArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn
     * 
     */
    @JsonIgnore
    public void setSourceEndpointArn(CharSequence sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    public ReplicationTask withSourceEndpointArn(CharSequence sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype
     * 
     */
    @JsonIgnore
    public CharSequence getMigrationType() {
        return migrationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype
     * 
     */
    @JsonIgnore
    public void setMigrationType(CharSequence migrationType) {
        this.migrationType = migrationType;
    }

    public ReplicationTask withMigrationType(CharSequence migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn
     * 
     */
    @JsonIgnore
    public CharSequence getTargetEndpointArn() {
        return targetEndpointArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn
     * 
     */
    @JsonIgnore
    public void setTargetEndpointArn(CharSequence targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    public ReplicationTask withTargetEndpointArn(CharSequence targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn
     * 
     */
    @JsonIgnore
    public CharSequence getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn
     * 
     */
    @JsonIgnore
    public void setReplicationInstanceArn(CharSequence replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    public ReplicationTask withReplicationInstanceArn(CharSequence replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public ReplicationTask withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata
     * 
     */
    @JsonIgnore
    public CharSequence getTaskData() {
        return taskData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-taskdata
     * 
     */
    @JsonIgnore
    public void setTaskData(CharSequence taskData) {
        this.taskData = taskData;
    }

    public ReplicationTask withTaskData(CharSequence taskData) {
        this.taskData = taskData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime
     * 
     */
    @JsonIgnore
    public Number getCdcStartTime() {
        return cdcStartTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime
     * 
     */
    @JsonIgnore
    public void setCdcStartTime(Number cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    public ReplicationTask withCdcStartTime(Number cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("replicationTaskSettings", replicationTaskSettings).append("tableMappings", tableMappings).append("cdcStartPosition", cdcStartPosition).append("replicationTaskIdentifier", replicationTaskIdentifier).append("cdcStopPosition", cdcStopPosition).append("sourceEndpointArn", sourceEndpointArn).append("migrationType", migrationType).append("targetEndpointArn", targetEndpointArn).append("replicationInstanceArn", replicationInstanceArn).append("tags", tags).append("taskData", taskData).append("cdcStartTime", cdcStartTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cdcStartPosition).append(targetEndpointArn).append(taskData).append(migrationType).append(replicationTaskIdentifier).append(tags).append(tableMappings).append(replicationInstanceArn).append(cdcStopPosition).append(cdcStartTime).append(sourceEndpointArn).append(replicationTaskSettings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationTask) == false) {
            return false;
        }
        ReplicationTask rhs = ((ReplicationTask) other);
        return new EqualsBuilder().append(cdcStartPosition, rhs.cdcStartPosition).append(targetEndpointArn, rhs.targetEndpointArn).append(taskData, rhs.taskData).append(migrationType, rhs.migrationType).append(replicationTaskIdentifier, rhs.replicationTaskIdentifier).append(tags, rhs.tags).append(tableMappings, rhs.tableMappings).append(replicationInstanceArn, rhs.replicationInstanceArn).append(cdcStopPosition, rhs.cdcStopPosition).append(cdcStartTime, rhs.cdcStartTime).append(sourceEndpointArn, rhs.sourceEndpointArn).append(replicationTaskSettings, rhs.replicationTaskSettings).isEquals();
    }

}
