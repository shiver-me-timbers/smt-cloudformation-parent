package shiver.me.timbers.cloudformation.transformers;

import org.junit.Before;
import org.junit.Test;
import shiver.me.timbers.cloudformation.CloudformationProperty;
import shiver.me.timbers.cloudformation.CloudformationType;
import shiver.me.timbers.cloudformation.types.PrimitiveTypeConverter;

import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class PrimitiveTypeTransformerTest {

    private PrimitiveTypeConverter converter;
    private PrimitiveTypeTransformer transformer;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() {
        converter = mock(PrimitiveTypeConverter.class);
        transformer = new PrimitiveTypeTransformer(converter);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_transform_a_primitive_type_property() {

        final String resourceName = someString();
        final CloudformationType cloudformationType = mock(CloudformationType.class);
        final String propertyName = someString();
        final CloudformationProperty cloudformationProperty = mock(CloudformationProperty.class);
        final Map<String, Object> property = mock(Map.class);

        final String type = someString();
        final Map<String, Object> schemaAttributes = mock(Map.class);


        // Given
        given(cloudformationProperty.getPrimitiveType()).willReturn(type);
        given(converter.convert(type)).willReturn(schemaAttributes);

        // When
        transformer.transform(resourceName, cloudformationType, propertyName, cloudformationProperty, property);

        // Then
        then(property).should().putAll(schemaAttributes);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_support_primitive_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getPrimitiveType()).willReturn(someString(13));

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(true));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_ignore_non_primitive_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getPrimitiveType()).willReturn(null);

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(false));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Will_ignore_empty_primitive_types() {

        final CloudformationProperty property = mock(CloudformationProperty.class);

        // Given
        given(property.getPrimitiveType()).willReturn("");

        // When
        final boolean actual = transformer.supports(property);

        // Then
        assertThat(actual, is(false));
    }
}