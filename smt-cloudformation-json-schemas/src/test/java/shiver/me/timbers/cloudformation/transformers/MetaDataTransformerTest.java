package shiver.me.timbers.cloudformation.transformers;

import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.HashMap;
import java.util.Map;

import static java.util.AbstractMap.SimpleEntry;
import static java.util.Map.Entry;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class MetaDataTransformerTest {

    @Test
    public void Can_add_all_the_schema_meta_data() {

        final FileNames fileNames = mock(FileNames.class);
        final JavaTypes javaTypes = mock(JavaTypes.class);
        final String name = someString();
        final CloudformationType cloudformationType = mock(CloudformationType.class);

        final String documentation = someString();
        final String fileName = someString();
        final String className = someString();

        // Given
        given(cloudformationType.getDocumentation()).willReturn(documentation);
        given(fileNames.parse(name)).willReturn(fileName);
        given(javaTypes.extractClassName(name)).willReturn(className);

        final HashMap<String, Object> actual = new HashMap<>();

        // When
        new MetaDataTransformer(fileNames, javaTypes).transform(name, cloudformationType, actual);

        // Then
        assertThat(actual, hasEntry("$schema", "http://json-schema.org/draft-07/schema#"));
        assertThat(actual, hasEntry("$id", fileName));
        assertThat(actual, hasEntry("title", className));
        assertThat(actual, hasEntry("description", documentation));
        assertThat(actual, hasEntry("type", "object"));
    }
}