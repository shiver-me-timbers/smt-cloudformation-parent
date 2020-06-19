package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static shiver.me.timbers.aws.fn.Functions.fnSplit;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class SplitTest {

    @Test
    public void Can_create_a_join_function() {

        // Given
        final String delimiter = someString();
        final String string = someString();

        // When
        final Split actual = fnSplit(delimiter, string);

        // Then
        assertThat(actual, hasFieldThat("values", contains(delimiter, string)));
    }

    @Test
    public void Split_has_equality() {
        EqualsVerifier.forClass(Split.class).usingGetClass().withIgnoredFields("string").verify();
    }
}