
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Condition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "State",
    "LogicalOperator",
    "JobName"
})
public class Condition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state
     * 
     */
    @JsonProperty("State")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state")
    private String state;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator
     * 
     */
    @JsonProperty("LogicalOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator")
    private String logicalOperator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname
     * 
     */
    @JsonProperty("JobName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname")
    private String jobName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state
     * 
     */
    @JsonProperty("State")
    public String getState() {
        return state;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state
     * 
     */
    @JsonProperty("State")
    public void setState(String state) {
        this.state = state;
    }

    public Condition withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator
     * 
     */
    @JsonProperty("LogicalOperator")
    public String getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator
     * 
     */
    @JsonProperty("LogicalOperator")
    public void setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public Condition withLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname
     * 
     */
    @JsonProperty("JobName")
    public String getJobName() {
        return jobName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname
     * 
     */
    @JsonProperty("JobName")
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Condition withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("state", state).append("logicalOperator", logicalOperator).append("jobName", jobName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jobName).append(state).append(logicalOperator).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Condition) == false) {
            return false;
        }
        Condition rhs = ((Condition) other);
        return new EqualsBuilder().append(jobName, rhs.jobName).append(state, rhs.state).append(logicalOperator, rhs.logicalOperator).isEquals();
    }

}
