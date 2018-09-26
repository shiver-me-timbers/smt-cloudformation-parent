package shiver.me.timbers.cloudformation.transformers;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class MetaDataApplierTest {

    private MetaDataApplier applier;

    @Before
    public void setUp() {
        applier = new MetaDataApplier();
    }

    @Test
    public void Can_add_all_the_schema_meta_data() {

        // Given
        final String id = someString();
        final String title = someString();
        final String description = someString();

        final Map<String, Object> actual = new HashMap<>();

        // When
        applier.apply(id, title, description, actual);

        // Then
        assertThat(actual, hasEntry("$schema", "http://json-schema.org/draft-07/schema#"));
        assertThat(actual, hasEntry("$id", id));
        assertThat(actual, hasEntry("title", title));
        assertThat(actual, hasEntry("description", description));
        assertThat(actual, hasEntry("type", "object"));
    }

    @Test
    public void Will_not_add_null_description() {

        // Given
        final String id = someString();
        final String title = someString();

        final Map<String, Object> actual = new HashMap<>();

        // When
        applier.apply(id, title, null, actual);

        // Then
        assertThat(actual, hasEntry("$schema", "http://json-schema.org/draft-07/schema#"));
        assertThat(actual, hasEntry("$id", id));
        assertThat(actual, hasEntry("title", title));
        assertThat(actual, not(hasKey("description")));
        assertThat(actual, hasEntry("type", "object"));
    }

    @Test
    public void Will_not_add_empty_description() {

        // Given
        final String id = someString();
        final String title = someString();

        final Map<String, Object> actual = new HashMap<>();

        // When
        applier.apply(id, title, "", actual);

        // Then
        assertThat(actual, hasEntry("$schema", "http://json-schema.org/draft-07/schema#"));
        assertThat(actual, hasEntry("$id", id));
        assertThat(actual, hasEntry("title", title));
        assertThat(actual, not(hasKey("description")));
        assertThat(actual, hasEntry("type", "object"));
    }
}