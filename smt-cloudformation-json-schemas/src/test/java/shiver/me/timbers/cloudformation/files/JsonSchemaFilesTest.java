package shiver.me.timbers.cloudformation.files;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someAlphanumericString;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.data.random.RandomThings.someThing;

public class JsonSchemaFilesTest {

    private ObjectMapper mapper;
    private FileNames fileNames;
    private JsonSchemaFiles files;

    @Before
    public void setUp() {
        mapper = mock(ObjectMapper.class);
        fileNames = mock(FileNames.class);
        files = new JsonSchemaFiles(mapper, fileNames);
    }

    @Test
    public void Can_create_a_json_schema_files_instance() {

        // When
        final JsonSchemaFiles actual = JsonSchemaFiles.instance(mock(ObjectMapper.class), mock(FileNames.class));

        // Then
        assertThat(actual, notNullValue());
    }

    @Test
    public void Can_write_the_json_schema_files() throws IOException {

        final String jsonSpecsPath = resourceDir("json_schema_files");
        final Map<String, Object> jsonSchemas = new HashMap<>();

        final String resourceName1 = someString();
        final String resourceName2 = someString();
        final String resourceName3 = someString();
        final Object resource1 = someThing();
        final Object resource2 = someThing();
        final Object resource3 = someThing();
        final String fileName1 = someAlphanumericString(5);
        final String fileName2 = someAlphanumericString(8);
        final String fileName3 = someAlphanumericString(13);
        final ObjectWriter writer = mock(ObjectWriter.class);

        // Given
        jsonSchemas.put(resourceName1, resource1);
        jsonSchemas.put(resourceName2, resource2);
        jsonSchemas.put(resourceName3, resource3);
        given(fileNames.parse(resourceName1)).willReturn(fileName1);
        given(fileNames.parse(resourceName2)).willReturn(fileName2);
        given(fileNames.parse(resourceName3)).willReturn(fileName3);
        given(mapper.writerWithDefaultPrettyPrinter()).willReturn(writer);

        // When
        files.writeFiles(jsonSpecsPath, jsonSchemas);

        // Then
        then(writer).should().writeValue(Paths.get(jsonSpecsPath, fileName1).toFile(), resource1);
        then(writer).should().writeValue(Paths.get(jsonSpecsPath, fileName2).toFile(), resource2);
        then(writer).should().writeValue(Paths.get(jsonSpecsPath, fileName3).toFile(), resource3);
    }

    @Test
    public void Can_fail_to_write_the_json_schema_files() throws IOException {

        final String jsonSpecsPath = resourceDir("json_schema_files");
        final Map<String, Object> jsonSchemas = new HashMap<>();

        final String resourceName = someString();
        final Object resource = someThing();
        final String fileName = someAlphanumericString(5);
        final ObjectWriter writer = mock(ObjectWriter.class);
        final IOException exception = mock(IOException.class);

        // Given
        jsonSchemas.put(resourceName, resource);
        given(fileNames.parse(resourceName)).willReturn(fileName);
        given(mapper.writerWithDefaultPrettyPrinter()).willReturn(writer);
        willThrow(exception).given(writer).writeValue(any(File.class), any());

        // When
        final Throwable actual = catchThrowable(() -> files.writeFiles(jsonSpecsPath, jsonSchemas));

        // Then
        assertThat(actual, instanceOf(SchemaFileException.class));
        assertThat(
            actual.getMessage(),
            equalTo(format("Could not write the schema file for resource (%s).", resourceName))
        );
        assertThat(actual.getCause(), is(exception));
    }

    private String resourceDir(String path) {
        return Paths.get(Thread.currentThread().getContextClassLoader().getResource(".").getPath(), path)
            .toAbsolutePath().toString();
    }
}