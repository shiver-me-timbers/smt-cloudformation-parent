
package aws.autoscalingplans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScalingPlan
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApplicationSource",
    "ScalingInstructions"
})
public class ScalingPlan {

    /**
     * ApplicationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html
     * 
     */
    @JsonProperty("ApplicationSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html")
    private ApplicationSource applicationSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions
     * 
     */
    @JsonProperty("ScalingInstructions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions")
    private List<ScalingInstruction> scalingInstructions = new ArrayList<ScalingInstruction>();

    /**
     * ApplicationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html
     * 
     */
    @JsonIgnore
    public ApplicationSource getApplicationSource() {
        return applicationSource;
    }

    /**
     * ApplicationSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html
     * 
     */
    @JsonIgnore
    public void setApplicationSource(ApplicationSource applicationSource) {
        this.applicationSource = applicationSource;
    }

    public ScalingPlan withApplicationSource(ApplicationSource applicationSource) {
        this.applicationSource = applicationSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions
     * 
     */
    @JsonIgnore
    public List<ScalingInstruction> getScalingInstructions() {
        return scalingInstructions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscalingplans-scalingplan.html#cfn-autoscalingplans-scalingplan-scalinginstructions
     * 
     */
    @JsonIgnore
    public void setScalingInstructions(List<ScalingInstruction> scalingInstructions) {
        this.scalingInstructions = scalingInstructions;
    }

    public ScalingPlan withScalingInstructions(List<ScalingInstruction> scalingInstructions) {
        this.scalingInstructions = scalingInstructions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationSource", applicationSource).append("scalingInstructions", scalingInstructions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scalingInstructions).append(applicationSource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingPlan) == false) {
            return false;
        }
        ScalingPlan rhs = ((ScalingPlan) other);
        return new EqualsBuilder().append(scalingInstructions, rhs.scalingInstructions).append(applicationSource, rhs.applicationSource).isEquals();
    }

}
