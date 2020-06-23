package shiver.me.timbers.cloudformation.codebuild.iam;

import shiver.me.timbers.aws.iam.Statement;

import static java.lang.String.format;
import static shiver.me.timbers.aws.fn.Functions.fnSub;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;

public class CodeBuildLogGroupStatement extends Statement {

    public CodeBuildLogGroupStatement(CharSequence accountId, String codeBuildName) {
        setEffect(ALLOW);
        withActions(
            "logs:CreateLogStream",
            "logs:PutLogEvents"
        );
        withResources(
            fnSub(format("arn:aws:logs:ap-southeast-2:%s:log-group:/aws/codebuild/%s*", accountId, codeBuildName))
        );
    }
}
