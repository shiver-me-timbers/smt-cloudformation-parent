package shiver.me.timbers.cloudformation.codepipeline.actions.transformations;

import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;

public class ActionTransformation implements PipelineActionTransformation {

    @Override
    public boolean supports(PipelineAction action) {
        return action instanceof Action;
    }

    @Override
    public PipelineActionDeclaration apply(PipelineConfig config, PipelineAction action) {
        return (PipelineActionDeclaration) action;
    }
}
