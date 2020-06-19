package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.fn.Functions.fnNot;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class NotTest {

    @Test
    public void Can_create_a_not_function() {

        // Given
        final ConditionFunction condition = mock(ConditionFunction.class);

        // When
        final Not actual = fnNot(condition);

        // Then
        assertThat(actual, hasFieldThat("condition", contains(condition)));
    }

    @Test
    public void Not_has_equality() {
        EqualsVerifier.forClass(Not.class).usingGetClass().verify();
    }
}