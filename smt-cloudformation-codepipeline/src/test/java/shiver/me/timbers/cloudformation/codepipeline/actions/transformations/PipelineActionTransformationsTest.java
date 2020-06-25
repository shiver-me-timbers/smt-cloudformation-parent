package shiver.me.timbers.cloudformation.codepipeline.actions.transformations;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.aws.codepipeline.PipelineActionDeclaration;
import shiver.me.timbers.cloudformation.codepipeline.PipelineConfig;
import shiver.me.timbers.cloudformation.codepipeline.actions.PipelineAction;

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

public class PipelineActionTransformationsTest {

    private PipelineActionTransformation transformation1;
    private PipelineActionTransformation transformation2;
    private PipelineActionTransformation transformation3;
    private PipelineActionTransformations transformations;

    @Before
    public void setUp() {
        transformation1 = mock(PipelineActionTransformation.class);
        transformation2 = mock(PipelineActionTransformation.class);
        transformation3 = mock(PipelineActionTransformation.class);
        transformations = new PipelineActionTransformations(asList(transformation1, transformation2, transformation3));
    }

    @Test
    public void Can_transform_an_action() {

        final PipelineConfig config = mock(PipelineConfig.class);
        final PipelineAction action = mock(PipelineAction.class);

        final PipelineActionDeclaration expected = mock(PipelineActionDeclaration.class);

        // Given
        given(transformation1.supports(action)).willReturn(false);
        given(transformation2.supports(action)).willReturn(true);
        given(transformation2.apply(config, action)).willReturn(expected);

        // When
        final PipelineActionDeclaration actual = transformations.apply(config, action);

        // Then
        then(transformation3).should(never()).supports(any(PipelineAction.class));
        then(transformation3).should(never()).apply(any(PipelineConfig.class), any(PipelineAction.class));
        assertThat(actual, is(expected));
    }

    @Test
    public void Can_fail_transform_an_action() {

        final PipelineConfig config = mock(PipelineConfig.class);
        final PipelineAction action = mock(PipelineAction.class);

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