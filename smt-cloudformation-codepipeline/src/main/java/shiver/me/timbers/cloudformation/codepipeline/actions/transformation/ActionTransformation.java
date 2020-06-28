package shiver.me.timbers.cloudformation.codepipeline.actions.transformation;

import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;
import shiver.me.timbers.cloudformation.codepipeline.actions.source.Source;

@SuppressWarnings("rawtypes")
public class ActionTransformation implements PipelineActionTransformation {

    @Override
    public boolean supports(Action action) {
        return Action.class.equals(action.getClass()) || Source.class.equals(action.getClass());
    }

    @Override
    public PipelineActionDeclaration apply(PipelineConfig config, Action action) {
        return action;
    }
}
