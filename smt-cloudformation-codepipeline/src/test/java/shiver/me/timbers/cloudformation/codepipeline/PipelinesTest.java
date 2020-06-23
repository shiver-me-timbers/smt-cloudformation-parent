package shiver.me.timbers.cloudformation.codepipeline;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;
import shiver.me.timbers.cloudformation.codepipeline.builders.Builders;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PipelinesTest {

    private Builders builders;
    private String resourceName;
    private String pipelineName;
    private List<Stage> stageList;
    private Pipelines pipelines;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() {
        builders = mock(Builders.class);
        resourceName = someString();
        pipelineName = someString();
        stageList = mock(List.class);
        pipelines = new Pipelines(builders, resourceName, pipelineName, stageList);
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
        then(stageList).should().add(new Stage(name, asList(action1, action2, action3)));
    }

    @Test
    public void Can_build_a_Pipeline() {

        // Given
        final ArgumentCaptor<Pipeline> captor = ArgumentCaptor.forClass(Pipeline.class);

        // When
        final Pipeline actual = pipelines.build();

        // Then
        then(builders).should().apply(captor.capture(), eq(new PipelineConfig(resourceName, pipelineName, stageList)));
        assertThat(actual, is(captor.getValue()));
    }
}