package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;
import shiver.me.timbers.cloudformation.codepipeline.builders.Builders;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Pipelines {

    private final Builders builders;
    private final String resourceName;
    private final String pipelineName;
    private final List<Stage> stages;

    public Pipelines(
        Builders builders,
        String resourceName,
        String pipelineName,
        List<Stage> stages
    ) {
        this.builders = builders;
        this.resourceName = resourceName;
        this.pipelineName = pipelineName;
        this.stages = stages;
    }

    public Pipelines stage(String name, PipelineAction... actions) {
        stages.add(new Stage(name, new ArrayList<>(asList(actions))));
        return this;
    }

    public Pipeline build() {
        final Pipeline pipeline = new Pipeline();
        builders.apply(pipeline, new PipelineConfig(resourceName, pipelineName, stages));
        return pipeline;
    }
}
