package shiver.me.timbers.cloudformation.codepipeline;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PipelineResourcesTest {

    @Test
    public void Can_create_a_new_Pipelines() {

        final PipelineConfig config = mock(PipelineConfig.class);
        final SourcesFactory sourcesFactory = mock(SourcesFactory.class);
        final String pipelineName = someString();

        final Sources expected = mock(Sources.class);

        // Given
        given(sourcesFactory.create(config)).willReturn(expected);

        // When
        final Sources actual = new PipelineResources(sourcesFactory, config).name(pipelineName);

        // Then
        then(config).should().setPipelineName(pipelineName);
        assertThat(actual, is(expected));
    }
}