package shiver.me.timbers.cloudformation.codepipeline.builders;

import org.junit.Test;
import shiver.me.timbers.aws.s3.Bucket;
import shiver.me.timbers.aws.s3.BucketLifecycleConfiguration;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.aws.s3.BucketRule;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;

import static java.util.Collections.singleton;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.cloudformation.codepipeline.PipelineResources.DEFAULT_S3_EXPIRATION_DAYS;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class S3BucketBuilderTest {

    @Test
    public void Can_build_an_S3_bucket() {

        final Pipeline pipeline = mock(Pipeline.class);
        final PipelineConfig config = mock(PipelineConfig.class);

        final String resourceName = someString();
        final String pipelineName = someString();

        // Given
        given(config.getResourceName()).willReturn(resourceName);
        given(config.getPipelineName()).willReturn(pipelineName);

        // When
        new S3BucketBuilder().apply(pipeline, config);

        // Then
        final BucketResource bucketResource = new BucketResource()
            .withName(resourceName + "S3Bucket")
            .withProperties(
                new Bucket()
                    .withBucketName(pipelineName + "-s3")
                    .withLifecycleConfiguration(
                        new BucketLifecycleConfiguration()
                            .withRules(singleton(
                                new BucketRule()
                                    .withId("ExpirationRule")
                                    .withExpirationInDays(DEFAULT_S3_EXPIRATION_DAYS)
                            ))
                    )
            );
        then(config).should().setBucketResource(bucketResource);
        then(pipeline).should().add(bucketResource);
    }
}