
package shiver.me.timbers.aws.pinpoint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EmailTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HtmlPart",
    "TextPart",
    "TemplateName",
    "TemplateDescription",
    "DefaultSubstitutions",
    "Subject",
    "Tags"
})
public class EmailTemplate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-htmlpart
     * 
     */
    @JsonProperty("HtmlPart")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-htmlpart")
    private CharSequence htmlPart;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart
     * 
     */
    @JsonProperty("TextPart")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart")
    private CharSequence textPart;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename
     * 
     */
    @JsonProperty("TemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename")
    private CharSequence templateName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription
     * 
     */
    @JsonProperty("TemplateDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription")
    private CharSequence templateDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-defaultsubstitutions
     * 
     */
    @JsonProperty("DefaultSubstitutions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-defaultsubstitutions")
    private CharSequence defaultSubstitutions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject
     * 
     */
    @JsonProperty("Subject")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject")
    private CharSequence subject;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-tags")
    private Object tags;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-htmlpart
     * 
     */
    @JsonIgnore
    public CharSequence getHtmlPart() {
        return htmlPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-htmlpart
     * 
     */
    @JsonIgnore
    public void setHtmlPart(CharSequence htmlPart) {
        this.htmlPart = htmlPart;
    }

    public EmailTemplate withHtmlPart(CharSequence htmlPart) {
        this.htmlPart = htmlPart;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart
     * 
     */
    @JsonIgnore
    public CharSequence getTextPart() {
        return textPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart
     * 
     */
    @JsonIgnore
    public void setTextPart(CharSequence textPart) {
        this.textPart = textPart;
    }

    public EmailTemplate withTextPart(CharSequence textPart) {
        this.textPart = textPart;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateName() {
        return templateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename
     * 
     */
    @JsonIgnore
    public void setTemplateName(CharSequence templateName) {
        this.templateName = templateName;
    }

    public EmailTemplate withTemplateName(CharSequence templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription
     * 
     */
    @JsonIgnore
    public CharSequence getTemplateDescription() {
        return templateDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription
     * 
     */
    @JsonIgnore
    public void setTemplateDescription(CharSequence templateDescription) {
        this.templateDescription = templateDescription;
    }

    public EmailTemplate withTemplateDescription(CharSequence templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-defaultsubstitutions
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultSubstitutions() {
        return defaultSubstitutions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-defaultsubstitutions
     * 
     */
    @JsonIgnore
    public void setDefaultSubstitutions(CharSequence defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    public EmailTemplate withDefaultSubstitutions(CharSequence defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject
     * 
     */
    @JsonIgnore
    public CharSequence getSubject() {
        return subject;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject
     * 
     */
    @JsonIgnore
    public void setSubject(CharSequence subject) {
        this.subject = subject;
    }

    public EmailTemplate withSubject(CharSequence subject) {
        this.subject = subject;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public EmailTemplate withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("htmlPart", htmlPart).append("textPart", textPart).append("templateName", templateName).append("templateDescription", templateDescription).append("defaultSubstitutions", defaultSubstitutions).append("subject", subject).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(templateName).append(subject).append(templateDescription).append(htmlPart).append(textPart).append(defaultSubstitutions).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailTemplate) == false) {
            return false;
        }
        EmailTemplate rhs = ((EmailTemplate) other);
        return new EqualsBuilder().append(templateName, rhs.templateName).append(subject, rhs.subject).append(templateDescription, rhs.templateDescription).append(htmlPart, rhs.htmlPart).append(textPart, rhs.textPart).append(defaultSubstitutions, rhs.defaultSubstitutions).append(tags, rhs.tags).isEquals();
    }

}
