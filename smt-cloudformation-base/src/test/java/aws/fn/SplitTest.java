package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnSplit;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
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
}