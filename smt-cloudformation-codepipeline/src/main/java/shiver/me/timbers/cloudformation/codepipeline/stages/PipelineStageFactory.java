package shiver.me.timbers.cloudformation.codepipeline.stages;

import shiver.me.timbers.aws.codepipeline.PipelineStageDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.transformation.PipelineActionTransformations;

import java.util.LinkedHashSet;

import static java.util.stream.Collectors.toCollection;

public class PipelineStageFactory {

    private final PipelineActionTransformations pipelineActionTransformations;

    public PipelineStageFactory(PipelineActionTransformations pipelineActionTransformations) {
        this.pipelineActionTransformations = pipelineActionTransformations;
    }

    public PipelineStageDeclaration create(PipelineConfig config, Stage stage) {
        return new PipelineStageDeclaration()
            .withName(stage.getName())
            .withActions(
                stage.getActions()
                    .stream()
                    .map(action -> pipelineActionTransformations.apply(config, action))
                    .collect(toCollection(LinkedHashSet::new))
            );
    }
}
