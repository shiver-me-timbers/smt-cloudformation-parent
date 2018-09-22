package shiver.me.timbers.cloudformation.files;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ResourcesTest {

    @Test
    public void Instantiation_for_coverage() {
        new Resources();
    }

    @Test
    public void Can_open_a_resource_stream() throws IOException {

        // When
        final InputStream actual = Resources.toInputStream("resource-test-file");

        // Then
        assertThat(IOUtils.toString(actual, "UTF-8"), equalTo("A file to test the resource reader."));
    }
}