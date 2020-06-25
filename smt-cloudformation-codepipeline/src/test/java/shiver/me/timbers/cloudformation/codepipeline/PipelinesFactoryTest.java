package shiver.me.timbers.cloudformation.codepipeline;

import org.junit.Test;
import shiver.me.timbers.cloudformation.codepipeline.builders.Builders;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class PipelinesFactoryTest {

    @Test
    @SuppressWarnings("unchecked")
    public void Can_create_a_Stages() {

        // Given
        final Builders builders = mock(Builders.class);
        final PipelineConfig config = mock(PipelineConfig.class);

        // When
        final Pipelines actual = new PipelinesFactory(builders).create(config);

        // Then
        assertThat(actual, hasField("builders", builders));
        assertThat(actual, hasField("config", config));
    }
}