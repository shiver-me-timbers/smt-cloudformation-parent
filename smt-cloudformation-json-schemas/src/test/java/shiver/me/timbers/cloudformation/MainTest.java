package shiver.me.timbers.cloudformation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.files.JsonSchemaFiles;
import shiver.me.timbers.cloudformation.files.Resources;
import shiver.me.timbers.cloudformation.json.ObjectMappers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
    Resources.class,
    ObjectMappers.class,
    CloudformationSpecTransformer.class,
    FileNames.class,
    JsonSchemaFiles.class
})
public class MainTest {

    @Test
    public void Instantiation_for_coverage() {
        new Main();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_the_cloudformation_spec() throws IOException {
        PowerMockito.mockStatic(Resources.class);
        PowerMockito.mockStatic(ObjectMappers.class);
        PowerMockito.mockStatic(CloudformationSpecTransformer.class);
        PowerMockito.mockStatic(FileNames.class);
        PowerMockito.mockStatic(JsonSchemaFiles.class);

        final String cloudformationSpecPath = someString();
        final String jsonSpecsPath = someString();

        final InputStream specStream = mock(InputStream.class);
        final InputStream typeStream = mock(InputStream.class);
        final ObjectMapper objectMapper = mock(ObjectMapper.class);
        final CloudFormationResourceSpecification specification = mock(CloudFormationResourceSpecification.class);
        final Map<String, Map<String, Object>> typeMap = mock(Map.class);
        final CloudformationTypes cloudformationTypes = mock(CloudformationTypes.class);
        final CloudformationSpecTransformer transformer = mock(CloudformationSpecTransformer.class);
        final Map<String, Object> jsonSchemas = mock(Map.class);
        final FileNames fileNames = mock(FileNames.class);
        final JsonSchemaFiles jsonSchemaFiles = mock(JsonSchemaFiles.class);

        // Given
        given(Resources.toInputStream(cloudformationSpecPath)).willReturn(specStream);
        given(Resources.toInputStream("typeMap.json")).willReturn(typeStream);
        given(ObjectMappers.objectMapper()).willReturn(objectMapper);
        given(objectMapper.readValue(specStream, CloudFormationResourceSpecification.class)).willReturn(specification);
        given(objectMapper.readValue(typeStream, Map.class)).willReturn(typeMap);
        given(specification.getPropertyTypes()).willReturn(cloudformationTypes);
        given(CloudformationSpecTransformer.instance("aws", typeMap, cloudformationTypes))
            .willReturn(transformer);
        given(transformer.transform(specification)).willReturn(jsonSchemas);
        given(FileNames.instance()).willReturn(fileNames);
        given(JsonSchemaFiles.instance(objectMapper, fileNames)).willReturn(jsonSchemaFiles);

        // When
        Main.main(new String[]{cloudformationSpecPath, jsonSpecsPath});

        // Then
        then(jsonSchemaFiles).should().writeFiles(jsonSpecsPath, jsonSchemas);
    }
}