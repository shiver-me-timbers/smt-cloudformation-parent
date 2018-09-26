
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StageTransition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Reason",
    "StageName"
})
public class StageTransition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-reason
     * 
     */
    @JsonProperty("Reason")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-reason")
    private CharSequence reason;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-stagename
     * 
     */
    @JsonProperty("StageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-stagename")
    private CharSequence stageName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-reason
     * 
     */
    public CharSequence getReason() {
        return reason;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-reason
     * 
     */
    public void setReason(CharSequence reason) {
        this.reason = reason;
    }

    public StageTransition withReason(CharSequence reason) {
        this.reason = reason;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-stagename
     * 
     */
    public CharSequence getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-disableinboundstagetransitions.html#cfn-codepipeline-pipeline-disableinboundstagetransitions-stagename
     * 
     */
    public void setStageName(CharSequence stageName) {
        this.stageName = stageName;
    }

    public StageTransition withStageName(CharSequence stageName) {
        this.stageName = stageName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("reason", reason).append("stageName", stageName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(reason).append(stageName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StageTransition) == false) {
            return false;
        }
        StageTransition rhs = ((StageTransition) other);
        return new EqualsBuilder().append(reason, rhs.reason).append(stageName, rhs.stageName).isEquals();
    }

}
