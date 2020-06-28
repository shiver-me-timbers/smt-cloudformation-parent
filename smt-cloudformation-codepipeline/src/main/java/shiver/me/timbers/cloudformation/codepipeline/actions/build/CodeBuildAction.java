package shiver.me.timbers.cloudformation.codepipeline.actions.build;

import com.fasterxml.jackson.annotation.JsonIgnore;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;

public class CodeBuildAction extends Action<CodeBuildAction> {

    @JsonIgnore
    private CodeBuild codeBuild;

    public static CodeBuildActions name(String name) {
        return new CodeBuildActions(new CodeBuildActionConfig(name));
    }

    public CodeBuild getCodeBuild() {
        return codeBuild;
    }

    public void setCodeBuild(CodeBuild codeBuild) {
        this.codeBuild = codeBuild;
    }
}
