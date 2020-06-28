package shiver.me.timbers.cloudformation.codebuild;

import shiver.me.timbers.cloudformation.builders.Builders;

public class CodeBuildsFactory {

    private final Builders<CodeBuild, CodeBuildConfig> builders;

    public CodeBuildsFactory(Builders<CodeBuild, CodeBuildConfig> builders) {
        this.builders = builders;
    }

    public CodeBuilds create(CodeBuildConfig config) {
        return new CodeBuilds(builders, config);
    }
}
