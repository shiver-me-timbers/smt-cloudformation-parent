package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;
import shiver.me.timbers.aws.Condition;

import static org.assertj.core.api.Assertions.catchThrowableOfType;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.aws.fn.Functions.fnIf;
import static shiver.me.timbers.aws.parameters.PseudoParameter.NoValue;
import static shiver.me.timbers.data.random.RandomIntegers.someInteger;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasFieldThat;

public class IfTest {

    @Test
    public void Can_create_an_if_function() {

        final Condition condition = mock(Condition.class);
        final Integer trueValue = someInteger();
        final Integer falseValue = someInteger();

        final String conditionName = someString();

        // Given
        given(condition.getName()).willReturn(conditionName);

        // When
        final If<Integer> actual = fnIf(condition, trueValue, falseValue);

        // Then
        assertThat(actual, hasFieldThat("values", contains(conditionName, trueValue, falseValue)));
    }

    @Test
    public void Can_create_an_if_function_with_only_a_true_value() {

        final Condition condition = mock(Condition.class);
        final Integer trueValue = someInteger();
        final Integer falseValue = someInteger();

        final String conditionName = someString();

        // Given
        given(condition.getName()).willReturn(conditionName);

        // When
        final If<Integer> actual = fnIf(condition, trueValue);

        // Then
        assertThat(actual, hasFieldThat("values", contains(conditionName, trueValue, NoValue)));
    }

    @Test
    public void Cannot_get_the_property_type_of_an_if() {

        final Condition condition = mock(Condition.class);

        // Given
        given(condition.getName()).willReturn(someString());

        // When
        final UnsupportedOperationException actual = catchThrowableOfType(
            () -> fnIf(condition, someInteger()).toType(),
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

    @Test
    public void If_has_equality() {
        EqualsVerifier.forClass(If.class).usingGetClass().withIgnoredFields("string").verify();
    }
}