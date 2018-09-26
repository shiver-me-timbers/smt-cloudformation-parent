package aws;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomIntegers.someIntegerBetween;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class StringPropertyTest {

    private String string;
    private StringProperty property;

    @Before
    public void setUp() {
        string = someString();
        property = new StringProperty(string);
    }

    @Test
    public void Can_to_string_a_string_property() {

        // When
        final String actual = property.toString();

        // Then
        assertThat(actual, equalTo(string));
    }

    @Test
    public void Can_get_the_length_of_a_string_property() {

        // When
        final int actual = property.length();

        // Then
        assertThat(actual, equalTo(string.length()));
    }

    @Test
    public void Can_get_a_char_of_a_string_property() {

        // Given
        final int index = someIntegerBetween(0, string.length() - 1);

        // When
        final char actual = property.charAt(index);

        // Then
        assertThat(actual, equalTo(string.charAt(index)));
    }

    @Test
    public void Can_get_a_subsequence_of_a_string_property() {

        // Given
        final int start = someIntegerBetween(0, string.length() - 1);
        final int length = string.length();

        // When
        final CharSequence actual = property.subSequence(start, length);

        // Then
        assertThat(actual, equalTo(string.subSequence(start, length)));
    }
}