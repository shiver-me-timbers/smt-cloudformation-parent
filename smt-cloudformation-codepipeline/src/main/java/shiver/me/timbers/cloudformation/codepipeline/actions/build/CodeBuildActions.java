package shiver.me.timbers.cloudformation.codepipeline.actions.build;

import shiver.me.timbers.cloudformation.codebuild.CodeBuild;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class CodeBuildActions {

    private final CodeBuildActionConfig config;

    public CodeBuildActions(CodeBuildActionConfig config) {
        this.config = config;
    }

    public CodeBuildActions codeBuild(CodeBuild codeBuild) {
        config.setCodeBuild(codeBuild);
        return this;
    }

    public CodeBuildActions inputArtifacts(String... sourceOutputArtifacts) {
        config.setInputArtifacts(new ArrayList<>(asList(sourceOutputArtifacts)));
        return this;
    }

    public CodeBuildAction build() {
        final CodeBuildAction codeBuildAction = new CodeBuildAction();
        codeBuildAction.setName(config.getName());
        codeBuildAction.setCodeBuild(config.getCodeBuild());
        codeBuildAction.inputArtifacts(config.getInputArtifacts());
        return codeBuildAction;
    }
}
