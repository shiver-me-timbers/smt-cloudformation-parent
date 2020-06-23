package shiver.me.timbers.cloudformation.codepipeline.builders;

import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;

public interface Builder {

    void apply(Pipeline pipeline, PipelineConfig config);
}
