package shiver.me.timbers.cloudformation.codepipeline;

public class PipelineResources {

    public static final int DEFAULT_S3_EXPIRATION_DAYS = 30;

    private final SourcesFactory sourcesFactory;
    private final PipelineConfig config;

    public PipelineResources(SourcesFactory sourcesFactory, PipelineConfig config) {
        this.sourcesFactory = sourcesFactory;
        this.config = config;
    }

    public Sources name(String name) {
        config.setPipelineName(name);
        return sourcesFactory.create(config);
    }
}
