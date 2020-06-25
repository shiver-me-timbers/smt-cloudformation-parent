package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.ArrayList;
import java.util.List;

public class PipelineConfig {

    private String resourceName;
    private String pipelineName;
    private List<Stage> stages = new ArrayList<>();
    private BucketResource bucketResource;
    private RoleResource roleResource;

    public PipelineConfig() {
    }

    public PipelineConfig(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }

    public void addStage(Stage stage) {
        stages.add(stage);
    }

    public BucketResource getBucketResource() {
        return bucketResource;
    }

    public void setBucketResource(BucketResource bucketResource) {
        this.bucketResource = bucketResource;
    }

    public RoleResource getRoleResource() {
        return roleResource;
    }

    public void setRoleResource(RoleResource roleResource) {
        this.roleResource = roleResource;
    }
}
