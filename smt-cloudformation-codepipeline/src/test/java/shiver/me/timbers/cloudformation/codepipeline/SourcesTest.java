package shiver.me.timbers.cloudformation.codepipeline;

import org.junit.Test;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;
import shiver.me.timbers.cloudformation.codepipeline.actions.source.Source;
import shiver.me.timbers.cloudformation.codepipeline.stages.Stage;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class SourcesTest {

    @Test
    public void Can_create_a_Stages() {

        final PipelinesFactory pipelinesFactory = mock(PipelinesFactory.class);
        final PipelineConfig config = mock(PipelineConfig.class);
        final String stageName = someString();
        final Source source = mock(Source.class);
        final Action action1 = mock(Action.class);
        final Action action2 = mock(Action.class);
        final Action action3 = mock(Action.class);

        final Pipelines expected = mock(Pipelines.class);

        // Given
        given(pipelinesFactory.create(config)).willReturn(expected);

        // When
        final Pipelines actual = new Sources(pipelinesFactory, config)
            .source(stageName, source, action1, action2, action3);

        // Then
        then(config).should().setStages(singletonList(new Stage(stageName, asList(source, action1, action2, action3))));
        assertThat(actual, is(expected));
    }
}