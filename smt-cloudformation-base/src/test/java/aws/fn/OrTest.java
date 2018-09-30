package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnOr;
import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class OrTest {

    @Test
    public void Can_create_an_and_function() {

        // Given
        final ConditionFunction condition1 = mock(ConditionFunction.class);
        final ConditionFunction condition2 = mock(ConditionFunction.class);
        final ConditionFunction condition3 = mock(ConditionFunction.class);

        // When
        final Or actual = fnOr(asList(condition1, condition2, condition3));

        // Then
        assertThat(actual, hasFieldThat("conditions", contains(condition1, condition2, condition3)));
    }

    @Test
    public void Can_create_an_and_function_with_varargs() {

        // Given
        final ConditionFunction condition1 = mock(ConditionFunction.class);
        final ConditionFunction condition2 = mock(ConditionFunction.class);
        final ConditionFunction condition3 = mock(ConditionFunction.class);

        // When
        final Or actual = fnOr(condition1, condition2, condition3);

        // Then
        assertThat(actual, hasFieldThat("conditions", contains(condition1, condition2, condition3)));
    }
}