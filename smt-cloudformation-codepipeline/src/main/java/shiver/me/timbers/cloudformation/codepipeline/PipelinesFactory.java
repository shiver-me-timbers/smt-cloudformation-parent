package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.cloudformation.codepipeline.builders.Builders;

public class PipelinesFactory {

    private final Builders builders;

    public PipelinesFactory(Builders builders) {
        this.builders = builders;
    }

    public Pipelines create(PipelineConfig config) {
        return new Pipelines(builders, config);
    }
}
