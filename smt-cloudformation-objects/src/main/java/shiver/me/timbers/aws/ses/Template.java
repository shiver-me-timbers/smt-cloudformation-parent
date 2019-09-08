
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
 * Template
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Template"
})
public class Template {

    /**
     * TemplateTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html
     * 
     */
    @JsonProperty("Template")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html")
    private Property<TemplateTemplate> template;

    /**
     * TemplateTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html
     * 
     */
    @JsonIgnore
    public Property<TemplateTemplate> getTemplate() {
        return template;
    }

    /**
     * TemplateTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html
     * 
     */
    @JsonIgnore
    public void setTemplate(Property<TemplateTemplate> template) {
        this.template = template;
    }

    public Template withTemplate(Property<TemplateTemplate> template) {
        this.template = template;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("template", template).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(template).toHashCode();
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
        return new EqualsBuilder().append(template, rhs.template).isEquals();
    }

}
