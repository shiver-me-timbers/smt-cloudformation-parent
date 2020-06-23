package shiver.me.timbers.cloudformation.codepipeline.actions;

import org.junit.Test;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelinesFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class SourcesFactoryTest {

    @Test
    public void Can_create_a_Sources() {

        // Given
        final PipelinesFactory pipelinesFactory = mock(PipelinesFactory.class);
        final String resourceName = someString();
        final String pipelineName = someString();

        // When
        final Sources actual = new SourcesFactory(pipelinesFactory).create(resourceName, pipelineName);

        // Then
        assertThat(actual, hasField("resourceName", resourceName));
        assertThat(actual, hasField("pipelineName", pipelineName));
        assertThat(actual, hasField("pipelinesFactory", pipelinesFactory));
    }
}