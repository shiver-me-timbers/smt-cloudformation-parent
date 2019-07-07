package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnIf;
import static aws.parameters.PseudoParameter.NoValue;
import static org.assertj.core.api.Assertions.catchThrowableOfType;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
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

    @Test
    public void Cannot_get_the_property_type_of_an_if() {

        // Given
        final String condition = someString();
        final Integer trueValue = someInteger();

        // When
        final UnsupportedOperationException actual = catchThrowableOfType(
            () -> fnIf(condition, trueValue).toType(),
            UnsupportedOperationException.class
        );

        // Then
        assertThat(
            actual.getMessage(),
            equalTo(
                "The type instance of an 'If' is indeterminate before the template has been processed by Cloudformation."
            )
        );
    }
}