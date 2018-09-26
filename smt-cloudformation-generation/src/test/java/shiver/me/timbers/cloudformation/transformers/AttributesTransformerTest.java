package shiver.me.timbers.cloudformation.transformers;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationAttribute;
import shiver.me.timbers.cloudformation.CloudformationAttributes;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.ResourceType;
import shiver.me.timbers.cloudformation.files.FileNames;
import shiver.me.timbers.cloudformation.types.JavaTypes;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyMap;
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

public class AttributesTransformerTest {

    private static final String ATTRIBUTES = "Attributes";
    private FileNames fileNames;
    private JavaTypes javaTypes;
    private MetaDataApplier metaDataApplier;
    private AttributesTransformer transformer;

    @Before
    public void setUp() {
        fileNames = mock(FileNames.class);
        javaTypes = mock(JavaTypes.class);
        metaDataApplier = mock(MetaDataApplier.class);
        transformer = new AttributesTransformer(fileNames, javaTypes, metaDataApplier);
    }

    @Test
    public void Can_create_a_resource_schema() {

        final String resourceName = someString();
        final ResourceType resourceType = mock(ResourceType.class);

        final String fileName = someString();
        final String packageName = someString();
        final String className = someString();
        final CloudformationAttributes attributes = new CloudformationAttributes();
        final String attributeName1 = someString();
        final String attributeName2 = someString();
        final String attributeName3 = someString();

        // Given
        given(javaTypes.parsePackage(resourceName)).willReturn(packageName);
        given(javaTypes.extractClassName(resourceName)).willReturn(className);
        given(fileNames.parse(resourceName + ATTRIBUTES)).willReturn(fileName);
        given(resourceType.getAttributes()).willReturn(attributes);
        attributes.put(attributeName1, mock(CloudformationAttribute.class));
        attributes.put(attributeName2, mock(CloudformationAttribute.class));
        attributes.put(attributeName3, mock(CloudformationAttribute.class));

        // When
        final Map.Entry<String, Map<String, Object>> actual = transformer
            .transform(new AbstractMap.SimpleEntry<>(resourceName, resourceType));

        // Then
        then(metaDataApplier).should()
            .apply(eq(fileName), eq(className + ATTRIBUTES), eq(null), anyMap());
        final String actualKey = actual.getKey();
        final Map<String, Object> actualValue = actual.getValue();
        assertThat(actualKey, equalTo(resourceName + ATTRIBUTES));
        assertThat(actualValue, hasEntry("type", "string"));
        assertThat(actualValue, hasEntry("enum", new HashSet<>(asList(attributeName1, attributeName2, attributeName3))));
        assertThat(actualValue, hasEntry("javaType", format("%s.%s", packageName, className + ATTRIBUTES)));
    }

    @Test
    public void Will_ignore_non_resources() {

        // Given
        final String resourceName = someString();

        // When
        final Map.Entry<String, Map<String, Object>> actual = transformer
            .transform(new AbstractMap.SimpleEntry<>(resourceName, mock(CloudformationType.class)));

        // Then
        verifyZeroInteractions(fileNames, javaTypes, metaDataApplier);
        assertThat(actual.getKey(), equalTo(resourceName));
        assertThat(actual.getValue(), equalTo(emptyMap()));
    }

    @Test
    public void Will_ignore_resources_with_no_attributes() {

        final ResourceType resourceType = mock(ResourceType.class);
        final String resourceName = someString();

        // Given
        given(resourceType.getAttributes()).willReturn(null);

        // When
        final Map.Entry<String, Map<String, Object>> actual = transformer
            .transform(new AbstractMap.SimpleEntry<>(resourceName, resourceType));

        // Then
        verifyZeroInteractions(fileNames, javaTypes, metaDataApplier);
        assertThat(actual.getKey(), equalTo(resourceName));
        assertThat(actual.getValue(), equalTo(emptyMap()));
    }
}