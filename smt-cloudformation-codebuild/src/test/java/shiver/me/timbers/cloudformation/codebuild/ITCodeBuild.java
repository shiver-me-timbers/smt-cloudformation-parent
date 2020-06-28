package shiver.me.timbers.cloudformation.codebuild;

import org.junit.Test;
import shiver.me.timbers.aws.codebuild.Project;
import shiver.me.timbers.aws.codebuild.ProjectArtifacts;
import shiver.me.timbers.aws.codebuild.ProjectEnvironment;
import shiver.me.timbers.aws.codebuild.ProjectResource;
import shiver.me.timbers.aws.iam.*;
import shiver.me.timbers.aws.logs.LogGroup;
import shiver.me.timbers.aws.logs.LogGroupResource;
import shiver.me.timbers.cloudformation.codebuild.iam.CodeBuildLogGroupStatement;

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.fn.Functions.fnGetAtt;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;
import static shiver.me.timbers.aws.iam.RoleAttributes.ARN;
import static shiver.me.timbers.aws.parameters.PseudoParameter.AccountId;
import static shiver.me.timbers.cloudformation.codebuild.ArtifactType.NO_ARTIFACTS;
import static shiver.me.timbers.cloudformation.test.CloudFormationResources.findResource;
import static shiver.me.timbers.cloudformation.test.CloudFormationResources.t;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ITCodeBuild {

    @Test
    public void Can_create_a_CodeBuild() {

        // Given
        final String resourceName = someString();
        final String projectName = someString();
        final Source source = mock(Source.class);
        final String description = someString();
        final String buildSpec = someString();

        // When
        final CodeBuild actual = CodeBuild.resource(resourceName)
            .name(projectName)
            .source(source)
            .description(description)
            .buildSpec(buildSpec)
            .artifact(NO_ARTIFACTS)
            .build();

        // Then
        then(source).should().setBuildSpec(buildSpec);
        final RoleResource roleResource = findResource(actual, RoleResource.class);
        final String roleResourceName = roleResource.getName();
        final Role role = roleResource.getProperties();
        assertThat(roleResource.getName(), equalTo(resourceName + "Role"));
        assertThat(role.getRoleName(), equalTo(projectName + "-role"));
        assertThat(t(role.getAssumeRolePolicyDocument()).getStatement(), contains(
            new Statement()
                .withEffect(ALLOW)
                .withActions("sts:AssumeRole")
                .withPrincipal(new Principal(singletonMap("Service", singletonList("codebuild.amazonaws.com"))))
        ));
        final PolicyResource codeBuildPolicyResource = findResource(actual, PolicyResource.class);
        final Policy codeBuildPolicy = codeBuildPolicyResource.getProperties();
        assertThat(codeBuildPolicyResource.getName(), equalTo(resourceName + "Policy"));
        assertThat(codeBuildPolicyResource.getDependsOn(), contains(roleResourceName));
        assertThat(codeBuildPolicy.getPolicyName(), equalTo(projectName + "-policy"));
        assertThat(t(codeBuildPolicy.getPolicyDocument()).getStatement(), contains(
            new CodeBuildLogGroupStatement(AccountId, projectName)
        ));
        final LogGroupResource logGroupResource = findResource(actual, LogGroupResource.class);
        assertThat(logGroupResource.getName(), equalTo(resourceName + "LogGroup"));
        final LogGroup logGroup = logGroupResource.getProperties();
        assertThat(logGroup.getLogGroupName(), equalTo("/aws/codebuild/" + projectName));
        assertThat(logGroup.getRetentionInDays(), equalTo(7));
        final ProjectResource projectResource = findResource(actual, ProjectResource.class);
        assertThat(projectResource.getName(), equalTo(resourceName));
        assertThat(projectResource.getDependsOn(), contains(roleResourceName, logGroupResource.getName()));
        final Project project = projectResource.getProperties();
        assertThat(project.getName(), equalTo(projectName));
        assertThat(project.getDescription(), equalTo(description));
        assertThat(project.getServiceRole(), equalTo(fnGetAtt(roleResource, ARN)));
        assertThat(project.getSource(), is(source));
        assertThat(project.getEnvironment(), equalTo(
            new ProjectEnvironment()
                .withComputeType("BUILD_GENERAL1_SMALL")
                .withImage("aws/codebuild/standard:3.0")
                .withType("LINUX_CONTAINER")
        ));
        assertThat(project.getArtifacts(), equalTo(new ProjectArtifacts().withType(NO_ARTIFACTS)));
    }
}