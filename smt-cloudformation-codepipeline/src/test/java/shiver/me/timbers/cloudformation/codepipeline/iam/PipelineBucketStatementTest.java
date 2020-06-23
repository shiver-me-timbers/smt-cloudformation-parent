package shiver.me.timbers.cloudformation.codepipeline.iam;

import org.junit.Test;
import shiver.me.timbers.aws.iam.Statement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static shiver.me.timbers.aws.fn.Functions.fnJoin;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PipelineBucketStatementTest {

    @Test
    public void Can_create_a_PipelineBucketStatement() {

        // Given
        final String bucket = someString();

        // When
        final PipelineBucketStatement actual = new PipelineBucketStatement(bucket);

        // Then
        assertThat(actual, equalTo(
            new Statement()
                .withSid("Allow CodePipeline Access")
                .withEffect(ALLOW)
                .withActions(
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
                )
                .withResources(
                    fnJoin("", "arn:aws:s3:::", bucket),
                    fnJoin("", "arn:aws:s3:::", bucket, "/*")
                )
        ));
    }
}