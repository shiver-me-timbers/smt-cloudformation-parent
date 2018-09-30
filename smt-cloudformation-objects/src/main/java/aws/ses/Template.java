
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Template
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HtmlPart",
    "TextPart",
    "TemplateName",
    "SubjectPart"
})
public class Template {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart
     * 
     */
    @JsonProperty("HtmlPart")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart")
    private CharSequence htmlPart;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart
     * 
     */
    @JsonProperty("TextPart")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart")
    private CharSequence textPart;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename
     * 
     */
    @JsonProperty("TemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename")
    private CharSequence templateName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart
     * 
     */
    @JsonProperty("SubjectPart")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart")
    private CharSequence subjectPart;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart
     * 
     */
    public CharSequence getHtmlPart() {
        return htmlPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart
     * 
     */
    public void setHtmlPart(CharSequence htmlPart) {
        this.htmlPart = htmlPart;
    }

    public Template withHtmlPart(CharSequence htmlPart) {
        this.htmlPart = htmlPart;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart
     * 
     */
    public CharSequence getTextPart() {
        return textPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart
     * 
     */
    public void setTextPart(CharSequence textPart) {
        this.textPart = textPart;
    }

    public Template withTextPart(CharSequence textPart) {
        this.textPart = textPart;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename
     * 
     */
    public CharSequence getTemplateName() {
        return templateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename
     * 
     */
    public void setTemplateName(CharSequence templateName) {
        this.templateName = templateName;
    }

    public Template withTemplateName(CharSequence templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart
     * 
     */
    public CharSequence getSubjectPart() {
        return subjectPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart
     * 
     */
    public void setSubjectPart(CharSequence subjectPart) {
        this.subjectPart = subjectPart;
    }

    public Template withSubjectPart(CharSequence subjectPart) {
        this.subjectPart = subjectPart;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("htmlPart", htmlPart).append("textPart", textPart).append("templateName", templateName).append("subjectPart", subjectPart).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(htmlPart).append(textPart).append(templateName).append(subjectPart).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Template) == false) {
            return false;
        }
        Template rhs = ((Template) other);
        return new EqualsBuilder().append(htmlPart, rhs.htmlPart).append(textPart, rhs.textPart).append(templateName, rhs.templateName).append(subjectPart, rhs.subjectPart).isEquals();
    }

}
