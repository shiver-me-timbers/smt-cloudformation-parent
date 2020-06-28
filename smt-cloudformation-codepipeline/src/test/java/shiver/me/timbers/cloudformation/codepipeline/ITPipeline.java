package shiver.me.timbers.cloudformation.codepipeline;

import org.junit.Test;
import shiver.me.timbers.aws.Resource;
import shiver.me.timbers.aws.codebuild.*;
import shiver.me.timbers.aws.codepipeline.*;
import shiver.me.timbers.aws.iam.*;
import shiver.me.timbers.aws.logs.LogGroup;
import shiver.me.timbers.aws.logs.LogGroupResource;
import shiver.me.timbers.aws.s3.*;
import shiver.me.timbers.cloudformation.codebuild.CodeBuild;
import shiver.me.timbers.cloudformation.codebuild.iam.CodeBuildLogGroupStatement;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;
import shiver.me.timbers.cloudformation.codepipeline.actions.build.CodeBuildAction;
import shiver.me.timbers.cloudformation.codepipeline.actions.configuration.CodeBuildActionConfiguration;
import shiver.me.timbers.cloudformation.codepipeline.actions.source.Source;
import shiver.me.timbers.cloudformation.codepipeline.iam.PipelineBucketStatement;

import java.util.LinkedHashSet;
import java.util.function.Predicate;

import static java.util.Arrays.asList;
import static java.util.Collections.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.fn.Functions.fnGetAtt;
import static shiver.me.timbers.aws.iam.Effect.ALLOW;
import static shiver.me.timbers.aws.iam.RoleAttributes.ARN;
import static shiver.me.timbers.aws.parameters.PseudoParameter.AccountId;
import static shiver.me.timbers.cloudformation.codebuild.ArtifactType.CODEPIPELINE;
import static shiver.me.timbers.cloudformation.codepipeline.PipelineResources.DEFAULT_S3_EXPIRATION_DAYS;
import static shiver.me.timbers.cloudformation.test.CloudFormationResources.findResource;
import static shiver.me.timbers.cloudformation.test.CloudFormationResources.t;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

@SuppressWarnings("rawtypes")
public class ITPipeline {

    @Test
    public void Can_create_a_new_CodePipeline() {

        // Given
        final String resourceName = someString();
        final String pipelineName = someString();
        final String sourceName = someString();
        final Source source = new Source();
        final String stageName1 = someString();
        final String stageName2 = someString();
        final Action action1 = new Action();
        final Action action2 = new Action();
        final Action action3 = new Action();

        // When
        final Pipeline actual = Pipeline
            .resource(resourceName)
            .name(pipelineName)
            .source(sourceName, source)
            .stage(stageName1, action1)
            .stage(stageName2, action2, action3)
            .build();

        // Then
        final RoleResource roleResource = findResource(actual, RoleResource.class);
        final String roleResourceName = roleResource.getName();
        final Role role = roleResource.getProperties();
        assertThat(roleResource.getName(), equalTo(resourceName + "Role"));
        assertThat(role.getRoleName(), equalTo(pipelineName + "-role"));
        assertThat(t(role.getAssumeRolePolicyDocument()).getStatement(), contains(
            new Statement()
                .withEffect(ALLOW)
                .withActions("sts:AssumeRole")
                .withPrincipal(new Principal(singletonMap("Service", singletonList("codepipeline.amazonaws.com"))))
        ));
        final BucketResource bucketResource = findResource(actual, BucketResource.class);
        final Bucket bucket = bucketResource.getProperties();
        final String bucketResourceName = bucketResource.getName();
        assertThat(bucketResource.getName(), equalTo(resourceName + "S3Bucket"));
        assertThat(bucket.getBucketName(), equalTo(pipelineName + "-s3"));
        assertThat(t(bucket.getLifecycleConfiguration()).getRules(), contains(
            new BucketRule().withId("ExpirationRule").withExpirationInDays(DEFAULT_S3_EXPIRATION_DAYS)
        ));
        assertThat(role.getPath(), equalTo("/"));
        final BucketPolicyResource bucketPolicyResource = findResource(actual, BucketPolicyResource.class);
        final BucketPolicy bucketPolicy = bucketPolicyResource.getProperties();
        assertThat(bucketPolicyResource.getName(), equalTo(resourceName + "S3BucketPolicy"));
        assertThat(bucketPolicyResource.getDependsOn(), contains(roleResourceName, bucketResourceName));
        assertThat(bucketPolicy.getBucket(), equalTo(bucketResource.ref()));
        assertThat(t(bucketPolicy.getPolicyDocument()).getStatement(), contains(
            new PipelineBucketStatement(bucketResource.ref())
                .withPrincipal(new Principal(singletonMap("AWS", singletonList(roleResource.ref()))))
        ));
        final PolicyResource policyResource = findResource(actual, PolicyResource.class);
        final Policy policy = policyResource.getProperties();
        assertThat(policyResource.getName(), equalTo(resourceName + "Policy"));
        assertThat(policyResource.getDependsOn(), contains(roleResourceName, bucketResourceName));
        assertThat(policy.getPolicyName(), equalTo(pipelineName + "-policy"));
        assertThat(t(policy.getPolicyDocument()).getStatement(), contains(
            new PipelineBucketStatement(bucketResource.ref())
        ));
        final PipelineResource pipelineResource = findResource(actual, PipelineResource.class);
        final shiver.me.timbers.aws.codepipeline.Pipeline pipeline = pipelineResource.getProperties();
        assertThat(pipelineResource.getName(), equalTo(resourceName));
        assertThat(pipelineResource.getDependsOn(), contains(roleResourceName, bucketResourceName));
        assertThat(pipeline.getName(), equalTo(pipelineName));
        assertThat(pipeline.getRoleArn(), equalTo(roleResource.ref()));
        assertThat(pipeline.getStages(), contains(
            allOf(hasField("name", sourceName), hasField("actions", singleton(source))),
            allOf(hasField("name", stageName1), hasField("actions", singleton(action1))),
            allOf(hasField("name", stageName2), hasField("actions", new LinkedHashSet<>(asList(action2, action3))))
        ));
        assertThat(pipeline.getArtifactStore(), equalTo(
            new PipelineArtifactStore().withType("S3").withLocation(bucketResource.ref())
        ));
    }

