
package shiver.me.timbers.aws.elasticsearch;

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
 * DomainSnapshotOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AutomatedSnapshotStartHour"
})
public class DomainSnapshotOptions implements Property<DomainSnapshotOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour
     * 
     */
    @JsonProperty("AutomatedSnapshotStartHour")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour")
    private Number automatedSnapshotStartHour;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour
     * 
     */
    @JsonIgnore
    public Number getAutomatedSnapshotStartHour() {
        return automatedSnapshotStartHour;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour
     * 
     */
    @JsonIgnore
    public void setAutomatedSnapshotStartHour(Number automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = automatedSnapshotStartHour;
    }

    public DomainSnapshotOptions withAutomatedSnapshotStartHour(Number automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = automatedSnapshotStartHour;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("automatedSnapshotStartHour", automatedSnapshotStartHour).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(automatedSnapshotStartHour).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainSnapshotOptions) == false) {
            return false;
        }
        DomainSnapshotOptions rhs = ((DomainSnapshotOptions) other);
        return new EqualsBuilder().append(automatedSnapshotStartHour, rhs.automatedSnapshotStartHour).isEquals();
    }

}
