
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Step
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ActionOnFailure",
    "HadoopJarStep",
    "JobFlowId",
    "Name"
})
public class Step {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-actiononfailure
     * 
     */
    @JsonProperty("ActionOnFailure")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-actiononfailure")
    private CharSequence actionOnFailure;
    /**
     * HadoopJarStepConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html
     * 
     */
    @JsonProperty("HadoopJarStep")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html")
    private HadoopJarStepConfig hadoopJarStep;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-jobflowid
     * 
     */
    @JsonProperty("JobFlowId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-jobflowid")
    private CharSequence jobFlowId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-actiononfailure
     * 
     */
    public CharSequence getActionOnFailure() {
        return actionOnFailure;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-actiononfailure
     * 
     */
    public void setActionOnFailure(CharSequence actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }

    public Step withActionOnFailure(CharSequence actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
        return this;
    }

    /**
     * HadoopJarStepConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html
     * 
     */
    public HadoopJarStepConfig getHadoopJarStep() {
        return hadoopJarStep;
    }

    /**
     * HadoopJarStepConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-step-hadoopjarstepconfig.html
     * 
     */
    public void setHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
    }

    public Step withHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-jobflowid
     * 
     */
    public CharSequence getJobFlowId() {
        return jobFlowId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-jobflowid
     * 
     */
    public void setJobFlowId(CharSequence jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    public Step withJobFlowId(CharSequence jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-elasticmapreduce-step-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Step withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actionOnFailure", actionOnFailure).append("hadoopJarStep", hadoopJarStep).append("jobFlowId", jobFlowId).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(jobFlowId).append(hadoopJarStep).append(actionOnFailure).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Step) == false) {
            return false;
        }
        Step rhs = ((Step) other);
        return new EqualsBuilder().append(name, rhs.name).append(jobFlowId, rhs.jobFlowId).append(hadoopJarStep, rhs.hadoopJarStep).append(actionOnFailure, rhs.actionOnFailure).isEquals();
    }

}
