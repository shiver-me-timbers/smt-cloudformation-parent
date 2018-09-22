package shiver.me.timbers.cloudformation.files;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static shiver.me.timbers.cloudformation.Cloudformation.packageName;
import static shiver.me.timbers.data.random.RandomStrings.someAlphaString;

public class FileNamesTest {

    @Test
    public void Can_parse_a_resource_name_into_a_file_name() {

        // Given
        final String key = packageName() + someAlphaString(13);

        // When
        final String actual = new FileNames().parse(key);

        // Then
        assertThat(actual, equalTo(key.replaceAll("::", "_") + ".schema.json"));
    }
}