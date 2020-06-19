package shiver.me.timbers.aws;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import shiver.me.timbers.aws.fn.ConditionFunction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.Templates.condition;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ConditionTest {

    @Test
    public void Can_create_a_condition() {

        // Given
        final String name = someString();
        final ConditionFunction condition = mock(ConditionFunction.class);

        // When
        final Condition actual = condition(name, condition);

        // Then
        assertThat(actual.getName(), is(name));
        assertThat(actual.getCondition(), is(condition));
    }

    @Test
    public void Condition_has_equality() {
        EqualsVerifier.forClass(Condition.class).usingGetClass().verify();
    }
}