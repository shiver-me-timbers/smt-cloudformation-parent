package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;
import shiver.me.timbers.cloudformation.codepipeline.builders.Builders;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Pipelines {

    private final Builders builders;
    private final PipelineConfig config;

    public Pipelines(Builders builders, PipelineConfig config) {
        this.builders = builders;
        this.config = config;
    }

    public Pipelines stage(String name, PipelineAction... actions) {
        config.addStage(new Stage(name, new ArrayList<>(asList(actions))));
        return this;
    }

    public Pipeline build() {
        final Pipeline pipeline = new Pipeline();
        builders.apply(pipeline, config);
        return pipeline;
    }
}
