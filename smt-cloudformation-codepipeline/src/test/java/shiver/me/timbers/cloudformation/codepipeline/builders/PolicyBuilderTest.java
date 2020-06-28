package shiver.me.timbers.cloudformation.codepipeline.builders;

import org.junit.Test;
import shiver.me.timbers.aws.fn.Reference;
import shiver.me.timbers.aws.iam.Policy;
import shiver.me.timbers.aws.iam.PolicyDocument;
import shiver.me.timbers.aws.iam.PolicyResource;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.iam.PipelineBucketStatement;

import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PolicyBuilderTest {

    @Test
    public void Can_create_a_policy() {

        final Pipeline pipeline = mock(Pipeline.class);
        final PipelineConfig config = mock(PipelineConfig.class);
        final String resourceName = someString();
        final String pipelineName = someString();
        final RoleResource role = mock(RoleResource.class);
        final BucketResource bucket = mock(BucketResource.class);
        final Reference roleReference = mock(Reference.class);
        final Reference bucketReference = mock(Reference.class);

        // Given
        given(config.getRoleResource()).willReturn(role);
        given(config.getBucketResource()).willReturn(bucket);
        given(config.getResourceName()).willReturn(resourceName);
        given(config.getPipelineName()).willReturn(pipelineName);
        given(role.getName()).willReturn(someString());
        given(bucket.getName()).willReturn(someString());
        given(role.ref()).willReturn(roleReference);
        given(bucket.ref()).willReturn(bucketReference);

        // When
        new PolicyBuilder().apply(pipeline, config);

        // Then
        then(pipeline).should().add(
            new PolicyResource(resourceName + "Policy")
                .withDependsOn(role, bucket)
                .withProperties(
                    new Policy()
                        .withPolicyName(pipelineName + "-policy")
                        .withPolicyDocument(
                            new PolicyDocument()
                                .withStatement(singletonList(new PipelineBucketStatement(bucketReference)))
                        )
                        .withRoles(singletonList(roleReference))
                )
        );
    }
}