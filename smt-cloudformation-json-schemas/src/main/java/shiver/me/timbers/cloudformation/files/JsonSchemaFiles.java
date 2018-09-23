package shiver.me.timbers.cloudformation.files;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static java.lang.String.format;

public class JsonSchemaFiles {

    private final ObjectMapper mapper;
    private final FileNames fileNames;

    public static JsonSchemaFiles instance(ObjectMapper mapper, FileNames fileNames) {
        return new JsonSchemaFiles(mapper, fileNames);
    }

    public JsonSchemaFiles(ObjectMapper mapper, FileNames fileNames) {
        this.mapper = mapper;
        this.fileNames = fileNames;
    }

    public void writeFiles(String jsonSpecsPath, Map<String, Object> jsonSchemas) throws IOException {
        final Path schemasDir = Files.createDirectories(Paths.get(jsonSpecsPath));
        jsonSchemas.forEach((name, resource) -> {
            try {
                mapper.writerWithDefaultPrettyPrinter().writeValue(
                    Paths.get(schemasDir.toAbsolutePath().toString(), fileNames.parse(name)).toFile(),
                    resource
                );
            } catch (IOException e) {
                throw new SchemaFileException(format("Could not write the schema file for resource (%s).", name), e);
            }
        });
    }
}
