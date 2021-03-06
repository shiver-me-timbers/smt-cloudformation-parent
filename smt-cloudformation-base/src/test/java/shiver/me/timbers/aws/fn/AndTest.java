package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.fn.Functions.fnAnd;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class AndTest {

    @Test
    public void Can_create_an_and_function() {

        // Given
        final ConditionFunction condition1 = mock(ConditionFunction.class);
        final ConditionFunction condition2 = mock(ConditionFunction.class);
        final ConditionFunction condition3 = mock(ConditionFunction.class);

        // When
        final And actual = fnAnd(asList(condition1, condition2, condition3));

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
        final And actual = fnAnd(condition1, condition2, condition3);

        // Then
        assertThat(actual, hasFieldThat("conditions", contains(condition1, condition2, condition3)));
    }

    @Test
    public void And_has_equality() {
        EqualsVerifier.forClass(And.class).usingGetClass().verify();
    }
}