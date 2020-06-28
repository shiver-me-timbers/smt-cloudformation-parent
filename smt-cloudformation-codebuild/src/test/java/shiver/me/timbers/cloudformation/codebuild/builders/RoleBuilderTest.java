package shiver.me.timbers.cloudformation.codebuild.builders;

import org.junit.Test;
import shiver.me.timbers.aws.iam.*;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class RoleBuilderTest {

    @Test
    public void Can_build_a_Role() {

        final CodeBuild pipeline = mock(CodeBuild.class);
        final CodeBuildConfig config = mock(CodeBuildConfig.class);
        final String resourceName = someString();
        final String projectName = someString();

        // Given
        given(config.getResourceName()).willReturn(resourceName);
        given(config.getProjectName()).willReturn(projectName);

        // When
        new RoleBuilder().apply(pipeline, config);

        // Then
        final RoleResource roleResource = new RoleResource(resourceName + "Role")
            .withProperties(
                new Role()
                    .withRoleName(projectName + "-role")
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
        then(config).should().setRoleResource(roleResource);
        then(pipeline).should().add(roleResource);
    }
}