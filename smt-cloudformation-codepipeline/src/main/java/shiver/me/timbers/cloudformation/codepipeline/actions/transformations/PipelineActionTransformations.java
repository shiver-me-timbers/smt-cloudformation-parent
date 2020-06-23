package shiver.me.timbers.cloudformation.codepipeline.actions.transformations;

import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;

import java.util.List;

import static java.lang.String.format;

public class PipelineActionTransformations {

    private final List<PipelineActionTransformation> pipelineActionTransformations;

    public PipelineActionTransformations(List<PipelineActionTransformation> pipelineActionTransformations) {
        this.pipelineActionTransformations = pipelineActionTransformations;
    }

    public PipelineActionDeclaration apply(PipelineConfig config, PipelineAction action) {
        return pipelineActionTransformations.stream()
            .filter(t -> t.supports(action))
            .findFirst()
            .orElseThrow(() ->
                new IllegalArgumentException(
                    format("Could not find transformer for action of type (%s).", action.getClass().getName())
                )
            )
            .apply(config, action);
    }
}
