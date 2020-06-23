package shiver.me.timbers.cloudformation.codepipeline.builders;

import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;

import java.util.List;

public class Builders {

    private final List<Builder> builders;

    public Builders(List<Builder> builders) {
        this.builders = builders;
    }

    public void apply(Pipeline pipeline, PipelineConfig config) {
        builders.forEach(t -> t.apply(pipeline, config));
    }
}
