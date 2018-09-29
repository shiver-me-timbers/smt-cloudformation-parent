package aws;

import aws.fn.ConditionFunction;
import org.junit.Test;

import static aws.Templates.condition;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
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
}