package aws;

import aws.fn.Reference;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class HasReferenceTest {

    @Test
    public void Can_get_a_reference() {

        // Given
        final String name = someString();

        // When
        final Reference actual = ((HasReference) () -> name).ref();

        // Then
        assertThat(actual, hasField("name", name));
    }
}