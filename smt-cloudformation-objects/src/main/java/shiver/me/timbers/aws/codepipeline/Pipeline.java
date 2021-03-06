
package shiver.me.timbers.aws.codepipeline;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Pipeline
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ArtifactStore",
    "ArtifactStores",
    "DisableInboundStageTransitions",
    "Name",
    "RestartExecutionOnUpdate",
    "RoleArn",
    "Stages",
    "Tags"
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores
     * 
     */
    @JsonProperty("ArtifactStores")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores")
    private Set<Property<PipelineArtifactStoreMap>> artifactStores = new LinkedHashSet<Property<PipelineArtifactStoreMap>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    @JsonProperty("DisableInboundStageTransitions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions")
    private Set<Property<PipelineStageTransition>> disableInboundStageTransitions = new LinkedHashSet<Property<PipelineStageTransition>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name")
    private CharSequence name;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages
     * 
     */
    @JsonProperty("Stages")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages")
    private Set<Property<PipelineStageDeclaration>> stages = new LinkedHashSet<Property<PipelineStageDeclaration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores
     * 
     */
    @JsonIgnore
    public Set<Property<PipelineArtifactStoreMap>> getArtifactStores() {
        return artifactStores;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-artifactstores
     * 
     */
    @JsonIgnore
    public void setArtifactStores(Set<Property<PipelineArtifactStoreMap>> artifactStores) {
        this.artifactStores = artifactStores;
    }

    public Pipeline withArtifactStores(Set<Property<PipelineArtifactStoreMap>> artifactStores) {
        this.artifactStores = artifactStores;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    @JsonIgnore
    public Set<Property<PipelineStageTransition>> getDisableInboundStageTransitions() {
        return disableInboundStageTransitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    @JsonIgnore
    public void setDisableInboundStageTransitions(Set<Property<PipelineStageTransition>> disableInboundStageTransitions) {
        this.disableInboundStageTransitions = disableInboundStageTransitions;
    }

    public Pipeline withDisableInboundStageTransitions(Set<Property<PipelineStageTransition>> disableInboundStageTransitions) {
        this.disableInboundStageTransitions = disableInboundStageTransitions;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages
     * 
     */
    @JsonIgnore
    public Set<Property<PipelineStageDeclaration>> getStages() {
        return stages;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages
     * 
     */
    @JsonIgnore
    public void setStages(Set<Property<PipelineStageDeclaration>> stages) {
        this.stages = stages;
    }

    public Pipeline withStages(Set<Property<PipelineStageDeclaration>> stages) {
        this.stages = stages;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-tags
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("artifactStore", artifactStore).append("artifactStores", artifactStores).append("disableInboundStageTransitions", disableInboundStageTransitions).append("name", name).append("restartExecutionOnUpdate", restartExecutionOnUpdate).append("roleArn", roleArn).append("stages", stages).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(artifactStore).append(roleArn).append(name).append(stages).append(artifactStores).append(restartExecutionOnUpdate).append(disableInboundStageTransitions).append(tags).toHashCode();
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
        return new EqualsBuilder().append(artifactStore, rhs.artifactStore).append(roleArn, rhs.roleArn).append(name, rhs.name).append(stages, rhs.stages).append(artifactStores, rhs.artifactStores).append(restartExecutionOnUpdate, rhs.restartExecutionOnUpdate).append(disableInboundStageTransitions, rhs.disableInboundStageTransitions).append(tags, rhs.tags).isEquals();
    }

}
