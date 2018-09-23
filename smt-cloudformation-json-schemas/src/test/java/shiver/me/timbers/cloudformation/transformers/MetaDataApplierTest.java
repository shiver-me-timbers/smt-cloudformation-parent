package shiver.me.timbers.cloudformation.transformers;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class MetaDataApplierTest {

    @Test
    public void Can_add_all_the_schema_meta_data() {

        // Given
        final String id = someString();
        final String title = someString();
        final String description = someString();

        final Map<String, Object> actual = new HashMap<>();

        // When
        new MetaDataApplier().apply(id, title, description, actual);

        // Then
        assertThat(actual, hasEntry("$schema", "http://json-schema.org/draft-07/schema#"));
        assertThat(actual, hasEntry("$id", id));
        assertThat(actual, hasEntry("title", title));
        assertThat(actual, hasEntry("description", description));
        assertThat(actual, hasEntry("type", "object"));
    }
}