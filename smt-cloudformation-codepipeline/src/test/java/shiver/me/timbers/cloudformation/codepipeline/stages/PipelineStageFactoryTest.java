package shiver.me.timbers.cloudformation.codepipeline.stages;

import org.junit.Test;
import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.aws.codepipeline.PipelineStageDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;
import shiver.me.timbers.cloudformation.codepipeline.actions.transformations.PipelineActionTransformations;

import java.util.LinkedHashSet;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PipelineStageFactoryTest {

    @Test
    public void Can_create_a_PipelineStage() {

        final PipelineActionTransformations pipelineActionTransformations = mock(PipelineActionTransformations.class);
        final PipelineConfig config = mock(PipelineConfig.class);
        final Stage stage = mock(Stage.class);

        final String stageName = someString();
        final PipelineAction action1 = mock(PipelineAction.class);
        final PipelineAction action2 = mock(PipelineAction.class);
        final PipelineAction action3 = mock(PipelineAction.class);
        final PipelineActionDeclaration pipelineAction1 = mock(PipelineActionDeclaration.class);
        final PipelineActionDeclaration pipelineAction2 = mock(PipelineActionDeclaration.class);
        final PipelineActionDeclaration pipelineAction3 = mock(PipelineActionDeclaration.class);

        // Given
        given(stage.getName()).willReturn(stageName);
        given(stage.getActions()).willReturn(asList(action1, action2, action3));
        given(pipelineActionTransformations.apply(config, action1)).willReturn(pipelineAction1);
        given(pipelineActionTransformations.apply(config, action2)).willReturn(pipelineAction2);
        given(pipelineActionTransformations.apply(config, action3)).willReturn(pipelineAction3);

        // When
        final PipelineStageDeclaration actual = new PipelineStageFactory(pipelineActionTransformations).create(config, stage);

        // Then
        assertThat(actual, equalTo(
            new PipelineStageDeclaration()
                .withName(stageName)
                .withActions(new LinkedHashSet<>(asList(pipelineAction1, pipelineAction2, pipelineAction3)))
        ));
    }
}