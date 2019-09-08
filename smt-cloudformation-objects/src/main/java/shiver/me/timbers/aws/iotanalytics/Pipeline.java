
package shiver.me.timbers.aws.iotanalytics;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Pipeline
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PipelineName",
    "Tags",
    "PipelineActivities"
})
public class Pipeline {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelinename
     * 
     */
    @JsonProperty("PipelineName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelinename")
    private CharSequence pipelineName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities
     * 
     */
    @JsonProperty("PipelineActivities")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities")
    private List<Property<PipelineActivity>> pipelineActivities = new ArrayList<Property<PipelineActivity>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelinename
     * 
     */
    @JsonIgnore
    public CharSequence getPipelineName() {
        return pipelineName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelinename
     * 
     */
    @JsonIgnore
    public void setPipelineName(CharSequence pipelineName) {
        this.pipelineName = pipelineName;
    }

    public Pipeline withPipelineName(CharSequence pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Pipeline withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities
     * 
     */
    @JsonIgnore
    public List<Property<PipelineActivity>> getPipelineActivities() {
        return pipelineActivities;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities
     * 
     */
    @JsonIgnore
    public void setPipelineActivities(List<Property<PipelineActivity>> pipelineActivities) {
        this.pipelineActivities = pipelineActivities;
    }

    public Pipeline withPipelineActivities(List<Property<PipelineActivity>> pipelineActivities) {
        this.pipelineActivities = pipelineActivities;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pipelineName", pipelineName).append("tags", tags).append("pipelineActivities", pipelineActivities).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pipelineName).append(pipelineActivities).append(tags).toHashCode();
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
        return new EqualsBuilder().append(pipelineName, rhs.pipelineName).append(pipelineActivities, rhs.pipelineActivities).append(tags, rhs.tags).isEquals();
    }

}
