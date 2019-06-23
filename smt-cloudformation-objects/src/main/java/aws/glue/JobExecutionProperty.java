
package aws.glue;

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
 * JobExecutionProperty
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxConcurrentRuns"
})
public class JobExecutionProperty implements Property<JobExecutionProperty>
{

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
    @JsonIgnore
    public Double getMaxConcurrentRuns() {
        return maxConcurrentRuns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html#cfn-glue-job-executionproperty-maxconcurrentruns
     * 
     */
    @JsonIgnore
    public void setMaxConcurrentRuns(Double maxConcurrentRuns) {
        this.maxConcurrentRuns = maxConcurrentRuns;
    }

    public JobExecutionProperty withMaxConcurrentRuns(Double maxConcurrentRuns) {
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
        if ((other instanceof JobExecutionProperty) == false) {
            return false;
        }
        JobExecutionProperty rhs = ((JobExecutionProperty) other);
        return new EqualsBuilder().append(maxConcurrentRuns, rhs.maxConcurrentRuns).isEquals();
    }

}
