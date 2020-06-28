package shiver.me.timbers.cloudformation.codepipeline.actions.transformation;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;
import shiver.me.timbers.cloudformation.codepipeline.actions.source.Source;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;

public class ActionTransformationTest {

    private ActionTransformation transformation;

    @Before
    public void setUp() {
        transformation = new ActionTransformation();
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void Can_support_raw_Action() {

        // Given
        final Action action = new Action();

        // When
        final boolean actual = transformation.supports(action);

        // Then
        assertThat(actual, is(true));
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void Can_support_Source() {

        // Given
        final Source source = new Source();

        // When
        final boolean actual = transformation.supports(source);

        // Then
        assertThat(actual, is(true));
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void Cannot_support_other_PipelineActions() {

        // Given
        final Action action = mock(Action.class);

        // When
        final boolean actual = transformation.supports(action);

        // Then
        assertThat(actual, is(false));
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void Can_transform_an_Action() {

        // Given
        final Action expected = mock(Action.class);

        // When
        final PipelineActionDeclaration actual = transformation.apply(mock(PipelineConfig.class), expected);

        // Then
        assertThat(actual, is(expected));
    }
}