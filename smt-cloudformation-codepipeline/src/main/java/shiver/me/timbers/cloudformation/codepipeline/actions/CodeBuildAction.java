package shiver.me.timbers.cloudformation.codepipeline.actions;

import shiver.me.timbers.cloudformation.codebuild.CodeBuild;

@SuppressWarnings({"rawtypes", "unchecked"})
public class CodeBuildAction extends Action<CodeBuildAction> {

    public static CodeBuildActions name(String name) {
        return new CodeBuildActions();
    }
}
