package shiver.me.timbers.cloudformation.codebuild.builders;

import shiver.me.timbers.aws.codebuild.ProjectArtifacts;
import shiver.me.timbers.cloudformation.builders.Builder;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;

public class ArtifactsBuilder implements Builder<CodeBuild, CodeBuildConfig> {

    @Override
    public void apply(CodeBuild codeBuild, CodeBuildConfig config) {
        config.getProjectResource().getProperties().setArtifacts(
            new ProjectArtifacts().withType(config.getArtifectType())
        );
    }
}
