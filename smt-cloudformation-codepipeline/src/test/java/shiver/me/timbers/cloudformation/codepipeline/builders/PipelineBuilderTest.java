package shiver.me.timbers.cloudformation.codepipeline.builders;

import org.junit.Test;
import shiver.me.timbers.aws.codepipeline.PipelineArtifactStore;
import shiver.me.timbers.aws.codepipeline.PipelineResource;
import shiver.me.timbers.aws.codepipeline.PipelineStageDeclaration;
import shiver.me.timbers.aws.fn.Reference;
import shiver.me.timbers.aws.iam.RoleResource;
import shiver.me.timbers.aws.s3.BucketResource;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.stages.PipelineStageFactory;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.LinkedHashSet;

import static java.util.Arrays.asList;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PipelineBuilderTest {

    @Test
    public void Can_build_a_pipeline() {

        final PipelineStageFactory pipelineStageFactory = mock(PipelineStageFactory.class);
        final Pipeline pipeline = mock(Pipeline.class);
        final PipelineConfig config = mock(PipelineConfig.class);
        final RoleResource role = mock(RoleResource.class);
        final BucketResource bucket = mock(BucketResource.class);
        final Reference roleReference = mock(Reference.class);
        final Reference bucketReference = mock(Reference.class);
        final String resourceName = someString();
        final String pipelineName = someString();
        final Stage stage1 = mock(Stage.class);
        final Stage stage2 = mock(Stage.class);
        final Stage stage3 = mock(Stage.class);
        final PipelineStageDeclaration pipelineStage1 = mock(PipelineStageDeclaration.class);
        final PipelineStageDeclaration pipelineStage2 = mock(PipelineStageDeclaration.class);
        final PipelineStageDeclaration pipelineStage3 = mock(PipelineStageDeclaration.class);

        // Given
        given(config.getRoleResource()).willReturn(role);
        given(config.getBucketResource()).willReturn(bucket);
        given(config.getResourceName()).willReturn(resourceName);
        given(config.getPipelineName()).willReturn(pipelineName);
        given(config.getStages()).willReturn(asList(stage1, stage2, stage3));
        given(role.getName()).willReturn(someString());
        given(bucket.getName()).willReturn(someString());
        given(role.ref()).willReturn(roleReference);
        given(bucket.ref()).willReturn(bucketReference);
        given(pipelineStageFactory.create(config, stage1)).willReturn(pipelineStage1);
        given(pipelineStageFactory.create(config, stage2)).willReturn(pipelineStage2);
        given(pipelineStageFactory.create(config, stage3)).willReturn(pipelineStage3);

        // When
        new PipelineBuilder(pipelineStageFactory).apply(pipeline, config);

        // Then
        then(pipeline).should().add(new PipelineResource(resourceName)
            .withDependsOn(role, bucket)
            .withProperties(
                new shiver.me.timbers.aws.codepipeline.Pipeline()
                    .withName(pipelineName)
                    .withRoleArn(roleReference)
                    .withStages(new LinkedHashSet<>(asList(pipelineStage1, pipelineStage2, pipelineStage3)))
                    .withArtifactStore(
                        new PipelineArtifactStore()
                            .withType("S3")
                            .withLocation(bucketReference)
                    )
            ));
    }
}