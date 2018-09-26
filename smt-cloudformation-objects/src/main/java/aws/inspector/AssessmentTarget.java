
package aws.inspector;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AssessmentTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AssessmentTargetName",
    "ResourceGroupArn"
})
public class AssessmentTarget {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname
     * 
     */
    @JsonProperty("AssessmentTargetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname")
    private CharSequence assessmentTargetName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn
     * 
     */
    @JsonProperty("ResourceGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn")
    private CharSequence resourceGroupArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname
     * 
     */
    public CharSequence getAssessmentTargetName() {
        return assessmentTargetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname
     * 
     */
    public void setAssessmentTargetName(CharSequence assessmentTargetName) {
        this.assessmentTargetName = assessmentTargetName;
    }

    public AssessmentTarget withAssessmentTargetName(CharSequence assessmentTargetName) {
        this.assessmentTargetName = assessmentTargetName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn
     * 
     */
    public CharSequence getResourceGroupArn() {
        return resourceGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn
     * 
     */
    public void setResourceGroupArn(CharSequence resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    public AssessmentTarget withResourceGroupArn(CharSequence resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("assessmentTargetName", assessmentTargetName).append("resourceGroupArn", resourceGroupArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(assessmentTargetName).append(resourceGroupArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssessmentTarget) == false) {
            return false;
        }
        AssessmentTarget rhs = ((AssessmentTarget) other);
        return new EqualsBuilder().append(assessmentTargetName, rhs.assessmentTargetName).append(resourceGroupArn, rhs.resourceGroupArn).isEquals();
    }

}
