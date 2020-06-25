package shiver.me.timbers.cloudformation.codepipeline;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;
import shiver.me.timbers.cloudformation.codepipeline.builders.Builders;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PipelinesTest {

    private Builders builders;
    private PipelineConfig config;
    private Pipelines pipelines;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() {
        builders = mock(Builders.class);
        config = mock(PipelineConfig.class);
        pipelines = new Pipelines(builders, config);
    }

    @Test
    public void Can_add_a_stage() {

        // Given
        final String name = someString();
        final PipelineAction action1 = mock(PipelineAction.class);
        final PipelineAction action2 = mock(PipelineAction.class);
        final PipelineAction action3 = mock(PipelineAction.class);

        // When
        pipelines.stage(name, action1, action2, action3);

        // Then
        then(config).should().addStage(new Stage(name, asList(action1, action2, action3)));
    }

    @Test
    public void Can_build_a_Pipeline() {

        // Given
        final ArgumentCaptor<Pipeline> captor = ArgumentCaptor.forClass(Pipeline.class);

        // When
        final Pipeline actual = pipelines.build();

        // Then
        then(builders).should().apply(captor.capture(), eq(config));
        assertThat(actual, is(captor.getValue()));
    }
}