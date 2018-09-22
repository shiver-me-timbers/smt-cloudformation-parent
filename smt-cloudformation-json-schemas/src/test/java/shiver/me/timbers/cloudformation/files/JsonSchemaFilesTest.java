package shiver.me.timbers.cloudformation.files;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someAlphanumericString;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.data.random.RandomThings.someThing;

public class JsonSchemaFilesTest {

    @Test
    public void Can_write_the_json_schema_files() throws IOException {

        final ObjectMapper mapper = mock(ObjectMapper.class);
        final FileNames fileNames = mock(FileNames.class);
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
        new JsonSchemaFiles(mapper, fileNames).writeFiles(jsonSpecsPath, jsonSchemas);

        // Then
        then(writer).should().writeValue(Paths.get(jsonSpecsPath, fileName1).toFile(), resource1);
        then(writer).should().writeValue(Paths.get(jsonSpecsPath, fileName2).toFile(), resource2);
        then(writer).should().writeValue(Paths.get(jsonSpecsPath, fileName3).toFile(), resource3);
    }

    private String resourceDir(String path) {
        return Paths.get(Thread.currentThread().getContextClassLoader().getResource(".").getPath(), path)
            .toAbsolutePath().toString();
    }
}