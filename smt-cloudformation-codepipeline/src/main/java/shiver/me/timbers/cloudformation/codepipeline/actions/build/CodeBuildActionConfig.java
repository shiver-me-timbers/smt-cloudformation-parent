package shiver.me.timbers.cloudformation.codepipeline.actions.build;

import shiver.me.timbers.cloudformation.codebuild.CodeBuild;

import java.util.List;

public class CodeBuildActionConfig {

    private String name;
    private CodeBuild codeBuild;
    private List<String> inputArtifacts;

    public CodeBuildActionConfig() {
    }

    public CodeBuildActionConfig(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCodeBuild(CodeBuild codeBuild) {
        this.codeBuild = codeBuild;
    }

    public CodeBuild getCodeBuild() {
        return codeBuild;
    }

    public List<String> getInputArtifacts() {
        return inputArtifacts;
    }

    public void setInputArtifacts(List<String> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }
}
