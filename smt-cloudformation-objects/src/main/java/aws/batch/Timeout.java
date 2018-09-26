
package aws.batch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Timeout
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AttemptDurationSeconds"
})
public class Timeout {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds
     * 
     */
    @JsonProperty("AttemptDurationSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds")
    private Integer attemptDurationSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds
     * 
     */
    public Integer getAttemptDurationSeconds() {
        return attemptDurationSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html#cfn-batch-jobdefinition-timeout-attemptdurationseconds
     * 
     */
    public void setAttemptDurationSeconds(Integer attemptDurationSeconds) {
        this.attemptDurationSeconds = attemptDurationSeconds;
    }

    public Timeout withAttemptDurationSeconds(Integer attemptDurationSeconds) {
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
        if ((other instanceof Timeout) == false) {
            return false;
        }
        Timeout rhs = ((Timeout) other);
        return new EqualsBuilder().append(attemptDurationSeconds, rhs.attemptDurationSeconds).isEquals();
    }

}
