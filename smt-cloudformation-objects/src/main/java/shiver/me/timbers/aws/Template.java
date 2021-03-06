
package shiver.me.timbers.aws;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.fn.ConditionFunction;


/**
 * Template
 * <p>
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AWSTemplateFormatVersion",
    "Description",
    "Metadata",
    "Parameters",
    "Mappings",
    "Conditions",
    "Resources",
    "Outputs"
})
public class Template implements HasConditions<Template> , HasOutputs<Template, Output> , HasParameters<Template, Parameter> , HasResources<Template, Resource>
{

    @JsonProperty("AWSTemplateFormatVersion")
    private java.lang.String aWSTemplateFormatVersion = "2010-09-09";
    @JsonProperty("Description")
    private java.lang.String description;
    @JsonProperty("Metadata")
    private Map<String, Object> metadata;
    @JsonProperty("Parameters")
    private Map<String, Parameter> parameters;
    @JsonProperty("Mappings")
    private Map<String, Map<String, Map<String, String>>> mappings;
    @JsonProperty("Conditions")
    private Map<String, ConditionFunction> conditions;
    @JsonProperty("Resources")
    private Map<String, Resource> resources;
    @JsonProperty("Outputs")
    private Map<String, Output> outputs;

    @JsonIgnore
    public java.lang.String getAWSTemplateFormatVersion() {
        return aWSTemplateFormatVersion;
    }

    @JsonIgnore
    public void setAWSTemplateFormatVersion(java.lang.String aWSTemplateFormatVersion) {
        this.aWSTemplateFormatVersion = aWSTemplateFormatVersion;
    }

    public Template withAWSTemplateFormatVersion(java.lang.String aWSTemplateFormatVersion) {
        this.aWSTemplateFormatVersion = aWSTemplateFormatVersion;
        return this;
    }

    @JsonIgnore
    public java.lang.String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public Template withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonIgnore
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    @JsonIgnore
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public Template withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonIgnore
    public Map<String, Parameter> getParameters() {
        return parameters;
    }

    @JsonIgnore
    public void setParameters(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Template withParameters(Map<String, Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    @JsonIgnore
    public Map<String, Map<String, Map<String, String>>> getMappings() {
        return mappings;
    }

    @JsonIgnore
    public void setMappings(Map<String, Map<String, Map<String, String>>> mappings) {
        this.mappings = mappings;
    }

    public Template withMappings(Map<String, Map<String, Map<String, String>>> mappings) {
        this.mappings = mappings;
        return this;
    }

    @JsonIgnore
    public Map<String, ConditionFunction> getConditions() {
        return conditions;
    }

    @JsonIgnore
    public void setConditions(Map<String, ConditionFunction> conditions) {
        this.conditions = conditions;
    }

    public Template withConditions(Map<String, ConditionFunction> conditions) {
        this.conditions = conditions;
        return this;
    }

    @JsonIgnore
    public Map<String, Resource> getResources() {
        return resources;
    }

    @JsonIgnore
    public void setResources(Map<String, Resource> resources) {
        this.resources = resources;
    }

    public Template withResources(Map<String, Resource> resources) {
        this.resources = resources;
        return this;
    }

    @JsonIgnore
    public Map<String, Output> getOutputs() {
        return outputs;
    }

    @JsonIgnore
    public void setOutputs(Map<String, Output> outputs) {
        this.outputs = outputs;
    }

    public Template withOutputs(Map<String, Output> outputs) {
        this.outputs = outputs;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("aWSTemplateFormatVersion", aWSTemplateFormatVersion).append("description", description).append("metadata", metadata).append("parameters", parameters).append("mappings", mappings).append("conditions", conditions).append("resources", resources).append("outputs", outputs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outputs).append(metadata).append(mappings).append(aWSTemplateFormatVersion).append(description).append(resources).append(conditions).append(parameters).toHashCode();
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Template) == false) {
            return false;
        }
        Template rhs = ((Template) other);
        return new EqualsBuilder().append(outputs, rhs.outputs).append(metadata, rhs.metadata).append(mappings, rhs.mappings).append(aWSTemplateFormatVersion, rhs.aWSTemplateFormatVersion).append(description, rhs.description).append(resources, rhs.resources).append(conditions, rhs.conditions).append(parameters, rhs.parameters).isEquals();
    }

}
