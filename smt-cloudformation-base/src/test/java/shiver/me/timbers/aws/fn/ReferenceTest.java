package shiver.me.timbers.aws.fn;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static shiver.me.timbers.aws.fn.Functions.ref;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class ReferenceTest {

    @Test
    public void Can_create_a_reference() {

        // Given
        final String logicalName = someString();

        // When
        final Reference actual = ref(logicalName);

        // Then
        assertThat(actual, hasField("logicalName", logicalName));
    }

    @Test
    public void Reference_has_equality() {
        EqualsVerifier.forClass(Reference.class).usingGetClass().withIgnoredFields("string").verify();
    }
}