    @Test
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void Can_add_a_code_build_to_the_pipeline() {

        final String plResourceName = someString();
        final String pipelineName = someString();
        final String sourceName = "SOURCE";
        final Source<Source> source = mock(Source.class);
        final String sourceOutputArtifact = someString();
        final String stageName = someString();
        final String codeBuildActionName = "CODEBUILD";
        final String cbResourceName = someString();
        final String projectName = someString();
        final String codeBuildDescription = someString();
        final String buildSpec = someString();

        // Given
        given(source.getOutputArtifacts()).willReturn(
            singleton(new PipelineOutputArtifact().withName(sourceOutputArtifact))
        );

        // When
        final Pipeline actual = Pipeline
            .resource(plResourceName)
            .name(pipelineName)
            .source(sourceName, source)
            .stage(
                stageName,
                CodeBuildAction
                    .name(codeBuildActionName)
                    .codeBuild(
                        CodeBuild.resource(cbResourceName)
                            .name(projectName)
                            .description(codeBuildDescription)
                            .buildSpec(buildSpec)
                            .build()
                    )
                    .inputArtifacts(sourceOutputArtifact)
                    .build()
            )
            .build();

        // Then
        final RoleResource codeBuildRoleResource = findResource(
            actual,
            RoleResource.class,
            forName(cbResourceName + "Role")
        );
        final String codeBuildRoleResourceName = codeBuildRoleResource.getName();
        final Role codeBuildRole = codeBuildRoleResource.getProperties();
        assertThat(codeBuildRoleResource.getName(), equalTo(plResourceName + "Role"));
        assertThat(codeBuildRole.getRoleName(), equalTo(pipelineName + "-role"));
        assertThat(t(codeBuildRole.getAssumeRolePolicyDocument()).getStatement(), contains(
            new Statement()
                .withEffect(ALLOW)
                .withActions("sts:AssumeRole")
                .withPrincipal(new Principal(singletonMap("Service", singletonList("codebuild.amazonaws.com"))))
        ));
        final RoleResource pipelineRoleResource = findResource(
            actual,
            RoleResource.class,
            forName(plResourceName + "Role")
        );
        final BucketResource bucketResource = findResource(actual, BucketResource.class);
        final String bucketResourceName = bucketResource.getName();
        final BucketPolicy bucketPolicy = findResource(actual, BucketPolicyResource.class).getProperties();
        assertThat(t(bucketPolicy.getPolicyDocument()).getStatement(), contains(
            new PipelineBucketStatement(bucketResource.ref())
                .withPrincipal(new Principal(singletonMap("AWS", asList(
                    pipelineRoleResource.ref(),
                    codeBuildRoleResource.ref()
                ))))
        ));
        final PolicyResource codeBuildPolicyResource = findResource(
            actual,
            PolicyResource.class,
            forRole(codeBuildRoleResource)
        );
        final Policy codeBuildPolicy = codeBuildPolicyResource.getProperties();
        assertThat(codeBuildPolicyResource.getName(), equalTo(cbResourceName + "Policy"));
        assertThat(codeBuildPolicyResource.getDependsOn(), contains(codeBuildRoleResourceName, bucketResourceName));
        assertThat(codeBuildPolicy.getPolicyName(), equalTo(projectName + "-policy"));
        assertThat(t(codeBuildPolicy.getPolicyDocument()).getStatement(), contains(
            new PipelineBucketStatement(bucketResource.ref()),
            new CodeBuildLogGroupStatement(AccountId, projectName)
        ));
        final Policy pipelinePolicy = findResource(actual, PolicyResource.class, forRole(pipelineRoleResource)).getProperties();
        assertThat(t(pipelinePolicy.getPolicyDocument()).getStatement(), contains(
            new PipelineBucketStatement(bucketResource.ref())
        ));
        final LogGroupResource logGroupResource = findResource(actual, LogGroupResource.class);
        assertThat(logGroupResource.getName(), equalTo(cbResourceName + "LogGroup"));
        final LogGroup logGroup = logGroupResource.getProperties();
        assertThat(logGroup.getLogGroupName(), equalTo("/aws/codebuild/" + projectName));
        assertThat(logGroup.getRetentionInDays(), equalTo(7));
        final ProjectResource projectResource = findResource(actual, ProjectResource.class);
        assertThat(projectResource.getName(), equalTo(cbResourceName));
        assertThat(projectResource.getDependsOn(), contains(codeBuildRoleResourceName, logGroupResource.getName()));
        final Project project = projectResource.getProperties();
        assertThat(project.getName(), equalTo(projectName));
        assertThat(project.getDescription(), equalTo(codeBuildDescription));
        assertThat(project.getServiceRole(), equalTo(fnGetAtt(codeBuildRoleResource, ARN)));
        assertThat(project.getSource(), equalTo(new ProjectSource().withType("CODEPIPELINE").withBuildSpec(buildSpec)));
        assertThat(project.getEnvironment(), equalTo(
            new ProjectEnvironment()
                .withComputeType("BUILD_GENERAL1_SMALL")
                .withImage("aws/codebuild/standard:4.0")
                .withType("LINUX_CONTAINER")
        ));
        assertThat(project.getArtifacts(), equalTo(new ProjectArtifacts().withType(CODEPIPELINE)));
        final PipelineResource pipelineResource = findResource(actual, PipelineResource.class);
        final shiver.me.timbers.aws.codepipeline.Pipeline pipeline = pipelineResource.getProperties();
        assertThat(pipelineResource.getName(), equalTo(plResourceName));
        assertThat(pipelineResource.getDependsOn(), contains(
            pipelineRoleResource.getName(),
            bucketResourceName
        ));
        assertThat(pipeline.getName(), equalTo(pipelineName));
        assertThat(pipeline.getRoleArn(), equalTo(pipelineRoleResource.ref()));
        assertThat(pipeline.getStages(), contains(
            allOf(hasField("name", sourceName), hasField("actions", singleton(source))),
            allOf(hasField("name", stageName), hasField("actions", singleton(
                new PipelineActionDeclaration()
                    .withName(projectName)
                    .withActionTypeId(
                        new PipelineActionTypeId()
                            .withCategory("Build")
                            .withOwner("AWS")
                            .withVersion("1")
                            .withProvider("CodeBuild")
                    )
                    .withConfiguration(new CodeBuildActionConfiguration(projectResource.getName()))
                    .withInputArtifacts(singleton(new PipelineInputArtifact().withName(sourceOutputArtifact)))

            )))
        ));
        assertThat(pipeline.getArtifactStore(), equalTo(
            new PipelineArtifactStore().withType("S3").withLocation(bucketResource.ref())
        ));
    }

    private <T extends Resource> Predicate<T> forName(String name) {
        return resource -> resource.getName().equals(name);
    }

    private Predicate<PolicyResource> forRole(RoleResource roleResource) {
        return policyResource -> policyResource.getProperties().getRoles().contains(roleResource.ref());
    }
}