package shiver.me.timbers.cloudformation.codebuild.builders;

import org.junit.Test;
import shiver.me.timbers.aws.codebuild.Project;
import shiver.me.timbers.aws.codebuild.ProjectEnvironment;
import shiver.me.timbers.aws.codebuild.ProjectResource;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.logs.LogGroup;
import shiver.me.timbers.aws.logs.LogGroupResource;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.fn.Functions.fnGetAtt;
import static shiver.me.timbers.aws.iam.RoleAttributes.ARN;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ProjectBuilderTest {

    @Test
    public void Can_build_a_project() {

        final CodeBuild codeBuild = mock(CodeBuild.class);
        final CodeBuildConfig config = mock(CodeBuildConfig.class);
        final RoleResource roleResource = mock(RoleResource.class);
        final String resourceName = someString();
        final String projectName = someString();
        final String description = someString();

        // Given
        given(config.getRoleResource()).willReturn(roleResource);
        given(config.getResourceName()).willReturn(resourceName);
        given(config.getProjectName()).willReturn(projectName);
        given(config.getDescription()).willReturn(description);

        // When
        new ProjectBuilder().apply(codeBuild, config);

        // Then
        final LogGroupResource logGroupResource = new LogGroupResource()
            .withName(resourceName + "LogGroup")
            .withProperties(
                new LogGroup()
                    .withLogGroupName("/aws/codebuild/" + projectName)
                    .withRetentionInDays(7)
            );
        final ProjectResource projectResource = new ProjectResource(resourceName)
            .withDependsOn(roleResource, logGroupResource)
            .withProperties(
                new Project()
                    .withName(projectName)
                    .withDescription(description)
                    .withServiceRole(fnGetAtt(roleResource, ARN))
                    .withEnvironment(
                        new ProjectEnvironment()
                            .withComputeType("BUILD_GENERAL1_SMALL")
                            .withImage("aws/codebuild/standard:3.0")
                            .withType("LINUX_CONTAINER")
                    )
            );
        then(config).should().setProjectResource(projectResource);
        then(codeBuild).should().add(logGroupResource);
        then(codeBuild).should().add(projectResource);
    }
}