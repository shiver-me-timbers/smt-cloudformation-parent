package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnNot;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
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
}