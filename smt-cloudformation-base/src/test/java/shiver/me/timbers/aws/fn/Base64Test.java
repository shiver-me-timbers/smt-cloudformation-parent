package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static shiver.me.timbers.aws.fn.Functions.fnBase64;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class Base64Test {

    @Test
    public void Can_create_a_base64_function() {

        // Given
        final String valueToEncode = someString();

        // When
        final Base64 actual = fnBase64(valueToEncode);

        // Then
        assertThat(actual, hasField("valueToEncode", valueToEncode));
    }

    @Test
    public void Base64_has_equality() {
        EqualsVerifier.forClass(Base64.class).usingGetClass().withIgnoredFields("string").verify();
    }
}