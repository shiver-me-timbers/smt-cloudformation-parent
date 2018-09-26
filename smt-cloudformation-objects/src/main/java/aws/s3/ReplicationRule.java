
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ReplicationRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Destination",
    "Id",
    "Prefix",
    "SourceSelectionCriteria",
    "Status"
})
public class ReplicationRule {

    /**
     * ReplicationDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
     * 
     */
    @JsonProperty("Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html")
    private ReplicationDestination destination;
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
     * SourceSelectionCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
     * 
     */
    @JsonProperty("SourceSelectionCriteria")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html")
    private SourceSelectionCriteria sourceSelectionCriteria;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status")
    private CharSequence status;

    /**
     * ReplicationDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
     * 
     */
    public ReplicationDestination getDestination() {
        return destination;
    }

    /**
     * ReplicationDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
     * 
     */
    public void setDestination(ReplicationDestination destination) {
        this.destination = destination;
    }

    public ReplicationRule withDestination(ReplicationDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public ReplicationRule withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix
     * 
     */
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-prefix
     * 
     */
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public ReplicationRule withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * SourceSelectionCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
     * 
     */
    public SourceSelectionCriteria getSourceSelectionCriteria() {
        return sourceSelectionCriteria;
    }

    /**
     * SourceSelectionCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
     * 
     */
    public void setSourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
    }

    public ReplicationRule withSourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status
     * 
     */
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules.html#cfn-s3-bucket-replicationconfiguration-rules-status
     * 
     */
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public ReplicationRule withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destination", destination).append("id", id).append("prefix", prefix).append("sourceSelectionCriteria", sourceSelectionCriteria).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destination).append(id).append(sourceSelectionCriteria).append(prefix).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationRule) == false) {
            return false;
        }
        ReplicationRule rhs = ((ReplicationRule) other);
        return new EqualsBuilder().append(destination, rhs.destination).append(id, rhs.id).append(sourceSelectionCriteria, rhs.sourceSelectionCriteria).append(prefix, rhs.prefix).append(status, rhs.status).isEquals();
    }

}
