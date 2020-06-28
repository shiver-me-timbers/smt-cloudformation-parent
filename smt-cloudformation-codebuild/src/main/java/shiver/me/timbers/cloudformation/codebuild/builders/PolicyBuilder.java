package shiver.me.timbers.cloudformation.codebuild.builders;

import shiver.me.timbers.aws.iam.Policy;
import shiver.me.timbers.aws.iam.PolicyDocument;
import shiver.me.timbers.aws.iam.PolicyResource;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.cloudformation.builders.Builder;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;
import shiver.me.timbers.cloudformation.codebuild.iam.CodeBuildLogGroupStatement;

import static java.util.Collections.singletonList;
import static shiver.me.timbers.aws.parameters.PseudoParameter.AccountId;

public class PolicyBuilder implements Builder<CodeBuild, CodeBuildConfig> {

    @Override
    public void apply(CodeBuild codeBuild, CodeBuildConfig config) {
        final RoleResource roleResource = config.getRoleResource();
        final String projectName = config.getProjectName();
        codeBuild.add(
            new PolicyResource(config.getResourceName() + "Policy")
                .withDependsOn(roleResource)
                .withProperties(
                    new Policy()
                        .withPolicyName(projectName + "-policy")
                        .withPolicyDocument(
                            new PolicyDocument()
                                .withStatement(singletonList(new CodeBuildLogGroupStatement(AccountId, projectName)))
                        )
                        .withRoles(singletonList(roleResource.ref()))
                )
        );
    }
}
