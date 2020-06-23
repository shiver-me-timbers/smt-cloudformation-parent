package shiver.me.timbers.cloudformation.codepipeline.actions;

import shiver.me.timbers.cloudformation.codepipeline.PipelinesFactory;

public class SourcesFactory {

    private final PipelinesFactory pipelinesFactory;

    public SourcesFactory(PipelinesFactory pipelinesFactory) {
        this.pipelinesFactory = pipelinesFactory;
    }

    public Sources create(String resourceName, String pipelineName) {
        return new Sources(resourceName, pipelineName, pipelinesFactory);
    }
}
