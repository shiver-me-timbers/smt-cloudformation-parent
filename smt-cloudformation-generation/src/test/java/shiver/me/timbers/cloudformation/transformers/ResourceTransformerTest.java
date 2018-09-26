package shiver.me.timbers.cloudformation.transformers;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationAttributes;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.ResourceType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.Map;

import static java.lang.String.format;
import static java.util.AbstractMap.SimpleEntry;
import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static java.util.Map.Entry;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ResourceTransformerTest {

    private static final String RESOURCE = "Resource";
    private FileNames fileNames;
    private JavaTypes javaTypes;
    private MetaDataApplier metaDataApplier;
    private ResourceTransformer transformer;

    @Before
    public void setUp() {
        fileNames = mock(FileNames.class);
        javaTypes = mock(JavaTypes.class);
        metaDataApplier = mock(MetaDataApplier.class);
        transformer = new ResourceTransformer(fileNames, javaTypes, metaDataApplier);
    }

    @Test
    public void Can_create_a_resource_schema() {

        final String resourceName = someString();
        final ResourceType resourceType = mock(ResourceType.class);

        final String fileName = someString();
        final String resourceFileName = someString();
        final String packageName = someString();
        final String resourceClassName = someString();
        final String documentation = someString();

        // Given
        given(fileNames.parse(resourceName)).willReturn(fileName);
        given(fileNames.parse(resourceName + RESOURCE)).willReturn(resourceFileName);
        given(javaTypes.parsePackage(resourceName)).willReturn(packageName);
        given(javaTypes.extractClassName(resourceName + RESOURCE)).willReturn(resourceClassName);
        given(resourceType.getDocumentation()).willReturn(documentation);

        // When
        final Entry<String, Map<String, Object>> actual = transformer
            .transform(new SimpleEntry<>(resourceName, resourceType));

        // Then
        then(metaDataApplier).should()
            .apply(eq(resourceFileName), eq(resourceClassName), eq(documentation), anyMap());
        final String actualKey = actual.getKey();
        final Map<String, Object> actualValue = actual.getValue();
        assertThat(actualKey, equalTo(resourceName + RESOURCE));
        assertThat(actualValue, hasEntry("extends", singletonMap("$ref", "Resource.schema.json")));
        assertThat(actualValue, hasEntry("javaType", format("%s.%s", packageName, resourceClassName)));
        assertThat(actualValue, hasEntry("properties", singletonMap("Properties", singletonMap("$ref", fileName))));
    }

    @Test
    public void Can_create_a_resource_schema_with_attributes() {

        final String resourceName = someString();
        final ResourceType resourceType = mock(ResourceType.class);

        final String fileName = someString();
        final String resourceFileName = someString();
        final String packageName = someString();
        final String resourceClassName = someString();
        final String className = someString();
        final String documentation = someString();

        // Given
        given(fileNames.parse(resourceName)).willReturn(fileName);
        given(fileNames.parse(resourceName + RESOURCE)).willReturn(resourceFileName);
        given(javaTypes.parsePackage(resourceName)).willReturn(packageName);
        given(javaTypes.extractClassName(resourceName + RESOURCE)).willReturn(resourceClassName);
        given(javaTypes.extractClassName(resourceName)).willReturn(className);
        given(resourceType.getDocumentation()).willReturn(documentation);
        given(resourceType.getAttributes()).willReturn(mock(CloudformationAttributes.class));

        // When
        final Entry<String, Map<String, Object>> actual = transformer
            .transform(new SimpleEntry<>(resourceName, resourceType));

        // Then
        then(metaDataApplier).should()
            .apply(eq(resourceFileName), eq(resourceClassName), eq(documentation), anyMap());
        final String actualKey = actual.getKey();
        final Map<String, Object> actualValue = actual.getValue();
        assertThat(actualKey, equalTo(resourceName + RESOURCE));
        assertThat(actualValue, hasEntry("extends", singletonMap("$ref", "Resource.schema.json")));
        assertThat(actualValue, hasEntry("javaType", format("%s.%s", packageName, resourceClassName)));
        assertThat(actualValue, hasEntry("properties", singletonMap("Properties", singletonMap("$ref", fileName))));
        assertThat(
            actualValue,
            hasEntry("javaInterfaces", singletonList(format("aws.HasAttributes<%sAttributes>", className)))
        );
    }

    @Test
    public void Will_ignore_non_resources() {

        // Given
        final String resourceName = someString();

        // When
        final Entry<String, Map<String, Object>> actual = transformer
            .transform(new SimpleEntry<>(resourceName, mock(CloudformationType.class)));

        // Then
        verifyZeroInteractions(fileNames, javaTypes, metaDataApplier);
        assertThat(actual.getKey(), equalTo(resourceName));
        assertThat(actual.getValue(), equalTo(emptyMap()));
    }
}