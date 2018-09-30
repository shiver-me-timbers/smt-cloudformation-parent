package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnSelect;
import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomIntegers.someInteger;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class SelectTest {

    @Test
    public void Can_create_a_select_function() {

        // Given
        final int index = someInteger();
        final String string1 = someString();
        final String string2 = someString();

        // When
        final Select actual = fnSelect(index, asList(string1, string2));

        // Then
        assertThat(actual, hasFieldThat("values", contains(String.valueOf(index), asList(string1, string2))));
    }

    @Test
    public void Can_create_a_select_function_with_varargs() {

        // Given
        final int index = someInteger();
        final String string1 = someString();
        final String string2 = someString();

        // When
        final Select actual = fnSelect(index, string1, string2);

        // Then
        assertThat(actual, hasFieldThat("values", contains(String.valueOf(index), asList(string1, string2))));
    }

    @Test
    public void Can_create_a_select_function_with_another_function() {

        // Given
        final int index = someInteger();
        final Function function = mock(Function.class);

        // When
        final Select actual = fnSelect(index, function);

        // Then
        assertThat(actual, hasFieldThat("values", contains(String.valueOf(index), function)));
    }
}