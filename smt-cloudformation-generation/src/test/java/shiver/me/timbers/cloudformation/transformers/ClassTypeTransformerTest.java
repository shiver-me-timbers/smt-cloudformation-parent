package shiver.me.timbers.cloudformation.transformers;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.ClassTypeConverter;

import java.util.HashMap;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ClassTypeTransformerTest {

    private ClassTypeConverter converter;
    private ClassTypeTransformer transformer;

    @Before
    public void setUp() {
        converter = mock(ClassTypeConverter.class);
        transformer = new ClassTypeTransformer(converter);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_primative_type_property() {

        final String resourceName = someString();
        final String propertyName = someString();
        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);

        final String type = someString();
        final String schemaFileName = someString();

        final HashMap<String, Object> actual = new HashMap<>();

        // Given
        given(cloudformationProperty.getType()).willReturn(type);
        given(converter.convert(resourceName, type)).willReturn(schemaFileName);

        // When
        transformer.transform(resourceName, mock(CloudformationType.class), propertyName, cloudformationProperty, actual);

        // Then
        assertThat(actual, hasEntry("$ref", schemaFileName));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_support_complex_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getType()).willReturn(someString());

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(true));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_ignore_non_complex_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getType()).willReturn(null);

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(false));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_ignore_list_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getType()).willReturn("List");

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(false));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_ignore_map_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getType()).willReturn("Map");

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(false));
    }
}