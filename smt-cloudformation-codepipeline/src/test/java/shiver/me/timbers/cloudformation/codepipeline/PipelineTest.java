package shiver.me.timbers.cloudformation.codepipeline;

import org.junit.Test;
import shiver.me.timbers.cloudformation.codepipeline.actions.Sources;
import shiver.me.timbers.cloudformation.codepipeline.actions.SourcesFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PipelineTest {

    @Test
    public void Can_create_a_new_Pipelines() {

        final String resourceName = someString();
        final SourcesFactory sourcesFactory = mock(SourcesFactory.class);
        final PipelineResources pipelineResources = new PipelineResources(resourceName, sourcesFactory);
        final String pipelineName = someString();

        final Sources expected = mock(Sources.class);

        // Given
        given(sourcesFactory.create(resourceName, pipelineName)).willReturn(expected);

        // When
        final Sources actual = pipelineResources.name(pipelineName);

        // Then
        assertThat(actual, is(expected));
    }
}