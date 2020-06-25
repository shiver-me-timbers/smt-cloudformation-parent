package shiver.me.timbers.cloudformation.codepipeline.builders;

import shiver.me.timbers.aws.iam.Policy;
import shiver.me.timbers.aws.iam.PolicyDocument;
import shiver.me.timbers.aws.iam.PolicyResource;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.iam.PipelineBucketStatement;

import static java.util.Collections.singletonList;

public class PolicyBuilder implements Builder {

    @Override
    public void apply(Pipeline pipeline, PipelineConfig config) {
        final RoleResource role = config.getRoleResource();
        final BucketResource bucket = config.getBucketResource();
        pipeline.add(
            new PolicyResource()
                .withName(config.getResourceName() + "Policy")
                .withDependsOn(role, bucket)
                .withProperties(
                    new Policy()
                        .withPolicyName(config.getPipelineName() + "-policy")
                        .withPolicyDocument(
                            new PolicyDocument()
                                .withStatement(singletonList(new PipelineBucketStatement(bucket.ref())))
                        )
                        .withRoles(singletonList(role.ref()))
                )
        );
    }
}
