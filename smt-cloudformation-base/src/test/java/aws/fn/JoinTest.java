package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnJoin;
import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class JoinTest {

    @Test
    public void Can_create_a_join_function() {

        // Given
        final String delimiter = someString();
        final String string1 = someString();
        final String string2 = someString();

        // When
        final Join actual = fnJoin(delimiter, asList(string1, string2));

        // Then
        assertThat(actual, hasFieldThat("values", contains(delimiter, asList(string1, string2))));
    }

    @Test
    public void Can_create_a_join_function_with_varargs() {

        // Given
        final String delimiter = someString();
        final String string1 = someString();
        final String string2 = someString();

        // When
        final Join actual = fnJoin(delimiter, string1, string2);

        // Then
        assertThat(actual, hasFieldThat("values", contains(delimiter, asList(string1, string2))));
    }
}