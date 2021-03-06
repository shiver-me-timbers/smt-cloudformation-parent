
package shiver.me.timbers.aws.ses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * TemplateTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HtmlPart",
    "TextPart",
    "TemplateName",
    "SubjectPart"
})
public class TemplateTemplate implements Property<TemplateTemplate>
{

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
    @JsonIgnore
    public CharSequence getHtmlPart() {
        return htmlPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart
     * 
     */
    @JsonIgnore
    public void setHtmlPart(CharSequence htmlPart) {
        this.htmlPart = htmlPart;
    }

    public TemplateTemplate withHtmlPart(CharSequence htmlPart) {
        this.htmlPart = htmlPart;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart
     * 
     */
    @JsonIgnore
    public CharSequence getTextPart() {
        return textPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart
     * 
     */
    @JsonIgnore
    public void setTextPart(CharSequence textPart) {
        this.textPart = textPart;
    }

    public TemplateTemplate withTextPart(CharSequence textPart) {
        this.textPart = textPart;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateName() {
        return templateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename
     * 
     */
    @JsonIgnore
    public void setTemplateName(CharSequence templateName) {
        this.templateName = templateName;
    }

    public TemplateTemplate withTemplateName(CharSequence templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart
     * 
     */
    @JsonIgnore
    public CharSequence getSubjectPart() {
        return subjectPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart
     * 
     */
    @JsonIgnore
    public void setSubjectPart(CharSequence subjectPart) {
        this.subjectPart = subjectPart;
    }

    public TemplateTemplate withSubjectPart(CharSequence subjectPart) {
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
        if ((other instanceof TemplateTemplate) == false) {
            return false;
        }
        TemplateTemplate rhs = ((TemplateTemplate) other);
        return new EqualsBuilder().append(htmlPart, rhs.htmlPart).append(textPart, rhs.textPart).append(templateName, rhs.templateName).append(subjectPart, rhs.subjectPart).isEquals();
    }

}
