package shiver.me.timbers.cloudformation.codebuild;

import shiver.me.timbers.aws.codebuild.Project;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;

public class CodeBuild extends Project implements PipelineAction {

    CodeBuild() {
    }

    public static CodeBuilds resource(String name) {
        throw new UnsupportedOperationException();
    }
}
