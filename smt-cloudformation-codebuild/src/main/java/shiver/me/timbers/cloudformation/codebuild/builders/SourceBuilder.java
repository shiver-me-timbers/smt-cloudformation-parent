package shiver.me.timbers.cloudformation.codebuild.builders;

import shiver.me.timbers.cloudformation.builders.Builder;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;
import shiver.me.timbers.cloudformation.codebuild.Source;

public class SourceBuilder implements Builder<CodeBuild, CodeBuildConfig> {

    @Override
    public void apply(CodeBuild codeBuild, CodeBuildConfig config) {
        final Source source = config.getSource() == null ? new Source() : config.getSource();
        source.setBuildSpec(config.getBuildSpec());
        config.getProjectResource().getProperties().setSource(source);
    }
}
