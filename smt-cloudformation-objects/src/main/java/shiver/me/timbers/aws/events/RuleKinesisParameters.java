
package shiver.me.timbers.aws.events;

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
 * RuleKinesisParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PartitionKeyPath"
})
public class RuleKinesisParameters implements Property<RuleKinesisParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath
     * 
     */
    @JsonProperty("PartitionKeyPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath")
    private CharSequence partitionKeyPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath
     * 
     */
    @JsonIgnore
    public CharSequence getPartitionKeyPath() {
        return partitionKeyPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath
     * 
     */
    @JsonIgnore
    public void setPartitionKeyPath(CharSequence partitionKeyPath) {
        this.partitionKeyPath = partitionKeyPath;
    }

    public RuleKinesisParameters withPartitionKeyPath(CharSequence partitionKeyPath) {
        this.partitionKeyPath = partitionKeyPath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("partitionKeyPath", partitionKeyPath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(partitionKeyPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleKinesisParameters) == false) {
            return false;
        }
        RuleKinesisParameters rhs = ((RuleKinesisParameters) other);
        return new EqualsBuilder().append(partitionKeyPath, rhs.partitionKeyPath).isEquals();
    }

}
