
package aws.dms;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ReplicationTask
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReplicationTaskSettings",
    "TableMappings",
    "ReplicationTaskIdentifier",
    "SourceEndpointArn",
    "MigrationType",
    "TargetEndpointArn",
    "ReplicationInstanceArn",
    "Tags",
    "CdcStartTime"
})
public class ReplicationTask {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings
     * 
     */
    @JsonProperty("ReplicationTaskSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings")
    private String replicationTaskSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings
     * 
     */
    @JsonProperty("TableMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings")
    private String tableMappings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier
     * 
     */
    @JsonProperty("ReplicationTaskIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier")
    private String replicationTaskIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn
     * 
     */
    @JsonProperty("SourceEndpointArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn")
    private String sourceEndpointArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype
     * 
     */
    @JsonProperty("MigrationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype")
    private String migrationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn
     * 
     */
    @JsonProperty("TargetEndpointArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn")
    private String targetEndpointArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn
     * 
     */
    @JsonProperty("ReplicationInstanceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn")
    private String replicationInstanceArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime
     * 
     */
    @JsonProperty("CdcStartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime")
    private Double cdcStartTime;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings
     * 
     */
    @JsonProperty("ReplicationTaskSettings")
    public String getReplicationTaskSettings() {
        return replicationTaskSettings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtasksettings
     * 
     */
    @JsonProperty("ReplicationTaskSettings")
    public void setReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    public ReplicationTask withReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings
     * 
     */
    @JsonProperty("TableMappings")
    public String getTableMappings() {
        return tableMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tablemappings
     * 
     */
    @JsonProperty("TableMappings")
    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    public ReplicationTask withTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier
     * 
     */
    @JsonProperty("ReplicationTaskIdentifier")
    public String getReplicationTaskIdentifier() {
        return replicationTaskIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationtaskidentifier
     * 
     */
    @JsonProperty("ReplicationTaskIdentifier")
    public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
    }

    public ReplicationTask withReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn
     * 
     */
    @JsonProperty("SourceEndpointArn")
    public String getSourceEndpointArn() {
        return sourceEndpointArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-sourceendpointarn
     * 
     */
    @JsonProperty("SourceEndpointArn")
    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    public ReplicationTask withSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype
     * 
     */
    @JsonProperty("MigrationType")
    public String getMigrationType() {
        return migrationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-migrationtype
     * 
     */
    @JsonProperty("MigrationType")
    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    public ReplicationTask withMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn
     * 
     */
    @JsonProperty("TargetEndpointArn")
    public String getTargetEndpointArn() {
        return targetEndpointArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-targetendpointarn
     * 
     */
    @JsonProperty("TargetEndpointArn")
    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    public ReplicationTask withTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn
     * 
     */
    @JsonProperty("ReplicationInstanceArn")
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-replicationinstancearn
     * 
     */
    @JsonProperty("ReplicationInstanceArn")
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    public ReplicationTask withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ReplicationTask withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime
     * 
     */
    @JsonProperty("CdcStartTime")
    public Double getCdcStartTime() {
        return cdcStartTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationtask.html#cfn-dms-replicationtask-cdcstarttime
     * 
     */
    @JsonProperty("CdcStartTime")
    public void setCdcStartTime(Double cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    public ReplicationTask withCdcStartTime(Double cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("replicationTaskSettings", replicationTaskSettings).append("tableMappings", tableMappings).append("replicationTaskIdentifier", replicationTaskIdentifier).append("sourceEndpointArn", sourceEndpointArn).append("migrationType", migrationType).append("targetEndpointArn", targetEndpointArn).append("replicationInstanceArn", replicationInstanceArn).append("tags", tags).append("cdcStartTime", cdcStartTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetEndpointArn).append(tableMappings).append(replicationInstanceArn).append(cdcStartTime).append(migrationType).append(replicationTaskIdentifier).append(sourceEndpointArn).append(replicationTaskSettings).append(tags).toHashCode();
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
        return new EqualsBuilder().append(targetEndpointArn, rhs.targetEndpointArn).append(tableMappings, rhs.tableMappings).append(replicationInstanceArn, rhs.replicationInstanceArn).append(cdcStartTime, rhs.cdcStartTime).append(migrationType, rhs.migrationType).append(replicationTaskIdentifier, rhs.replicationTaskIdentifier).append(sourceEndpointArn, rhs.sourceEndpointArn).append(replicationTaskSettings, rhs.replicationTaskSettings).append(tags, rhs.tags).isEquals();
    }

}
