package shiver.me.timbers.aws;

import org.junit.Test;

import static org.assertj.core.api.Assertions.catchThrowableOfType;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class NumberPropertyTest {

    @Test
    public void Number_property_does_not_support_conversion() {

        // Given
        final NumberProperty property = new NumberProperty() {
        };

        // When
        final UnsupportedOperationException intException = catchThrowableOfType(
            property::intValue, UnsupportedOperationException.class
        );
        final UnsupportedOperationException floatException = catchThrowableOfType(
            property::floatValue, UnsupportedOperationException.class
        );
        final UnsupportedOperationException longException = catchThrowableOfType(
            property::longValue, UnsupportedOperationException.class
        );
        final UnsupportedOperationException doubleException = catchThrowableOfType(
            property::doubleValue, UnsupportedOperationException.class
        );

        // Then
        assertThat(intException, not(nullValue()));
        assertThat(floatException, not(nullValue()));
        assertThat(longException, not(nullValue()));
        assertThat(doubleException, not(nullValue()));
    }
}