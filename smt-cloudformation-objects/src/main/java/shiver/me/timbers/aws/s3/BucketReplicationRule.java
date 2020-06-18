
package shiver.me.timbers.aws.s3;

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
 * BucketReplicationRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeleteMarkerReplication",
    "Destination",
    "Filter",
    "Id",
    "Prefix",
    "Priority",
    "SourceSelectionCriteria",
    "Status"
})
public class BucketReplicationRule implements Property<BucketReplicationRule>
{

    /**
     * BucketDeleteMarkerReplication
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-deletemarkerreplication.html
     * 
     */
    @JsonProperty("DeleteMarkerReplication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-deletemarkerreplication.html")
    private Property<BucketDeleteMarkerReplication> deleteMarkerReplication;
    /**
     * BucketReplicationDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
     * 
     */
    @JsonProperty("Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html")
    private Property<BucketReplicationDestination> destination;
    /**
     * BucketReplicationRuleFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html")
    private Property<BucketReplicationRuleFilter> filter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix")
    private CharSequence prefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationrule-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationrule-priority")
    private Number priority;
    /**
     * BucketSourceSelectionCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
     * 
     */
    @JsonProperty("SourceSelectionCriteria")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html")
    private Property<BucketSourceSelectionCriteria> sourceSelectionCriteria;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status")
    private CharSequence status;

    /**
     * BucketDeleteMarkerReplication
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-deletemarkerreplication.html
     * 
     */
    @JsonIgnore
    public Property<BucketDeleteMarkerReplication> getDeleteMarkerReplication() {
        return deleteMarkerReplication;
    }

    /**
     * BucketDeleteMarkerReplication
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-deletemarkerreplication.html
     * 
     */
    @JsonIgnore
    public void setDeleteMarkerReplication(Property<BucketDeleteMarkerReplication> deleteMarkerReplication) {
        this.deleteMarkerReplication = deleteMarkerReplication;
    }

    public BucketReplicationRule withDeleteMarkerReplication(Property<BucketDeleteMarkerReplication> deleteMarkerReplication) {
        this.deleteMarkerReplication = deleteMarkerReplication;
        return this;
    }

    /**
     * BucketReplicationDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
     * 
     */
    @JsonIgnore
    public Property<BucketReplicationDestination> getDestination() {
        return destination;
    }

    /**
     * BucketReplicationDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
     * 
     */
    @JsonIgnore
    public void setDestination(Property<BucketReplicationDestination> destination) {
        this.destination = destination;
    }

    public BucketReplicationRule withDestination(Property<BucketReplicationDestination> destination) {
        this.destination = destination;
        return this;
    }

    /**
     * BucketReplicationRuleFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html
     * 
     */
    @JsonIgnore
    public Property<BucketReplicationRuleFilter> getFilter() {
        return filter;
    }

    /**
     * BucketReplicationRuleFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html
     * 
     */
    @JsonIgnore
    public void setFilter(Property<BucketReplicationRuleFilter> filter) {
        this.filter = filter;
    }

    public BucketReplicationRule withFilter(Property<BucketReplicationRuleFilter> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public BucketReplicationRule withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix
     * 
     */
    @JsonIgnore
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix
     * 
     */
    @JsonIgnore
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public BucketReplicationRule withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationrule-priority
     * 
     */
    @JsonIgnore
    public Number getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationrule-priority
     * 
     */
    @JsonIgnore
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    public BucketReplicationRule withPriority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * BucketSourceSelectionCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
     * 
     */
    @JsonIgnore
    public Property<BucketSourceSelectionCriteria> getSourceSelectionCriteria() {
        return sourceSelectionCriteria;
    }

    /**
     * BucketSourceSelectionCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
     * 
     */
    @JsonIgnore
    public void setSourceSelectionCriteria(Property<BucketSourceSelectionCriteria> sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
    }

    public BucketReplicationRule withSourceSelectionCriteria(Property<BucketSourceSelectionCriteria> sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status
     * 
     */
    @JsonIgnore
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status
     * 
     */
    @JsonIgnore
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public BucketReplicationRule withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deleteMarkerReplication", deleteMarkerReplication).append("destination", destination).append("filter", filter).append("id", id).append("prefix", prefix).append("priority", priority).append("sourceSelectionCriteria", sourceSelectionCriteria).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filter).append(prefix).append(destination).append(deleteMarkerReplication).append(id).append(priority).append(sourceSelectionCriteria).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketReplicationRule) == false) {
            return false;
        }
        BucketReplicationRule rhs = ((BucketReplicationRule) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(prefix, rhs.prefix).append(destination, rhs.destination).append(deleteMarkerReplication, rhs.deleteMarkerReplication).append(id, rhs.id).append(priority, rhs.priority).append(sourceSelectionCriteria, rhs.sourceSelectionCriteria).append(status, rhs.status).isEquals();
    }

}
