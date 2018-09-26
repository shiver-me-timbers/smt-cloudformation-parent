
package aws.elasticsearch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SnapshotOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AutomatedSnapshotStartHour"
})
public class SnapshotOptions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour
     * 
     */
    @JsonProperty("AutomatedSnapshotStartHour")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour")
    private Integer automatedSnapshotStartHour;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour
     * 
     */
    public Integer getAutomatedSnapshotStartHour() {
        return automatedSnapshotStartHour;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html#cfn-elasticsearch-domain-snapshotoptions-automatedsnapshotstarthour
     * 
     */
    public void setAutomatedSnapshotStartHour(Integer automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = automatedSnapshotStartHour;
    }

    public SnapshotOptions withAutomatedSnapshotStartHour(Integer automatedSnapshotStartHour) {
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
        if ((other instanceof SnapshotOptions) == false) {
            return false;
        }
        SnapshotOptions rhs = ((SnapshotOptions) other);
        return new EqualsBuilder().append(automatedSnapshotStartHour, rhs.automatedSnapshotStartHour).isEquals();
    }

}
