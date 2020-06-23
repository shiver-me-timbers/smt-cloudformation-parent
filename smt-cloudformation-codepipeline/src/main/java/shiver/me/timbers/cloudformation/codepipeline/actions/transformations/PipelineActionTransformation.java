package shiver.me.timbers.cloudformation.codepipeline.actions.transformations;

import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;

public interface PipelineActionTransformation {

    boolean supports(PipelineAction action);

    PipelineActionDeclaration apply(PipelineConfig config, PipelineAction action);
}
