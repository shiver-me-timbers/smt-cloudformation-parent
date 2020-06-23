package shiver.me.timbers.cloudformation.codepipeline.builders;

import org.junit.Test;
import shiver.me.timbers.cloudformation.codepipeline.Pipeline;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;

import static java.util.Arrays.asList;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

public class BuildersTest {

    @Test
    public void Can_apply_transformations() {

        // Given
        final Builder builder1 = mock(Builder.class);
        final Builder builder2 = mock(Builder.class);
        final Builder builder3 = mock(Builder.class);
        final Pipeline pipeline = mock(Pipeline.class);
        final PipelineConfig config = mock(PipelineConfig.class);

        // When
        new Builders(asList(builder1, builder2, builder3)).apply(pipeline, config);

        // Then
        then(builder1).should().apply(pipeline, config);
        then(builder2).should().apply(pipeline, config);
        then(builder3).should().apply(pipeline, config);
    }
}