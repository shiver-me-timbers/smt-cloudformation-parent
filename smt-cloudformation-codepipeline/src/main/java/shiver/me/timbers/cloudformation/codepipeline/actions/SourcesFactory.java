package shiver.me.timbers.cloudformation.codepipeline.actions;

import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.PipelinesFactory;

public class SourcesFactory {

    private final PipelinesFactory pipelinesFactory;

    public SourcesFactory(PipelinesFactory pipelinesFactory) {
        this.pipelinesFactory = pipelinesFactory;
    }

    public Sources create(PipelineConfig config) {
        return new Sources(config, pipelinesFactory);
    }
}
