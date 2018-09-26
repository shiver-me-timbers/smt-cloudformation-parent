
package aws.inspector;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AssessmentTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AssessmentTargetArn",
    "DurationInSeconds",
    "AssessmentTemplateName",
    "RulesPackageArns",
    "UserAttributesForFindings"
})
public class AssessmentTemplate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn
     * 
     */
    @JsonProperty("AssessmentTargetArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn")
    private CharSequence assessmentTargetArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds
     * 
     */
    @JsonProperty("DurationInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds")
    private Integer durationInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename
     * 
     */
    @JsonProperty("AssessmentTemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename")
    private CharSequence assessmentTemplateName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns
     * 
     */
    @JsonProperty("RulesPackageArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns")
    private List<CharSequence> rulesPackageArns = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings
     * 
     */
    @JsonProperty("UserAttributesForFindings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings")
    private List<Tag> userAttributesForFindings = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn
     * 
     */
    public CharSequence getAssessmentTargetArn() {
        return assessmentTargetArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn
     * 
     */
    public void setAssessmentTargetArn(CharSequence assessmentTargetArn) {
        this.assessmentTargetArn = assessmentTargetArn;
    }

    public AssessmentTemplate withAssessmentTargetArn(CharSequence assessmentTargetArn) {
        this.assessmentTargetArn = assessmentTargetArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds
     * 
     */
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds
     * 
     */
    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public AssessmentTemplate withDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename
     * 
     */
    public CharSequence getAssessmentTemplateName() {
        return assessmentTemplateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename
     * 
     */
    public void setAssessmentTemplateName(CharSequence assessmentTemplateName) {
        this.assessmentTemplateName = assessmentTemplateName;
    }

    public AssessmentTemplate withAssessmentTemplateName(CharSequence assessmentTemplateName) {
        this.assessmentTemplateName = assessmentTemplateName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns
     * 
     */
    public List<CharSequence> getRulesPackageArns() {
        return rulesPackageArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns
     * 
     */
    public void setRulesPackageArns(List<CharSequence> rulesPackageArns) {
        this.rulesPackageArns = rulesPackageArns;
    }

    public AssessmentTemplate withRulesPackageArns(List<CharSequence> rulesPackageArns) {
        this.rulesPackageArns = rulesPackageArns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings
     * 
     */
    public List<Tag> getUserAttributesForFindings() {
        return userAttributesForFindings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings
     * 
     */
    public void setUserAttributesForFindings(List<Tag> userAttributesForFindings) {
        this.userAttributesForFindings = userAttributesForFindings;
    }

    public AssessmentTemplate withUserAttributesForFindings(List<Tag> userAttributesForFindings) {
        this.userAttributesForFindings = userAttributesForFindings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("assessmentTargetArn", assessmentTargetArn).append("durationInSeconds", durationInSeconds).append("assessmentTemplateName", assessmentTemplateName).append("rulesPackageArns", rulesPackageArns).append("userAttributesForFindings", userAttributesForFindings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(assessmentTargetArn).append(durationInSeconds).append(assessmentTemplateName).append(rulesPackageArns).append(userAttributesForFindings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssessmentTemplate) == false) {
            return false;
        }
        AssessmentTemplate rhs = ((AssessmentTemplate) other);
        return new EqualsBuilder().append(assessmentTargetArn, rhs.assessmentTargetArn).append(durationInSeconds, rhs.durationInSeconds).append(assessmentTemplateName, rhs.assessmentTemplateName).append(rulesPackageArns, rhs.rulesPackageArns).append(userAttributesForFindings, rhs.userAttributesForFindings).isEquals();
    }

}
