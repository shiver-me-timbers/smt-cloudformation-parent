package shiver.me.timbers.cloudformation.transformers;

import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.HashMap;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class MetaDataTransformerTest {

    @Test
    public void Can_add_all_the_schema_meta_data() {

        final FileNames fileNames = mock(FileNames.class);
        final JavaTypes javaTypes = mock(JavaTypes.class);
        final MetaDataApplier metaDataApplier = mock(MetaDataApplier.class);
        final String name = someString();
        final CloudformationType cloudformationType = mock(CloudformationType.class);
        final HashMap<String, Object> schema = new HashMap<>();

        final String documentation = someString();
        final String fileName = someString();
        final String className = someString();

        // Given
        given(cloudformationType.getDocumentation()).willReturn(documentation);
        given(fileNames.parse(name)).willReturn(fileName);
        given(javaTypes.extractClassName(name)).willReturn(className);

        // When
        new MetaDataTransformer(fileNames, javaTypes, metaDataApplier).transform(name, cloudformationType, schema);

        // Then
        then(metaDataApplier).should().apply(fileName, className, documentation, schema);
    }
}