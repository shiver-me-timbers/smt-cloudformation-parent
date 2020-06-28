package shiver.me.timbers.cloudformation.codebuild.builders;

import shiver.me.timbers.aws.iam.*;
import shiver.me.timbers.cloudformation.builders.Builder;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;

public class RoleBuilder implements Builder<CodeBuild, CodeBuildConfig> {

    @Override
    public void apply(CodeBuild codeBuild, CodeBuildConfig config) {
        final RoleResource roleResource = new RoleResource(config.getResourceName() + "Role")
            .withProperties(
                new Role()
                    .withRoleName(config.getProjectName() + "-role")
                    .withAssumeRolePolicyDocument(
                        new PolicyDocument()
                            .withStatement(singletonList(
                                new Statement()
                                    .withEffect(ALLOW)
                                    .withActions("sts:AssumeRole")
                                    .withPrincipal(
                                        new Principal(
                                            singletonMap("Service", singletonList("codebuild.amazonaws.com"))
                                        )
                                    )
                            ))
                    )
                    .withPath("/")
            );
        config.setRoleResource(roleResource);
        codeBuild.add(roleResource);
    }
}
