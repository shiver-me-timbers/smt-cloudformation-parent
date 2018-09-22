
package aws.datapipeline;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PipelineObject
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Fields",
    "Id",
    "Name"
})
public class PipelineObject {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-fields
     * 
     */
    @JsonProperty("Fields")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-fields")
    private List<Field> fields = new ArrayList<Field>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-id")
    private String id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-name")
    private String name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-fields
     * 
     */
    @JsonProperty("Fields")
    public List<Field> getFields() {
        return fields;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-fields
     * 
     */
    @JsonProperty("Fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public PipelineObject withFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-id
     * 
     */
    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-id
     * 
     */
    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    public PipelineObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobjects.html#cfn-datapipeline-pipeline-pipelineobjects-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public PipelineObject withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fields", fields).append("id", id).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(fields).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PipelineObject) == false) {
            return false;
        }
        PipelineObject rhs = ((PipelineObject) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(fields, rhs.fields).isEquals();
    }

}
