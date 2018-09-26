package shiver.me.timbers.cloudformation;

import com.fasterxml.jackson.databind.ObjectMapper;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.files.JsonSchemaFiles;
import shiver.me.timbers.cloudformation.json.ObjectMappers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import static shiver.me.timbers.cloudformation.files.Resources.toInputStream;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        final InputStream stream = toInputStream(args[0]);
        final ObjectMapper objectMapper = ObjectMappers.objectMapper();
        final CloudFormationResourceSpecification specification = objectMapper
            .readValue(stream, CloudFormationResourceSpecification.class);
        final Map<String, Object> jsonSchemas = CloudformationSpecTransformer.instance(
            "aws",
            objectMapper.readValue(toInputStream("typeMap.json"), Map.class),
            specification.getPropertyTypes()
        ).transform(specification);
        JsonSchemaFiles.instance(objectMapper, FileNames.instance()).writeFiles(args[1], jsonSchemas);
    }
}
