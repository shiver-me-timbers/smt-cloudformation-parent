
package aws.datapipeline;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Pipeline
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Activate",
    "Description",
    "Name",
    "ParameterObjects",
    "ParameterValues",
    "PipelineObjects",
    "PipelineTags"
})
public class Pipeline {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate
     * 
     */
    @JsonProperty("Activate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate")
    private Boolean activate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects
     * 
     */
    @JsonProperty("ParameterObjects")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects")
    private List<Property<ParameterObject>> parameterObjects = new ArrayList<Property<ParameterObject>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues
     * 
     */
    @JsonProperty("ParameterValues")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues")
    private List<Property<ParameterValue>> parameterValues = new ArrayList<Property<ParameterValue>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects
     * 
     */
    @JsonProperty("PipelineObjects")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects")
    private List<Property<PipelineObject>> pipelineObjects = new ArrayList<Property<PipelineObject>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags
     * 
     */
    @JsonProperty("PipelineTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags")
    private List<Property<PipelineTag>> pipelineTags = new ArrayList<Property<PipelineTag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate
     * 
     */
    @JsonIgnore
    public Boolean getActivate() {
        return activate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate
     * 
     */
    @JsonIgnore
    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    public Pipeline withActivate(Boolean activate) {
        this.activate = activate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Pipeline withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Pipeline withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects
     * 
     */
    @JsonIgnore
    public List<Property<ParameterObject>> getParameterObjects() {
        return parameterObjects;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects
     * 
     */
    @JsonIgnore
    public void setParameterObjects(List<Property<ParameterObject>> parameterObjects) {
        this.parameterObjects = parameterObjects;
    }

    public Pipeline withParameterObjects(List<Property<ParameterObject>> parameterObjects) {
        this.parameterObjects = parameterObjects;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues
     * 
     */
    @JsonIgnore
    public List<Property<ParameterValue>> getParameterValues() {
        return parameterValues;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues
     * 
     */
    @JsonIgnore
    public void setParameterValues(List<Property<ParameterValue>> parameterValues) {
        this.parameterValues = parameterValues;
    }

    public Pipeline withParameterValues(List<Property<ParameterValue>> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects
     * 
     */
    @JsonIgnore
    public List<Property<PipelineObject>> getPipelineObjects() {
        return pipelineObjects;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects
     * 
     */
    @JsonIgnore
    public void setPipelineObjects(List<Property<PipelineObject>> pipelineObjects) {
        this.pipelineObjects = pipelineObjects;
    }

    public Pipeline withPipelineObjects(List<Property<PipelineObject>> pipelineObjects) {
        this.pipelineObjects = pipelineObjects;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags
     * 
     */
    @JsonIgnore
    public List<Property<PipelineTag>> getPipelineTags() {
        return pipelineTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags
     * 
     */
    @JsonIgnore
    public void setPipelineTags(List<Property<PipelineTag>> pipelineTags) {
        this.pipelineTags = pipelineTags;
    }

    public Pipeline withPipelineTags(List<Property<PipelineTag>> pipelineTags) {
        this.pipelineTags = pipelineTags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("activate", activate).append("description", description).append("name", name).append("parameterObjects", parameterObjects).append("parameterValues", parameterValues).append("pipelineObjects", pipelineObjects).append("pipelineTags", pipelineTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pipelineObjects).append(activate).append(name).append(description).append(pipelineTags).append(parameterObjects).append(parameterValues).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pipeline) == false) {
            return false;
        }
        Pipeline rhs = ((Pipeline) other);
        return new EqualsBuilder().append(pipelineObjects, rhs.pipelineObjects).append(activate, rhs.activate).append(name, rhs.name).append(description, rhs.description).append(pipelineTags, rhs.pipelineTags).append(parameterObjects, rhs.parameterObjects).append(parameterValues, rhs.parameterValues).isEquals();
    }

}
