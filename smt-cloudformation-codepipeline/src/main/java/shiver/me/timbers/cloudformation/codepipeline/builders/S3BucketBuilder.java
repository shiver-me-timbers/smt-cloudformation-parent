package shiver.me.timbers.cloudformation.codepipeline.builders;

import shiver.me.timbers.aws.s3.Bucket;
import shiver.me.timbers.aws.s3.BucketLifecycleConfiguration;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.aws.s3.BucketRule;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;

import static java.util.Collections.singleton;
import static shiver.me.timbers.cloudformation.codepipeline.PipelineResources.DEFAULT_S3_EXPIRATION_DAYS;

public class S3BucketBuilder implements Builder {

    @Override
    public void apply(Pipeline pipeline, PipelineConfig config) {
        final BucketResource bucketResource = new BucketResource()
            .withName(config.getResourceName() + "S3Bucket")
            .withProperties(
                new Bucket()
                    .withBucketName(config.getPipelineName() + "-s3")
                    .withLifecycleConfiguration(
                        new BucketLifecycleConfiguration()
                            .withRules(singleton(
                                new BucketRule()
                                    .withId("ExpirationRule")
                                    .withExpirationInDays(DEFAULT_S3_EXPIRATION_DAYS)
                            ))
                    )
            );
        config.setBucketResource(bucketResource);
        pipeline.add(bucketResource);
    }
}
