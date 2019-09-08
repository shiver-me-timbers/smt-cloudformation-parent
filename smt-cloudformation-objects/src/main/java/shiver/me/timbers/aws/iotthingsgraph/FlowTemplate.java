
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
 * FlowTemplate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CompatibleNamespaceVersion",
    "Definition"
})
public class FlowTemplate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion
     * 
     */
    @JsonProperty("CompatibleNamespaceVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion")
    private Number compatibleNamespaceVersion;
    /**
     * FlowTemplateDefinitionDocument
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html
     * 
     */
    @JsonProperty("Definition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html")
    private Property<FlowTemplateDefinitionDocument> definition;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion
     * 
     */
    @JsonIgnore
    public Number getCompatibleNamespaceVersion() {
        return compatibleNamespaceVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotthingsgraph-flowtemplate.html#cfn-iotthingsgraph-flowtemplate-compatiblenamespaceversion
     * 
     */
    @JsonIgnore
    public void setCompatibleNamespaceVersion(Number compatibleNamespaceVersion) {
        this.compatibleNamespaceVersion = compatibleNamespaceVersion;
    }

    public FlowTemplate withCompatibleNamespaceVersion(Number compatibleNamespaceVersion) {
        this.compatibleNamespaceVersion = compatibleNamespaceVersion;
        return this;
    }

    /**
     * FlowTemplateDefinitionDocument
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html
     * 
     */
    @JsonIgnore
    public Property<FlowTemplateDefinitionDocument> getDefinition() {
        return definition;
    }

    /**
     * FlowTemplateDefinitionDocument
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotthingsgraph-flowtemplate-definitiondocument.html
     * 
     */
    @JsonIgnore
    public void setDefinition(Property<FlowTemplateDefinitionDocument> definition) {
        this.definition = definition;
    }

    public FlowTemplate withDefinition(Property<FlowTemplateDefinitionDocument> definition) {
        this.definition = definition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("compatibleNamespaceVersion", compatibleNamespaceVersion).append("definition", definition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(definition).append(compatibleNamespaceVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlowTemplate) == false) {
            return false;
        }
        FlowTemplate rhs = ((FlowTemplate) other);
        return new EqualsBuilder().append(definition, rhs.definition).append(compatibleNamespaceVersion, rhs.compatibleNamespaceVersion).isEquals();
    }

}
