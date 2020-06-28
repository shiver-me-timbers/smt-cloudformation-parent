package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.cloudformation.builders.Builders;

public class PipelinesFactory {

    private final Builders<Pipeline, PipelineConfig> builders;

    public PipelinesFactory(Builders<Pipeline, PipelineConfig> builders) {
        this.builders = builders;
    }

    public Pipelines create(PipelineConfig config) {
        return new Pipelines(builders, config);
    }
}
