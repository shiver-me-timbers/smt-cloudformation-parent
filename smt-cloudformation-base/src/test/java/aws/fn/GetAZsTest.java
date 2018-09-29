package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnGetAZs;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class GetAZsTest {

    @Test
    public void Can_create_a_GetAZs_function() {

        // Given
        final String value = someString();

        // When
        final GetAZs actual = fnGetAZs(value);

        // Then
        assertThat(actual, hasField("value", value));
    }
}