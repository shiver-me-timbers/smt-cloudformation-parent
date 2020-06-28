package shiver.me.timbers.cloudformation.codebuild;

import shiver.me.timbers.aws.codebuild.ProjectResource;
import shiver.me.timbers.aws.iam.RoleResource;

public class CodeBuildConfig {

    private String resourceName;
    private String projectName;
    private String description;
    private String buildSpec;
    private Source source;
    private ArtifactType artifectType;
    private ProjectResource projectResource;
    private RoleResource roleResource;

    public CodeBuildConfig() {
    }

    public CodeBuildConfig(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getBuildSpec() {
        return buildSpec;
    }

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    public ArtifactType getArtifectType() {
        return artifectType;
    }

    public void setArtifectType(ArtifactType artifectType) {
        this.artifectType = artifectType;
    }

    public RoleResource getRoleResource() {
        return roleResource;
    }

    public void setRoleResource(RoleResource roleResource) {
        this.roleResource = roleResource;
    }


    public ProjectResource getProjectResource() {
        return projectResource;
    }

    public void setProjectResource(ProjectResource projectResource) {
        this.projectResource = projectResource;
    }
}
