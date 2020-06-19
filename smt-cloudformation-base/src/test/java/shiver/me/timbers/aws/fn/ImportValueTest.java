package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static shiver.me.timbers.aws.fn.Functions.fnImportValue;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class ImportValueTest {

    @Test
    public void Can_create_a_base64_function() {

        // Given
        final String sharedValueToImport = someString();

        // When
        final ImportValue actual = fnImportValue(sharedValueToImport);

        // Then
        assertThat(actual, hasField("sharedValueToImport", sharedValueToImport));
    }

    @Test
    public void ImportValue_has_equality() {
        EqualsVerifier.forClass(ImportValue.class).usingGetClass().withIgnoredFields("string").verify();
    }
}