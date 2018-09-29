package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnEquals;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class EqualsTest {

    @Test
    public void Can_create_an_and_function() {

        // Given
        final GetAtt left = mock(GetAtt.class);
        final And right = mock(And.class);

        // When
        final Equals<Function> actual = fnEquals(left, right);

        // Then
        assertThat(actual, hasFieldThat("values", contains(left, right)));
    }
}