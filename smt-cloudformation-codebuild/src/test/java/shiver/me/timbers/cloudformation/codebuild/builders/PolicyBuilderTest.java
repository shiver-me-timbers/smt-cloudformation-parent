package shiver.me.timbers.cloudformation.codebuild.builders;

import org.junit.Test;
import shiver.me.timbers.aws.fn.Reference;
import shiver.me.timbers.aws.iam.Policy;
import shiver.me.timbers.aws.iam.PolicyDocument;
import shiver.me.timbers.aws.iam.PolicyResource;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;
import shiver.me.timbers.cloudformation.codebuild.iam.CodeBuildLogGroupStatement;

import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.parameters.PseudoParameter.AccountId;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PolicyBuilderTest {

    @Test
    public void Can_build_a_policy() {

        final CodeBuild codeBuild = mock(CodeBuild.class);
        final CodeBuildConfig config = mock(CodeBuildConfig.class);
        final RoleResource roleResource = mock(RoleResource.class);
        final String resourceName = someString();
        final Reference roleReference = mock(Reference.class);
        final String projectName = someString();

        // Given
        given(config.getRoleResource()).willReturn(roleResource);
        given(roleResource.ref()).willReturn(roleReference);
        given(config.getResourceName()).willReturn(resourceName);
        given(config.getProjectName()).willReturn(projectName);

        // When
        new PolicyBuilder().apply(codeBuild, config);

        // Then
        then(codeBuild).should().add(
            new PolicyResource(resourceName + "Policy")
                .withDependsOn(roleResource)
                .withProperties(
                    new Policy()
                        .withPolicyName(projectName + "-policy")
                        .withPolicyDocument(
                            new PolicyDocument()
                                .withStatement(singletonList(new CodeBuildLogGroupStatement(AccountId, projectName)))
                        )
                        .withRoles(singletonList(roleReference))
                )
        );
    }
}