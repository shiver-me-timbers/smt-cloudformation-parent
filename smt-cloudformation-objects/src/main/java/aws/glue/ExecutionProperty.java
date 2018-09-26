
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ExecutionProperty
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MaxConcurrentRuns"
})
public class ExecutionProperty {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html#cfn-glue-job-executionproperty-maxconcurrentruns
     * 
     */
    @JsonProperty("MaxConcurrentRuns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html#cfn-glue-job-executionproperty-maxconcurrentruns")
    private Double maxConcurrentRuns;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html#cfn-glue-job-executionproperty-maxconcurrentruns
     * 
     */
    public Double getMaxConcurrentRuns() {
        return maxConcurrentRuns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html#cfn-glue-job-executionproperty-maxconcurrentruns
     * 
     */
    public void setMaxConcurrentRuns(Double maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
    }

    public ExecutionProperty withMaxConcurrentRuns(Double maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxConcurrentRuns", maxConcurrentRuns).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxConcurrentRuns).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExecutionProperty) == false) {
            return false;
        }
        ExecutionProperty rhs = ((ExecutionProperty) other);
        return new EqualsBuilder().append(maxConcurrentRuns, rhs.maxConcurrentRuns).isEquals();
    }

}
