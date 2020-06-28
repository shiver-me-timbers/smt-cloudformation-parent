package shiver.me.timbers.cloudformation.codepipeline;

public class SourcesFactory {

    private final PipelinesFactory pipelinesFactory;

    public SourcesFactory(PipelinesFactory pipelinesFactory) {
        this.pipelinesFactory = pipelinesFactory;
    }

    public Sources create(PipelineConfig config) {
        return new Sources(pipelinesFactory, config);
    }
}
