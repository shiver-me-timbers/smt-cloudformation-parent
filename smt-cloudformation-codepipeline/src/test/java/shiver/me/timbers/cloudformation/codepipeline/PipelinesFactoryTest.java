package shiver.me.timbers.cloudformation.codepipeline;

import org.junit.Test;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;
import shiver.me.timbers.cloudformation.codepipeline.builders.Builders;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class PipelinesFactoryTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_create_a_Stages() {

        // Given
        final Pipeline pipeline = mock(Pipeline.class);
        final Builders builders = mock(Builders.class);
        final String resourceName = someString();
        final String pipelineName = someString();
        final String stageName = someString();
        final List<PipelineAction> actions = mock(List.class);

        // When
        final Pipelines actual = new PipelinesFactory(builders)
            .create(resourceName, pipelineName, stageName, actions);

        // Then
        assertThat(actual, hasField("builders", builders));
        assertThat(actual, hasField("resourceName", resourceName));
        assertThat(actual, hasField("pipelineName", pipelineName));
        assertThat(actual, hasFieldThat("stages", contains(allOf(
            hasField("name", stageName),
            hasField("actions", actions)
        ))));
    }
}