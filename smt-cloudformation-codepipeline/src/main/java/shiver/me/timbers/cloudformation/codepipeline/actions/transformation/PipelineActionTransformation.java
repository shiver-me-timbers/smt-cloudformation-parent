package shiver.me.timbers.cloudformation.codepipeline.actions.transformation;

import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;

@SuppressWarnings("rawtypes")
public interface PipelineActionTransformation<A extends Action> {

    boolean supports(Action action);

    PipelineActionDeclaration apply(PipelineConfig config, Action<A> action);
}
