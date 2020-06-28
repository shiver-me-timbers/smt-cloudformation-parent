package shiver.me.timbers.cloudformation.codebuild.builders;

import shiver.me.timbers.aws.codebuild.Project;
import shiver.me.timbers.aws.codebuild.ProjectEnvironment;
import shiver.me.timbers.aws.codebuild.ProjectResource;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.logs.LogGroup;
import shiver.me.timbers.aws.logs.LogGroupResource;
import shiver.me.timbers.cloudformation.builders.Builder;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.CodeBuildConfig;

import static shiver.me.timbers.aws.fn.Functions.fnGetAtt;
import static shiver.me.timbers.aws.iam.RoleAttributes.ARN;

public class ProjectBuilder implements Builder<CodeBuild, CodeBuildConfig> {

    @Override
    public void apply(CodeBuild codeBuild, CodeBuildConfig config) {
        final RoleResource roleResource = config.getRoleResource();
        final String resourceName = config.getResourceName();
        final String projectName = config.getProjectName();
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
                    .withDescription(config.getDescription())
                    .withServiceRole(fnGetAtt(roleResource, ARN))
                    .withEnvironment(
                        new ProjectEnvironment()
                            .withComputeType("BUILD_GENERAL1_SMALL")
                            .withImage("aws/codebuild/standard:3.0")
                            .withType("LINUX_CONTAINER")
                    )
            );
        codeBuild.add(logGroupResource);
        codeBuild.add(projectResource);
        config.setProjectResource(projectResource);
    }
}
