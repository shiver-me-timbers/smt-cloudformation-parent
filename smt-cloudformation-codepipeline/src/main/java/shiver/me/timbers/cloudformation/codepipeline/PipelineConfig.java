package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.aws.codepipeline.PipelineResource;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.List;
import java.util.Objects;

public class PipelineConfig {

    private final String resourceName;
    private final String pipelineName;
    private final List<Stage> stages;
    private BucketResource bucketResource;
    private RoleResource roleResource;

    public PipelineConfig(String resourceName, String pipelineName, List<Stage> stages) {
        this.resourceName = resourceName;
        this.pipelineName = pipelineName;
        this.stages = stages;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public RoleResource getRoleResource() {
        return roleResource;
    }

    public void setRoleResource(RoleResource roleResource) {
        this.roleResource = roleResource;
    }

    public BucketResource getBucketResource() {
        return bucketResource;
    }

    public void setBucketResource(BucketResource bucketResource) {
        this.bucketResource = bucketResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PipelineConfig that = (PipelineConfig) o;
        return Objects.equals(resourceName, that.resourceName) &&
            Objects.equals(pipelineName, that.pipelineName) &&
            Objects.equals(stages, that.stages) &&
            Objects.equals(bucketResource, that.bucketResource) &&
            Objects.equals(roleResource, that.roleResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceName, pipelineName, stages, bucketResource, roleResource);
    }
}
