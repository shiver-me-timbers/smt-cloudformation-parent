package shiver.me.timbers.cloudformation.codepipeline.builders;

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

public class S3BucketPolicyBuilder implements Builder {

    @Override
    public void apply(Pipeline pipeline, PipelineConfig config) {
        final RoleResource role = config.getRoleResource();
        final BucketResource bucket = config.getBucketResource();
        final Reference bucketRef = bucket.ref();
        pipeline.add(
            new BucketPolicyResource()
                .withName(config.getResourceName() + "S3BucketPolicy")
                .withDependsOn(role, bucket)
                .withProperties(
                    new BucketPolicy()
                        .withBucket(bucketRef)
                        .withPolicyDocument(
                            new PolicyDocument()
                                .withStatement(singletonList(
                                    new PipelineBucketStatement(bucketRef)
                                        .withPrincipal(
                                            new Principal(singletonMap("AWS", singletonList(role.ref())))
                                        )
                                ))
                        )
                )
        );
    }
}
