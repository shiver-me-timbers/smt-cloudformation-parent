package shiver.me.timbers.cloudformation.codepipeline.actions.transformations;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;

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
    public void Can_support_Actions() {

        // Given
        final Action action = mock(Action.class);

        // When
        final boolean actual = transformation.supports(action);

        // Then
        assertThat(actual, is(true));
    }

    @Test
    public void Cannot_support_other_PipelineActions() {

        // Given
        final PipelineAction action = mock(PipelineAction.class);

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