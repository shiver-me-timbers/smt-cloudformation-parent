package shiver.me.timbers.cloudformation.codepipeline.iam;

import shiver.me.timbers.aws.iam.Statement;

import static shiver.me.timbers.aws.fn.Functions.fnJoin;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;

public class PipelineBucketStatement extends Statement {

    public PipelineBucketStatement(CharSequence bucket) {
        setSid("Allow CodePipeline Access");
        setEffect(ALLOW);
        withActions(
            "s3:ListBucket",
            "s3:GetObject",
            "s3:GetObjectVersion",
            "s3:GetBucketVersioning",
            "s3:GetBucketPolicy",
            "s3:GetObject",
            "s3:GetObjectTagging",
            "s3:PutObject",
            "s3:PutObjectTagging",
            "s3:PutObjectVersionTagging",
            "s3:PutObjectAcl",
            "s3:PutObjectVersionAcl",
            "s3:DeleteObject",
            "s3:ListBucket"
        );
        withResources(
            fnJoin("", "arn:aws:s3:::", bucket),
            fnJoin("", "arn:aws:s3:::", bucket, "/*")
        );
    }
}
