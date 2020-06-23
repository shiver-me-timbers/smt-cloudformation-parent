package shiver.me.timbers.cloudformation.codepipeline.actions;

import org.junit.Test;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.Pipelines;
import shiver.me.timbers.cloudformation.codepipeline.PipelinesFactory;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class SourcesTest {

    @Test
    public void Can_create_a_Stages() {

        final Pipeline pipeline = mock(Pipeline.class);
        final String resourceName = someString();
        final String pipelineName = someString();
        final PipelinesFactory pipelinesFactory = mock(PipelinesFactory.class);
        final String stageName = someString();
        final Source source = mock(Source.class);
        final Action action1 = mock(Action.class);
        final Action action2 = mock(Action.class);
        final Action action3 = mock(Action.class);

        final Pipelines expected = mock(Pipelines.class);

        // Given
        given(pipelinesFactory.create(
            resourceName,
            pipelineName,
            stageName,
            asList(source, action1, action2, action3)
        )).willReturn(expected);

        // When
        final Pipelines actual = new Sources(resourceName, pipelineName, pipelinesFactory)
            .source(stageName, source, action1, action2, action3);

        // Then
        assertThat(actual, is(expected));
    }
}