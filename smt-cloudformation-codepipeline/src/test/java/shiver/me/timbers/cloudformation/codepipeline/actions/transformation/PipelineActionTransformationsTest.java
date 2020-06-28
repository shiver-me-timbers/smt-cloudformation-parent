package shiver.me.timbers.cloudformation.codepipeline.actions.transformation;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.Action;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.catchThrowableOfType;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;

@SuppressWarnings("rawtypes")
public class PipelineActionTransformationsTest {

    private PipelineActionTransformation<Action> transformation1;
    private PipelineActionTransformation<Action> transformation2;
    private PipelineActionTransformation<Action> transformation3;
    private PipelineActionTransformations transformations;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() {
        transformation1 = mock(PipelineActionTransformation.class);
        transformation2 = mock(PipelineActionTransformation.class);
        transformation3 = mock(PipelineActionTransformation.class);
        transformations = new PipelineActionTransformations(asList(transformation1, transformation2, transformation3));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_an_action() {

        final PipelineConfig config = mock(PipelineConfig.class);
        final Action<Action> action = mock(Action.class);

        final PipelineActionDeclaration expected = mock(PipelineActionDeclaration.class);

        // Given
        given(transformation1.supports(action)).willReturn(false);
        given(transformation2.supports(action)).willReturn(true);
        given(transformation2.apply(config, action)).willReturn(expected);

        // When
        final PipelineActionDeclaration actual = transformations.apply(config, action);

        // Then
        then(transformation3).should(never()).supports(any(Action.class));
        then(transformation3).should(never()).apply(any(PipelineConfig.class), any(Action.class));
        assertThat(actual, is(expected));
    }

    @Test
    public void Can_fail_transform_an_action() {

        final PipelineConfig config = mock(PipelineConfig.class);
        final Action action = mock(Action.class);

        // Given
        given(transformation1.supports(action)).willReturn(false);
        given(transformation2.supports(action)).willReturn(false);
        given(transformation3.supports(action)).willReturn(false);

        // When
        final IllegalArgumentException actual = catchThrowableOfType(
            () -> transformations.apply(config, action),
            IllegalArgumentException.class
        );

        // Then
        assertThat(actual.getMessage(), equalTo(
            format("Could not find transformer for action of type (%s).", action.getClass().getName())
        ));
    }
}