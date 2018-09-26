
package aws.codepipeline;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Pipeline
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ArtifactStore",
    "DisableInboundStageTransitions",
    "Name",
    "RestartExecutionOnUpdate",
    "RoleArn",
    "Stages"
})
public class Pipeline {

    /**
     * ArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    @JsonProperty("ArtifactStore")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html")
    private ArtifactStore artifactStore;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    @JsonProperty("DisableInboundStageTransitions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions")
    private Set<StageTransition> disableInboundStageTransitions = new LinkedHashSet<StageTransition>();
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
    private Boolean restartExecutionOnUpdate;
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
    private Set<StageDeclaration> stages = new LinkedHashSet<StageDeclaration>();

    /**
     * ArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    public ArtifactStore getArtifactStore() {
        return artifactStore;
    }

    /**
     * ArtifactStore
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
     * 
     */
    public void setArtifactStore(ArtifactStore artifactStore) {
        this.artifactStore = artifactStore;
    }

    public Pipeline withArtifactStore(ArtifactStore artifactStore) {
        this.artifactStore = artifactStore;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    public Set<StageTransition> getDisableInboundStageTransitions() {
        return disableInboundStageTransitions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-disableinboundstagetransitions
     * 
     */
    public void setDisableInboundStageTransitions(Set<StageTransition> disableInboundStageTransitions) {
        this.disableInboundStageTransitions = disableInboundStageTransitions;
    }

    public Pipeline withDisableInboundStageTransitions(Set<StageTransition> disableInboundStageTransitions) {
        this.disableInboundStageTransitions = disableInboundStageTransitions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-name
     * 
     */
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
    public Boolean getRestartExecutionOnUpdate() {
        return restartExecutionOnUpdate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-restartexecutiononupdate
     * 
     */
    public void setRestartExecutionOnUpdate(Boolean restartExecutionOnUpdate) {
        this.restartExecutionOnUpdate = restartExecutionOnUpdate;
    }

    public Pipeline withRestartExecutionOnUpdate(Boolean restartExecutionOnUpdate) {
        this.restartExecutionOnUpdate = restartExecutionOnUpdate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-rolearn
     * 
     */
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
    public Set<StageDeclaration> getStages() {
        return stages;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html#cfn-codepipeline-pipeline-stages
     * 
     */
    public void setStages(Set<StageDeclaration> stages) {
        this.stages = stages;
    }

    public Pipeline withStages(Set<StageDeclaration> stages) {
        this.stages = stages;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("artifactStore", artifactStore).append("disableInboundStageTransitions", disableInboundStageTransitions).append("name", name).append("restartExecutionOnUpdate", restartExecutionOnUpdate).append("roleArn", roleArn).append("stages", stages).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(artifactStore).append(roleArn).append(name).append(stages).append(restartExecutionOnUpdate).append(disableInboundStageTransitions).toHashCode();
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
        return new EqualsBuilder().append(artifactStore, rhs.artifactStore).append(roleArn, rhs.roleArn).append(name, rhs.name).append(stages, rhs.stages).append(restartExecutionOnUpdate, rhs.restartExecutionOnUpdate).append(disableInboundStageTransitions, rhs.disableInboundStageTransitions).isEquals();
    }

}
