package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.fn.Functions.fnEquals;
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

    @Test
    public void Equals_has_equality() {
        EqualsVerifier.forClass(Equals.class).usingGetClass().verify();
    }
}