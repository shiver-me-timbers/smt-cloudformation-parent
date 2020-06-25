package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.cloudformation.codepipeline.actions.Sources;
import shiver.me.timbers.cloudformation.codepipeline.actions.SourcesFactory;

public class PipelineResources {

    public static final int DEFAULT_S3_EXPIRATION_DAYS = 30;

    private final PipelineConfig config;
    private final SourcesFactory sourcesFactory;

    public PipelineResources(PipelineConfig config, SourcesFactory sourcesFactory) {
        this.config = config;
        this.sourcesFactory = sourcesFactory;
    }

    public Sources name(String name) {
        config.setPipelineName(name);
        return sourcesFactory.create(config);
    }
}
