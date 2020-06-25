package shiver.me.timbers.cloudformation.codepipeline.actions;

import org.junit.Test;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.PipelinesFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class SourcesFactoryTest {

    @Test
    public void Can_create_a_Sources() {

        // Given
        final PipelinesFactory pipelinesFactory = mock(PipelinesFactory.class);
        final PipelineConfig config = mock(PipelineConfig.class);

        // When
        final Sources actual = new SourcesFactory(pipelinesFactory).create(config);

        // Then
        assertThat(actual, hasField("pipelinesFactory", pipelinesFactory));
        assertThat(actual, hasField("config", config));
    }
}