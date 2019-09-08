
package shiver.me.timbers.aws.iotthingsgraph;

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
 * FlowTemplateDefinitionDocument
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Language",
    "Text"
})
public class FlowTemplateDefinitionDocument implements Property<FlowTemplateDefinitionDocument>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-language
     * 
     */
    @JsonProperty("Language")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-language")
    private CharSequence language;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-text
     * 
     */
    @JsonProperty("Text")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-text")
    private CharSequence text;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-language
     * 
     */
    @JsonIgnore
    public CharSequence getLanguage() {
        return language;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-language
     * 
     */
    @JsonIgnore
    public void setLanguage(CharSequence language) {
        this.language = language;
    }

    public FlowTemplateDefinitionDocument withLanguage(CharSequence language) {
        this.language = language;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-text
     * 
     */
    @JsonIgnore
    public CharSequence getText() {
        return text;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html#cfn-iotthingsgraph-flowtemplate-definitiondocument-text
     * 
     */
    @JsonIgnore
    public void setText(CharSequence text) {
        this.text = text;
    }

    public FlowTemplateDefinitionDocument withText(CharSequence text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("language", language).append("text", text).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(language).append(text).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlowTemplateDefinitionDocument) == false) {
            return false;
        }
        FlowTemplateDefinitionDocument rhs = ((FlowTemplateDefinitionDocument) other);
        return new EqualsBuilder().append(language, rhs.language).append(text, rhs.text).isEquals();
    }

}
