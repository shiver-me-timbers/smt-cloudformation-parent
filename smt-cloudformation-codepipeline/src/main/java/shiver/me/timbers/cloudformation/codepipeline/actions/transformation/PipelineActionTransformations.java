package shiver.me.timbers.cloudformation.codepipeline.actions.transformation;

import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;

import java.util.List;

import static java.lang.String.format;

@SuppressWarnings("rawtypes")
public class PipelineActionTransformations {

    private final List<PipelineActionTransformation> pipelineActionTransformations;

    public PipelineActionTransformations(List<PipelineActionTransformation> pipelineActionTransformations) {
        this.pipelineActionTransformations = pipelineActionTransformations;
    }

    @SuppressWarnings("unchecked")
    public PipelineActionDeclaration apply(PipelineConfig config, Action action) {
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
