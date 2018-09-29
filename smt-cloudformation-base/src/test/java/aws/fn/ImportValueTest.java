package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.fnImportValue;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class ImportValueTest {

    @Test
    public void Can_create_a_base64_function() {

        // Given
        final String value = someString();

        // When
        final ImportValue actual = fnImportValue(value);

        // Then
        assertThat(actual, hasField("value", value));
    }
}