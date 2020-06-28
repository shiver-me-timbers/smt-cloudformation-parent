package shiver.me.timbers.cloudformation.codepipeline.actions.build;

import shiver.me.timbers.cloudformation.codepipeline.actions.Action;

@SuppressWarnings({"rawtypes", "unchecked"})
public class CodeBuildAction extends Action<CodeBuildAction> {

    public static CodeBuildActions name(String name) {
        return new CodeBuildActions();
    }
}
