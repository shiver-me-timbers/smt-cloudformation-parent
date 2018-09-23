
package aws;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Template
 * <p>
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
public class Template {

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
    private Map<String, Object> conditions;
    @JsonProperty("Resources")
    private Map<String, Resource> resources;
    @JsonProperty("Outputs")
    private Map<String, Output> outputs;

    @JsonProperty("AWSTemplateFormatVersion")
    public java.lang.String getAWSTemplateFormatVersion() {
        return aWSTemplateFormatVersion;
    }

    @JsonProperty("AWSTemplateFormatVersion")
    public void setAWSTemplateFormatVersion(java.lang.String aWSTemplateFormatVersion) {
        this.aWSTemplateFormatVersion = aWSTemplateFormatVersion;
    }

    public Template withAWSTemplateFormatVersion(java.lang.String aWSTemplateFormatVersion) {
        this.aWSTemplateFormatVersion = aWSTemplateFormatVersion;
        return this;
    }

    @JsonProperty("Description")
    public java.lang.String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public Template withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Metadata")
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    @JsonProperty("Metadata")
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public Template withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonProperty("Parameters")
    public Map<String, Parameter> getParameters() {
        return parameters;
    }

    @JsonProperty("Parameters")
    public void setParameters(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Template withParameters(Map<String, Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    @JsonProperty("Mappings")
    public Map<String, Map<String, Map<String, String>>> getMappings() {
        return mappings;
    }

    @JsonProperty("Mappings")
    public void setMappings(Map<String, Map<String, Map<String, String>>> mappings) {
        this.mappings = mappings;
    }

    public Template withMappings(Map<String, Map<String, Map<String, String>>> mappings) {
        this.mappings = mappings;
        return this;
    }

    @JsonProperty("Conditions")
    public Map<String, Object> getConditions() {
        return conditions;
    }

    @JsonProperty("Conditions")
    public void setConditions(Map<String, Object> conditions) {
        this.conditions = conditions;
    }

    public Template withConditions(Map<String, Object> conditions) {
        this.conditions = conditions;
        return this;
    }

    @JsonProperty("Resources")
    public Map<String, Resource> getResources() {
        return resources;
    }

    @JsonProperty("Resources")
    public void setResources(Map<String, Resource> resources) {
        this.resources = resources;
    }

    public Template withResources(Map<String, Resource> resources) {
        this.resources = resources;
        return this;
    }

    @JsonProperty("Outputs")
    public Map<String, Output> getOutputs() {
        return outputs;
    }

    @JsonProperty("Outputs")
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