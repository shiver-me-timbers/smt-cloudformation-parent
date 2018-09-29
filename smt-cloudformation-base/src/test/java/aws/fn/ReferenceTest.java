package aws.fn;

import org.junit.Test;

import static aws.fn.Functions.ref;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.matchers.Matchers.hasField;

public class ReferenceTest {

    @Test
    public void Can_create_a_reference() {

        // Given
        final String name = someString();

        // When
        final Reference actual = ref(name);

        // Then
        assertThat(actual, hasField("name", name));
    }
}