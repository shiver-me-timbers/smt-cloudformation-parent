package shiver.me.timbers.cloudformation.codepipeline;

import shiver.me.timbers.cloudformation.codepipeline.actions.Sources;
import shiver.me.timbers.cloudformation.codepipeline.actions.SourcesFactory;

public class PipelineResources {

    public static final int DEFAULT_S3_EXPIRATION_DAYS = 30;

    private final String resourceName;
    private final SourcesFactory sourcesFactory;

    public PipelineResources(String resourceName, SourcesFactory sourcesFactory) {
        this.resourceName = resourceName;
        this.sourcesFactory = sourcesFactory;
    }

    public Sources name(String name) {
        return sourcesFactory.create(resourceName, name);
    }
}
