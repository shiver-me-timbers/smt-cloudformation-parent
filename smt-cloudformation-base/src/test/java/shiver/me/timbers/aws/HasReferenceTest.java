package shiver.me.timbers.aws;

import org.junit.Test;
import shiver.me.timbers.aws.fn.Reference;

import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class HasReferenceTest {

    @Test
    public void Can_get_a_reference() {

        // Given
        final String logicalName = someString();

        // When
        final Reference actual = ((HasReference) () -> logicalName).ref();

        // Then
        assertThat(actual, hasField("logicalName", logicalName));
    }
}