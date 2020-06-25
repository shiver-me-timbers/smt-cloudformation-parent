package shiver.me.timbers.cloudformation.codepipeline.builders;

import org.junit.Test;
import shiver.me.timbers.aws.fn.Reference;
import shiver.me.timbers.aws.iam.PolicyDocument;
import shiver.me.timbers.aws.iam.Principal;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.s3.BucketPolicy;
import shiver.me.timbers.aws.s3.BucketPolicyResource;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.iam.PipelineBucketStatement;

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class S3BucketPolicyBuilderTest {

    @Test
    public void Can_build_a_S3_bucket_policy() {

        final Pipeline pipeline = mock(Pipeline.class);
        final PipelineConfig config = mock(PipelineConfig.class);
        final String resourceName = someString();
        final String pipelineName = someString();
        final RoleResource role = mock(RoleResource.class);
        final BucketResource bucket = mock(BucketResource.class);
        final Reference roleReference = mock(Reference.class);
        final Reference bucketReference = mock(Reference.class);

        // Given
        given(config.getResourceName()).willReturn(resourceName);
        given(config.getPipelineName()).willReturn(pipelineName);
        given(config.getRoleResource()).willReturn(role);
        given(config.getBucketResource()).willReturn(bucket);
        given(role.ref()).willReturn(roleReference);
        given(bucket.ref()).willReturn(bucketReference);
        given(role.getName()).willReturn(someString());
        given(bucket.getName()).willReturn(someString());

        // When
        new S3BucketPolicyBuilder().apply(pipeline, config);

        // Then
        then(pipeline).should().add(
            new BucketPolicyResource()
                .withName(resourceName + "S3BucketPolicy")
                .withDependsOn(role, bucket)
                .withProperties(
                    new BucketPolicy()
                        .withBucket(bucketReference)
                        .withPolicyDocument(
                            new PolicyDocument()
                                .withStatement(singletonList(
                                    new PipelineBucketStatement(bucketReference)
                                        .withPrincipal(new Principal(singletonMap("AWS", singletonList(roleReference))))
                                ))
                        )
                )
        );
    }
}