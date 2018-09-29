package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnIf;
import static aws.parameters.PseudoParameter.NoValue;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomIntegers.someInteger;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class IfTest {

    @Test
    public void Can_create_an_if_function() {

        // Given
        final String condition = someString();
        final Integer trueValue = someInteger();
        final Integer falseValue = someInteger();

        // When
        final If<Integer> actual = fnIf(condition, trueValue, falseValue);

        // Then
        assertThat(actual, hasFieldThat("values", contains(condition, trueValue, falseValue)));
    }

    @Test
    public void Can_create_an_if_function_with_only_a_true_value() {

        // Given
        final String condition = someString();
        final Integer trueValue = someInteger();

        // When
        final If<Integer> actual = fnIf(condition, trueValue);

        // Then
        assertThat(actual, hasFieldThat("values", contains(condition, trueValue, NoValue)));
    }
}