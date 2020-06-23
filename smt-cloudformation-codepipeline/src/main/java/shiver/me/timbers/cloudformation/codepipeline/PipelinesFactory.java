package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;
import shiver.me.timbers.cloudformation.codepipeline.builders.Builders;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

public class PipelinesFactory {

    private final Builders builders;

    public PipelinesFactory(Builders builders) {
        this.builders = builders;
    }

    public Pipelines create(
        String resourceName,
        String pipelineName,
        String stageName,
        List<PipelineAction> actions
    ) {
        return new Pipelines(
            builders,
            resourceName,
            pipelineName,
            new ArrayList<>(singletonList(new Stage(stageName, actions)))
        );
    }
}
