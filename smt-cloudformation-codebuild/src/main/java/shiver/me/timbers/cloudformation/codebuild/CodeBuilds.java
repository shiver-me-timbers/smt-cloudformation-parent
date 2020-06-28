package shiver.me.timbers.cloudformation.codebuild;

import shiver.me.timbers.cloudformation.builders.Builders;

public class CodeBuilds {

    private final Builders<CodeBuild, CodeBuildConfig> builders;
    private final CodeBuildConfig config;

    public CodeBuilds(Builders<CodeBuild, CodeBuildConfig> builders, CodeBuildConfig config) {
        this.builders = builders;
        this.config = config;
    }

    public CodeBuilds name(String name) {
        config.setProjectName(name);
        return this;
    }

    public CodeBuilds source(Source source) {
        config.setSource(source);
        return this;
    }

    public CodeBuilds description(String description) {
        config.setDescription(description);
        return this;
    }

    public CodeBuilds buildSpec(String buildSpec) {
        config.setBuildSpec(buildSpec);
        return this;
    }

    public CodeBuilds artifact(ArtifactType artifactType) {
        config.setArtifectType(artifactType);
        return this;
    }

    public CodeBuild build() {
        final CodeBuild codeBuild = new CodeBuild();
        builders.apply(codeBuild, config);
        return codeBuild;
    }
}
