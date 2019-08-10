package aws;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomThings.someThing;

public class StringListsTest {

    @Test
    public void Instantiation_for_coverage() {
        new StringLists();
    }

    @Test
    public void Can_convert_objects_into_strings() {

        // Given
        final Object object1 = someThing();
        final Object object2 = someThing();
        final Object object3 = someThing();

        // When
        final List<String> actual = StringLists.toStringList(object1, object2, object3);

        // Then
        assertThat(actual, contains(object1.toString(), object2.toString(), object3.toString()));
    }
}