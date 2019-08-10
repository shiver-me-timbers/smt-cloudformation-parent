
package aws.codepipeline;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ArtifactStore",
    "DisableInboundStageTransitions",
    "Stages",
    "RestartExecutionOnUpdate",
    "RoleArn",
    "Name"
})
public class Pipeline {

    /**
     * PipelineArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    @JsonProperty("ArtifactStore")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html")
    private Property<PipelineArtifactStore> artifactStore;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    @JsonProperty("DisableInboundStageTransitions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions")
    private List<Property<PipelineStageTransition>> disableInboundStageTransitions = new ArrayList<Property<PipelineStageTransition>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages
     * 
     */
    @JsonProperty("Stages")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages")
    private List<Property<PipelineStageDeclaration>> stages = new ArrayList<Property<PipelineStageDeclaration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate
     * 
     */
    @JsonProperty("RestartExecutionOnUpdate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate")
    private CharSequence restartExecutionOnUpdate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name")
    private CharSequence name;

    /**
     * PipelineArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    @JsonIgnore
    public Property<PipelineArtifactStore> getArtifactStore() {
        return artifactStore;
    }

    /**
     * PipelineArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    @JsonIgnore
    public void setArtifactStore(Property<PipelineArtifactStore> artifactStore) {
        this.artifactStore = artifactStore;
    }

    public Pipeline withArtifactStore(Property<PipelineArtifactStore> artifactStore) {
        this.artifactStore = artifactStore;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    @JsonIgnore
    public List<Property<PipelineStageTransition>> getDisableInboundStageTransitions() {
        return disableInboundStageTransitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    @JsonIgnore
    public void setDisableInboundStageTransitions(List<Property<PipelineStageTransition>> disableInboundStageTransitions) {
        this.disableInboundStageTransitions = disableInboundStageTransitions;
    }

    public Pipeline withDisableInboundStageTransitions(List<Property<PipelineStageTransition>> disableInboundStageTransitions) {
        this.disableInboundStageTransitions = disableInboundStageTransitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages
     * 
     */
    @JsonIgnore
    public List<Property<PipelineStageDeclaration>> getStages() {
        return stages;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages
     * 
     */
    @JsonIgnore
    public void setStages(List<Property<PipelineStageDeclaration>> stages) {
        this.stages = stages;
    }

    public Pipeline withStages(List<Property<PipelineStageDeclaration>> stages) {
        this.stages = stages;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate
     * 
     */
    @JsonIgnore
    public CharSequence getRestartExecutionOnUpdate() {
        return restartExecutionOnUpdate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate
     * 
     */
    @JsonIgnore
    public void setRestartExecutionOnUpdate(CharSequence restartExecutionOnUpdate) {
        this.restartExecutionOnUpdate = restartExecutionOnUpdate;
    }

    public Pipeline withRestartExecutionOnUpdate(CharSequence restartExecutionOnUpdate) {
        this.restartExecutionOnUpdate = restartExecutionOnUpdate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public Pipeline withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("artifactStore", artifactStore).append("disableInboundStageTransitions", disableInboundStageTransitions).append("stages", stages).append("restartExecutionOnUpdate", restartExecutionOnUpdate).append("roleArn", roleArn).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(artifactStore).append(roleArn).append(stages).append(name).append(restartExecutionOnUpdate).append(disableInboundStageTransitions).toHashCode();
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
        return new EqualsBuilder().append(artifactStore, rhs.artifactStore).append(roleArn, rhs.roleArn).append(stages, rhs.stages).append(name, rhs.name).append(restartExecutionOnUpdate, rhs.restartExecutionOnUpdate).append(disableInboundStageTransitions, rhs.disableInboundStageTransitions).isEquals();
    }

}
