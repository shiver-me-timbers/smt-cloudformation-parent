package shiver.me.timbers.aws.fn;

import org.junit.Test;

import static org.junit.Assert.assertThat;
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
}