package aws.parameters;

import org.junit.Before;
import org.junit.Test;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomEnums.someEnum;
import static shiver.me.timbers.data.random.RandomIntegers.someIntegerBetween;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PseudoParameterTest {

    private PseudoParameter parameter;
    private String name;

    @Before
    public void setUp() {
        parameter = someEnum(PseudoParameter.class);
        name = parameter.getName();
    }

    @Test
    public void Can_create_a_PseudoParameter_from_a_value() {

        // When
        final PseudoParameter actual = PseudoParameter.fromValue(name);

        // Then
        assertThat(actual, is(parameter));
    }

    @Test
    public void Can_fail_to_create_a_PseudoParameter_from_a_value() {

        // Given
        final String value = someString();

        // When
        final Throwable actual = catchThrowable(() -> PseudoParameter.fromValue(value));

        // Then
        assertThat(actual, instanceOf(PseudoParameterException.class));
        assertThat(actual.getMessage(), equalTo(format("There is no PseudoParameter with the name (%s).", value)));
    }

    @Test
    public void Can_to_name_a_name_parameter() {

        // When
        final String actual = parameter.toString();

        // Then
        assertThat(actual, equalTo(name));
    }

    @Test
    public void Can_get_the_length_of_a_name_parameter() {

        // When
        final int actual = parameter.length();

        // Then
        assertThat(actual, equalTo(name.length()));
    }

    @Test
    public void Can_get_a_char_of_a_name_parameter() {

        // Given
        final int index = someIntegerBetween(0, name.length() - 1);

        // When
        final char actual = parameter.charAt(index);

        // Then
        assertThat(actual, equalTo(name.charAt(index)));
    }

    @Test
    public void Can_get_a_subsequence_of_a_name_parameter() {

        // Given
        final int start = someIntegerBetween(0, name.length() - 1);
        final int length = name.length();

        // When
        final CharSequence actual = parameter.subSequence(start, length);

        // Then
        assertThat(actual, equalTo(name.subSequence(start, length)));
    }
}