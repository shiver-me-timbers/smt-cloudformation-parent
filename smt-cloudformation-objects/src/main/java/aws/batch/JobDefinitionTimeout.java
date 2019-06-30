
package aws.batch;

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
 * JobDefinitionTimeout
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AttemptDurationSeconds"
})
public class JobDefinitionTimeout implements Property<JobDefinitionTimeout>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds
     * 
     */
    @JsonProperty("AttemptDurationSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds")
    private Number attemptDurationSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds
     * 
     */
    @JsonIgnore
    public Number getAttemptDurationSeconds() {
        return attemptDurationSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds
     * 
     */
    @JsonIgnore
    public void setAttemptDurationSeconds(Number attemptDurationSeconds) {
        this.attemptDurationSeconds = attemptDurationSeconds;
    }

    public JobDefinitionTimeout withAttemptDurationSeconds(Number attemptDurationSeconds) {
        this.attemptDurationSeconds = attemptDurationSeconds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attemptDurationSeconds", attemptDurationSeconds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attemptDurationSeconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobDefinitionTimeout) == false) {
            return false;
        }
        JobDefinitionTimeout rhs = ((JobDefinitionTimeout) other);
        return new EqualsBuilder().append(attemptDurationSeconds, rhs.attemptDurationSeconds).isEquals();
    }

}
