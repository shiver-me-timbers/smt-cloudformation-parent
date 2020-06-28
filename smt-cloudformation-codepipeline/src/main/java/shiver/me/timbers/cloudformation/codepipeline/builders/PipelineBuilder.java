package shiver.me.timbers.cloudformation.codepipeline.builders;

import shiver.me.timbers.aws.codepipeline.PipelineArtifactStore;
import shiver.me.timbers.aws.codepipeline.PipelineResource;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.cloudformation.builders.Builder;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.stages.PipelineStageFactory;

import java.util.LinkedHashSet;

import static java.util.stream.Collectors.toCollection;

public class PipelineBuilder implements Builder<Pipeline, PipelineConfig> {

    private final PipelineStageFactory pipelineStageFactory;

    public PipelineBuilder(PipelineStageFactory pipelineStageFactory) {
        this.pipelineStageFactory = pipelineStageFactory;
    }

    @Override
    public void apply(Pipeline pipeline, PipelineConfig config) {
        final RoleResource role = config.getRoleResource();
        final BucketResource bucket = config.getBucketResource();
        final PipelineResource pipelineResource = new PipelineResource(config.getResourceName())
            .withDependsOn(role, bucket)
            .withProperties(
                new shiver.me.timbers.aws.codepipeline.Pipeline()
                    .withName(config.getPipelineName())
                    .withRoleArn(role.ref())
                    .withStages(
                        config.getStages()
                            .stream()
                            .map(stage -> pipelineStageFactory.create(config, stage))
                            .collect(toCollection(LinkedHashSet::new))
                    )
                    .withArtifactStore(
                        new PipelineArtifactStore()
                            .withType("S3")
                            .withLocation(bucket.ref())
                    )
            );
        pipeline.add(pipelineResource);
    }
}
