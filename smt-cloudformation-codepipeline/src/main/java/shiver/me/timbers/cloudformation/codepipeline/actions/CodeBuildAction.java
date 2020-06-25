package shiver.me.timbers.cloudformation.codepipeline.actions;

@SuppressWarnings({"rawtypes", "unchecked"})
public class CodeBuildAction extends Action<CodeBuildAction> {

    public static CodeBuildActions name(String name) {
        return new CodeBuildActions();
    }
}
